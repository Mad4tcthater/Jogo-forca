package com.forca;

public class ControladorDeLetrasJaDigitadas implements Cloneable {
    private String letrasJaDigitadas;

    public ControladorDeLetrasJaDigitadas() {
        // torna this.letrasJaDigitadas igual ao String vazio
        this.letrasJaDigitadas = "";
    }

    public boolean isJaDigitada(char letra) {
        // percorrer o String this.letrasJaDigitadas e verificar se ele
        // possui a letra fornecida, retornando true em caso afirmativo
        // ou false em caso negativo
        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            if (this.letrasJaDigitadas.charAt(i) == letra)
                return true;
        }

        return false;
    }

    public void registre(char letra) throws Exception {
        // verifica se a letra fornecida ja foi digitada (pode usar
        // o mtodo this.isJaDigitada, para isso), lancando uma exceo
        // em caso afirmativo.
        // concatena a letra fornecida a this.letrasJaDigitadas.
        if (!this.isJaDigitada(letra))
            this.letrasJaDigitadas += letra;
        else
            throw new Exception("Letra ja digitada!");
    }

    @Override
    public String toString() {
        // retorna um String com TODAS as letras presentes em
        // this.letrasJaDigitadas separadas por vrgula (,).
        String ret = "";
        // String[] vec = new String[this.letrasJaDigitadas.length()];

        for (int i = 0; i < this.letrasJaDigitadas.length(); i++) {
            ret += this.letrasJaDigitadas.charAt(i) + ", ";
        }

        return ret;
    }

    @Override
    public boolean equals(Object obj) {
        // verificar se this e obj so iguais
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        if (this.letrasJaDigitadas != ((ControladorDeLetrasJaDigitadas) obj).letrasJaDigitadas)
            return false;

        return true;

    }

    public int hashCode() {
        // calcular e retornar o hashcode de this
        return this.letrasJaDigitadas.hashCode();
    }

    public ControladorDeLetrasJaDigitadas(
            ControladorDeLetrasJaDigitadas controladorDeLetrasJaDigitadas)
            throws Exception // construtor de cpia
    {
        // copiar c.letrasJaDigitadas em this.letrasJaDigitadas
        controladorDeLetrasJaDigitadas.letrasJaDigitadas = this.letrasJaDigitadas;
    }

    public Object clone() {
        // criar uma cpia do this com o construtor de cpia e retornar
        ControladorDeLetrasJaDigitadas ret = null;
        try {
            ret = new ControladorDeLetrasJaDigitadas(this);
        } catch (Exception err) {
        }
        return ret;
    }

}
