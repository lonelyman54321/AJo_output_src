/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DownloadManager
 *  android.app.DownloadManager$Request
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.net.Uri
 *  android.os.Environment
 */
package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbug;

final class zzbue
implements DialogInterface.OnClickListener {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbug zzc;

    public zzbue(zzbug zzbug2, String string2, String string3) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = zzbug2;
    }

    public final void onClick(DialogInterface dialogInterface, int n3) {
        dialogInterface = zzbug.zza(this.zzc);
        String string2 = "download";
        dialogInterface = (DownloadManager)dialogInterface.getSystemService(string2);
        try {
            string2 = this.zza;
        }
        catch (IllegalStateException illegalStateException) {
            this.zzc.zzh("Could not store picture.");
            return;
        }
        String string3 = this.zzb;
        string2 = Uri.parse((String)string2);
        DownloadManager.Request request = new DownloadManager.Request((Uri)string2);
        string2 = Environment.DIRECTORY_PICTURES;
        request.setDestinationInExternalPublicDir(string2, string3);
        zzu.zzp();
        request.allowScanningByMediaScanner();
        n3 = 1;
        request.setNotificationVisibility(n3);
        dialogInterface.enqueue(request);
    }
}

