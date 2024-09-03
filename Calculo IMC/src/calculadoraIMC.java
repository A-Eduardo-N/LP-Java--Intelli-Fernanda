public class CalculadoraIMC {
    // Método para calcular o IMC
    public double calcularIMC(Pessoa pessoa) {
        double peso = pessoa.getPeso();
        double altura = pessoa.getAltura();
        return peso / (altura * altura);
    }

    // Método para fornecer a classificação do IMC
    public String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}

