package Testes;

import org.junit.Test;

import Massa.Massa;
import Recursos.Metodos;


public class RunnerTest {
	Metodos metodo = new Metodos();
	
	@Test
	public void teste() {
		metodo.Create_User(Massa.Body(), Massa.Uri());
		
		metodo.UpdateUser(Massa.BodyUpdate(), Massa.Uri(), Metodos.GetId());
		
		metodo.PatchUser(Massa.BodyPatch(), Massa.Uri(), Metodos.GetId());
		
		metodo.DeleteUser(Massa.Uri(), Metodos.GetId());
	}

}
