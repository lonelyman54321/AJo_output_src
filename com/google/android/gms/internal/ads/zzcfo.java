/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcfp;
import java.util.HashMap;

final class zzcfo
implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcfp zze;

    public zzcfo(zzcfp zzcfp2, String string2, String string3, String string4, String string5) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = string4;
        this.zzd = string5;
        this.zze = zzcfp2;
    }

    public final void run() {
        int n3;
        String string2;
        String string3;
        HashMap hashMap;
        block22: {
            hashMap = p3.a("event", "precacheCanceled");
            string3 = this.zza;
            hashMap.put("src", string3);
            string2 = this.zzb;
            n3 = TextUtils.isEmpty((CharSequence)string2);
            if (n3 == 0) {
                string2 = this.zzb;
                string3 = "cachedSrc";
                hashMap.put(string3, string2);
            }
            string2 = this.zzc;
            int n4 = string2.hashCode();
            switch (n4) {
                default: {
                    break;
                }
                case 725497484: {
                    string3 = "noCacheDir";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 7;
                    break block22;
                }
                case 580119100: {
                    string3 = "expireFailed";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 6;
                    break block22;
                }
                case 96784904: {
                    string3 = "error";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block22;
                }
                case 3387234: {
                    string3 = "noop";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 4;
                    break block22;
                }
                case -32082395: {
                    string3 = "externalAbort";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 10;
                    break block22;
                }
                case -354048396: {
                    string3 = "sizeExceeded";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 11;
                    break block22;
                }
                case -642208130: {
                    string3 = "playerFailed";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 5;
                    break block22;
                }
                case -659376217: {
                    string3 = "contentLengthMissing";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    string2 = null;
                    break block22;
                }
                case -918817863: {
                    string3 = "downloadTimeout";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 9;
                    break block22;
                }
                case -1347010958: {
                    string3 = "inProgress";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block22;
                }
                case -1396664534: {
                    string3 = "badUrl";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 8;
                    break block22;
                }
                case -1947652542: {
                    string3 = "interrupted";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block22;
                }
            }
            n3 = -1;
        }
        string3 = "internal";
        switch (n3) {
            default: {
                break;
            }
            case 10: 
            case 11: {
                string3 = "policy";
                break;
            }
            case 8: 
            case 9: {
                string3 = "network";
                break;
            }
            case 6: 
            case 7: {
                string3 = "io";
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
        }
        hashMap.put("type", string3);
        string2 = this.zzc;
        string3 = "reason";
        hashMap.put(string3, string2);
        string2 = this.zzd;
        n3 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0);
        if (n3 == 0) {
            string2 = this.zzd;
            string3 = "message";
            hashMap.put(string3, string2);
        }
        zzcfp.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}

