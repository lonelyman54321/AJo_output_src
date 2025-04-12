/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.google.android.gms.internal.ads.zzfk;

final class zzabt
implements Choreographer.FrameCallback,
Handler.Callback {
    private static final zzabt zzb;
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    static {
        zzabt zzabt2;
        zzb = zzabt2 = new zzabt();
    }

    private zzabt() {
        Handler handler;
        HandlerThread handlerThread;
        this.zzd = handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        handlerThread = handlerThread.getLooper();
        this.zzc = handler = new Handler((Looper)handlerThread, (Handler.Callback)this);
        handler.sendEmptyMessage(0);
    }

    public static zzabt zza() {
        return zzb;
    }

    public final void doFrame(long l2) {
        this.zza = l2;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed((Choreographer.FrameCallback)this, 500L);
    }

    public final boolean handleMessage(Message message) {
        int n3 = message.what;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                int n7 = 2;
                if (n3 != n7) {
                    return false;
                }
                message = this.zze;
                if (message != null) {
                    this.zzf = n7 = this.zzf + -1;
                    if (n7 == 0) {
                        long l2;
                        message.removeFrameCallback((Choreographer.FrameCallback)this);
                        this.zza = l2 = -9223372036854775807L;
                    }
                }
                return n4 != 0;
            }
            message = this.zze;
            if (message != null) {
                int n8;
                this.zzf = n8 = this.zzf + n4;
                if (n8 == n4) {
                    message.postFrameCallback((Choreographer.FrameCallback)this);
                }
            }
            return n4 != 0;
        }
        message = Choreographer.getInstance();
        try {
            this.zze = message;
        }
        catch (RuntimeException runtimeException) {
            String string2 = "VideoFrameReleaseHelper";
            String string3 = "Vsync sampling disabled due to platform error";
            zzfk.zzg(string2, string3, runtimeException);
        }
        return n4 != 0;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }
}

