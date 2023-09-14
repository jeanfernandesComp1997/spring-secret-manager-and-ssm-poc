## Spring AWS secretsmanager and parameterstore poc

- Secret name on AWS example: /secret/demo-aws-secrets
- Parameter name on AWS example: /config/demo-aws-secrets/application.baseUri

AWS Load variables on /src/main/resourcers/bootstrap.yml

For running without bootstrap use:
```-Dspring.profiles.active=dev```