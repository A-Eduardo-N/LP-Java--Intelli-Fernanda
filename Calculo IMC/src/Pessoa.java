public class Pessoa {
    private double peso;
    private double altura;
    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


public String calcularImc(Pessoa pessoa) {
        double peso = pessoa.getPeso();
        double altura = pessoa.getAltura();
        return peso / (altura * altura);
        public String classificarIMC(double imc) {
            if (imc <18.5) {
                return "Abaixo do peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                return "peso normal";
            } else if (ima >= 25 && imc < 29.9) {
                return "Sobrepeso";
            } else {
                return"Obesidade";
            }
    }
}
}public class Pessoa {
    // Campos privados para armazenar peso e altura
    private double peso;
    private double altura;

    // Construtor para inicializar peso e altura
    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos públicos para acessar o peso e a altura
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
