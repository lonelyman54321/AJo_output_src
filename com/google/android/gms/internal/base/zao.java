/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 */
package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.base.zan;

public final class zao
extends t70 {
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter) {
        int n3 = zan.zaa();
        if (n3 != 0) {
            n3 = 1;
            int n4 = zan.zaa();
            n3 = n3 != n4 ? 0 : 2;
            return jk3_2.a(context, broadcastReceiver2, intentFilter, n3);
        }
        return context.registerReceiver(broadcastReceiver2, intentFilter);
    }
}

