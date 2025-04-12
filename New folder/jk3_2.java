/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/*
 * Renamed from jK3
 */
public final class jk3_2 {
    public static /* bridge */ /* synthetic */ Intent a(Context context, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter, int n3) {
        return context.registerReceiver(broadcastReceiver2, intentFilter, n3);
    }
}

