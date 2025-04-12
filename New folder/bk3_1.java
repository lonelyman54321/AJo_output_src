/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/*
 * Renamed from BK3
 */
public final class bk3_1 {
    public static /* bridge */ /* synthetic */ Intent a(Context context, IntentFilter intentFilter) {
        return context.registerReceiver(null, intentFilter, 4);
    }
}

