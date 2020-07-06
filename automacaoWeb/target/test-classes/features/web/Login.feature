#language: pt
#enconding: UTF-8
#author: mizael.bragatti
#date: 03/07/2020
#version: 1.0
Funcionalidade: Validar Login da aplicacao
	
	@login @web
  Cenario: Realizar login na aplicacao com usuario cadastrado
    Dado que clico no botao "Entre ou Cadastre-se"
    Dado preencho os dados de login com usuario "cadastrado"
    Quando clico em "Continuar"
    Entao visualizo a tela inicial com meu usuario logado
