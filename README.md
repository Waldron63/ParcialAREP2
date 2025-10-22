# Parcial segundo corte de ARSW
## Santiago Gualdron Rincon
## Video de muestra

https://drive.google.com/file/d/16tcF_7097aKqQ_F1ms6egfzGH1NOaBR7/view?usp=drivesdk

## Instalacion
para instalar el proyecto, es necesario git, maven, java 17.
```sh
  git clone https://github.com/Waldron63/ParcialAREP2.git
  cd ParcialAREP2/catalan
```
dentro de catalan esta la logica del proyecto, para correrlo es necesario
```sh
  mvn clean verify
  mvn spring-boot:run
```
con esto, en el puerto 8080 libre podremos correr la aplicacion.

<img width="1836" height="743" alt="image" src="https://github.com/user-attachments/assets/9baaee94-70aa-46eb-8407-b448097efc3e" />

haciendo pruebas locales en postman con "http://localhost:8080/catalan?value=10":

<img width="863" height="636" alt="image" src="https://github.com/user-attachments/assets/270d8093-e9e8-41c1-b594-7d62f8f09fe4" />

## AWS
se generaron las 3 instancias iguales:

<img width="1626" height="132" alt="image" src="https://github.com/user-attachments/assets/db76173e-df6b-45f5-9422-d945729d6325" />

en las cuales, cada una se utilizaron los comandos (una vez conectadas a cada instancia):
```sh
  sudo yum install java-17-amazon-corretto git maven
  java --version
  git clone https://github.com/Waldron63/ParcialAREP2.git
  cd ParcialAREP2/...
  mvn clean verify
  mvn spring-boot:run
```
reglas de cada instancia para seguridad:

<img width="1592" height="120" alt="image" src="https://github.com/user-attachments/assets/e3366074-5e53-486e-af1e-12abfc7aab02" />

instalacion del repo en cada instancia y comando verify:

<img width="1919" height="1025" alt="image" src="https://github.com/user-attachments/assets/d6315617-fe8d-418d-b906-8bbb82515ee9" />

### Pruebas en postman para cada instancia:
#### catalan 1
"ec2-98-93-53-43.compute-1.amazonaws.com" con IP "98.93.53.43":

<img width="852" height="626" alt="image" src="https://github.com/user-attachments/assets/f010c902-57e2-4244-9c35-74bc954f63fd" />

#### catalan 2
"ec2-3-90-113-72.compute-1.amazonaws.com" con IP "3.90.113.72":

<img width="847" height="602" alt="image" src="https://github.com/user-attachments/assets/b42ef0e2-75fe-49d1-a9b7-06134919a688" />

#### Proxy
"ec2-54-234-18-233.compute-1.amazonaws.com" con IP "54.234.18.233":

<img width="854" height="418" alt="image" src="https://github.com/user-attachments/assets/11902ed5-c8c8-4dc5-bb85-277cb655c23a" />

## Pruebas de aceptacion con front
### local

<img width="523" height="286" alt="image" src="https://github.com/user-attachments/assets/06df546f-8fc0-4c65-ab0e-be495a1fa9f9" />

### aws proxy

<img width="558" height="282" alt="image" src="https://github.com/user-attachments/assets/1edd256e-4006-4d18-8d91-8c9f59b766ef" />

### funcionamiento completo

catalan 1

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/459d537b-784a-4dff-b1df-bb4ec131a426" />

catalan 2

<img width="1919" height="1016" alt="image" src="https://github.com/user-attachments/assets/c5c00c89-8a79-40c6-bfb3-37700632d482" />
