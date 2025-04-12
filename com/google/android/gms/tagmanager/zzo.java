/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzbc;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzfb;
import com.google.android.gms.tagmanager.zzfn;
import com.google.android.gms.tagmanager.zzfp;
import com.google.android.gms.tagmanager.zzm;
import com.google.android.gms.tagmanager.zzn;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzo
extends zzfn {
    static final String zza;
    private static final String zzb;
    private static final String zzc;
    private static final String zzd;
    private static final String zze;
    private static final Set zzf;
    private final zzn zzg;
    private final Context zzh;

    static {
        HashSet hashSet = com.google.android.gms.internal.gtm.zza.zzau.toString();
        zzb = hashSet;
        zzc = com.google.android.gms.internal.gtm.zzb.zzdU.toString();
        zzd = com.google.android.gms.internal.gtm.zzb.zze.toString();
        zze = com.google.android.gms.internal.gtm.zzb.zzdT.toString();
        zza = cP.a("gtm_", (String)((Object)hashSet), "_unrepeatable");
        zzf = hashSet = new HashSet();
    }

    public zzo(Context context) {
        zzm zzm2 = new zzm(context);
        String string2 = zzb;
        String[] stringArray = zzc;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
        this.zzg = zzm2;
        this.zzh = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzd(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    try {
                        Set set = zzf;
                        boolean bl3 = set.contains(string2);
                        bl2 = true;
                        if (bl3) break block5;
                        Context context = this.zzh;
                        String string3 = zza;
                        bl3 = (context = context.getSharedPreferences(string3, 0)).contains(string2);
                        if (bl3) {
                            set.add(string2);
                            return bl2;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return false;
                }
                return bl2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(Map clazz) {
        boolean bl2;
        String string2 = zze;
        Object object = clazz.get(string2);
        string2 = object != null ? zzfp.zzm(zzfp.zzk((zzap)clazz.get(string2))) : null;
        if (string2 == null || !(bl2 = this.zzd(string2))) {
            Object object2;
            object = zzc;
            object = Uri.parse((String)zzfp.zzm(zzfp.zzk((zzap)clazz.get(object)))).buildUpon();
            Object object3 = zzd;
            if ((clazz = (zzap)clazz.get(object3)) != null) {
                boolean bl3 = (clazz = zzfp.zzk((zzap)((Object)clazz))) instanceof List;
                if (!bl3) {
                    clazz = String.valueOf(object.build().toString());
                    "ArbitraryPixel: additional params not a list: not sending partial hit: ".concat((String)((Object)clazz));
                    return;
                }
                clazz = ((List)((Object)clazz)).iterator();
                while (bl3 = clazz.hasNext()) {
                    object3 = clazz.next();
                    boolean bl4 = object3 instanceof Map;
                    if (!bl4) {
                        clazz = String.valueOf(object.build().toString());
                        "ArbitraryPixel: additional params contains non-map: not sending partial hit: ".concat((String)((Object)clazz));
                        return;
                    }
                    object3 = ((Map)object3).entrySet().iterator();
                    while (bl4 = object3.hasNext()) {
                        object2 = object3.next();
                        String string3 = object2.getKey().toString();
                        object2 = object2.getValue().toString();
                        object.appendQueryParameter(string3, (String)object2);
                    }
                }
            }
            clazz = object.build().toString();
            zzbc.zzb(((zzm)this.zzg).zza).zza((String)((Object)clazz));
            clazz = String.valueOf(clazz);
            object = "ArbitraryPixel: url = ";
            object3 = zzdc.zzb;
            clazz = ((String)object).concat((String)((Object)clazz));
            ((zzbb)object3).zzd((String)((Object)clazz));
            if (string2 != null) {
                clazz = zzo.class;
                synchronized (clazz) {
                    object = zzf;
                    object.add(string2);
                    object = this.zzh;
                    object3 = zza;
                    object2 = "true";
                    zzfb.zza((Context)object, (String)object3, string2, (String)object2);
                    return;
                }
            }
        }
    }
}

