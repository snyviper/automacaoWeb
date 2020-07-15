#language: pt
#encoding: UTF-8
#author: gustavo.costa
#date: 14/07/2020
#version: 1.0

Funcionalidade: Validar Login da aplicação

  @loginWeb @web
  Cenario: Realizar login na aplicação com usuário cadastrado
    Dado que clico no botao "Log in"
    E preencho os dados de login com Credentials
    Quando clico no botao Log in
    Entao visualizo o email na tela
    E deslogo
