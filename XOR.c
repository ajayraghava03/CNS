
#include <stdio.h>

int main() {
    char str[100];
    int i;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    printf("Original string: %s", str);
    printf("After XOR with 0: ");

    for (i = 0; str[i] != '\0'; i++) {
        if (str[i] == '\n')
            break;

        printf("%c", str[i] ^ 0);
    }

    printf("\n");
    return 0;
}

