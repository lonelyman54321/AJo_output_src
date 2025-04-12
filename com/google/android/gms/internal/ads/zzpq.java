/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioDeviceCallback
 *  android.media.AudioManager
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;

final class zzpq {
    public static void zza(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
        context = (AudioManager)context.getSystemService("audio");
        context.getClass();
        qr_1.a((AudioManager)context, audioDeviceCallback, handler);
    }

    public static void zzb(Context context, AudioDeviceCallback audioDeviceCallback) {
        context = (AudioManager)context.getSystemService("audio");
        context.getClass();
        pr_1.a((AudioManager)context, audioDeviceCallback);
    }
}

