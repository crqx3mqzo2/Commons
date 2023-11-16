# Commons

## Descripción General
utilitarios-saajf es una biblioteca robusta de utilidades diseñada para la construcción y el manejo eficiente de aplicaciones en un entorno de microservicios, utilizando Java 8 y Spring Boot. Este proyecto ofrece una serie de herramientas que incluyen:

- **DTOs para Respuestas Estándar**: Clases para encapsular respuestas de servicios REST de manera coherente y estandarizada.
- **Builders para Respuestas y Excepciones**: Métodos para construir respuestas de API y manejar excepciones de forma controlada.
- **Helper Utilities**: Funciones útiles para validar estados de objetos, colecciones y mapas, como verificar si son nulos o vacíos y si los números son mayores a cero.
- **File Utilities**: Operaciones de archivos que incluyen leer y escribir en el sistema de archivos, manejar archivos temporales, y eliminar archivos de manera segura según el sistema operativo.
- **Criptografía**: Herramientas para codificar y decodificar utilizando Base64, permitiendo el manejo de datos en formatos seguros para la transmisión.

## Características
- **DTOs para Respuestas Estándar**: Estructura de Data Transfer Objects para respuestas estandarizadas.
- **Builders para Respuestas**: Métodos para construir respuestas de servicios REST de manera consistente.
- **Manejo de Excepciones Personalizado**: Clases para definir y manejar excepciones específicas del proyecto.
- **Java 8 y Spring Boot 2.2.4.RELEASE**: Requisitos para la utilización de la librería.

## Requisitos
Java 8
Spring Boot 2.2.4.RELEASE
## Cómo Usar
Los DTOs y builders pueden utilizarse para estructurar respuestas en la API. Para una respuesta estándar de un servicio, simplemente instancie el objeto DTO y utilice el builder correspondiente para generar una ResponseEntity.

## Ejemplos de Uso:
```java
// Para una respuesta genérica con un valor
ResponseGenericoDto<String> dto = new ResponseGenericoDto<>();
ResponseEntity<ResponseGenericoDto<String>.ResponseConsultar2Dto> response = 
    dto.buildRespuestaPositiva("Tu valor");

// Para manejar una excepción personalizada
try {
    // tu lógica de negocio
} catch (CustomApplicationException ex) {
    ResponseEntity<ResponseGenericoDto<Object>.ResponseConsultar2Dto> response = 
        RespuestaBuilder<Object>.buildRespuestaControlada(ex);
}
```
## Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar o extender la funcionalidad, por favor haz un fork del repositorio, haz tus cambios, y solicita un pull request con una descripción detallada de tus mejoras.

### 'pom.xml'

El archivo pom.xml del proyecto define las siguientes dependencias clave para Spring Boot y otras librerías:

Spring Boot Data Rest
Spring Web
Spring Kafka
Log4j
Commons IO

Para construir el proyecto, usa Maven:
```shell
mvn clean install
```
