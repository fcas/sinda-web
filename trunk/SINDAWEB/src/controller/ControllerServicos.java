package controller;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import exceptions.DaoException;
import model.Solicitacao;
import model.IServicoUsuario;
import model.ServicoUsuario;

@SessionScoped
@ManagedBean(name="controllerServicos")
public class ControllerServicos {

	private Solicitacao solicitacao;
	private ArrayList<Solicitacao> usuarios;
	private ArrayList<Boolean> del;
	private boolean buscou = false;
	private String query;
	IServicoUsuario servicoUsuario = ServicoUsuario
			.getInstance();
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void iniciarDel(int tam)
	{
		del = new ArrayList();
		for (int i = 0; i < tam; i++)
			del.add(false);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ControllerServicos() {
		solicitacao = new Solicitacao();
		usuarios = new ArrayList();
	}
	
	@SuppressWarnings("unchecked")
	public String editar(){
		usuarios = (ArrayList<Solicitacao>) servicoUsuario.getUsers();
		iniciarDel(usuarios.size());
		return "Editar";
	}

	public String cadastrarSolicitacao() {

		String action = "";

		try {
				servicoUsuario.cadastrarSolicitacao(solicitacao);
				action = "sucesso";
		} catch (DaoException e) {
			action = "erro";
			System.out.println(e);
		}

		return action;

	}
	
	public String deletar() {
		
		try {
			for (int i = 0; i < usuarios.size(); i++)
			{
				if (usuarios.get(i).isSelecionado())
					usuarios.remove(i);
			}
			return "sucesso";
		}
		catch (Exception e)
		{
			return "erro";
		}
		
	}
	@SuppressWarnings("unchecked")
	public String visualizar()
	{
		usuarios = (ArrayList<Solicitacao>) servicoUsuario.getUsers();
		iniciarDel(usuarios.size());
		return "Visualizar";
	}
	
	public String manterUsuario()
	{
		return "manterUsuario";
	}
	
	public String cadastrar()
	{
		return "Cadastrar";
	}
	
	
	public String atualizar()
	{
		servicoUsuario.saveUsers(usuarios);
		return "sucesso";
	}
	
	public String buscar()
	{
		return "Buscar";
	}
	
	public String buscarPorPais()
	{
		buscou = false;
		query = "";
		return "BuscarPorPais";
	}
	
	public String buscarPorNome() {
		buscou = false;
		query = "";
		return "BuscarPorNome";
	}
	
	public String buscarsolicitacaoPorNome() {

		String action = "";
		try {
			usuarios = servicoUsuario.buscarEngajador(query);
			iniciarDel(usuarios.size());
			buscou = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}
	
	public String buscarsolicitacaoPorPais() {

		String action = "";
		try {
			usuarios = servicoUsuario.buscarEngajadorPorPais(query);
			iniciarDel(usuarios.size());
			buscou = true;
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}

	public Solicitacao getsolicitacao() {
		return solicitacao;
	}

	public void setsolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}

	public ArrayList<Solicitacao> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Solicitacao> usuarios) {
		this.usuarios = usuarios;
	}

	public boolean isBuscou() {
		return buscou;
	}

	public void setBuscou(boolean buscou) {
		this.buscou = buscou;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
