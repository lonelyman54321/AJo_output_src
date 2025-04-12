/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class N32
implements Pg2 {
    public static final N32 a;

    static {
        N32 n32;
        a = n32 = new Object();
    }

    public final boolean a() {
        return false;
    }

    public final Object b(long l2, lu2_2 object, f80_0 f80_02) {
        j90_0 j90_02;
        object = ((lu2_2)object).d;
        lu2_2 lu2_22 = new lu2_2((ku2_0)object, f80_02);
        lu2_22.c = l2;
        Object object2 = Unit.a;
        if ((object2 = lu2_22.invokeSuspend(object2)) == (j90_02 = j90_0.COROUTINE_SUSPENDED)) {
            return object2;
        }
        return Unit.a;
    }

    public final LP1 c() {
        return LP1$a.b;
    }

    public final long d(long l2, int n3, kU2$d object) {
        object.getClass();
        Object object2 = ((kU2$d)object).c;
        object = ((ku2_0)object2).h;
        int n4 = ((ku2_0)object2).g;
        l2 = ku2_0.a((ku2_0)object2, (QT2)object, l2, n4);
        object2 = new e72(l2);
        return ((e72)object2).a;
    }
}

