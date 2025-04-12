/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 */
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/*
 * Renamed from Oo0
 */
public final class oo0_2 {
    public static /* bridge */ /* synthetic */ void a(Activity activity, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter) {
        activity.registerReceiver(broadcastReceiver2, intentFilter, 2);
    }

    public static /* bridge */ /* synthetic */ void b(Context context, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver2, intentFilter, 2);
    }
}

