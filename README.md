# Conversor de Moneda

Este es un proyecto en Java que permite convertir entre diferentes monedas utilizando la API de ExchangeRate. El programa consulta el tipo de cambio entre diversas monedas y permite realizar conversiones de una moneda a otra.

## Funcionalidades

- Conversión de **dólares (USD)** a **pesos argentinos (ARS)**.
- Conversión de **pesos argentinos (ARS)** a **dólares (USD)**.
- Conversión de **dólares (USD)** a **reales brasileños (BRL)**.
- Conversión de **reales brasileños (BRL)** a **dólares (USD)**.
- Conversión de **dólares (USD)** a **pesos colombianos (COP)**.
- Conversión de **pesos colombianos (COP)** a **dólares (USD)**.

El programa se comunica con una API externa para obtener los tipos de cambio más recientes.

## Requisitos

- **Java 8 o superior**.
- **Gson**: Para manejar el JSON recibido desde la API. (Se puede agregar como dependencia Maven o Gradle).
- **API Key de [ExchangeRate API](https://www.exchangerate-api.com)**: Se requiere una clave de API para acceder a los tipos de cambio más recientes.

## Instalación

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/tu-usuario/conversor-moneda.git
    ```

2. Agrega la dependencia de Gson en tu archivo `pom.xml` (para Maven):
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.8</version>
    </dependency>
    ```
    O si usas Gradle, agrégala en tu `build.gradle`:
    ```gradle
    implementation 'com.google.code.gson:gson:2.8.8'
    ```

3. Regístrate en [ExchangeRate API](https://www.exchangerate-api.com) para obtener tu clave de API.

4. Configura tu clave de API en el código (por ejemplo, como una constante o variable de entorno).

5. Ejecuta el proyecto.

## Uso

1. Ingresa la cantidad que deseas convertir.
2. Selecciona las monedas de origen y destino.
3. El programa calculará y te mostrará el valor convertido según el tipo de cambio más reciente.



