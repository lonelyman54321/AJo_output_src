/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from kY2
 */
public final class ky2_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final uk2_0 a(Tl3 object, int n3) {
        String string2;
        int n4;
        Sl sl = ((Tl3)object).a.a;
        int n7 = sl.length();
        if (n7 == 0) return ((Tl3)object).j(n3);
        n7 = ((Tl3)object).f(n3);
        if (n3 != 0) {
            n4 = n3 + -1;
            if (n7 == (n4 = ((Tl3)object).f(n4))) return ((Tl3)object).a(n3);
        }
        if (n3 == (n4 = (string2 = ((Tl3)object).a.a.a).length())) return ((Tl3)object).j(n3);
        n4 = n3 + 1;
        if (n7 == (n4 = ((Tl3)object).f(n4))) return ((Tl3)object).a(n3);
        return ((Tl3)object).j(n3);
    }
}

