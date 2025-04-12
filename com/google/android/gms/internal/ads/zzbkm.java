/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzcik;
import java.util.HashMap;
import java.util.Map;

public final class zzbkm
implements zzblp {
    public final void zza(Object object, Map stringArray) {
        int n3 = 1;
        object = (zzcik)object;
        Object object2 = zzblo.zza;
        object2 = "urls";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(stringArray = (String)stringArray.get(object2)));
        if (bl2) {
            zzm.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        stringArray = ((String)stringArray).split(",");
        object2 = new Object();
        PackageManager packageManager = object.getContext().getPackageManager();
        int n4 = ((Object)stringArray).length;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            Object string2 = stringArray[i3];
            boolean bl3 = 2 != 0;
            String string3 = ";";
            Object object3 = ((String)string2).split(string3, (int)(bl3 ? 1 : 0));
            CharSequence charSequence = object3[0].trim();
            int n7 = ((String[])object3).length;
            object3 = n7 > n3 ? object3[n3].trim() : "android.intent.action.VIEW";
            Object object4 = new Intent((String)object3, (Uri)(charSequence = Uri.parse((String)charSequence)));
            if ((object3 = packageManager.resolveActivity(object4, (int)((bl3 = 65536 != 0) ? 1 : 0))) != null) {
                bl3 = true;
            } else {
                bl3 = false;
                object3 = null;
            }
            object3 = bl3;
            ((HashMap)object2).put(string2, object3);
            object4 = "/canOpenURLs;";
            charSequence = new StringBuilder((String)object4);
            ((StringBuilder)charSequence).append((String)string2);
            ((StringBuilder)charSequence).append(string3);
            ((StringBuilder)charSequence).append(object3);
            string2 = ((StringBuilder)charSequence).toString();
            zze.zza((String)string2);
        }
        ((zzbok)object).zzd("openableURLs", (Map)object2);
    }
}

