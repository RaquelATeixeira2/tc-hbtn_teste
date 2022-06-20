import org.junit.jupiter.api.*;

public class TesteEmail {

    @Test
    public void testar_email_com_arroba() {
        assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba() {
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        assertEquals(Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br"), false);
    }
}