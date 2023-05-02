package trabalhojava;
import java.util.Scanner;
public class CalculaMedia {
    private double prova;
    private float tic;
    private double apostila;
    private float relatorio;
    private double trabalho;
    private float tarefa;
    private float trilha;
    private float avaliativa;
    private float simulado;
    private String nome;
    private String turma;
    private String disciplina;
    private double media;

    /*
     * PRATICA
     */

    void recebeDados(String op){
        switch(op){
        case "1":
            recebeDados(nome, turma, disciplina, apostila, trabalho, tic, relatorio, prova, tarefa);
        break;
        case "2":
            recebeDados(nome, turma, disciplina, apostila, trabalho, tic, relatorio, prova);
        break;
        case "3":
            recebeDados(nome, turma, disciplina, apostila, trabalho, trilha, prova);
        break;
        case "4":
            recebeDados(nome, turma, disciplina, apostila, trabalho, trilha, prova, simulado);
        break;
        }
    }

    void media(String op){
        switch(op){
            case "1":
                media(tic, prova, relatorio, apostila, trabalho, tarefa);
            break;
            case "2":
                media(tic, prova, apostila, trabalho, relatorio);
            break;
            case "3":
                media(prova, trilha, apostila, avaliativa, trabalho);
            break;
            case "4":
                media(prova, trilha, trabalho, simulado, avaliativa, apostila);
            break;
        }
    }
    
    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, float tic, float relatorio, double prova, float tarefa){
        Scanner ler = new Scanner(System.in);
        System.out.println("##############");
        System.out.println("#  PRATICA   #");
        System.out.println("##############");
        System.out.println("Digite o nome");
        this.setNome(ler.nextLine());
        System.out.println("Digite a turma");
        this.setTurma(ler.nextLine());
        System.out.println("Digite a disciplina");
        this.setDisciplina(ler.nextLine());

        System.out.println("Digite a nota de tarefa");
        this.setTarefa(ler.nextFloat());
        System.out.println("Digite a nota de apostila");
        this.setApostila(ler.nextDouble());
        System.out.println("Digite a nota de trabalho");
        this.setTrabalho(ler.nextDouble());
        System.out.println("Digite a nota de tic");
        this.setTic(ler.nextFloat());
        System.out.println("Digite a nota de relatorio");
        this.setRelatorio(ler.nextFloat());
        System.out.println("Digite a nota de prova");
        this.setProva(ler.nextDouble());
    }
    /*
     * TEORICA
     */
    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, float tic, float relatorio, double prova){
        Scanner ler = new Scanner(System.in);
        System.out.println("##############");
        System.out.println("#  TEORICA   #");
        System.out.println("##############");
        System.out.println("Digite o nome");
        this.setNome(ler.nextLine());
        System.out.println("Digite a turma");
        this.setTurma(ler.nextLine());
        System.out.println("Digite a disciplina");
        this.setDisciplina(ler.nextLine());

        System.out.println("Digite a nota de apostila");
        this.setApostila(ler.nextDouble());
        System.out.println("Digite a nota de trabalho");
        this.setTrabalho(ler.nextDouble());
        System.out.println("Digite a nota de tic");
        this.setTic(ler.nextFloat());
        System.out.println("Digite a nota de relatorio");
        this.setRelatorio(ler.nextFloat());
        System.out.println("Digite a nota de prova");
        this.setProva(ler.nextDouble());
    }
    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, float trilha, double prova){
        Scanner ler = new Scanner(System.in);
        System.out.println("##############");
        System.out.println("#  REGULAR   #");
        System.out.println("##############");
        System.out.println("Digite o nome");
        this.setNome(ler.nextLine());
        System.out.println("Digite a turma");
        this.setTurma(ler.nextLine());
        System.out.println("Digite a disciplina");
        this.setDisciplina(ler.nextLine());

        System.out.println("Digite a nota de apostila");
        this.setApostila(ler.nextDouble());
        System.out.println("Digite a nota de trabalho");
        this.setTrabalho(ler.nextDouble());
        System.out.println("Digite a nota de trilha");
        this.setTrilha(ler.nextFloat());
        System.out.println("Digite a nota de prova");
        this.setProva(ler.nextDouble());
        System.out.println("Digite a nota do avaliativa");
        this.setAvaliativa(ler.nextFloat());

    }

    void recebeDados(String nome, String turma, String disciplina, double apostila, double trabalho, double trilha, double prova, double simulado){
        Scanner ler = new Scanner(System.in);
        System.out.println("##############");
        System.out.println("#  TERCEIRO   #");
        System.out.println("##############");
        System.out.println("Digite o nome");
        this.setNome(ler.nextLine());
        System.out.println("Digite a turma");
        this.setTurma(ler.nextLine());
        System.out.println("Digite a disciplina");
        this.setDisciplina(ler.nextLine());

        System.out.println("Digite a nota de apostila");
        this.setApostila(ler.nextDouble());
        System.out.println("Digite a nota de trabalho");
        this.setTrabalho(ler.nextDouble());
        System.out.println("Digite a nota de trilha");
        this.setTrilha(ler.nextFloat());
        System.out.println("Digite a nota de prova");
        this.setProva(ler.nextDouble());
        System.out.println("Digite a nota do simulado");
        this.setSimulado(ler.nextFloat());
        System.out.println("Digite a nota do avaliativa");
        this.setAvaliativa(ler.nextFloat());

    }
    




    void exibirDadosPratica(){
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("TIC: " + this.getTic());
        System.out.println("Relatório: " + this.getRelatorio());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
    }
    void exibirDadosTeorica(){
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("TIC: " + this.getTic());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
        System.out.println("Relatório: " + this.getRelatorio());
    }
    void exibirDadosRegular(){
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("Trilha: " + this.getTrilha());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
    }
    void exibirDadosTerceiro(){
        System.out.println("Nome : " + this.getNome());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Media: " + this.getMedia());
        System.out.println("Prova: " + this.getProva());
        System.out.println("Trilha: " + this.getTrilha());
        System.out.println("Apostila: " + this.getApostila());
        System.out.println("Trabalho: " + this.getTrabalho());
        System.out.println("Simulado: " + this.getSimulado());
    }
    
    /*
    MEDIA PRATICA TECNICA
    */


    public double media(float tic, double prova, double relatorio, double apostila, double trabalho, float tarefa){
        media = (this.getApostila() * 0.05 + this.getTarefa() * 0.3 + this.getTrabalho() * 0.1 + this.getTic() * 0.15 + this.getRelatorio() * 0.1 + this.getProva() * 0.3);
        return media;
    }
    /*
    MEDIA TEORICA TECNICA
    */
    public double media(float tic, double prova, double apostila, double trabalho, float relatorio){   
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTic() * 0.15 + this.getRelatorio() * 0.1 + this.getProva() * 0.6);
        return media;
    }
    /*
    MEDIA REGULAR NORMAL
    */
    public double media(double prova, float trilha, double apostila, float avaliativa, double trabalho){ 
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTrilha() * 0.15 + this.getAvaliativa() * 0.2 + this.getProva() * 0.5);
        return media;
    }
    /*
    MEDIA REGULAR TERCEIRO
    */
    public double media(double prova, float trilha, double trabalho, float simulado, float avaliativa, double apostila){
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTrilha() * 0.15 + this.getAvaliativa() * 0.1 +  this.getSimulado() * 0.2 + this.getProva() * 0.4);
        return media;
    }
    
    /**
     * @return the prova
     */
    public double getProva() {
        return prova;
    }

    /**
     * @param prova the prova to set
     */
    public void setProva(double prova) {
        this.prova = prova;
    }

    /**
     * @return the tic
     */
    public float getTic() {
        return tic;
    }

    /**
     * @param tic the tic to set
     */
    public void setTic(float tic) {
        this.tic = tic;
    }

    /**
     * @return the apostila
     */
    public double getApostila() {
        return apostila;
    }

    /**
     * @param apostila the apostila to set
     */
    public void setApostila(double apostila) {
        this.apostila = apostila;
    }

    /**
     * @return the relatorio
     */
    public float getRelatorio() {
        return relatorio;
    }

    /**
     * @param relatorio the relatorio to set
     */
    public void setRelatorio(float relatorio) {
        this.relatorio = relatorio;
    }

    /**
     * @return the tarefa
     */
    public float getTarefa() {
        return tarefa;
    }

    /**
     * @param tarefa the tarefa to set
     */
    public void setTarefa(float tarefa) {
        this.tarefa = tarefa;
    }

    /**
     * @return the trilha
     */
    public float getTrilha() {
        return trilha;
    }

    /**
     * @param trilha the trilha to set
     */
    public void setTrilha(float trilha) {
        this.trilha = trilha;
    }

    /**
     * @return the avaliativa
     */
    public float getAvaliativa() {
        return avaliativa;
    }

    /**
     * @param avaliativa the avaliativa to set
     */
    public void setAvaliativa(float avaliativa) {
        this.avaliativa = avaliativa;
    }

    /**
     * @return the simulado
     */
    public float getSimulado() {
        return simulado;
    }

    /**
     * @param simulado the simulado to set
     */
    public void setSimulado(float simulado){
        this.simulado = simulado;
    }

    /**
     * @return the trabalho
     */
    public double getTrabalho() {
        return trabalho;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }
    
}

