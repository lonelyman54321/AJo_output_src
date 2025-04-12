/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class At1 {
    public static final void a(u10 u102, b30_0 object, int n3) {
        int n4 = 0;
        Object object2 = null;
        object = object.g(674185128);
        int n7 = n3 & 6;
        int n8 = 2;
        if (n7 == 0) {
            n7 = ((j30_0)object).x(u102) ? 1 : 0;
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        if ((n7 &= 3) == n8 && (n7 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object3 = kS2.a;
            Object object4 = (Object[])((j30_0)object).j((H30)object3);
            int n10 = 1;
            Object object5 = new Object[n10];
            object5[0] = object4;
            Object object6 = new tt1_2((iS2)object4);
            Object object7 = CS2.a;
            Object object8 = st1_2.c;
            object7 = new ds2_0((Function2)object8, (Function1)object6);
            boolean bl2 = ((j30_0)object).x(object4);
            object8 = ((j30_0)object).v();
            if (bl2 || object8 == (object6 = b30$a.a)) {
                object8 = new zt1_2(object4, 0);
                ((j30_0)object).o(object8);
            }
            object6 = object8;
            object6 = (Function0)object8;
            object8 = null;
            int n14 = 4;
            object4 = object5;
            object5 = object7;
            object7 = object;
            object2 = (rt1_0)wi2_0.b(object4, (ds2_0)object5, (Function0)object6, (b30_0)object, 0, n14);
            object3 = ((vc3_1)object3).c(object2);
            object4 = new xt1_2((rt1_0)object2, u102);
            n4 = 1863926504;
            object2 = v10.c(n4, (fx0_2)object4, (b30_0)object);
            n8 = 56;
            L30.a((MB2)object3, (Function2)object2, (b30_0)object, n8);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            object2 = new yt1_2(u102, n3);
            ((CF2)object).d = object2;
        }
    }
}

