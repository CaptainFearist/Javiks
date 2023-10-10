class LogicalOpTable {
    public static void main(String[] args) {
        boolean A, B;

        System.out.println("A\t\tB\t\tAND\t\tOR\t\tXOR\t\tNOT");

        A = true;
        B = false;
        System.out.print(A + "\t" + B + "\t");
        System.out.print((A & B) + "\t" + (A | B) + "\t");
        System.out.println((A ^ B) + "\t" + (!A));

        A = true;
        B = false;
        System.out.print(A + "\t" + B + "\t");
        System.out.print((A & B) + "\t" + (A | B) + "\t");
        System.out.println((A ^ B) + "\t" + (!A));

        A = false;
        B = true;
        System.out.print(A + "\t" + B + "\t");
        System.out.print((A & B) + "\t" + (A | B) + "\t");
        System.out.println((A ^ B) + "\t" + (!A));

        A = false;
        B = false;
        System.out.print(A + "\t" + B + "\t");
        System.out.print((A & B) + "\t" + (A | B) + "\t");
        System.out.println((A ^ B) + "\t" + (!A));
    }
}
