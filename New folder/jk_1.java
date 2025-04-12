/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jk
 */
public final class jk_1 {
    public static final xa3_2 a = Hl.b(0.0f, 7, null);

    static {
        new xs0_0(0.1f);
        float f5 = 0.5f;
        bo1_1.a(f5, f5);
        h72.a(f5, f5);
    }

    public static final ib3_0 a(float f5, Qs3 qs3, String string2, b30_0 b30_02, int n3, int n4) {
        if ((n4 &= 4) != 0) {
            string2 = "DpAnimation";
        }
        xs0_0 xs0_02 = new xs0_0(f5);
        Ws3 ws3 = ya3_0.c;
        int n7 = n3 << 3 & 0x380;
        int n8 = n3 << 6 & 0xE000;
        int n10 = n7 | n8;
        return jk_1.c(xs0_02, ws3, qs3, null, string2, null, b30_02, n10, 8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final ib3_0 b(float f5, Gl object, String object2, b30_0 b30_02, int n3, int n4) {
        if ((n4 &= 8) != 0) {
            object2 = "FloatAnimation";
        }
        Object object3 = object2;
        object2 = a;
        n4 = 1008981770;
        float f6 = 0.01f;
        int n7 = 3;
        if (object == object2) {
            b30_02.K(1125598679);
            boolean bl2 = b30_02.b(f6);
            object2 = b30_02.v();
            if (bl2 || object2 == (object = b30$a.a)) {
                object = Float.valueOf(f6);
                boolean bl3 = false;
                object2 = Hl.b(0.0f, n7, object);
                b30_02.o(object2);
            }
            object = object2;
            object = (xa3_2)object2;
            b30_02.E();
        } else {
            int n8 = 1125708605;
            b30_02.K(n8);
            b30_02.E();
        }
        Object object4 = object;
        Float f7 = Float.valueOf(f5);
        object = FloatCompanionObject.INSTANCE;
        Ws3 ws3 = ya3_0.a;
        Float f8 = Float.valueOf(f6);
        int n10 = n3 << 3 & 0xE000;
        return jk_1.c(f7, ws3, (Gl)object4, f8, (String)object3, null, b30_02, n10, 0);
    }

    public static final ib3_0 c(Object object, Vs3 object2, Gl object3, Float object4, String object5, Function1 function1, b30_0 b30_02, int n3, int n4) {
        float f5;
        int n7;
        int n8;
        Object object6;
        Object object7;
        Object object8;
        Object object9 = object;
        Object object10 = object3;
        b30_0 b30_03 = b30_02;
        b30$a$a b30$a$a = b30$a.a;
        int n10 = n4 & 8;
        int n14 = 0;
        Object object11 = null;
        if (n10 != 0) {
            n10 = 0;
            object8 = null;
        } else {
            object8 = object4;
        }
        Object object12 = b30_02.v();
        if (object12 == b30$a$a) {
            object12 = J83.g(null);
            b30_03.o(object12);
        }
        object12 = (tr1_0)object12;
        Object object13 = b30_02.v();
        if (object13 == b30$a$a) {
            object7 = object2;
            object6 = object5;
            object13 = new Lj(object, (Vs3)object2, object8, (String)object5);
            b30_03.o(object13);
        }
        object13 = (Lj)object13;
        object7 = J83.j(function1, b30_02);
        if (object8 != null && (n8 = object10 instanceof xa3_2) != 0) {
            object6 = object10;
            object6 = (xa3_2)object10;
            Object object14 = ((xa3_2)object6).c;
            n7 = Intrinsics.areEqual(object14, object8);
            if (n7 == 0) {
                float f6 = ((xa3_2)object6).a;
                f5 = ((xa3_2)object6).b;
                object10 = new xa3_2(f6, f5, object8);
            }
        }
        object10 = J83.j(object10, b30_03);
        object8 = b30_02.v();
        n8 = 6;
        f5 = 8.4E-45f;
        if (object8 == b30$a$a) {
            n10 = -1;
            object8 = sr_2.a(n10, n8, null);
            b30_03.o(object8);
        }
        object8 = (dr_2)object8;
        n14 = b30_03.x(object8);
        n7 = n3 & 0xE ^ n8;
        int n15 = 4;
        if (n7 > n15 && (n7 = (int)(b30_03.x(object) ? 1 : 0)) != 0 || (n8 = n3 & 6) == n15) {
            n8 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n8 = 0;
            f5 = 0.0f;
            object6 = null;
        }
        object6 = b30_02.v();
        if ((n14 |= n8) != 0 || object6 == b30$a$a) {
            object6 = new hk_0((dr_2)object8, object);
            b30_03.o(object6);
        }
        object6 = (Function0)object6;
        object9 = ly0_0.a;
        b30_03.q((Function0)object6);
        int n16 = b30_03.x(object8);
        n14 = (int)(b30_03.x(object13) ? 1 : 0);
        int n17 = n16 | n14;
        n14 = (int)(b30_03.J(object10) ? 1 : 0);
        int n18 = n17 | n14;
        n14 = (int)(b30_03.J(object7) ? 1 : 0);
        int n19 = n18 | n14;
        object11 = b30_02.v();
        if (n19 != 0 || object11 == b30$a$a) {
            boolean bl2 = false;
            object9 = null;
            object = object11;
            object2 = object8;
            object3 = object13;
            object4 = object10;
            object5 = object7;
            function1 = null;
            object11 = new ik_0((dr_2)object8, (Lj)object13, (tr1_0)object10, (tr1_0)object7, null);
            b30_03.o(object11);
        }
        object11 = (Function2)object11;
        ly0_0.d(b30_03, object8, (Function2)object11);
        object9 = (ib3_0)object12.getValue();
        if (object9 == null) {
            object9 = ((Lj)object13).c;
        }
        return object9;
    }
}

