public class Usuario {
    public static void main(String[] args) throws Exception {
     
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
            // Ligando a TV com o método ligar no arquivo SmartTv.java        
        //System.out.println("Novo status - TV ligada? " + smartTv.ligada);

        smartTv.desligar();
            // Desligando a TV com o método ligar no arquivo SmartTv.java
        //System.out.println("Botão desligar. Novo status - TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
            // Aumentando o volume da TV com o método aumentarVolume
            // sys.out está no método 

        smartTv.diminuirVolume();
            // Diminuindo o volume da TV com o método diminuirVolume
            // sys.out está no método 

        smartTv.subirCanal();
            // Aumentando em 1 o canal
            // sys.out está no método

        smartTv.descerCanal();
            // Diminuindo em 1 o canal
            // sys.out está no método

        smartTv.mudarCanal(11);
        System.out.println("Canal atual: " + smartTv.canal);
            // Mudar o canal para um canal escolhido pelo usuário

    }
}
