/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.zza;
import java.util.ArrayList;
import java.util.List;

public abstract class SplitInstallSessionState {
    public static SplitInstallSessionState create(int n3, int n4, int n7, long l2, long l3, List list, List list2) {
        int n8 = 8;
        if (n4 != n8) {
            zza zza2 = new zza(n3, n4, n7, l2, l3, list, list2, null, null);
            return zza2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
        throw illegalArgumentException;
    }

    public static SplitInstallSessionState zzd(Bundle bundle) {
        zza zza2;
        Object object;
        int n3 = bundle.getInt("session_id");
        int n4 = bundle.getInt("status");
        int n7 = bundle.getInt("error_code");
        long l2 = bundle.getLong("bytes_downloaded");
        long l3 = bundle.getLong("total_bytes_to_download");
        ArrayList arrayList = bundle.getStringArrayList("module_names");
        ArrayList arrayList2 = bundle.getStringArrayList("languages");
        Parcelable parcelable = object = bundle.getParcelable("user_confirmation_intent");
        parcelable = (PendingIntent)object;
        ArrayList arrayList3 = bundle.getParcelableArrayList("split_file_intents");
        object = zza2;
        zza2 = new zza(n3, n4, n7, l2, l3, arrayList, arrayList2, (PendingIntent)parcelable, arrayList3);
        return zza2;
    }

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int n3;
        int n4 = this.status();
        return n4 == 0 || n4 == (n3 = 5) || n4 == (n3 = 6) || n4 == (n3 = 7);
        {
        }
    }

    public List languages() {
        ArrayList arrayList = this.zza();
        if (arrayList != null) {
            List list = this.zza();
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public List moduleNames() {
        ArrayList arrayList = this.zzb();
        if (arrayList != null) {
            List list = this.zzb();
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract List zza();

    public abstract List zzb();

    public abstract List zzc();
}

