package br.ufrn.imd;

public class Gerente extends Funcionario{
    protected enum Nivel{
        JUNIOR(1000), PLENO(2000), SENIOR(3000);
        private double bonus;

        Nivel(double bonus){
            this.bonus = bonus;
        }
    }

    protected Nivel nivel;

    public Gerente(int chMensal, double hh, Nivel nivel){
        super(chMensal, hh);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario(){
        return chMensal * hh + nivel.bonus;
    }
}
