abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularDesconto(double porcentagem);

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * (porcentagem + 10) / 100);
    }
}

class Alimento extends Produto {
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }
}
