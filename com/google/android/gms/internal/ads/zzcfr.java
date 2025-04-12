/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzfup;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzcfr
implements zzfup {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzcfr(String string2) {
        this.zza = string2;
    }

    public final URLConnection zza() {
        int n3;
        int n4 = zzcfs.zzd;
        zzu.zzw();
        Object object = zzbep.zzz;
        object = (Integer)zzba.zzc().zza((zzbeg)object);
        n4 = (Integer)object;
        String string2 = this.zza;
        Object object2 = new URL(string2);
        string2 = null;
        int n7 = 0;
        while (++n7 <= (n3 = 20)) {
            URLConnection uRLConnection = ((URL)object2).openConnection();
            uRLConnection.setConnectTimeout(n4);
            uRLConnection.setReadTimeout(n4);
            int n8 = uRLConnection instanceof HttpURLConnection;
            if (n8 != 0) {
                uRLConnection = (HttpURLConnection)uRLConnection;
                URL uRL = null;
                Object object3 = new zzl(null);
                ((zzl)object3).zzc((HttpURLConnection)uRLConnection, null);
                ((HttpURLConnection)uRLConnection).setInstanceFollowRedirects(false);
                int n10 = ((HttpURLConnection)uRLConnection).getResponseCode();
                ((zzl)object3).zze((HttpURLConnection)uRLConnection, n10);
                n8 = 3;
                if ((n10 /= 100) == n8) {
                    object3 = uRLConnection.getHeaderField("Location");
                    if (object3 != null) {
                        uRL = new URL((URL)object2, (String)object3);
                        if ((object2 = uRL.getProtocol()) != null) {
                            String string3 = "http";
                            boolean bl2 = ((String)object2).equals(string3);
                            if (!bl2 && !(bl2 = ((String)object2).equals(string3 = "https"))) {
                                object = "Unsupported scheme: ".concat((String)object2);
                                object2 = new IOException((String)object);
                                throw object2;
                            }
                            zzm.zze("Redirecting to ".concat((String)object3));
                            ((HttpURLConnection)uRLConnection).disconnect();
                            object2 = uRL;
                            continue;
                        }
                        object = new IOException("Protocol is null");
                        throw object;
                    }
                    object = new IOException("Missing Location header in redirect");
                    throw object;
                }
                return uRLConnection;
            }
            object = new IOException("Invalid protocol.");
            throw object;
        }
        object = new IOException("Too many redirects (20)");
        throw object;
    }
}

