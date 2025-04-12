/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.zzaym;
import java.util.concurrent.Executor;

public final class zzayn {
    private static final String[] zza = new String[]{"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb;
    private long zzc;
    private long zzd;
    private boolean zze;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public zzayn(Context object, Executor executor, String[] stringArray) {
        long l2;
        this.zzb = l2 = 0L;
        this.zzc = l2;
        this.zzd = l2 = (long)-1;
        zzaym zzaym2 = null;
        this.zze = false;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 < n4) {
            return;
        }
        zzaym2 = new zzaym(this);
        String string2 = "appops";
        Object object2 = object.getSystemService(string2);
        AppOpsManager appOpsManager = (AppOpsManager)object2;
        try {
            void var2_4;
            void var3_5;
            nk3_2.a(appOpsManager, (String[])var3_5, (Executor)var2_4, zzaym2);
            return;
        }
        catch (IllegalArgumentException | NoSuchMethodError throwable) {
            return;
        }
    }

    public static /* bridge */ /* synthetic */ long zza(zzayn zzayn2) {
        return zzayn2.zzc;
    }

    public static zzayn zzd(Context context, Executor executor) {
        String[] stringArray = zza;
        zzayn zzayn2 = new zzayn(context, executor, stringArray);
        return zzayn2;
    }

    public static /* bridge */ /* synthetic */ void zze(zzayn zzayn2, long l2) {
        zzayn2.zzd = l2;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzayn zzayn2, boolean bl2) {
        zzayn2.zze = bl2;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzayn zzayn2, long l2) {
        zzayn2.zzb = l2;
    }

    public final long zzb() {
        long l2 = this.zzd;
        this.zzd = -1;
        return l2;
    }

    public final long zzc() {
        boolean bl2 = this.zze;
        if (bl2) {
            long l2 = this.zzc;
            long l3 = this.zzb;
            return l2 - l3;
        }
        return -1;
    }

    public final void zzh() {
        boolean bl2 = this.zze;
        if (bl2) {
            long l2;
            this.zzc = l2 = System.currentTimeMillis();
        }
    }
}

