package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;

import Model.Userposjava;
import dao.UserPosDAO;

public class TesteBancoJdbc{

	@Test
	public void intBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("João");
		userposjava.setEmail("joão@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}
}
