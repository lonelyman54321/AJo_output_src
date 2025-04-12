/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.d;

public final class jt1 {
    public static final float a;
    public static final Ws1 b;

    static {
        Ws1 ws1;
        a = 1.0f;
        jt1$a jt1$a = new jt1$a();
        mz0_2 mz0_22 = mz0_2.a;
        pg2_0 pg2_02 = pg2_0.Vertical;
        c80 c802 = d.a(f.a);
        Wo0 wo0 = km3.a();
        long l2 = f60.b(0, 0, 15);
        b = ws1 = new Ws1(null, 0, false, 0.0f, jt1$a, 0.0f, false, c802, wo0, l2, mz0_22, 0, 0, 0, pg2_02, 0, 0);
    }

    public static final ft1_2 a(b30_0 b30_02) {
        Object object;
        Object[] objectArray = new Object[]{};
        ds2_0 ds2_02 = ft1_2.x;
        boolean bl2 = b30_02.c(0);
        boolean bl3 = b30_02.c(0);
        Object object2 = b30_02.v();
        if ((bl2 |= bl3) || object2 == (object = b30$a.a)) {
            object2 = new kt1_0(0, 0);
            b30_02.o(object2);
        }
        object = object2;
        object = (Function0)object2;
        object2 = b30_02;
        return (ft1_2)wi2_0.b(objectArray, ds2_02, (Function0)object, b30_02, 0, 4);
    }
}

