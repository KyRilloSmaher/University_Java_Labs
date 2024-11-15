package QuestionThree;



class ComparableSorting
{
    public static Comparable swap(Comparable x,Comparable  dumy)
    {
        return x;
    }
     // This means that the method accepts an array of type T,
     // where T must be a class that implements the Comparable interface.
    public static <T extends Comparable <T>> void sort(T A[])
    {
        for (int i = 0; i < A.length; i++)
        {
            for (int j = i + 1; j < A.length; j++) 
            {
                if(A[i].compareTo(A[j]) > 0)
                    A[i] = (T) swap(A[j], A[j] = A[i]); // from the Lecture
            }
        }
    }
}