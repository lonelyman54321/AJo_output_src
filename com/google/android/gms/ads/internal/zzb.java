/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzcaf zzc;
    private final zzbwx zzd;

    public zzb(Context object, zzcaf zzcaf2, zzbwx object2) {
        this.zza = object;
        this.zzc = zzcaf2;
        object2 = Collections.emptyList();
        super(false, (List)object2);
        this.zzd = object;
    }

    private final boolean zzd() {
        block4: {
            block3: {
                boolean bl2;
                Object object;
                block2: {
                    object = this.zzc;
                    if (object == null) break block2;
                    object = object.zza();
                    bl2 = ((zzcac)object).zzf;
                    if (bl2) break block3;
                }
                object = this.zzd;
                bl2 = ((zzbwx)object).zza;
                if (!bl2) break block4;
            }
            return true;
        }
        return false;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String string2) {
        boolean bl2 = this.zzd();
        if (bl2) {
            Iterator iterator;
            String string3 = "";
            if (string2 == null) {
                string2 = string3;
            }
            if ((iterator = this.zzc) != null) {
                iterator.zzd(string2, null, 3);
                return;
            }
            iterator = this.zzd;
            boolean bl3 = ((zzbwx)((Object)iterator)).zza;
            if (bl3 && (iterator = ((zzbwx)((Object)iterator)).zzb) != null) {
                iterator = iterator.iterator();
                while (bl3 = iterator.hasNext()) {
                    String string4 = (String)iterator.next();
                    boolean bl4 = TextUtils.isEmpty((CharSequence)string4);
                    if (bl4) continue;
                    String string5 = Uri.encode((String)string2);
                    String string6 = "{NAVIGATION_URL}";
                    string4 = string4.replace(string6, string5);
                    string5 = this.zza;
                    zzu.zzp();
                    zzt.zzL((Context)string5, string3, string4);
                }
            }
        }
    }

    public final boolean zzc() {
        boolean bl2 = this.zzd();
        return !bl2 || (bl2 = this.zzb);
        {
        }
    }
}

