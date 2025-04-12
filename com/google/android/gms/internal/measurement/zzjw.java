/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzjz;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkj;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzks;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzlo;
import com.google.android.gms.internal.measurement.zzlp;
import com.google.android.gms.internal.measurement.zzlv;
import com.google.android.gms.internal.measurement.zzmi;
import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzng;
import com.google.android.gms.internal.measurement.zznj;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzjw {
    private static final zzjw zzb;
    final zzmj zza;
    private boolean zzc;
    private boolean zzd;

    static {
        zzjw zzjw2;
        zzb = zzjw2 = new zzjw(true);
    }

    private zzjw() {
        zzmi zzmi2 = new zzmi();
        this.zza = zzmi2;
    }

    private zzjw(zzmj zzmj2) {
        this.zza = zzmj2;
        this.zze();
    }

    private zzjw(boolean bl2) {
        zzmi zzmi2 = new zzmi();
        this(zzmi2);
        this.zze();
    }

    /*
     * WARNING - void declaration
     */
    public static int zza(zzjy zzjy2, Object object) {
        zzng zzng2 = zzjy2.zzb();
        int n3 = zzjy2.zza();
        int n4 = zzjy2.zze();
        if (n4 != 0) {
            void var5_10;
            int n7;
            object = (List)object;
            n4 = object.size();
            boolean n8 = zzjy2.zzd();
            if (n8) {
                void var5_8;
                boolean bl2 = object.isEmpty();
                if (bl2) {
                    return 0;
                }
                boolean bl3 = false;
                zzjy2 = null;
                for (n7 = 0; n7 < n4; ++n7) {
                    Object e2 = object.get(n7);
                    int n10 = zzjw.zza(zzng2, e2);
                    var5_8 += n10;
                }
                int n14 = zzjn.zzf(n3) + var5_8;
                return zzjn.zzg((int)var5_8) + n14;
            }
            boolean bl4 = false;
            zzjy2 = null;
            while (n7 < n4) {
                Object e5 = object.get(n7);
                int n15 = zzjw.zza(zzng2, n3, e5);
                var5_10 += n15;
                ++n7;
            }
            return (int)var5_10;
        }
        return zzjw.zza(zzng2, n3, object);
    }

    public static int zza(zzng zzng2, int n3, Object object) {
        n3 = zzjn.zzf(n3);
        Object object2 = zzng.zzj;
        if (zzng2 == object2) {
            object2 = object;
            object2 = (zzlm)object;
            zzkj.zza((zzlm)object2);
            n3 <<= 1;
        }
        int n4 = zzjw.zza(zzng2, object);
        return n3 + n4;
    }

    private static int zza(zzng object, Object object2) {
        int[] nArray = zzjz.zzb;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw object;
            }
            case 18: {
                n3 = object2 instanceof zzki;
                if (n3 != 0) {
                    return zzjn.zza(((zzki)object2).zza());
                }
                return zzjn.zza((Integer)object2);
            }
            case 17: {
                return zzjn.zzd((Long)object2);
            }
            case 16: {
                return zzjn.zze((Integer)object2);
            }
            case 15: {
                return zzjn.zzc((Long)object2);
            }
            case 14: {
                return zzjn.zzd((Integer)object2);
            }
            case 13: {
                return zzjn.zzg((Integer)object2);
            }
            case 12: {
                n3 = object2 instanceof zziy;
                if (n3 != 0) {
                    return zzjn.zza((zziy)object2);
                }
                return zzjn.zza((byte[])object2);
            }
            case 11: {
                n3 = object2 instanceof zziy;
                if (n3 != 0) {
                    return zzjn.zza((zziy)object2);
                }
                return zzjn.zza((String)object2);
            }
            case 10: {
                n3 = object2 instanceof zzkq;
                if (n3 != 0) {
                    return zzjn.zza((zzkq)object2);
                }
                return zzjn.zzb((zzlm)object2);
            }
            case 9: {
                return zzjn.zza((zzlm)object2);
            }
            case 8: {
                return zzjn.zza((Boolean)object2);
            }
            case 7: {
                return zzjn.zzb((Integer)object2);
            }
            case 6: {
                return zzjn.zza((Long)object2);
            }
            case 5: {
                return zzjn.zzc((Integer)object2);
            }
            case 4: {
                return zzjn.zze((Long)object2);
            }
            case 3: {
                return zzjn.zzb((Long)object2);
            }
            case 2: {
                return zzjn.zza(((Float)object2).floatValue());
            }
            case 1: 
        }
        return zzjn.zza((Double)object2);
    }

    private static int zza(Map.Entry entry) {
        boolean bl2;
        zznj zznj2;
        zzjy zzjy2 = (zzjy)entry.getKey();
        Object object = entry.getValue();
        zznj zznj3 = zzjy2.zzc();
        if (zznj3 == (zznj2 = zznj.zzi) && !(bl2 = zzjy2.zze()) && !(bl2 = zzjy2.zzd())) {
            boolean bl3 = object instanceof zzkq;
            if (bl3) {
                int n3 = ((zzjy)entry.getKey()).zza();
                object = (zzkq)object;
                return zzjn.zza(n3, object);
            }
            int n4 = ((zzjy)entry.getKey()).zza();
            object = (zzlm)object;
            return zzjn.zza(n4, object);
        }
        return zzjw.zza(zzjy2, object);
    }

    private final Object zza(zzjy object) {
        zzmj zzmj2 = this.zza;
        boolean bl2 = (object = zzmj2.get(object)) instanceof zzkq;
        if (!bl2) {
            return object;
        }
        object = new NoSuchMethodError();
        throw object;
    }

    private static Object zza(Object object) {
        boolean bl2 = object instanceof zzlv;
        if (bl2) {
            return ((zzlv)object).zza();
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void zza(zzjn zzjn2, zzng zzng2, int n3, Object object) {
        zzng zzng3 = zzng.zzj;
        if (zzng2 == zzng3) {
            object = (zzlm)object;
            zzkj.zza((zzlm)object);
            zzjn2.zzj(n3, 3);
            object.zza(zzjn2);
            zzjn2.zzj(n3, 4);
            return;
        }
        int n4 = zzng2.zza();
        zzjn2.zzj(n3, n4);
        int[] nArray = zzjz.zzb;
        int n7 = zzng2.ordinal();
        n7 = nArray[n7];
        switch (n7) {
            default: {
                return;
            }
            case 18: {
                n7 = object instanceof zzki;
                if (n7 != 0) {
                    n7 = ((zzki)object).zza();
                    zzjn2.zzi(n7);
                    return;
                }
                object = (Integer)object;
                n7 = (Integer)object;
                zzjn2.zzi(n7);
                return;
            }
            case 17: {
                long l2 = (Long)object;
                zzjn2.zzg(l2);
                return;
            }
            case 16: {
                n7 = (Integer)object;
                zzjn2.zzj(n7);
                return;
            }
            case 15: {
                long l3 = (Long)object;
                zzjn2.zzf(l3);
                return;
            }
            case 14: {
                n7 = (Integer)object;
                zzjn2.zzh(n7);
                return;
            }
            case 13: {
                n7 = (Integer)object;
                zzjn2.zzk(n7);
                return;
            }
            case 12: {
                n7 = object instanceof zziy;
                if (n7 != 0) {
                    object = (zziy)object;
                    zzjn2.zzb((zziy)object);
                    return;
                }
                object = (byte[])object;
                n7 = ((Object)object).length;
                zzjn2.zzb((byte[])object, 0, n7);
                return;
            }
            case 11: {
                n7 = object instanceof zziy;
                if (n7 != 0) {
                    object = (zziy)object;
                    zzjn2.zzb((zziy)object);
                    return;
                }
                object = (String)object;
                zzjn2.zzb((String)object);
                return;
            }
            case 10: {
                object = (zzlm)object;
                zzjn2.zzc((zzlm)object);
                return;
            }
            case 9: {
                ((zzlm)object).zza(zzjn2);
                return;
            }
            case 8: {
                n7 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                zzjn2.zzb(n7 != 0);
                return;
            }
            case 7: {
                n7 = (Integer)object;
                zzjn2.zzh(n7);
                return;
            }
            case 6: {
                long l4 = (Long)object;
                zzjn2.zzf(l4);
                return;
            }
            case 5: {
                n7 = (Integer)object;
                zzjn2.zzi(n7);
                return;
            }
            case 4: {
                long l7 = (Long)object;
                zzjn2.zzh(l7);
                return;
            }
            case 3: {
                long l8 = (Long)object;
                zzjn2.zzh(l8);
                return;
            }
            case 2: {
                float f5 = ((Float)object).floatValue();
                zzjn2.zzb(f5);
                return;
            }
            case 1: 
        }
        double d2 = (Double)object;
        zzjn2.zzb(d2);
    }

    public static zzjw zzb() {
        return zzb;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzb(zzjy object, Object list) {
        int n3 = object.zze();
        if (n3 != 0) {
            n3 = list instanceof List;
            if (n3 == 0) {
                object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                throw object;
            }
            n3 = list.size();
            ArrayList arrayList = new ArrayList(n3);
            for (int i3 = 0; i3 < n3; ++i3) {
                Object e2 = list.get(i3);
                zzjw.zzc((zzjy)object, e2);
                arrayList.add(e2);
            }
            list = arrayList;
        } else {
            zzjw.zzc((zzjy)object, list);
        }
        n3 = list instanceof zzkq;
        if (n3 != 0) {
            n3 = 1;
            this.zzd = n3;
        }
        this.zza.zza((Comparable)object, list);
    }

    private final void zzb(Map.Entry object) {
        boolean bl2;
        zzjy zzjy2;
        block12: {
            block15: {
                block14: {
                    Object object2;
                    Object object3;
                    block13: {
                        zznj zznj2;
                        zzjy2 = (zzjy)object.getKey();
                        object = object.getValue();
                        bl2 = object instanceof zzkq;
                        int n3 = zzjy2.zze();
                        if (n3 != 0) {
                            if (!bl2) {
                                ArrayList arrayList = this.zza(zzjy2);
                                object = (List)object;
                                n3 = object.size();
                                if (arrayList == null) {
                                    arrayList = new ArrayList(n3);
                                }
                                List<Object> list = arrayList;
                                list = arrayList;
                                for (int i3 = 0; i3 < n3; ++i3) {
                                    Object object4 = zzjw.zza(object.get(i3));
                                    list.add(object4);
                                }
                                this.zza.zza(zzjy2, arrayList);
                                return;
                            }
                            object = new IllegalStateException("Lazy fields can not be repeated");
                            throw object;
                        }
                        object3 = zzjy2.zzc();
                        if (object3 != (zznj2 = zznj.zzi)) break block12;
                        object3 = this.zza(zzjy2);
                        if (object3 != null) break block13;
                        object3 = this.zza;
                        object = zzjw.zza(object);
                        ((zzmj)object3).zza(zzjy2, object);
                        if (bl2) {
                            this.zzd = true;
                            return;
                        }
                        break block14;
                    }
                    if (bl2) break block15;
                    bl2 = object3 instanceof zzlv;
                    if (bl2) {
                        object3 = (zzlv)object3;
                        object = (zzlv)object;
                        object = zzjy2.zza((zzlv)object3, (zzlv)object);
                    } else {
                        object3 = (zzlm)object3;
                        object2 = object3.zzcn();
                        object = (zzlm)object;
                        object = zzjy2.zza((zzlp)object2, (zzlm)object).zzaj();
                    }
                    object2 = this.zza;
                    ((zzmj)object2).zza(zzjy2, object);
                }
                return;
            }
            object = new NoSuchMethodError();
            throw object;
        }
        if (!bl2) {
            zzmj zzmj2 = this.zza;
            object = zzjw.zza(object);
            zzmj2.zza(zzjy2, object);
            return;
        }
        object = new IllegalStateException("Lazy fields must be message-valued");
        throw object;
    }

    private static boolean zzb(Object object) {
        boolean bl2 = object instanceof zzlo;
        if (bl2) {
            return ((zzlo)object).j_();
        }
        boolean bl3 = object instanceof zzkq;
        if (bl3) {
            return true;
        }
        object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void zzc(zzjy var0, Object var1_1) {
        var2_2 = var0.zzb();
        zzkj.zza(var1_1);
        var3_3 = zzjz.zza;
        var2_2 = var2_2.zzb();
        var4_4 = var2_2.ordinal();
        var4_4 = var3_3[var4_4];
        var5_5 = 1;
        block0 : switch (var4_4) lbl-1000:
        // 4 sources

        {
            default: {
                var4_4 = 0;
                var2_2 = null;
                break;
            }
            case 9: {
                var4_4 = var1_1 instanceof zzlm;
                if (var4_4 == 0 && (var4_4 = var1_1 instanceof zzkq) == 0) ** GOTO lbl-1000
lbl17:
                // 3 sources

                while (true) {
                    var4_4 = 1;
                    break block0;
                    break;
                }
            }
            case 8: {
                var4_4 = var1_1 instanceof Integer;
                if (var4_4 == 0 && (var4_4 = var1_1 instanceof zzki) == 0) ** GOTO lbl-1000
                ** GOTO lbl17
            }
            case 7: {
                var4_4 = var1_1 instanceof zziy;
                if (var4_4 == 0 && (var4_4 = var1_1 instanceof byte[]) == 0) ** GOTO lbl-1000
                ** continue;
            }
            case 6: {
                var4_4 = var1_1 instanceof String;
                break;
            }
            case 5: {
                var4_4 = var1_1 instanceof Boolean;
                break;
            }
            case 4: {
                var4_4 = var1_1 instanceof Double;
                break;
            }
            case 3: {
                var4_4 = var1_1 instanceof Float;
                break;
            }
            case 2: {
                var4_4 = var1_1 instanceof Long;
                break;
            }
            case 1: {
                var4_4 = var1_1 instanceof Integer;
            }
        }
        if (var4_4 != 0) {
            return;
        }
        var6_6 = var0.zza();
        var0 = var0.zzb().zzb();
        var1_1 = var1_1.getClass().getName();
        var7_7 = new Object[3];
        var7_7[0] = var6_6;
        var7_7[var5_5] = var0;
        var7_7[2] = var1_1;
        var0 = String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", var7_7);
        var2_2 = new IllegalArgumentException((String)var0);
        throw var2_2;
    }

    private static boolean zzc(Map.Entry object) {
        zznj zznj2;
        zzjy zzjy2 = (zzjy)object.getKey();
        zznj zznj3 = zzjy2.zzc();
        if (zznj3 == (zznj2 = zznj.zzi)) {
            int n3 = zzjy2.zze();
            if (n3 != 0) {
                object = (List)object.getValue();
                n3 = object.size();
                zznj3 = null;
                zznj2 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object e2 = object.get(i3);
                    boolean bl2 = zzjw.zzb(e2);
                    if (bl2) continue;
                    return false;
                }
            } else {
                return zzjw.zzb(object.getValue());
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        Object object;
        int n3;
        zzjw zzjw2 = new zzjw();
        Object object2 = this.zza;
        int n4 = ((zzmj)object2).zzb();
        Map.Entry entry = null;
        for (n3 = 0; n3 < n4; ++n3) {
            object = this.zza.zza(n3);
            zzjy zzjy2 = (zzjy)object.getKey();
            object = object.getValue();
            zzjw2.zzb(zzjy2, object);
        }
        object2 = this.zza.zzc().iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object2.next();
            object = (zzjy)entry.getKey();
            entry = entry.getValue();
            zzjw2.zzb((zzjy)object, entry);
        }
        n4 = (int)(this.zzd ? 1 : 0);
        zzjw2.zzd = n4;
        return zzjw2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzjw;
        if (!bl2) {
            return false;
        }
        object = (zzjw)object;
        zzmj zzmj2 = this.zza;
        object = ((zzjw)object).zza;
        return zzmj2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int n3;
        Object object = this.zza;
        int n4 = ((zzmj)object).zzb();
        Map.Entry entry = null;
        int n7 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry2 = this.zza.zza(n3);
            int n8 = zzjw.zza(entry2);
            n7 += n8;
        }
        object = this.zza.zzc().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            n3 = zzjw.zza(entry);
            n7 += n3;
        }
        return n7;
    }

    public final void zza(zzjw object) {
        Object object2 = ((zzjw)object).zza;
        int n3 = ((zzmj)object2).zzb();
        for (int i3 = 0; i3 < n3; ++i3) {
            Map.Entry entry = ((zzjw)object).zza.zza(i3);
            this.zzb(entry);
        }
        object = ((zzjw)object).zza.zzc().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Map.Entry)object.next();
            this.zzb((Map.Entry)object2);
        }
    }

    public final Iterator zzc() {
        Object object = this.zza;
        boolean bl2 = ((AbstractMap)object).isEmpty();
        if (bl2) {
            return Collections.emptyIterator();
        }
        bl2 = this.zzd;
        if (bl2) {
            Iterator iterator = this.zza.zzd().iterator();
            object = new zzks(iterator);
            return object;
        }
        return this.zza.zzd().iterator();
    }

    public final Iterator zzd() {
        Object object = this.zza;
        boolean bl2 = ((AbstractMap)object).isEmpty();
        if (bl2) {
            return Collections.emptyIterator();
        }
        bl2 = this.zzd;
        if (bl2) {
            Iterator iterator = this.zza.entrySet().iterator();
            object = new zzks(iterator);
            return object;
        }
        return this.zza.entrySet().iterator();
    }

    public final void zze() {
        int n3;
        int n4 = this.zzc;
        if (n4 != 0) {
            return;
        }
        Object object = this.zza;
        n4 = ((zzmj)object).zzb();
        zzkg zzkg2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Object object2 = this.zza.zza(n3).getValue();
            boolean bl2 = object2 instanceof zzkg;
            if (!bl2) continue;
            object2 = (zzkg)object2;
            ((zzkg)object2).zzco();
        }
        object = this.zza.zzc().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            zzkg2 = (zzkg)((Map.Entry)object.next()).getValue();
            boolean bl3 = zzkg2 instanceof zzkg;
            if (!bl3) continue;
            zzkg2 = zzkg2;
            zzkg2.zzco();
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int n3;
        Object object = this.zza;
        int n4 = ((zzmj)object).zzb();
        Map.Entry entry = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Map.Entry entry2 = this.zza.zza(n3);
            boolean bl2 = zzjw.zzc(entry2);
            if (bl2) continue;
            return false;
        }
        object = this.zza.zzc().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            n3 = (int)(zzjw.zzc(entry) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }
}

