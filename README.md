Venta de Guitarras - API REST
Esta es una API REST diseñada para gestionar la venta de guitarras. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una base de datos MySQL para almacenar información sobre las guitarras disponibles para la venta.

Estructura del Proyecto
El proyecto está organizado de la siguiente manera:

src/main: Contiene el código fuente de la aplicación.
Config: Configuración de la aplicación.
Controllers: Controladores que manejan las solicitudes HTTP y las respuestas.
Models: Entidades de la aplicación, en este caso, la definición de la guitarra.
Repository: Repositorios que interactúan con la base de datos.
Configuración
Para configurar la conexión con la base de datos MySQL, modifica el archivo application.properties en la carpeta src/main/resources con la siguiente información:

# Configuración de la conexión con la base de datos MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/ventas_guitarras
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update

# Configuración del controlador JDBC y del dialecto de la base de datos
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
Asegúrate de reemplazar password con tu contraseña de MySQL y ajustar cualquier otro parámetro según tu configuración específica de la base de datos.

Uso
Puedes interactuar con la API utilizando las siguientes URL y métodos HTTP:

GET (/api/Guitar): Obtiene todas las guitarras disponibles para la venta.
GET (/api/Guitar/{id}): Obtiene una guitarra específica por su ID.
POST (/api/Guitar): Crea una nueva entrada para una guitarra en la base de datos.
PUT (/api/Guitar/{id}): Actualiza la información de una guitarra existente.
DELETE (/api/Guitar/{id}): Elimina una guitarra de la base de datos
