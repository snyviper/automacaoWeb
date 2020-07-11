#language: pt
#enconding: UTF-8
#author: marcos.barbosa
#date: 03/07/2020
#version: 1.0

Funcionalidade: Validar Login da aplicação

  @login @web13
  Cenario: Realizar login na aplicação com usuário cadastrado
    Dado que clico no botao "Entre ou Cadastre-se"
    E preencho os dados de login com usuário "cadastrado"
    Quando clico em "Continuar"
    Entao visualizo a tela inicial com meu usuario logado
