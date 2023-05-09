package Entities;

public class Client
{

    private int numCli;
    private String nomCli;

    public Client(int numCli, String nomCli) {
        this.numCli = numCli;
        this.nomCli = nomCli;

    }

    public int getNumLiv() {
        return numCli;
    }

    public String getNomLiv() {
        return nomCli;
    }


}