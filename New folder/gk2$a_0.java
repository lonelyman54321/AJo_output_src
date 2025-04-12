/*
 * Decompiled with CFR 0.152.
 */
import kotlin.text.b;

/*
 * Renamed from GK2$a
 */
public final class gk2$a_0 {
    public static final boolean a(hn2_2 comparable) {
        int n3;
        Comparable comparable2 = gk2_2.e;
        comparable.getClass();
        comparable2 = i_0.a;
        ff_2 ff_22 = comparable.a;
        int n4 = ff_2.k(ff_22, (ff_2)comparable2);
        int n7 = -1;
        if (n4 == n7) {
            comparable2 = i_0.b;
            n4 = ff_2.k(ff_22, (ff_2)comparable2);
        }
        int n8 = 1;
        int n10 = 2;
        if (n4 != n7) {
            boolean bl2 = false;
            comparable = null;
            ff_22 = ff_2.o(ff_22, n4 += n8, 0, n10);
        } else if ((comparable = comparable.g()) != null && (n3 = ff_22.d()) == n10) {
            ff_22 = ff_2.d;
        }
        return b.h(ff_22.q(), ".class", n8 != 0) ^ n8;
    }
}

