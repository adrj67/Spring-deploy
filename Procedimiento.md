# Para empaquetar la aplicacion con Maven
    * Boton derecho en el Proyecto 'Run Maven > Goals...'
    * Escribir 'Package' > OK
    * Se crea la carpeta 'Target', donde hay un archivo llamado:
        "Spring-deploy-0.0.1-SNAPSHOT.jar"
        -nombre proyecto + version segun el POM renglon 13-
    * Para ejecutar el paquete, desde una terminal (boton derecho en la carpeta Target)
      Tools > Open in Terminal
    * escribimos: java -jar ./Spring-deploy-0.0.1-SNAPSHOT.jar
    * Estaria funcionando. 
    * Para frenarlo: Ctrl + c
    * Para Borrar el paquete, boton derecho en el Proyecto 'Run Maven > Goals...'
    * Escribir 'clean' > OK


