/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dg0
 */
public final class dg0_1
implements gx0_2 {
    public final /* synthetic */ yi2_1 a;
    public final /* synthetic */ hd2_0 b;

    public dg0_1(yi2_1 yi2_12, hd2_0 hd2_02) {
        this.a = yi2_12;
        this.b = hd2_02;
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
            n4 = 0;
            object = null;
            object3 = this.a;
            object4 = this.b;
            Rg0.a(0, (b30_0)object2, (yi2_1)object3, (hd2_0)object4);
        }
        return Unit.a;
    }
}

