package dados;

import java.time.LocalTime;

public class HorarioLocalT {
    public static void main(String[] args) {
        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (envio.isBefore(limite)) {
            System.out.println("Entrega fora do horário.");
        } else {
            System.out.println("Tarefa enviada com sucesso.");
        }
    }
}
