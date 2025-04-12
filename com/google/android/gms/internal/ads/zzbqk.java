/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpw;
import com.google.android.gms.internal.ads.zzbql;
import com.google.android.gms.internal.ads.zzccn;
import org.json.JSONException;
import org.json.JSONObject;

final class zzbqk
implements zzbme {
    final /* synthetic */ zzbql zza;
    private final zzbpn zzb;
    private final zzccn zzc;

    public zzbqk(zzbql zzbql2, zzbpn zzbpn2, zzccn zzccn2) {
        this.zza = zzbql2;
        this.zzb = zzbpn2;
        this.zzc = zzccn2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String object) {
        block4: {
            Throwable throwable2222;
            block5: {
                if (object == null) {
                    try {
                        object = this.zzc;
                        zzbpw zzbpw2 = new zzbpw();
                        ((zzccn)object).zzd(zzbpw2);
                        break block4;
                    }
                    catch (Throwable throwable2222) {
                        break block5;
                    }
                }
                zzccn zzccn2 = this.zzc;
                zzbpw zzbpw3 = new zzbpw((String)object);
                zzccn2.zzd(zzbpw3);
                break block4;
            }
            this.zzb.zzb();
            throw throwable2222;
            catch (IllegalStateException illegalStateException) {}
        }
        this.zzb.zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(JSONObject object) {
        block5: {
            try {
                try {
                    zzccn zzccn2 = this.zzc;
                    Object object2 = this.zza;
                    object2 = zzbql.zzc((zzbql)object2);
                    object = object2.zza((JSONObject)object);
                    zzccn2.zzc(object);
                    break block5;
                }
                catch (JSONException jSONException) {
                    zzccn zzccn3 = this.zzc;
                    zzccn3.zzd(jSONException);
                    break block5;
                }
                catch (IllegalStateException illegalStateException) {}
                break block5;
            }
            catch (Throwable throwable22) {}
            this.zzb.zzb();
            throw throwable22;
        }
        this.zzb.zzb();
    }
}

