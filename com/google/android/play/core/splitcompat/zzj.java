/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitcompat.zzf;
import com.google.android.play.core.splitcompat.zzl;
import com.google.android.play.core.splitcompat.zzm;
import com.google.android.play.core.splitcompat.zzn;
import com.google.android.play.core.splitcompat.zzt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

final class zzj
implements zzl {
    final /* synthetic */ Set zza;
    final /* synthetic */ zzt zzb;
    final /* synthetic */ ZipFile zzc;

    public zzj(zzn zzn2, Set set, zzt zzt2, ZipFile zipFile) {
        this.zza = set;
        this.zzb = zzt2;
        this.zzc = zipFile;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzm object, File file, boolean bl2) {
        Throwable throwable3222222;
        block12: {
            Object object2 = this.zza;
            object2.add(file);
            if (bl2) return;
            Object object3 = this.zzb.zzb();
            object2 = ((zzm)object).zza;
            String string2 = this.zzb.zza().getAbsolutePath();
            String string3 = ((zzm)object).zzb.getName();
            String string4 = file.getAbsolutePath();
            String string5 = "' has native library '";
            String string6 = "' that does not exist; extracting from '";
            object3 = og_1.a("NativeLibraryExtractor: split '", (String)object3, string5, (String)object2, string6);
            String string7 = "' to '";
            X50.a((StringBuilder)object3, string2, "!", string3, string7);
            ((StringBuilder)object3).append(string4);
            ((StringBuilder)object3).append("'");
            object3 = this.zzc;
            object = ((zzm)object).zzb;
            int n3 = 4096;
            object2 = new byte[n3];
            boolean bl3 = file.exists();
            if (bl3) {
                file.delete();
            }
            object = ((ZipFile)object3).getInputStream((ZipEntry)object);
            object3 = new FileOutputStream(file);
            {
                Throwable throwable22222222;
                block13: {
                    catch (Throwable throwable3222222) {
                        break block12;
                    }
                    try {
                        int n4;
                        zze.zzm(file);
                        while ((n4 = ((InputStream)object).read((byte[])object2)) > 0) {
                            bl3 = false;
                            string2 = null;
                            ((FileOutputStream)object3).write((byte[])object2, 0, n4);
                        }
                    }
                    catch (Throwable throwable22222222) {
                        break block13;
                    }
                    {
                        ((FileOutputStream)object3).close();
                    }
                    ((InputStream)object).close();
                    return;
                }
                try {
                    ((FileOutputStream)object3).close();
                    throw throwable22222222;
                }
                catch (Throwable throwable4) {}
                {
                    zzf.zza(throwable22222222, throwable4);
                    throw throwable22222222;
                }
            }
        }
        if (object == null) throw throwable3222222;
        try {
            ((InputStream)object).close();
            throw throwable3222222;
        }
        catch (Throwable throwable5) {
            zzf.zza(throwable3222222, throwable5);
        }
        throw throwable3222222;
    }
}

