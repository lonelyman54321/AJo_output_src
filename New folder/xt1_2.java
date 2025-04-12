/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from xt1
 */
public final class xt1_2
extends Lambda
implements Function2 {
    public final /* synthetic */ rt1_0 c;
    public final /* synthetic */ gx0_2 d;

    public xt1_2(rt1_0 rt1_02, u10 u102) {
        this.c = rt1_02;
        this.d = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = hs2_0.a((b30_0)object);
            rt1_0 rt1_02 = this.c;
            rt1_02.b.setValue(object2);
            n4 = 0;
            object2 = 0;
            gx0_2 gx0_22 = this.d;
            gx0_22.invoke(rt1_02, object, object2);
        }
        return Unit.a;
    }
}

