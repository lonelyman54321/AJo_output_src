/*
 * Decompiled with CFR 0.152.
 */
public final class R92$b {
    public static final void a(R92 object, int n3, int n4) {
        int n7 = ((R92)object).g;
        int n8 = 1 << n3;
        int n10 = n7 & n8;
        if (n10 == 0) {
            ((R92)object).g = n8 |= n7;
            int[] nArray = ((R92)object).c;
            n7 = ((R92)object).d;
            int n14 = ((R92)object).V().a;
            n7 = n7 - n14 + n3;
            nArray[n7] = n4;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Already pushed argument ");
        object = ((R92)object).V().b(n3);
        stringBuilder.append((String)object);
        sn2.c(stringBuilder.toString());
        throw null;
    }

    public static final void b(R92 object, int n3, Object object2) {
        int n4 = ((R92)object).h;
        int n7 = 1 << n3;
        int n8 = n4 & n7;
        if (n8 == 0) {
            ((R92)object).h = n7 |= n4;
            Object[] objectArray = ((R92)object).e;
            n4 = ((R92)object).f;
            int n10 = ((R92)object).V().b;
            n4 = n4 - n10 + n3;
            objectArray[n4] = object2;
            return;
        }
        object2 = new StringBuilder("Already pushed argument ");
        object = ((R92)object).V().c(n3);
        ((StringBuilder)object2).append((String)object);
        sn2.c(((StringBuilder)object2).toString());
        throw null;
    }
}

