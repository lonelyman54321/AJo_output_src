/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;

public final class XU0 {
    public static final vu0_1 a(Context context) {
        int n3;
        Object object;
        bh_0 bh_02 = new bh_0(context);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 31;
        if (n4 >= n7) {
            object = uv0_0.a;
            n3 = ((uv0_0)object).a(context);
        } else {
            n3 = 0;
            context = null;
        }
        object = new Dh(n3);
        vu0_1 vu0_12 = new vu0_1(bh_02, (Dh)object);
        return vu0_12;
    }
}

