/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzco;
import com.google.android.gms.internal.consent_sdk.zzde;
import com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzap {
    static final zzde zza = zzde.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    public zzap(Application object) {
        HashSet hashSet;
        this.zzb = object;
        object = object.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = object;
        Set set = Collections.emptySet();
        object = object.getStringSet("written_values", set);
        this.zzd = hashSet = new HashSet(object);
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final ConsentInformation$PrivacyOptionsRequirementStatus zzb() {
        String string2 = ConsentInformation$PrivacyOptionsRequirementStatus.UNKNOWN.name();
        return ConsentInformation$PrivacyOptionsRequirementStatus.valueOf(this.zzc.getString("privacy_options_requirement_status", string2));
    }

    public final Map zzc() {
        boolean bl2;
        Object object = this.zzc;
        Object object2 = "stored_info";
        Object object3 = zzde.zzi();
        boolean bl3 = (object = object.getStringSet((String)object2, (Set)object3)).isEmpty();
        if (bl3) {
            object = zza;
        }
        object2 = new Object();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2;
            block10: {
                block8: {
                    boolean bl4;
                    block9: {
                        block7: {
                            object3 = this.zzb;
                            string2 = (String)object.next();
                            Object object4 = zzco.zza((Context)object3, string2);
                            if (object4 == null) {
                                object3 = String.valueOf(string2);
                                string2 = "Fetching request info: failed for key: ";
                                string2.concat((String)object3);
                                continue;
                            }
                            String string3 = ((zzcm)object4).zza;
                            object3 = object3.getSharedPreferences(string3, 0).getAll();
                            object4 = ((zzcm)object4).zzb;
                            if ((object3 = object3.get(object4)) == null) {
                                object3 = String.valueOf(string2);
                                string2 = "Stored info not exists: ";
                                string2.concat((String)object3);
                                continue;
                            }
                            bl4 = object3 instanceof Boolean;
                            if (!bl4) break block7;
                            bl4 = true;
                            bl2 = (Boolean)(object3 = (Boolean)object3);
                            object3 = bl4 != bl2 ? "0" : "1";
                            break block8;
                        }
                        bl4 = object3 instanceof Number;
                        if (!bl4) break block9;
                        object3 = object3.toString();
                        break block8;
                    }
                    bl4 = object3 instanceof String;
                    if (!bl4) break block10;
                    object3 = (String)object3;
                }
                ((HashMap)object2).put(string2, object3);
                continue;
            }
            object3 = String.valueOf(string2);
            string2 = "Failed to fetch stored info: ";
            string2.concat((String)object3);
        }
        return object2;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        Application application = this.zzb;
        Set set = this.zzd;
        zzco.zzb((Context)application, set);
        this.zzd.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zzf() {
        SharedPreferences.Editor editor = this.zzc.edit();
        Set set = this.zzd;
        editor.putStringSet("written_values", set).apply();
    }

    public final void zzg(int n3) {
        this.zzc.edit().putInt("consent_status", n3).apply();
    }

    public final void zzh(ConsentInformation$PrivacyOptionsRequirementStatus object) {
        SharedPreferences.Editor editor = this.zzc.edit();
        object = object.name();
        editor.putString("privacy_options_requirement_status", (String)object).apply();
    }

    public final void zzi(Set set) {
        this.zzc.edit().putStringSet("stored_info", set).apply();
    }
}

