/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 */
import android.content.Context;
import android.content.res.Resources;

/*
 * Renamed from iY
 */
public final class iy_1 {
    public static final iy_1 a;

    static {
        iy_1 iy_12;
        a = iy_12 = new Object();
    }

    public final long a(Context context, int n3) {
        Resources resources = context.getResources();
        context = context.getTheme();
        return zx_0.c(hy_1.a(n3, (Resources.Theme)context, resources));
    }
}

