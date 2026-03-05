📌 Descripción
Aplicación de consola en Java desarrollada de forma colaborativa por dos alumnos. Permite gestionar una lista de tareas: añadir nuevas tareas y marcarlas como completadas.
El proyecto integra un flujo de trabajo profesional con Git y GitHub, documentación con Javadoc y desarrollo en IntelliJ IDEA.

🎯 Objetivo

Hacer uso correcto de Git, GitHub y Javadoc de forma conjunta, conociendo el desarrollo de código de forma profesional.


🏗️ Estructura del Código
El programa consta de tres clases principales:
ClaseResponsabilidadTarea.javaModelo de datos. Atributos: descripción (String) y completada (boolean). Constructor, getters y setters.GestorTareas.javaLógica de negocio. Maneja un ArrayList<Tarea> con métodos para añadir, listar y marcar tareas como completadas.Main.javaPunto de entrada. Menú interactivo de consola que conecta al usuario con GestorTareas.

🔀 Flujo de Trabajo Git
Fase 1 — Setup y Estructura Base (Alumno A)

Crear el proyecto Java y la clase Tarea.java
Inicializar el repositorio local con git init
Crear el repositorio en GitHub y hacer el commit inicial
Push a main → crear rama develop → crear rama feature-registro

Fase 2 — Desarrollo Paralelo (Alumno B)

Clonar el repositorio y cambiar a develop
Crear la rama feature-listado
Desarrollar GestorTareas.java y Main.java
Documentar con Javadoc los métodos creados

Fase 3 — Integración y Merge

Pull request y merge de feature-listado → develop
Resolución de conflictos si los hubiera
Merge final a main
Generar documentación HTML con Generate JavaDoc en IntelliJ
Sincronizar la carpeta /javadoc con el repositorio remoto


🌿 Ramas del Repositorio
Rama principal de producción. Código estable, developRama de integración. Recibe merges de las feature-listado,feature-registro. Desarrollo de Tarea.java — Alumno A.feature-listado. Desarrollo de GestorTareas.java y Main.java — Alumno B.

📚 Documentación Javadoc
La documentación se genera con Tools → Generate JavaDoc en IntelliJ IDEA. Se crea la carpeta /javadoc en la raíz del proyecto, que se sincroniza con el repositorio remoto.
Cada alumno documenta los métodos que ha desarrollado usando las etiquetas estándar:
java
 * Descripción del método.
 *
 * @param nombre descripción del parámetro
 * @return descripción del valor de retorno
 * @author NombreAlumno
 */

📦 Entrega

 Enlace al repositorio de GitHub
 Captura del historial gráfico: git log --oneline --graph --all
 Captura del registro: git reflog
 Captura de la documentación HTML generada con Javadoc
 Documento PDF guardado como A403-nombreapellidos


⚙️ Tecnologías

Lenguaje: Java SE
Control de versiones: Git + GitHub
IDE: IntelliJ IDEA (con Git Bash integrado)
Documentación: Javadoc
Modalidad: Trabajo colaborativo entre 2 alumnos
