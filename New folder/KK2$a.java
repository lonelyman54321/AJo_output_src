/*
 * Decompiled with CFR 0.152.
 */
public final class KK2$a
extends kk2_1 {
    public KK2$a() {
        this(null, null, 3);
    }

    public KK2$a(String string2, Object object, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            object = null;
        }
        super(object, string2);
    }
}

