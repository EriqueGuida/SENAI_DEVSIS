package br.com.senai.teste.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.senai.teste.model.Aluno;
import br.com.senai.teste.model.Emprestimo;
import br.com.senai.teste.model.Livro;
import br.com.senai.teste.repository.EmprestimoRepository;

@Service 
public class EmprestimoService {
    
    private final EmprestimoRepository emprestimoRepository;
    private final AlunoService alunoService;
    private final LivroService livroService;

    public EmprestimoService(EmprestimoRepository emprestimoRepository, AlunoService alunoService, LivroService livroService) {
        this.emprestimoRepository = emprestimoRepository;
        this.alunoService = alunoService;
        this.livroService = livroService;
    }

    public Optional<Emprestimo> cadastrar(Integer alunoId, Integer livroId) {
        
        Optional<Aluno> aluno = alunoService.buscarPorId(alunoId);
        Optional<Livro> livro = livroService.buscarPorId(livroId);

        if (aluno.isEmpty() || livro.isEmpty()) {
            return Optional.empty();
        }

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setAluno(aluno.get());
        emprestimo.setLivro(livro.get());
        emprestimo.setDataEmprestimo(java.time.LocalDate.now());

        return Optional.of(emprestimo);
    }
}
