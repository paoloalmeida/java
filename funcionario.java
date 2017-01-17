class Funcionario{
        String nome;
        String departamento;
        double salario;
        Data dataDeEntrada;
        String rg;
        Empresa empresa;


        void recebeAumento(double valor){
            this.salario += valor;
        }
        double GanhoAnual(){
            return this.salario * 12;
        }

        void mostra(){

                System.out.println("Empresa: "+this.empresa.nomeDaEmpresa);
                System.out.println("Funcionario: "+this.nome);
                System.out.println("Deparatamento: "+this.departamento);
                System.out.println("Salario: R$ "+this.salario);
                System.out.println("Data de Entrada: "+this.dataDeEntrada.mostraData());
                System.out.println("RG: "+this.rg);
                System.out.println("Ganho Anual: R$ "+this.GanhoAnual());

        }
        

    }

class Empresa {

    String nomeDaEmpresa;
    String cnpj;
    Funcionario[] funcionarios;
    int livre = 0;

    void adicionaFuncionarios (Funcionario f){
        this.funcionarios[this.livre] = f;
        this.livre++;
    }
    void mostraFuncionarios() {
        for (int i = 0; i < this.livre; i++) {
            System.out.println("Funcionário na posição: " + i);
            System.out.println("R$" + this.funcionarios[i].salario);
        }
    }
    // void mostraTodasAsInformacoes() {
    //     for (int i = 0; i < this.livre; i++) {
    //         System.out.println(i);
    //         this.funcionarios[i].mostra();
    //     }
    // }
    boolean contem(Funcionario f) {
        for (int i = 0; i < this.livre; i++) {
            if (f == this.funcionarios[i]) {
                return true;
            }
        }
        return false;
    }

}

class Data {

    int dia;
    int mes;
    int ano;

    void prencheData (int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;

    }

    String mostraData (){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }

}


class Dados {

    public static void main(String[] args) {


        // Empresa empresa = new Empresa();
        // Funcionario f1 = new Funcionario ();
        // Funcionario f2 = new Funcionario ();

        // empresa.funcionarios = new Funcionario[10];
        // empresa.nomeDaEmpresa = "BRCT";
        // empresa.cnpj = "0000000000000000";
        // empresa.funcionarios[0] = new Funcionario();
        // empresa.funcionarios[1] = new Funcionario();

        // f1.empresa = empresa;
        // f1.nome = "Joao";
        // f1.rg = "1111111111111";
        // f1.departamento = "TI";
        // f1.dataDeEntrada = new Data();
        // f1.dataDeEntrada.prencheData(10,10,2010);
        // f1.salario = 5500;
        // empresa.adicionaFuncionarios(f1);
        // empresa.funcionarios[0] = f1;

        // f2.empresa = empresa;
        // f2.nome = "Jose";
        // f2.departamento = "Compras";
        // f2.dataDeEntrada = new Data();
        // f2.dataDeEntrada.prencheData(11,11,2011);
        // f2.rg = "0000000000";
        // f2.salario = 3000.0;
        // empresa.adicionaFuncionarios(f2);
        // empresa.funcionarios[1] = f2;

        // empresa.funcionarios[0].mostra();
        // empresa.funcionarios[1].mostra();

    }
}


class TestaEmpresa {

    public static void main (String[] args) {
        Empresa empresa = new Empresa();
        empresa.funcionarios = new Funcionario[10];

        Funcionario f1 = new Funcionario();
        f1.salario = 1000;
        f1.dataDeEntrada = new Data();
        empresa.adicionaFuncionarios(f1);

        Funcionario f2 = new Funcionario();
        f2.salario = 1700;
        f2.dataDeEntrada = new Data();
        empresa.adicionaFuncionarios(f2);

        // empresa.empregados[0].mostra();
        // empresa.empregados[1].mostra();

        empresa.mostraFuncionarios();
        // empresa.mostraTodasAsInformacoes();
    }
}

