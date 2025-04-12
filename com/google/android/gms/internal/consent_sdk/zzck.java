/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 */
package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import com.google.android.gms.internal.consent_sdk.zzcj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzck {
    public String zza;
    public String zzb;
    public String zzc;
    public List zzd;
    public List zze;
    public int zzf;
    public int zzg;

    public zzck() {
        List list;
        int n3;
        this.zzf = n3 = 1;
        this.zzd = list = Collections.emptyList();
        this.zze = list = Collections.emptyList();
        this.zzg = n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static zzck zza(JsonReader var0) {
        var1_1 = new zzck();
        var0 /* !! */ .beginObject();
        block38: while ((var2_2 = var0 /* !! */ .hasNext()) != 0) {
            block62: {
                var3_3 = var0 /* !! */ .nextName();
                var4_4 = var3_3.hashCode();
                var5_5 = 6;
                var6_6 = 5;
                var7_7 = -1;
                var8_8 = 3;
                var9_9 = 2;
                var10_10 = 1;
                switch (var4_4) {
                    default: {
                        break;
                    }
                    case -790907624: {
                        var11_11 = "consent_form_payload";
                        var2_2 = (int)var3_3.equals(var11_11);
                        if (var2_2 == 0) break;
                        var2_2 = 1;
                        break block62;
                    }
                    case -986806987: {
                        var11_11 = "request_info_keys";
                        var2_2 = (int)var3_3.equals(var11_11);
                        if (var2_2 == 0) break;
                        var2_2 = 4;
                        break block62;
                    }
                    case -1161803523: {
                        var11_11 = "actions";
                        var2_2 = (int)var3_3.equals(var11_11);
                        if (var2_2 == 0) break;
                        var2_2 = 5;
                        break block62;
                    }
                    case -1324537865: {
                        var11_11 = "privacy_options_required";
                        var2_2 = (int)var3_3.equals(var11_11);
                        if (var2_2 == 0) break;
                        var2_2 = 6;
                        break block62;
                    }
                    case -1851537225: {
                        var11_11 = "consent_form_base_url";
                        var2_2 = (int)var3_3.equals(var11_11);
                        if (var2_2 == 0) break;
                        var2_2 = 2;
                        break block62;
                    }
                    case -1938755376: {
                        var11_11 = "error_message";
                        var2_2 = (int)var3_3.equals(var11_11);
                        if (var2_2 == 0) break;
                        var2_2 = 3;
                        break block62;
                    }
                    case -2001388947: {
                        var11_11 = "consent_signal";
                        var2_2 = (int)var3_3.equals(var11_11);
                        if (var2_2 == 0) break;
                        var2_2 = 0;
                        var3_3 = null;
                        break block62;
                    }
                }
                var2_2 = -1;
            }
            switch (var2_2) {
                default: {
                    var0 /* !! */ .skipValue();
                    continue block38;
                }
                case 6: {
                    var3_3 = var0 /* !! */ .nextString();
                    var4_4 = var3_3.hashCode();
                    var5_5 = -1888946261;
                    if (var4_4 != var5_5) {
                        var5_5 = 389487519;
                        if (var4_4 != var5_5) {
                            var5_5 = 433141802;
                            if (var4_4 == var5_5 && (var4_4 = (int)var3_3.equals(var11_11 = "UNKNOWN")) != 0) {
                                var7_7 = 0;
                            }
                        } else {
                            var11_11 = "REQUIRED";
                            var4_4 = (int)var3_3.equals(var11_11);
                            if (var4_4 != 0) {
                                var7_7 = 1;
                            }
                        }
                    } else {
                        var11_11 = "NOT_REQUIRED";
                        var4_4 = (int)var3_3.equals(var11_11);
                        if (var4_4 != 0) {
                            var7_7 = 2;
                        }
                    }
                    if (var7_7 != 0) {
                        if (var7_7 != var10_10) {
                            if (var7_7 != var9_9) {
                                var1_1 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat((String)var3_3);
                                var0 /* !! */  = new IOException((String)var1_1);
                                throw var0 /* !! */ ;
                            }
                        } else {
                            var8_8 = 2;
                        }
                    } else {
                        var8_8 = 1;
                    }
                    var1_1.zzg = var8_8;
                    continue block38;
                }
                case 5: {
                    var3_3 = new ArrayList();
                    var1_1.zze = var3_3;
                    var0 /* !! */ .beginArray();
                    while ((var2_2 = (int)var0 /* !! */ .hasNext()) != 0) {
                        var3_3 = new zzcj();
                        var0 /* !! */ .beginObject();
                        while ((var4_4 = (int)var0 /* !! */ .hasNext()) != 0) {
                            var11_11 = var0 /* !! */ .nextName();
                            var5_5 = var11_11.hashCode();
                            if (var5_5 == (var6_6 = -2105551094)) ** GOTO lbl112
                            var6_6 = 1583758243;
                            if (var5_5 != var6_6 || (var4_4 = (int)var11_11.equals(var12_12 = "action_type")) == 0) ** GOTO lbl-1000
                            var4_4 = 0;
                            var11_11 = null;
                            ** GOTO lbl118
lbl112:
                            // 1 sources

                            var12_12 = "args_json";
                            var4_4 = (int)var11_11.equals(var12_12);
                            if (var4_4 != 0) {
                                var4_4 = 1;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var4_4 = -1;
                            }
lbl118:
                            // 3 sources

                            if (var4_4 != 0) {
                                if (var4_4 != var10_10) {
                                    var0 /* !! */ .skipValue();
                                    continue;
                                }
                                var3_3.zza = var11_11 = var0 /* !! */ .nextString();
                                continue;
                            }
                            var11_11 = var0 /* !! */ .nextString();
                            var5_5 = var11_11.hashCode();
                            if (var5_5 == (var6_6 = 64208429)) ** GOTO lbl139
                            var6_6 = 82862015;
                            if (var5_5 == var6_6) ** GOTO lbl134
                            var6_6 = 1856333582;
                            if (var5_5 != var6_6 || (var5_5 = (int)var11_11.equals(var12_12 = "UNKNOWN_ACTION_TYPE")) == 0) ** GOTO lbl-1000
                            var5_5 = 0;
                            var12_12 = null;
                            ** GOTO lbl145
lbl134:
                            // 1 sources

                            var12_12 = "WRITE";
                            var5_5 = (int)var11_11.equals(var12_12);
                            if (var5_5 == 0) ** GOTO lbl-1000
                            var5_5 = 1;
                            ** GOTO lbl145
lbl139:
                            // 1 sources

                            var12_12 = "CLEAR";
                            var5_5 = (int)var11_11.equals(var12_12);
                            if (var5_5 != 0) {
                                var5_5 = 2;
                            } else lbl-1000:
                            // 3 sources

                            {
                                var5_5 = -1;
                            }
lbl145:
                            // 4 sources

                            if (var5_5 == 0) ** GOTO lbl155
                            if (var5_5 == var10_10) ** GOTO lbl153
                            if (var5_5 == var9_9) {
                                var4_4 = 3;
                            } else {
                                var1_1 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat((String)var11_11);
                                var0 /* !! */  = new IOException((String)var1_1);
                                throw var0 /* !! */ ;
lbl153:
                                // 1 sources

                                var4_4 = 2;
                            }
                            ** GOTO lbl156
lbl155:
                            // 1 sources

                            var4_4 = 1;
lbl156:
                            // 3 sources

                            var3_3.zzb = var4_4;
                        }
                        var0 /* !! */ .endObject();
                        var11_11 = var1_1.zze;
                        var11_11.add(var3_3);
                    }
                    var0 /* !! */ .endArray();
                    continue block38;
                }
                case 4: {
                    var3_3 = new ArrayList();
                    var1_1.zzd = var3_3;
                    var0 /* !! */ .beginArray();
                    while ((var2_2 = (int)var0 /* !! */ .hasNext()) != 0) {
                        var3_3 = var0 /* !! */ .nextString();
                        var11_11 = var1_1.zzd;
                        var11_11.add(var3_3);
                    }
                    var0 /* !! */ .endArray();
                    continue block38;
                }
                case 3: {
                    var1_1.zzc = var3_3 = var0 /* !! */ .nextString();
                    continue block38;
                }
                case 2: {
                    var1_1.zzb = var3_3 = var0 /* !! */ .nextString();
                    continue block38;
                }
                case 1: {
                    var1_1.zza = var3_3 = var0 /* !! */ .nextString();
                    continue block38;
                }
                case 0: 
            }
            var3_3 = var0 /* !! */ .nextString();
            var4_4 = var3_3.hashCode();
            switch (var4_4) {
                default: {
                    break;
                }
                case 1725474845: {
                    var11_11 = "CONSENT_SIGNAL_NOT_REQUIRED";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 5;
                    break;
                }
                case 467888915: {
                    var11_11 = "CONSENT_SIGNAL_PERSONALIZED_ADS";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 1;
                    break;
                }
                case 429411856: {
                    var11_11 = "CONSENT_SIGNAL_SUFFICIENT";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 3;
                    break;
                }
                case -918677260: {
                    var11_11 = "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 7;
                    break;
                }
                case -954325659: {
                    var11_11 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 2;
                    break;
                }
                case -1263695752: {
                    var11_11 = "CONSENT_SIGNAL_UNKNOWN";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 0;
                    break;
                }
                case -1969035850: {
                    var11_11 = "CONSENT_SIGNAL_ERROR";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 6;
                    break;
                }
                case -2058725357: {
                    var11_11 = "CONSENT_SIGNAL_COLLECT_CONSENT";
                    var4_4 = (int)var3_3.equals(var11_11);
                    if (var4_4 == 0) break;
                    var7_7 = 4;
                }
            }
            switch (var7_7) {
                default: {
                    var1_1 = "Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat((String)var3_3);
                    var0 /* !! */  = new IOException((String)var1_1);
                    throw var0 /* !! */ ;
                }
                case 7: {
                    var5_5 = 8;
                    break;
                }
                case 6: {
                    var5_5 = 7;
                    break;
                }
                case 4: {
                    var5_5 = 5;
                    break;
                }
                case 3: {
                    var5_5 = 4;
                    break;
                }
                case 2: {
                    var5_5 = 3;
                    break;
                }
                case 1: {
                    var5_5 = 2;
                    break;
                }
                case 0: {
                    var5_5 = 1;
                }
                case 5: 
            }
            var1_1.zzf = var5_5;
        }
        var0 /* !! */ .endObject();
        return var1_1;
    }
}

