package org.example;

public class Estagio {
    private String local;
    private String supervisor;
    private String horarios;
    private String instituicao;
    private String endereco;
    private String periodo;


    public Estagio(String local, String supervisor, String horarios, String instituicao, String endereco, String periodo) {
        this.local = local;
        this.supervisor = supervisor;
        this.horarios = horarios;
        this.instituicao = instituicao;
        this.endereco = endereco;
        this.periodo = periodo;
    }


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


    public void exibirInformacoes() {
        System.out.println("Local: " + local);
        System.out.println("Supervisor: " + supervisor);
        System.out.println("Horários: " + horarios);
        System.out.println("Instituição: " + instituicao);
        System.out.println("Endereço: " + endereco);
        System.out.println("Período: " + periodo);
    }

    public static void main(String[] args) {

        Estagio estagioAlcione = new Estagio(
                "Casa de Repouso Sodalício",
                "Leila Avila",
                "07:30 - 12:30",
                "Instituto Paulo Apóstolo",
                "Estrada do Rio Grande, 2116, Taquara",
                "01/03/2024 a 30/04/2024"
        );

        Estagio estagioGiovanna = new Estagio(
                "Casa de Repouso Sodalício",
                "Leila Avila",
                "07:30 - 12:30",
                "Instituto Paulo Apóstolo",
                "Estrada do Rio Grande, 2116, Taquara",
                "01/03/2024 a 30/04/2024"
        );

        Estagio estagioDélio = new Estagio(
                "Casa de Repouso Sodalício",
                "Leila Avila",
                "07:30 - 12:30",
                "Instituto Paulo Apóstolo",
                "Estrada do Rio Grande, 2116, Taquara",
                "01/03/2024 a 30/04/2024"
        );

        Estagio estagioJeniffer = new Estagio(
                "Casa de Repouso Sodalício",
                "Leila Avila",
                "13:30 - 17:30",
                "Instituto Paulo Apóstolo",
                "Estrada do Rio Grande, 2116, Taquara",
                "01/03/2024 a 30/04/2024"
        );

        Estagio estagioJuciara = new Estagio(
                "Casa de Repouso Sodalício",
                "Leila Avila",
                "13:30 - 17:30",
                "Instituto Paulo Apóstolo",
                "Estrada do Rio Grande, 2116, Taquara",
                "01/03/2024 a 30/04/2024"
        );

        Estagio estagioAlessandra = new Estagio(
                "Casa de Repouso Sodalício",
                "Leila Avila",
                "13:30 - 17:30",
                "Instituto Paulo Apóstolo",
                "Estrada do Rio Grande, 2116, Taquara",
                "01/03/2024 a 30/04/2024"
        );

        Estagio estagioIsabel = new Estagio(
                "Casa de Repouso Sodalício",
                "Leila Avila",
                "13:30 - 17:30",
                "Instituto Paulo Apóstolo",
                "Estrada do Rio Grande, 2116, Taquara",
                "01/03/2024 a 30/04/2024"
        );

        Estagio estagioRosana = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "08:00 - 12:00",
                "Curso Souza Barros",
                "Estrada de Curicica, 282, Curicica ",
                "02/09/2024 a 21/10/2024"
        );

        Estagio estagioAndreza = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "08:00 - 12:00",
                "Curso Souza Barros",
                "Estrada de Curicica, 282, Curicica ",
                "02/09/2024 a 21/10/2024"
        );

        Estagio estagioDayane = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "08:00 - 12:00",
                "Curso Souza Barros",
                "Estrada de Curicica, 282, Curicica ",
                "02/09/2024 a 21/10/2024"
        );

        Estagio estagioAlves = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "08:00 - 12:00",
                "Curso Souza Barros",
                "Estrada de Curicica, 282, Curicica ",
                "02/09/2024 a 21/10/2024"
        );

        Estagio estagioMarcelle = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "13:00 - 17:00",
                "Curso Souza Barros",
                "Estrada de Curicica, 282, Curicica ",
                "02/09/2024 a 21/10/2024"
        );

        Estagio estagioFabiana = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "13:00 - 17:00",
                "Curso Souza Barros",
                "Estrada de Curicica, 282, Curicica ",
                "02/09/2024 a 21/10/2024"
        );

        Estagio estagioLuiz = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "13:00 - 17:00",
                "Curso Souza Barros",
                "Estrada de Curicica, 282, Curicica ",
                "02/09/2024 a 21/10/2024"
        );

        Estagio estagioJoyce = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "09:00 - 13:00",
                "Centro de Ensino de Jacarepaguá",
                "Estrada de Curicica, 282, Curicica ",
                "01/07/2024 a 19/08/2024"
        );

        Estagio estagioVerônica = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "09:00 - 13:00",
                "Centro de Ensino de Jacarepaguá",
                "Estrada de Curicica, 282, Curicica ",
                "01/07/2024 a 19/08/2024"
        );

        Estagio estagioRebeca = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "09:00 - 13:00",
                "Centro de Ensino de Jacarepaguá",
                "Estrada de Curicica, 282, Curicica ",
                "01/07/2024 a 19/08/2024"
        );

        Estagio estagioMarcelo = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "09:00 - 13:00",
                "Centro de Ensino de Jacarepaguá",
                "Estrada de Curicica, 282, Curicica ",
                "01/07/2024 a 19/08/2024"
        );

        Estagio estagioAndressa = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "14:00 - 18:00",
                "Centro de Ensino de Jacarepaguá",
                "Estrada de Curicica, 282, Curicica ",
                "01/07/2024 a 19/08/2024"
        );

        Estagio estagioGeovana = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "14:00 - 18:00",
                "Centro de Ensino de Jacarepaguá",
                "Estrada de Curicica, 282, Curicica ",
                "01/07/2024 a 19/08/2024"
        );

        Estagio estagioVanessa = new Estagio(
                "Hospital Municipal Raphael de Paula Souza",
                "Leila Avila",
                "14:00 - 18:00",
                "Centro de Ensino de Jacarepaguá",
                "Estrada de Curicica, 282, Curicica ",
                "01/07/2024 a 19/08/2024"
        );



        estagioAlcione.exibirInformacoes();
        estagioGiovanna.exibirInformacoes();
        estagioDélio.exibirInformacoes();
        estagioJeniffer.exibirInformacoes();
        estagioJuciara.exibirInformacoes();
        estagioAlessandra.exibirInformacoes();
        estagioIsabel.exibirInformacoes();
        estagioRosana.exibirInformacoes();
        estagioAndreza.exibirInformacoes();
        estagioDayane.exibirInformacoes();
        estagioAlves.exibirInformacoes();
        estagioMarcelle.exibirInformacoes();
        estagioFabiana.exibirInformacoes();
        estagioLuiz.exibirInformacoes();
        estagioJoyce.exibirInformacoes();
        estagioVerônica.exibirInformacoes();
        estagioRebeca.exibirInformacoes();
        estagioMarcelo.exibirInformacoes();
        estagioAndressa.exibirInformacoes();
        estagioGeovana.exibirInformacoes();
        estagioVanessa.exibirInformacoes();



        BancoDeDados.criarTabelaEstagio();


        BancoDeDados.inserirEstagio(estagioAlcione, 20210106);
        BancoDeDados.inserirEstagio(estagioGiovanna, 20200813);
        BancoDeDados.inserirEstagio(estagioDélio, 20200601);
        BancoDeDados.inserirEstagio(estagioJeniffer, 20230208);
        BancoDeDados.inserirEstagio(estagioJuciara, 20220511);
        BancoDeDados.inserirEstagio(estagioAlessandra, 20231104);
        BancoDeDados.inserirEstagio(estagioIsabel, 20220601);
        BancoDeDados.inserirEstagio(estagioRosana, 20210712);
        BancoDeDados.inserirEstagio(estagioAndreza, 20221114);
        BancoDeDados.inserirEstagio(estagioDayane, 20240502);
        BancoDeDados.inserirEstagio(estagioAlves, 20210820);
        BancoDeDados.inserirEstagio(estagioMarcelle, 20240409);
        BancoDeDados.inserirEstagio(estagioFabiana, 20240610);
        BancoDeDados.inserirEstagio(estagioLuiz, 20210620);
        BancoDeDados.inserirEstagio(estagioJoyce, 20200307);
        BancoDeDados.inserirEstagio(estagioVerônica, 20241205);
        BancoDeDados.inserirEstagio(estagioRebeca, 20201203);
        BancoDeDados.inserirEstagio(estagioMarcelo, 20230325);
        BancoDeDados.inserirEstagio(estagioAndressa, 20240916);
        BancoDeDados.inserirEstagio(estagioGeovana, 20211015);
        BancoDeDados.inserirEstagio(estagioVanessa, 20201227);







    }
}
