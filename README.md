## Parte 2

Anotad su PID y su PPID, y explicad qué proceso es el padre y por qué es ese
- PID: 14883
- PPID: 8349
- Es el PPID ya que el nombre del propio proceso es Parent Process ID, por lo cual es el proceso padre que llama al PID como proceso hijo. 

A continuacion tenemos las capturas de le ejecucion en IDEA y en la terminal
![ps](capturas/Captura%20desde%202026-09-18%2012-23-00.png)

![ps](capturas/Captura%20desde%202026-09-18%2011-20-12.png)

Para saber como ejecutarlo desde la terminal use gemini y le pregunte lo siguiente ("Como puedo ejecutar un archivo de java de intellij en mi terminal de linux")
![ps](capturas/Captura%20desde%202026-09-18%2011-48-39.png)

![ps](capturas/Captura%20desde%202026-09-18%2012-05-42.png)

¿Cambia el PPID? ¿Por que?
- Si que cambia, esto sucede ya que al ejecutarlo de sitios distintos tienen un identificador de PPID distinto (como di fuera una tarjeta identificatoria)
 



Ejecutadlo después con java -Xmx128m InformeSistema y comparad las cuatro cifras de
memoria con las de la ejecución normal. Indicad cuáles cambian, cuáles no y por qué.

![ps](capturas/Captura%20desde%202026-09-18%2012-01-03.png)

Nos podemos fijar que en el lanzamiento normal desde la terminal me da los siguientes valores:
- total reservada: 10 mib
- libre: 6 mib
- en uso: 1 mib
- Maxima: 3942 mib

Ahora con l anueva ejecucion:
- total reservada: 10 mib
- libre: 8 mib
- en uso: 1 mib
- Maxima: 128 mib

cambios y por que:
- Lo que hacemos con el comando -Xmx128m es limitar la memoria de la maquina a un maximo de 128 por eso el valor de la memoria maxima es mas bajo con el segundo comando

Por último, indicad qué ruta genera vuestro programa en el apartado multiplataforma y qué
ruta generaría en el otro sistema operativo, explicando de dónde sale la diferencia.

- Va a depender del sistema operativo pero si ponemos de ejemplo windows seria de la siguiente manera: C:\Users\usuario\informe

![ps](capturas/Captura%20desde%202026-09-18%2012-11-58.png)

## Parte 3

Para cada uno de estos casos indicad cuál de las tres encaja, por qué, y un inconveniente
concreto que se asume al elegirla. Un caso puede encajar en más de una: si es así, explicad
en qué nivel actúa cada una.

a)  concurrente : ya que al ser demasiadas peticiones los nucleares van intercalando tareas para que todas avancen sin que ninguna quede quieta.
    paralela: podrían llegar a encargarse cada núcleo de una petición, lo cual haría que el equipo pueda realizar de 8 en 8 peticiones a una buena velocidad

b)  distribuido: ya que varias máquinas esta trabajando en conjunto para realizar un trabajo muy pesado como puede ser renderizar una película

c)  concurrente: ya que está haciendo más de un proceso a la vez sin dejar de lado el otro que se encuentra en segundo plano.

d)  distribuido: al ser una carga muy grande para un equipo, lo mejor es que varias máquinas trabajen en conjunto para realizar el proceso.



