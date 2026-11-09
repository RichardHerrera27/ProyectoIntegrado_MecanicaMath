package dao.daoimpl;

import java.util.Optional;
import model.ResultadoAnalisis;

public interface ResultadosDAO {

    public long guardar(ResultadoAnalisis resultadoAnalisis);

    public Optional<ResultadoAnalisis> buscarPorId(long id);

}
