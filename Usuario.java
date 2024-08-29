package sistemaprincipal;

public class Usuario extends Pessoa {
    private int idUsuario;
    private String Nome;
    private String Email;
    private String Usuario;
    private String Senha;

    public Usuario(int idUsuario, String Nome, String Email, String Usuario, String Senha) {
        this.idUsuario = idUsuario;
        this.Nome = Nome;
        this.Email = Email;
        this.Usuario = Usuario;
        this.Senha = Senha;
    }
    
    public Usuario(){
    this.idUsuario = 0;
    this.Nome = "";
    this.Email = "";
    this.Usuario = "";
    this.Senha = "";
}

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    
   

    
}