package br.com.kikimvc.crudexemplo.controller;

import br.com.kikimvc.crudexemplo.modelo.Conta;
import br.com.kikimvc.crudexemplo.modelo.EnumTipoConta;
import br.com.kikimvc.crudexemplo.modelo.Pessoa;
import br.com.kikimvc.crudexemplo.repositorios.ContaRepository;
import br.com.kikimvc.crudexemplo.repositorios.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sistema/conta")
public class ContaController {


    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @RequestMapping(value = {"/", "/lista"}, method = RequestMethod.GET)
    public ModelAndView listagem() {
        List<Conta> listaContas = (List<Conta>) contaRepository.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("conta-lista");
        modelAndView.addObject("registros", listaContas);
        return modelAndView;
    }

    @RequestMapping(value = {"/novo"}, method = RequestMethod.GET)
    public ModelAndView formulario() {
        ModelAndView modelAndView = new ModelAndView();
        Conta conta = new Conta();
        modelAndView.setViewName("conta-formulario");
        modelAndView.addObject("registroAtual", conta);
        List<Pessoa> pessoas = (List<Pessoa>) pessoaRepository.findAll();
        modelAndView.addObject("pessoas", pessoas);
        modelAndView.addObject("tipos", EnumTipoConta.values());
        return modelAndView;
    }

    @RequestMapping(value = {"/editar/{id}"}, method = RequestMethod.GET)
    public ModelAndView alterar(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Conta conta = contaRepository.findById(id).get();
        modelAndView.setViewName("conta-formulario");
        modelAndView.addObject("registroAtual", conta);
        modelAndView.addObject("tipos", EnumTipoConta.values());
        return modelAndView;
    }

    @RequestMapping(value = {"/excluir/{id}"}, method = RequestMethod.GET)
    public ModelAndView excluir(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Conta conta = contaRepository.findById(id).get();
        contaRepository.delete(conta);
        return listagem();
    }

    @RequestMapping(value = {"/salvar"}, method = RequestMethod.POST)
    public ModelAndView salvar(Conta conta) {
        ModelAndView modelAndView = new ModelAndView();

        try {
            contaRepository.save(conta);
            return listagem();
        } catch (Exception ex) {
            modelAndView.setViewName("conta-formulario");
        }

        return modelAndView;
    }
}
