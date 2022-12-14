# 

## Model
www.msaez.io/#/storming/B9uQPTdu5XOzlajMoUvUuxH3ZHz1/e81b1d2f0e815e33df24b29e073b4e1a

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic 
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- app
- pay
- store
- customer


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- app
```
 http :8088/주문 id="id" 품목="품목" 수량="수량" 
 http :8088/orders orderid="orderid" foodid="foodid" qty="qty" status="status" customerid="customerid" address="address" 
```
- pay
```
 http :8088/결제이력 id="id" orderId="orderId" 금액="금액" 
 http :8088/payments payid="payid" orderId="orderId" status="status" payoption="payoption" 
```
- store
```
 http :8088/주문관리 id="id" 
 http :8088/ordermanagements storeid="storeid" orderid="orderid" status="status" customerid="customerid" address="address" 
```
- customer
```
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

