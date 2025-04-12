/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.android.play.core.install;

import android.content.Intent;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.zza;

public abstract class InstallState {
    public static InstallState zza(int n3, long l2, long l3, int n4, String string2) {
        zza zza2 = new zza(n3, l2, l3, n4, string2);
        return zza2;
    }

    public static InstallState zzb(Intent intent, zzm zzm2) {
        Object object = intent;
        Object object2 = new Object[]{};
        zzm2.zza("List of extras in received intent needed by fromUpdateIntent:", object2);
        object2 = "install.status";
        Object object3 = intent.getIntExtra((String)object2, 0);
        int n3 = 2;
        Object object4 = new Object[n3];
        object4[0] = object2;
        int n4 = 1;
        object4[n4] = object3;
        object3 = "Key: %s; value: %s";
        zzm2.zza((String)object3, object4);
        object4 = "error.code";
        Integer n7 = intent.getIntExtra((String)object4, 0);
        Object[] objectArray = new Object[n3];
        objectArray[0] = object4;
        objectArray[n4] = n7;
        zzm2.zza((String)object3, objectArray);
        int n8 = intent.getIntExtra((String)object2, 0);
        long l2 = 0L;
        long l3 = intent.getLongExtra("bytes.downloaded", l2);
        long l4 = intent.getLongExtra("total.bytes.to.download", l2);
        int n10 = intent.getIntExtra((String)object4, 0);
        String string2 = intent.getStringExtra("package.name");
        object = new zza(n8, l3, l4, n10, string2);
        return object;
    }

    public abstract long bytesDownloaded();

    public abstract int installErrorCode();

    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();
}

