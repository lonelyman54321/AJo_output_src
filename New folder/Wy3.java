/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class Wy3 {
    public static /* bridge */ /* synthetic */ ComponentName a(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}

