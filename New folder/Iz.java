/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Iz
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ ib3_0 d;

    public Iz(u10 u102, ib3_0 ib3_02) {
        this.c = u102;
        this.d = ib3_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            float f5 = ((Number)this.d.getValue()).floatValue();
            object2 = Float.valueOf(f5);
            n3 = 0;
            Integer n7 = 0;
            gx0_2 gx0_22 = this.c;
            gx0_22.invoke(object2, object, n7);
        }
        return Unit.a;
    }
}

