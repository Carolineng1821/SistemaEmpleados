# Sistema de Gestión de Empleados

## Descripción

Aplicación de consola desarrollada en Java para gestionar información de empleados mediante operaciones CRUD (Crear, Consultar, Actualizar y Eliminar).

El proyecto implementa encapsulamiento, validaciones, generación automática de identificadores y separación de responsabilidades entre la interacción con el usuario y la lógica de negocio.

## Objetivo

Desarrollar una aplicación Java que permita administrar empleados y practicar conceptos fundamentales de programación orientada a objetos, manejo de colecciones, encapsulamiento y organización de la lógica de negocio.

## Funcionalidades

- Agregar empleados.
- Generar automáticamente un ID único para cada empleado.
- Listar empleados registrados.
- Buscar empleados por nombre.
- Buscar empleados por ID.
- Actualizar departamento y salario.
- Eliminar empleados por ID.
- Validar la edad mínima del empleado.
- Validar que el salario sea mayor a cero.
- Manejar empleados inexistentes mediante validaciones.
- Mantener los empleados registrados durante la ejecución del sistema.

## Tecnologías

- Java 21
- Eclipse Temurin JDK 21
- IntelliJ IDEA
- Git
- GitHub

## Estructura del proyecto

```text
SistemaEmpleados/
├── src/
│   ├── Main.java
│   ├── Empleado.java
│   └── EmpleadoService.java
├── .gitignore
└── README.md
```

### Responsabilidades de las clases

**Empleado**

Representa la entidad empleado y contiene sus atributos y reglas básicas de validación.

**EmpleadoService**

Contiene la lógica de negocio y las operaciones relacionadas con la gestión de empleados.

**Main**

Gestiona la interacción con el usuario, muestra el menú y presenta los resultados obtenidos del servicio.

La arquitectura utilizada sigue el principio:

```text
Main
  │
  │ solicita operaciones
  ▼
EmpleadoService
  │
  │ administra empleados
  ▼
Empleado
```

## Instalación y clonación

### Requisitos

Antes de ejecutar el proyecto es necesario contar con:

- JDK 21 o superior.
- IntelliJ IDEA u otro IDE compatible con Java.
- Git.

### Clonar el repositorio

Desde una terminal:

```bash
git clone https://github.com/Carolineng1821/SistemaEmpleados.git
```

Entrar al directorio del proyecto:

```bash
cd SistemaEmpleados
```

Después, abrir el proyecto desde IntelliJ IDEA y configurar el JDK 21 como SDK del proyecto.

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el proyecto utilice JDK 21.
3. Abrir la clase `Main.java`.
4. Ejecutar el método `main`.
5. Utilizar el menú de opciones de la aplicación.

### Menú principal

```text
===== SISTEMA DE EMPLEADOS =====
1. Agregar empleado
2. Buscar empleado
3. Actualizar empleado
4. Eliminar empleado
5. Listar empleados
6. Salir
```

## Ejemplo de uso

### Agregar empleado

```text
*** Agregar empleado ***
Nombre del empleado:
ana
Edad del empleado:
25
Departamento del empleado:
Recursos Humanos
Salario del empleado:
20000
```

El sistema genera automáticamente el ID:

```text
ID: 1
Nombre: ana
Edad: 25
Departamento: Recursos Humanos
Salario: 20000.0
```

### Actualizar empleado

```text
Escribe el Id del empleado que desea actualizar:
4

Escribe el nuevo departamento del empleado que desea actualizar:
Recursos Humanos

Escribe el nuevo salario del empleado que desea actualizar:
28000
```

### Eliminar empleado

```text
Escribe el ID del empleado que deseas eliminar:
4

Empleado eliminado:
ID: 4
Nombre: lusi enrique
Edad: 34
Departamento: Recursos Humanos
Salario: 28000.0
```

## Validaciones

El sistema incorpora diferentes validaciones:

- La edad del empleado debe ser de al menos 18 años.
- El salario debe ser mayor a cero.
- No se permite actualizar un empleado inexistente.
- No se permite eliminar un empleado inexistente.
- Las búsquedas sin resultados muestran un mensaje informativo.
- Las operaciones sobre empleados se realizan mediante `EmpleadoService`.

## Conceptos Java practicados

Durante el desarrollo del proyecto se aplicaron los siguientes conceptos:

- Programación Orientada a Objetos (POO).
- Clases y objetos.
- Constructores.
- Encapsulamiento.
- Modificadores de acceso `private` y `public`.
- Getters y setters.
- Validaciones mediante excepciones.
- `ArrayList`.
- Métodos y parámetros.
- Retorno de objetos.
- Retorno de colecciones.
- Búsqueda y filtrado de información.
- Estructuras `if/else`.
- Estructura `switch`.
- Ciclos `do-while` y `for`.
- Manejo de `Scanner`.
- Separación entre interacción y lógica de negocio.
- Operaciones CRUD.

## Aprendizajes

Este proyecto permitió practicar la evolución de una aplicación Java desde una implementación sencilla hasta una estructura con responsabilidades mejor separadas.

Uno de los principales aprendizajes fue comprender que los atributos de una entidad deben protegerse mediante encapsulamiento y que las operaciones relacionadas con la gestión de empleados pueden centralizarse en una clase de servicio.

También se practicó el manejo de excepciones y validaciones para evitar que datos incorrectos sean incorporados o modificados dentro del sistema.

## Autor

**Carolina Neri**

Desarrolladora Java Backend en formación.

Enfocada en el desarrollo backend con Java y en la construcción de aplicaciones aplicando buenas prácticas de programación orientada a objetos.

GitHub:  
https://github.com/Carolineng1821