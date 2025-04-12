/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazq;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class zzazr {
    protected static final String zza = "zzazr";
    private final zzaye zzb;
    private final String zzc;
    private final String zzd;
    private volatile Method zze = null;
    private final Class[] zzf;
    private final CountDownLatch zzg;

    public zzazr(zzaye object, String object2, String string2, Class ... classArray) {
        CountDownLatch countDownLatch;
        this.zzg = countDownLatch = new CountDownLatch(1);
        this.zzb = object;
        this.zzc = object2;
        this.zzd = string2;
        this.zzf = classArray;
        object = ((zzaye)object).zzk();
        object2 = new zzazq(this);
        object.submit((Runnable)object2);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzazr zzazr2) {
        block15: {
            GenericDeclaration genericDeclaration = zzazr2.zzb;
            Object object = ((zzaye)((Object)genericDeclaration)).zzi();
            genericDeclaration = (GenericDeclaration)((zzaye)((Object)genericDeclaration)).zzu();
            Class[] classArray = zzazr2.zzc;
            genericDeclaration = zzazr2.zzc((byte[])genericDeclaration, (String)classArray);
            genericDeclaration = object.loadClass((String)((Object)genericDeclaration));
            if (genericDeclaration == null) break block15;
            object = zzazr2.zzb;
            object = object.zzu();
            classArray = zzazr2.zzd;
            object = zzazr2.zzc((byte[])object, (String)classArray);
            classArray = zzazr2.zzf;
            genericDeclaration = genericDeclaration.getMethod((String)object, classArray);
            try {
                zzazr2.zze = genericDeclaration;
            }
            catch (Throwable throwable) {
                zzazr2.zzg.countDown();
                throw throwable;
            }
            catch (zzaxi | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException exception) {}
        }
        zzazr2.zzg.countDown();
    }

    private final String zzc(byte[] byArray, String string2) {
        byArray = this.zzb.zze().zzb(byArray, string2);
        string2 = new String(byArray, "UTF-8");
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Method zza() {
        block7: {
            CountDownLatch countDownLatch;
            Method method = this.zze;
            if (method != null) {
                return this.zze;
            }
            method = null;
            try {
                countDownLatch = this.zzg;
            }
            catch (InterruptedException interruptedException) {
                return method;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long l2 = 2;
            boolean bl2 = countDownLatch.await(l2, timeUnit);
            if (bl2) break block7;
            return null;
        }
        return this.zze;
    }
}

