/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/*
 * Renamed from oY
 */
public final class oy_0 {
    public static final long a(b30_0 b30_02, int n3) {
        long l2;
        Object object = AndroidCompositionLocals_androidKt.b;
        b30_02 = (Context)b30_02.j((H30)object);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            object = iy_1.a;
            l2 = ((iy_1)object).a((Context)b30_02, n3);
        } else {
            b30_02 = b30_02.getResources();
            int n8 = b30_02.getColor(n3);
            l2 = zx_0.c(n8);
        }
        return l2;
    }
}

