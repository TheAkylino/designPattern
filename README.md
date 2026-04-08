# 📐 Design Patterns — Patrones de Diseño de Software

Los **patrones de diseño de software** son soluciones reutilizables y comprobadas a problemas comunes que surgen durante el diseño de aplicaciones. No representan implementaciones específicas, sino **guías o plantillas conceptuales** que definen cómo estructurar clases, objetos y sus interacciones.

---

## ✨ Beneficios de aplicar patrones de diseño

- ✅ Mejorar la **mantenibilidad** del código  
- ✅ Reducir el **acoplamiento** entre componentes  
- ✅ Facilitar la **extensibilidad** del sistema  
- ✅ Promover **buenas prácticas** de diseño orientado a objetos  

> ⚠️ **Importante:** Los patrones deben aplicarse **solo cuando existe un problema real que resolver**. Su uso indiscriminado puede introducir complejidad innecesaria.

---

## 📂 Clasificación de los Patrones de Diseño

Los patrones se agrupan en **tres categorías principales** según el tipo de problema que abordan:

### 🏗️ 1. Patrones Creacionales

Se enfocan en **cómo se crean los objetos**, encapsulando la lógica de instanciación para hacerla más flexible y reutilizable.

**🎯 Problema que resuelven:**  
Evitar la creación rígida de objetos y reducir el acoplamiento al usar `new`.

**📌 Patrones más comunes:**

| Patrón           | Descripción breve                          |
|------------------|---------------------------------------------|
| **Singleton**    | Garantiza una única instancia de una clase. |
| **Factory Method** | Define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar. |
| **Abstract Factory** | Proporciona una interfaz para crear familias de objetos relacionados sin especificar sus clases concretas. |
| **Builder**      | Separa la construcción de un objeto complejo de su representación. |
| **Prototype**    | Crea nuevos objetos clonando una instancia prototípica. |

---

### 🧩 2. Patrones Estructurales

Se centran en **cómo se componen y organizan** las clases y objetos para formar estructuras más complejas.

**🎯 Problema que resuelven:**  
Facilitar la integración entre componentes y reducir el acoplamiento.

**📌 Patrones más comunes:**

| Patrón        | Descripción breve                                            |
|---------------|--------------------------------------------------------------|
| **Adapter**   | Permite que interfaces incompatibles trabajen juntas.        |
| **Decorator** | Añade responsabilidades adicionales a un objeto dinámicamente. |
| **Facade**    | Proporciona una interfaz simplificada a un conjunto de subsistemas. |
| **Composite** | Compone objetos en estructuras de árbol para representar jerarquías parte‑todo. |
| **Proxy**     | Controla el acceso a otro objeto.                            |
| **Bridge**    | Desacopla una abstracción de su implementación.              |
| **Flyweight** | Comparte objetos de grano fino para optimizar recursos.      |

---

### 🔄 3. Patrones de Comportamiento

Definen **cómo interactúan los objetos** y cómo se distribuyen las responsabilidades.

**🎯 Problema que resuelven:**  
Eliminar lógica condicional compleja y mejorar la comunicación entre objetos.

**📌 Patrones más comunes:**

| Patrón                   | Descripción breve                                               |
|--------------------------|-----------------------------------------------------------------|
| **Strategy**             | Permite seleccionar un algoritmo en tiempo de ejecución.        |
| **Observer**             | Define una dependencia uno‑a‑muchos entre objetos.              |
| **Command**              | Encapsula una solicitud como un objeto.                         |
| **State**                | Permite que un objeto altere su comportamiento cuando cambia su estado interno. |
| **Chain of Responsibility** | Evita acoplar el emisor de una petición a su receptor dando la oportunidad a varios objetos de manejarla. |
| **Mediator**             | Centraliza la comunicación compleja entre objetos.              |
| **Template Method**      | Define el esqueleto de un algoritmo en una operación, delegando algunos pasos en subclases. |
| **Iterator**             | Proporciona un modo de acceder secuencialmente a los elementos de una colección sin exponer su representación subyacente. |
| **Visitor**              | Permite definir una nueva operación sobre una estructura de objetos sin modificar las clases de los elementos. |
| **Memento**              | Captura y externaliza el estado interno de un objeto sin violar la encapsulación. |

---

## 🧠 Regla de Arquitectura

No eliges un patrón **por la categoría**, sino **por el problema concreto** que necesitas resolver:

- 🏗️ **Creacional** → Cuando el problema es la **instanciación** de objetos.  
- 🧩 **Estructural** → Cuando el problema es el **acoplamiento** entre componentes.  
- 🔄 **De Comportamiento** → Cuando el problema es la **lógica dinámica** o la comunicación entre objetos.

---
