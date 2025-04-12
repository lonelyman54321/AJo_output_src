/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/*
 * Renamed from HK3
 */
public final class hk3_1 {
    public static /* bridge */ /* synthetic */ void a(Context context, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver2, intentFilter, 4);
    }
}

