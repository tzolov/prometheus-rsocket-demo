

#### Docker Env

* Build the `io.micrometer.publishing/prometheus-rsocket-proxy:0.8.0-snapshot` image locally from the `prometheus-rsocket-proxy` project:

```
./gradlew build docker 
```

* Build the `springcloud/spring-cloud-dataflow-prometheus-local:rsocket` image locally.

Change directory to `src/main/resources/docker-compose/prometheus-local` and run:

```
docker build -t springcloud/spring-cloud-dataflow-prometheus-local:rsocket .
```

* Run the docker-compose environment. 

Change directory to `src/main/resources/docker-compose/` and run:

```
docker-compose -f ./docker-compose-rsocket.yml up
```
