/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Pair
 */
package com.google.android.gms.internal.gtm;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzhp;
import com.google.android.gms.internal.gtm.zzix;
import com.google.android.gms.internal.gtm.zzjg;

final class zzis
implements Runnable {
    final /* synthetic */ Uri zza;
    final /* synthetic */ zzix zzb;

    public zzis(zzix zzix2, Uri uri) {
        this.zza = uri;
        this.zzb = zzix2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = "Starting to load preview container: ";
        CharSequence charSequence = "Deferring container loading for preview uri: ";
        Object object2 = "Cannot preview the app with the uri: ";
        Object object3 = String.valueOf(this.zza);
        Object object4 = "Preview requested to uri ";
        zzhi.zzd(((String)object4).concat((String)object3));
        object3 = zzix.zzh(this.zzb);
        synchronized (object3) {
            try {
                Uri uri;
                object4 = this.zzb;
                int n3 = zzix.zza((zzix)object4);
                int n4 = 2;
                if (n3 == n4) {
                    object = "Still initializing. Defer preview container loading.";
                    zzhi.zzd((String)object);
                    object = this.zzb;
                    object = zzix.zzi((zzix)object);
                    object.add(this);
                    return;
                }
                n3 = 0;
                object4 = zzix.zzc((zzix)object4, null);
                object4 = ((Pair)object4).first;
                if ((object4 = (String)object4) == null) {
                    object = "Preview failed (no container found)";
                    zzhi.zze((String)object);
                    return;
                }
                Object object5 = this.zzb;
                boolean bl2 = ((zzhp)(object5 = zzix.zze((zzix)object5))).zzf((String)object4, uri = this.zza);
                if (!bl2) {
                    object = this.zza;
                    object = String.valueOf(object);
                    charSequence = new StringBuilder((String)object2);
                    ((StringBuilder)charSequence).append((String)object);
                    object = ". Launching current version instead.";
                    ((StringBuilder)charSequence).append((String)object);
                    object = ((StringBuilder)charSequence).toString();
                    zzhi.zze((String)object);
                    return;
                }
                object2 = this.zzb;
                boolean bl3 = zzix.zzo((zzix)object2);
                if (!bl3) {
                    object = this.zza;
                    object = String.valueOf(object);
                    object2 = new StringBuilder((String)charSequence);
                    ((StringBuilder)object2).append((String)object);
                    object = "(Tag Manager has not been initialized).";
                    ((StringBuilder)object2).append((String)object);
                    object = ((StringBuilder)object2).toString();
                    zzhi.zzd((String)object);
                    return;
                }
                charSequence = this.zza;
                charSequence = String.valueOf(charSequence);
                object = ((String)object).concat((String)charSequence);
                zzhi.zzc((String)object);
                object = this.zzb;
                object = zzix.zzg((zzix)object);
                boolean bl4 = ((zzjg)object).zze();
                if (!bl4) {
                    object = "Failed to reset TagManager service for preview";
                    zzhi.zze((String)object);
                    return;
                }
                object = this.zzb;
                int n7 = 0;
                charSequence = null;
                zzix.zzk((zzix)object, false);
                object = this.zzb;
                n7 = 1;
                zzix.zzl((zzix)object, n7);
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl79 : MonitorExitStatement: MONITOREXIT : var4_5
                this.zzb.zzm(null);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

