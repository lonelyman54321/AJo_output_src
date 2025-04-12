/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.internal.gtm;

import android.content.pm.PackageManager;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcq;
import com.google.android.gms.internal.gtm.zzcr;
import com.google.android.gms.internal.gtm.zzei;
import com.google.android.gms.internal.gtm.zzej;
import java.util.Locale;

public final class zzfg
extends zzbr {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzfg(zzbu zzbu2) {
        super(zzbu2);
    }

    public final String zza() {
        this.zzV();
        return this.zzb;
    }

    public final String zzb() {
        this.zzV();
        return this.zza;
    }

    public final boolean zzc() {
        this.zzV();
        return this.zzf;
    }

    public final void zzd() {
        Object object;
        zzcr zzcr2;
        int n3;
        Object object2 = this.zzo();
        Object object3 = object2.getPackageManager();
        object2 = object2.getPackageName();
        int n4 = 128;
        try {
            object2 = object3.getApplicationInfo((String)object2, n4);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object3 = "PackageManager doesn't know about the app package";
            this.zzR((String)object3, (Object)nameNotFoundException);
            n3 = 0;
            object2 = null;
        }
        if (object2 == null) {
            this.zzQ("Couldn't get ApplicationInfo to load global config");
            return;
        }
        object2 = object2.metaData;
        if (object2 != null && (n3 = object2.getInt((String)(object3 = "com.google.android.gms.analytics.globalConfigResource"))) > 0 && (object2 = (zzej)(zzcr2 = new zzcr((zzbu)(object3 = this.zzt()), (zzcq)(object = new zzei((zzbu)object3)))).zza(n3)) != null) {
            int n7;
            Object object4;
            this.zzN("Loading global XML config values");
            object3 = object2.zza;
            if (object3 != null) {
                this.zzb = object3;
                object = "XML config - app name";
                this.zzF((String)object, object3);
            }
            if ((object3 = object2.zzb) != null) {
                this.zza = object3;
                object = "XML config - app version";
                this.zzF((String)object, object3);
            }
            object3 = object2.zzc;
            n4 = -1;
            boolean bl2 = false;
            zzcr2 = null;
            int n8 = 1;
            if (object3 != null) {
                object4 = Locale.US;
                object4 = "verbose";
                boolean bl3 = ((String)object4).equals(object3 = ((String)object3).toLowerCase((Locale)object4));
                if (bl3) {
                    n7 = 0;
                    object3 = null;
                } else {
                    object4 = "info";
                    bl3 = ((String)object4).equals(object3);
                    n7 = bl3 ? 1 : ((bl3 = ((String)(object4 = "warning")).equals(object3)) ? 2 : ((n7 = (int)(((String)(object4 = "error")).equals(object3) ? 1 : 0)) != 0 ? 3 : -1));
                }
                if (n7 >= 0) {
                    object3 = n7;
                    object4 = "XML config - log level";
                    this.zzO((String)object4, object3);
                }
            }
            if ((n7 = object2.zzd) >= 0) {
                this.zzd = n7;
                this.zzc = n8;
                object3 = n7;
                object4 = "XML config - dispatch period (sec)";
                this.zzF((String)object4, object3);
            }
            if ((n3 = object2.zze) != n4) {
                if (n8 == n3) {
                    bl2 = true;
                }
                this.zzf = bl2;
                this.zze = n8;
                object2 = bl2;
                object3 = "XML config - dry run";
                this.zzF((String)object3, object2);
            }
        }
    }

    public final boolean zze() {
        this.zzV();
        return this.zze;
    }

    public final boolean zzf() {
        this.zzV();
        return false;
    }
}

