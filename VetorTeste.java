
class VetorTeste {
    public static void main(String[] args){
    	Aluno a1 = new Aluno("Joao");
    	Aluno a2 = new Aluno("Jose");
    	 
    	vetor lista = new vetor();
    	lista.adiciona(a1);
    	lista.adiciona(a2);
    	
    	System.out.println(lista.tamanho());
    	lista.adiciona(a1);
    	System.out.println(lista.tamanho());
    	lista.adiciona(a2);
    	System.out.println(lista.tamanho());
    	System.out.println(lista);
    	
    	Aluno a3 = new Aluno("Danilo");
    	System.out.println(lista.contem(a3));
    	
    	Aluno x = lista.pega(1);
    	System.out.println(x);
    	
    	lista.remove(1);
    	System.out.println(lista);
    }
    
}
