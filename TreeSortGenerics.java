
//classe generica que possui como parametro um elemento do tipo T
public class TreeSortGenerics <T extends Comparable<? super T>> implements StrategeySort<T> {

    // Classe para árvore binária de pesquisa
    public class Node  { 
        T key; 
        Node esqr, dir; 
  
        public Node(T array) { 
            key = array; 
            esqr = null; 
            dir = null;
        } 
    } 
  
    // raiz
    Node raiz; 
  
    // Construtor 
    TreeSortGenerics()  {  
        raiz = null;  
    } 
  
    // funcao insert chama metodo insertRec() 
    void insert(T array) { 
        raiz = insertRec(raiz, array); 
    } 

    //A função recursiva insere uma nova chave na arvore
    Node insertRec(Node raiz, T array)  { 
        // Se a árvore estiver vazia, retornar um novo nó 
        if (raiz == null)  { 
            raiz = new Node(array); 
            return raiz; 
        } 
  
       // Caso contrario, descer da arvore
        if (array.compareTo(raiz.key) < 0) {
            raiz.esqr = insertRec(raiz.esqr, array); 
        
        //Mova para a direita para um valor maior do que o nó pai
        }else if (array.compareTo(raiz.key) > 0) {
            raiz.dir = insertRec(raiz.dir, array);  
        }
        return raiz; 
    } 
      
    // travessia em Ordem Recursiva da arvore
    void emOrdemRecursiva(Node raiz)  { 
        if (raiz != null) { 
            emOrdemRecursiva(raiz.esqr); 
            System.out.print(raiz.key + " "); 
            emOrdemRecursiva(raiz.dir); 
        } 
    } 

    void treeSort(T array[]) { 
        for(int i = 0; i < array.length; i++) { 
            insert(array[i]); 
        }           
    } 
 
    @Override
    public void sort(T[] array, T[] auxArray) {
        treeSort(array);   
    }
    
}

