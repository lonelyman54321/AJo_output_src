/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;
import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzdr;
import com.google.android.gms.internal.vision.zzds;
import com.google.android.gms.internal.vision.zzdt;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.internal.vision.zzdv;
import com.google.android.gms.internal.vision.zzdx;
import com.google.android.gms.internal.vision.zzea;
import com.google.android.gms.internal.vision.zzec;
import com.google.android.gms.internal.vision.zzfc;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class zzdp
extends AbstractMap
implements Serializable {
    private static final Object zzd;
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    static {
        Object object;
        zzd = object = new Object();
    }

    public zzdp() {
        int n3;
        int n4 = 1;
        zzde.zza(n4 != 0, (Object)"Expected size must be >= 0");
        this.zzf = n3 = zzfc.zza(3, n4, -1 >>> 2);
    }

    private final int zza(int n3, int n4, int n7, int n8) {
        Object object = zzea.zza(n4);
        n4 += -1;
        if (n8 != 0) {
            zzea.zza(object, n7 &= n4, ++n8);
        }
        Object object2 = this.zze;
        int[] nArray = this.zza;
        for (int i3 = 0; i3 <= n3; ++i3) {
            int n10 = zzea.zza(object2, i3);
            while (n10 != 0) {
                int n14 = n10 + -1;
                int n15 = nArray[n14];
                int n16 = ~n3 & n15 | i3;
                int n17 = n16 & n4;
                int n18 = zzea.zza(object, n17);
                zzea.zza(object, n17, n10);
                nArray[n14] = n10 = zzea.zza(n16, n18, n4);
                n10 = n15 & n3;
            }
        }
        this.zze = object;
        this.zzb(n4);
        return n4;
    }

    public static /* synthetic */ int zza(zzdp zzdp2) {
        return zzdp2.zzf;
    }

    private final int zza(Object object) {
        int n3;
        int n4;
        int n7 = this.zza();
        int n8 = -1;
        if (n7 != 0) {
            return n8;
        }
        Object object2 = this.zze;
        n7 = zzec.zza(object);
        int n10 = n7 & (n4 = this.zzi());
        int n14 = zzea.zza(object2, n10);
        if (n14 == 0) {
            return n8;
        }
        n10 = ~n4;
        n7 &= n10;
        do {
            Object object3;
            int[] nArray;
            int n15;
            if ((n15 = (n3 = (nArray = this.zza)[n14 += -1]) & n10) != n7 || (n15 = (int)(zzcz.zza(object, object3 = this.zzb[n14]) ? 1 : 0)) == 0) continue;
            return n14;
        } while ((n14 = n3 & n4) != 0);
        return n8;
    }

    public static /* synthetic */ Object zza(zzdp zzdp2, Object object) {
        return zzdp2.zzb(object);
    }

    public static int zzb(int n3, int n4) {
        return n3 + -1;
    }

    public static /* synthetic */ int zzb(zzdp zzdp2) {
        return zzdp2.zzi();
    }

    public static /* synthetic */ int zzb(zzdp zzdp2, Object object) {
        return zzdp2.zza(object);
    }

    private final Object zzb(Object object) {
        int n3 = this.zza();
        if (n3 != 0) {
            return zzd;
        }
        int n4 = this.zzi();
        Object object2 = this.zze;
        int[] nArray = this.zza;
        Object[] objectArray = this.zzb;
        Object object3 = object;
        int n7 = zzea.zza(object, null, n4, object2, nArray, objectArray, null);
        if (n7 == (n3 = -1)) {
            return zzd;
        }
        object3 = this.zzc[n7];
        this.zza(n7, n4);
        this.zzg = n7 = this.zzg + -1;
        this.zzc();
        return object3;
    }

    private final void zzb(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3);
        n3 = 32 - n3;
        this.zzf = n3 = zzea.zza(this.zzf, n3, 31);
    }

    public static /* synthetic */ Object zzc(zzdp zzdp2) {
        return zzdp2.zze;
    }

    public static /* synthetic */ int zzd(zzdp zzdp2) {
        int n3;
        int n4 = zzdp2.zzg;
        zzdp2.zzg = n3 = n4 + -1;
        return n4;
    }

    public static /* synthetic */ Object zzh() {
        return zzd;
    }

    private final int zzi() {
        int n3 = this.zzf & 0x1F;
        int n4 = 1;
        return (n4 << n3) - n4;
    }

    public final void clear() {
        boolean bl2 = this.zza();
        if (bl2) {
            return;
        }
        this.zzc();
        Object object = this.zzb();
        int n3 = 0;
        if (object != null) {
            int n4;
            this.zzf = n4 = zzfc.zza(this.size(), 3, -1 >>> 2);
            object.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        object = this.zzb;
        int n7 = this.zzg;
        Arrays.fill(object, 0, n7, null);
        object = this.zzc;
        n7 = this.zzg;
        Arrays.fill(object, 0, n7, null);
        object = this.zze;
        n3 = object instanceof byte[];
        if (n3 != 0) {
            object = (byte[])object;
            Arrays.fill((byte[])object, (byte)0);
        } else {
            n3 = object instanceof short[];
            if (n3 != 0) {
                object = (short[])object;
                Arrays.fill((short[])object, (short)0);
            } else {
                object = (int[])object;
                Arrays.fill((int[])object, 0);
            }
        }
        object = this.zza;
        n3 = this.zzg;
        Arrays.fill((int[])object, 0, n3, 0);
        this.zzg = 0;
    }

    public final boolean containsKey(Object object) {
        int n3;
        Map map2 = this.zzb();
        if (map2 != null) {
            return map2.containsKey(object);
        }
        int n4 = this.zza(object);
        return n4 != (n3 = -1);
    }

    public final boolean containsValue(Object object) {
        int n3;
        Map map2 = this.zzb();
        if (map2 != null) {
            return map2.containsValue(object);
        }
        map2 = null;
        for (int i3 = 0; i3 < (n3 = this.zzg); ++i3) {
            Object object2 = this.zzc[i3];
            n3 = (int)(zzcz.zza(object, object2) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            this.zzi = set = new zzdt(this);
        }
        return set;
    }

    public final Object get(Object object) {
        int n3;
        Map map2 = this.zzb();
        if (map2 != null) {
            return map2.get(object);
        }
        int n4 = this.zza(object);
        if (n4 == (n3 = -1)) {
            return null;
        }
        return this.zzc[n4];
    }

    public final boolean isEmpty() {
        int n3 = this.size();
        return n3 == 0;
    }

    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            this.zzh = set = new zzdv(this);
        }
        return set;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object put(Object object, Object object2) {
        int n3;
        Map map2;
        float f5;
        int n4;
        int n7;
        int n8;
        zzdp zzdp2 = this;
        Object object3 = object;
        Object object4 = object2;
        int n10 = this.zza();
        int n14 = 1;
        if (n10 != 0) {
            Object object5;
            n10 = this.zza();
            String string2 = "Arrays already allocated";
            zzde.zzb(n10 != 0, string2);
            n10 = this.zzf;
            n8 = Math.max(n10 + 1, 2);
            n7 = Integer.highestOneBit(n8);
            double d2 = 1.0;
            double d5 = (double)n7 * d2;
            n4 = (int)d5;
            if (n8 > n4 && (n7 <<= 1) <= 0) {
                n8 = 0x40000000;
                f5 = 2.0f;
            } else {
                n8 = n7;
            }
            n7 = 4;
            n8 = Math.max(n7, n8);
            zzdp2.zze = object5 = zzea.zza(n8);
            zzdp2.zzb(n8 -= n14);
            int[] nArray = new int[n10];
            zzdp2.zza = nArray;
            Object[] objectArray = new Object[n10];
            zzdp2.zzb = objectArray;
            Object[] objectArray2 = new Object[n10];
            zzdp2.zzc = objectArray2;
        }
        if ((map2 = this.zzb()) != null) {
            return map2.put(object3, object4);
        }
        int[] nArray = zzdp2.zza;
        Object[] objectArray = zzdp2.zzb;
        Object[] objectArray3 = zzdp2.zzc;
        n4 = zzdp2.zzg;
        int n15 = n4 + 1;
        Object object6 = zzdp2.zze;
        int n16 = zzec.zza(object);
        int n17 = n16 & (n3 = this.zzi());
        int n18 = zzea.zza(object6, n17);
        if (n18 == 0) {
            if (n15 > n3) {
                n10 = zzea.zzb(n3);
                n3 = zzdp2.zza(n3, n10, n16, n4);
            } else {
                Object object7 = zzdp2.zze;
                zzea.zza(object7, n17, n15);
            }
        } else {
            n17 = ~n3;
            int n19 = n16 & n17;
            int n20 = 0;
            while (true) {
                Object object8;
                int n21;
                int n22;
                if ((n22 = (n21 = nArray[n18 -= n14]) & n17) == n19 && (n22 = (int)(zzcz.zza(object3, object8 = objectArray[n18]) ? 1 : 0)) != 0) {
                    object3 = objectArray3[n18];
                    objectArray3[n18] = object4;
                    return object3;
                }
                n22 = n21 & n3;
                n8 = n20 + 1;
                if (n22 == 0) {
                    n7 = 9;
                    if (n8 >= n7) {
                        n10 = this.zzi() + n14;
                        n8 = 1065353216;
                        f5 = 1.0f;
                        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(n10, f5);
                        n10 = this.zzd();
                        while (true) {
                            if (n10 < 0) {
                                zzdp2.zze = linkedHashMap;
                                zzdp2.zza = null;
                                zzdp2.zzb = null;
                                zzdp2.zzc = null;
                                this.zzc();
                                return linkedHashMap.put(object3, object4);
                            }
                            Object object9 = zzdp2.zzb[n10];
                            Object object10 = zzdp2.zzc[n10];
                            linkedHashMap.put(object9, object10);
                            n10 = zzdp2.zza(n10);
                        }
                    }
                    if (n15 > n3) {
                        n10 = zzea.zzb(n3);
                        n3 = zzdp2.zza(n3, n10, n16, n4);
                        break;
                    }
                    nArray[n18] = n8 = zzea.zza(n21, n15, n3);
                    break;
                }
                n20 = n8;
                n18 = n22;
            }
        }
        int[] nArray2 = zzdp2.zza;
        n10 = nArray2.length;
        if (n15 > n10) {
            n8 = n10 >>> 1;
            n8 = Math.max(n14, n8) + n10;
            n14 |= n8;
            n8 = -1 >>> 2;
            f5 = 1.9999999f;
            if ((n14 = Math.min(n8, n14)) != n10) {
                int[] nArray3 = Arrays.copyOf(zzdp2.zza, n14);
                zzdp2.zza = nArray3;
                Object[] objectArray4 = Arrays.copyOf(zzdp2.zzb, n14);
                zzdp2.zzb = objectArray4;
                Object[] objectArray5 = Arrays.copyOf(zzdp2.zzc, n14);
                zzdp2.zzc = objectArray5;
            }
        }
        int[] nArray4 = zzdp2.zza;
        nArray4[n4] = n14 = zzea.zza(n16, 0, n3);
        zzdp2.zzb[n4] = object3;
        zzdp2.zzc[n4] = object4;
        zzdp2.zzg = n15;
        this.zzc();
        return null;
    }

    public final Object remove(Object object) {
        Object object2 = this.zzb();
        if (object2 != null) {
            return object2.remove(object);
        }
        if ((object = this.zzb(object)) == (object2 = zzd)) {
            object = null;
        }
        return object;
    }

    public final int size() {
        Map map2 = this.zzb();
        if (map2 != null) {
            return map2.size();
        }
        return this.zzg;
    }

    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            this.zzj = collection = new zzdx(this);
        }
        return collection;
    }

    public final int zza(int n3) {
        int n4 = this.zzg;
        if (++n3 < n4) {
            return n3;
        }
        return -1;
    }

    public final void zza(int n3, int n4) {
        int n7 = this.size();
        int n8 = n7 + -1;
        int n10 = 0;
        Object object = null;
        int n14 = 0;
        int[] nArray = null;
        if (n3 < n8) {
            int n15;
            Object object2;
            Object object3;
            Object[] objectArray = this.zzb;
            objectArray[n3] = object3 = objectArray[n8];
            Object[] objectArray2 = this.zzc;
            objectArray2[n3] = object2 = objectArray2[n8];
            objectArray[n8] = null;
            objectArray2[n8] = null;
            nArray = this.zza;
            nArray[n3] = n15 = nArray[n8];
            nArray[n8] = 0;
            object = this.zze;
            n8 = zzec.zza(object3) & n4;
            n10 = zzea.zza(object, n8);
            if (n10 == n7) {
                Object object4 = this.zze;
                zzea.zza(object4, n8, ++n3);
                return;
            }
            while (true) {
                int[] nArray2;
                if ((n15 = (n14 = (nArray2 = this.zza)[n10 += -1]) & n4) == n7) {
                    ++n3;
                    nArray2[n10] = n3 = zzea.zza(n14, n3, n4);
                    return;
                }
                n10 = n15;
            }
        }
        this.zzb[n3] = null;
        this.zzc[n3] = null;
        this.zza[n3] = 0;
    }

    public final boolean zza() {
        Object object = this.zze;
        return object == null;
    }

    public final Map zzb() {
        Object object = this.zze;
        boolean bl2 = object instanceof Map;
        if (bl2) {
            return (Map)object;
        }
        return null;
    }

    public final void zzc() {
        int n3;
        this.zzf = n3 = this.zzf + 32;
    }

    public final int zzd() {
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return -1;
        }
        return 0;
    }

    public final Iterator zze() {
        Object object = this.zzb();
        if (object != null) {
            return object.keySet().iterator();
        }
        object = new zzds(this);
        return object;
    }

    public final Iterator zzf() {
        Object object = this.zzb();
        if (object != null) {
            return object.entrySet().iterator();
        }
        object = new zzdr(this);
        return object;
    }

    public final Iterator zzg() {
        Object object = this.zzb();
        if (object != null) {
            return object.values().iterator();
        }
        object = new zzdu(this);
        return object;
    }
}

