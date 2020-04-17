-Se necesita solo 1 consumidor para que el stock llegue a 0, mientras se implemente adecuadamente, 
se le puede dar forma de distintos clientes al mismo consumidor.
-Los bloques deben ser synchronized para que no acceda mas de un proceso a la vez.
-El recurso compartido es aquel al que tienen acceso distintos procesos y pueden realizar cambios en el mismo. 
Si no se encuentra gestionado el acceso se pueden perder datos durante la sobreescritura.
-Se puede instanciar un Thread de las siguientes formas:
  1-Mediante la imprementación de la Interfaz Runneable.
  2-Extendiendo de la clase Thread.
  3-Creando un objeto Thread.
