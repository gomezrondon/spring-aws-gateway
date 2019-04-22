# spring-aws-gateway
AWS Lambda + AWS Gateway API with Spring boot 

To run the application simply do:

```bash
./gradlew clean build -x Test
```

to quick test the function

```
curl http://localhost:8080/reverseString/{message}
```

