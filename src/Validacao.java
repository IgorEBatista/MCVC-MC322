import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class Validacao {

    // Métodos

    /**
     * Converte uma data no formato String para Calendar.
     * 
     * @param dataString
     * @return
     */
    public static Calendar formataData(String dataString) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dataFormatada.parse(dataString);
            calendar.setTime(date);
            return calendar;
        } catch (ParseException e) {
            return null; // Data inválida
        }
    }


    /**
     * Verifica se um dado CPF de um ClientePF é válido.
     * 
     * @param cpf
     * @return true se for válido e false caso contrário
     */
    public static boolean validaCPF(String cpf) {
        // 1. Removendo todos os caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // 2. Verificando se o CPF tem 11 dígitos
        if (cpf.length() != 11) return false;

        // 3. Verificando se todos os dígitos são iguais
        char primeiro = cpf.charAt(0);
        int k = 10;
        while (k > 0) {
            if (primeiro != cpf.charAt(k)) k = -1;
            else k--;
        }
        if (k == 0) return false;

        // 4. Calculando os dígitos verificadores
        int temp;
        int resto;
        int verificador_calculado_1 = 0;  // 1º verificador calculado
        int verificador_calculado_2 = 0;  // 2º verificador calculado

            // 1º DÍGITO:
            temp = 0;
            for (int i = 0; i < 9; i++)
                temp = temp + (Character.getNumericValue(cpf.charAt(i)) * (10 - i));
            resto = temp % 11;
            if (temp > 1) verificador_calculado_1 = 11 - resto;

            // 2º DÍGITO:
            temp = 0;
            for (int i = 0; i < 10; i++)
                temp = temp + (Character.getNumericValue(cpf.charAt(i)) * (11 - i));
            resto = temp % 11;
            if (temp > 1) verificador_calculado_2 = 11 - resto;

        // 5.Verificando se os dígitos verificadores calculados são iguais aos dígitos do CPF
        int verificador_cpf_1 = Character.getNumericValue(cpf.charAt(9));  // 1º verificador do CPF = dígito 10
        int verificador_cpf_2 = Character.getNumericValue(cpf.charAt(10)); // 2º verificador do CPF = dígito 11
        
        if (verificador_calculado_1 == verificador_cpf_1 && verificador_calculado_2 == verificador_cpf_2) return true;
        else return false;
    }


    /**
     * Verifica se um dado CNPJ de um ClientePJ é válido.
     * 
     * @param cnpj
     * @return true se for válido e false caso contrário
     */
    public static boolean validaCNPJ(String cnpj) {
        // 1. Removendo todos os caracteres não numéricos do CNPJ
        cnpj = cnpj.replaceAll("[^0-9]", "");

        // 2. Verificando se o CNPJ tem 14 dígitos
        if (cnpj.length() != 14) return false;

        // 3. Verificando se todos os dígitos são iguais
        char primeiro = cnpj.charAt(0);
        int k = 13;
        while (k > 0) {
            if (primeiro != cnpj.charAt(k)) k = -1;
            else k--;
        }
        if (k == 0) return false;

        // 4. Calculando os dígitos verificadores
        int temp;
        int resto;
        int verificador_calculado_1 = 0;  // 1º verificador calculado
        int verificador_calculado_2 = 0;  // 2º verificador calculado

            // 1º DÍGITO:
            int[] fatores_1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            temp = 0;
            for (int i = 0; i < 12; i++)
                temp = temp + (Character.getNumericValue(cnpj.charAt(i)) * (fatores_1[i]));
            resto = temp % 11;
            if (temp <= 1) verificador_calculado_1 = 0;
            else verificador_calculado_1 = 11 - resto;

            // 2º DÍGITO:
            int[] fatores_2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
            temp = 0;
            for (int i = 0; i < 12; i++)
                temp = temp + (Character.getNumericValue(cnpj.charAt(i)) * (fatores_2[i]));
            temp = temp + (verificador_calculado_1 * fatores_2[12]);
            resto = temp % 11;
            if (temp <= 1) verificador_calculado_2 = 0;
            else verificador_calculado_2 = 11 - resto;

        // 5.Verificando se os dígitos verificadores calculados são iguais aos dígitos do CNPJ
        int verificador_cpf_1 = Character.getNumericValue(cnpj.charAt(12));  // 1º verificador do CNPJ = dígito 13
        int verificador_cpf_2 = Character.getNumericValue(cnpj.charAt(13));  // 2º verificador do CNPJ = dígito 14
        
        if (verificador_calculado_1 == verificador_cpf_1 && verificador_calculado_2 == verificador_cpf_2) return true;
        else return false;
    }


    /**
     * Verifica se o nome é composto somente por letras de A a Z (maiúsculas e minúsculas)
     * e por espaços em branco. Não aceita acentos.
     * 
     * @param nome
     * @return true se for válido e false caso contrário
     */
    public static boolean validaNome(String nome) {
        return (nome.matches("^[a-zA-Z ]+$"));
    }

}
