#language: pt
#encoding: UTF-8
#author: gustavo.costa
#date: 14/07/2020
#version: 1.0

  Funcionalidade: Realizar cadastro no site

    @cadastroWeb @web
    Cenario: Realizar o cadastro com sucesso de um cliente válido
      Dado que clico no botao "Register"
      Quando realizo o cadastro do cliente
      Entao visualizo a mensagem "Your registration completed" na tela
      E deslogo