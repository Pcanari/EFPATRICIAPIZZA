package EFPATRICIACA�ARI.Service;

import java.util.List;

import EFPATRICIACA�ARI.Model.Pizzeria;



public interface PizzeriaService {
	

	List<Pizzeria> listar();
	Pizzeria ObtenerId(Integer id);	
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
	
	void asignarPizzaAPizzeria();

}
