import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

class AlunoIteratorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void test(){
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        Aluno aluno = null;

        for(int i=0; i >10; i++) {
            listaAluno.add(new Aluno("Aluno" + i,"endereço"+i,i));


        }


        Iterator<Aluno> itrAluno = listaAluno.iterator();

        while(itrAluno.hasNext()) {
            aluno = (Aluno) itrAluno.next();
        }
    }
    assertEquals("Nome", "endereco:", "matricula" , aluno.getNome(), aluno.getEndereco(), aluno.getMatricula());

}
