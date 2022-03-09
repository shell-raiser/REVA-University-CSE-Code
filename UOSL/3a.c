/*Write a C/C++ program that creates a zombie & then calls system to execute the ps command to verify that thye process is zombie.  */

// Theory 
/* A Zombie is created when a parent process does not use the wait system call after a child dies to read its exit status and an orphan is child process that is reclaimed by init when the original parent process terminates before the child.
In Unix terminology, a process that has terminated, but whose parent has not yet waited for it, is caleed Zombie
fork() creates a new process, reffered to as the child process. The new process, reffered to as the child is an exact duplicate of the calling process, reffered to as the parent.
Sleep(): Delay for a specified amount of time
System()
	Syntax:
		#include <stdlib.h>
			int system(const char* command );
*/
#include <stdio.h>
#include<unistd.h>
#include<stdlib.h>
int main(){
	int pid;
	if ((pid = fork())<0){
		printf("fork error\n");
	}
	else if(pid == 0){
		exit(0);
	}
	sleep(2);
	system("ps -o ppid, state, command");
	exit(0);
}


