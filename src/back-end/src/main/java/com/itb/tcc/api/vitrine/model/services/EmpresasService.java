package com.itb.tcc.api.vitrine.model.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.itb.tcc.api.vitrine.model.entity.Empresas;

public class EmpresasService {
    private static List<Empresas> empresas = new ArrayList<>();

    static {
       
        Empresas empresa1 = new Empresas();
        empresa1.setId(1L);
        empresa1.setNomeEmpresa("Empresa A");
        empresa1.setCnpj("12.345.678/0001-90");
        empresa1.setEmail("empresaA@example.com");
        empresa1.setSenha("senha123");
        empresa1.setNicho("Tecnologia");
        empresa1.setLogradouro("Rua A, 123");
        empresa1.setCep("12345-678");
        empresa1.setBairro("Bairro A");
        empresa1.setCidade("Cidade A");
        empresa1.setCodStatus(true);
        empresa1.setTipoUsuario("EMPRESA");
        empresas.add(empresa1);

        Empresas empresa2 = new Empresas();
        empresa2.setId(2L);
        empresa2.setNomeEmpresa("Empresa B");
        empresa2.setCnpj("98.765.432/0001-12");
        empresa2.setEmail("empresaB@example.com");
        empresa2.setSenha("senha456");
        empresa2.setNicho("Alimentação");
        empresa2.setLogradouro("Rua B, 456");
        empresa2.setCep("98765-432");
        empresa2.setBairro("Bairro B");
        empresa2.setCidade("Cidade B");
        empresa2.setCodStatus(true);
        empresa2.setTipoUsuario("EMPRESA");
        empresas.add(empresa2);

        
    }

    public Empresas salvar(Empresas empresa) {

        Long novoId = gerarNovoId();
        empresa.setId(novoId);

        empresas.add(empresa);

        return empresa;
    }

    public List<Empresas> listarEmpresas() {
        return empresas;
    }

    public Empresas buscarPorId(Long id) {

        for (Empresas empresa : empresas) {

            if (empresa.getId().equals(id)) {
                return empresa;
            }
        }

        return null;
    }


    public Empresas atualizar(Long id, Empresas empresaAtualizada) {

        Empresas empresa = buscarPorId(id);

        if (empresa != null) {

            empresa.setNomeEmpresa(empresaAtualizada.getNomeEmpresa());
            empresa.setCnpj(empresaAtualizada.getCnpj());
            empresa.setEmail(empresaAtualizada.getEmail());
            empresa.setSenha(empresaAtualizada.getSenha());
            empresa.setNicho(empresaAtualizada.getNicho());
            empresa.setLogradouro(empresaAtualizada.getLogradouro());
            empresa.setCep(empresaAtualizada.getCep());
            empresa.setBairro(empresaAtualizada.getBairro());
            empresa.setCidade(empresaAtualizada.getCidade());
            empresa.setCodStatus(empresaAtualizada.isCodStatus());
            empresa.setTipoUsuario(empresaAtualizada.getTipoUsuario());

            return empresa;
        }

        return null;
    }

    // DELETE
    public boolean excluir(Long id) {

        Empresas empresa = buscarPorId(id);

        if (empresa != null) {
            empresas.remove(empresa);
            return true;
        }

        return false;
    }

    // Gera ID automático
    private Long gerarNovoId() {

        Long maiorId = 0L;

        for (Empresas empresa : empresas) {

            if (empresa.getId() > maiorId) {
                maiorId = empresa.getId();
            }
        }

        return maiorId + 1;
    }
}
