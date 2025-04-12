/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbc;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class zzbd {
    private static final zzbd zza;
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap zzf;

    static {
        zzbd zzbd2;
        zza = zzbd2 = new zzbd(null, 100);
    }

    public zzbd(Boolean bl2, int n3) {
        this((Boolean)null, n3, (Boolean)null, (String)null);
    }

    public zzbd(Boolean object, int n3, Boolean bl2, String string2) {
        EnumMap<zzjj$zza, Boolean> enumMap;
        this.zzf = enumMap = new EnumMap<zzjj$zza, Boolean>(zzjj$zza.class);
        zzjj$zza zzjj$zza = zzjj$zza.zzc;
        object = zzjj.zza(object);
        enumMap.put(zzjj$zza, (Boolean)object);
        this.zzb = n3;
        object = this.zzh();
        this.zzc = object;
        this.zzd = bl2;
        this.zze = string2;
    }

    private zzbd(EnumMap object, int n3, Boolean bl2, String string2) {
        EnumMap enumMap;
        this.zzf = enumMap = new EnumMap(zzjj$zza.class);
        enumMap.putAll(object);
        this.zzb = n3;
        this.zzc = object = this.zzh();
        this.zzd = bl2;
        this.zze = string2;
    }

    public static zzbd zza(Bundle object, int n3) {
        Boolean bl2 = null;
        if (object == null) {
            object = new zzbd(null, n3);
            return object;
        }
        EnumMap<zzjj$zza, String> enumMap = new EnumMap<zzjj$zza, String>(zzjj$zza.class);
        for (zzjj$zza zzjj$zza : zzjl.zzb.zza()) {
            Object object2 = zzjj$zza.zze;
            object2 = zzjj.zza(object.getString(object2));
            enumMap.put(zzjj$zza, (String)object2);
        }
        String string2 = "is_dma_region";
        int n4 = (int)(object.containsKey(string2) ? 1 : 0);
        if (n4 != 0) {
            bl2 = Boolean.valueOf(object.getString(string2));
        }
        object = object.getString("cps_display_str");
        zzbd zzbd2 = new zzbd(enumMap, n3, bl2, (String)object);
        return zzbd2;
    }

    public static zzbd zza(zzjm object, int n3) {
        EnumMap<zzjj$zza, zzjm> enumMap = new EnumMap<zzjj$zza, zzjm>(zzjj$zza.class);
        zzjj$zza zzjj$zza = zzjj$zza.zzc;
        enumMap.put(zzjj$zza, (zzjm)((Object)object));
        object = new zzbd(enumMap, -10, null, null);
        return object;
    }

    public static zzbd zza(String object) {
        int n3;
        if (object != null && (n3 = object.length()) > 0) {
            object = object.split(":");
            n3 = 0;
            String string2 = object[0];
            int n4 = Integer.parseInt(string2);
            EnumMap<zzjj$zza, zzjm> enumMap = new EnumMap<zzjj$zza, zzjm>(zzjj$zza.class);
            zzjj$zza[] zzjj$zzaArray = zzjl.zzb.zza();
            int n7 = zzjj$zzaArray.length;
            int n8 = 1;
            for (int i3 = 0; i3 < n7; ++i3) {
                zzjj$zza zzjj$zza = zzjj$zzaArray[i3];
                int n10 = n8 + 1;
                zzjm zzjm2 = zzjj.zza(object[n8].charAt(0));
                enumMap.put(zzjj$zza, zzjm2);
                n8 = n10;
            }
            object = new zzbd(enumMap, n4, null, null);
            return object;
        }
        return zza;
    }

    public static Boolean zza(Bundle object) {
        if (object == null) {
            return null;
        }
        Object object2 = "ad_personalization";
        if ((object = zzjj.zza(object.getString((String)object2))) == null) {
            return null;
        }
        object2 = zzbc.zza;
        Object object3 = ((Enum)object).ordinal();
        Object object4 = 3;
        if ((object3 = (Object)object2[object3]) != object4) {
            object4 = 4;
            if (object3 != object4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private final String zzh() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.zzb;
        stringBuilder.append(n3);
        for (zzjj$zza zzjj$zza : zzjl.zzb.zza()) {
            stringBuilder.append(":");
            EnumMap enumMap = this.zzf;
            zzjm enum_ = (zzjm)((Object)enumMap.get((Object)zzjj$zza));
            char c2 = zzjj.zza(enum_);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzbd;
        if (!bl2) {
            return false;
        }
        object = (zzbd)object;
        Object object2 = this.zzc;
        Object object3 = ((zzbd)object).zzc;
        bl2 = ((String)object2).equalsIgnoreCase((String)object3);
        if (!bl2) {
            return false;
        }
        object2 = this.zzd;
        object3 = ((zzbd)object).zzd;
        bl2 = Objects.equals(object2, object3);
        if (!bl2) {
            return false;
        }
        object2 = this.zze;
        object = ((zzbd)object).zze;
        return Objects.equals(object2, object);
    }

    public final int hashCode() {
        Object object;
        Boolean bl2 = this.zzd;
        int n3 = bl2 == null ? 3 : (bl2 == (object = Boolean.TRUE) ? 7 : 13);
        object = this.zze;
        int n4 = object == null ? 17 : ((String)object).hashCode();
        int n7 = this.zzc.hashCode();
        n3 = n3 * 29 + n7;
        return n4 * 137 + n3;
    }

    public final String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder("source=");
        int n3 = this.zzb;
        String object = zzjj.zza(n3);
        stringBuilder.append(object);
        for (zzjj$zza zzjj$zza : zzjl.zzb.zza()) {
            stringBuilder.append(",");
            String string3 = zzjj$zza.zze;
            stringBuilder.append(string3);
            stringBuilder.append("=");
            zzjm zzjm2 = (zzjm)((Object)this.zzf.get((Object)zzjj$zza));
            string3 = "uninitialized";
            if (zzjm2 == null) {
                stringBuilder.append(string3);
                continue;
            }
            int[] nArray = zzbc.zza;
            int n4 = zzjm2.ordinal();
            int n7 = 1;
            if ((n4 = nArray[n4]) != n7) {
                int n8 = 2;
                if (n4 != n8) {
                    n8 = 3;
                    if (n4 != n8) {
                        n8 = 4;
                        if (n4 != n8) continue;
                        String string4 = "granted";
                        stringBuilder.append(string4);
                        continue;
                    }
                    String string5 = "denied";
                    stringBuilder.append(string5);
                    continue;
                }
                String string6 = "eu_consent_policy";
                stringBuilder.append(string6);
                continue;
            }
            stringBuilder.append(string3);
        }
        Boolean bl2 = this.zzd;
        if (bl2 != null) {
            stringBuilder.append(",isDmaRegion=");
            Boolean bl3 = this.zzd;
            stringBuilder.append(bl3);
        }
        if ((string2 = this.zze) != null) {
            stringBuilder.append(",cpsDisplayStr=");
            String string7 = this.zze;
            stringBuilder.append(string7);
        }
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Map.Entry entry;
        boolean bl2;
        Bundle bundle = new Bundle();
        Object object = this.zzf.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            entry = object.next();
            String string2 = zzjj.zzb((zzjm)((Object)entry.getValue()));
            if (string2 == null) continue;
            entry = ((zzjj$zza)((Object)entry.getKey())).zze;
            bundle.putString((String)((Object)entry), string2);
        }
        object = this.zzd;
        if (object != null) {
            entry = "is_dma_region";
            object = ((Boolean)object).toString();
            bundle.putString((String)((Object)entry), (String)object);
        }
        if ((object = this.zze) != null) {
            entry = "cps_display_str";
            bundle.putString((String)((Object)entry), (String)object);
        }
        return bundle;
    }

    public final zzjm zzc() {
        Object object = this.zzf;
        zzjj$zza zzjj$zza = zzjj$zza.zzc;
        if ((object = (zzjm)((Object)object.get((Object)zzjj$zza))) == null) {
            object = zzjm.zza;
        }
        return object;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        boolean bl2;
        Iterator iterator = this.zzf.values().iterator();
        while (bl2 = iterator.hasNext()) {
            zzjm zzjm2;
            zzjm zzjm3 = (zzjm)((Object)iterator.next());
            if (zzjm3 == (zzjm2 = zzjm.zza)) continue;
            return true;
        }
        return false;
    }
}

