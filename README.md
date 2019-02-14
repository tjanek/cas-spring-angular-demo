### Generate a SSL certificate
```bash
keytool -genkey -alias cas \
 -storetype PKCS12 -keyalg RSA -keysize 2048 \
 -keystore keystore.p12 -validity 3650

Enter keystore password:
 Re-enter new password:
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
### Enable HTTPS 
```text
server.port=8443
server.ssl.key-store=keystore.p12
server.ssl.key-store-password=pass
server.ssl.keyStoreType=PKCS12
server.ssl.keyAlias=cas
```
