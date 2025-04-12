/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Oe
 */
public final class oe_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Re c;

    public oe_0(Re re) {
        this.c = re;
        super(0);
    }

    public final Object invoke() {
        Re re = this.c;
        Xs0 xs0 = re.d();
        Object object = re.g.getValue();
        float f5 = xs0.e(object);
        object = re.d();
        Object object2 = re.i.getValue();
        float f6 = object.e(object2) - f5;
        float f7 = Math.abs(f6);
        int n3 = Float.isNaN(f7);
        float f8 = 1.0f;
        if (n3 == 0) {
            n3 = 897988541;
            float f11 = 1.0E-6f;
            float f12 = f7 - f11;
            Object object3 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object3 > 0) {
                float f14 = (re.e() - f5) / f6;
                float f15 = f14 - f11;
                Object object4 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                if (object4 < 0) {
                    f8 = 0.0f;
                } else {
                    f5 = 0.999999f;
                    float f16 = f14 - f5;
                    object4 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    if (object4 <= 0) {
                        f8 = f14;
                    }
                }
            }
        }
        return Float.valueOf(f8);
    }
}

