/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjj$zza;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public final class zzjj {
    public static final zzjj zza;
    private final EnumMap zzb;
    private final int zzc;

    static {
        zzjj zzjj2;
        zza = zzjj2 = new zzjj(null, null, 100);
    }

    public zzjj(Boolean serializable, Boolean object, int n3) {
        super(zzjj$zza.class);
        this.zzb = serializable;
        object = zzjj$zza.zza;
        zzjm zzjm2 = zzjj.zza(null);
        ((EnumMap)serializable).put(object, zzjm2);
        object = zzjj$zza.zzb;
        zzjm zzjm3 = zzjj.zza(null);
        ((EnumMap)serializable).put(object, zzjm3);
        this.zzc = n3;
    }

    private zzjj(EnumMap enumMap, int n3) {
        EnumMap enumMap2;
        this.zzb = enumMap2 = new EnumMap(zzjj$zza.class);
        enumMap2.putAll(enumMap);
        this.zzc = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static char zza(zzjm zzjm2) {
        int n3;
        if (zzjm2 == null) return '-';
        int n4 = zzjm2.ordinal();
        if (n4 == (n3 = 1)) return '+';
        n3 = 2;
        if (n4 == n3) return '0';
        n3 = 3;
        if (n4 != n3) return '-';
        return '1';
    }

    public static zzjj zza(Bundle object, int n3) {
        if (object == null) {
            object = new zzjj(null, null, n3);
            return object;
        }
        EnumMap<zzjj$zza, String> enumMap = new EnumMap<zzjj$zza, String>(zzjj$zza.class);
        for (zzjj$zza zzjj$zza : zzjl.zza(zzjl.zza)) {
            Object object2 = zzjj$zza.zze;
            object2 = zzjj.zza(object.getString(object2));
            enumMap.put(zzjj$zza, (String)object2);
        }
        object = new zzjj(enumMap, n3);
        return object;
    }

    public static zzjj zza(zzjm object, zzjm zzjm2, int n3) {
        EnumMap<zzjj$zza, zzjm> enumMap = new EnumMap<zzjj$zza, zzjm>(zzjj$zza.class);
        zzjj$zza zzjj$zza = zzjj$zza.zza;
        enumMap.put(zzjj$zza, (zzjm)((Object)object));
        object = zzjj$zza.zzb;
        enumMap.put((zzjj$zza)((Object)object), zzjm2);
        object = new zzjj(enumMap, -10);
        return object;
    }

    public static zzjj zza(String object, int n3) {
        int n4;
        zzjj$zza[] zzjj$zzaArray = zzjj$zza.class;
        EnumMap<zzjj$zza, zzjm> enumMap = new EnumMap<zzjj$zza, zzjm>((Class<zzjj$zza>)zzjj$zzaArray);
        if (object == null) {
            object = "";
        }
        zzjj$zzaArray = zzjl.zza.zza();
        for (int i3 = 0; i3 < (n4 = zzjj$zzaArray.length); ++i3) {
            zzjm zzjm2;
            zzjj$zza zzjj$zza = zzjj$zzaArray[i3];
            char c2 = i3 + 2;
            int n7 = ((String)object).length();
            if (c2 < n7) {
                c2 = ((String)object).charAt(c2);
                zzjm2 = zzjj.zza(c2);
                enumMap.put(zzjj$zza, zzjm2);
                continue;
            }
            zzjm2 = zzjm.zza;
            enumMap.put(zzjj$zza, zzjm2);
        }
        object = new zzjj(enumMap, n3);
        return object;
    }

    public static zzjm zza(char n3) {
        int n4 = 43;
        if (n3 != n4) {
            n4 = 48;
            if (n3 != n4) {
                n4 = 49;
                if (n3 != n4) {
                    return zzjm.zza;
                }
                return zzjm.zzd;
            }
            return zzjm.zzc;
        }
        return zzjm.zzb;
    }

    public static zzjm zza(Boolean bl2) {
        if (bl2 == null) {
            return zzjm.zza;
        }
        boolean bl3 = bl2;
        if (bl3) {
            return zzjm.zzd;
        }
        return zzjm.zzc;
    }

    public static zzjm zza(String string2) {
        if (string2 == null) {
            return zzjm.zza;
        }
        String string3 = "granted";
        boolean bl2 = string2.equals(string3);
        if (bl2) {
            return zzjm.zzd;
        }
        string3 = "denied";
        boolean bl3 = string2.equals(string3);
        if (bl3) {
            return zzjm.zzc;
        }
        return zzjm.zza;
    }

    public static String zza(int n3) {
        int n4 = -30;
        if (n3 != n4) {
            n4 = -20;
            if (n3 != n4) {
                n4 = -10;
                if (n3 != n4) {
                    if (n3 != 0) {
                        n4 = 30;
                        if (n3 != n4) {
                            n4 = 90;
                            if (n3 != n4) {
                                n4 = 100;
                                if (n3 != n4) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static String zza(Bundle bundle) {
        zzjj$zza[] zzjj$zzaArray = zzjl.zza(zzjl.zza);
        int n3 = zzjj$zzaArray.length;
        int n4 = 0;
        while (true) {
            Boolean bl2 = null;
            if (n4 >= n3) break;
            Object object = zzjj$zzaArray[n4];
            String string2 = ((zzjj$zza)((Object)object)).zze;
            boolean bl3 = bundle.containsKey(string2);
            if (bl3) {
                object = ((zzjj$zza)((Object)object)).zze;
                if ((object = bundle.getString((String)object)) != null) {
                    string2 = "granted";
                    bl3 = ((String)object).equals(string2);
                    if (bl3) {
                        bl2 = Boolean.TRUE;
                    } else {
                        string2 = "denied";
                        bl3 = ((String)object).equals(string2);
                        if (bl3) {
                            bl2 = Boolean.FALSE;
                        }
                    }
                    if (bl2 == null) {
                        return object;
                    }
                }
            }
            ++n4;
        }
        return null;
    }

    public static boolean zza(int n3, int n4) {
        int n7 = -30;
        int n8 = -20;
        return n3 == n8 && n4 == n7 || n3 == n7 && n4 == n8 || n3 == n4 || n3 < n4;
    }

    public static zzjj zzb(String string2) {
        return zzjj.zza(string2, 100);
    }

    public static String zzb(zzjm zzjm2) {
        int n3;
        int n4 = zzjm2.ordinal();
        if (n4 != (n3 = 2)) {
            n3 = 3;
            if (n4 != n3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof zzjj;
        if (n3 == 0) {
            return false;
        }
        object = (zzjj)object;
        for (zzjj$zza zzjj$zza : zzjl.zza(zzjl.zza)) {
            EnumMap enumMap;
            Object v4 = this.zzb.get((Object)zzjj$zza);
            if (v4 == (zzjj$zza = (enumMap = ((zzjj)object).zzb).get((Object)zzjj$zza))) continue;
            return false;
        }
        n3 = this.zzc;
        int n4 = ((zzjj)object).zzc;
        return n3 == n4;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.zzc * 17;
        Iterator iterator = this.zzb.values().iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            zzjm zzjm2 = (zzjm)((Object)iterator.next());
            n4 *= 31;
            n3 = ((Object)((Object)zzjm2)).hashCode();
            n4 += n3;
        }
        return n4;
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source=");
        int n3 = this.zzc;
        zzjj$zza[] zzjj$zzaArray = zzjj.zza(n3);
        stringBuilder.append((String)zzjj$zzaArray);
        for (zzjj$zza zzjj$zza : zzjl.zza(zzjl.zza)) {
            void enum_;
            stringBuilder.append(",");
            Object object = zzjj$zza.zze;
            stringBuilder.append((String)object);
            stringBuilder.append("=");
            object = this.zzb;
            zzjm zzjm2 = (zzjm)((Object)((EnumMap)object).get((Object)zzjj$zza));
            if (zzjm2 == null) {
                zzjm zzjm3 = zzjm.zza;
            }
            stringBuilder.append(enum_);
        }
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzc;
    }

    /*
     * Unable to fully structure code
     */
    public final zzjj zza(zzjj var1_1) {
        var2_2 = new EnumMap<zzjj$zza, zzjm>(zzjj$zza.class);
        for (zzjj$zza var6_6 : zzjl.zza(zzjl.zza)) {
            block6: {
                var7_7 = (zzjm)this.zzb.get((Object)var6_6);
                var8_8 = (zzjm)var1_1.zzb.get((Object)var6_6);
                if (var7_7 == null) ** GOTO lbl-1000
                if (var8_8 == null) break block6;
                var9_9 = zzjm.zza;
                if (var7_7 != var9_9) {
                    if (var8_8 != var9_9) {
                        var9_9 = zzjm.zzb;
                        ** if (var7_7 != var9_9) goto lbl-1000
                    } else {
                        ** GOTO lbl13
                    }
                }
                ** GOTO lbl-1000
lbl13:
                // 2 sources

                break block6;
lbl-1000:
                // 3 sources

                {
                    var7_7 = var8_8;
                    ** GOTO lbl19
                }
lbl-1000:
                // 1 sources

                {
                    if (var8_8 != var9_9) {
                        var9_9 = zzjm.zzc;
                        var7_7 = var7_7 != var9_9 && var8_8 != var9_9 ? zzjm.zzd : var9_9;
                    }
                }
            }
            if (var7_7 == null) continue;
            var2_2.put(var6_6, var7_7);
        }
        var1_1 = new zzjj(var2_2, 100);
        return var1_1;
    }

    public final boolean zza(zzjj$zza enum_) {
        zzjm zzjm2;
        return (enum_ = (zzjm)((Object)this.zzb.get(enum_))) != (zzjm2 = zzjm.zzc);
    }

    public final Bundle zzb() {
        boolean bl2;
        Bundle bundle = new Bundle();
        Iterator iterator = this.zzb.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            String string2 = zzjj.zzb((zzjm)((Object)entry.getValue()));
            if (string2 == null) continue;
            entry = ((zzjj$zza)((Object)entry.getKey())).zze;
            bundle.putString((String)((Object)entry), string2);
        }
        return bundle;
    }

    public final zzjj zzb(zzjj zzjj2) {
        EnumMap<zzjj$zza, zzjm> enumMap = new EnumMap<zzjj$zza, zzjm>(zzjj$zza.class);
        for (zzjj$zza zzjj$zza : zzjl.zza(zzjl.zza)) {
            zzjm zzjm2;
            zzjm zzjm3 = (zzjm)((Object)this.zzb.get((Object)zzjj$zza));
            if (zzjm3 == (zzjm2 = zzjm.zza)) {
                zzjm3 = (zzjm)((Object)zzjj2.zzb.get((Object)zzjj$zza));
            }
            if (zzjm3 == null) continue;
            enumMap.put(zzjj$zza, zzjm3);
        }
        int n3 = this.zzc;
        zzjj2 = new zzjj(enumMap, n3);
        return zzjj2;
    }

    public final zzjm zzc() {
        Object object = this.zzb;
        zzjj$zza zzjj$zza = zzjj$zza.zza;
        if ((object = (zzjm)((Object)object.get((Object)zzjj$zza))) == null) {
            object = zzjm.zza;
        }
        return object;
    }

    public final boolean zzc(zzjj zzjj2) {
        zzjj$zza[] zzjj$zzaArray = this.zzb.keySet();
        zzjj$zza[] zzjj$zzaArray2 = new zzjj$zza[]{};
        for (zzjj$zza zzjj$zza : zzjj$zzaArray.toArray(zzjj$zzaArray2)) {
            zzjm zzjm2 = (zzjm)((Object)this.zzb.get((Object)zzjj$zza));
            zzjm enum_ = (zzjm)((Object)zzjj2.zzb.get((Object)zzjj$zza));
            zzjm zzjm3 = zzjm.zzc;
            if (zzjm2 != zzjm3 || enum_ == zzjm3) continue;
            return true;
        }
        return false;
    }

    public final zzjm zzd() {
        Object object = this.zzb;
        zzjj$zza zzjj$zza = zzjj$zza.zzb;
        if ((object = (zzjm)((Object)object.get((Object)zzjj$zza))) == null) {
            object = zzjm.zza;
        }
        return object;
    }

    public final String zze() {
        StringBuilder stringBuilder = new StringBuilder("G1");
        for (zzjj$zza zzjj$zza : zzjl.zza.zza()) {
            int n3;
            block1: {
                block2: {
                    block3: {
                        int n4;
                        EnumMap enumMap = this.zzb;
                        zzjm enum_ = (zzjm)((Object)enumMap.get((Object)zzjj$zza));
                        n3 = 45;
                        if (enum_ == null || (n4 = enum_.ordinal()) == 0) break block1;
                        int n7 = 1;
                        if (n4 == n7) break block2;
                        n7 = 2;
                        if (n4 == n7) break block3;
                        n7 = 3;
                        if (n4 == n7) break block2;
                        break block1;
                    }
                    n3 = 48;
                    break block1;
                }
                n3 = 49;
            }
            stringBuilder.append((char)n3);
        }
        return stringBuilder.toString();
    }

    public final String zzf() {
        StringBuilder stringBuilder = new StringBuilder("G1");
        for (zzjj$zza zzjj$zza : zzjl.zza.zza()) {
            EnumMap enumMap = this.zzb;
            zzjm enum_ = (zzjm)((Object)enumMap.get((Object)zzjj$zza));
            char c2 = zzjj.zza(enum_);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public final boolean zzg() {
        zzjj$zza zzjj$zza = zzjj$zza.zza;
        return this.zza(zzjj$zza);
    }

    public final boolean zzh() {
        zzjj$zza zzjj$zza = zzjj$zza.zzb;
        return this.zza(zzjj$zza);
    }

    public final boolean zzi() {
        boolean bl2;
        Iterator iterator = this.zzb.values().iterator();
        while (bl2 = iterator.hasNext()) {
            zzjm zzjm2;
            zzjm zzjm3 = (zzjm)((Object)iterator.next());
            if (zzjm3 == (zzjm2 = zzjm.zza)) continue;
            return true;
        }
        return false;
    }
}

