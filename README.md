# TP5_architecture_microservice
# TP5_architecture_micro_service
Customer service :
1/Get all customers en utilisant: http://localhost:8081/customers

![1](https://github.com/haazelnuter/TP5_architecture_microservice/assets/96618018/e42582dc-e622-4283-9c2b-69b59e046854)

2/Consultation de la base de donnees : customer-db
![2](https://github.com/haazelnuter/TP5_architecture_micro_service/assets/96618018/1d156a25-0fdc-47ab-b98a-f6aa5cbdb322)
**
inventory service :
1/ get all products :
![3](https://github.com/haazelnuter/TP5_architecture_micro_service/assets/96618018/3fa2a421-9922-46f8-ae74-409987382516)
2/Consultation de la base de donnees :
![4](https://github.com/haazelnuter/TP5_architecture_micro_service/assets/96618018/8b4c497d-ebce-48a0-9775-d71d316d502f)
************
Accéder a tous les microservices avec une seule Gateway 
1/Accéder au microservice Customer :
![5](https://github.com/haazelnuter/TP5_architecture_micro_service/assets/96618018/83fd364b-609b-429c-95f7-a66e4bf9b99e)
2/Accéder au microservice Products :
![6](https://github.com/haazelnuter/TP5_architecture_micro_service/assets/96618018/d8d234e0-568a-4e8d-8bfa-7737b5881a7c)
**************
Sans Gateway, implementation java : 
Donne les memes resultat, voici le version static lorsque les @ fix: 
![7](https://github.com/haazelnuter/TP5_architecture_micro_service/assets/96618018/2f9a8bdb-d6f4-4780-a44e-69646cfa74bc)
version dynamic lorsque les @ se change : 
![8](https://github.com/haazelnuter/TP5_architecture_micro_service/assets/96618018/bd556403-5b32-4bca-8fbd-614d1f2b69f5)


