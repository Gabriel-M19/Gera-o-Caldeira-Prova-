package dados;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiasUteis {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2025, 6, 10); // terça-feira
        int diasUteis = 0;

        while (diasUteis < 7) {
            data = data.plusDays(1); // avança um dia
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15)); // domingo

            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }
        System.out.println(data);
    }
}
