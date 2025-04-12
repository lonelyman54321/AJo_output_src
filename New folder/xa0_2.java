/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xa0
 */
public final class xa0_2
implements gx0_2 {
    public final /* synthetic */ ob0_1 a;

    public xa0_2(ob0_1 ob0_12) {
        this.a = ob0_12;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = this.a;
            n3 = 8;
            ka0_1.b((ob0_1)object, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

