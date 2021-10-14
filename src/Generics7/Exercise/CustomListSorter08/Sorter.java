package Generics7.Exercise.CustomListSorter08;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> customList) {
        for (int i = 0; i < customList.size(); i++) {
            T element = customList.getIndex(i);
            for (int j = i + 1; j < customList.size(); j++) {
                T nextElement = customList.getIndex(j);
                if (element.compareTo(nextElement) > 0) {
                    customList.swap(i, j);
                }
            }
        }
    }
}