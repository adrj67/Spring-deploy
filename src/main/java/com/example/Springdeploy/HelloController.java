
package com.example.Springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    // esto hace referencia a app.message que esta en application properties,
    // cuando ejecuto http://localhost:8081/hola aparece "Hola Mundo, como va!!"
    // en Postman y "Hola mundo desde produccion" por consola
    @Value("${app.message}")
    String message;
    
    @Value("${app.variableDeEjemplo}")
    String message2;
    
    @Value("${app.variabledeejemplo2}")
    String message3;
    
    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println(message);
        System.out.println(message2);
        System.out.println(message3);
        return "Hola Mundo, como va!!";
    }
    
    @GetMapping("/")
    public String boostrap(){
        return """
               <!doctype html>
               <html lang="en">
                 <head>
                   <!-- Required meta tags -->
                   <meta charset="utf-8">
                   <meta name="viewport" content="width=device-width, initial-scale=1">
               
                   <!-- Bootstrap CSS -->
                   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
               
                   <title>Hello, world!</title>
                 </head>
                 <body>
                   <h1>Hola mundo desde Springboot!!</h1>
                   <a class="btn btn-primary" href="https://www.google.com.ar">Google</a>
                   <!-- Optional JavaScript; choose one of the two! -->
               
                   <!-- Option 1: Bootstrap Bundle with Popper -->
                   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
               
                   <!-- Option 2: Separate Popper and Bootstrap JS -->
                   <!--
                   <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
                   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
                   -->
                 </body>
               </html>
               """;
    }
}
