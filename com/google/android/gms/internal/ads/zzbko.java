/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzcik;
import java.util.HashMap;
import java.util.Map;

public final class zzbko
implements zzblp {
    public final void zza(Object object, Map object2) {
        boolean bl2;
        object = (zzcik)object;
        Object object3 = zzblo.zza;
        object3 = zzbep.zzio;
        Object object4 = zzba.zzc();
        object3 = (Boolean)((zzben)object4).zza((zzbeg)object3);
        boolean bl3 = (Boolean)object3;
        if (!bl3) {
            zzm.zzj("canOpenAppGmsgHandler disabled.");
            return;
        }
        object3 = "package_name";
        bl3 = TextUtils.isEmpty((CharSequence)(object2 = (String)object2.get(object3)));
        if (bl3) {
            zzm.zzj("Package name missing in canOpenApp GMSG.");
            return;
        }
        object3 = new Object();
        object4 = object.getContext().getPackageManager().getLaunchIntentForPackage((String)object2);
        if (object4 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object4 = null;
        }
        object4 = bl2;
        ((HashMap)object3).put(object2, object4);
        StringBuilder stringBuilder = new StringBuilder("/canOpenApp;");
        stringBuilder.append((String)object2);
        stringBuilder.append(";");
        stringBuilder.append(object4);
        zze.zza(stringBuilder.toString());
        ((zzbok)object).zzd("openableApp", (Map)object3);
    }
}

