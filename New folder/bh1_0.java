/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from bh1
 */
public final class bh1_0 {
    public static final Vg1$a a(vg1_0 vg1_02, float f5, float f6, Ug1 ug1, b30_0 b30_02, int n3) {
        Float f7 = Float.valueOf(f5);
        Float f8 = Float.valueOf(f6);
        Ws3 ws3 = ya3_0.a;
        int n4 = n3 & 0x3FE | 0x8000;
        return bh1_0.b(vg1_02, f7, f8, ws3, ug1, "FloatAnimation", b30_02, n4, 0);
    }

    public static final Vg1$a b(vg1_0 vg1_02, Number object, Number object2, Ws3 ws3, Ug1 ug1, String object3, b30_0 b30_02, int n3, int n4) {
        b30$a$a b30$a$a;
        object3 = b30_02.v();
        if (object3 == (b30$a$a = b30$a.a)) {
            object3 = new Vg1$a(vg1_02, (Number)object, (Number)object2, ws3, ug1);
            b30_02.o(object3);
        }
        object3 = (Vg1$a)object3;
        int n7 = n3 & 0x70 ^ 0x30;
        int n8 = 32;
        int n10 = 0;
        if (n7 > n8 && (n7 = (int)(b30_02.x(object) ? 1 : 0)) != 0 || (n7 = n3 & 0x30) == n8) {
            n7 = 1;
        } else {
            n7 = 0;
            ws3 = null;
        }
        n8 = n3 & 0x380 ^ 0x180;
        int n14 = 256;
        n8 = n8 > n14 && (n8 = (int)(b30_02.x(object2) ? 1 : 0)) != 0 || (n8 = n3 & 0x180) == n14 ? 1 : 0;
        n7 |= n8;
        n8 = 0xE000 & n3 ^ 0x6000;
        n14 = 16384;
        if (n8 > n14 && (n8 = (int)(b30_02.x(ug1) ? 1 : 0)) != 0 || (n3 &= 0x6000) == n14) {
            n10 = 1;
        }
        Object object4 = b30_02.v();
        if ((n7 |= n10) != 0 || object4 == b30$a$a) {
            object4 = new yg1_0((Number)object, (Vg1$a)object3, (Number)object2, ug1);
            b30_02.o(object4);
        }
        object4 = (Function0)object4;
        object = ly0_0.a;
        b30_02.q((Function0)object4);
        boolean bl2 = b30_02.x(vg1_02);
        object2 = b30_02.v();
        if (bl2 || object2 == b30$a$a) {
            object2 = new ah1_0(vg1_02, (Vg1$a)object3);
            b30_02.o(object2);
        }
        object2 = (Function1)object2;
        ly0_0.b(object3, (Function1)object2, b30_02);
        return object3;
    }

    public static final vg1_0 c(b30_0 b30_02) {
        Object object;
        Object object2 = b30_02.v();
        if (object2 == (object = b30$a.a)) {
            object = "InfiniteTransition";
            object2 = new vg1_0((String)object);
            b30_02.o(object2);
        }
        object2 = (vg1_0)object2;
        ((vg1_0)object2).a(b30_02, 0);
        return object2;
    }
}

