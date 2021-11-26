

public class app {
    public static void main(String []args) {
         
        TreeSortGenerics <Integer> tree = new TreeSortGenerics<>(); 
        Integer arr[] = {5, 4, 7, 3, 2, 11, 25, 88, 0, 2}; 
        tree.treeSort(arr); 
        tree.emOrdemRecursiva(tree.raiz); 
        System.out.println();

        TreeSortGenerics <String> tree2 = new TreeSortGenerics<>(); 
        String arr2[] = {"Alice", "Luana", "Nelza", "Karen", "Mirian","Alice", "Samuel", "Denner", "Ramires","Livian", "Neferides", "Tulio", "Demetrice", "Azenate"}; 
        tree2.treeSort(arr2); 
        tree2.emOrdemRecursiva(tree2.raiz);
        System.out.println();

        TreeSortGenerics <Double> tree3 = new TreeSortGenerics<>(); 
        Double arr3[] = {12.32, 0.35, 0.02, 0.36, 0.82, 34.33, 12.1, 87.3};
        tree3.treeSort(arr3); 
        tree3.emOrdemRecursiva(tree3.raiz);
        System.out.println("\n");


    }
}
