package sistemaprincipal;

public class Paciente extends Pessoa {
    private String numSus;
    private String numConvenio;

    public Paciente(String nome, String endereco, String cpf, String email, String telefone, String numSus,
            String numConvenio) {
        super(nome, endereco, cpf, email, telefone);
        this.numSus = numSus;
        this.numConvenio = numConvenio;
    }
    public Paciente(){
        this.numSus = "";
        this.numConvenio = "";
        
    }
    
    public String getNumSus() {
        return numSus;
    }

    public void setNumSus(String numSus) {
        this.numSus = numSus;
    }

    public String getNumConvenio() {
        return numConvenio;
    }

    public void setNumConvenio(String numConvenio) {
        this.numConvenio = numConvenio;
    }

}
