/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrm;
import com.google.android.gms.internal.ads.zzfrr;
import com.google.android.gms.internal.ads.zzfrs;
import com.google.android.gms.internal.ads.zzfrt;
import com.google.android.gms.internal.ads.zzfru;
import com.google.android.gms.internal.ads.zzfrv;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzfrx {
    private final Context zza;
    private final Executor zzb;
    private final zzfre zzc;
    private final zzfrg zzd;
    private final zzfrw zze;
    private final zzfrw zzf;
    private Task zzg;
    private Task zzh;

    public zzfrx(Context context, Executor executor, zzfre zzfre2, zzfrg zzfrg2, zzfru zzfru2, zzfrv zzfrv2) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfre2;
        this.zzd = zzfrg2;
        this.zze = zzfru2;
        this.zzf = zzfrv2;
    }

    public static zzfrx zze(Context object, Executor executor, zzfre zzfre2, zzfrg zzfrg2) {
        zzfru zzfru2 = new zzfru();
        zzfrv zzfrv2 = new zzfrv();
        zzfrx zzfrx2 = new zzfrx((Context)object, executor, zzfre2, zzfrg2, zzfru2, zzfrv2);
        object = zzfrx2.zzd;
        boolean bl2 = ((zzfrg)object).zzd();
        if (bl2) {
            object = new zzfrr(zzfrx2);
            zzfrx2.zzg = object = zzfrx2.zzh((Callable)object);
        } else {
            zzfrx2.zzg = object = Tasks.forResult(zzfrx2.zze.zza());
        }
        object = new zzfrs(zzfrx2);
        zzfrx2.zzh = object = zzfrx2.zzh((Callable)object);
        return zzfrx2;
    }

    private static zzaus zzg(Task task2, zzaus zzaus2) {
        boolean bl2 = task2.isSuccessful();
        if (!bl2) {
            return zzaus2;
        }
        return (zzaus)task2.getResult();
    }

    private final Task zzh(Callable object) {
        object = Tasks.call(this.zzb, (Callable)object);
        zzfrt zzfrt2 = new zzfrt(this);
        Executor executor = this.zzb;
        return ((Task)object).addOnFailureListener(executor, (OnFailureListener)zzfrt2);
    }

    public final zzaus zza() {
        Object object = this.zze;
        Task task2 = this.zzg;
        object = object.zza();
        return zzfrx.zzg(task2, (zzaus)object);
    }

    public final zzaus zzb() {
        Object object = this.zzf;
        Task task2 = this.zzh;
        object = object.zza();
        return zzfrx.zzg(task2, (zzaus)object);
    }

    public final /* synthetic */ zzaus zzc() {
        Object object;
        int n3;
        zzatp zzatp2 = zzaus.zza();
        Object object2 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
        Object object3 = ((AdvertisingIdClient$Info)object2).getId();
        if (object3 != null && (n3 = ((String)object3).matches((String)(object = "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"))) != 0) {
            object3 = UUID.fromString((String)object3);
            n3 = 16;
            object = new byte[n3];
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])object);
            long l2 = ((UUID)object3).getMostSignificantBits();
            byteBuffer.putLong(l2);
            l2 = ((UUID)object3).getLeastSignificantBits();
            byteBuffer.putLong(l2);
            int n4 = 11;
            object3 = Base64.encodeToString((byte[])object, (int)n4);
        }
        if (object3 != null) {
            zzatp2.zzt((String)object3);
            boolean bl2 = ((AdvertisingIdClient$Info)object2).isLimitAdTrackingEnabled();
            zzatp2.zzs(bl2);
            object2 = zzatx.zzf;
            zzatp2.zzu((zzatx)object2);
        }
        return (zzaus)zzatp2.zzbn();
    }

    public final /* synthetic */ zzaus zzd() {
        Context context = this.zza;
        Object object = context.getPackageManager();
        String string2 = context.getPackageName();
        object = object.getPackageInfo(string2, 0);
        string2 = context.getPackageName();
        object = Integer.toString(object.versionCode);
        return zzfrm.zza(context, string2, (String)object);
    }

    public final /* synthetic */ void zzf(Exception exception) {
        boolean bl2 = exception instanceof InterruptedException;
        if (bl2) {
            Thread thread2 = Thread.currentThread();
            thread2.interrupt();
        }
        this.zzc.zzc(2025, -1, exception);
    }
}

