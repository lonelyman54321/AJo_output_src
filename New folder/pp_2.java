/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Pp
 */
public class pp_2 {
    public static final void a(int n3, int n4) {
        if (n3 <= n4) {
            return;
        }
        String string2 = z41.a("toIndex (", ") is greater than size (", ").", n3, n4);
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(string2);
        throw indexOutOfBoundsException;
    }
}

