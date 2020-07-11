package br.com.bootcamp.enums;

import br.com.bootcamp.interfaces.CredentialsImp;

public enum Credentials implements CredentialsImp{
	
	CADASTRADO{
		@Override
		public String usuarioCliente() {
			return "email123@yaman.com.br";
		}

		@Override
		public String senhaCliente() {
			return "senha1234";
		}
	},

	EMAIL_INVALIDO {
		@Override
		public String usuarioCliente() {
			return "invalido@email.com";
		}

		@Override
		public String senhaCliente() {
			return "1234Teste";
		}
	}
	;

	

}
