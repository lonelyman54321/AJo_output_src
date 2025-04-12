/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Qt$c
implements gx0_2 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ ob0_1 c;

    public Qt$c(c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = yT12;
        this.b = c802;
        this.c = ob0_12;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            n4 = 10;
            float f5 = n4;
            qt_0.n(f5, (b30_0)object2, 6);
            object3 = this.a;
            object4 = (c80)this.b;
            ob0_1 ob0_12 = this.c;
            object = new rt_0((c80)object4, ob0_12, (yT1)object3);
            n3 = 0;
            object3 = null;
            ea0_0.a((rt_0)object, (b30_0)object2, 0);
        }
        return Unit.a;
    }
}

