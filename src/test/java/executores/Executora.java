package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {

    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();

        JonasRobo meuAmigoJonas = new JonasRobo();



        umaGaiaRobo.abrirChrome();
        umaGaiaRobo.fazerLogin();
        umaGaiaRobo.lancarNota();

        meuAmigoJonas.extrairRelatorio();
    }
}
