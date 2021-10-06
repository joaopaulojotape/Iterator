import java.util.ArrayList;
import java.util.Iterator;

public class AlunoIterator {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        Aluno aluno = null;

        for(int i=0; i >10; i++) {
            listaAluno.add(new Aluno("Aluno" + i,"endereço"+i,i));


        }

        System.out.println();
        System.out.println();

        Iterator<Aluno> itrAluno = listaAluno.iterator();

        while(itrAluno.hasNext()) {
            aluno = (Aluno) itrAluno.next();
            System.out.println("Nome:"+ aluno.getNome());
            System.out.println("endereco:"+ aluno.getEndereco());
            System.out.println("matricula:"+ aluno.getMatricula());
        }
    }

}