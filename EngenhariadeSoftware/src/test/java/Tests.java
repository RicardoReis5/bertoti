import org.example.Aluguel;
import org.example.Casa;
import org.example.Endereco;
import org.example.Imovel;
import org.example.Inquilino;
import org.example.Proprietario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testAluguel() {

        String contrato = "123ABC";
        Double valorAluguel = 1000.0;
        Inquilino inquilino = new Inquilino("John Doe", "12314325-45");
        Casa casa = new Casa("123 Main St",123144.44, true);

        Aluguel aluguel = new Aluguel(contrato, valorAluguel, inquilino, casa);

        assertEquals(contrato, aluguel.getContrato());
        assertEquals(valorAluguel, aluguel.getValorAluguel());
    }
    @Test
    public void testGetSetLocal() {
        Casa casa = new Casa("City", 100000.0, false);
        assertEquals("City", casa.getLocal());

        casa.setLocal("Town");
        assertEquals("Town", casa.getLocal());
    }

    @Test
    public void testGetSetValorCasa() {
        Casa casa = new Casa("City", 100000.0, false);
        assertEquals(100000.0, casa.getValorCasa(), 0.001);

        casa.setValor(150000.0);
        assertEquals(150000.0, casa.getValorCasa(), 0.001);
    }

    @Test
    public void testGetSetIsOcupado() {
        Casa casa = new Casa("City", 100000.0, false);
        assertFalse(casa.getIsocupado());

        casa.setIsocupado(true);
        assertTrue(casa.getIsocupado());
    }
    @Test
    public void testEndereco() {

        String rua = "123 Main Street";
        String cidade = "Cityville";
        String estado = "Stateville";

        Endereco endereco = new Endereco(rua, cidade, estado);

        assertEquals(rua, endereco.getRua());
        assertEquals(cidade, endereco.getCidade());
        assertEquals(estado, endereco.getEstado());
    }

    @Test
    public void testSetRua() {

        Endereco endereco = new Endereco("Old Street", "Old City", "Old State");

        endereco.setRua("New Street");

        assertEquals("New Street", endereco.getRua());
    }

    @Test
    public void testSetCidade() {

        Endereco endereco = new Endereco("Some Street", "Old City", "Old State");

        endereco.setCidade("New City");

        assertEquals("New City", endereco.getCidade());
    }

    @Test
    public void testSetEstado() {

        Endereco endereco = new Endereco("Another Street", "Another City", "Old State");

        endereco.setEstado("New State");

        assertEquals("New State", endereco.getEstado());
    }
    @Test
    public void testImovel() {
        Imovel imovel = new Imovel("Casa", 100.0, "123 Main St");

        assertEquals("Casa", imovel.getTipo());
        assertEquals(100.0, imovel.getArea(), 0.001);
    }

    @Test
    public void testSetTipo() {
        Imovel imovel = new Imovel("Apartamento", 80.0, "456 Oak St");

        imovel.setTipo("Casa");

        assertEquals("Casa", imovel.getTipo());
    }

    @Test
    public void testSetArea() {
        Imovel imovel = new Imovel("Apartamento", 80.0, "456 Oak St");

        imovel.setArea(120.0);

        assertEquals(120.0, imovel.getArea(), 0.001);
    }
    @Test
    public void testGetNomeInquilino() {
        Inquilino inquilino = new Inquilino("John Doe", "123456789");

        assertEquals("John Doe", inquilino.getNome());
    }

    @Test
    public void testSetNomeInquilino() {
        Inquilino inquilino = new Inquilino("John Doe", "123456789");

        inquilino.setNome("Jane Doe");

        assertEquals("Jane Doe", inquilino.getNome());
    }

    @Test
    public void testGetCpfInquilino() {
        Inquilino inquilino = new Inquilino("John Doe", "123456789");

        assertEquals("123456789", inquilino.getCpf());
    }

    @Test
    public void testSetCpfInquilino() {
        Inquilino inquilino = new Inquilino("John Doe", "123456789");

        inquilino.setCpf("987654321");

        assertEquals("987654321", inquilino.getCpf());
    }
    @Test
    public void testProprietario() {
        Proprietario proprietario = new Proprietario("John Doe", "12345678900");

        assertEquals("John Doe", proprietario.getNome());
        assertEquals("12345678900", proprietario.getCpf());
    }

    @Test
    public void testSetNomeProprietario() {
        Proprietario proprietario = new Proprietario("John Doe", "12345678900");

        proprietario.setNome("Jane Doe");

        assertEquals("Jane Doe", proprietario.getNome());
    }

    @Test
    public void testSetCpfProprietario() {
        Proprietario proprietario = new Proprietario("John Doe", "12345678900");

        proprietario.setCpf("98765432100");

        assertEquals("98765432100", proprietario.getCpf());
    }
}