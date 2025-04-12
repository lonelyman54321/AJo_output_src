/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzjl;
import com.google.android.gms.internal.gtm.zzoy;
import com.google.android.gms.internal.gtm.zzoz;
import com.google.android.gms.internal.gtm.zzpf;
import com.google.android.gms.internal.gtm.zzpl;
import com.google.android.gms.internal.gtm.zzqf;
import com.google.android.gms.internal.gtm.zzqh;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzph
implements zzpf {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final zzpl zza(byte[] var1_1) {
        block31: {
            block32: {
                block33: {
                    block29: {
                        block28: {
                            if (var1_1 /* !! */  == null) break block31;
                            var2_2 = var1_1 /* !! */ .length;
                            if (var2_2 == 0) break block32;
                            var3_3 = new String(var1_1 /* !! */ );
                            var1_1 /* !! */  = (byte[])new JSONObject;
                            var1_1 /* !! */ ((String)var3_3);
                            var3_3 = "runtime";
                            var3_3 = var1_1 /* !! */ .optJSONArray((String)var3_3);
                            if (var3_3 != null) break block28;
                            var4_4 = false;
                            var1_1 /* !! */  = null;
                            break block29;
                        }
                        var5_6 = new zzqf();
                        var6_7 = "resource";
                        var1_1 /* !! */  = (byte[])var1_1 /* !! */ .get((String)var6_7);
                        var7_8 = var1_1 /* !! */  instanceof JSONObject;
                        if (var7_8 == 0) break block33;
                        var1_1 /* !! */  = (byte[])((JSONObject)var1_1 /* !! */ );
                        var6_7 = "version";
                        var1_1 /* !! */  = (byte[])var1_1 /* !! */ .optString((String)var6_7);
                        var5_6.zzb((String)var1_1 /* !! */ );
                        var4_5 = 0;
                        var1_1 /* !! */  = null;
                        while (true) {
                            block30: {
                                var7_8 = var3_3.length();
                                if (var4_5 >= var7_8) break;
                                var6_7 = var3_3.get(var4_5);
                                var8_9 = var6_7 instanceof JSONArray;
                                if (var8_9 != 0) {
                                    var9_10 = var6_7;
                                    var9_10 = (JSONArray)var6_7;
                                    var8_9 = var9_10.length();
                                    if (var8_9 == 0) break block30;
                                }
                                var6_7 = zzoz.zza(var6_7);
                                var5_6.zza((zzjl)var6_7);
                            }
                            ++var4_5;
                        }
                        var1_1 /* !! */  = (byte[])var5_6.zzc();
                    }
                    if (var1_1 /* !! */  != null) {
                        var3_3 = "The runtime configuration was successfully parsed from the resource";
                        zzhi.zzd((String)var3_3);
                    }
                    var5_6 = Status.RESULT_SUCCESS;
                    var3_3 = new zzpl((Status)var5_6, 0, null, (zzqh)var1_1 /* !! */ );
                    return var3_3;
                }
                var1_1 /* !! */  = (byte[])new zzoy;
                var3_3 = "Resource map not found";
                try {
                    var1_1 /* !! */ ((String)var3_3);
                    throw var1_1 /* !! */ ;
                }
                catch (JSONException v0) {
                    var1_1 /* !! */  = (byte[])new zzoy;
                    var1_1 /* !! */ ("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
                    throw var1_1 /* !! */ ;
                }
lbl73:
                // 1 sources

                while (true) {
                    var1_1 /* !! */  = (byte[])new zzoy;
                    var1_1 /* !! */ ("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
                    throw var1_1 /* !! */ ;
                }
            }
            var1_1 /* !! */  = (byte[])new zzoy;
            var1_1 /* !! */ ("Cannot parse a 0 length byte[]");
            throw var1_1 /* !! */ ;
        }
        var1_1 /* !! */  = (byte[])new zzoy;
        var1_1 /* !! */ ("Cannot parse a null byte[]");
        throw var1_1 /* !! */ ;
        catch (zzoy v1) {
            ** continue;
        }
    }
}

