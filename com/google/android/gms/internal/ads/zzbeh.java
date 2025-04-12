/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbeq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class zzbeh {
    private final List zza;
    private final List zzb;
    private final List zzc;

    public zzbeh() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList();
    }

    public final List zza() {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = this.zzb.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zzbeg)object.next();
            zzben zzben2 = zzba.zzc();
            object2 = (String)zzben2.zza((zzbeg)object2);
            boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
            if (bl3) continue;
            arrayList.add(object2);
        }
        object = zzbeq.zza();
        arrayList.addAll((Collection<Object>)object);
        return arrayList;
    }

    public final List zzb() {
        boolean bl2;
        List list = this.zza();
        Object object = this.zzc.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (zzbeg)object.next();
            zzben zzben2 = zzba.zzc();
            object2 = (String)zzben2.zza((zzbeg)object2);
            boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
            if (bl3) continue;
            list.add(object2);
        }
        object = zzbeq.zzb();
        list.addAll(object);
        return list;
    }

    public final void zzc(zzbeg zzbeg2) {
        this.zzb.add(zzbeg2);
    }

    public final void zzd(zzbeg zzbeg2) {
        this.zza.add(zzbeg2);
    }

    public final void zze(SharedPreferences.Editor editor, int n3, JSONObject object) {
        boolean bl2;
        Iterator iterator = this.zza.iterator();
        while (bl2 = iterator.hasNext()) {
            int n4;
            zzbeg zzbeg2 = (zzbeg)iterator.next();
            int n7 = zzbeg2.zze();
            if (n7 != (n4 = 1)) continue;
            Object object2 = zzbeg2.zza((JSONObject)object);
            zzbeg2.zzd(editor, object2);
        }
        if (object != null) {
            object = object.toString();
            editor.putString("flag_configuration", (String)object);
            return;
        }
        zzm.zzg("Flag Json is null.");
    }
}

