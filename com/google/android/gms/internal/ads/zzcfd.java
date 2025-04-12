/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcds;
import java.util.Map;

public final class zzcfd
implements zzblp {
    private boolean zza;

    private static int zzb(Context object, Map object2, String string2, int n3) {
        boolean bl2;
        String string3;
        if ((object2 = (String)object2.get(string2)) != null) {
            zzay.zzb();
            int n4 = Integer.parseInt((String)object2);
            try {
                n3 = zzf.zzy((Context)object, n4);
            }
            catch (NumberFormatException numberFormatException) {
                object = new StringBuilder("Could not parse ");
                ((StringBuilder)object).append(string2);
                string3 = " in a video GMSG: ";
                ((StringBuilder)object).append(string3);
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                zzm.zzj((String)object);
            }
        }
        if (bl2 = zze.zzc()) {
            string3 = ", got string ";
            String string4 = ", int ";
            object = og_1.a("Parse pixels for ", string2, string3, (String)object2, string4);
            ((StringBuilder)object).append(n3);
            object2 = ".";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            zze.zza((String)object);
        }
        return n3;
    }

    private static void zzc(zzcds object, Map object2) {
        block15: {
            int n3;
            int n4;
            String string2 = (String)object2.get("minBufferMs");
            String string3 = (String)object2.get("maxBufferMs");
            String string4 = (String)object2.get("bufferForPlaybackMs");
            String string5 = (String)object2.get("bufferForPlaybackAfterRebufferMs");
            String string6 = "socketReceiveBufferSize";
            object2 = (String)object2.get(string6);
            if (string2 != null) {
                n4 = Integer.parseInt(string2);
                ((zzcds)object).zzB(n4);
            }
            if (string3 != null) {
                n4 = Integer.parseInt(string3);
                ((zzcds)object).zzA(n4);
            }
            if (string4 != null) {
                n3 = Integer.parseInt(string4);
                ((zzcds)object).zzy(n3);
            }
            if (string5 != null) {
                n3 = Integer.parseInt(string5);
                ((zzcds)object).zzz(n3);
            }
            if (object2 == null) break block15;
            int n7 = Integer.parseInt((String)object2);
            try {
                ((zzcds)object).zzD(n7);
                return;
            }
            catch (NumberFormatException numberFormatException) {
                object = new StringBuilder("Could not parse buffer parameters in loadControl video GMSG: (");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(string3);
                object2 = ")";
                ((StringBuilder)object).append((String)object2);
                object = ((StringBuilder)object).toString();
                zzm.zzj((String)object);
            }
        }
    }
}

