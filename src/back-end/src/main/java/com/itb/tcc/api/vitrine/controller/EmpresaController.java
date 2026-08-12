package com.itb.tcc.api.vitrine.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itb.tcc.api.vitrine.model.entity.Empresas;
import com.itb.tcc.api.vitrine.model.services.EmpresasService;

@RestController
@RequestMapping("/api/v1/empresas")

public class EmpresaController {

    private EmpresasService empresasService = new EmpresasService();


  @GetMapping
  public ResponseEntity<List<Empresas>> findAll() {
    return ResponseEntity.ok(empresasService.listarEmpresas());
  }


  @GetMapping("/{id}")
  public ResponseEntity<?> findById(@PathVariable String id) {
    try {
      Long idLong = Long.parseLong(id);
      Empresas empresas = empresasService.buscarPorId(idLong);

      if (empresas == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empresa com o id" + id + "não encontrada");
      }

      return ResponseEntity.ok(empresas);

    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(id + "Inválido, utilize um valor numérico");
    }

  }


  @PostMapping
  public ResponseEntity<Empresas> save(@RequestBody Empresas empresas) {
    return ResponseEntity.status (HttpStatus.CREATED).body (empresasService.salvar(empresas));
  }


  @PutMapping("/{id}")
  public ResponseEntity<?> update (@PathVariable String id, @RequestBody Empresas empresas) {
 
  
   try {
    Long idLong = Long.parseLong(id);
      Empresas empresasBanco = empresasService.buscarPorId(idLong);
      if(empresasBanco == null) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empresa com o id " + id + " nao encontrada");
      }
     Empresas empresasAtualizada = empresasService.atualizar(idLong, empresas);
     return ResponseEntity.ok(empresasAtualizada);
 
 
   } catch (Exception e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(id + "invalido, utilize um valor numerico.");
   }
 
 
  }
  

  @DeleteMapping("/{id}")
  public ResponseEntity <?> delete(@PathVariable String id) {
   try {
    Long idLong = Long.parseLong(id);
    Empresas empresasBanco = empresasService.buscarPorId(idLong);
    if(empresasBanco == null){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empresa com o id"+ id +"não encontrada");
    }
     boolean excluido = empresasService.excluir(idLong);
     if (excluido) {
      return ResponseEntity.ok("Empresa com o id"+ id +"excluida com sucesso.");
     }else{
      return ResponseEntity.ok("Nao foi possivel excluir a empresa com o id "+ id);
     }
      
   } catch (Exception e) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(id + "invalido, utilize um fvalor numerico");
   }
  }

}
    

