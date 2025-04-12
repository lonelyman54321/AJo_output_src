/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppUpdateInfo {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final Integer zze;
    private final int zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final PendingIntent zzk;
    private final PendingIntent zzl;
    private final PendingIntent zzm;
    private final PendingIntent zzn;
    private final Map zzo;
    private boolean zzp = false;

    private AppUpdateInfo(String string2, int n3, int n4, int n7, Integer n8, int n10, long l2, long l3, long l4, long l7, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map2) {
        this.zza = string2;
        this.zzb = n3;
        this.zzc = n4;
        this.zzd = n7;
        this.zze = n8;
        this.zzf = n10;
        this.zzg = l2;
        this.zzh = l3;
        this.zzi = l4;
        this.zzj = l7;
        this.zzk = pendingIntent;
        this.zzl = pendingIntent2;
        this.zzm = pendingIntent3;
        this.zzn = pendingIntent4;
        this.zzo = map2;
    }

    public static AppUpdateInfo zzb(String string2, int n3, int n4, int n7, Integer n8, int n10, long l2, long l3, long l4, long l7, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map2) {
        AppUpdateInfo appUpdateInfo = new AppUpdateInfo(string2, n3, n4, n7, n8, n10, l2, l3, l4, l7, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map2);
        return appUpdateInfo;
    }

    private static Set zze(Set hashSet) {
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        return hashSet;
    }

    private final boolean zzf(AppUpdateOptions appUpdateOptions) {
        long l2;
        long l3;
        long l4;
        int n3 = appUpdateOptions.allowAssetPackDeletion();
        return n3 != 0 && (n3 = (l4 = (l3 = this.zzi) - (l2 = this.zzj)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0;
    }

    public int availableVersionCode() {
        return this.zzb;
    }

    public long bytesDownloaded() {
        return this.zzg;
    }

    public Integer clientVersionStalenessDays() {
        return this.zze;
    }

    public Set getFailedUpdatePreconditions(AppUpdateOptions appUpdateOptions) {
        boolean bl2 = appUpdateOptions.allowAssetPackDeletion();
        if (bl2) {
            int n3 = appUpdateOptions.appUpdateType();
            if (n3 == 0) {
                return AppUpdateInfo.zze((Set)this.zzo.get("nonblocking.destructive.intent"));
            }
            return AppUpdateInfo.zze((Set)this.zzo.get("blocking.destructive.intent"));
        }
        int n4 = appUpdateOptions.appUpdateType();
        if (n4 == 0) {
            return AppUpdateInfo.zze((Set)this.zzo.get("nonblocking.intent"));
        }
        return AppUpdateInfo.zze((Set)this.zzo.get("blocking.intent"));
    }

    public int installStatus() {
        return this.zzd;
    }

    public boolean isUpdateTypeAllowed(int n3) {
        AppUpdateOptions appUpdateOptions = AppUpdateOptions.defaultOptions(n3);
        return (appUpdateOptions = this.zza(appUpdateOptions)) != null;
    }

    public boolean isUpdateTypeAllowed(AppUpdateOptions appUpdateOptions) {
        return (appUpdateOptions = this.zza(appUpdateOptions)) != null;
    }

    public String packageName() {
        return this.zza;
    }

    public long totalBytesToDownload() {
        return this.zzh;
    }

    public int updateAvailability() {
        return this.zzc;
    }

    public int updatePriority() {
        return this.zzf;
    }

    public final PendingIntent zza(AppUpdateOptions appUpdateOptions) {
        int n3;
        int n4 = appUpdateOptions.appUpdateType();
        if (n4 == 0) {
            PendingIntent pendingIntent = this.zzl;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            boolean bl2 = this.zzf(appUpdateOptions);
            if (bl2) {
                return this.zzn;
            }
            return null;
        }
        n4 = appUpdateOptions.appUpdateType();
        if (n4 == (n3 = 1)) {
            PendingIntent pendingIntent = this.zzk;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            boolean bl3 = this.zzf(appUpdateOptions);
            if (bl3) {
                return this.zzm;
            }
        }
        return null;
    }

    public final void zzc() {
        this.zzp = true;
    }

    public final boolean zzd() {
        return this.zzp;
    }
}

