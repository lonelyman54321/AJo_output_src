/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzct;
import com.google.android.gms.internal.icing.zzde;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzdl;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzes;
import com.google.android.gms.internal.icing.zzez;
import com.google.android.gms.internal.icing.zzfs;
import com.google.android.gms.internal.icing.zzft;
import java.util.ArrayList;
import java.util.List;

final class zzcu {
    private static final zzcu zzd;
    final zzez zza;
    private boolean zzb;
    private boolean zzc;

    static {
        zzcu zzcu2;
        zzd = zzcu2 = new zzcu(true);
    }

    private zzcu() {
        zzes zzes2 = new zzes(16);
        this.zza = zzes2;
    }

    private zzcu(boolean bl2) {
        zzes zzes2 = new zzes(0);
        this.zza = zzes2;
        this.zzb();
        this.zzb();
    }

    public static zzcu zza() {
        throw null;
    }

    private static final void zzd(zzct object, Object object2) {
        Object object3;
        Object object4;
        block13: {
            block14: {
                object4 = object.zzb();
                zzdh.zza(object2);
                object3 = zzfs.zza;
                object3 = zzft.zza;
                object4 = ((zzfs)((Object)object4)).zza();
                int n3 = ((Enum)object4).ordinal();
                switch (n3) {
                    default: {
                        break block13;
                    }
                    case 8: {
                        n3 = object2 instanceof zzee;
                        if (n3 == 0 && (n3 = object2 instanceof zzdl) == 0) break block13;
                        break block14;
                    }
                    case 7: {
                        n3 = object2 instanceof Integer;
                        if (n3 == 0 && (n3 = object2 instanceof zzde) == 0) break block13;
                        break block14;
                    }
                    case 6: {
                        n3 = object2 instanceof zzcf;
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
        boolean bl2 = object instanceof zzcu;
        if (!bl2) {
            return false;
        }
        object = (zzcu)object;
        zzez zzez2 = this.zza;
        object = ((zzcu)object).zza;
        return zzez2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzc(zzct object, Object list) {
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
                zzcu.zzd((zzct)object, e2);
            }
            list = arrayList;
        } else {
            zzcu.zzd((zzct)object, list);
        }
        bl2 = list instanceof zzdl;
        if (bl2) {
            this.zzc = bl2 = true;
        }
        this.zza.zzf((Comparable)object, list);
    }
}

