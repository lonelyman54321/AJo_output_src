/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzam;
import com.google.android.gms.measurement.internal.zzjj$zza;
import java.util.EnumMap;

final class zzan {
    private final EnumMap zza;

    public zzan() {
        EnumMap enumMap;
        this.zza = enumMap = new EnumMap(zzjj$zza.class);
    }

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2;
        this.zza = enumMap2 = new EnumMap(zzjj$zza.class);
        enumMap2.putAll(enumMap);
    }

    public static zzan zza(String object) {
        zzjj$zza[] zzjj$zzaArray;
        int n3;
        Class<zzjj$zza> clazz = zzjj$zza.class;
        EnumMap<zzjj$zza, zzam> enumMap = new EnumMap<zzjj$zza, zzam>(clazz);
        int n4 = ((String)object).length();
        if (n4 >= (n3 = (zzjj$zzaArray = zzjj$zza.values()).length)) {
            int n7;
            clazz = null;
            n3 = ((String)object).charAt(0);
            if (n3 == (n7 = 49)) {
                zzjj$zzaArray = zzjj$zza.values();
                n7 = zzjj$zzaArray.length;
                int n8 = 1;
                for (n4 = 0; n4 < n7; ++n4) {
                    zzjj$zza zzjj$zza = zzjj$zzaArray[n4];
                    int n10 = n8 + 1;
                    zzam zzam2 = zzam.zza(((String)object).charAt(n8));
                    enumMap.put(zzjj$zza, zzam2);
                    n8 = n10;
                }
                object = new zzan(enumMap);
                return object;
            }
        }
        object = new zzan();
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("1");
        zzjj$zza[] zzjj$zzaArray = zzjj$zza.values();
        int n3 = zzjj$zzaArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            void enum_;
            EnumMap enumMap = this.zza;
            zzjj$zza zzjj$zza = zzjj$zzaArray[i3];
            zzam zzam2 = (zzam)((Object)enumMap.get((Object)zzjj$zza));
            if (zzam2 == null) {
                zzam zzam3 = zzam.zza;
            }
            char c2 = zzam.zza((zzam)enum_);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public final zzam zza(zzjj$zza enum_) {
        EnumMap enumMap = this.zza;
        if ((enum_ = (zzam)((Object)enumMap.get(enum_))) == null) {
            enum_ = zzam.zza;
        }
        return enum_;
    }

    public final void zza(zzjj$zza zzjj$zza, int n3) {
        zzam zzam2;
        block4: {
            block1: {
                block2: {
                    block3: {
                        zzam2 = zzam.zza;
                        int n4 = -30;
                        if (n3 == n4) break block1;
                        n4 = -20;
                        if (n3 == n4) break block2;
                        n4 = -10;
                        if (n3 == n4) break block3;
                        if (n3 == 0) break block2;
                        n4 = 30;
                        if (n3 == n4) {
                            zzam2 = zzam.zze;
                        }
                        break block4;
                    }
                    zzam2 = zzam.zzd;
                    break block4;
                }
                zzam2 = zzam.zzf;
                break block4;
            }
            zzam2 = zzam.zzg;
        }
        this.zza.put(zzjj$zza, zzam2);
    }

    public final void zza(zzjj$zza zzjj$zza, zzam zzam2) {
        this.zza.put(zzjj$zza, zzam2);
    }
}

