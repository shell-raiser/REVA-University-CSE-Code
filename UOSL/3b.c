/* Write a C program to avoid zombie process by forking (fork()) twice.
 *
 * Algorithm :-
 * The parent calls 'wait()' and it creates a child, the child creates a grandchild and exits.
 * The grandchild executes its instruction and eventually terminates. As the child has already exited, the grandchild will be taken care by 'init' process.
 * The 'init' collects the exit status of grandchild.
 * Hence the grandchild is not a zombie. */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(){
  int pid;
  pid = fork();

  if (pid==0){
    pid=fork();
    if (pid==0){
      sleep(1);
      printf("Second child: My parent ID is %d\n", getpid());
    }
  }
  else{
    wait(NULL);
    sleep(2);
    system("ps -o pid,ppid,state,tty,command");
  }
  return 0;
}
