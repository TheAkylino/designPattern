# 📐Builder Pattern

El patrón Builder se utiliza en el dominio para construir entidades complejas de forma controlada, garantizando la consistencia del objeto y evitando constructores telescópicos.

## ✨ En esta arquitectura, el Builder:
- Se implementa en la capa de dominio
- Encapsula validaciones de negocio en el método `build()`
- Permite crear objetos inmutables
- Evita la creación de objetos en estados inválidos

> ⚠️ **Importante:** Su uso se limita a entidades con múltiples atributos o reglas de construcción complejas.
