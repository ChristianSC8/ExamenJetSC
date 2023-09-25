package pe.edu.upeu.exgame3raya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.exgame3raya.entity.Result;
import pe.edu.upeu.exgame3raya.repository.ResultRepository;
import pe.edu.upeu.exgame3raya.service.ResultService;

import java.util.List;
import java.util.Optional;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultRepository resultRepository;

    @Override
    public List<Result> list() {
        return resultRepository.findAll();
    }

    @Override
    public Result save(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public Result update(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public Optional<Result> listById(Integer id) {
        return resultRepository.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        resultRepository.deleteById(id);
    }
}
