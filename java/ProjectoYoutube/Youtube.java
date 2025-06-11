public class Youtube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de java");
        v[1] = new Video("Aula de PHP");
        v[2] = new Video("Henrique stress");
        v[2] = new Video("Gameplayrj");
         Gafanhoto g[] = new Gafanhoto[4];
         g[0] = new Gafanhoto("Josemar", 19, " M", "teamburguel");
         g[1] = new Gafanhoto("Kimy", 16, " M", "jerome");
         Visualizacao i = new Visualizacao(g[1], v[2]);
         System.out.println(i.toString());
         /*System.out.println("Videos--------------------------------");
         System.out.println(v[0].toString());   
         System.out.println(v[1].toString());
         System.out.println(v[2].toString());   
         System.out.println(v[3].toString());   
         System.out.println("Gafanhotos---------------------------");
         System.out.println(g[0].toString());
         System.out.println(g[1].toString());*/
         
      

    }
    
}