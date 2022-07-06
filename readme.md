# Reptes
## Reptes NUWE
### Lambdas
No tinc massa clar que en aquest cas es pugui parlar de lambdas, atès que
en les instruccions s'especifica que hi ha d'haver una classe amb mètodes concrets, cosa que 
sembla entrar en contradicció amb el propi objectiu d'utilitzar lambdas.

Dins de la classe MyLambda s'especifiquen 3 funcions F<Int,String>, 1 funció consumidora i el mètode checker sol·licitat:
- *isOdd* comprova si el número és senar o no i retorna string "true" o "false" respectivament (tot i que també es podria haver utilitzat un predicat).
- *isPrime* comprova si el número és primer o no, amb els mateixos retorns que la funció anterior.
- *isPalindrome* comprova si el número és pot revertir lexicogràficament, amb els mateixos retorns que a les funcions anteriors.
- *output* aplica les funcions anteriors i imprimeix els resultats recollits i en el format especificat. 
- *checker* és un mètode variàdic que aplica el consumidor a l'array de longitud indeterminada.