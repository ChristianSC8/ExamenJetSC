package pe.edu.upeu.exgame3raya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.exgame3raya.entity.Result;
import pe.edu.upeu.exgame3raya.service.ResultService;

import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultService resultService;

    @GetMapping()
    public ResponseEntity<List<Result>> list() {
        return ResponseEntity.ok().body(resultService.list());
    }

    @PostMapping()
    public ResponseEntity<Result> save(@RequestBody Result result) {
        return ResponseEntity.ok(resultService.save(result));
    }

    @PutMapping()
    public ResponseEntity<Result> update(@RequestBody Result result) {
        return ResponseEntity.ok(resultService.update(result));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(resultService.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        resultService.deleteById(id);
        return "Deleted Successfully";
    }
}
