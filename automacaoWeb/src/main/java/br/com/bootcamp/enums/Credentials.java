package br.com.bootcamp.enums;

import br.com.bootcamp.interfaces.CredentialsImp;

public enum Credentials implements CredentialsImp{
	
	CADASTRADO{
		@Override
		public String usuario() {
			return "email123@yaman.com.br";
		}

		@Override
		public String senha() {
			return "senha1234";
		}
	}
	;

	

}
