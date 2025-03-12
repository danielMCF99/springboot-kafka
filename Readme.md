# How to Test the Application

## Step 1: Launch Zookeeper
Run the following command inside the kafka directory to start Zookeeper:
```cmd
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```

## Step 2: Launch Kafka Server
Run the following command inside the kafka directory to start the Kafka server:
```cmd
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

## (OPTIONAL) Launch Kafka Local Listener
Run the following command inside the kafka directory to start the Kafka server:
```cmd
.\bin\windows\kafka-console-consumer.bat --topic example --from-beginning --bootstrap-server localhost:9092
```