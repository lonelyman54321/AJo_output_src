/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzj;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbl;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhci;
import com.google.android.gms.internal.ads.zzhcj;
import com.google.android.gms.internal.ads.zzhck;
import com.google.android.gms.internal.ads.zzhdd;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdj;
import com.google.android.gms.internal.ads.zzhec;
import com.google.android.gms.internal.ads.zzhem;
import com.google.android.gms.internal.ads.zzhfg;
import com.google.android.gms.internal.ads.zzhfh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzhbd {
    private static final zzhbd zzb;
    final zzhem zza;
    private boolean zzc;
    private boolean zzd;

    static {
        zzhbd zzhbd2;
        zzb = zzhbd2 = new zzhbd(true);
    }

    private zzhbd() {
        zzhec zzhec2 = new zzhec(16);
        this.zza = zzhec2;
    }

    private zzhbd(boolean bl2) {
        zzhec zzhec2 = new zzhec(0);
        this.zza = zzhec2;
        this.zzi();
        this.zzi();
    }

    public static int zza(zzhfg zzhfg2, int n3, Object object) {
        n3 = zzhat.zzD(n3 << 3);
        Object object2 = zzhfg.zzj;
        if (zzhfg2 == object2) {
            object2 = object;
            object2 = (zzhde)object;
            boolean bl2 = object2 instanceof zzgzj;
            if (!bl2) {
                n3 += n3;
            } else {
                throw null;
            }
        }
        int n4 = zzhbd.zzb(zzhfg2, object);
        return n3 + n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int zzb(zzhfg object, Object object2) {
        Object object3;
        int n3 = ((Enum)object).ordinal();
        int n4 = 4;
        int n7 = 8;
        switch (n3) {
            default: {
                RuntimeException runtimeException = new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                throw runtimeException;
            }
            case 17: {
                long l2 = (Long)object3;
                long l3 = l2 + l2;
                return zzhat.zzE(l2 >> 63 ^ l3);
            }
            case 16: {
                n3 = (Integer)object3;
                int n8 = n3 + n3;
                return zzhat.zzD(n3 >> 31 ^ n8);
            }
            case 15: {
                ((Long)object3).getClass();
                n3 = zzhat.zzf;
                return n7;
            }
            case 14: {
                ((Integer)object3).getClass();
                n3 = zzhat.zzf;
                return n4;
            }
            case 13: {
                n3 = object3 instanceof zzhbs;
                if (n3 == 0) return zzhat.zzE(((Integer)object3).intValue());
                return zzhat.zzE(((zzhbs)object3).zza());
            }
            case 12: {
                return zzhat.zzD((Integer)object3);
            }
            case 11: {
                int n10;
                n3 = object3 instanceof zzhac;
                if (n3 != 0) {
                    object3 = (zzhac)object3;
                    n3 = zzhat.zzf;
                    n3 = ((zzhac)object3).zzd();
                    n10 = zzhat.zzD(n3);
                    return n10 + n3;
                }
                object3 = (byte[])object3;
                n3 = zzhat.zzf;
                n3 = ((Object)object3).length;
                n10 = zzhat.zzD(n3);
                return n10 + n3;
            }
            case 10: {
                n3 = object3 instanceof zzhcj;
                if (n3 == 0) return zzhat.zzz((zzhde)object3);
                object3 = (zzhcj)object3;
                n3 = zzhat.zzf;
                n3 = ((zzhck)object3).zza();
                int n10 = zzhat.zzD(n3);
                return n10 + n3;
            }
            case 9: {
                object3 = (zzhde)object3;
                n3 = zzhat.zzf;
                return object3.zzaY();
            }
            case 8: {
                n3 = object3 instanceof zzhac;
                if (n3 == 0) return zzhat.zzC((String)object3);
                object3 = (zzhac)object3;
                n3 = zzhat.zzf;
                n3 = ((zzhac)object3).zzd();
                int n10 = zzhat.zzD(n3);
                return n10 + n3;
            }
            case 7: {
                ((Boolean)object3).getClass();
                n3 = zzhat.zzf;
                return 1;
            }
            case 6: {
                ((Integer)object3).getClass();
                n3 = zzhat.zzf;
                return n4;
            }
            case 5: {
                ((Long)object3).getClass();
                n3 = zzhat.zzf;
                return n7;
            }
            case 4: {
                return zzhat.zzE(((Integer)object3).intValue());
            }
            case 3: {
                return zzhat.zzE((Long)object3);
            }
            case 2: {
                return zzhat.zzE((Long)object3);
            }
            case 1: {
                ((Float)object3).getClass();
                n3 = zzhat.zzf;
                return n4;
            }
            case 0: 
        }
        ((Double)object3).getClass();
        n3 = zzhat.zzf;
        return n7;
    }

    public static int zzc(zzhbc iterator, Object object) {
        zzhfg zzhfg2 = iterator.zzd();
        int n3 = iterator.zza();
        int n4 = (int)(iterator.zzg() ? 1 : 0);
        if (n4 != 0) {
            int n7;
            object = (List)object;
            int n8 = iterator.zzf();
            n4 = 0;
            if (n8 != 0) {
                int n10;
                n8 = object.isEmpty();
                if (n8 != 0) {
                    return 0;
                }
                iterator = object.iterator();
                while ((n10 = iterator.hasNext()) != 0) {
                    object = iterator.next();
                    n10 = zzhbd.zzb(zzhfg2, object);
                    n4 += n10;
                }
                n8 = zzhat.zzD(n3 << 3) + n4;
                return zzhat.zzD(n4) + n8;
            }
            iterator = object.iterator();
            while ((n7 = iterator.hasNext()) != 0) {
                object = iterator.next();
                n7 = zzhbd.zza(zzhfg2, n3, object);
                n4 += n7;
            }
            return n4;
        }
        return zzhbd.zza(zzhfg2, n3, object);
    }

    public static zzhbd zze() {
        return zzb;
    }

    private static Object zzm(Object object) {
        int n3 = object instanceof zzhdj;
        if (n3 != 0) {
            return ((zzhdj)object).zzc();
        }
        n3 = object instanceof byte[];
        if (n3 != 0) {
            object = (byte[])object;
            n3 = ((Object)object).length;
            byte[] byArray = new byte[n3];
            System.arraycopy(object, 0, byArray, 0, n3);
            return byArray;
        }
        return object;
    }

    private final void zzn(Map.Entry object) {
        zzhfh zzhfh2;
        zzhbc zzhbc2 = (zzhbc)object.getKey();
        object = object.getValue();
        boolean bl2 = object instanceof zzhcj;
        boolean bl3 = zzhbc2.zzg();
        if (bl3) {
            if (!bl2) {
                ArrayList arrayList = this.zzf(zzhbc2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                object = ((List)object).iterator();
                while (bl3 = object.hasNext()) {
                    Object object2 = object.next();
                    List list = arrayList;
                    list = arrayList;
                    object2 = zzhbd.zzm(object2);
                    list.add(object2);
                }
                this.zza.zze(zzhbc2, arrayList);
                return;
            }
            object = new IllegalStateException("Lazy fields can not be repeated");
            throw object;
        }
        Object object3 = zzhbc2.zze();
        if (object3 == (zzhfh2 = zzhfh.zzi)) {
            object3 = this.zzf(zzhbc2);
            if (object3 == null) {
                object3 = this.zza;
                object = zzhbd.zzm(object);
                ((zzhem)object3).zze(zzhbc2, object);
                if (bl2) {
                    boolean bl4;
                    this.zzd = bl4 = true;
                }
                return;
            }
            if (!bl2) {
                bl2 = object3 instanceof zzhdj;
                if (bl2) {
                    object3 = (zzhdj)object3;
                    object = (zzhdj)object;
                    object = zzhbc2.zzc((zzhdj)object3, (zzhdj)object);
                } else {
                    object3 = (zzhde)object3;
                    zzhdd zzhdd2 = object3.zzcZ();
                    object = (zzhde)object;
                    zzhbc2.zzb(zzhdd2, (zzhde)object);
                    object = zzhdd2.zzbr();
                }
                this.zza.zze(zzhbc2, object);
                return;
            }
            throw null;
        }
        if (!bl2) {
            zzhem zzhem2 = this.zza;
            object = zzhbd.zzm(object);
            zzhem2.zze(zzhbc2, object);
            return;
        }
        object = new IllegalStateException("Lazy fields must be message-valued");
        throw object;
    }

    private static boolean zzo(Map.Entry object) {
        zzhfh zzhfh2;
        zzhbc zzhbc2 = (zzhbc)object.getKey();
        zzhfh zzhfh3 = zzhbc2.zze();
        if (zzhfh3 == (zzhfh2 = zzhfh.zzi)) {
            boolean bl2 = zzhbc2.zzg();
            if (bl2) {
                object = ((List)object.getValue()).iterator();
                while (bl2 = object.hasNext()) {
                    zzhbc2 = object.next();
                    bl2 = zzhbd.zzp(zzhbc2);
                    if (bl2) continue;
                    return false;
                }
            } else {
                return zzhbd.zzp(object.getValue());
            }
        }
        return true;
    }

    private static boolean zzp(Object object) {
        boolean bl2 = object instanceof zzhdf;
        if (bl2) {
            return ((zzhdf)object).zzbw();
        }
        boolean bl3 = object instanceof zzhcj;
        if (bl3) {
            return true;
        }
        object = new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        throw object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final int zzq(Map.Entry object) {
        int n3;
        int n4;
        int n7;
        zzhfh zzhfh2;
        zzhbc zzhbc2 = (zzhbc)object.getKey();
        Object object2 = object.getValue();
        zzhfh zzhfh3 = zzhbc2.zze();
        if (zzhfh3 != (zzhfh2 = zzhfh.zzi) || (n7 = zzhbc2.zzg()) != 0 || (n7 = zzhbc2.zzf()) != 0) return zzhbd.zzc(zzhbc2, object2);
        int n8 = object2 instanceof zzhcj;
        n7 = 24;
        int n10 = 16;
        int n14 = 8;
        if (n8 != 0) {
            object = (zzhbc)object.getKey();
            n4 = object.zza();
            object2 = (zzhcj)object2;
            n8 = zzhat.zzD(n14);
            n8 += n8;
            n10 = zzhat.zzD(n10);
            n4 = zzhat.zzD(n4) + n10;
            n7 = zzhat.zzD(n7);
            n3 = ((zzhck)object2).zza();
            n3 = rk3_1.a(n3, n3, n7);
            return n8 + n4 + n3;
        }
        object = (zzhbc)object.getKey();
        n4 = object.zza();
        object2 = (zzhde)object2;
        n8 = zzhat.zzD(n14);
        n8 += n8;
        n10 = zzhat.zzD(n10);
        n4 = zzhat.zzD(n4) + n10;
        n7 = zzhat.zzD(n7);
        n3 = zzhat.zzz((zzhde)object2) + n7;
        return n8 + n4 + n3;
    }

    private static final void zzr(zzhbc object, Object object2) {
        Object object3;
        Object object4;
        block13: {
            block14: {
                object4 = object.zzd();
                object3 = zzhcb.zzd;
                object2.getClass();
                object3 = (Object)zzhfg.zza;
                object3 = (Object)zzhfh.zza;
                object4 = ((zzhfg)((Object)object4)).zza();
                int n3 = ((Enum)object4).ordinal();
                switch (n3) {
                    default: {
                        break block13;
                    }
                    case 8: {
                        n3 = object2 instanceof zzhde;
                        if (n3 == 0 && (n3 = object2 instanceof zzhcj) == 0) break block13;
                        break block14;
                    }
                    case 7: {
                        n3 = object2 instanceof Integer;
                        if (n3 == 0 && (n3 = object2 instanceof zzhbs) == 0) break block13;
                        break block14;
                    }
                    case 6: {
                        n3 = object2 instanceof zzhac;
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
        object = object.zzd().zza();
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
        boolean bl2 = object instanceof zzhbd;
        if (!bl2) {
            return false;
        }
        object = (zzhbd)object;
        zzhem zzhem2 = this.zza;
        object = ((zzhbd)object).zza;
        return zzhem2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        Object object;
        int n3;
        Iterator iterator = null;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = ((zzhem)(object = this.zza)).zzb()); ++i3) {
            object = this.zza.zzg(i3);
            n3 = zzhbd.zzq((Map.Entry)object);
            n4 += n3;
        }
        iterator = this.zza.zzc().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = zzhbd.zzq((Map.Entry)object);
            n4 += n3;
        }
        return n4;
    }

    public final Object zzf(zzhbc object) {
        zzhem zzhem2 = this.zza;
        boolean bl2 = (object = zzhem2.get(object)) instanceof zzhcj;
        if (!bl2) {
            return object;
        }
        throw null;
    }

    public final Iterator zzg() {
        boolean bl2 = this.zzd;
        if (bl2) {
            Object object = this.zza;
            object = ((zzhem)object).entrySet().iterator();
            zzhci zzhci2 = new zzhci((Iterator)object);
            return zzhci2;
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzh(zzhbc object, Object object2) {
        ArrayList<Object> arrayList = object;
        arrayList = (zzhbl)object;
        boolean bl2 = ((zzhbl)((Object)arrayList)).zzd;
        if (bl2) {
            zzhbd.zzr((zzhbc)object, object2);
            arrayList = this.zzf((zzhbc)object);
            if (arrayList == null) {
                arrayList = new ArrayList<Object>();
                zzhem zzhem2 = this.zza;
                zzhem2.zze((Comparable)object, arrayList);
            } else {
                arrayList = arrayList;
            }
            arrayList.add(object2);
            return;
        }
        object = new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        throw object;
    }

    public final void zzi() {
        int n3 = this.zzc;
        if (n3 == 0) {
            Object object;
            int n4;
            zzhem zzhem2 = null;
            for (n3 = 0; n3 < (n4 = ((zzhem)(object = this.zza)).zzb()); ++n3) {
                object = this.zza.zzg(n3);
                Object v4 = object.getValue();
                boolean bl2 = v4 instanceof zzhbo;
                if (!bl2) continue;
                object = (zzhbo)object.getValue();
                ((zzhbo)object).zzbV();
            }
            zzhem2 = this.zza;
            zzhem2.zza();
            n3 = 1;
            this.zzc = n3;
        }
    }

    public final void zzj(zzhbd object) {
        Object object2;
        int n3;
        int n4;
        Map.Entry entry = null;
        for (n4 = 0; n4 < (n3 = ((zzhem)(object2 = ((zzhbd)object).zza)).zzb()); ++n4) {
            object2 = ((zzhbd)object).zza.zzg(n4);
            this.zzn((Map.Entry)object2);
        }
        object = ((zzhbd)object).zza.zzc().iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            entry = (Map.Entry)object.next();
            this.zzn(entry);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzk(zzhbc object, Object list) {
        boolean bl2 = object.zzg();
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
                zzhbd.zzr((zzhbc)object, e2);
            }
            list = arrayList;
        } else {
            zzhbd.zzr((zzhbc)object, list);
        }
        bl2 = list instanceof zzhcj;
        if (bl2) {
            this.zzd = bl2 = true;
        }
        this.zza.zze((Comparable)object, list);
    }

    public final boolean zzl() {
        Object object;
        int n3;
        Iterator iterator = null;
        for (int i3 = 0; i3 < (n3 = ((zzhem)(object = this.zza)).zzb()); ++i3) {
            object = this.zza.zzg(i3);
            n3 = (int)(zzhbd.zzo((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        iterator = this.zza.zzc().iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (Map.Entry)iterator.next();
            n3 = (int)(zzhbd.zzo((Map.Entry)object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }
}

