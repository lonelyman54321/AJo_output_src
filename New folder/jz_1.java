/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from jZ
 */
public final class jz_1
extends Lambda
implements Function1 {
    public final /* synthetic */ py_1 c;

    public jz_1(py_1 py_12) {
        this.c = py_12;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        float f6;
        float f7;
        object = (nl_2)object;
        float f8 = ((nl_2)object).b;
        float f11 = 0.0f;
        float f12 = f8 - 0.0f;
        Object object2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object2 < 0) {
            f8 = 0.0f;
        }
        object2 = 1065353216;
        float f14 = 1.0f;
        float f15 = f8 - f14;
        Object object3 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object3 > 0) {
            f8 = 1.0f;
        }
        float f16 = ((nl_2)object).c;
        int n3 = -1090519040;
        float f17 = -0.5f;
        float f18 = f16 - f17;
        Object object4 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        if (object4 < 0) {
            object3 = -1090519040;
            f16 = -0.5f;
        }
        object4 = 0x3F000000;
        float f19 = 0.5f;
        float f20 = f16 - f19;
        Object object5 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        if (object5 > 0) {
            object3 = 0x3F000000;
            f16 = 0.5f;
        }
        if ((f7 = (f6 = (f5 = ((nl_2)object).d) - f17) == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1)) >= 0) {
            f17 = f5;
        }
        object5 = f17 == f19 ? 0 : (f17 > f19 ? 1 : -1);
        if (object5 <= 0) {
            f19 = f17;
        }
        float f22 = ((nl_2)object).a;
        float f23 = f22 - 0.0f;
        n3 = (int)(f23 == 0.0f ? 0 : (f23 < 0.0f ? -1 : 1));
        if (n3 >= 0) {
            f11 = f22;
        }
        float f24 = f11 == f14 ? 0 : (f11 > f14 ? 1 : -1);
        if (f24 <= 0) {
            f14 = f11;
        }
        object = eZ.t;
        long l2 = zx_0.b(f8, f16, f19, f14, (py_1)object);
        object = this.c;
        l2 = OX.a(l2, (py_1)object);
        object = new OX(l2);
        return object;
    }
}

