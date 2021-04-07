

public class TeamAssignment {
    public static void main(String[] args) {

    // method to add all the numbers in a List<Integer>: int sum(List<Integer> list) {}

    List<Integer> myInts = new ArrayList(5,6,9,3,8);

    int total = 0;
        for (Integer i : myInts) {
        total += i;
    }
        System.out.println(total);
    }
}

   



