# Indigital

_Servicio que expone 3 endpoints. Uno para dar de alta a un cliente, otro para consultar el promedio de edad y la desviación estándar entre las edades de todos los clientes, y el último lista todos los clientes con todos sus datos mas la fecha probable de muerte._

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para pruebas._

### Pre-requisitos 📋

_Herramientas necesarias para correr la aplicación_

```
git version 2.24.3
Apache Maven 3.6.3
java 11.0.10 2021-01-19 LTS (JDK 11)
```

### Construcción 🔧

+ Abrir una terminal y realizar los siguiente pasos.

```
git clone https://github.com/gustavo-9189/indigital.git
cd indigital
mvn clean package
```
+ _mvn clean package_ construirá la aplicación y ejecutará los tests unitarios.

### Correr la aplicación (local) ⚙️

_Desde una terminal, dentro del directorio del proyecto. Realizar los siguientes pasos_

```
mvn spring-boot:run
```
+ Para saber el estado de salud de la aplicación, ir a: http://localhost:8080/actuator/health
+ Para probar la aplicación local, ir a: http://localhost:8080/swagger-ui.html#/customer-controller

## Despliegue (producción) 📦

_La plataforma cloud en donde estará desplegada la aplicacion es: [Heroku](https://www.heroku.com/home)_
+ Para poder realizar el despliegue deberá tener acceso al proyecto heroku: [gmartinez](https://dashboard.heroku.com/apps/gmartinez)
+ Dentro de la pestaña _Deploy_, elegir la opción _Deployment method_ **GitHub**
+ Conectar el proyecto heroku al reposiorio github

![deployTag](./docs/images/deployTag.png)

+ En _Manual deploy_ eligir el branch, con el codigo fuente a desplegar. Y hacer click en el boton **Deploy Branch**

![deployButton](./docs/images/deployButton.png)

+ Para saber el estado de salud de la aplicación, ir a: https://gmartinez.herokuapp.com/actuator/health
+ Para probar la aplicación desplegada, ir a: https://gmartinez.herokuapp.com/swagger-ui.html#/customer-controller

### Pruebas con Insomnia REST
_Insomnia es un cliente REST, con el cual se podran realizar pruebas a la API desplegada_
+ Descargarse la herramienta desde https://insomnia.rest/download
+ Instalarla e importar el archivo json [Insomnia_Indigital.json](./docs/Insomnia_Indigital.json)
+ Ir a Preferences -> Data -> Import Data

![insomnia](./docs/images/insomnia.png)

+ Desde esta herramienta podrá probar la aplicación, eligiendo entre el ambiente **local** y el ambiente **heroku-prod**

## Autor ✒️

* **Gustavo Martínez** - [gustavo-9189](https://github.com/gustavo-9189)