# Modelo seleccionado

## Identificación

Datos técnicos verificados por el usuario mediante `ollama show qwen3.5:4b`:

- **Modelo:** Qwen 3.5 4B.
- **Nombre en Ollama:** `qwen3.5:4b`.
- **Identificador:** `d8b0f5e9760c`.
- **Motor de inferencia:** Ollama **0.40.16**.
- **Arquitectura:** `qwen35`.
- **Parámetros:** 4.2B.
- **Cuantización:** `Q4_K_M`.
- **Tamaño:** 3.3 GB.
- **Longitud de contexto:** 262144 tokens.
- **Embedding length:** 2560.
- **Requires:** Ollama `0.30.0`.
- **Renderer:** `qwen3.5`.
- **Parser:** `qwen3.5`.
- **Template source:** `renderer_parser`.
- **Licencia:** Apache License 2.0.

## Capacidades declaradas por el artefacto

La salida de `ollama show qwen3.5:4b` declara las siguientes capacidades y metadatos:

- **Completion:** disponible.
- **Vision:** disponible.
- **Tools:** disponible.
- **Thinking:** disponible.
- **Thinking levels:** `false`, `true`.
- **Thinking predeterminado:** `true`.
- **Proyector:** CLIP.
- **Parámetros del proyector:** 333.51M.
- **Embedding del proyector:** 1024.
- **Dimensions:** 2560.

Estos campos describen el artefacto. No demuestran que visión, herramientas, thinking o análisis de código hayan sido evaluados experimentalmente en este proyecto.

## Parámetros mostrados por Ollama

| Parámetro | Valor mostrado |
|---|---:|
| Presence penalty | 1.5 |
| Temperature | 1 |
| Top K | 20 |
| Top P | 0.95 |

Estos son los parámetros asociados al artefacto según la salida consultada. No se consideran automáticamente los parámetros efectivos de futuras pruebas.

## Justificación de selección

Se seleccionó este modelo porque su tamaño y disponibilidad en Ollama permiten evaluar la ejecución local de consultas sobre fragmentos de JavaScript.

El experimento evaluará si el modelo identifica errores, detecta problemas de validación y propone correcciones. La selección y las capacidades declaradas no implican que esos desempeños hayan sido comprobados: deben establecerse mediante pruebas y evidencias del experimento.

## Alcance de los datos técnicos

Los datos de esta ficha corresponden a la salida de `ollama show qwen3.5:4b` verificada y proporcionada por el usuario. Los metadatos confirman la identificación y configuración declarada del artefacto, pero no evalúan su calidad, precisión ni rendimiento en las tareas del experimento.

La disponibilidad y eficacia experimental de visión, herramientas, thinking y análisis de código, así como los parámetros efectivos, el contexto efectivo, los tiempos de respuesta y el consumo de recursos durante las pruebas, requieren mediciones y evidencias específicas.
