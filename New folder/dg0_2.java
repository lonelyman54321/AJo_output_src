/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dG0
 */
public final class dg0_2
implements hx0_2 {
    public final /* synthetic */ int a;

    public dg0_2(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (KA)object;
        object2 = (WW$a)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        int n3 = ((Number)object4).intValue();
        String string2 = "$this$CoilImage";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "it";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = n3 & 0x281;
        int n7 = 128;
        float f5 = 1.8E-43f;
        if (n4 == n7 && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = j.c(LP1$a.b, 1.0f);
            n7 = this.a;
            f5 = x20_0.e((b30_0)object3, n7);
            float f6 = uq0_0.e;
            object = j.d((LP1)object, f5 += f6);
            object2 = new Object();
            object = QV.a((LP1)object, (i13)object2);
            object2 = new Object();
            object = x20_0.d((LP1)object, (Function0)object2);
            n7 = 0;
            f5 = 0.0f;
            object2 = null;
            HA.a((LP1)object, (b30_0)object3, 0);
        }
        return Unit.a;
    }
}

