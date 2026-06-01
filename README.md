 Proyecto POO – Contenidos Audiovisuales

 Descripción del Proyecto

Este proyecto consiste en la ampliación de un sistema desarrollado en Java para la gestión de contenidos audiovisuales, aplicando conceptos avanzados de Programación Orientada a Objetos (POO).

A partir de una base inicial que incluye clases como ContenidoAudiovisual, Película, SerieDeTV y Documental, se han incorporado nuevas funcionalidades, clases y relaciones para enriquecer el modelo del sistema.

El objetivo principal es demostrar el uso de principios como herencia, asociación, agregación y composición, además del manejo de proyectos mediante GitHub.


 Objetivos

- Aplicar conceptos avanzados de POO en Java
- Extender un sistema existente con nuevas clases y funcionalidades
- Modelar relaciones entre clases (asociación, agregación, composición)
- Crear un sistema funcional y estructurado
- Gestionar versiones del proyecto con GitHub


Clases Implementadas

 Clases originales

ContenidoAudiovisual
Película
SerieDeTV
Documental

Nuevas clases añadidas

Actor - Relacionado con Película (asociación)
Temporada - Relacionada con SerieDeTV (composición)
Investigador - Relacionado con Documental (asociación)


Nuevas Subclases

Se añadieron nuevas subclases que heredan de "ContenidoAudiovisual":

Podcast
Audiolibro

Cada una incluye:

Atributos propios
Constructores
Métodos personalizados


Relaciones entre Clases

Herencia:

Película, SerieDeTV, Documental, Podcast y Audiolibro heredan de ContenidoAudiovisual

Asociación:

Película - Actor
Documental - Investigador

Composición:

SerieDeTV - Temporada



Funcionalidades

El sistema permite:

Crear objetos de todas las clases
Gestionar información de contenidos audiovisuales
Relacionar actores, temporadas e investigadores
Ejecutar el sistema sin errores


Tecnologías utilizadas

Java
Programación Orientada a Objetos (POO)
Git y GitHub
Eclipse IDE


 Instrucciones de uso

1. Clonar el repositorio:

git clone https://github.com/dantenoob7/poo_unidad1_final.git

2. Abrir el proyecto en Eclipse

3. Ejecutar la clase principal del proyecto


Estructura del Proyecto


src
 -main/java/
     -clases principales
      -nuevas clases
      -subclases




Mejoras implementadas

-Ampliación del modelo con nuevas clases
-Implementación de relaciones POO completas
-Código organizado y modular
-Proyecto funcional y listo para ejecución
-Actualización de documentación.


*Nuevas Funcionalidades Implementadas*

-Manejo de Archivos

Se implementó la clase `ArchivoContenido`, la cual permite:

-Guardar información de contenidos audiovisuales en archivos CSV.
-Leer información almacenada desde archivos CSV.
-Persistir los datos generados por el sistema.

-Aplicación del Patrón MVC

Se incorporó una arquitectura Modelo-Vista-Controlador (MVC):

Modelo (Model): ContenidoAudiovisual, Pelicula, SerieDeTV, Documental, Podcast, Audiolibro, Actor, Temporada e Investigador.
Vista (View):** VistaConsola.
Controlador (Controller):** ControladorContenido.

Esta estructura mejora la organización y mantenibilidad del sistema.

*Pruebas Unitarias*

Se implementaron pruebas unitarias utilizando JUnit para verificar el correcto funcionamiento de las clases principales del proyecto.

Pruebas desarrolladas:

* PeliculaTest
* SerieDeTVTest
* DocumentalTest

Las pruebas verifican atributos, constructores y métodos de las clases principales.

Estructura Actual del Proyecto

src/

* poo/ Clase principal (PruebaAudioVisual)
* uni1a/  Clases del modelo y manejo de archivos
* mvc/  Implementación del patrón MVC

test/

-PeliculaTest.java
-SerieDeTVTest.java
-DocumentalTest.java

*Ejecución de Pruebas*

Para ejecutar las pruebas unitarias:

1. Abrir el proyecto en Eclipse.
2. Ir a la carpeta "test".
3. Seleccionar la clase de prueba deseada.
4. Clic derecho → Run As → JUnit Test.
5. Verificar que las pruebas finalicen con barra verde y sin errores.

*Mejoras Implementadas*

* Incorporación de clases Actor, Temporada e Investigador.
* Incorporación de nuevas subclases Podcast y Audiolibro.
* Implementación de manejo de archivos CSV.
* Aplicación de principios de Programación Orientada a Objetos.
* Implementación del patrón MVC.
* Desarrollo de pruebas unitarias con JUnit.
* Actualización del diagrama de clases.
* Organización y refactorización del código.


Autor

Geovanny Sanchez

