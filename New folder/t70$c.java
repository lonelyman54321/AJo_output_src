/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Handler
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class t70$c {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter, String string2, Handler handler, int n3) {
        int n4 = n3 & 4;
        if (n4 != 0 && string2 == null) {
            string2 = t70.obtainAndCheckReceiverPermission(context);
            return context.registerReceiver(broadcastReceiver2, intentFilter, string2, handler);
        }
        int n7 = n3 & 1;
        return context.registerReceiver(broadcastReceiver2, intentFilter, string2, handler, n7);
    }

    public static void b(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}

