# Proyecto Java - Clase Product

## Descripción
Este proyecto demuestra conceptos básicos de Programación Orientada a Objetos en Java: definición de atributos, encapsulación, constructores, getters/setters, sobrescritura de `toString` e instanciación de objetos desde una clase principal.

## Requisitos
- **Java JDK 11** o superior instalado.
- **Maven** instalado solo si vas a usar `pom.xml`.
- Git para control de versiones.
- Entorno de desarrollo recomendado: **Visual Studio Code** o IntelliJ IDEA.

## Estructura del proyecto
- **Main.java**: clase con el método `public static void main(String[] args)` que demuestra el uso de `Product`.  
- **Product.java**: clase modelo con atributos privados, constructores, getters/setters y `toString`.  
- **pom.xml**: archivo de Maven si se requiere gestión de dependencias o empaquetado.

## Compilar y ejecutar
### Opción A Compilar y ejecutar manualmente (sin Maven)
```bash
# Desde la raíz del proyecto: compilar
javac -d out actividad3/src/main/java/com/example/*.java

# Ejecutar indicando el paquete completo
java -cp out com.example.Main