/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzpq;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class zzpp
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ byte[] zzb;
    final /* synthetic */ zzpq zzc;

    public zzpp(zzpq zzpq2, String string2, byte[] byArray) {
        this.zza = string2;
        this.zzb = byArray;
        this.zzc = zzpq2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable222222;
        FileOutputStream fileOutputStream;
        String string2 = "Error closing stream for writing resource to disk";
        String string3 = " saved on Disk.";
        String string4 = "Resource ";
        Object object = this.zzc;
        String string5 = this.zza;
        object = ((zzpq)object).zzb(string5);
        Object object2 = this.zzb;
        try {
            fileOutputStream = new FileOutputStream((File)object);
        }
        catch (FileNotFoundException fileNotFoundException) {
            zzhi.zza("Error opening resource file for writing");
            return;
        }
        fileOutputStream.write((byte[])object2);
        try {
            fileOutputStream.close();
            object = new StringBuilder(string4);
            ((StringBuilder)object).append(string5);
            ((StringBuilder)object).append(string3);
            string3 = ((StringBuilder)object).toString();
            zzhi.zzd(string3);
            return;
        }
        catch (IOException iOException) {
            zzhi.zza(string2);
            return;
        }
        {
            catch (Throwable throwable222222) {
            }
            catch (IOException iOException) {}
            object2 = "Error writing resource to disk. Removing resource from disk";
            {
                zzhi.zza((String)object2);
                ((File)object).delete();
            }
            try {
                fileOutputStream.close();
                object = new StringBuilder(string4);
                ((StringBuilder)object).append(string5);
                ((StringBuilder)object).append(string3);
                string3 = ((StringBuilder)object).toString();
                zzhi.zzd(string3);
                return;
            }
            catch (IOException iOException) {
                zzhi.zza(string2);
                return;
            }
        }
        try {
            fileOutputStream.close();
            object2 = new StringBuilder;
            ((StringBuilder)object2)(string4);
            ((StringBuilder)object2).append(string5);
            ((StringBuilder)object2).append(string3);
            string3 = ((StringBuilder)object2).toString();
            zzhi.zzd(string3);
            throw throwable222222;
        }
        catch (IOException iOException) {
            zzhi.zza(string2);
        }
        throw throwable222222;
    }
}

