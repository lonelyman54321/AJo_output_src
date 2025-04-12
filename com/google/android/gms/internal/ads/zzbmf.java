/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzccn;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbmf
implements zzblp {
    private final Object zza;
    private final Map zzb;

    public zzbmf() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Object object, Map object2) {
        object = "Result GMSG: ";
        String string2 = "Received result for unexpected method invocation: ";
        CharSequence charSequence = (String)object2.get("id");
        String string3 = (String)object2.get("fail");
        String string4 = (String)object2.get("fail_reason");
        String string5 = (String)object2.get("fail_stack");
        Object object3 = "result";
        object2 = (String)object2.get(object3);
        boolean bl2 = true;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string5);
        if (bl2 == bl3) {
            string4 = "Unknown Fail Reason.";
        }
        if (bl2 = TextUtils.isEmpty((CharSequence)string5)) {
            string5 = "";
        } else {
            string5 = String.valueOf(string5);
            object3 = "\n";
            string5 = ((String)object3).concat(string5);
        }
        object3 = this.zza;
        synchronized (object3) {
            Throwable throwable2;
            block11: {
                block14: {
                    JSONException jSONException2;
                    Object object4;
                    block13: {
                        block12: {
                            try {
                                object4 = this.zzb;
                                object4 = object4.remove(charSequence);
                                object4 = (zzbme)object4;
                                if (object4 == null) {
                                    object = new StringBuilder(string2);
                                    ((StringBuilder)object).append((String)charSequence);
                                    object = ((StringBuilder)object).toString();
                                    zzm.zzj((String)object);
                                    return;
                                }
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                            boolean bl4 = TextUtils.isEmpty((CharSequence)string3);
                            if (!bl4) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(string4);
                                ((StringBuilder)object).append(string5);
                                object = ((StringBuilder)object).toString();
                                object4.zza((String)object);
                                return;
                            }
                            if (object2 == null) {
                                object = null;
                                object4.zzb(null);
                                return;
                            }
                            try {
                                string2 = new JSONObject((String)object2);
                                int n3 = zze.zzc();
                                if (n3 == 0) break block12;
                                n3 = 2;
                                object2 = string2.toString(n3);
                                charSequence = new StringBuilder((String)object);
                                ((StringBuilder)charSequence).append((String)object2);
                                object = ((StringBuilder)charSequence).toString();
                                zze.zza((String)object);
                            }
                            catch (JSONException jSONException2) {
                                break block13;
                            }
                        }
                        object4.zzb((JSONObject)string2);
                        break block14;
                    }
                    String string6 = jSONException2.getMessage();
                    object4.zza(string6);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final ListenableFuture zzb(zzbox zzbox2, String string2, JSONObject jSONObject) {
        zzccn zzccn2 = new zzccn();
        zzu.zzp();
        String string3 = UUID.randomUUID().toString();
        zzbmd zzbmd2 = new zzbmd(this, zzccn2);
        this.zzc(string3, zzbmd2);
        zzbmd2 = new JSONObject();
        String string4 = "id";
        zzbmd2.put(string4, string3);
        string3 = "args";
        zzbmd2.put(string3, jSONObject);
        try {
            zzbox2.zzl(string2, (JSONObject)zzbmd2);
        }
        catch (Exception exception) {
            zzccn2.zzd(exception);
        }
        return zzccn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String string2, zzbme zzbme2) {
        Object object = this.zza;
        synchronized (object) {
            Map map2 = this.zzb;
            map2.put(string2, zzbme2);
            return;
        }
    }
}

