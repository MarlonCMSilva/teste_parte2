import dao.ContratoDao;
import dao.IContratoDao;
import dao.mocks.ContratoDaoMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;


public class ContratoServiceTeste {

    @Test
    public void salvarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service =  new ContratoService(dao);

       String retorno =  service.salvar();
        Assert.assertEquals("Salvo Com Sucesso",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoSalvarComBancoDeDadosTeste(){

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno =  service.salvar();
        Assert.assertEquals("Salvo Com Sucesso",retorno);
    }

    @Test
    public void buscarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service =  new ContratoService(dao);

        String retorno =  service.buscar();
        Assert.assertEquals("buscar",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoBuscarComBancoDeDadosTeste(){

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno =  service.buscar();
        Assert.assertEquals("buscar",retorno);
    }

    @Test
    public void excluirTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service =  new ContratoService(dao);

        String retorno =  service.excluir();
        Assert.assertEquals("Excluir",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoExcluirComBancoDeDadosTeste(){

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno =  service.excluir();
        Assert.assertEquals("Excluir",retorno);
    }

    @Test
    public void atualizarTeste(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service =  new ContratoService(dao);

        String retorno =  service.atualizar();
        Assert.assertEquals("Atualizar",retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroAoAtualizarComBancoDeDadosTeste(){

        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);

        String retorno =  service.atualizar();
        Assert.assertEquals("Excluir",retorno);
    }


}
