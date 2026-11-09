package dao.daoimpl;

import java.util.List;
import java.util.Optional;
import model.Analisis;

public interface AnalisisDAO {

    public long guardar(Analisis analisis);

    public List<Analisis> listarTodos();

    public Optional<Analisis> buscarPorId(long id);

    public boolean eliminar(long id);   

}
