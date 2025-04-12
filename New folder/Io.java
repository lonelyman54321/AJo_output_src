/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 */
import android.app.AppOpsManager;
import android.content.Context;

public final class Io {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager b(Context context) {
        return (AppOpsManager)context.getSystemService(AppOpsManager.class);
    }
}

