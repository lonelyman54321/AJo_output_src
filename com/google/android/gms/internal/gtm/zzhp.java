/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.gtm;

import android.net.Uri;
import com.google.android.gms.internal.gtm.zzhi;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class zzhp {
    private static zzhp zza;
    private volatile String zzb = null;
    private volatile String zzc = null;
    private volatile int zzd = 1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzhp zza() {
        Class<zzhp> clazz = zzhp.class;
        synchronized (clazz) {
            try {
                zzhp zzhp2 = zza;
                if (zzhp2 != null) return zza;
                zza = zzhp2 = new zzhp();
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        int n3 = this.zzd;
        int n4 = 2;
        return n3 == n4;
    }

    public final boolean zze(String string2) {
        String string3;
        boolean bl2;
        boolean bl3 = this.zzd();
        return bl3 && (bl2 = (string3 = this.zzb).equals(string2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzf(String string2, Uri object) {
        synchronized (this) {
            Throwable throwable2;
            block14: {
                String string3;
                block16: {
                    block17: {
                        int n3;
                        block15: {
                            int n4;
                            int n7;
                            int n8;
                            String string4;
                            String string5;
                            int n10;
                            block13: {
                                n10 = 0;
                                string5 = null;
                                try {
                                    try {
                                        string3 = object.toString();
                                        string4 = "UTF-8";
                                        string3 = URLDecoder.decode(string3, string4);
                                        string4 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+";
                                        boolean bl2 = string3.matches(string4);
                                        if (bl2) break block13;
                                        string2 = "Bad preview url: ";
                                        string2 = string2.concat(string3);
                                    }
                                    catch (UnsupportedEncodingException unsupportedEncodingException) {
                                        object = "Error decoding the preview url: ";
                                        String string6 = ((Object)unsupportedEncodingException).toString();
                                        string6 = ((String)object).concat(string6);
                                        zzhi.zze(string6);
                                        return false;
                                    }
                                    zzhi.zze(string2);
                                    return false;
                                }
                                catch (Throwable throwable2) {
                                    break block14;
                                }
                            }
                            string4 = "id";
                            string4 = object.getQueryParameter(string4);
                            String string7 = "gtm_auth";
                            string7 = object.getQueryParameter(string7);
                            String string8 = "gtm_preview";
                            string8 = object.getQueryParameter(string8);
                            n3 = string2.equals(string4);
                            if (n3 == 0) {
                                string2 = "Preview fails (container doesn't match the container specified by the asset)";
                                zzhi.zze(string2);
                                return false;
                            }
                            if (string4 == null || (n3 = string4.length()) <= 0) break block16;
                            n3 = 1;
                            if (string8 != null && (n8 = string8.length()) == 0) {
                                object = this.zzb;
                                int n14 = string4.equals(object);
                                if (n14 != 0 && (n14 = this.zzd) != n3) {
                                    object = this.zzb;
                                    object = String.valueOf(object);
                                    string5 = "Exit preview mode for container: ";
                                    object = string5.concat((String)object);
                                    zzhi.zzd((String)object);
                                    this.zzd = n3;
                                    n14 = 0;
                                    object = null;
                                    this.zzb = null;
                                    this.zzc = null;
                                    break block15;
                                } else {
                                    string2 = "Error in exiting preview mode. The container is not in preview.";
                                    zzhi.zze(string2);
                                    return false;
                                }
                            }
                            if (string8 == null || (n7 = string8.length()) <= 0 || string7 == null || (n4 = string7.length()) <= 0) break block17;
                            this.zzd = n10 = 2;
                            this.zzc = object = object.getQuery();
                            this.zzb = string4;
                        }
                        return n3 != 0;
                    }
                    string2 = "Bad preview url: ";
                    string2 = string2.concat(string3);
                    zzhi.zze(string2);
                    return false;
                }
                string2 = "Bad preview url: ";
                string2 = string2.concat(string3);
                zzhi.zze(string2);
                return false;
            }
            throw throwable2;
        }
    }
}

