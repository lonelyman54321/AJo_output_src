/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from gk
 */
public final class gk_1
implements qA3 {
    public static final gk_1 a;

    static {
        gk_1 gk_12;
        a = gk_12 = new Object();
    }

    public static nj_1 b(vm1_1 object, QB1 qB1) {
        ey_1 ey_12 = ey_1.a;
        object = Fo1.a((gm1_0)object, qB1, 1.0f, ey_12, false);
        nj_1 nj_12 = new tv_0((List)object);
        return nj_12;
    }

    public static oj_1 c(gm1_0 object, QB1 qB1, boolean bl2) {
        float f5;
        if (bl2) {
            f5 = wz3.c();
        } else {
            int n3 = 1065353216;
            f5 = 1.0f;
        }
        op_0 op_02 = op_0.a;
        object = Fo1.a((gm1_0)object, qB1, f5, op_02, false);
        oj_1 oj_12 = new tv_0((List)object);
        return oj_12;
    }

    public static pj_0 d(vm1_1 object, QB1 qB1, int n3) {
        Object object2 = new Object();
        ((E01)object2).a = n3;
        n3 = 1065353216;
        float f5 = 1.0f;
        object = Fo1.a((gm1_0)object, qB1, f5, (qA3)object2, false);
        qB1 = null;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)object).size()); ++i3) {
            float[] fArray;
            int n4;
            float[] fArray2;
            int n7;
            Object object3 = (Bo1)((ArrayList)object).get(i3);
            object2 = (B01)((Bo1)object3).b;
            Object object4 = (B01)((Bo1)object3).c;
            if (object2 != null && object4 != null && (n7 = (fArray2 = ((B01)object2).a).length) != (n4 = (fArray = ((B01)object4).a).length)) {
                n3 = fArray2.length;
                n7 = fArray.length;
                float[] fArray3 = new float[n3 += n7];
                n4 = fArray2.length;
                System.arraycopy(fArray2, 0, fArray3, 0, n4);
                int n8 = fArray2.length;
                n4 = fArray.length;
                System.arraycopy(fArray, 0, fArray3, n8, n4);
                Arrays.sort(fArray3);
                n8 = 2143289344;
                float f6 = 0.0f / 0.0f;
                fArray = null;
                n4 = 0;
                for (int i8 = 0; i8 < n3; ++i8) {
                    float f7 = fArray3[i8];
                    float f8 = f7 - f6;
                    Object object5 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                    if (object5 == false) continue;
                    fArray3[n4] = f7;
                    ++n4;
                    f6 = fArray3[i8];
                }
                object3 = Arrays.copyOfRange(fArray3, 0, n4);
                object2 = ((B01)object2).b((float[])object3);
                object3 = ((B01)object4).b((float[])object3);
                object3 = object4 = new Bo1((B01)object2, (B01)object3);
            }
            ((ArrayList)object).set(i3, object3);
        }
        pj_0 pj_02 = new tv_0((List)object);
        return pj_02;
    }

    public static qj_0 e(gm1_0 object, QB1 qB1) {
        gk_1 gk_12 = a;
        object = Fo1.a((gm1_0)object, qB1, 1.0f, gk_12, false);
        qj_0 qj_02 = new tv_0((List)object);
        return qj_02;
    }

    public static Uj f(vm1_1 object, QB1 qB1) {
        float f5 = wz3.c();
        kv2_1 kv2_12 = kv2_1.a;
        object = Fo1.a((gm1_0)object, qB1, f5, kv2_12, true);
        Uj uj = new tv_0((List)object);
        return uj;
    }

    public Object a(gm1_0 gm1_02, float f5) {
        return Math.round(Xm1.d(gm1_02) * f5);
    }
}

