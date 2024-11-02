package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class BancoDeDados {

    private static final String URL = "jdbc:sqlite:banco.db";


    public static Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return conn;
    }


    public static void criarTabelaAluno() {
        String sql = "CREATE TABLE IF NOT EXISTS Alunos (" +
                "nome TEXT NOT NULL, " +
                "matricula INTEGER PRIMARY KEY, " +
                "email TEXT NOT NULL, " +
                "curso TEXT, " +
                "telefone TEXT, " +
                "data_nascimento TEXT, " +
                "turno TEXT, " +
                "instituicao TEXT, " +
                "observacao TEXT" +
                ");";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela Alunos criada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela Alunos: " + e.getMessage());
        }
    }


    public static void criarTabelaEstagio() {
        String sql = "CREATE TABLE IF NOT EXISTS Estagios (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "aluno_matricula INTEGER, " +
                "local TEXT NOT NULL, " +
                "supervisor TEXT, " +
                "horarios TEXT, " +
                "instituicao TEXT, " +
                "endereco TEXT, " +
                "periodo TEXT, " +
                "FOREIGN KEY (aluno_matricula) REFERENCES Alunos(matricula)" +
                ");";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela Estagios criada com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela Estagios: " + e.getMessage());
        }
    }


    public static void inserirAluno(Aluno aluno) {
        String sql = "INSERT INTO Alunos (nome, matricula, email, curso, telefone, data_nascimento, turno, instituicao, observacao) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, aluno.getNome());
            pstmt.setInt(2, aluno.getMatricula());
            pstmt.setString(3, aluno.getEmail());
            pstmt.setString(4, aluno.getCurso());
            pstmt.setString(5, aluno.getTelefone());
            pstmt.setString(6, aluno.getDataNascimento());
            pstmt.setString(7, aluno.getTurno());
            pstmt.setString(8, aluno.getInstituicao());
            pstmt.setString(9, aluno.getObservacao());

            pstmt.executeUpdate();
            System.out.println("Aluno inserido com sucesso: " + aluno.getNome());

        } catch (SQLException e) {
            System.out.println("Erro ao inserir aluno: " + e.getMessage());
        }
    }


    public static void inserirEstagio(Estagio estagio, int alunoMatricula) {
        String sql = "INSERT INTO Estagios (aluno_matricula, local, supervisor, horarios, instituicao, endereco, periodo) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, alunoMatricula);
            pstmt.setString(2, estagio.getLocal());
            pstmt.setString(3, estagio.getSupervisor());
            pstmt.setString(4, estagio.getHorarios());
            pstmt.setString(5, estagio.getInstituicao());
            pstmt.setString(6, estagio.getEndereco());
            pstmt.setString(7, estagio.getPeriodo());

            pstmt.executeUpdate();
            System.out.println("Estágio inserido com sucesso para o aluno com matrícula: " + alunoMatricula);

        } catch (SQLException e) {
            System.out.println("Erro ao inserir estágio: " + e.getMessage());
        }
    }

}
