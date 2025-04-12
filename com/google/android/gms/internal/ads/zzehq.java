/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONException
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class zzehq {
    private final List zza;
    private final Map zzb;
    private final String zzc;
    private zzfgw zzd = null;
    private zzfgt zze = null;
    private zzu zzf = null;

    public zzehq(String string2) {
        List list = new List();
        list = Collections.synchronizedMap(list);
        this.zzb = list;
        list = new List();
        this.zza = list = Collections.synchronizedList(list);
        this.zzc = string2;
    }

    private static String zzj(zzfgt zzfgt2) {
        Object object = zzbep.zzdA;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            return zzfgt2.zzaq;
        }
        return zzfgt2.zzx;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzk(zzfgt object, int n3) {
        synchronized (this) {
            Throwable throwable2;
            boolean bl2;
            String string2;
            Object object2;
            block12: {
                try {
                    object2 = this.zzb;
                    string2 = zzehq.zzj((zzfgt)object);
                    bl2 = object2.containsKey(string2);
                    if (!bl2) break block12;
                }
                catch (Throwable throwable2) {}
                return;
            }
            Bundle bundle = new Bundle();
            object2 = ((zzfgt)object).zzw;
            object2 = object2.keys();
            throw throwable2;
            while (true) {
                String string3;
                Object object3;
                Object object4;
                boolean bl3;
                if (bl3 = object2.hasNext()) {
                    object4 = object2.next();
                    object4 = (String)object4;
                    object3 = ((zzfgt)object).zzw;
                    object3 = object3.getString(object4);
                    bundle.putString(object4, (String)object3);
                }
                object2 = zzbep.zzgX;
                object4 = zzba.zzc();
                object2 = ((zzben)object4).zza((zzbeg)object2);
                bl2 = (Boolean)(object2 = (Boolean)object2);
                if (bl2) {
                    object2 = ((zzfgt)object).zzG;
                    object4 = ((zzfgt)object).zzH;
                    object3 = ((zzfgt)object).zzI;
                    string3 = ((zzfgt)object).zzJ;
                } else {
                    object2 = "";
                    object4 = "";
                    object3 = "";
                    string3 = "";
                }
                Object object5 = object2;
                Object object6 = object4;
                Object object7 = object3;
                object3 = ((zzfgt)object).zzF;
                long l2 = 0L;
                object4 = object2;
                object2 = new zzu((String)object3, l2, null, bundle, (String)object5, (String)object6, (String)object7, string3);
                try {
                    object = this.zza;
                    object.add(n3, object2);
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    String string4 = "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation";
                    object4 = com.google.android.gms.ads.internal.zzu.zzo();
                    ((zzcby)object4).zzw(indexOutOfBoundsException, string4);
                }
                object = this.zzb;
                object.put(string2, object2);
                return;
                catch (JSONException jSONException) {
                }
            }
        }
    }

    private final void zzl(zzfgt object, long l2, zze zze2, boolean bl2) {
        Object object2 = this.zzb;
        String string2 = zzehq.zzj((zzfgt)object);
        boolean bl3 = object2.containsKey(string2);
        if (bl3) {
            object2 = this.zze;
            if (object2 == null) {
                this.zze = object;
            }
            object = (zzu)this.zzb.get(string2);
            ((zzu)object).zzb = l2;
            ((zzu)object).zzc = zze2;
            Object object3 = zzbep.zzgY;
            zzben zzben2 = zzba.zzc();
            object3 = (Boolean)zzben2.zza((zzbeg)object3);
            boolean bl4 = (Boolean)object3;
            if (bl4 && bl2) {
                this.zzf = object;
            }
        }
    }

    public final zzu zza() {
        return this.zzf;
    }

    public final zzcze zzb() {
        zzfgt zzfgt2 = this.zze;
        zzfgw zzfgw2 = this.zzd;
        String string2 = this.zzc;
        zzcze zzcze2 = new zzcze(zzfgt2, "", this, zzfgw2, string2);
        return zzcze2;
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfgt zzfgt2) {
        int n3 = this.zza.size();
        this.zzk(zzfgt2, n3);
    }

    public final void zze(zzfgt object) {
        int n3;
        Object object2 = this.zzb;
        object = zzehq.zzj((zzfgt)object);
        object2 = this.zza;
        int n4 = object2.indexOf(object = object2.get(object));
        if (n4 < 0 || n4 >= (n3 = (object2 = this.zzb).size())) {
            object = this.zza;
            object2 = this.zzf;
            n4 = object.indexOf(object2);
        }
        if (n4 >= 0 && n4 < (n3 = (object2 = this.zzb).size())) {
            this.zzf = object2 = (zzu)this.zza.get(n4);
            while (++n4 < (n3 = (object2 = this.zza).size())) {
                long l2;
                object2 = (zzu)this.zza.get(n4);
                ((zzu)object2).zzb = l2 = 0L;
                ((zzu)object2).zzc = null;
            }
        }
    }

    public final void zzf(zzfgt zzfgt2, long l2, zze zze2) {
        this.zzl(zzfgt2, l2, zze2, false);
    }

    public final void zzg(zzfgt zzfgt2, long l2, zze zze2) {
        this.zzl(zzfgt2, l2, null, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(String object, List object2) {
        synchronized (this) {
            Throwable throwable22;
            block7: {
                try {
                    boolean bl2;
                    Object object4 = this.zzb;
                    int n3 = object4.containsKey(object);
                    if (n3 == 0) break block7;
                    object4 = this.zzb;
                    object4 = object4.get(object);
                    object4 = (zzu)object4;
                    Object object3 = this.zza;
                    n3 = object3.indexOf(object4);
                    try {
                        object3 = this.zza;
                        object3.remove(n3);
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        String string2 = "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry";
                        zzcby zzcby2 = com.google.android.gms.ads.internal.zzu.zzo();
                        zzcby2.zzw(indexOutOfBoundsException, string2);
                    }
                    object3 = this.zzb;
                    object3.remove(object);
                    object = object2.iterator();
                    while (bl2 = object.hasNext()) {
                        object2 = object.next();
                        object2 = (zzfgt)object2;
                        this.zzk((zzfgt)object2, n3);
                        ++n3;
                    }
                }
                catch (Throwable throwable22) {}
            }
            return;
            throw throwable22;
        }
    }

    public final void zzi(zzfgw zzfgw2) {
        this.zzd = zzfgw2;
    }
}

