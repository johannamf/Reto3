# Reto3
Pasos para desplegar cambios:

1. Realizar el cambio en el codigo local.
2. Desde el folder raiz del proyecto Hacer comandos :
   - git add . 
   - git commit -m "Comentario" 
   - git push origin 
4. Luego debes logearte en el terminal de la maquina virtual ( asumiendo que esta corriendo )
   - Desde el folder llavesReto3, Correr comando:
   - ssh -i ssh-key-2023-05-22.key opc@144.22.169.150
   - Se asume que en este folder ya existe una llave ssh.
   - Para generar las laves debe ir a la consola de oracle y bajarlas.
   - La direccion IP 144.22.169.150  para la instancia en el oracle server de Johana Mora.
5. Una vez een la terminal del servidor externo correr los siguientes comandos
   - cd Reto3
   - git pull
6. En este punto se debe re-compilar el proyecto usando
   - mvn clean package -DskipTests
   - java -jar target/Reto3-0.0.1-SNAPSHOT.jar
