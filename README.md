# Wipro Marketplace
<p>Este projeto foi desenvolvido afim de estudos básicos da linguagem Java.</p>


<p>Na Wipro Marketplace podemos simular a experiência de compar produtos pré-definidos:</p>

<p> Como se trata de uma lista pédefinida não podemos compar itens inexistente:</p>

<p> Vemos no trecho do código abaixo que não permite a compra de produtos sem estoque:</p>

```  
while (quantityOfProducties > quantity[productCode - 1]) {
                System.out.println("Insuficient producties!");
                quantityOfProducties = read.nextInt();
    }
```

<p> Após concluir a adição de um produto ao carrinho a lista de produtos reaparece com a quantidade de produtos disponíveis:</p>


<p> Agora com  o carrinho cheio podemos revisar nosso carrinho e o total de todos os produtos:</p>

<p> No próximo passo definimos o método de pagamento, e dependendo da forma selecionada teremos um desconto :smiley: :</p>


<p> Por fim temos a nossa nota fiscal com os detalhes da compra:</p>

**Considerações Finais:**

<p> A proposta foi aplicar apenas o básico do Java, sendo assim não se utiliza conceitos de microservices, framework, etc...</p>