/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.preference.PreferenceManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.Objects;

public final class zzcag
implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzcag(Context context, zzg zzg2) {
        SharedPreferences sharedPreferences2;
        this.zzb = sharedPreferences2 = PreferenceManager.getDefaultSharedPreferences((Context)context);
        this.zzc = zzg2;
        this.zza = context;
    }

    private final void zzb() {
        this.zzc.zzI(true);
        zzad.zzc(this.zza);
    }

    private final void zzc(String object, int n3) {
        Object object2;
        char c2;
        Object object3 = zzbep.zzax;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        boolean bl2 = (Boolean)object3;
        char c3 = '1';
        boolean bl3 = true;
        if (!(bl2 ? n3 == 0 || (n3 = (int)(((String)object).isEmpty() ? 1 : 0)) != 0 || (n3 = (int)((String)object).charAt(0)) != c3 && (c2 = (char)(((String)object).equals(object2 = "-1") ? 1 : 0)) == '\u0000' : (n3 = (int)(((String)object).isEmpty() ? 1 : 0)) != 0 || (c2 = ((String)object).charAt(0)) != c3)) {
            bl3 = false;
        }
        this.zzc.zzI(bl3);
        object = zzbep.zzgs;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        c2 = (char)(((Boolean)object).booleanValue() ? 1 : 0);
        if (c2 != '\u0000' && bl3 && (object = this.zza) != null) {
            object2 = "OfflineUpload.db";
            object.deleteDatabase((String)object2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSharedPreferenceChanged(SharedPreferences var1_1, String var2_3) {
        block9: {
            block11: {
                block10: {
                    block6: {
                        block7: {
                            block8: {
                                var3_4 = "IABTCF_PurposeConsents";
                                try {
                                    var4_5 = zzbep.zzaz;
                                    var5_6 = zzba.zzc();
                                    var4_5 = var5_6.zza((zzbeg)var4_5);
                                    var4_5 = (Boolean)var4_5;
                                    var6_7 = var4_5.booleanValue();
                                    var5_6 = "-1";
                                    var7_8 = -1;
                                    var8_9 = "gad_has_consent_for_cookies";
                                    if (!var6_7) break block6;
                                    var9_10 = Objects.equals(var2_3, var8_9);
                                    if (!var9_10) break block7;
                                    var10_12 = var1_1 /* !! */ .getInt(var8_9, var7_8);
                                    if (var10_12 == (var11_14 = (var2_3 = this.zzc).zzb())) break block8;
                                    this.zzb();
                                }
                                catch (Throwable var1_2) {
                                    break block9;
                                }
                            }
                            var2_3 = this.zzc;
                            var2_3.zzF(var10_12);
                            return;
                        }
                        var3_4 = "IABTCF_TCString";
                        var9_10 = Objects.equals(var2_3, var3_4);
                        if (var9_10 == false) return;
                        var1_1 /* !! */  = var1_1 /* !! */ .getString((String)var2_3, (String)var5_6);
                        var2_3 = this.zzc;
                        var11_15 = Objects.equals(var1_1 /* !! */ , var2_3 = var2_3.zzp());
                        if (!var11_15) {
                            this.zzb();
                        }
                        var2_3 = this.zzc;
                        var2_3.zzO((String)var1_1 /* !! */ );
                        return;
                    }
                    var4_5 = var1_1 /* !! */ .getString((String)var3_4, (String)var5_6);
                    var10_13 = var1_1 /* !! */ .getInt(var8_9, var7_8);
                    var2_3 = String.valueOf(var2_3);
                    var12_17 = var2_3.hashCode();
                    var13_18 = -2004976699;
                    var14_19 = 1;
                    if (var12_17 == var13_18) break block10;
                    var9_11 = -527267622;
                    if (var12_17 != var9_11 || (var11_16 = (int)var2_3.equals(var8_9)) == 0) ** GOTO lbl-1000
                    var11_16 = 1;
                    break block11;
                }
                var11_16 = var2_3.equals(var3_4);
                if (var11_16 != 0) {
                    var11_16 = 0;
                    var2_3 = null;
                } else lbl-1000:
                // 2 sources

                {
                    var11_16 = -1;
                }
            }
            if (var11_16 == 0) ** GOTO lbl71
            if (var11_16 == var14_19) ** GOTO lbl-1000
            return;
lbl-1000:
            // 1 sources

            {
                var2_3 = zzbep.zzax;
                var3_4 = zzba.zzc();
                var2_3 = var3_4.zza((zzbeg)var2_3);
                var2_3 = (Boolean)var2_3;
                var11_16 = (int)var2_3.booleanValue();
                if (var11_16 == 0) return;
                if (var10_13 == var7_8) return;
                var11_16 = this.zze;
                if (var11_16 == var10_13) return;
                this.zze = var10_13;
                this.zzc((String)var4_5, var10_13);
                return;
lbl71:
                // 1 sources

                var11_16 = (int)var4_5.equals(var5_6);
                if (var11_16 != 0) return;
                var2_3 = this.zzd;
                var11_16 = (int)var2_3.equals(var4_5);
                if (var11_16 != 0) return;
                this.zzd = var4_5;
                this.zzc((String)var4_5, var10_13);
                return;
            }
        }
        zzu.zzo().zzw(var1_2, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
        com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", var1_2);
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
        Object object = this.zzb;
        this.onSharedPreferenceChanged((SharedPreferences)object, "gad_has_consent_for_cookies");
        object = zzbep.zzaz;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzb;
            this.onSharedPreferenceChanged((SharedPreferences)object, "IABTCF_TCString");
            return;
        }
        object = this.zzb;
        this.onSharedPreferenceChanged((SharedPreferences)object, "IABTCF_PurposeConsents");
    }
}

