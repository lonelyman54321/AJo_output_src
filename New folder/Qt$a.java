/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Qt$a
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ i90_0 d;

    public Qt$a(boolean bl2, ob0_1 ob0_12, yT1 yT12, c80 c802) {
        this.a = bl2;
        this.b = ob0_12;
        this.c = yT12;
        this.d = c802;
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
            n4 = (int)(this.a ? 1 : 0);
            n3 = 584;
            object4 = this.d;
            yT1 yT12 = this.c;
            ob0_1 ob0_12 = this.b;
            if (n4 != 0) {
                n4 = 244697906;
                object2.K(n4);
                object4 = (c80)object4;
                qt_0.l(n3, (b30_0)object2, (c80)object4, ob0_12, yT12);
                object2.E();
            } else {
                n4 = 244703379;
                object2.K(n4);
                object4 = (c80)object4;
                qt_0.m(n3, (b30_0)object2, (c80)object4, ob0_12, yT12);
                object2.E();
            }
        }
        return Unit.a;
    }
}

