
## Despliegue de apps Spring Boot en Heroku

Crear archivo ´system.properties´ en el proyecto con el contenido:
´´´
java.runtime.version=17
´´´

1. Crear cuenta en Heroku.com y en github.com
2. Tener configurado git en el ordenador o con git Bash:
    1. 'git config --global user.name "Adrian"'
    2. 'git config --global user.email adrj67@gmail.com'
3. Subir el proyecto a GitHub desde NetBeans o desde git Bash
4. Desde Heroku, crear app y elegir metodo GitHub y buscar el repositorio subido
5. Habilitar deploy automatico y ejecutar el Deploy

## Ejercicio 1

* Probar a empaquetar la aplicacion con maven package desde Intellij IDEA (Netbeans¿?)

* Desde terminal en Intelij IDEA verificar que se ejecuta correctamente con el comando:
```
java -jar target/spring-deploy-1.0.jar
```
* Crear un perfil para test y otro para dev con una propiedad nueva que carguemos en el controlador.

## Ejercicio 2

* Desplegar el API REST de Laptop en Heroku y verificar el funcionamiento en POSTMAN
