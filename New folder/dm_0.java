/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Dm
 */
public final class dm_0
extends Lambda
implements Function2 {
    public final /* synthetic */ lg3_0 c;
    public final /* synthetic */ mk2_0 d;
    public final /* synthetic */ gx0_2 e;

    public dm_0(oO0 oO02, nk2_0 nk2_02, u10 u102) {
        this.c = oO02;
        this.d = nk2_02;
        this.e = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 3;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            double d2;
            double d5;
            double d7;
            double d9;
            double d12;
            double d13;
            object2 = s60_0.a;
            Object object3 = w60_0.a;
            object3 = (OX)object.j((H30)object3);
            long l2 = ((OX)object3).a;
            Object object4 = mz_0.a;
            object4 = (lZ)object.j((H30)object4);
            boolean n7 = ((lZ)object4).i();
            double d14 = 0.5;
            if (n7 ? (d13 = (d12 = (d9 = (double)(f5 = zx_0.h(l2))) - d14) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1)) > 0 : (d7 = (d5 = (d2 = (double)(f5 = zx_0.h(l2))) - d14) == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1)) < 0) {
                n4 = 1060991140;
                f5 = 0.74f;
            } else {
                n4 = 1058642330;
                f5 = 0.6f;
            }
            object3 = Float.valueOf(f5);
            object2 = ((nw0_1)object2).c(object3);
            oO0 oO02 = (oO0)this.c;
            object4 = (nk2_0)this.d;
            u10 u102 = (u10)this.e;
            object3 = new cm_0(oO02, (nk2_0)object4, u102);
            object3 = v10.c(600325466, (fx0_2)object3, (b30_0)object);
            int n8 = 56;
            L30.a((MB2)object2, (Function2)object3, (b30_0)object, n8);
        }
        return Unit.a;
    }
}

