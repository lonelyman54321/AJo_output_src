/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class qt1 {
    public static final Qv1 a;

    static {
        Qv1 qv1;
        Ov1$c ov1$c = new Ov1(false);
        Ov1$b ov1$b = Ov1$b.b;
        a = qv1 = new Qv1(ov1$b, ov1$c, ov1$c);
    }

    public static final lt1 a(ee2_2 ee2_22, b30_0 b30_02) {
        Intrinsics.checkNotNullParameter(ee2_22, "<this>");
        int n3 = 388053246;
        b30_02.u(n3);
        f f5 = f.a;
        b30_02.u(1046463091);
        boolean bl2 = b30_02.J(ee2_22);
        Object object = b30_02.v();
        b30$a$a b30$a$a = b30$a.a;
        if (bl2 || object == b30$a$a) {
            object = new lt1(ee2_22);
            b30_02.o(object);
        }
        object = (lt1)object;
        b30_02.I();
        b30_02.u(1046463169);
        boolean bl3 = b30_02.x(f5);
        bl2 = b30_02.x(object);
        Object object2 = b30_02.v();
        if ((bl3 |= bl2) || object2 == b30$a$a) {
            object2 = new ot1_1(f5, (lt1)object, null);
            b30_02.o(object2);
        }
        object2 = (Function2)object2;
        b30_02.I();
        ly0_0.d(b30_02, object, (Function2)object2);
        b30_02.u(1046463438);
        bl3 = b30_02.x(f5);
        bl2 = b30_02.x(object);
        object2 = b30_02.v();
        if ((bl3 |= bl2) || object2 == b30$a$a) {
            object2 = new pt1_1(f5, (lt1)object, null);
            b30_02.o(object2);
        }
        object2 = (Function2)object2;
        b30_02.I();
        ly0_0.d(b30_02, object, (Function2)object2);
        b30_02.I();
        return object;
    }
}

