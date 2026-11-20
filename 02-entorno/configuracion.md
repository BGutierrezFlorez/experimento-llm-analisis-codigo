# Configuración del entorno de inferencia

## Sistema y hardware

- **Sistema operativo:** Windows 10 IoT Enterprise LTSC 2021.
- **Versión:** 21H2.
- **Procesador:** AMD Ryzen 5 4600G.
- **Gráficos integrados:** AMD Radeon Vega 7.
- **Memoria RAM:** 16 GB DDR4.
- **GPU dedicada:** No dispone de tarjeta gráfica dedicada.
- **Tipo de ejecución previsto:** Local.

> **Pendiente:** adjuntar o registrar evidencia de las especificaciones del sistema y del hardware.

## Motor de inferencia

- **Herramienta:** Ollama.
- **Versión reportada:** 0.40.16.

La identificación y las características técnicas del modelo se documentan en [`01-modelo/seleccion-modelo.md`](../01-modelo/seleccion-modelo.md).

> **Pendiente:** conservar la salida de versión y confirmar qué componente reporta esa versión en el entorno utilizado.

## Comandos ejecutados y registrados

Consulta de la versión de Ollama:

```powershell
ollama --version
```

El cliente reportó la versión 0.40.16. Durante la primera consulta se mostró un aviso indicando que no podía conectarse a una instancia en ejecución. La ejecución del modelo no queda confirmada por este resultado.

Consulta de las características del modelo:

```powershell
ollama show qwen3.5:4b
```

La salida local registrada reportó 4.2B parámetros. La discrepancia con la ficha actual de Ollama se documenta en [`01-modelo/seleccion-modelo.md`](../01-modelo/seleccion-modelo.md).

## Comandos pendientes de registrar

Consultar los modelos instalados:

```powershell
ollama list
```

> **Pendiente:** registrar si se ejecutó este comando y conservar su salida.

## Ejecución del modelo

Comando para iniciar el modelo:

```powershell
ollama run qwen3.5:4b
```

- **Estado de ejecución:** pendiente de confirmar con evidencia de una consulta y su respuesta.
- **Fecha de las pruebas:** pendiente de registrar.
- **Resultados y evidencias:** pendientes de registrar.

No se afirma que el modelo haya funcionado correctamente hasta contar con evidencia de ejecución.

## Parámetros de generación y contexto

La salida registrada de `ollama show` muestra los siguientes valores para el modelo:

| Parámetro | Valor mostrado |
|---|---:|
| Temperature | 1 |
| Top K | 20 |
| Top P | 0.95 |
| Presence penalty | 1.5 |

Estos valores describen lo mostrado por Ollama al consultar el modelo; no confirman los valores efectivos usados durante las pruebas.

- **Parámetros efectivos utilizados:** pendiente de verificar.
- **Contexto efectivo utilizado:** pendiente de verificar.

La longitud de contexto anunciada por el modelo se especifica en [`01-modelo/seleccion-modelo.md`](../01-modelo/seleccion-modelo.md).
