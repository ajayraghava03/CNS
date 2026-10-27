#include<stdio.h>

int main(){
    char *str="Hello World";
    int i;
    printf("AND with 127 : ");
    for(i=0;str[i]!='\0';i++)
        print("%c",str[i]&127);

    printf("\nOR with 127 : ");
    for(i=0;str[i]!='\0';i++)
        print("%c",str[i]|127);

    printf("\nXOR with 127 : ");
    for(i=0;str[i]!='\0';i++)
        print("%c",str[i]^127);

    return 0;
}