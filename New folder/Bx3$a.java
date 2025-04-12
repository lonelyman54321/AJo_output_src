/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.UserManager
 */
import android.content.Context;
import android.os.UserManager;

public final class Bx3$a {
    public static boolean a(Context context) {
        return ((UserManager)context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}

