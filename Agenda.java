/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaprincipal;

/**
 *
 * @author master
 */
public class Agenda  {
    private int idAgenda;
    private String Paciente_Cpf;
    private String Medico_Crm;
    private String Data;
    private String Hora;

    public Agenda(String Paciente_Cpf, String Medico_Crm, String Data, String Hora) {
        this.Paciente_Cpf = Paciente_Cpf;
        this.Medico_Crm = Medico_Crm;
        this.Data = Data;
        this.Hora = Hora;
    }

    public Agenda(){
        this.idAgenda = 0;
        this.Paciente_Cpf = "";
        this.Medico_Crm = "";
        this.Data = "";
        this.Hora = "";    
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }
    
    public String getPaciente_Cpf() {
        return Paciente_Cpf;
    }

    public void setPaciente_Cpf(String Paciente_Cpf) {
        this.Paciente_Cpf = Paciente_Cpf;
    }

    public String getMedico_Crm() {
        return Medico_Crm;
    }

    public void setMedico_Crm(String Medico_Crm) {
        this.Medico_Crm = Medico_Crm;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    
    
    
 
}
