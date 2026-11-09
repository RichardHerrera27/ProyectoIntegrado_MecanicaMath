package dao.daoimpl;

import java.util.List;
import model.PuntoCritico;

public interface PuntoCriticoDAO {

    public void guardarTodos(List<PuntoCritico> puntoCriticos);

    public List<PuntoCritico> listarPorAnalisis(long id);
}
