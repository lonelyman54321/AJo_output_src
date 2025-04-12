/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzbw;
import com.google.android.gms.tagmanager.zzby;
import com.google.android.gms.tagmanager.zzdc;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.concurrent.LinkedBlockingQueue;

final class zzbx
extends Thread {
    private static zzbx zza;
    private final LinkedBlockingQueue zzb;
    private volatile boolean zzc;
    private volatile boolean zzd;
    private volatile zzby zze;
    private final Context zzf;

    private zzbx(Context context) {
        super("GAThread");
        LinkedBlockingQueue linkedBlockingQueue;
        this.zzb = linkedBlockingQueue = new LinkedBlockingQueue();
        linkedBlockingQueue = null;
        this.zzc = false;
        this.zzd = false;
        if (context != null) {
            this.zzf = context = context.getApplicationContext();
        } else {
            context = null;
            this.zzf = null;
        }
        this.start();
    }

    public static /* bridge */ /* synthetic */ Context zza(zzbx zzbx2) {
        return zzbx2.zzf;
    }

    public static zzbx zzb(Context context) {
        zzbx zzbx2 = zza;
        if (zzbx2 == null) {
            zza = zzbx2 = new zzbx(context);
        }
        return zza;
    }

    public static /* bridge */ /* synthetic */ zzby zzc(zzbx zzbx2) {
        return zzbx2.zze;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbx zzbx2, zzby zzby2) {
        zzbx2.zze = zzby2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        while (true) {
            boolean bl2;
            Object object;
            Object object2;
            try {
                while (true) {
                    try {
                        while (true) {
                            object2 = this.zzb;
                            object2 = ((LinkedBlockingQueue)object2).take();
                            object2 = (Runnable)object2;
                            boolean bl3 = this.zzc;
                            if (bl3) continue;
                            object2.run();
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        object2 = ((Object)interruptedException).toString();
                        object = zzdc.zzb;
                        ((zzbb)object).zzb((String)object2);
                        continue;
                    }
                    break;
                }
            }
            catch (Exception exception) {}
            object = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream((OutputStream)object);
            exception.printStackTrace(printStream);
            printStream.flush();
            object = ((ByteArrayOutputStream)object).toByteArray();
            object2 = new String((byte[])object);
            object = "Error on Google TagManager Thread: ";
            ((String)object).concat((String)object2);
            this.zzc = bl2 = true;
        }
    }

    public final void zze(Runnable runnable2) {
        ((AbstractCollection)this.zzb).add(runnable2);
    }

    public final void zzf(String string2, long l2) {
        zzbw zzbw2 = new zzbw(this, this, l2, string2);
        ((AbstractCollection)this.zzb).add(zzbw2);
    }
}

