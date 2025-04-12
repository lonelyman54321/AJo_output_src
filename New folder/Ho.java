/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 */
import android.app.AppOpsManager;
import android.content.Context;

public final class Ho {
    public static Object a(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static int b(AppOpsManager appOpsManager, String string2, String string3) {
        return appOpsManager.noteProxyOpNoThrow(string2, string3);
    }

    public static String c(String string2) {
        return AppOpsManager.permissionToOp((String)string2);
    }
}

