/* Write a C or C++ program to illustrate a race condition */

#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

static void charAtATime(char* str){
  char *ptr;
  int c;
  setbuf(stdout, NULL);
  for (ptr = str; (c = *ptr++)!=0;){
    putc(c,stdout);
  }
}

int main (void){
  pid_t pid;
  if ((pid = fork())<0){
    printf("Fork Error");
  }
  else if (pid ==0){
    charAtATime("Output from Child\n");
  }
  else {
    charAtATime("Output from Parent\n");
  }
  return 0;
  }
