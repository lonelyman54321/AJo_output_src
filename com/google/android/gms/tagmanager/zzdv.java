/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.tagmanager;

import android.net.Uri;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzdc;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

final class zzdv {
    private static zzdv zza;
    private volatile String zzb = null;
    private volatile String zzc = null;
    private volatile String zzd = null;
    private volatile int zze = 1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzdv zza() {
        Class<zzdv> clazz = zzdv.class;
        synchronized (clazz) {
            try {
                zzdv zzdv2 = zza;
                if (zzdv2 != null) return zza;
                zza = zzdv2 = new zzdv();
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static final String zzf(String string2) {
        return string2.split("&")[0].split("=")[1];
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzd(Uri object) {
        synchronized (this) {
            boolean bl3 = false;
            String string2 = null;
            try {
                boolean bl2;
                int n3;
                Object object2;
                Object object3;
                block8: {
                    int n4;
                    try {
                        object3 = object.toString();
                        object2 = "UTF-8";
                        object3 = URLDecoder.decode((String)object3, (String)object2);
                        object2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$";
                        n3 = ((String)object3).matches((String)object2);
                        bl2 = true;
                        if (n3 == 0) break block8;
                        string2 = "Container preview url: ";
                        object2 = zzdc.zzb;
                        string2 = string2.concat((String)object3);
                        ((zzbb)object2).zzd(string2);
                        string2 = ".*?&gtm_debug=x$";
                        bl3 = ((String)object3).matches(string2);
                        n4 = 2;
                        n3 = 3;
                        this.zze = bl3 ? n3 : n4;
                    }
                    catch (UnsupportedEncodingException unsupportedEncodingException) {}
                    object = object.getQuery();
                    string2 = "&gtm_debug=x";
                    String string3 = "";
                    this.zzd = object = ((String)object).replace(string2, string3);
                    int n7 = this.zze;
                    if (n7 == n4 || (n7 = this.zze) == n3) {
                        object = this.zzd;
                        object = String.valueOf(object);
                        string2 = "/r?";
                        this.zzc = object = string2.concat((String)object);
                    }
                    object = this.zzd;
                    this.zzb = object = zzdv.zzf((String)object);
                    return bl2;
                }
                object2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$";
                n3 = ((String)object3).matches((String)object2);
                if (n3 == 0) {
                    object = "Invalid preview uri: ";
                    ((String)object).concat((String)object3);
                    return false;
                }
                object = object.getQuery();
                boolean bl4 = ((String)(object = zzdv.zzf((String)object))).equals(object3 = this.zzb);
                if (bl4) {
                    object = this.zzb;
                    object = String.valueOf(object);
                    string2 = "Exit preview mode for container: ";
                    object3 = zzdc.zzb;
                    object = string2.concat((String)object);
                    ((zzbb)object3).zzd((String)object);
                    this.zze = bl2;
                    bl4 = false;
                    object = null;
                    this.zzc = null;
                    return bl2;
                }
            }
            catch (Throwable throwable22) {}
            throw throwable22;
            return false;
        }
    }

    public final int zze() {
        return this.zze;
    }
}

