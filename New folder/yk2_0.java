/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.IntCompanionObject;

/*
 * Renamed from Yk2
 */
public final class yk2_0 {
    public static pi3_0 a(hm0_0 object, zl2 zl22, b30_0 b30_02, int n3, int n4) {
        Object object2;
        Object object3;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        if ((n4 &= 2) != 0) {
            zl22 = new zl2(n7);
        }
        vi0_0 vi0_02 = Ta3.a(b30_02);
        Object object4 = IntCompanionObject.INSTANCE;
        object4 = vE3.a;
        float f6 = n7;
        object4 = Float.valueOf(f6);
        float f7 = 400.0f;
        object4 = Hl.b(f7, n7, object4);
        Object object5 = O30.f;
        object5 = (Vo0)b30_02.j((H30)object5);
        Object object6 = O30.l;
        object6 = (bp1_0)((Object)b30_02.j((H30)object6));
        int n8 = n3 & 0xE ^ 6;
        int n10 = 4;
        n8 = n8 > n10 && (n8 = (int)(b30_02.J(object) ? 1 : 0)) != 0 || (n8 = n3 & 6) == n10 ? 1 : 0;
        n10 = (int)(b30_02.J(vi0_02) ? 1 : 0);
        n8 |= n10;
        n10 = (int)(b30_02.J(object4) ? 1 : 0);
        n8 |= n10;
        n10 = n3 & 0x70 ^ 0x30;
        int n14 = 32;
        if ((n10 <= n14 || (n10 = (int)(b30_02.J(zl22) ? 1 : 0)) == 0) && (n3 &= 0x30) != n14) {
            n7 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        n3 = n8 | n7;
        n7 = (int)(b30_02.J(object5) ? 1 : 0);
        n3 |= n7;
        n7 = (int)(b30_02.J(object6) ? 1 : 0);
        object3 = b30_02.v();
        if ((n3 |= n7) != 0 || object3 == (object2 = b30$a.a)) {
            n7 = 0x3F000000;
            f5 = 0.5f;
            object2 = new xk2_1((hm0_0)object, (bp1_0)((Object)object6), f5);
            object3 = new Al2((hm0_0)object, (xk2_1)object2, zl22);
            object = new m83((Al2)object3, vi0_02, (Gl)object4);
            b30_02.o(object);
            object3 = object;
        }
        return (pi3_0)object3;
    }
}

