/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.preference.PreferenceManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeuf;
import com.google.android.gms.internal.ads.zzeuh;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeui
implements zzexw {
    private final Context zza;
    private final zzgge zzb;

    public zzeui(Context context, zzgge zzgge2) {
        this.zza = context;
        this.zzb = zzgge2;
    }

    public final int zza() {
        return 18;
    }

    public final ListenableFuture zzb() {
        zzeuf zzeuf2 = new zzeuf(this);
        return this.zzb.zzb(zzeuf2);
    }

    public final /* synthetic */ zzeuh zzc() {
        Object object;
        zzu.zzp();
        Object object2 = zzbep.zzgl;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean bl2 = (Boolean)object2;
        String string2 = "mobileads_consent";
        int n3 = 0;
        String string3 = "";
        if (!bl2) {
            object2 = string3;
        } else {
            object2 = this.zza.getSharedPreferences(string2, 0);
            object = "consent_string";
            object2 = object2.getString((String)object, string3);
        }
        object = zzbep.zzgn;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3) {
            string2 = this.zza.getSharedPreferences(string2, 0);
            object = "fc_consent";
            string3 = string2.getString((String)object, string3);
        }
        zzu.zzp();
        string2 = this.zza;
        object = zzbep.zzgm;
        object = (Boolean)zzba.zzc().zza((zzbeg)object);
        bl3 = (Boolean)object;
        zzben2 = null;
        if (!bl3) {
            bl3 = false;
            object = null;
        } else {
            string2 = PreferenceManager.getDefaultSharedPreferences((Context)string2);
            object = new Bundle();
            String[] stringArray = "IABConsent_CMPPresent";
            int n4 = string2.contains((String)stringArray);
            if (n4 != 0) {
                n4 = string2.getBoolean((String)stringArray, false);
                object.putBoolean((String)stringArray, n4 != 0);
            }
            String string4 = "IABConsent_ParsedVendorConsents";
            String string5 = "IABConsent_SubjectToGDPR";
            String string6 = "IABConsent_ConsentString";
            stringArray = new String[]{string5, string6, "IABConsent_ParsedPurposeConsents", string4};
            while (n3 < (n4 = 4)) {
                string4 = stringArray[n3];
                boolean bl4 = string2.contains(string4);
                if (bl4) {
                    string5 = string2.getString(string4, null);
                    object.putString(string4, string5);
                }
                ++n3;
            }
        }
        zzeuh zzeuh2 = new zzeuh((String)object2, string3, (Bundle)object, null);
        return zzeuh2;
    }
}

