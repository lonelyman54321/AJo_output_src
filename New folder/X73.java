/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class X73
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ boolean e;

    public X73(Function2 function2, u10 u102, boolean bl2) {
        this.c = function2;
        this.d = u102;
        this.e = bl2;
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
                n4 = 1065353216;
                f5 = 1.0f;
            } else {
                n4 = 1063172178;
                f5 = 0.87f;
            }
            object3 = Float.valueOf(f5);
            object2 = ((nw0_1)object2).c(object3);
            u10 u102 = (u10)this.d;
            object4 = this.c;
            boolean bl2 = this.e;
            object3 = new W73((Function2)object4, u102, bl2);
            object3 = v10.c(1939362236, (fx0_2)object3, (b30_0)object);
            int n8 = 56;
            L30.a((MB2)object2, (Function2)object3, (b30_0)object, n8);
        }
        return Unit.a;
    }
}

