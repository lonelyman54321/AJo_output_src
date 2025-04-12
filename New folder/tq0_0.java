/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TQ0
 */
public final class tq0_0
implements gx0_2 {
    public final /* synthetic */ Function0 a;

    public tq0_0(gq0_2 gq0_22) {
        this.a = gq0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (KA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$BadgedBox";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            n4 = 0;
            object = null;
            object3 = (gq0_2)this.a;
            UQ0.f((gq0_2)object3, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

