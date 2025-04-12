/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzfgv;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfgw {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzfgv zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final JSONObject zzn;
    public final JSONObject zzo;
    public final String zzp;
    public final int zzq;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzfgw(JsonReader jsonReader) {
        JSONObject jSONObject;
        String string2;
        boolean bl2;
        String string3;
        zzfgw zzfgw2 = this;
        Object object = Collections.emptyList();
        Object object2 = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        Object object3 = new JSONObject();
        jsonReader.beginObject();
        String string4 = string3 = "";
        Object object4 = string3;
        Object object5 = string3;
        Object object6 = string3;
        Object object7 = string3;
        Object object8 = null;
        int n3 = 0;
        int n4 = 0;
        int n7 = 0;
        long l2 = 0L;
        int n8 = 1;
        Object object9 = string3;
        while (bl2 = jsonReader.hasNext()) {
            block30: {
                block17: {
                    block37: {
                        block19: {
                            int n10;
                            int n14;
                            Object object10;
                            block36: {
                                block35: {
                                    block34: {
                                        block33: {
                                            block32: {
                                                block31: {
                                                    block29: {
                                                        block28: {
                                                            block27: {
                                                                block26: {
                                                                    block25: {
                                                                        block24: {
                                                                            int n15;
                                                                            block23: {
                                                                                block22: {
                                                                                    block21: {
                                                                                        block20: {
                                                                                            block18: {
                                                                                                object10 = jsonReader.nextName();
                                                                                                string2 = object7;
                                                                                                object7 = "nofill_urls";
                                                                                                n14 = (int)(((String)object7).equals(object10) ? 1 : 0);
                                                                                                if (n14 == 0) break block18;
                                                                                                object = zzbw.zzd(jsonReader);
                                                                                                break block19;
                                                                                            }
                                                                                            object7 = "refresh_interval";
                                                                                            n14 = ((String)object7).equals(object10);
                                                                                            if (n14 == 0) break block20;
                                                                                            n7 = n15 = jsonReader.nextInt();
                                                                                            break block19;
                                                                                        }
                                                                                        object7 = "gws_query_id";
                                                                                        n14 = ((String)object7).equals(object10);
                                                                                        if (n14 == 0) break block21;
                                                                                        object10 = jsonReader.nextString();
                                                                                        string3 = object10;
                                                                                        break block19;
                                                                                    }
                                                                                    object7 = "analytics_query_ad_event_id";
                                                                                    n14 = ((String)object7).equals(object10);
                                                                                    if (n14 == 0) break block22;
                                                                                    object10 = jsonReader.nextString();
                                                                                    string4 = object10;
                                                                                    break block19;
                                                                                }
                                                                                object7 = "is_idless";
                                                                                n14 = ((String)object7).equals(object10);
                                                                                if (n14 == 0) break block23;
                                                                                n4 = n15 = (int)(jsonReader.nextBoolean() ? 1 : 0);
                                                                                break block19;
                                                                            }
                                                                            object7 = "response_code";
                                                                            n14 = ((String)object7).equals(object10);
                                                                            if (n14 == 0) break block24;
                                                                            n3 = n15 = jsonReader.nextInt();
                                                                            break block19;
                                                                        }
                                                                        object7 = "latency";
                                                                        n14 = ((String)object7).equals(object10);
                                                                        if (n14 == 0) break block25;
                                                                        l2 = jsonReader.nextLong();
                                                                        break block19;
                                                                    }
                                                                    object7 = zzbep.zzir;
                                                                    jSONObject = object3;
                                                                    object3 = (Boolean)zzba.zzc().zza((zzbeg)object7);
                                                                    n10 = ((Boolean)object3).booleanValue();
                                                                    if (n10 == 0 || (n10 = ((String)(object3 = "public_error")).equals(object10)) == 0 || (object3 = jsonReader.peek()) != (object7 = JsonToken.BEGIN_OBJECT)) break block26;
                                                                    object7 = jsonReader;
                                                                    object8 = object3 = new zzfgv(jsonReader);
                                                                    break block17;
                                                                }
                                                                object7 = jsonReader;
                                                                object3 = "bidding_data";
                                                                n10 = ((String)object3).equals(object10);
                                                                if (n10 == 0) break block27;
                                                                object9 = object3 = jsonReader.nextString();
                                                                break block17;
                                                            }
                                                            object3 = zzbep.zzkt;
                                                            object7 = zzba.zzc();
                                                            object3 = (Boolean)((zzben)object7).zza((zzbeg)object3);
                                                            n10 = ((Boolean)object3).booleanValue();
                                                            if (n10 == 0 || (n10 = Objects.equals(object10, object3 = "topics_should_record_observation")) == 0) break block28;
                                                            jsonReader.nextBoolean();
                                                            break block17;
                                                        }
                                                        object3 = "adapter_response_replacement_key";
                                                        n10 = ((String)object3).equals(object10);
                                                        if (n10 == 0) break block29;
                                                        object7 = object3 = jsonReader.nextString();
                                                        break block30;
                                                    }
                                                    object3 = "response_info_extras";
                                                    n10 = ((String)object3).equals(object10);
                                                    if (n10 == 0) break block31;
                                                    object3 = zzbep.zzgZ;
                                                    object10 = zzba.zzc();
                                                    object3 = (Boolean)((zzben)object10).zza((zzbeg)object3);
                                                    n10 = ((Boolean)object3).booleanValue();
                                                    if (n10 != 0) {
                                                        try {
                                                            object3 = zzbw.zzi(jsonReader);
                                                            if ((object3 = zzbw.zza((JSONObject)object3)) != null) {
                                                                object2 = object3;
                                                            }
                                                            break block17;
                                                        }
                                                        catch (IOException | JSONException throwable) {
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            jsonReader.skipValue();
                                                        }
                                                        break block17;
                                                    } else {
                                                        jsonReader.skipValue();
                                                    }
                                                    break block17;
                                                }
                                                object3 = "adRequestPostBody";
                                                n10 = ((String)object3).equals(object10);
                                                if (n10 == 0) break block32;
                                                object3 = zzbep.zzjn;
                                                object10 = zzba.zzc();
                                                object3 = (Boolean)((zzben)object10).zza((zzbeg)object3);
                                                n10 = ((Boolean)object3).booleanValue();
                                                if (n10 != 0) {
                                                    object5 = object3 = jsonReader.nextString();
                                                    break block17;
                                                } else {
                                                    jsonReader.skipValue();
                                                }
                                                break block17;
                                            }
                                            object3 = "adRequestUrl";
                                            n10 = ((String)object3).equals(object10);
                                            if (n10 == 0) break block33;
                                            object3 = zzbep.zzjn;
                                            object10 = zzba.zzc();
                                            object3 = (Boolean)((zzben)object10).zza((zzbeg)object3);
                                            n10 = ((Boolean)object3).booleanValue();
                                            if (n10 != 0) {
                                                object4 = object3 = jsonReader.nextString();
                                                break block17;
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                            break block17;
                                        }
                                        object3 = zzbep.zzjo;
                                        object7 = (Boolean)zzba.zzc().zza((zzbeg)object3);
                                        n14 = ((Boolean)object7).booleanValue();
                                        if (n14 == 0 || (n14 = Objects.equals(object10, object7 = "adResponseBody")) == 0) break block34;
                                        object6 = object3 = jsonReader.nextString();
                                        break block17;
                                    }
                                    object7 = zzba.zzc();
                                    object3 = (Boolean)((zzben)object7).zza((zzbeg)object3);
                                    n10 = ((Boolean)object3).booleanValue();
                                    if (n10 == 0 || (n10 = Objects.equals(object10, object3 = "adResponseHeaders")) == 0) break block35;
                                    jSONObject2 = zzbw.zzi(jsonReader);
                                    break block17;
                                }
                                object3 = "max_parallel_renderers";
                                n10 = Objects.equals(object10, object3);
                                if (n10 == 0) break block36;
                                n10 = jsonReader.nextInt();
                                n14 = 1;
                                n8 = Math.max(n14, n10);
                                break block17;
                            }
                            n14 = 1;
                            object3 = zzbep.zzjv;
                            object7 = zzba.zzc();
                            object3 = (Boolean)((zzben)object7).zza((zzbeg)object3);
                            n10 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                            if (n10 == 0 || (n10 = (int)(Objects.equals(object10, object3 = "inspector_ad_transaction_extras") ? 1 : 0)) == 0) break block37;
                            object3 = zzbw.zzi(jsonReader);
                        }
                        object7 = string2;
                        continue;
                    }
                    jsonReader.skipValue();
                }
                object7 = string2;
            }
            object3 = jSONObject;
        }
        jSONObject = object3;
        string2 = object7;
        jsonReader.endObject();
        zzfgw2.zza = object;
        zzfgw2.zzc = n7;
        zzfgw2.zzb = string3;
        zzfgw2.zzd = string4;
        zzfgw2.zze = n3;
        long l3 = l2;
        zzfgw2.zzf = l2;
        object = object8;
        zzfgw2.zzi = object8;
        zzfgw2.zzg = n4;
        zzfgw2.zzh = object9;
        zzfgw2.zzj = object2;
        zzfgw2.zzk = object4;
        zzfgw2.zzl = object5;
        zzfgw2.zzm = object6;
        zzfgw2.zzn = jSONObject2;
        zzfgw2.zzo = object3;
        zzfgw2.zzp = object7;
        object = zzbgo.zza;
        object2 = (Long)((zzbfv)object).zze();
        long l4 = (Long)object2;
        l3 = 0L;
        long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (l7 > 0) {
            object = (Long)((zzbfv)object).zze();
            n8 = ((Long)object).intValue();
        }
        zzfgw2.zzq = n8;
    }
}

