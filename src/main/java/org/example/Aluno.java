package org.example;

public class Aluno {
    private String nome;
    private int matricula;
    private String email;
    private String curso;
    private String telefone;
    private String dataNascimento;
    private String turno;
    private String instituicao;
    private String observacao;

    public Aluno(String nome, int matricula, String email, String curso, String telefone,
                 String dataNascimento, String turno, String instituicao, String observacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.curso = curso;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.turno = turno;
        this.instituicao = instituicao;
        this.observacao = observacao;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Email: " + email);
        System.out.println("Curso: " + curso);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Turno: " + turno);
        System.out.println("Instituição: " + instituicao);
        System.out.println("Observação: " + observacao);
    }

    public static void main(String[] args) {

        Aluno alcione = new Aluno(
                "ALCIONE GUIMARÃES",
                20210106,
                "alcione4guimaraes@gmail.com",
                "Técnico em Enfermagem",
                "21936671473",
                "18/05/1998",
                "Manhã",
                "Instituto Paulo Apóstolo",
                "ALUNA TRANQUILA BOM ÊXITO NAS ATIVIDADES."
        );

        Aluno joyce = new Aluno(
                "JOYCE RODRIGUES",
                20200307,
                "joycerodrigues94@gmail.com",
                "Técnico em Enfermagem",
                "21928656523",
                "12/07/1994",
                "Manhã",
                "Centro de Ensino de Jacarepaguá",
                "ALUNA COM BOA POSTURA, DEVIDAMENTE UNIFORMIZADA, SOLÍCITA, PRÓ ATIVA."
        );

        Aluno jeniffer = new Aluno(
                "JENIFFER LIRA",
                20230208,
                "jeniffer03lira@gmail.com",
                "Técnico em Enfermagem",
                "21930329561",
                "23/02/1999",
                "Tarde",
                "Instituto Paulo Apóstolo",
                "ALUNA DEVIDAMENTE UNIFORMIZADA E PRÓ ATIVA, REALIZOU AS ATIVIDADES COM ÊXITO, PORÉM SE APRESENTOU COM UNHAS LONGAS E DECORADAS."
        );

        Aluno marcelle = new Aluno(
                "MARCELLE CRISTINA",
                20240409,
                "marcelle.cristina00@gmail.com",
                "Técnico em Enfermagem",
                "21924278385",
                "30/11/2000",
                "Tarde",
                "Curso Souza Barros",
                "ALUNA TRANQUILA, DEVIDAMENTE UNIFORMIZADA, COM POUCO CONHECIMENTO TEÓRICO PRÁTICO, NÃO É PRÓ ATIVA, SE APRESENTOU SEM USO DE TÊNIS."
        );

        Aluno fabiana = new Aluno(
                "FABIANA DA SILVA",
                20240610,
                "fabiana17silva@gmail.com",
                "Técnico em Enfermagem",
                "21928372108",
                "05/09/1997",
                "Tarde",
                "Curso Souza Barros",
                "SE APRESENTOU COM UNHAS LONGAS E DECORADAS, OBTEVE 2 FALTAS SEM JUSTIFICATIVA."
        );

        Aluno juciara = new Aluno(
                "JUCIARA CRISTIANE",
                20220511,
                "juciaracristiane01@gmail.com",
                "Técnico em Enfermagem",
                "21930672264",
                "17/10/2001",
                "Tarde",
                "Instituto Paulo Apóstolo",
                "ALUNA TRANQUILA, DEVIDAMENTE UNIFORMIZADA OBTEVE 1 FALTA SEM JUSTIFICATIVA."
        );

        Aluno rosana = new Aluno(
                "ROSANA DA SILVA",
                20210712,
                "rosana49silva@gmail.com",
                "Técnico em Enfermagem",
                "21923817958",
                "14/03/1994",
                "Manhã",
                "Curso Souza Barros",
                "ALUNA COM POSTURA DE BOA PROFISSIONAL, DEVIDAMENTE UNIFORMIZADA, SOLÍCITA, PRÓ ATIVA E TRANQUILA."
        );

        Aluno giovanna = new Aluno(
                "GIOVANNA DIAS",
                20200813,
                "giovannadias78@gmail.com",
                "Técnico em Enfermagem",
                "21934265268",
                "06/12/1998",
                "Manhã",
                "Instituto Paulo Apóstolo",
                "OBTEVE 1 FALTA SEM JUSTIFICATIVA"
        );

        Aluno andressa = new Aluno(
                "ANDRESSA SILVA",
                20240916,
                "andressa46silva@gmail.com",
                "Técnico em Enfermagem",
                "21933276357",
                "25/04/1999",
                "Tarde",
                "Centro de Ensino de Jacarepaguá",
                "ALUNA TRANQUILA, DEVIDAMENTE UNIFORMIZADA, REALIZOU AS ATIVIDADES COM ÊXITO, OBTEVE 1 FALTA."
        );

        Aluno geovana = new Aluno(
                "GEOVANA OLIVEIRA",
                20211015,
                "geovanaoliveira83@gmail.com",
                "Técnico em Enfermagem",
                "21927741867",
                "02/08/1996",
                "Tarde",
                "Centro de Ensino de Jacarepaguá",
                "ALUNA SEMPRE SE APRESENTOU AO ESTÁGIO DEVIDAMENTE UNIFORMIZADA, OBTEVE 1 FALTA SEM JUSTIFICATIVA."
        );

        Aluno andreza = new Aluno(
                "ANDREZA MARTINS",
                20221114,
                "andrezamartins59@gmail.com",
                "Técnico em Enfermagem",
                "21936157747",
                "21/09/1995",
                "Manhã",
                "Curso Souza Barros",
                "ALUNA DEVIDAMENTE UNIFORMIZADA, MOSTRA TRANQUILIDADE E INTERESSE NO APRENDIZADO, NÃO OBTEVE FALTA"
        );

        Aluno verônica = new Aluno(
                "VERÔNICA DA SILVA",
                20241205,
                "veronica.silva44@gmail.com",
                "Técnico em Enfermagem",
                "21938180187",
                "03/11/1997",
                "Manhã",
                "Centro de Ensino de Jacarepaguá",
                "ALUNA SE APRESENTOU DE TÊNIS, PORÉM FOI ORIENTADA SOBRE O USO INDEVIDO DO TÊNIS, É PRÓ ATIVA, COM BOA INTERAÇÃO EM EQUIPE E BOA AGILIDADE."
        );

        Aluno alessandra = new Aluno(
                "ALESSANDRA ARIMATÉIA",
                20231104,
                "alessandra27arimateia@gmail.com",
                "Técnico em Enfermagem",
                "21938551545",
                "15/01/1994",
                "Tarde",
                "Instituto Paulo Apóstolo",
                "ALUNA TRANQUILA, COM UNHAS DE ACRIGEL (SENDO ADVERTIDA), OBTEVE FALTA, REALIZANDO AS ATIVIDADES, PORÉM DEVENDO MELHORAR NA INICIATIVA E CONHECIMENTO TEÓRICO – PRÁTICO."
        );

        Aluno rebeca = new Aluno(
                "REBECA VITÓRIA",
                20201203,
                "rebeca.vitoria62@gmail.com",
                "Técnico em Enfermagem",
                "21926179050",
                "09/06/1998",
                "Manhã",
                "Centro de Ensino de Jacarepaguá",
                "ALUNA TRANQUILA, DEVIDAMENTE UNIFORMIZADA E PRÓ ATIVA, REALIZOU AS ATIVIDADES COM ÊXITO, EM USO DE TÊNIS SENDO ADVERTIDA."
        );

        Aluno dayane = new Aluno(
                "DAYANE RODRIGUES",
                20240502,
                "dayanero11@gmail.com",
                "Técnico em Enfermagem",
                "21930333192",
                "04/02/1994",
                "Manhã",
                "Curso Souza Barros",
                "ALUNA TRANQUILA, DEVIDAMENTE UNIFORMIZADA E PRÓ ATIVA, REALIZOU AS ATIVIDADES COM ÊXITO, EM USO DE TÊNIS SENDO ADVERTIDA."
        );

        Aluno isabel = new Aluno(
                "ISABEL RAMOS",
                20220601,
                "isabelramos77@gmail.com",
                "Técnico em Enfermagem",
                "21921528589",
                "11/10/1996",
                "Tarde",
                "Instituto Paulo Apóstolo",
                "ALUNA TRANQUILA, DEVIDAMENTE UNIFORMIZADA E PRÓ ATIVA, REALIZOU AS ATIVIDADES COM ÊXITO."
        );

        Aluno délio = new Aluno(
                "DÉLIO DAVI",
                20200601,
                "deliodavi42@gmail.com",
                "Técnico em Enfermagem",
                "21936648480",
                "27/08/2001",
                "Manhã",
                "Instituto Paulo Apóstolo",
                "ALUNO DEVIDAMENTE UNIFORMIZADO, É ATENTO E INTERAGE BEM EM EQUIPE, PORÉM DEVE MELHORAR NA INICIATIVA E NOS CONHECIMENTOS TEÓRICO – PRÁTICO, OBTEVE 2 FALTAS."
        );

        Aluno alves = new Aluno(
                "FABIANA ALVES DE SOUZA",
                20210820,
                "fabianaalves.souza06@gmail.com",
                "Técnico em Enfermagem",
                "21994667321",
                "29/05/2001",
                "Manhã",
                "Curso Souza Barros",
                "OBTEVE 2 FALTA SEM JUSTIFICATIVA"
        );

        Aluno luiz = new Aluno(
                "LUIZ FELIPE AZEVEDO",
                20210620,
                "luiz.felipe.azevedo97@gmail.com",
                "Técnico em Enfermagem",
                "21964883717",
                "04/07/1996",
                "Tarde",
                "Curso Souza Barros",
                "ALUNO TRANQUILO, DEVIDAMENTE UNIFORMIZADO E PRÓ ATIVO, REALIZOU AS ATIVIDADES COM ÊXITO"
        );

        Aluno marcelo = new Aluno(
                "MARCELO FARIAS",
                20230325,
                "marcelofarias00@gmail.com",
                "Técnico em Enfermagem",
                "21989221139",
                "28/02/2000",
                "Manhã",
                "Centro de Ensino de Jacarepaguá",
                "ALUNO COM BOA POSTURA, DEVIDAMENTE UNIFORMIZADO, SOLÍCITO, PRÓ ATIVO."
        );

        Aluno vanessa = new Aluno(
                "VANESSA MASCARENHAS",
                20201227,
                "vanessamascarenhaszz@gmail.com",
                "Técnico em Enfermagem",
                "21976123348",
                "25/06/2003",
                "Tarde",
                "Centro de Ensino de Jacarepaguá",
                "SE ATRASAVA COM FREQUÊNCIA."
        );



        alcione.exibirInformacoes();
        joyce.exibirInformacoes();
        jeniffer.exibirInformacoes();
        marcelle.exibirInformacoes();
        fabiana.exibirInformacoes();
        juciara.exibirInformacoes();
        rosana.exibirInformacoes();
        giovanna.exibirInformacoes();
        andressa.exibirInformacoes();
        geovana.exibirInformacoes();
        andreza.exibirInformacoes();
        verônica.exibirInformacoes();
        alessandra.exibirInformacoes();
        rebeca.exibirInformacoes();
        dayane.exibirInformacoes();
        isabel.exibirInformacoes();
        délio.exibirInformacoes();
        alves.exibirInformacoes();
        luiz.exibirInformacoes();
        marcelo.exibirInformacoes();
        vanessa.exibirInformacoes();


        BancoDeDados.criarTabelaAluno();


        BancoDeDados.inserirAluno(alcione);
        BancoDeDados.inserirAluno(joyce);
        BancoDeDados.inserirAluno(jeniffer);
        BancoDeDados.inserirAluno(marcelle);
        BancoDeDados.inserirAluno(fabiana);
        BancoDeDados.inserirAluno(juciara);
        BancoDeDados.inserirAluno(rosana);
        BancoDeDados.inserirAluno(giovanna);
        BancoDeDados.inserirAluno(andressa);
        BancoDeDados.inserirAluno(geovana);
        BancoDeDados.inserirAluno(andreza);
        BancoDeDados.inserirAluno(verônica);
        BancoDeDados.inserirAluno(alessandra);
        BancoDeDados.inserirAluno(rebeca);
        BancoDeDados.inserirAluno(dayane);
        BancoDeDados.inserirAluno(isabel);
        BancoDeDados.inserirAluno(délio);
        BancoDeDados.inserirAluno(alves);
        BancoDeDados.inserirAluno(luiz);
        BancoDeDados.inserirAluno(marcelo);
        BancoDeDados.inserirAluno(vanessa);

    }


}

