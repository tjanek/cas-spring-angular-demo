### Generate a SSL certificate
```bash
keytool -genkey -alias cas \
 -storetype PKCS12 -keyalg RSA -keysize 2048 \
 -keystore ./etc/cas/thekeystore -validity 3650

Enter keystore password: changeit
 Re-enter new password: changeit
 What is your first and last name?
 [Unknown]: localhost
 What is the name of your organizational unit?
 [Unknown]:
 What is the name of your organization?
 [Unknown]:
 What is the name of your City or Locality?
 [Unknown]:
 What is the name of your State or Province?
 [Unknown]:
 What is the two-letter country code for this unit?
 [Unknown]:
 Is CN=Unknown, OU=Unknown, O=Unknown, L=Unknown, ST=Unknown, C=Unknown correct?
 [no]: yes
```

## Deploy

### Build projects
```bash
$ ./gradlew clean build
```

### Build docker images
```bash
$ docker build -t cas-app-api app-api/.
```
```bash
$ docker build -t cas-app-ui app-ui/.
```
```bash
$ docker pull apereo/cas:v5.3.2
```

### Run/Build
```bash
$ docker-compose up --build -d
```

### Login to application
Open web browser at `http://localhost:8080/cas/login?service=http://localhost/login`

### Enable HTTPS (optional) 
```text
server.port=8443
server.ssl.key-store=thekeystore
server.ssl.key-store-password=changeit
server.ssl.keyStoreType=PKCS12
server.ssl.keyAlias=cas
```
