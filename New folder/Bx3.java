/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;

public final class Bx3 {
    public static boolean a(Context context) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return Bx3$a.a(context);
        }
        return true;
    }
}

