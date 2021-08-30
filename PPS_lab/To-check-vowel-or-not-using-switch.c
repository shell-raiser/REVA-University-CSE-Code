#include <stdio.h>
main()
{
    char a;
    printf("Enter alphabet\n");
    scanf("%c", &a);
    switch(a)
    {
        case 'a' : printf("%c is a vowel\n", a);
        break;
        case 'e' : printf("%c is a vowel\n", a);
        break;
        case 'i' : printf("%c is a vowel\n", a);
        break;
        case 'o' : printf("%c is a vowel\n", a);
        break;
        case 'u' : printf("%c is a vowel\n", a);
        break;
        default : printf("%c is not a vowel\n", a);
    }
}