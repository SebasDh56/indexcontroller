Proyecto IndexController - Laboratorio 1Este proyecto es una aplicación web básica construida utilizando Spring Boot 3 / 4 y Java 21. Fue diseñado para comprender la estructura de un proyecto Spring, el ciclo de vida de las pruebas unitarias con JUnit 5, y la exposición de endpoints HTTP mediante un controlador REST básico.🚀 Características del ProyectoEl proyecto consta de dos componentes principales completamente probados mediante tests unitarios:Clase Suma (Suma.java):Una clase Java básica sin dependencias del framework.Diseñada para practicar el uso de aserciones en JUnit 5 y comprender las directivas de ciclo de vida (@BeforeEach, @AfterEach, @Test).IndexController (IndexController.java):Un controlador de Spring MVC expuesto mediante métodos POST.Procesa un arreglo de parámetros de texto (paramArray), aplicando capitalización selectiva al primer elemento y formateando la salida esperada.🛠️ Requisitos del SistemaJava Development Kit (JDK): Versión 21 (Temurin de Eclipse recomendado).Apache Maven: Versión 3.8 o superior.Puerto local: La aplicación se ejecuta por defecto en el puerto 8081 para evitar colisiones con el puerto 8080.📁 Estructura de Paquetes Clavesrc/
 ├── main/
 │    ├── java/com/clase/indexcontroller/
 │    │    ├── suma/
 │    │    │    └── Suma.java
 │    │    └── controller/
 │    │         └── IndexController.java
 │    └── resources/
 │         └── application.properties (Configurado con server.port=8081)
 └── test/
      └── java/com/clase/indexcontroller/
           ├── suma/
           │    └── SumaTest.java
           └── controller/
                └── IndexControllerTest.java
⚙️ Comandos Útiles de MavenEjecuta estos comandos en la terminal desde la raíz del proyecto para gestionarlo:1. Limpiar y ejecutar todas las pruebasPara realizar una compilación limpia de raíz y correr toda la suite de tests unitarios:mvn clean test
2. Ejecutar pruebas de clases específicasSi solo quieres depurar las pruebas de la clase Suma o IndexController:# Solo pruebas de Suma
mvn test -Dtest=SumaTest

# Solo pruebas del controlador
mvn test -Dtest=IndexControllerTest
3. Levantar la aplicación localmentePara iniciar el servidor de Spring Boot en tu puerto 8081:mvn spring-boot:run
🔌 Pruebas de Endpoints HTTPUna vez que la aplicación se encuentre activa (corriendo bajo mvn spring-boot:run), puedes interactuar con el controlador haciendo peticiones POST al endpoint /welcome.Opción A: Pruebas con cURL (Terminal)💻 Windows (PowerShell)# Enviar array con datos
curl.exe -X POST "http://localhost:8081/welcome" -d "param=java&param=desde&param=0" -H "Content-Type: application/x-www-form-urlencoded"

# Enviar petición sin parámetros
curl.exe -X POST "http://localhost:8081/welcome" -H "Content-Type: application/x-www-form-urlencoded"
🍎 macOS / Linux# Enviar array con datos
curl -X POST "http://localhost:8081/welcome" -d "param=java&param=desde&param=0" -H "Content-Type: application/x-www-form-urlencoded"
Opción B: Pruebas con Postman o Thunder ClientCrea una nueva petición con el método POST.Configura la URL como: http://localhost:8081/welcome.Ve a la pestaña Body y selecciona la opción x-www-form-urlencoded.Añade las siguientes filas:KeyValueparamjavaparamdesdeparam0Haz clic en Send.📝 Salida Esperada:param[0]Java
param[1]desde
param[2]0
