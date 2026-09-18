# Sistema de Gestión de Citas Médicas (POO)

Proyecto desarrollado en **Java** que implementa los principios de la **Programación Orientada a Objetos (POO)** para administrar la operación básica de una clínica médica por consola.

---

## 📋 Características del Sistema

- **Gestión de Pacientes:** Clasificación y atención mediante herencia (`PacienteGeneral` y `PacientePrioritario`).
- **Gestión de Médicos:** Registro y disponibilidad del personal de salud (`Medico`).
- **Control de Citas:** Asignación y vinculación entre pacientes y profesionales (`Cita`).
- **Módulo Principal:** Flujo de ejecución interactivo por consola (`PrincipalLaytonh`).
- **Utilidades auxiliares:** Validaciones y métodos de soporte (`Utilidades`).

---

## 🏗️ Arquitectura y Clases

| Clase | Responsabilidad |
| :--- | :--- |
| `Clinica.java` | Controlador principal; almacena y coordina médicos, pacientes y citas. |
| `Paciente.java` | Clase base con atributos comunes de los pacientes. |
| `PacienteGeneral.java` | Subclase para pacientes bajo atención estándar. |
| `PacientePrioritario.java` | Subclase para atención prioritaria (triaje/preferencial). |
| `Medico.java` | Representación de los datos del profesional médico. |
| `Cita.java` | Entidad que relaciona un médico, un paciente y el horario. |
| `PrincipalLaytonh.java` | Punto de entrada del programa (`main`). |
| `Utilidades.java` | Funciones auxiliares y validaciones de entrada. |

---

## 🛠️ Tecnologías Utilizadas

- **Lenguaje:** Java
- **Paradigma:** Programación Orientada a Objetos (POO: Herencia, Polimorfismo, Encapsulamiento)
- **Control de Versiones:** Git y GitHub