/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzit;
import com.google.android.gms.internal.vision.zziw;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjp;
import com.google.android.gms.internal.vision.zzjq;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkn;
import com.google.android.gms.internal.vision.zzkt;
import com.google.android.gms.internal.vision.zzlh;
import com.google.android.gms.internal.vision.zzml;
import com.google.android.gms.internal.vision.zzmo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zziu {
    private static final zziu zzd;
    final zzlh zza;
    private boolean zzb;
    private boolean zzc;

    static {
        zziu zziu2;
        zzd = zziu2 = new zziu(true);
    }

    private zziu() {
        zzlh zzlh2;
        this.zza = zzlh2 = zzlh.zza(16);
    }

    private zziu(zzlh zzlh2) {
        this.zza = zzlh2;
        this.zzb();
    }

    private zziu(boolean bl2) {
        zzlh zzlh2 = zzlh.zza(0);
        this(zzlh2);
        this.zzb();
    }

    public static int zza(zzml zzml2, int n3, Object object) {
        n3 = zzii.zze(n3);
        Object object2 = zzml.zzj;
        if (zzml2 == object2) {
            object2 = object;
            object2 = (zzkk)object;
            zzjf.zza((zzkk)object2);
            n3 <<= 1;
        }
        int n4 = zziu.zza(zzml2, object);
        return n3 + n4;
    }

    private static int zza(zzml object, Object object2) {
        int[] nArray = zzit.zzb;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw object;
            }
            case 18: {
                n3 = object2 instanceof zzje;
                if (n3 != 0) {
                    return zzii.zzk(((zzje)object2).zza());
                }
                return zzii.zzk((Integer)object2);
            }
            case 17: {
                return zzii.zzf((Long)object2);
            }
            case 16: {
                return zzii.zzh((Integer)object2);
            }
            case 15: {
                return zzii.zzh((Long)object2);
            }
            case 14: {
                return zzii.zzj((Integer)object2);
            }
            case 13: {
                return zzii.zzg((Integer)object2);
            }
            case 12: {
                n3 = object2 instanceof zzht;
                if (n3 != 0) {
                    return zzii.zzb((zzht)object2);
                }
                return zzii.zzb((byte[])object2);
            }
            case 11: {
                n3 = object2 instanceof zzht;
                if (n3 != 0) {
                    return zzii.zzb((zzht)object2);
                }
                return zzii.zzb((String)object2);
            }
            case 10: {
                n3 = object2 instanceof zzjp;
                if (n3 != 0) {
                    return zzii.zza((zzjp)object2);
                }
                return zzii.zzb((zzkk)object2);
            }
            case 9: {
                return zzii.zzc((zzkk)object2);
            }
            case 8: {
                return zzii.zzb((Boolean)object2);
            }
            case 7: {
                return zzii.zzi((Integer)object2);
            }
            case 6: {
                return zzii.zzg((Long)object2);
            }
            case 5: {
                return zzii.zzf((Integer)object2);
            }
            case 4: {
                return zzii.zze((Long)object2);
            }
            case 3: {
                return zzii.zzd((Long)object2);
            }
            case 2: {
                return zzii.zzb(((Float)object2).floatValue());
            }
            case 1: 
        }
        return zzii.zzb((Double)object2);
    }

    public static zziu zza() {
        return zzd;
    }

    private static Object zza(Object object) {
        boolean bl2 = object instanceof zzkt;
        if (bl2) {
            return ((zzkt)object).zza();
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
    public static void zza(zzii zzii2, zzml zzml2, int n3, Object object) {
        zzml zzml3 = zzml.zzj;
        if (zzml2 == zzml3) {
            object = (zzkk)object;
            zzjf.zza((zzkk)object);
            zzii2.zza(n3, 3);
            object.zza(zzii2);
            zzii2.zza(n3, 4);
            return;
        }
        int n4 = zzml2.zzb();
        zzii2.zza(n3, n4);
        int[] nArray = zzit.zzb;
        int n7 = zzml2.ordinal();
        n7 = nArray[n7];
        switch (n7) {
            default: {
                return;
            }
            case 18: {
                n7 = object instanceof zzje;
                if (n7 != 0) {
                    n7 = ((zzje)object).zza();
                    zzii2.zza(n7);
                    return;
                }
                object = (Integer)object;
                n7 = (Integer)object;
                zzii2.zza(n7);
                return;
            }
            case 17: {
                long l2 = (Long)object;
                zzii2.zzb(l2);
                return;
            }
            case 16: {
                n7 = (Integer)object;
                zzii2.zzc(n7);
                return;
            }
            case 15: {
                long l3 = (Long)object;
                zzii2.zzc(l3);
                return;
            }
            case 14: {
                n7 = (Integer)object;
                zzii2.zzd(n7);
                return;
            }
            case 13: {
                n7 = (Integer)object;
                zzii2.zzb(n7);
                return;
            }
            case 12: {
                n7 = object instanceof zzht;
                if (n7 != 0) {
                    object = (zzht)object;
                    zzii2.zza((zzht)object);
                    return;
                }
                object = (byte[])object;
                n7 = ((Object)object).length;
                zzii2.zzb((byte[])object, 0, n7);
                return;
            }
            case 11: {
                n7 = object instanceof zzht;
                if (n7 != 0) {
                    object = (zzht)object;
                    zzii2.zza((zzht)object);
                    return;
                }
                object = (String)object;
                zzii2.zza((String)object);
                return;
            }
            case 10: {
                object = (zzkk)object;
                zzii2.zza((zzkk)object);
                return;
            }
            case 9: {
                ((zzkk)object).zza(zzii2);
                return;
            }
            case 8: {
                n7 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                zzii2.zza(n7 != 0);
                return;
            }
            case 7: {
                n7 = (Integer)object;
                zzii2.zzd(n7);
                return;
            }
            case 6: {
                long l4 = (Long)object;
                zzii2.zzc(l4);
                return;
            }
            case 5: {
                n7 = (Integer)object;
                zzii2.zza(n7);
                return;
            }
            case 4: {
                long l7 = (Long)object;
                zzii2.zza(l7);
                return;
            }
            case 3: {
                long l8 = (Long)object;
                zzii2.zza(l8);
                return;
            }
            case 2: {
                float f5 = ((Float)object).floatValue();
                zzii2.zza(f5);
                return;
            }
            case 1: 
        }
        double d2 = (Double)object;
        zzii2.zza(d2);
    }

    private static boolean zza(Map.Entry object) {
        Object object2 = (zziw)object.getKey();
        zzmo zzmo2 = object2.zzc();
        zzmo zzmo3 = zzmo.zzi;
        boolean bl2 = true;
        if (zzmo2 == zzmo3) {
            boolean bl3 = object2.zzd();
            zzmo2 = null;
            if (bl3) {
                object = ((List)object.getValue()).iterator();
                while (bl3 = object.hasNext()) {
                    object2 = (zzkk)object.next();
                    bl3 = object2.zzk();
                    if (bl3) continue;
                    return false;
                }
            } else {
                bl3 = (object = object.getValue()) instanceof zzkk;
                if (bl3) {
                    boolean bl4 = (object = (zzkk)object).zzk();
                    if (!bl4) {
                        return false;
                    }
                } else {
                    boolean bl5 = object instanceof zzjp;
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

    private final void zzb(Map.Entry object) {
        zzmo zzmo2;
        zziw zziw2 = (zziw)object.getKey();
        boolean bl2 = (object = object.getValue()) instanceof zzjp;
        if (bl2) {
            object = zzjp.zza();
        }
        if (bl2 = zziw2.zzd()) {
            boolean bl3;
            ArrayList arrayList = this.zza(zziw2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            object = ((List)object).iterator();
            while (bl3 = object.hasNext()) {
                Object object2 = object.next();
                List list = arrayList;
                list = arrayList;
                object2 = zziu.zza(object2);
                list.add(object2);
            }
            this.zza.zza(zziw2, arrayList);
            return;
        }
        Object object3 = zziw2.zzc();
        if (object3 == (zzmo2 = zzmo.zzi)) {
            object3 = this.zza(zziw2);
            if (object3 == null) {
                object3 = this.zza;
                object = zziu.zza(object);
                ((zzlh)object3).zza(zziw2, object);
                return;
            }
            boolean bl4 = object3 instanceof zzkt;
            if (bl4) {
                object3 = (zzkt)object3;
                object = (zzkt)object;
                object = zziw2.zza((zzkt)object3, (zzkt)object);
            } else {
                object3 = ((zzkk)object3).zzp();
                object = (zzkk)object;
                object = zziw2.zza((zzkn)object3, (zzkk)object).zzf();
            }
            this.zza.zza(zziw2, object);
            return;
        }
        object3 = this.zza;
        object = zziu.zza(object);
        ((zzlh)object3).zza(zziw2, object);
    }

    public static int zzc(zziw iterator, Object object) {
        zzml zzml2 = iterator.zzb();
        int n3 = iterator.zza();
        int n4 = (int)(iterator.zzd() ? 1 : 0);
        if (n4 != 0) {
            int n7;
            int n8 = iterator.zze();
            n4 = 0;
            if (n8 != 0) {
                int n10;
                object = (List)object;
                iterator = object.iterator();
                while ((n10 = iterator.hasNext()) != 0) {
                    object = iterator.next();
                    n10 = zziu.zza(zzml2, object);
                    n4 += n10;
                }
                n8 = zzii.zze(n3) + n4;
                return zzii.zzl(n4) + n8;
            }
            object = (List)object;
            iterator = object.iterator();
            while ((n7 = iterator.hasNext()) != 0) {
                object = iterator.next();
                n7 = zziu.zza(zzml2, n3, object);
                n4 += n7;
            }
            return n4;
        }
        return zziu.zza(zzml2, n3, object);
    }

    private static int zzc(Map.Entry entry) {
        boolean bl2;
        zzmo zzmo2;
        zziw zziw2 = (zziw)entry.getKey();
        Object object = entry.getValue();
        zzmo zzmo3 = zziw2.zzc();
        if (zzmo3 == (zzmo2 = zzmo.zzi) && !(bl2 = zziw2.zzd()) && !(bl2 = zziw2.zze())) {
            boolean bl3 = object instanceof zzjp;
            if (bl3) {
                int n3 = ((zziw)entry.getKey()).zza();
                object = (zzjp)object;
                return zzii.zzb(n3, object);
            }
            int n4 = ((zziw)entry.getKey()).zza();
            object = (zzkk)object;
            return zzii.zzb(n4, object);
        }
        return zziu.zzc(zziw2, object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void zzd(zziw var0, Object var1_1) {
        var2_2 = var0.zzb();
        zzjf.zza(var1_1);
        var3_3 = zzit.zza;
        var2_2 = var2_2.zza();
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
                var4_4 = var1_1 instanceof zzkk;
                if (var4_4 == 0 && (var4_4 = var1_1 instanceof zzjp) == 0) ** GOTO lbl-1000
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
                if (var4_4 == 0 && (var4_4 = var1_1 instanceof zzje) == 0) ** GOTO lbl-1000
                ** GOTO lbl17
            }
            case 7: {
                var4_4 = var1_1 instanceof zzht;
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
        var0 = var0.zzb().zza();
        var1_1 = var1_1.getClass().getName();
        var7_7 = new Object[3];
        var7_7[0] = var6_6;
        var7_7[var5_5] = var0;
        var7_7[2] = var1_1;
        var0 = String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", var7_7);
        var2_2 = new IllegalArgumentException((String)var0);
        throw var2_2;
    }

    public final /* synthetic */ Object clone() {
        zziw zziw2;
        Object object;
        int n3;
        int n4;
        zziu zziu2 = new zziu();
        Iterator iterator = null;
        for (n4 = 0; n4 < (n3 = ((zzlh)(object = this.zza)).zzc()); ++n4) {
            object = this.zza.zzb(n4);
            zziw2 = (zziw)object.getKey();
            object = object.getValue();
            zziu2.zza(zziw2, object);
        }
        iterator = this.zza.zzd().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            zziw2 = (zziw)object.getKey();
            object = object.getValue();
            zziu2.zza(zziw2, object);
        }
        n4 = (int)(this.zzc ? 1 : 0);
        zziu2.zzc = n4;
        return zziu2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zziu;
        if (!bl2) {
            return false;
        }
        object = (zziu)object;
        zzlh zzlh2 = this.zza;
        object = ((zziu)object).zza;
        return zzlh2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Object zza(zziw object) {
        zzlh zzlh2 = this.zza;
        boolean bl2 = (object = zzlh2.get(object)) instanceof zzjp;
        if (bl2) {
            object = zzjp.zza();
        }
        return object;
    }

    public final void zza(zziu object) {
        Object object2;
        int n3;
        int n4;
        Map.Entry entry = null;
        for (n4 = 0; n4 < (n3 = ((zzlh)(object2 = ((zziu)object).zza)).zzc()); ++n4) {
            object2 = ((zziu)object).zza.zzb(n4);
            this.zzb((Map.Entry)object2);
        }
        object = ((zziu)object).zza.zzd().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            this.zzb(entry);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(zziw object, Object list) {
        boolean bl2 = object.zzd();
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
                zziu.zzd((zziw)object, e2);
            }
            list = arrayList;
        } else {
            zziu.zzd((zziw)object, list);
        }
        bl2 = list instanceof zzjp;
        if (bl2) {
            this.zzc = bl2 = true;
        }
        this.zza.zza((Comparable)object, list);
    }

    public final void zzb() {
        boolean bl2 = this.zzb;
        if (bl2) {
            return;
        }
        this.zza.zza();
        this.zzb = true;
    }

    public final void zzb(zziw object, Object object2) {
        boolean bl2 = object.zzd();
        if (bl2) {
            zziu.zzd((zziw)object, object2);
            ArrayList<Object> arrayList = this.zza((zziw)object);
            if (arrayList == null) {
                arrayList = new ArrayList<Object>();
                zzlh zzlh2 = this.zza;
                zzlh2.zza((Comparable)object, arrayList);
            } else {
                arrayList = arrayList;
            }
            arrayList.add(object2);
            return;
        }
        object = new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        throw object;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final Iterator zzd() {
        boolean bl2 = this.zzc;
        if (bl2) {
            Iterator iterator = this.zza.entrySet().iterator();
            zzjq zzjq2 = new zzjq(iterator);
            return zzjq2;
        }
        return this.zza.entrySet().iterator();
    }

    public final Iterator zze() {
        boolean bl2 = this.zzc;
        if (bl2) {
            Iterator iterator = this.zza.zze().iterator();
            zzjq zzjq2 = new zzjq(iterator);
            return zzjq2;
        }
        return this.zza.zze().iterator();
    }

    public final boolean zzf() {
        Object object;
        int n3;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n3 = ((zzlh)(object = this.zza)).zzc()); ++i3) {
            object = this.zza.zzb(i3);
            n3 = (int)(zziu.zza((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        iterator = this.zza.zzd().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = (int)(zziu.zza((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }

    public final int zzg() {
        Object object;
        int n3;
        Iterator iterator = null;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = ((zzlh)(object = this.zza)).zzc()); ++i3) {
            object = this.zza.zzb(i3);
            n3 = zziu.zzc((Map.Entry)object);
            n4 += n3;
        }
        iterator = this.zza.zzd().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = zziu.zzc((Map.Entry)object);
            n4 += n3;
        }
        return n4;
    }
}

