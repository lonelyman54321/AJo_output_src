/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzbz;
import com.google.android.gms.internal.clearcut.zzca;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzcr;
import com.google.android.gms.internal.clearcut.zzcu;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzdp;
import com.google.android.gms.internal.clearcut.zzdv;
import com.google.android.gms.internal.clearcut.zzei;
import com.google.android.gms.internal.clearcut.zzfl;
import com.google.android.gms.internal.clearcut.zzfq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzby {
    private static final zzby zzgw;
    private final zzei zzgt;
    private boolean zzgu;
    private boolean zzgv = false;

    static {
        zzby zzby2;
        zzgw = zzby2 = new zzby(true);
    }

    private zzby() {
        zzei zzei2;
        this.zzgt = zzei2 = zzei.zzaj(16);
    }

    private zzby(boolean bl2) {
        zzei zzei2;
        this.zzgt = zzei2 = zzei.zzaj(0);
        this.zzv();
    }

    public static int zza(zzfl zzfl2, int n3, Object object) {
        n3 = zzbn.zzr(n3);
        Object object2 = zzfl.zzql;
        if (zzfl2 == object2) {
            object2 = object;
            object2 = (zzdo)object;
            zzci.zzf((zzdo)object2);
            n3 <<= 1;
        }
        int n4 = zzby.zzb(zzfl2, object);
        return n3 + n4;
    }

    private final Object zza(zzca object) {
        zzei zzei2 = this.zzgt;
        boolean bl2 = (object = zzei2.get(object)) instanceof zzcr;
        if (bl2) {
            object = zzcr.zzbr();
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void zza(zzbn zzbn2, zzfl zzfl2, int n3, Object object) {
        zzfl zzfl3 = zzfl.zzql;
        if (zzfl2 == zzfl3) {
            object = (zzdo)object;
            zzci.zzf((zzdo)object);
            zzbn2.zzb(n3, 3);
            object.zzb(zzbn2);
            zzbn2.zzb(n3, 4);
            return;
        }
        int n4 = zzfl2.zzel();
        zzbn2.zzb(n3, n4);
        int[] nArray = zzbz.zzgq;
        int n7 = zzfl2.ordinal();
        n7 = nArray[n7];
        switch (n7) {
            default: {
                return;
            }
            case 18: {
                n7 = object instanceof zzcj;
                if (n7 != 0) {
                    n7 = ((zzcj)object).zzc();
                    zzbn2.zzn(n7);
                    return;
                }
                object = (Integer)object;
                n7 = (Integer)object;
                zzbn2.zzn(n7);
                return;
            }
            case 17: {
                long l2 = (Long)object;
                zzbn2.zzc(l2);
                return;
            }
            case 16: {
                n7 = (Integer)object;
                zzbn2.zzp(n7);
                return;
            }
            case 15: {
                long l3 = (Long)object;
                zzbn2.zzd(l3);
                return;
            }
            case 14: {
                n7 = (Integer)object;
                zzbn2.zzq(n7);
                return;
            }
            case 13: {
                n7 = (Integer)object;
                zzbn2.zzo(n7);
                return;
            }
            case 12: {
                n7 = object instanceof zzbb;
                if (n7 != 0) {
                    object = (zzbb)object;
                    zzbn2.zza((zzbb)object);
                    return;
                }
                object = (byte[])object;
                n7 = ((Object)object).length;
                zzbn2.zzd((byte[])object, 0, n7);
                return;
            }
            case 11: {
                n7 = object instanceof zzbb;
                if (n7 != 0) {
                    object = (zzbb)object;
                    zzbn2.zza((zzbb)object);
                    return;
                }
                object = (String)object;
                zzbn2.zzg((String)object);
                return;
            }
            case 10: {
                object = (zzdo)object;
                zzbn2.zzb((zzdo)object);
                return;
            }
            case 9: {
                ((zzdo)object).zzb(zzbn2);
                return;
            }
            case 8: {
                n7 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                zzbn2.zza(n7 != 0);
                return;
            }
            case 7: {
                n7 = (Integer)object;
                zzbn2.zzq(n7);
                return;
            }
            case 6: {
                long l4 = (Long)object;
                zzbn2.zzd(l4);
                return;
            }
            case 5: {
                n7 = (Integer)object;
                zzbn2.zzn(n7);
                return;
            }
            case 4: {
                long l7 = (Long)object;
                zzbn2.zzb(l7);
                return;
            }
            case 3: {
                long l8 = (Long)object;
                zzbn2.zzb(l8);
                return;
            }
            case 2: {
                float f5 = ((Float)object).floatValue();
                zzbn2.zza(f5);
                return;
            }
            case 1: 
        }
        double d2 = (Double)object;
        zzbn2.zza(d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zza(zzca object, Object list) {
        boolean bl2 = object.zzaw();
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
                zzfl zzfl2 = object.zzau();
                zzby.zza(zzfl2, e2);
            }
            list = arrayList;
        } else {
            zzfl zzfl3 = object.zzau();
            zzby.zza(zzfl3, list);
        }
        bl2 = list instanceof zzcr;
        if (bl2) {
            this.zzgv = bl2 = true;
        }
        this.zzgt.zza((Comparable)object, list);
    }

    /*
     * Unable to fully structure code
     */
    private static void zza(zzfl var0, Object var1_1) {
        block14: {
            zzci.checkNotNull(var1_1);
            var2_2 = zzbz.zzgx;
            var0 = var0.zzek();
            var3_3 = var0.ordinal();
            var3_3 = var2_2[var3_3];
            var4_4 = true;
            var5_5 = false;
            switch (var3_3) {
                default: {
                    break block14;
                }
                case 9: {
                    var3_3 = var1_1 instanceof zzdo;
                    if (var3_3 == 0 && (var3_3 = var1_1 instanceof zzcr) == 0) ** GOTO lbl19
                    ** GOTO lbl22
                }
                case 8: {
                    var3_3 = var1_1 instanceof Integer;
                    if (var3_3 != 0 || (var3_3 = var1_1 instanceof zzcj) != 0) ** GOTO lbl22
lbl19:
                    // 3 sources

                    while (true) {
                        var4_4 = false;
                        var2_2 = null;
lbl22:
                        // 10 sources

                        while (true) {
                            var5_5 = var4_4;
                            break block14;
                            break;
                        }
                        break;
                    }
                }
                case 7: {
                    if ((var3_3 = var1_1 instanceof zzbb) == 0 && (var3_3 = var1_1 instanceof byte[]) == 0) ** continue;
                    ** GOTO lbl22
                }
                case 6: {
                    var4_4 = var1_1 instanceof String;
                    ** GOTO lbl22
                }
                case 5: {
                    var4_4 = var1_1 instanceof Boolean;
                    ** GOTO lbl22
                }
                case 4: {
                    var4_4 = var1_1 instanceof Double;
                    ** GOTO lbl22
                }
                case 3: {
                    var4_4 = var1_1 instanceof Float;
                    ** GOTO lbl22
                }
                case 2: {
                    var4_4 = var1_1 instanceof Long;
                    ** GOTO lbl22
                }
                case 1: 
            }
            var4_4 = var1_1 instanceof Integer;
            ** while (true)
        }
        if (var5_5) {
            return;
        }
        var0 = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        throw var0;
    }

    public static zzby zzar() {
        return zzgw;
    }

    private static int zzb(zzca iterator, Object object) {
        zzfl zzfl2 = iterator.zzau();
        int n3 = iterator.zzc();
        int n4 = (int)(iterator.zzaw() ? 1 : 0);
        if (n4 != 0) {
            int n7;
            int n8 = iterator.zzax();
            n4 = 0;
            object = (List)object;
            if (n8 != 0) {
                int n10;
                iterator = object.iterator();
                while ((n10 = iterator.hasNext()) != 0) {
                    object = iterator.next();
                    n10 = zzby.zzb(zzfl2, object);
                    n4 += n10;
                }
                n8 = zzbn.zzr(n3) + n4;
                return zzbn.zzz(n4) + n8;
            }
            iterator = object.iterator();
            while ((n7 = iterator.hasNext()) != 0) {
                object = iterator.next();
                n7 = zzby.zza(zzfl2, n3, object);
                n4 += n7;
            }
            return n4;
        }
        return zzby.zza(zzfl2, n3, object);
    }

    private static int zzb(zzfl object, Object object2) {
        int[] nArray = zzbz.zzgq;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw object;
            }
            case 18: {
                n3 = object2 instanceof zzcj;
                if (n3 != 0) {
                    return zzbn.zzx(((zzcj)object2).zzc());
                }
                return zzbn.zzx((Integer)object2);
            }
            case 17: {
                return zzbn.zzg((Long)object2);
            }
            case 16: {
                return zzbn.zzu((Integer)object2);
            }
            case 15: {
                return zzbn.zzi((Long)object2);
            }
            case 14: {
                return zzbn.zzw((Integer)object2);
            }
            case 13: {
                return zzbn.zzt((Integer)object2);
            }
            case 12: {
                n3 = object2 instanceof zzbb;
                if (n3 != 0) {
                    return zzbn.zzb((zzbb)object2);
                }
                return zzbn.zzd((byte[])object2);
            }
            case 11: {
                n3 = object2 instanceof zzbb;
                if (n3 != 0) {
                    return zzbn.zzb((zzbb)object2);
                }
                return zzbn.zzh((String)object2);
            }
            case 10: {
                n3 = object2 instanceof zzcr;
                if (n3 != 0) {
                    return zzbn.zza((zzcr)object2);
                }
                return zzbn.zzc((zzdo)object2);
            }
            case 9: {
                return zzbn.zzd((zzdo)object2);
            }
            case 8: {
                return zzbn.zzb((Boolean)object2);
            }
            case 7: {
                return zzbn.zzv((Integer)object2);
            }
            case 6: {
                return zzbn.zzh((Long)object2);
            }
            case 5: {
                return zzbn.zzs((Integer)object2);
            }
            case 4: {
                return zzbn.zzf((Long)object2);
            }
            case 3: {
                return zzbn.zze((Long)object2);
            }
            case 2: {
                return zzbn.zzb(((Float)object2).floatValue());
            }
            case 1: 
        }
        return zzbn.zzb((Double)object2);
    }

    private static boolean zzb(Map.Entry object) {
        Object object2 = (zzca)object.getKey();
        zzfq zzfq2 = object2.zzav();
        zzfq zzfq3 = zzfq.zzrf;
        boolean bl2 = true;
        if (zzfq2 == zzfq3) {
            boolean bl3 = object2.zzaw();
            zzfq2 = null;
            object = object.getValue();
            if (bl3) {
                object = ((List)object).iterator();
                while (bl3 = object.hasNext()) {
                    object2 = (zzdo)object.next();
                    bl3 = object2.isInitialized();
                    if (bl3) continue;
                    return false;
                }
            } else {
                bl3 = object instanceof zzdo;
                if (bl3) {
                    boolean bl4 = (object = (zzdo)object).isInitialized();
                    if (!bl4) {
                        return false;
                    }
                } else {
                    boolean bl5 = object instanceof zzcr;
                    if (bl5) {
                        return bl2;
                    }
                    object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    throw object;
                }
            }
        }
        return bl2;
    }

    private final void zzc(Map.Entry object) {
        zzfq zzfq2;
        zzca zzca2 = (zzca)object.getKey();
        boolean bl2 = (object = object.getValue()) instanceof zzcr;
        if (bl2) {
            object = zzcr.zzbr();
        }
        if (bl2 = zzca2.zzaw()) {
            boolean bl3;
            ArrayList arrayList = this.zza(zzca2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            object = ((List)object).iterator();
            while (bl3 = object.hasNext()) {
                Object object2 = object.next();
                List list = arrayList;
                list = arrayList;
                object2 = zzby.zzd(object2);
                list.add(object2);
            }
            this.zzgt.zza(zzca2, arrayList);
            return;
        }
        Object object3 = zzca2.zzav();
        if (object3 == (zzfq2 = zzfq.zzrf)) {
            object3 = this.zza(zzca2);
            if (object3 == null) {
                object3 = this.zzgt;
                object = zzby.zzd(object);
                ((zzei)object3).zza(zzca2, object);
                return;
            }
            boolean bl4 = object3 instanceof zzdv;
            if (bl4) {
                object3 = (zzdv)object3;
                object = (zzdv)object;
                object = zzca2.zza((zzdv)object3, (zzdv)object);
            } else {
                object3 = ((zzdo)object3).zzbc();
                object = (zzdo)object;
                object = zzca2.zza((zzdp)object3, (zzdo)object).zzbj();
            }
            this.zzgt.zza(zzca2, object);
            return;
        }
        object3 = this.zzgt;
        object = zzby.zzd(object);
        ((zzei)object3).zza(zzca2, object);
    }

    private static int zzd(Map.Entry object) {
        boolean bl2;
        zzfq zzfq2;
        zzca zzca2 = (zzca)object.getKey();
        Object object2 = object.getValue();
        zzfq zzfq3 = zzca2.zzav();
        if (zzfq3 == (zzfq2 = zzfq.zzrf) && !(bl2 = zzca2.zzaw()) && !(bl2 = zzca2.zzax())) {
            boolean bl3 = object2 instanceof zzcr;
            object = (zzca)object.getKey();
            int n3 = object.zzc();
            if (bl3) {
                object2 = (zzcr)object2;
                return zzbn.zzb(n3, object2);
            }
            object2 = (zzdo)object2;
            return zzbn.zzd(n3, object2);
        }
        return zzby.zzb(zzca2, object2);
    }

    private static Object zzd(Object object) {
        boolean bl2 = object instanceof zzdv;
        if (bl2) {
            return ((zzdv)object).zzci();
        }
        bl2 = object instanceof byte[];
        if (bl2) {
            object = (byte[])object;
            byte[] byArray = new byte[((Object)object).length];
            int n3 = ((Object)object).length;
            System.arraycopy(object, 0, byArray, 0, n3);
            return byArray;
        }
        return object;
    }

    public final /* synthetic */ Object clone() {
        zzca zzca2;
        Object object;
        int n3;
        int n4;
        zzby zzby2 = new zzby();
        Iterator iterator = null;
        for (n4 = 0; n4 < (n3 = ((zzei)(object = this.zzgt)).zzdr()); ++n4) {
            object = this.zzgt.zzak(n4);
            zzca2 = (zzca)object.getKey();
            object = object.getValue();
            zzby2.zza(zzca2, object);
        }
        iterator = this.zzgt.zzds().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            zzca2 = (zzca)object.getKey();
            object = object.getValue();
            zzby2.zza(zzca2, object);
        }
        n4 = (int)(this.zzgv ? 1 : 0);
        zzby2.zzgv = n4;
        return zzby2;
    }

    public final Iterator descendingIterator() {
        boolean bl2 = this.zzgv;
        if (bl2) {
            Iterator iterator = this.zzgt.zzdt().iterator();
            zzcu zzcu2 = new zzcu(iterator);
            return zzcu2;
        }
        return this.zzgt.zzdt().iterator();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzby;
        if (!bl2) {
            return false;
        }
        object = (zzby)object;
        zzei zzei2 = this.zzgt;
        object = ((zzby)object).zzgt;
        return zzei2.equals(object);
    }

    public final int hashCode() {
        return this.zzgt.hashCode();
    }

    public final boolean isEmpty() {
        return this.zzgt.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    public final boolean isInitialized() {
        Object object;
        int n3;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n3 = ((zzei)(object = this.zzgt)).zzdr()); ++i3) {
            object = this.zzgt.zzak(i3);
            n3 = (int)(zzby.zzb((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        iterator = this.zzgt.zzds().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = (int)(zzby.zzb((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        boolean bl2 = this.zzgv;
        if (bl2) {
            Iterator iterator = this.zzgt.entrySet().iterator();
            zzcu zzcu2 = new zzcu(iterator);
            return zzcu2;
        }
        return this.zzgt.entrySet().iterator();
    }

    public final void zza(zzby object) {
        Object object2;
        int n3;
        int n4;
        Map.Entry entry = null;
        for (n4 = 0; n4 < (n3 = ((zzei)(object2 = ((zzby)object).zzgt)).zzdr()); ++n4) {
            object2 = ((zzby)object).zzgt.zzak(n4);
            this.zzc((Map.Entry)object2);
        }
        object = ((zzby)object).zzgt.zzds().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            this.zzc(entry);
        }
    }

    public final int zzas() {
        zzca zzca2;
        Object object;
        int n3;
        Iterator iterator = null;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = ((zzei)(object = this.zzgt)).zzdr()); ++i3) {
            object = this.zzgt.zzak(i3);
            zzca2 = (zzca)object.getKey();
            object = object.getValue();
            n3 = zzby.zzb(zzca2, object);
            n4 += n3;
        }
        iterator = this.zzgt.zzds().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            zzca2 = (zzca)object.getKey();
            object = object.getValue();
            n3 = zzby.zzb(zzca2, object);
            n4 += n3;
        }
        return n4;
    }

    public final int zzat() {
        Object object;
        int n3;
        Iterator iterator = null;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = ((zzei)(object = this.zzgt)).zzdr()); ++i3) {
            object = this.zzgt.zzak(i3);
            n3 = zzby.zzd((Map.Entry)object);
            n4 += n3;
        }
        iterator = this.zzgt.zzds().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = zzby.zzd((Map.Entry)object);
            n4 += n3;
        }
        return n4;
    }

    public final void zzv() {
        boolean bl2 = this.zzgu;
        if (bl2) {
            return;
        }
        this.zzgt.zzv();
        this.zzgu = true;
    }
}

