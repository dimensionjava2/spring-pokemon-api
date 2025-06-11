# Prueba Técnica - Backend Developer
## API de Gestión de Pokémon

### Objetivo

Desarrollar una API REST que consuma la API externa de PokéAPI para obtener información detallada de Pokémon. El candidato debe demostrar su capacidad para integrar servicios externos usando Feign Client, mapear datos entre diferentes DTOs y crear endpoints funcionales.

### Stack Tecnológico

- Java 11+
- Spring Boot
- Spring Cloud OpenFeign
- Maven
- Lombok

### Descripción del Problema

Se requiere crear una API que actúe como intermediario entre clientes y la API pública de PokéAPI (https://pokeapi.co/api/v2/pokemon). La API debe permitir obtener información específica de Pokémon mediante su nombre, retornando únicamente los datos relevantes para el negocio.

### Integración Externa

La API debe consumir el siguiente endpoint de PokéAPI:

- **GET** `https://pokeapi.co/api/v2/pokemon/{name}` - Obtener información completa de un Pokémon

### Endpoint Obligatorio a Implementar

El siguiente endpoint es **crítico** y será evaluado principalmente:

#### Obtener Información de Pokémon (POST)
- **POST** `/pokemon/api/v1/poke/retrieve`
- Recibe un `PokemonRequest` en el body con los campos `id` y `name`
- Debe retornar información filtrada del Pokémon consultado
- Solo debe incluir `abilities` y `base_experience` en la respuesta

### Estructura de Datos

**Petición (PokemonRequest):**
```json
{
    "id": "123",
    "name": "ditto"
}
```

**Respuesta esperada (PokemonDTO):**
```json
{
    "abilities": [
        {
            "ability": {
                "name": "limber",
                "url": "https://pokeapi.co/api/v2/ability/7/"
            },
            "is_hidden": false,
            "slot": 1
        },
        {
            "ability": {
                "name": "imposter",
                "url": "https://pokeapi.co/api/v2/ability/150/"
            },
            "is_hidden": true,
            "slot": 3
        }
    ],
    "base_experience": 101
}
```

**URL externa consultada:**
- `https://pokeapi.co/api/v2/pokemon/ditto`

---

**Tiempo Estimado: 45 minutos**

**Recursos Útiles:**
- Documentación PokéAPI: https://pokeapi.co/docs/v2
- Ejemplos de Pokémon para pruebas: pikachu, ditto, charizard, bulbasaur
