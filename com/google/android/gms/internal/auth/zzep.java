/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzee;
import com.google.android.gms.internal.auth.zzeo;
import com.google.android.gms.internal.auth.zzew;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfb;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzgk;
import com.google.android.gms.internal.auth.zzgu;
import com.google.android.gms.internal.auth.zzhn;
import com.google.android.gms.internal.auth.zzho;
import java.util.ArrayList;
import java.util.List;

final class zzep {
    private static final zzep zzb;
    final zzgu zza;
    private boolean zzc;
    private boolean zzd;

    static {
        zzep zzep2;
        zzb = zzep2 = new zzep(true);
    }

    private zzep() {
        zzgk zzgk2 = new zzgk(16);
        this.zza = zzgk2;
    }

    private zzep(boolean bl2) {
        zzgk zzgk2 = new zzgk(0);
        this.zza = zzgk2;
        this.zzb();
        this.zzb();
    }

    public static zzep zza() {
        throw null;
    }

    private static final void zzd(zzeo object, Object object2) {
        Object object3;
        Object object4;
        block13: {
            block14: {
                object4 = object.zzb();
                zzez.zze(object2);
                object3 = zzhn.zza;
                object3 = zzho.zza;
                object4 = ((zzhn)((Object)object4)).zza();
                int n3 = ((Enum)object4).ordinal();
                switch (n3) {
                    default: {
                        break block13;
                    }
                    case 8: {
                        n3 = object2 instanceof zzfw;
                        if (n3 == 0 && (n3 = object2 instanceof zzfb) == 0) break block13;
                        break block14;
                    }
                    case 7: {
                        n3 = object2 instanceof Integer;
                        if (n3 == 0 && (n3 = object2 instanceof zzew) == 0) break block13;
                        break block14;
                    }
                    case 6: {
                        n3 = object2 instanceof zzee;
                        if (n3 == 0 && (n3 = object2 instanceof byte[]) == 0) break block13;
                        break block14;
                    }
                    case 5: {
                        n3 = object2 instanceof String;
                        break;
                    }
                    case 4: {
                        n3 = object2 instanceof Boolean;
                        break;
                    }
                    case 3: {
                        n3 = object2 instanceof Double;
                        break;
                    }
                    case 2: {
                        n3 = object2 instanceof Float;
                        break;
                    }
                    case 1: {
                        n3 = object2 instanceof Long;
                        break;
                    }
                    case 0: {
                        n3 = object2 instanceof Integer;
                    }
                }
                if (n3 == 0) break block13;
            }
            return;
        }
        object3 = object.zza();
        object = object.zzb().zza();
        object2 = object2.getClass().getName();
        Object[] objectArray = new Object[]{object3, object, object2};
        object = String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", objectArray);
        object4 = new IllegalArgumentException((String)object);
        throw object4;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzep;
        if (!bl2) {
            return false;
        }
        object = (zzep)object;
        zzgu zzgu2 = this.zza;
        object = ((zzep)object).zza;
        return zzgu2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        boolean bl2 = this.zzc;
        if (bl2) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzc(zzeo object, Object list) {
        boolean bl2 = object.zzc();
        if (bl2) {
            bl2 = list instanceof List;
            if (!bl2) {
                object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                throw object;
            }
            ArrayList arrayList = new ArrayList();
            list = list;
            arrayList.addAll(list);
            int n3 = arrayList.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object e2 = arrayList.get(i3);
                zzep.zzd((zzeo)object, e2);
            }
            list = arrayList;
        } else {
            zzep.zzd((zzeo)object, list);
        }
        bl2 = list instanceof zzfb;
        if (bl2) {
            this.zzd = bl2 = true;
        }
        this.zza.zze((Comparable)object, list);
    }
}

