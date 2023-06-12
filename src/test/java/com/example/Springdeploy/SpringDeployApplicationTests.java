package com.example.Springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
            // esto imprime las variables de entorno
            System.getenv().forEach(
                    (key, value) -> System.out.println(key + " " + value)
            );
         
	}

}
