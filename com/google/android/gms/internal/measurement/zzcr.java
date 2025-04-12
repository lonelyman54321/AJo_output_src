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
import com.google.android.gms.internal.measurement.zzcu;
import java.util.Map;
import java.util.Set;

public final class zzcr
implements SharedPreferences {
    private final Map zza;
    private final Set zzb;

    public zzcr() {
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
    }

    private final Object zza(String string2, Object object) {
        Map map2 = this.zza;
        if ((string2 = map2.get(string2)) != null) {
            return string2;
        }
        return object;
    }

    public static /* bridge */ /* synthetic */ Map zza(zzcr zzcr2) {
        return zzcr2.zza;
    }

    public static /* bridge */ /* synthetic */ Set zzb(zzcr zzcr2) {
        return zzcr2.zzb;
    }

    public final boolean contains(String string2) {
        return this.zza.containsKey(string2);
    }

    public final SharedPreferences.Editor edit() {
        zzcu zzcu2 = new zzcu(this, null);
        return zzcu2;
    }

    public final Map getAll() {
        return this.zza;
    }

    public final boolean getBoolean(String string2, boolean bl2) {
        Boolean bl3 = bl2;
        return (Boolean)this.zza(string2, bl3);
    }

    public final float getFloat(String string2, float f5) {
        Float f6 = Float.valueOf(f5);
        return ((Float)this.zza(string2, f6)).floatValue();
    }

    public final int getInt(String string2, int n3) {
        Integer n4 = n3;
        return (Integer)this.zza(string2, n4);
    }

    public final long getLong(String string2, long l2) {
        Long l3 = l2;
        return (Long)this.zza(string2, l3);
    }

    public final String getString(String string2, String string3) {
        return (String)this.zza(string2, string3);
    }

    public final Set getStringSet(String string2, Set set) {
        return (Set)this.zza(string2, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.zzb.add(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.zzb.remove(onSharedPreferenceChangeListener);
    }
}

