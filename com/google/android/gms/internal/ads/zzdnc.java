/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzdmz;
import com.google.android.gms.internal.ads.zzdnf;
import java.util.Map;

public final class zzdnc
implements zzblp {
    public final /* synthetic */ zzdnf zza;

    public /* synthetic */ zzdnc(zzdnf zzdnf2) {
        this.zza = zzdnf2;
    }

    public final void zza(Object object, Map map2) {
        Object object2 = object;
        object2 = (zzchd)object;
        object = object2.zzN();
        Object object3 = this.zza;
        Object object4 = new zzdmz((zzdnf)object3, map2);
        object.zzB((zzcit)object4);
        object3 = object = map2.get("overlayHtml");
        object3 = (String)object;
        object4 = object = map2.get("baseUrl");
        object4 = (String)object;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object4);
        if (bl2) {
            object2.loadData((String)object3, "text/html", "UTF-8");
            return;
        }
        object2.loadDataWithBaseURL((String)object4, (String)object3, "text/html", "UTF-8", null);
    }
}

