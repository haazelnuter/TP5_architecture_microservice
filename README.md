# TP5_architecture_microservice
Customer service :
1/Get all customers en utilisant: http://localhost:8081/customers

![1](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/e42582dc-e622-4283-9c2b-69b59e046854)

2/Consultation de la base de donnees : customer-db

![2](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/d00b88dc-ab82-4f58-87dd-b2b78b20d94c)
**
inventory service :
1/ get all products :

![3](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/66344e2f-2762-4623-b30b-ae6bd213451f)

2/Consultation de la base de donnees :
![4](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/4020d8ef-cc15-422f-9ec7-6e97fad853f3)

************
Accéder a tous les microservices avec une seule Gateway 
1/Accéder au microservice Customer :
![5](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/9d71f9a6-3bae-4d8f-85e8-78badd345770)
2/Accéder au microservice Products :
![6](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/568b5178-3715-461c-8e0d-3d30a84199d7)

**************
Sans Gateway, implementation java : 
Donne les memes resultat, voici le version static lorsque les @ fixent: 
![7](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/d1064763-528a-4274-a693-2a1e39caf67f)
version dynamic lorsque les @ se changent : 
![8](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/e066577a-ac34-4728-b75e-7f7234f989cb)




