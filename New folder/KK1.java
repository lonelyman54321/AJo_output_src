/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public final class KK1 {
    public static final void a(u10 u102, b30_0 object, int n3) {
        Serializable serializable;
        object = object.g(-1322912246);
        int n4 = n3 & 6;
        int n7 = 2;
        if (n4 == 0) {
            n4 = ((j30_0)object).x(u102) ? 1 : 0;
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n8 = n4 & 3;
        if (n8 == n7 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            serializable = n4 &= 0xE;
            u102.invoke(object, serializable);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            serializable = new jk1_0(u102, n3);
            ((CF2)object).d = serializable;
        }
    }
}

