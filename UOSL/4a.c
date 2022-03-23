/* Environmental variables in unix shell:-
 * Variables that are exported to all processes spawned by the shell. 
 * Their settings can be seen with "env" command - a subset of environmental variables such as 'PATH' affects the behaviour of the shell itself.
 *
 * 4a) Write a C Program to print Environtment variables
 */
#include <stdio.h>

int main(int argc, char *argv[], char *envp[]){
  int i;
  for (i = 0; envp[i]!= NULL; i++){
    printf("\n%s", envp[i]);
  }
  //getchar();
  return 0;
}
