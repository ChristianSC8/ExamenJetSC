package pe.edu.upeu.exgame3raya.service;

import pe.edu.upeu.exgame3raya.entity.Result;

import java.util.List;
import java.util.Optional;

public interface ResultService {
    public List<Result> list();

    public Result save(Result result);

    public Result update(Result result);

    public Optional<Result> listById(Integer id);

    public void deleteById(Integer id);
}
