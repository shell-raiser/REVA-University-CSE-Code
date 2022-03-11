#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main(){
  int pid = fork();
  if (pid > 0 ){
    printf("Parent Process\n");
    printf("ID %d\n\n",getpid());
  }
  else if (pid == 0) {
      printf("Child Process\n");
      printf("ID: %d\n",getpid());
      printf("Parent ID: %d\n\n",getppid());
      sleep(10);
      printf("ID Child Process\n");
      printf("ID %d\n", getpid());
      printf("Parent ID %d\n", getpid());
    }
    else{
      printf("Failed to create child Processc");
      }
return 0;

}

//Write a C program to show the process is an orphan process and print its parent PID value
