/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzrc;
import com.google.android.gms.tagmanager.zzeh;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class zzeg
implements Runnable {
    final /* synthetic */ zzrc zza;
    final /* synthetic */ zzeh zzb;

    public zzeg(zzeh zzeh2, zzrc zzrc2) {
        this.zza = zzrc2;
        this.zzb = zzeh2;
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
        zzrc zzrc2 = this.zza;
        File file = this.zzb.zze();
        try {
            fileOutputStream = new FileOutputStream(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        zzrc2.zzT(fileOutputStream);
        try {
            fileOutputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        {
            block12: {
                catch (Throwable throwable222222) {
                    break block12;
                }
                catch (IOException iOException) {}
                {
                    file.delete();
                }
                fileOutputStream.close();
                return;
            }
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            throw throwable222222;
        }
        {
            throw throwable222222;
            catch (IOException iOException) {
                return;
            }
        }
    }
}

