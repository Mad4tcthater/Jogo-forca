package com.forca;

public class Tracinhos implements Cloneable {
    private char texto[];

    public Tracinhos(int qtd) throws Exception {
        // verifica se qtd n�o � positiva, lan�ando uma exce��o.
        // instancia this.texto com um vetor com tamanho igual qtd.
        // preenche this.texto com underlines (_).
        if (qtd < 0)
            throw new Exception("Quantidade n�o pode ser negativa");

        this.texto = new char[qtd];

        for (int i = 0; i < qtd; i++) {
            this.texto[i] = '_';
        }
    }

    public void revele(int posicao, char letra) throws Exception {
        // verifica se posicao � negativa ou ent�o igual ou maior
        // do que this.texto.length, lan�ando uma exce��o.
        // armazena a letra fornecida na posicao tambem fornecida
        // do vetor this.texto
        if (posicao < 0 || posicao >= this.texto.length)
            throw new Exception("Posicao n�o encontrada ou invalida!");

        this.texto[posicao] = letra;
    }

    public boolean isAindaComTracinhos() {
        // percorre o vetor de char this.texto e verifica
        // se o mesmo ainda contem algum underline ou se ja
        // foram todos substituidos por letras; retornar true
        // caso ainda reste algum underline, ou false caso
        // contrario
        for (int i = 0; i < this.texto.length; i++) {
            if (this.texto[i] == '_')
                return true;
        }

        return false;
    }

    @Override
    public String toString() {
        // retorna um String com TODOS os caracteres que h�
        // no vetor this.texto, intercalados com espa�os em
        // branco
        String ret = "";

        for (int i = 0; i < this.texto.length; i++) {
            ret += this.texto[i] + " ";
        }

        return ret;
    }

    @Override

    public boolean equals(Object obj) {
        // verificar se this e obj possuem o mesmo conte�do, retornando
        // true no caso afirmativo ou false no caso negativo
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        if (this.texto != ((Tracinhos) obj).texto)
            return false;

        return true;

    }

    public int hashCode() {
        // calcular e retornar o hashcode de this
        return this.texto.hashCode();
    }

    public Tracinhos(Tracinhos t) throws Exception // construtor de c�pia
    {
        // intanciar this.texto um vetor com o mesmo tamanho de t.texto
        // e copilar o conte�do de t.texto para this.texto
        if (t == null) {
            throw new Exception("....");
        } else {
            this.texto = t.texto;
        }
    }

    public Object clone() {
        // retornar uma copia de this
        Tracinhos ret = null;
        try {
            ret = new Tracinhos(this);
        } catch (Exception err) {
        }
        return ret;
    }

}
