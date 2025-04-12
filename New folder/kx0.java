/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.widget.EdgeEffect
 */
import android.os.Build;
import android.widget.EdgeEffect;

public final class kx0 {
    public static float a(EdgeEffect edgeEffect) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            return kx0$b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f5, float f6) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        if (n3 >= n4) {
            return kx0$b.c(edgeEffect, f5, f6);
        }
        kx0$a.a(edgeEffect, f5, f6);
        return f5;
    }
}

