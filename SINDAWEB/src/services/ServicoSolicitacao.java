package services;

import java.util.ArrayList;

import model.Formulario;
import exceptions.DaoException;

public class ServicoSolicitacao implements IServicoSolicitacao {

    private static ServicoSolicitacao singleton = null;

//    private IdaoSolicitacao daoSolicitacao;

    public ServicoSolicitacao() {
//            this.daoSolicitacao = new DaoEmMemoria();
    }

    public static IServicoSolicitacao getInstance() {

            if (singleton == null) {
                    singleton = new ServicoSolicitacao();
            }

            return singleton;

    }

    public ArrayList<Formulario> getSolicitacoes()
    {
//            return daoSolicitacao.getSolicitacoes();
    	return null;
    }
    
    @Override
    public void cadastrarFormulario(Formulario Formulario) {
//            try {
//                    this.daoSolicitacao.cadastrarFormulario(Formulario);
//            } catch (DaoException e) {
//                    
//            }
    }

    @Override
    public ArrayList<Formulario> buscarFormulario(String query) throws DaoException {
//            return daoSolicitacao.buscarEngajador(query);       
    	return null;
    }


    @Override
    public Formulario autenticar(String login, String senha)
    {
//            return daoSolicitacao.autenticar(login, senha);
    	return null;
    }

	@Override
	public void cadastrarSolicitacao(Formulario formulario) {
		// TODO Auto-generated method stub
		
	}
}