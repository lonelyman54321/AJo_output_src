/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package com.google.android.gms.ads.identifier;

import android.net.Uri;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.zzc;
import java.util.Iterator;
import java.util.Map;

final class zza
extends Thread {
    final /* synthetic */ Map zza;

    public zza(AdvertisingIdClient advertisingIdClient, Map map2) {
        this.zza = map2;
    }

    public final void run() {
        boolean bl2;
        Map map2 = this.zza;
        Uri.Builder builder = Uri.parse((String)"https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = (String)map2.get(string2);
            builder.appendQueryParameter(string2, string3);
        }
        zzc.zza(builder.build().toString());
    }
}

