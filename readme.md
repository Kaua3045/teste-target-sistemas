1) Observe o trecho de código abaixo:

```
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{

K = K + 1;

SOMA = SOMA + K;

}

imprimir(SOMA);
```

Ao final do processamento, qual será o valor da variável SOMA? No final o resultado será 91

2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
```java
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe um número: ");
            int number = scanner.nextInt();

            if (isFibonacciNumber(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o número informado.");
        } finally {
            scanner.close();
        }
    }

    public static boolean isFibonacciNumber(int number) {
        int prev = 0;
        int curr = 1;

        while (prev <= number) {
            if (prev == number) {
                return true;
            }

            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return false;
    }
}
```

3) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___
A lógica aqui é adicionar 2 ao número anterior. 
Portanto, o próximo número é 9.

b) 2, 4, 8, 16, 32, 64, ____
A lógica aqui é multiplicar o número anterior por 2.
Portanto, o próximo número é 128.

c) 0, 1, 4, 9, 16, 25, 36, ____
A lógica aqui é elevar o número anterior ao quadrado.
Portanto, o próximo número é 49.

d) 4, 16, 36, 64, ____
A lógica aqui é elevar o número anterior ao quadrado.
Portanto, o próximo número é 100.

e) 1, 1, 2, 3, 5, 8, ____
A lógica aqui é somar os dois números anteriores.
Portanto, o próximo número é 13.

f) 2,10, 12, 16, 17, 18, 19, ____
A lógica aqui é somar 8 ao número anterior.
Portanto, o próximo número é 27.

4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
1. Primeira ida:
    - Ligue o primeiro interruptor e espere alguns minutos.
    - Desligue o primeiro interruptor e, ao mesmo tempo, ligue o segundo interruptor.
    - Entre na sala onde as lâmpadas estão localizadas.
2. Observações após a primeira ida:
    - Se a lâmpada estiver acesa, então o segundo interruptor controla essa lâmpada.
    - Se a lâmpada estiver apagada e a lâmpada estiver quente, então o primeiro interruptor controla essa lâmpada.
    - Se a lâmpada estiver apagada e a lâmpada estiver fria, então o terceiro interruptor controla essa lâmpada.
3. Segunda ida (opcional, para confirmar):
    - Se necessário, entre na sala novamente para confirmar qual interruptor controla a lâmpada que não foi identificada com certeza na primeira ida.

5) Escreva um programa que inverta os caracteres de um string.
```java
public class ReverseString {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Informe uma palavra: ");
      String word = scanner.nextLine();

      System.out.println("A palavra invertida é: " + reverseString(word));

      scanner.close();
   }

   public static String reverseString(String word) {
      int wordLength = word.length();
      StringBuilder reversedWord = new StringBuilder();

      // Pegamos o tamanho do texto e subtraímos 1 para pegar a última letra
      // depois verificamos se i é maior ou igual a 0 (então quer dizer que se for menor que zero ele para)
      // se não for menor que zero, decrementamos 1
      // e pegamos a letra na posição i e adicionamos na variável reversedWord
      for (int i = wordLength - 1; i >= 0; i--) {
         reversedWord.append(word.charAt(i));
      }

      return reversedWord.toString();
   }
}
```