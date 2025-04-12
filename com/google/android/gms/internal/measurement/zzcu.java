/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zzcr;
import com.google.android.gms.internal.measurement.zzct;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class zzcu
implements SharedPreferences.Editor {
    private boolean zza = false;
    private Set zzb;
    private Map zzc;
    private final /* synthetic */ zzcr zzd;

    private zzcu(zzcr cloneable) {
        this.zzd = cloneable;
        this.zzb = cloneable = new Cloneable();
        this.zzc = cloneable;
    }

    public /* synthetic */ zzcu(zzcr zzcr2, zzct zzct2) {
        this(zzcr2);
    }

    private final void zza(String string2, Object object) {
        if (object != null) {
            this.zzc.put(string2, object);
            return;
        }
        this.remove(string2);
    }

    public final void apply() {
        this.commit();
    }

    public final SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    public final boolean commit() {
        Object object;
        Object object2;
        boolean bl2;
        Object object3;
        boolean bl3 = this.zza;
        if (bl3) {
            object3 = zzcr.zza(this.zzd);
            object3.clear();
        }
        object3 = zzcr.zza(this.zzd).keySet();
        Object object4 = this.zzb;
        object3.removeAll((Collection<?>)object4);
        object3 = this.zzc.entrySet().iterator();
        while (bl2 = object3.hasNext()) {
            object4 = object3.next();
            object2 = zzcr.zza(this.zzd);
            object = (String)object4.getKey();
            object4 = object4.getValue();
            object2.put(object, object4);
        }
        object3 = zzcr.zzb(this.zzd).iterator();
        while (bl2 = object3.hasNext()) {
            boolean bl4;
            object4 = (SharedPreferences.OnSharedPreferenceChangeListener)object3.next();
            object2 = this.zzb;
            object = this.zzc.keySet();
            object2 = Sets.union((Set)object2, (Set)object).iterator();
            while (bl4 = object2.hasNext()) {
                object = (String)object2.next();
                zzcr zzcr2 = this.zzd;
                object4.onSharedPreferenceChanged((SharedPreferences)zzcr2, (String)object);
            }
        }
        bl3 = this.zza;
        return bl3 || !(bl3 = (object3 = this.zzb).isEmpty()) || !(bl3 = (object3 = this.zzc).isEmpty());
        {
        }
    }

    public final SharedPreferences.Editor putBoolean(String string2, boolean bl2) {
        Boolean bl3 = bl2;
        this.zza(string2, bl3);
        return this;
    }

    public final SharedPreferences.Editor putFloat(String string2, float f5) {
        Float f6 = Float.valueOf(f5);
        this.zza(string2, f6);
        return this;
    }

    public final SharedPreferences.Editor putInt(String string2, int n3) {
        Integer n4 = n3;
        this.zza(string2, n4);
        return this;
    }

    public final SharedPreferences.Editor putLong(String string2, long l2) {
        Long l3 = l2;
        this.zza(string2, l3);
        return this;
    }

    public final SharedPreferences.Editor putString(String string2, String string3) {
        this.zza(string2, string3);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String string2, Set set) {
        this.zza(string2, set);
        return this;
    }

    public final SharedPreferences.Editor remove(String string2) {
        this.zzb.add(string2);
        return this;
    }
}

