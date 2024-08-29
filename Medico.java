package sistemaprincipal;


public class Medico extends Pessoa {
    private String crm;

    public Medico(String nome, String endereco, String cpf, String email, String telefone, String crm) {
        super(nome, endereco, cpf, email, telefone);
        this.crm = crm;
        
    }
    public Medico() {
        
        this.crm = "";
        
    }
     public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}