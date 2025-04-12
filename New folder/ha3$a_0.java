/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hA3$a
 */
public final class ha3$a_0
extends Enum {
    private static final /* synthetic */ ha3$a_0[] $VALUES;
    public static final /* enum */ ha3$a_0 Age;
    public static final /* enum */ ha3$a_0 Birthday;
    public static final /* enum */ ha3$a_0 DOB;
    public static final /* enum */ ha3$a_0 Education;
    public static final /* enum */ ha3$a_0 Email;
    public static final /* enum */ ha3$a_0 FBID;
    public static final /* enum */ ha3$a_0 GPID;
    public static final /* enum */ ha3$a_0 Gender;
    public static final /* enum */ ha3$a_0 Married;
    public static final /* enum */ ha3$a_0 Name;
    public static final /* enum */ ha3$a_0 Phone;

    private static /* synthetic */ ha3$a_0[] $values() {
        ha3$a_0 ha3$a_0 = Name;
        ha3$a_0 = Email;
        ha3$a_0 = Education;
        ha3$a_0 = Married;
        ha3$a_0 = DOB;
        ha3$a_0 = Gender;
        ha3$a_0 = Phone;
        ha3$a_0 = Age;
        ha3$a_0 = FBID;
        ha3$a_0 = GPID;
        ha3$a_0 = Birthday;
        ha3$a_0[] ha3$a_0Array = new ha3$a_0[]{ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0, ha3$a_0};
        return ha3$a_0Array;
    }

    static {
        ha3$a_0 ha3$a_0;
        Name = ha3$a_0 = new ha3$a_0("Name", 0);
        Email = ha3$a_0 = new ha3$a_0("Email", 1);
        Education = ha3$a_0 = new ha3$a_0("Education", 2);
        Married = ha3$a_0 = new ha3$a_0("Married", 3);
        DOB = ha3$a_0 = new ha3$a_0("DOB", 4);
        Gender = ha3$a_0 = new ha3$a_0("Gender", 5);
        Phone = ha3$a_0 = new ha3$a_0("Phone", 6);
        Age = ha3$a_0 = new ha3$a_0("Age", 7);
        FBID = ha3$a_0 = new ha3$a_0("FBID", 8);
        GPID = ha3$a_0 = new ha3$a_0("GPID", 9);
        Birthday = ha3$a_0 = new ha3$a_0("Birthday", 10);
        $VALUES = ha3$a_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ha3$a_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ha3$a_0 valueOf(String string2) {
        return Enum.valueOf(ha3$a_0.class, string2);
    }

    public static ha3$a_0[] values() {
        return (ha3$a_0[])$VALUES.clone();
    }
}

