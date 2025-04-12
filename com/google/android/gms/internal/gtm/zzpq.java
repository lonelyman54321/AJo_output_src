/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.gtm.zzfx;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzpa;
import com.google.android.gms.internal.gtm.zzpm;
import com.google.android.gms.internal.gtm.zzpn;
import com.google.android.gms.internal.gtm.zzpo;
import com.google.android.gms.internal.gtm.zzpp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;

public final class zzpq {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzpm zzc;

    public zzpq(Context context) {
        ExecutorService executorService = zzfx.zza().zza(2);
        zzpm zzpm2 = new zzpm(context);
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzpm2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final byte[] zzh(InputStream var0) {
        var1_1 = new ByteArrayOutputStream();
        IOUtils.copyStream(var0, var1_1);
        {
            catch (Throwable var1_2) {
                ** GOTO lbl-1000
            }
            catch (IOException v0) {}
            var2_3 = "Failed to read the resource from disk";
            {
                zzhi.zze(var2_3);
            }
        }
        try {
            var0.close();
            return var1_1.toByteArray();
        }
        catch (IOException v1) {
            zzhi.zze("Error closing stream for reading resource from disk");
            return null;
        }
lbl-1000:
        // 1 sources

        {
            var0.close();
        }
        throw var1_2;
    }

    private static final String zzi(String string2) {
        string2 = String.valueOf(string2);
        return "resource_".concat(string2);
    }

    public final long zza(String object) {
        boolean bl2 = ((File)(object = this.zzb((String)object))).exists();
        if (bl2) {
            return ((File)object).lastModified();
        }
        return 0L;
    }

    public final File zzb(String string2) {
        File file = this.zza.getDir("google_tagmanager", 0);
        string2 = zzpq.zzi(string2);
        File file2 = new File(file, string2);
        return file2;
    }

    public final void zzc(String string2, String string3, zzpa zzpa2) {
        zzpo zzpo2 = new zzpo(this, string2, string3, zzpa2);
        this.zzb.execute(zzpo2);
    }

    public final void zzd(String string2, String string3, zzpa zzpa2) {
        int n3;
        block9: {
            Object object;
            String string4 = "Starting to load a default asset file from Disk.";
            zzhi.zzd(string4);
            n3 = 2;
            if (string3 == null) {
                zzhi.zzd("Default asset file is not specified. Not proceeding with the loading");
                zzpa2.zzb(0, n3);
                return;
            }
            try {
                object = this.zzc;
            }
            catch (IOException iOException) {
                object = new StringBuilder("Default asset file not found. ");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(". Filename: ");
                ((StringBuilder)object).append(string3);
                zzhi.zza(((StringBuilder)object).toString());
                zzpa2.zzb(0, n3);
                return;
            }
            object = ((zzpm)object).zza;
            object = object.getAssets();
            object = object.open(string3);
            if (object == null) break block9;
            object = zzpq.zzh((InputStream)object);
            zzpa2.zzc((byte[])object);
            return;
        }
        zzpa2.zzb(0, n3);
    }

    public final void zze(String string2, zzpa zzpa2) {
        zzpn zzpn2 = new zzpn(this, string2, zzpa2);
        this.zzb.execute(zzpn2);
    }

    public final void zzf(String string2, zzpa zzpa2) {
        File file;
        Object object = "Starting to load a saved resource file from Disk.";
        zzhi.zzd((String)object);
        try {
            file = this.zzb(string2);
        }
        catch (FileNotFoundException fileNotFoundException) {
            string2 = zzpq.zzi(string2);
            zzhi.zza("Saved resource not found: ".concat(string2));
            zzpa2.zzb(0, 1);
            return;
        }
        object = new FileInputStream(file);
        object = zzpq.zzh((InputStream)object);
        zzpa2.zzc((byte[])object);
    }

    public final void zzg(String string2, byte[] byArray) {
        zzpp zzpp2 = new zzpp(this, string2, byArray);
        this.zzb.execute(zzpp2);
    }
}

