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

public final class t70$f {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter, String string2, Handler handler, int n3) {
        return context.registerReceiver(broadcastReceiver2, intentFilter, string2, handler, n3);
    }
}

