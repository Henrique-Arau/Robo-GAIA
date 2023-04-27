package executores;

import robos.GaiaRobo;


public class Executora {

    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();

        umaGaiaRobo.acessarUmSiteChamado("http://www.juliodelima.com.br/taskit/");
        umaGaiaRobo.fazerLogin("", "");
        umaGaiaRobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarUmSiteChamado("https://www.google.com/");

    }
}
