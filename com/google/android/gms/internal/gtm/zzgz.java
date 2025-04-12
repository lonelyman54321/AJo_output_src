/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzgx;
import com.google.android.gms.internal.gtm.zzgy;
import com.google.android.gms.internal.gtm.zzha;
import com.google.android.gms.internal.gtm.zzhi;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

final class zzgz
extends Thread
implements zzgx {
    private static zzgz zza;
    private final LinkedBlockingQueue zzb;
    private volatile boolean zzc;
    private volatile boolean zzd;
    private volatile zzha zze;
    private final Context zzf;
    private final Clock zzg;

    private zzgz(Context context) {
        super("GAThread");
        Object object = new LinkedBlockingQueue();
        this.zzb = object;
        this.zzc = false;
        this.zzd = false;
        this.zzg = object = DefaultClock.getInstance();
        if (context != null) {
            this.zzf = context = context.getApplicationContext();
        } else {
            context = null;
            this.zzf = null;
        }
        this.start();
    }

    public static /* bridge */ /* synthetic */ Context zzc(zzgz zzgz2) {
        return zzgz2.zzf;
    }

    public static zzgz zzd(Context context) {
        zzgz zzgz2 = zza;
        if (zzgz2 == null) {
            zza = zzgz2 = new zzgz(context);
        }
        return zza;
    }

    public static /* bridge */ /* synthetic */ zzha zze(zzgz zzgz2) {
        return zzgz2.zze;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzgz zzgz2, zzha zzha2) {
        zzgz2.zze = zzha2;
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
            try {
                while (true) {
                    try {
                        while (true) {
                            object = this.zzb;
                            object = ((LinkedBlockingQueue)object).take();
                            object = (Runnable)object;
                            boolean bl3 = this.zzc;
                            if (bl3) continue;
                            object.run();
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        object = ((Object)interruptedException).toString();
                        zzhi.zzc((String)object);
                        continue;
                    }
                    break;
                }
            }
            catch (Exception exception) {}
            Object object2 = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream((OutputStream)object2);
            exception.printStackTrace(printStream);
            printStream.flush();
            object2 = ((ByteArrayOutputStream)object2).toByteArray();
            object = new String((byte[])object2);
            object2 = "Error on Google TagManager Thread: ";
            zzhi.zza(((String)object2).concat((String)object));
            object = "Google TagManager is shutting down.";
            zzhi.zza((String)object);
            this.zzc = bl2 = true;
        }
    }

    public final void zza(Runnable runnable2) {
        ((AbstractCollection)this.zzb).add(runnable2);
    }

    public final void zzb(String string2, String string3, String string4, Map map2, String string5) {
        long l2 = this.zzg.currentTimeMillis();
        zzgy zzgy2 = new zzgy(this, this, l2, string2, string3, string4, map2, string5);
        ((AbstractCollection)this.zzb).add(zzgy2);
    }
}

