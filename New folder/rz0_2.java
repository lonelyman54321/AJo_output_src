/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RZ0
 */
public final class rz0_2 {
    public static final void a(List list, String string2, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(string2, "titleMsg");
        int n4 = -179656364;
        object = object.g(n4);
        Object object2 = LP1$a.b;
        float f5 = 8;
        object2 = h.e((LP1)object2, f5);
        double d2 = 0.5;
        f5 = (float)d2;
        long l2 = zx_0.d(0xFFCDCDCDL);
        int n7 = 4;
        float f6 = n7;
        Object object3 = SP2.a(f6);
        object2 = gz.a((LP1)object2, f5, l2, (i13)object3);
        f5 = 1.0f;
        LP1 lP1 = j.c((LP1)object2, f5);
        object2 = new rz0$a_0(list, string2);
        object3 = v10.c(-476028866, (fx0_2)object2, (b30_0)object);
        int n8 = 3072;
        int n10 = 6;
        OA.a(lP1, null, false, (u10)object3, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new qz0_1(string2, n3, list);
        }
    }
}

