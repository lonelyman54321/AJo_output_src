/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Qt$b
implements gx0_2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ p83_0 b;

    public Qt$b(ob0_1 ob0_12, p83_0 p83_02) {
        this.a = ob0_12;
        this.b = p83_02;
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
            float f5 = 10;
            n3 = 6;
            qt_0.n(f5, (b30_0)object2, n3);
            n4 = 8;
            f5 = 1.1E-44f;
            object3 = this.a;
            object4 = this.b;
            Jb0.a((ob0_1)object3, (p83_0)object4, (b30_0)object2, n4);
        }
        return Unit.a;
    }
}

