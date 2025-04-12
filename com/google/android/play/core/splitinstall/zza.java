/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 */
package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.List;

final class zza
extends SplitInstallSessionState {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final long zze;
    private final List zzf;
    private final List zzg;
    private final PendingIntent zzh;
    private final List zzi;

    public zza(int n3, int n4, int n7, long l2, long l3, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = n7;
        this.zzd = l2;
        this.zze = l3;
        this.zzf = list;
        this.zzg = list2;
        this.zzh = pendingIntent;
        this.zzi = list3;
    }

    public final long bytesDownloaded() {
        return this.zzd;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                List list;
                block5: {
                    List list2;
                    long l2;
                    long l3;
                    long l4;
                    long l7;
                    int n3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    int n4 = object instanceof SplitInstallSessionState;
                    if (n4 == 0 || (n4 = this.zza) != (n3 = ((SplitInstallSessionState)(object = (SplitInstallSessionState)object)).sessionId()) || (n4 = this.zzb) != (n3 = ((SplitInstallSessionState)object).status()) || (n4 = this.zzc) != (n3 = ((SplitInstallSessionState)object).errorCode()) || (n4 = (int)((l7 = (l4 = this.zzd) - (l3 = ((SplitInstallSessionState)object).bytesDownloaded())) == 0L ? 0 : (l7 < 0L ? -1 : 1))) != 0 || (n4 = (int)((l2 = (l4 = this.zze) - (l3 = ((SplitInstallSessionState)object).totalBytesToDownload())) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0 || !((list = this.zzf) == null ? (list = ((SplitInstallSessionState)object).zzb()) == null : (n4 = (int)(((Object)list).equals(list2 = ((SplitInstallSessionState)object).zzb()) ? 1 : 0)) != 0) || !((list = this.zzg) == null ? (list = ((SplitInstallSessionState)object).zza()) == null : (n4 = (int)(((Object)list).equals(list2 = ((SplitInstallSessionState)object).zza()) ? 1 : 0)) != 0) || !((list = this.zzh) == null ? (list = ((SplitInstallSessionState)object).resolutionIntent()) == null : (n4 = (int)(list.equals(list2 = ((SplitInstallSessionState)object).resolutionIntent()) ? 1 : 0)) != 0)) break block4;
                    list = this.zzi;
                    if (list != null) break block5;
                    if ((object = ((SplitInstallSessionState)object).zzc()) != null) break block4;
                    break block6;
                }
                boolean bl3 = ((Object)list).equals(object = ((SplitInstallSessionState)object).zzc());
                if (!bl3) break block4;
            }
            return bl2;
        }
        return false;
    }

    public final int errorCode() {
        return this.zzc;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.zza;
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        int n8 = this.zzb;
        n4 = (n4 ^ n8) * n7;
        n8 = this.zzc;
        n4 ^= n8;
        long l2 = this.zzd;
        int n10 = 32;
        long l3 = l2 >>> n10;
        l2 ^= l3;
        l3 = this.zze;
        long l4 = l3 >>> n10;
        long l7 = l4 ^ l3;
        List list = this.zzf;
        int n14 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        int n15 = (int)l2;
        n4 *= n7;
        n8 = (int)l7;
        n4 = (((n4 ^ n15) * n7 ^ n8) * n7 ^ n3) * n7;
        List list2 = this.zzg;
        if (list2 == null) {
            n8 = 0;
            list2 = null;
        } else {
            n8 = ((Object)list2).hashCode();
        }
        n4 = (n4 ^ n8) * n7;
        list2 = this.zzh;
        if (list2 == null) {
            n8 = 0;
            list2 = null;
        } else {
            n8 = list2.hashCode();
        }
        n4 = (n4 ^ n8) * n7;
        List list3 = this.zzi;
        if (list3 != null) {
            n14 = ((Object)list3).hashCode();
        }
        return n4 ^ n14;
    }

    public final PendingIntent resolutionIntent() {
        return this.zzh;
    }

    public final int sessionId() {
        return this.zza;
    }

    public final int status() {
        return this.zzb;
    }

    public final String toString() {
        int n3 = this.zza;
        int n4 = this.zzb;
        int n7 = this.zzc;
        long l2 = this.zzd;
        long l3 = this.zze;
        String string2 = String.valueOf(this.zzf);
        String string3 = String.valueOf(this.zzg);
        String string4 = String.valueOf(this.zzh);
        String string5 = String.valueOf(this.zzi);
        StringBuilder stringBuilder = fQ2.a("SplitInstallSessionState{sessionId=", ", status=", ", errorCode=", n3, n4);
        stringBuilder.append(n7);
        stringBuilder.append(", bytesDownloaded=");
        stringBuilder.append(l2);
        fn0_2.b(stringBuilder, ", totalBytesToDownload=", l3, ", moduleNamesNullable=");
        X50.a(stringBuilder, string2, ", languagesNullable=", string3, ", resolutionIntent=");
        return ko_0.a(stringBuilder, string4, ", splitFileIntents=", string5, "}");
    }

    public final long totalBytesToDownload() {
        return this.zze;
    }

    public final List zza() {
        return this.zzg;
    }

    public final List zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzi;
    }
}

