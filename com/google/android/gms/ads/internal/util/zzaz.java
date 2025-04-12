/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzara;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzars;
import com.google.android.gms.internal.ads.zzart;
import com.google.android.gms.internal.ads.zzasa;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzftv;
import com.google.android.gms.internal.ads.zzftw;
import java.io.File;
import java.util.regex.Pattern;

public final class zzaz
extends zzart {
    private final Context zzc;

    private zzaz(Context context, zzars zzars2) {
        super(zzars2);
        this.zzc = context;
    }

    public static zzarh zzb(Context object) {
        Object object2 = new zzasf(null, null);
        zzaz zzaz2 = new zzaz((Context)object, (zzars)object2);
        Object object3 = zzftu.zza();
        object = object.getCacheDir();
        object = zzftv.zza((zzftw)object3, (File)object, "admob_volley");
        object2 = new File((String)object);
        object3 = new zzasa((File)object2, 0x1400000);
        object = new zzarh((zzaqo)object3, zzaz2, 4);
        ((zzarh)object).zzd();
        return object;
    }

    public final zzara zza(zzare object) {
        int n3 = ((zzare)object).zza();
        if (n3 == 0) {
            Object object2 = ((zzare)object).zzk();
            Object object3 = zzbep.zzex;
            zzben zzben2 = zzba.zzc();
            object3 = (String)zzben2.zza((zzbeg)object3);
            n3 = (int)(Pattern.matches((String)object3, (CharSequence)object2) ? 1 : 0);
            if (n3 != 0) {
                object2 = this.zzc;
                zzay.zzb();
                int n4 = 0xCC77C0;
                n3 = (int)(zzf.zzt((Context)object2, n4) ? 1 : 0);
                if (n3 != 0) {
                    object2 = this.zzc;
                    object3 = new zzbnm((Context)object2);
                    if ((object2 = ((zzbnm)object3).zza((zzare)object)) != null) {
                        object = String.valueOf(((zzare)object).zzk());
                        zze.zza("Got gmscore asset response: ".concat((String)object));
                        return object2;
                    }
                    object2 = String.valueOf(((zzare)object).zzk());
                    object3 = "Failed to get gmscore asset response: ";
                    object2 = ((String)object3).concat((String)object2);
                    zze.zza((String)object2);
                }
            }
        }
        return super.zza((zzare)object);
    }
}

