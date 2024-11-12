package Servive;
import java.util.ArrayList;
import model.Pessoa;

public class PessoaService {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa p){
        pessoas.add(p);
        System.out.println("cadastrada com succeso!");
    }

    public ArrayList<Pessoa>listar(){
        return pessoas;
    }

    public void atualizar(String nome, String novoNome) {
        for(Pessoa pessoa : pessoas){
            if(pessoa.getNome().equalsIgnoreCase(nome)){
                pessoa.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
            }else{
                System.out.println("Pessoa não foi encontrada");
            }
        }
    }

    public void deletar(String nome) {
        for(int i = 0;i<pessoas.size(); i++){
            if(pessoas.get(i).getNome().equalsIgnoreCase(nome)){
                pessoas.remove(i);
            }
        }
    }
}
