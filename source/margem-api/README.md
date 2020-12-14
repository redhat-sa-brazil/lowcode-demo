# consignado project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `consignado-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/consignado-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/consignado-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## OCP Deployment

```
mvn package -DskipTests -Dquarkus.kubernetes.deploy=true -Dquarkus.kubernetes-client.trust-certs=true -Dquarkus.openshift.expose=true
```

## OpenAPI

```
---
openapi: 3.0.3
info:
  title: Margem API
  description: Margem API
  termsOfService: Your terms here
  contact:
    name: Margem API Support
    url: http://exampleurl.com/contact
    email: techsupport@example.com
  license:
    name: Apache 2.0
    url: http://www.apache.org/licenses/LICENSE-2.0.html
  version: 1.0.0
paths:
  /margens/operadora/{operadora}/cpf/{cpf}:
    get:
      parameters:
      - name: cpf
        in: path
        required: true
        schema:
          format: int32
          type: integer
      - name: operadora
        in: path
        required: true
        schema:
          type: string
      responses:
        "200":
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Margem'
components:
  schemas:
    Margem:
      type: object
      properties:
        cpf:
          format: int32
          type: integer
        margem:
          format: int32
          type: integer
        name:
          type: string
        operadora:
          type: string

```