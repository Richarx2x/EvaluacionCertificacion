package cl.richard.pruebacertificacion.web.controller;

import cl.richard.pruebacertificacion.model.domain.dto.DishDTO;
import cl.richard.pruebacertificacion.web.service.DishService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dish")
public class DishRestController {

    private final DishService service;

    public DishRestController(DishService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DishDTO>> findAll(){
        return service.findAll()
                .map(dish -> new ResponseEntity<>(dish, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{dishId}")
    public ResponseEntity<DishDTO> findById(@PathVariable int dishId){
        return service.findById(dishId)
                .map(dish -> new ResponseEntity<>(dish, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/create")
    public ResponseEntity<DishDTO> create(@RequestBody DishDTO dishDTO){
        return service.create(dishDTO)
                .map(dish-> new ResponseEntity<>(dish, HttpStatus.CREATED))
                .orElse(new ResponseEntity<>(HttpStatus.CONFLICT));
    }

    @PatchMapping("/update")
    public ResponseEntity<DishDTO> update(@RequestBody DishDTO dishDTO){
        return service.update(dishDTO)
                .map(dish -> new ResponseEntity<>(dish, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/delete/{dishId}")
    public ResponseEntity<Boolean> delete(@PathVariable int dishId){
        return new ResponseEntity<Boolean>(service.delete(dishId), HttpStatus.OK);
    }

}
