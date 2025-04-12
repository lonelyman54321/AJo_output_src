/*
 * Decompiled with CFR 0.152.
 */
public final class kU2$c
implements tU1 {
    public final /* synthetic */ ku2_0 a;

    public kU2$c(ku2_0 ku2_02) {
        this.a = ku2_02;
    }

    public final long a(long l2) {
        ku2_0 ku2_02 = this.a;
        QT2 qT2 = ku2_02.h;
        return ku2_0.a(ku2_02, qT2, l2, 1);
    }

    public final long b(int n3, long l2) {
        long l3;
        dU2 dU22;
        boolean bl2;
        Object object = this.a;
        ((ku2_0)object).g = n3;
        Object object2 = ((ku2_0)object).b;
        if (object2 != null && ((bl2 = (dU22 = ((ku2_0)object).a).d()) || (bl2 = (dU22 = ((ku2_0)object).a).c()))) {
            n3 = ((ku2_0)object).g;
            object = ((ku2_0)object).j;
            l3 = object2.d(l2, n3, (kU2$d)object);
        } else {
            object2 = ((ku2_0)object).h;
            l3 = ku2_0.a((ku2_0)object, (QT2)object2, l2, n3);
        }
        return l3;
    }
}

