
#include <stdio.h>

int main() {
    char str[100];
    int i;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    printf("\nOriginal string: ");

    for (i = 0; str[i] != '\0' && str[i] != '\n'; i++)
        printf("%c", str[i]);

    printf("\nAfter AND with 127: ");

    for (i = 0; str[i] != '\0' && str[i] != '\n'; i++)
        printf("%c", str[i] & 127);

    printf("\nAfter XOR with 127: ");

    for (i = 0; str[i] != '\0' && str[i] != '\n'; i++)
        printf("%d ", (unsigned char)str[i] ^ 127);

    printf("\n");
    return 0;
}
