/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xS0
 */
public final class xs0_1
extends Lambda
implements Function2 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Function2 d;

    public xs0_1(long l2, u10 u102) {
        this.c = l2;
        this.d = u102;
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
            object2 = s60_0.a;
            long l2 = this.c;
            f5 = OX.d(l2);
            Object object3 = Float.valueOf(f5);
            object2 = ((nw0_1)object2).c(object3);
            u10 u102 = (u10)this.d;
            object3 = new ws0_0(u102);
            object3 = v10.c(1867794295, (fx0_2)object3, (b30_0)object);
            int n7 = 56;
            L30.a((MB2)object2, (Function2)object3, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

