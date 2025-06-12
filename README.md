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


# Agregando SQL Server:

   ```bash
   docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=yourStrong(!)Password" -e "MSSQL_PID=Evaluation" -p 1433:1433  --name sqlpreview --hostname sqlpreview -d mcr.microsoft.com/mssql/server:2022-preview-ubuntu-22.04
   fuente: https://hub.docker.com/r/microsoft/mssql-server/
   ```


