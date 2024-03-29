import java.util.*;
public class JogoDeTenis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vitorias = 0, perdas = 0;

        for(int i=0; i<6 ;i++){
            System.out.println("jogo"+i);
            String resultado = in.next();
            if(resultado == "V"){
                vitorias++;
            }else{
                perdas++;
            }

        }
        int grupo = -1;
        if(vitorias >= 5){
            grupo = 1;
        }else if(vitorias >= 3){
            grupo =2;
        }else if(vitorias >= 1){
            grupo = 3;
        }else{
            grupo = -1;
        }
        System.out.println(grupo);
    }
    
}