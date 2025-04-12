/*
 * Decompiled with CFR 0.152.
 */
public final class Zz3 {
    public static final Yz3 a;

    static {
        Yz3 yz3;
        a = yz3 = new Yz3(0, 0);
    }

    public static final dr3 a(EE3 object, Sl sl) {
        ((de3_0)object).getClass();
        object = sl.a;
        int n3 = ((String)object).length();
        Object object2 = sl.a;
        int n4 = ((String)object2).length();
        int n7 = 100;
        int n8 = Math.min(n3, n7);
        int n10 = 0;
        for (int i3 = 0; i3 < n8; ++i3) {
            Zz3.b(i3, n4, i3);
        }
        Zz3.b(n3, n4, n3);
        n7 = Math.min(n4, n7);
        while (n10 < n7) {
            Zz3.c(n10, n3, n10);
            ++n10;
        }
        Zz3.c(n4, n3, n4);
        n7 = sl.a.length();
        n8 = sl.a.length();
        object2 = new Yz3(n7, n8);
        object = new dr3(sl, (i72)object2);
        return object;
    }

    public static final void b(int n3, int n4, int n7) {
        if (n3 >= 0 && n3 <= n4) {
            return;
        }
        String string2 = tu.a(fQ2.a("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ", n7, n3), n4, ']');
        string2 = string2.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static final void c(int n3, int n4, int n7) {
        if (n3 >= 0 && n3 <= n4) {
            return;
        }
        String string2 = tu.a(fQ2.a("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ", n7, n3), n4, ']');
        string2 = string2.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

