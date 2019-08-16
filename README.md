

#### Docker Env

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

* Run the Demo application

Run the Java main for `PrometheusRsocketDemoApplication` in the IDE or with `java -jar target/prometheus-rsocket-demo-0.0.1-SNAPSHOT` on the built project from the project root directory.
