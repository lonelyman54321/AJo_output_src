/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;

public final class VN1$a {
    public static final int e;
    public final Context a;
    public final ActivityManager b;
    public final VN1$b c;
    public final float d;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        n3 = n3 < n4 ? 4 : 1;
        e = n3;
    }

    public VN1$a(Context context) {
        VN1$b vN1$b;
        ActivityManager activityManager;
        float f5;
        int n3 = e;
        this.d = f5 = (float)n3;
        this.a = context;
        this.b = activityManager = (ActivityManager)context.getSystemService("activity");
        context = context.getResources().getDisplayMetrics();
        this.c = vN1$b = new VN1$b((DisplayMetrics)context);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 26;
        if (n4 >= n7 && (n4 = (int)(activityManager.isLowRamDevice() ? 1 : 0)) != 0) {
            n4 = 0;
            context = null;
            this.d = 0.0f;
        }
    }
}

