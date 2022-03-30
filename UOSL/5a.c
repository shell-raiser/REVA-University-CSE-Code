/* Write a C program to create hardly link and soft link, and display the hard link count with other attributes of the created file within the sample code. 
 *
 * Theory:-
 * Inode is a Data structure used to manage disk blocks
 *
 * Built in functions used:-
 * link()
 * symlink()
 * access()
 * system()*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char* argv[])
{
  // Link function
  int l = link(argv[1], argv[2]);
  // argv[1] is existing file name
  // argv[2] is link file name
  if (l == 0)
    {
    printf("Hard Link created succuessfuly\n");
    }
  // Symlink function
  int sl = symlink(argv[3], argv[4]);
  // argv[1] is existing file name
  // argv[2] is soft link file name
  if (sl == 0)
    {
    printf("Soft Link created succuessfuly\n");
    }
  int mode;
  /*check a files attributes*/
  mode = access("f1.txt",0);
  if(mode)
    printf("File does not exist.\n");
  else
    /*check if the file can be written to*/
    mode = access("f1.txt",2);
  if(mode)
    printf("File cannot be written.\n");
  else
    printf("file can be written to.\n");
    /*check if file can be read*/
  mode = access("f1.txt",4);
  if(mode)
    printf("File cannot be read.\n");
  else
    printf("File can be read.\n");
  /*check if afile can be read/written*/
    mode = access("f1.txt",6);
  if(mode)
    printf("File cannot be read/written to.\n");
  else
    printf("File can be read/written to.\n");
  system("ls -qAi | awk '{print $1}' | sort | uniq -d | wc -l");
}
