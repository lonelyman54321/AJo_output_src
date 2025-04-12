/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfya;
import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzgaf;
import com.google.android.gms.internal.ads.zzgai;
import com.google.android.gms.internal.ads.zzgak;
import com.google.android.gms.internal.ads.zzgam;
import com.google.android.gms.internal.ads.zzgau;
import com.google.android.gms.internal.ads.zzgea;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class zzgal
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

    public zzgal() {
        this.zzp(3);
    }

    public zzgal(int n3) {
        this.zzp(8);
    }

    private final int[] zzA() {
        int[] nArray = this.zza;
        Objects.requireNonNull(nArray);
        return nArray;
    }

    private final Object[] zzB() {
        Object[] objectArray = this.zzb;
        Objects.requireNonNull(objectArray);
        return objectArray;
    }

    private final Object[] zzC() {
        Object[] objectArray = this.zzc;
        Objects.requireNonNull(objectArray);
        return objectArray;
    }

    public static /* bridge */ /* synthetic */ int zza(zzgal zzgal2) {
        return zzgal2.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzgal zzgal2) {
        return zzgal2.zzg;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzgal zzgal2) {
        return zzgal2.zzv();
    }

    public static /* bridge */ /* synthetic */ int zzd(zzgal zzgal2, Object object) {
        return zzgal2.zzw(object);
    }

    public static /* synthetic */ Object zzg(zzgal zzgal2, int n3) {
        return zzgal2.zzB()[n3];
    }

    public static /* bridge */ /* synthetic */ Object zzh(zzgal zzgal2, Object object) {
        return zzgal2.zzy(object);
    }

    public static /* synthetic */ Object zzi(zzgal object) {
        object = ((zzgal)object).zze;
        Objects.requireNonNull(object);
        return object;
    }

    public static /* synthetic */ Object zzj(zzgal zzgal2, int n3) {
        return zzgal2.zzC()[n3];
    }

    public static /* bridge */ /* synthetic */ Object zzk() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzgal zzgal2, int n3) {
        zzgal2.zzg = n3;
    }

    public static /* synthetic */ void zzn(zzgal zzgal2, int n3, Object object) {
        zzgal2.zzC()[n3] = object;
    }

    public static /* bridge */ /* synthetic */ int[] zzs(zzgal zzgal2) {
        return zzgal2.zzA();
    }

    public static /* bridge */ /* synthetic */ Object[] zzt(zzgal zzgal2) {
        return zzgal2.zzB();
    }

    public static /* bridge */ /* synthetic */ Object[] zzu(zzgal zzgal2) {
        return zzgal2.zzC();
    }

    private final int zzv() {
        int n3 = this.zzf & 0x1F;
        return (1 << n3) + -1;
    }

    private final int zzw(Object object) {
        int n3 = this.zzr();
        int n4 = -1;
        if (n3 != 0) {
            return n4;
        }
        n3 = zzgau.zzb(object);
        int n7 = this.zzv();
        Object object2 = this.zze;
        Objects.requireNonNull(object2);
        int n8 = n3 & n7;
        int n10 = zzgam.zzc(object2, n8);
        if (n10 != 0) {
            int n14;
            n8 = ~n7;
            n3 &= n8;
            do {
                Object object3;
                int[] nArray;
                int n15;
                if ((n15 = (n14 = (nArray = this.zzA())[n10 += n4]) & n8) != n3 || (n15 = (int)(zzfya.zza(object, object3 = this.zzB()[n10]) ? 1 : 0)) == 0) continue;
                return n10;
            } while ((n10 = n14 & n7) != 0);
        }
        return n4;
    }

    private final int zzx(int n3, int n4, int n7, int n8) {
        int n10 = n4 + -1;
        Object object = zzgam.zzd(n4);
        if (n8 != 0) {
            zzgam.zze(object, n7 &= n10, ++n8);
        }
        Object object2 = this.zze;
        Objects.requireNonNull(object2);
        int[] nArray = this.zzA();
        for (int i3 = 0; i3 <= n3; ++i3) {
            int n14 = zzgam.zzc(object2, i3);
            while (n14 != 0) {
                int n15 = n14 + -1;
                int n16 = nArray[n15];
                int n17 = ~n3 & n16 | i3;
                int n18 = n17 & n10;
                int n19 = zzgam.zzc(object, n18);
                zzgam.zze(object, n18, n14);
                n14 = ~n10;
                n18 = n19 & n10;
                nArray[n15] = n14 = n14 & n17 | n18;
                n14 = n16 & n3;
            }
        }
        this.zze = object;
        this.zzz(n10);
        return n10;
    }

    private final Object zzy(Object object) {
        int n3 = this.zzr();
        if (n3 == 0) {
            n3 = this.zzv();
            Object object2 = this.zze;
            Objects.requireNonNull(object2);
            int[] nArray = this.zzA();
            Object[] objectArray = this.zzB();
            Object object3 = null;
            int n4 = zzgam.zzb(object, null, n3, object2, nArray, objectArray, null);
            int n7 = -1;
            if (n4 != n7) {
                object3 = this.zzC()[n4];
                this.zzq(n4, n3);
                this.zzg = n4 = this.zzg + n7;
                this.zzo();
                return object3;
            }
        }
        return zzd;
    }

    private final void zzz(int n3) {
        n3 = Integer.numberOfLeadingZeros(n3);
        n3 = 32 - n3;
        int n4 = this.zzf & 0xFFFFFFE0;
        this.zzf = n3 = n3 & 0x1F | n4;
    }

    public final void clear() {
        boolean bl2 = this.zzr();
        if (bl2) {
            return;
        }
        this.zzo();
        Object object = this.zzl();
        int n3 = 0;
        if (object != null) {
            int n4;
            this.zzf = n4 = zzgea.zzc(this.size(), 3, -1 >>> 2);
            object.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        object = this.zzB();
        int n7 = this.zzg;
        Arrays.fill(object, 0, n7, null);
        object = this.zzC();
        n7 = this.zzg;
        Arrays.fill(object, 0, n7, null);
        object = this.zze;
        Objects.requireNonNull(object);
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
        object = this.zzA();
        n3 = this.zzg;
        Arrays.fill((int[])object, 0, n3, 0);
        this.zzg = 0;
    }

    public final boolean containsKey(Object object) {
        block4: {
            int n3;
            block3: {
                int n4;
                block2: {
                    Map map2 = this.zzl();
                    if (map2 == null) break block2;
                    n3 = map2.containsKey(object);
                    break block3;
                }
                n3 = this.zzw(object);
                if (n3 != (n4 = -1)) break block4;
                n3 = 0;
                object = null;
            }
            return n3 != 0;
        }
        return true;
    }

    public final boolean containsValue(Object object) {
        Map map2 = this.zzl();
        if (map2 == null) {
            int n3;
            map2 = null;
            for (int i3 = 0; i3 < (n3 = this.zzg); ++i3) {
                Object object2 = this.zzC()[i3];
                n3 = (int)(zzfya.zza(object, object2) ? 1 : 0);
                if (n3 == 0) continue;
                return true;
            }
            return false;
        }
        return map2.containsValue(object);
    }

    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            this.zzi = set = new zzgaf(this);
        }
        return set;
    }

    public final Object get(Object object) {
        int n3;
        Map map2 = this.zzl();
        if (map2 != null) {
            return map2.get(object);
        }
        int n4 = this.zzw(object);
        if (n4 == (n3 = -1)) {
            return null;
        }
        return this.zzC()[n4];
    }

    public final boolean isEmpty() {
        int n3 = this.size();
        return n3 == 0;
    }

    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            this.zzh = set = new zzgai(this);
        }
        return set;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object put(Object object, Object object2) {
        Map map2;
        int n3;
        int n4;
        float f5;
        int n7;
        Object object3;
        zzgal zzgal2 = this;
        Object object4 = object;
        Object object5 = object2;
        int n8 = this.zzr();
        if (n8 != 0) {
            Object object6;
            n8 = this.zzr();
            object3 = "Arrays already allocated";
            zzfyg.zzk(n8 != 0, object3);
            n8 = this.zzf;
            n7 = n8 + 1;
            f5 = 2.8E-45f;
            n7 = Math.max(n7, 2);
            n4 = Integer.highestOneBit(n7);
            double d2 = n4;
            n3 = (int)d2;
            if (n7 > n3 && (n4 += n4) <= 0) {
                n4 = 0x40000000;
                f5 = 2.0f;
            }
            n7 = Math.max(4, n4);
            zzgal2.zze = object6 = zzgam.zzd(n7);
            zzgal2.zzz(n7 += -1);
            object3 = new int[n8];
            zzgal2.zza = (int[])object3;
            object3 = new Object[n8];
            zzgal2.zzb = object3;
            Object[] objectArray = new Object[n8];
            zzgal2.zzc = objectArray;
        }
        if ((map2 = this.zzl()) != null) {
            return map2.put(object4, object5);
        }
        int[] nArray = this.zzA();
        object3 = this.zzB();
        Object[] objectArray = this.zzC();
        n3 = zzgal2.zzg;
        int n10 = n3 + 1;
        int n14 = zzgau.zzb(object);
        int n15 = this.zzv();
        int n16 = n14 & n15;
        Object object7 = zzgal2.zze;
        Objects.requireNonNull(object7);
        int n17 = zzgam.zzc(object7, n16);
        if (n17 == 0) {
            if (n10 > n15) {
                n8 = zzgam.zza(n15);
                n15 = zzgal2.zzx(n15, n8, n14, n3);
            } else {
                Object object8 = zzgal2.zze;
                Objects.requireNonNull(object8);
                zzgam.zze(object8, n16, n10);
            }
        } else {
            n16 = ~n15;
            int n18 = n14 & n16;
            int n19 = 0;
            while (true) {
                Object object9;
                int n20;
                int n21;
                int n22;
                if ((n22 = (n21 = nArray[n17 += -1]) & n16) == n18 && (n20 = (int)(zzfya.zza(object4, object9 = object3[n17]) ? 1 : 0)) != 0) {
                    object4 = objectArray[n17];
                    objectArray[n17] = object5;
                    return object4;
                }
                n20 = n21 & n15;
                n21 = 1;
                ++n19;
                if (n20 == 0) {
                    n7 = 9;
                    if (n19 >= n7) {
                        n8 = this.zzv() + 1;
                        n4 = 1065353216;
                        f5 = 1.0f;
                        object3 = new LinkedHashMap(n8, f5);
                        n8 = this.zze();
                        while (true) {
                            if (n8 < 0) {
                                zzgal2.zze = object3;
                                zzgal2.zza = null;
                                zzgal2.zzb = null;
                                zzgal2.zzc = null;
                                this.zzo();
                                return object3.put(object4, object5);
                            }
                            Object object10 = this.zzB()[n8];
                            Object object11 = this.zzC()[n8];
                            object3.put(object10, object11);
                            n8 = zzgal2.zzf(n8);
                        }
                    }
                    if (n10 > n15) {
                        n8 = zzgam.zza(n15);
                        n15 = zzgal2.zzx(n15, n8, n14, n3);
                        break;
                    }
                    nArray[n17] = n7 = n10 & n15 | n22;
                    break;
                }
                n17 = n20;
            }
        }
        int[] nArray2 = this.zzA();
        n8 = nArray2.length;
        if (n10 > n8) {
            n7 = n8 >>> 1;
            n17 = 1;
            n7 = Math.max(n17, n7) + n8 | n17;
            n4 = -1 >>> 2;
            f5 = 1.9999999f;
            if ((n7 = Math.min(n4, n7)) != n8) {
                int[] nArray3 = Arrays.copyOf(this.zzA(), n7);
                zzgal2.zza = nArray3;
                Object[] objectArray2 = Arrays.copyOf(this.zzB(), n7);
                zzgal2.zzb = objectArray2;
                Object[] objectArray3 = Arrays.copyOf(this.zzC(), n7);
                zzgal2.zzc = objectArray3;
            }
        }
        this.zzA()[n3] = n8 = ~n15 & n14;
        this.zzB()[n3] = object4;
        this.zzC()[n3] = object5;
        zzgal2.zzg = n10;
        this.zzo();
        return null;
    }

    public final Object remove(Object object) {
        Object object2 = this.zzl();
        if (object2 != null) {
            return object2.remove(object);
        }
        if ((object = this.zzy(object)) == (object2 = zzd)) {
            object = null;
        }
        return object;
    }

    public final int size() {
        Map map2 = this.zzl();
        int n3 = map2 != null ? map2.size() : this.zzg;
        return n3;
    }

    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            this.zzj = collection = new zzgak(this);
        }
        return collection;
    }

    public final int zze() {
        boolean bl2 = this.isEmpty();
        if (bl2) {
            return -1;
        }
        return 0;
    }

    public final int zzf(int n3) {
        int n4 = this.zzg;
        if (++n3 < n4) {
            return n3;
        }
        return -1;
    }

    public final Map zzl() {
        Object object = this.zze;
        boolean bl2 = object instanceof Map;
        if (bl2) {
            return (Map)object;
        }
        return null;
    }

    public final void zzo() {
        int n3;
        this.zzf = n3 = this.zzf + 32;
    }

    public final void zzp(int n3) {
        this.zzf = n3 = zzgea.zzc(n3, 1, -1 >>> 2);
    }

    public final void zzq(int n3, int n4) {
        Object object = this.zze;
        Objects.requireNonNull(object);
        int[] nArray = this.zzA();
        Object[] objectArray = this.zzB();
        Object[] objectArray2 = this.zzC();
        int n7 = this.size();
        int n8 = n7 + -1;
        if (n3 < n8) {
            int n10;
            Object object2;
            Object object3;
            int n14 = n3 + 1;
            objectArray[n3] = object3 = objectArray[n8];
            objectArray2[n3] = object2 = objectArray2[n8];
            objectArray[n8] = null;
            objectArray2[n8] = null;
            nArray[n3] = n10 = nArray[n8];
            nArray[n8] = 0;
            n3 = zzgau.zzb(object3) & n4;
            n10 = zzgam.zzc(object, n3);
            if (n10 != n7) {
                int n15;
                while ((n15 = (n3 = nArray[n10 += -1]) & n4) != n7) {
                    n10 = n15;
                }
                n15 = ~n4;
                n3 &= n15;
                nArray[n10] = n3 |= (n4 &= n14);
                return;
            }
            zzgam.zze(object, n3, n14);
            return;
        }
        objectArray[n3] = null;
        objectArray2[n3] = null;
        nArray[n3] = 0;
    }

    public final boolean zzr() {
        Object object = this.zze;
        return object == null;
    }
}

