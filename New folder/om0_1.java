/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OM0
 */
public final class om0_1
implements gx0_2 {
    public final /* synthetic */ yh0_0 a;

    public om0_1(yh0_0 yh0_02) {
        this.a = yh0_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$item";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = this.a;
            n3 = 8;
            tm0_1.c((yh0_0)object, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

