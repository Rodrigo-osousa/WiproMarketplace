# Wipro Marketplace
<p>Este projeto foi desenvolvido afim de estudos básicos da linguagem Java.</p>


<p>Na Wipro Marketplace podemos simular a experiência de compar produtos pré-definidos:</p>

![Screenshot_2](https://user-images.githubusercontent.com/79177544/161740644-f724434e-f15b-46ba-a512-370a543bf75f.png)


<p> Como se trata de uma lista pédefinida não podemos compar itens inexistente e nem fora de estoque:</p>

![Screenshot_5](https://user-images.githubusercontent.com/79177544/161741324-b3cec9de-efff-4c04-8ee5-31fe82e1db7e.png)

![Screenshot_3](https://user-images.githubusercontent.com/79177544/161741383-8ace6c6b-f9b5-4a22-80d7-5019f7092bf9.png)


<p> Vemos no trecho do código abaixo que não permite a compra de produtos sem estoque:</p>

```  
while (quantityOfProducties > quantity[productCode - 1]) {
                System.out.println("Insuficient producties!");
                quantityOfProducties = read.nextInt();
    }
```

<p> Após concluir a adição de um produto ao carrinho a lista de produtos reaparece com a quantidade de produtos disponíveis:</p>

![Screenshot_2](https://user-images.githubusercontent.com/79177544/161742279-e7d93b28-8201-4a61-ac43-8073468785be.png)

<p> Agora com  o carrinho cheio podemos revisar nossos itens e o total de todos os produtos:</p>

![Screenshot_6](https://user-images.githubusercontent.com/79177544/161742014-af2439c4-1a7a-4af2-9254-aed9bc117df0.png)

<p> No próximo passo definimos o método de pagamento, e dependendo da forma selecionada teremos um desconto :smiley: :</p>

![Screenshot_9](https://user-images.githubusercontent.com/79177544/161742859-52dc4e76-e226-4441-afd7-177f2fb6cc20.png)

<p> Por fim temos a nossa nota fiscal com os detalhes da compra:</p>

![Screenshot_8](https://user-images.githubusercontent.com/79177544/161743130-cec2ef4b-a6e4-4047-9b0c-4cbc236ef8ad.png)

**Considerações Finais:**

<p> A proposta foi aplicar apenas o básico do Java em equipe, sendo assim não se utiliza conceitos de microservices, framework, etc...</p>
