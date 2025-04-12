/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  android.webkit.WebSettings
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.SharedPreferencesUtils;

public final class zzck {
    private static zzck zzb;
    String zza;

    private zzck() {
    }

    public static zzck zza() {
        zzck zzck2 = zzb;
        if (zzck2 == null) {
            zzb = zzck2 = new zzck();
        }
        return zzb;
    }

    public final void zzb(Context context) {
        block5: {
            String string2;
            block7: {
                String string3;
                block6: {
                    zze.zza("Updating user agent.");
                    string2 = WebSettings.getDefaultUserAgent((Context)context);
                    string3 = this.zza;
                    boolean bl2 = string2.equals(string3);
                    if (bl2) break block5;
                    string3 = GooglePlayServicesUtilLight.getRemoteContext(context);
                    boolean bl3 = ClientLibraryUtils.isPackageSide();
                    if (bl3) break block6;
                    if (string3 != null) break block7;
                    bl2 = false;
                    string3 = null;
                }
                String string4 = WebSettings.getDefaultUserAgent((Context)context);
                String string5 = "admob_user_agent";
                SharedPreferences.Editor editor = context.getSharedPreferences(string5, 0).edit();
                String string6 = "user_agent";
                string4 = editor.putString(string6, string4);
                if (string3 == null) {
                    string4.apply();
                } else {
                    SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, (SharedPreferences.Editor)string4, string5);
                }
            }
            this.zza = string2;
        }
        zze.zza("User agent is updated.");
    }
}

