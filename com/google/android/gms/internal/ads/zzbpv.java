/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbpu;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class zzbpv
implements zzbom,
zzbpu {
    private final zzbpu zza;
    private final HashSet zzb;

    public zzbpv(zzbpu hashSet) {
        this.zza = hashSet;
        this.zzb = hashSet = new HashSet();
    }

    public final void zza(String string2) {
        this.zza.zza(string2);
    }

    public final /* synthetic */ void zzb(String string2, String string3) {
        zzbol.zzc(this, string2, string3);
    }

    public final void zzc() {
        boolean bl2;
        Iterator iterator = this.zzb.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (AbstractMap.SimpleEntry)iterator.next();
            Object object2 = String.valueOf(((zzblp)((AbstractMap.SimpleEntry)object).getValue()).toString());
            zze.zza("Unregistering eventhandler: ".concat((String)object2));
            object2 = this.zza;
            String string2 = (String)((AbstractMap.SimpleEntry)object).getKey();
            object = (zzblp)((AbstractMap.SimpleEntry)object).getValue();
            object2.zzr(string2, (zzblp)object);
        }
        this.zzb.clear();
    }

    public final /* synthetic */ void zzd(String string2, Map map2) {
        zzbol.zza(this, string2, map2);
    }

    public final /* synthetic */ void zze(String string2, JSONObject jSONObject) {
        zzbol.zzb(this, string2, jSONObject);
    }

    public final /* synthetic */ void zzl(String string2, JSONObject jSONObject) {
        zzbol.zzd(this, string2, jSONObject);
    }

    public final void zzq(String string2, zzblp zzblp2) {
        this.zza.zzq(string2, zzblp2);
        AbstractMap.SimpleEntry<String, zzblp> simpleEntry = new AbstractMap.SimpleEntry<String, zzblp>(string2, zzblp2);
        this.zzb.add(simpleEntry);
    }

    public final void zzr(String string2, zzblp zzblp2) {
        this.zza.zzr(string2, zzblp2);
        AbstractMap.SimpleEntry<String, zzblp> simpleEntry = new AbstractMap.SimpleEntry<String, zzblp>(string2, zzblp2);
        this.zzb.remove(simpleEntry);
    }
}

