/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtx;
import com.google.android.gms.internal.ads.zzdsq;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfim;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdst {
    private final zzfik zza;
    private final zzdsq zzb;

    public zzdst(zzfik zzfik2, zzdsq zzdsq2) {
        this.zza = zzfik2;
        this.zzb = zzdsq2;
    }

    public final zzbrf zza() {
        Object object = this.zza.zzb();
        if (object != null) {
            return object;
        }
        zzm.zzj("Unexpected call to adapter creator.");
        object = new RemoteException();
        throw object;
    }

    public final zzbte zzb(String string2) {
        zzbte zzbte2 = this.zza().zzc(string2);
        this.zzb.zzd(string2, zzbte2);
        return zzbte2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfim zzc(String object, JSONObject object2) {
        Throwable throwable2;
        Object object3;
        block7: {
            block6: {
                Object object4;
                block11: {
                    JSONException jSONException2;
                    block9: {
                        String string2;
                        block8: {
                            block10: {
                                boolean bl2;
                                block5: {
                                    object3 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
                                    try {
                                        object4 = "com.google.ads.mediation.admob.AdMobAdapter";
                                        bl2 = ((String)object4).equals(object);
                                        if (!bl2) break block5;
                                        object3 = new AdMobAdapter();
                                        object2 = new zzbsg((MediationAdapter)object3);
                                        break block6;
                                    }
                                    catch (Throwable throwable2) {
                                        break block7;
                                    }
                                }
                                object4 = "com.google.ads.mediation.admob.AdMobCustomTabsAdapter";
                                bl2 = ((String)object4).equals(object);
                                if (!bl2) break block10;
                                object3 = new zzbtx();
                                object2 = new zzbsg((MediationAdapter)object3);
                                break block6;
                            }
                            object4 = this.zza();
                            boolean bl3 = ((String)object3).equals(object);
                            string2 = "com.google.ads.mediation.customevent.CustomEventAdapter";
                            if (!bl3 && !(bl3 = string2.equals(object))) break block11;
                            String string3 = "class_name";
                            try {
                                object2 = object2.getString(string3);
                                bl3 = object4.zze((String)object2);
                                if (!bl3) break block8;
                                object2 = object4.zzb((String)object3);
                                break block6;
                            }
                            catch (JSONException jSONException2) {
                                break block9;
                            }
                        }
                        boolean bl4 = object4.zzd((String)object2);
                        object2 = bl4 ? object4.zzb((String)object2) : object4.zzb(string2);
                        break block6;
                    }
                    object3 = "Invalid custom event.";
                    zzm.zzh((String)object3, jSONException2);
                }
                object2 = object4.zzb((String)object);
            }
            zzfim zzfim2 = new zzfim((zzbri)object2);
            this.zzb.zzc((String)object, zzfim2);
            return zzfim2;
        }
        object3 = zzbep.zzjr;
        zzben zzben2 = zzba.zzc();
        object3 = (Boolean)zzben2.zza((zzbeg)object3);
        boolean bl5 = (Boolean)object3;
        if (bl5) {
            object3 = this.zzb;
            zzben2 = null;
            ((zzdsq)object3).zzc((String)object, null);
        }
        object = new zzfhv(throwable2);
        throw object;
    }

    public final boolean zzd() {
        zzbrf zzbrf2 = this.zza.zzb();
        return zzbrf2 != null;
    }
}

