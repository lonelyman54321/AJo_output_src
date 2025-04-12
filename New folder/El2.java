/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.d;

public final class El2 {
    public static final float a = 56;
    public static final vl2 b;
    public static final El2$b c;

    static {
        mz0_2 mz0_22 = mz0_2.a;
        pg2_0 pg2_02 = pg2_0.Horizontal;
        t83$a t83$a = t83$a.a;
        El2$a el2$a = new El2$a();
        c80 c802 = d.a(f.a);
        Object object = new vl2(mz0_22, 0, 0, 0, pg2_02, 0, 0, 0, t83$a, el2$a, c802);
        b = object;
        c = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final long a(kl2_1 kl2_12, int n3) {
        pg2_0 pg2_02;
        int n4 = kl2_12.i();
        int n7 = kl2_12.getPageSize() + n4;
        long l2 = n3;
        long l3 = n7;
        l2 *= l3;
        l3 = kl2_12.e();
        l2 += l3;
        n3 = kl2_12.c();
        l3 = n3;
        l2 += l3;
        pg2_0 pg2_03 = kl2_12.a();
        if (pg2_03 == (pg2_02 = pg2_0.Horizontal)) {
            l3 = kl2_12.b();
            n3 = 32;
            l3 >>= n3;
        } else {
            l3 = kl2_12.b();
            long l4 = 0xFFFFFFFFL;
            l3 &= l4;
        }
        n3 = (int)l3;
        kl2_12.m().getClass();
        int n8 = kotlin.ranges.f.g(0, 0, n3);
        long l7 = n3 - n8;
        return kotlin.ranges.f.b(l2 - l7, 0L);
    }

    public static final hm0_0 b(Function0 function0, b30_0 object) {
        Object object2;
        Object[] objectArray = new Object[]{};
        ds2_0 ds2_02 = hm0_0.H;
        boolean bl2 = object.c(0);
        boolean bl3 = object.b(0.0f);
        bl2 |= bl3;
        bl3 = object.J(function0);
        Object object3 = object.v();
        if ((bl2 |= bl3) || object3 == (object2 = b30$a.a)) {
            object3 = new Gl2(0, 0.0f, function0);
            object.o(object3);
        }
        object2 = object3;
        object2 = (Function0)object3;
        object = (hm0_0)wi2_0.b(objectArray, ds2_02, (Function0)object2, (b30_0)object, 0, 4);
        ((hm0_0)object).G.setValue(function0);
        return object;
    }
}

