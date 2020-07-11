#language: pt
#encoding: UTF-8
#author: marcos.barbosa
#date: 08/07/2020
#version: 1.0

  Funcionalidade: Realizar cadastro no site

    @web @cadastro
    Cenario: Realizar o cadastro com sucesso de um cliente válido
      Dado que clico no botao "Register"
      Quando realizo o cadastro do cliente
      Entao visualizo a mensagem "Your registration completed" na tela