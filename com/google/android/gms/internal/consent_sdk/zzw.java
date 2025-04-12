/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzcj;
import com.google.android.gms.internal.consent_sdk.zzck;
import com.google.android.gms.internal.consent_sdk.zzd;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.internal.consent_sdk.zzx;
import com.google.android.gms.internal.consent_sdk.zzz;
import com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class zzw {
    private final zzx zza;
    private final zzck zzb;
    private int zzc = 0;
    private ConsentInformation$PrivacyOptionsRequirementStatus zzd;

    public zzw(zzx zzx2, zzck zzck2) {
        ConsentInformation$PrivacyOptionsRequirementStatus consentInformation$PrivacyOptionsRequirementStatus;
        this.zzd = consentInformation$PrivacyOptionsRequirementStatus = ConsentInformation$PrivacyOptionsRequirementStatus.UNKNOWN;
        this.zza = zzx2;
        this.zzb = zzck2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzz zza() {
        block15: {
            block16: {
                var1_1 = 1;
                var2_2 = this.zzb;
                var3_3 = var2_2.zzf;
                var4_4 = var3_3 + -1;
                if (var3_3 == 0) break block15;
                var5_5 /* !! */  = "Invalid response from server.";
                var6_6 = 2;
                var7_7 = 3;
                switch (var4_4) {
                    default: {
                        var2_2 = new Iterator<E>(var1_1, (String)var5_5 /* !! */ );
                        throw var2_2;
                    }
                    case 7: {
                        var2_2 = String.valueOf(var2_2.zzc);
                        var2_2 = "Publisher misconfiguration: ".concat((String)var2_2);
                        var8_8 = new zzg(var7_7, (String)var2_2);
                        throw var8_8;
                    }
                    case 6: {
                        var2_2 = String.valueOf(var2_2.zzc);
                        var2_2 = "Invalid response from server: ".concat((String)var2_2);
                        var5_5 /* !! */  = new zzg(var1_1, (String)var2_2);
                        throw var5_5 /* !! */ ;
                    }
                    case 5: {
                        this.zzc = var1_1;
                        break;
                    }
                    case 4: {
                        this.zzc = var6_6;
                        break;
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        this.zzc = var7_7;
                    }
                }
                var4_4 = var2_2.zzg;
                var7_7 = var4_4 + -1;
                if (var4_4 == 0) break block16;
                if (var7_7 == var1_1) ** GOTO lbl41
                if (var7_7 == var6_6) {
                    var5_5 /* !! */  = ConsentInformation$PrivacyOptionsRequirementStatus.NOT_REQUIRED;
                    this.zzd = var5_5 /* !! */ ;
                } else {
                    var2_2 = new Iterator<E>(var1_1, (String)var5_5 /* !! */ );
                    throw var2_2;
lbl41:
                    // 1 sources

                    var5_5 /* !! */  = ConsentInformation$PrivacyOptionsRequirementStatus.REQUIRED;
                    this.zzd = var5_5 /* !! */ ;
                }
                var5_5 /* !! */  = var2_2.zza;
                if (var5_5 /* !! */  == null) {
                    var4_4 = 0;
                    var9_10 = null;
                } else {
                    var10_11 = var2_2.zzb;
                    var9_10 = new zzbp((String)var10_11, (String)var5_5 /* !! */ );
                }
                var5_5 /* !! */  = zzx.zzc(this.zza);
                var2_2 = var2_2.zzd;
                var10_11 = new HashSet(var2_2);
                var5_5 /* !! */ .zzi((Set)var10_11);
                var2_2 = this.zzb.zze.iterator();
                while ((var3_3 = (int)var2_2.hasNext()) != 0) {
                    block17: {
                        block19: {
                            block18: {
                                var5_5 /* !! */  = (zzcj)var2_2.next();
                                var7_7 = var5_5 /* !! */ .zzb;
                                var11_12 = var7_7 + -1;
                                if (var7_7 == 0) break block17;
                                if (var11_12 == 0) ** GOTO lbl-1000
                                if (var11_12 != var1_1) {
                                    ** if (var11_12 == var6_6) goto lbl-1000
                                }
                                break block18;
lbl-1000:
                                // 2 sources

                                {
                                    var7_7 = 0;
                                    var10_11 = null;
                                    ** GOTO lbl71
                                }
lbl-1000:
                                // 1 sources

                                {
                                    var10_11 = "clear";
                                }
                                break block19;
                            }
                            var10_11 = "write";
                        }
                        if (var10_11 == null) continue;
                        var12_13 = this.zza;
                        var13_14 = zzx.zza((zzx)var12_13);
                        var5_5 /* !! */  = var5_5 /* !! */ .zza;
                        var12_13 = zzx.zzb((zzx)var12_13);
                        var14_15 = new zzd[var1_1];
                        var14_15[0] = var12_13;
                        var13_14.zzb((String)var10_11, (String)var5_5 /* !! */ , var14_15);
                        continue;
                    }
                    throw null;
                }
                var15_16 = this.zzc;
                var5_5 /* !! */  = this.zzd;
                var8_9 = new zzz(var15_16, (ConsentInformation$PrivacyOptionsRequirementStatus)var5_5 /* !! */ , var9_10, null);
                return var8_9;
            }
            throw null;
        }
        throw null;
    }
}

