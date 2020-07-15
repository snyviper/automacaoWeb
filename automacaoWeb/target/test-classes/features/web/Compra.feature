#language: pt
#encoding: UTF-8
#author: gustavo.costa
#date: 14/07/2020
#version: 1.0

  Funcionalidade: Realizar uma compra no site

    @cadastroCompraWeb @web
    Cenario: Realizar a compra do primeiro item da home page
      Dado que clico no botao "Register"
      Quando realizo o cadastro do cliente
      E volto para a home page
      E adiciono os itens
      E clico em Go to cart
      E verifico se o subtotal esta correto
      E aceito os termos de servico e faco checkout
      E preencho o endereco e continuo
      E testo o pick up in store e continuo
      E testo o shipping method e continuo
      E testo o payment method e continuo
      E preencho o payment information e continuo
      E verifico o endereco e o metodo de pagamento e o metodo de entrega
      E verifico os produtos
      Entao clico em Continue para confirmar o pedido
      E visualizo a mensagem "Your order has been successfully processed!"