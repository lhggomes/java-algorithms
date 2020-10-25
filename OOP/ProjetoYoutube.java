package projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 - POO");
        v[1] = new Video("Aula 12 - PHP");
        v[2] = new Video("Zero");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Lucas Gomes", "Masculino", 18, "juba");
        g[1] = new Gafanhoto("Fellipe", "Feminino", 18, "FeOl");
        
        Visualizacao visu = new Visualizacao(g[0], v[2]);
        System.out.println(visu.toString());

    }

}
