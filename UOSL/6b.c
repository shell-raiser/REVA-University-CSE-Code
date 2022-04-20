/* Write a C program to demonstrate the signal handler function to handle the signal sent by the process
 * 
 * Theory 
 * The C library function void (*signal(int sig, void (*func)(int)))(int) sets a function to handle signal i.e. a signal handler with signal number sig.
 *
 */
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <signal.h>

void sighandler(int);
int main () {
  signal(SIGINT, sighandler);
  while(1) {
    printf("Going to sleep for a second...\n");
    sleep(1);
  }
  return(0);
}

void sighandler(int signum) {
  printf("\nCaught signal %d, coming out...\n", signum);
  exit(1);
}
