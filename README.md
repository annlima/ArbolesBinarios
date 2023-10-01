# Arboles Binarios
Este proyecto implementa un árbol binario y realiza tres tipos de recorridos: preorden, inorden y postorden. Estos recorridos son fundamentales en ciencias de la computación y tienen diversas aplicaciones, desde bases de datos hasta compiladores.

## Instrucciones de Uso
1. Clona este repositorio o descarga los archivos.
2. Abre el proyecto en tu entorno de desarrollo Java preferido.
3. Ejecuta la clase `App` para ver los recorridos en acción.
4. Se presentará un menú interactivo que te permitirá seleccionar el tipo de recorrido que deseas realizar.

## Estructura del Proyecto

- `App.java`: Contiene el punto de entrada del programa y el menú interactivo.
- `Node.java`: Define la estructura de un nodo en el árbol binario.
- Los recorridos en preorden, inorden y postorden se implementan en `App.java`.

## Ejemplo de Árbol

```plaintext
    1
   / \
  2   3
 / \   \
4   5   6
```

Los árboles binarios son estructuras de datos que tienen dos punteros que apuntan a otros elementos, con una estructura lógica ramificada. Tienen aspecto de árbol, de ahí su nombre; algunos ejemplos son los árboles genealógicos y los organigramas.

![image](https://github.com/annlima/ArbolesBinarios/assets/89811870/d2984a4e-b769-4fc3-b751-0538d786af1b)

Imagen obtenida de: https://hhmosquera.wordpress.com/arbolesbinarios/ 

La rama izquierda y la derecha, también son dos árboles binarios; donde, el vértice principal se denomina raíz y cada una de las ramas se  puede denominar como subárbol izquierdo y subárbol derecho.

**Recorrido en Preorden:** En este recorrido, primero se visita el nodo actual, luego el subárbol izquierdo y finalmente el subárbol derecho.
**Recorrido en Inorden:** Primero se visita el subárbol izquierdo, luego el nodo actual y finalmente el subárbol derecho.
**Recorrido en Postorden:** Se visita primero el subárbol izquierdo, luego el subárbol derecho y finalmente el nodo actual.

## Pruebas:
  - Crea un árbol binario con al menos 10 nodos.

 <img width="246" alt="Captura de pantalla 2023-09-27 a la(s) 3 01 44 p m" src="https://github.com/annlima/ArbolesBinarios/assets/89811870/e760d225-9afd-4b21-83c9-c753518bae93">

  - Ejecuta cada uno de los recorridos implementados y verifica que los números se impriman en el orden correcto.

Para preorden:

<img width="199" alt="Captura de pantalla 2023-09-27 a la(s) 3 10 19 p m" src="https://github.com/annlima/ArbolesBinarios/assets/89811870/4f8b0b07-eb39-4e40-82ba-ac9bc5eb2d71">

Para inorden:

<img width="204" alt="Captura de pantalla 2023-09-27 a la(s) 3 10 56 p m" src="https://github.com/annlima/ArbolesBinarios/assets/89811870/733f4624-7fcc-48af-a831-c57d711a8989">

Para postorden:

<img width="199" alt="Captura de pantalla 2023-09-27 a la(s) 3 11 21 p m" src="https://github.com/annlima/ArbolesBinarios/assets/89811870/677b1d0d-748c-493c-bd5b-11f96de27d3c">


## Documentación:

Los árboles binarios, especialmente con sus recorridos como inorden, tienen un papel crucial, porque por ejemplo los árboles binarios de búsqueda (BST) sirven en búsquedas rápidas, o para insertar y eliminar datos, como en las bases de datos. Además, en expresiones matemáticas para programación, los árboles de expresión nos ayudan a representar y evaluar estas fórmulas.

## Recursos Adicionales

- [Árbol binario](https://es.wikipedia.org/wiki/%C3%81rbol_binario)
- [Recorrido en árboles](https://es.wikipedia.org/wiki/Recorrido_en_%C3%A1rboles)

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras algún error o tienes una mejora, no dudes en abrir un issue o enviar un pull request.

## Autor

- Andrea Lima Blanca
- Contacto: andrealimablanca@outlook.com
