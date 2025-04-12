/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Ca0$a
implements gx0_2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ i90_0 c;

    public Ca0$a(c80 c802, ob0_1 ob0_12, yT1 yT12) {
        this.a = ob0_12;
        this.b = yT12;
        this.c = c802;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = j.c;
            float f5 = 10;
            object4 = object;
            object4 = h.i((LP1)object, 0.0f, f5, 0.0f, 0.0f, 13);
            ob0_1 ob0_12 = this.a;
            object3 = new xa0_2(ob0_12);
            u10 u102 = v10.c(614003861, (fx0_2)object3, (b30_0)object2);
            OA.a((LP1)object4, null, false, u102, (b30_0)object2, 3078, 6);
            float f6 = 12;
            object4 = object;
            object4 = h.i((LP1)object, 0.0f, 0.0f, 0.0f, f6, 7);
            Gx gx = Nc$a.h;
            object3 = (c80)this.c;
            yT1 yT12 = this.b;
            object = new ba0_1((c80)object3, ob0_12, yT12);
            n3 = -2145474242;
            u102 = v10.c(n3, (fx0_2)object, (b30_0)object2);
            f5 = 0.0f;
            yT12 = null;
            int n7 = 3126;
            int n8 = 4;
            OA.a((LP1)object4, gx, false, u102, (b30_0)object2, n7, n8);
        }
        return Unit.a;
    }
}

