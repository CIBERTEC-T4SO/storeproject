# storeproject
Store Project
V1

=======

Proyecto de ejemplo para una tienda utilizando Java, Spring Boot y Maven.

## Características

- API RESTful para gestión de productos, clientes y pedidos.
- Arquitectura basada en Spring Boot.
- Persistencia de datos con JPA/Hibernate.
- Pruebas unitarias y de integración.

## Requisitos

- Java 17 o superior
- Maven 3.8+
- IDE recomendado: IntelliJ IDEA

## Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/storeproject.git
   
## Cambios / Pull Requests

1. Crea una rama para tu cambio:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
2. Realiza tus cambios y haz commit:
   ```bash
    git commit -m "Añadir nueva funcionalidad"
    ```
3. Sube tus cambios:
   ```bash
   git push origin feature/nueva-funcionalidad
   ```
4. Crea un Pull Request en GitHub.


#########################################################

## 📦 Uso de archivo .env para datos sensibles
Este proyecto utiliza un archivo .env para manejar de forma segura las credenciales de la base de datos y otras variables sensibles. Esta práctica evita exponer información crítica dentro del código fuente o el repositorio.

## ✅ ¿Por qué usar .env?

Mejora la seguridad, evitando dejar claves o contraseñas en el código.
Facilita la configuración por entorno (desarrollo, testing, producción).
Permite cambiar valores sin recompilar ni modificar archivos del sistema.

## 🔧 ¿Cómo se implementa?
Se utiliza la biblioteca dotenv-java, y el archivo .env se carga manualmente en el método main() de la clase principal antes de iniciar Spring Boot.

```java
Dotenv dotenv = Dotenv.configure()
.filename(".env")
.load();

System.setProperty("MYSQL_USER", dotenv.get("MYSQL_USER"));
System.setProperty("MYSQL_PASSWORD", dotenv.get("MYSQL_PASSWORD"));
```

## 📌 Beneficios adicionales
Puedes compartir el proyecto sin compartir contraseñas.

Compatible con herramientas de CI/CD al configurar variables de entorno.

Reduce el riesgo de errores al mover el proyecto entre entornos.

