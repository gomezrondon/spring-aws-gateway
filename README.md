# spring-aws-gateway
AWS Lambda + AWS Gateway API with Spring boot generating a thin Jar

To run the application simply do:

```bash
./gradlew clean build -x Test
```

this will generate a jar on only ~12KB

to quick test the function

```
curl http://localhost:8080/reverseString/{message}
```