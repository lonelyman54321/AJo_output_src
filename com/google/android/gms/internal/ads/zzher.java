/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzham;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhcc;
import com.google.android.gms.internal.ads.zzhcd;
import com.google.android.gms.internal.ads.zzhdg;
import com.google.android.gms.internal.ads.zzhfi;
import java.util.Arrays;

public final class zzher {
    private static final zzher zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzher zzher2;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        zza = zzher2 = new zzher(0, nArray, objectArray, false);
    }

    private zzher() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private zzher(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.zze = -1;
        this.zzb = n3;
        this.zzc = nArray;
        this.zzd = objectArray;
        this.zzf = bl2;
    }

    public static zzher zzc() {
        return zza;
    }

    public static zzher zze(zzher zzher2, zzher zzher3) {
        int n3 = zzher2.zzb;
        int n4 = zzher3.zzb;
        int[] nArray = Arrays.copyOf(zzher2.zzc, n3 += n4);
        Object[] objectArray = zzher3.zzc;
        int n7 = zzher2.zzb;
        int n8 = zzher3.zzb;
        System.arraycopy(objectArray, 0, nArray, n7, n8);
        objectArray = Arrays.copyOf(zzher2.zzd, n3);
        Object[] objectArray2 = zzher3.zzd;
        int n10 = zzher2.zzb;
        int n14 = zzher3.zzb;
        System.arraycopy(objectArray2, 0, objectArray, n10, n14);
        zzher2 = new zzher(n3, nArray, objectArray, true);
        return zzher2;
    }

    public static zzher zzf() {
        zzher zzher2 = new zzher();
        return zzher2;
    }

    private final void zzn(int n3) {
        Object[] objectArray = this.zzc;
        int n4 = objectArray.length;
        if (n3 > n4) {
            n4 = this.zzb;
            int n7 = n4 / 2 + n4;
            if (n7 >= n3) {
                n3 = n7;
            }
            if (n3 < (n4 = 8)) {
                n3 = 8;
            }
            this.zzc = objectArray = Arrays.copyOf(objectArray, n3);
            objectArray = this.zzd;
            int[] nArray = Arrays.copyOf(objectArray, n3);
            this.zzd = nArray;
        }
    }

    public final boolean equals(Object objectArray) {
        block8: {
            boolean bl2 = true;
            if (this == objectArray) {
                return bl2;
            }
            if (objectArray == null) {
                return false;
            }
            int n3 = objectArray instanceof zzher;
            if (n3 == 0) {
                return false;
            }
            objectArray = (zzher)objectArray;
            n3 = this.zzb;
            int n4 = objectArray.zzb;
            if (n3 == n4) {
                int n7;
                int[] nArray = this.zzc;
                int[] nArray2 = objectArray.zzc;
                Object object = null;
                for (n7 = 0; n7 < n3; ++n7) {
                    int n8 = nArray[n7];
                    int n10 = nArray2[n7];
                    if (n8 == n10) {
                        continue;
                    }
                    break block8;
                }
                Object[] objectArray2 = this.zzd;
                objectArray = objectArray.zzd;
                n4 = this.zzb;
                nArray2 = null;
                for (int i3 = 0; i3 < n4; ++i3) {
                    object = objectArray2[i3];
                    Object object2 = objectArray[i3];
                    n7 = (int)(object.equals(object2) ? 1 : 0);
                    if (n7 != 0) {
                        continue;
                    }
                    break block8;
                }
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.zzb;
        int n7 = n4 + 527;
        int[] nArray = this.zzc;
        int n8 = 0;
        int n10 = 17;
        Object object = null;
        int n14 = 17;
        for (n3 = 0; n3 < n4; ++n3) {
            n14 *= 31;
            int n15 = nArray[n3];
            n14 += n15;
        }
        n7 = (n7 * 31 + n14) * 31;
        Object[] objectArray = this.zzd;
        int n16 = this.zzb;
        while (n8 < n16) {
            n10 *= 31;
            object = objectArray[n8];
            n3 = object.hashCode();
            n10 += n3;
            ++n8;
        }
        return n7 + n10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int zza() {
        int n3 = this.zze;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = 0;
        IllegalStateException illegalStateException = null;
        n4 = 0;
        zzhcc zzhcc2 = null;
        while (true) {
            block10: {
                int n7;
                int n8;
                block9: {
                    Object object;
                    block4: {
                        block8: {
                            block5: {
                                int n10;
                                block6: {
                                    block7: {
                                        if (n3 >= (n8 = this.zzb)) {
                                            this.zze = n4;
                                            return n4;
                                        }
                                        int[] nArray = this.zzc;
                                        n8 = nArray[n3];
                                        n7 = n8 >>> 3;
                                        if ((n8 &= 7) == 0) break block4;
                                        n10 = 1;
                                        if (n8 == n10) break block5;
                                        n10 = 2;
                                        if (n8 == n10) break block6;
                                        n10 = 3;
                                        if (n8 == n10) break block7;
                                        n10 = 5;
                                        if (n8 != n10) {
                                            zzhcc2 = zzhcd.zza();
                                            illegalStateException = new IllegalStateException(zzhcc2);
                                            throw illegalStateException;
                                        }
                                        n8 = n7 << 3;
                                        object = (Integer)this.zzd[n3];
                                        object.getClass();
                                        n8 = zzhat.zzD(n8) + 4;
                                        break block8;
                                    }
                                    n8 = zzhat.zzD(n7 << 3);
                                    n8 += n8;
                                    object = (zzher)this.zzd[n3];
                                    n7 = ((zzher)object).zza();
                                    break block9;
                                }
                                n8 = n7 << 3;
                                object = (zzhac)this.zzd[n3];
                                n8 = zzhat.zzD(n8);
                                n7 = ((zzhac)object).zzd();
                                n4 = n10 = zzhat.zzD(n7) + n7 + n8 + n4;
                                break block10;
                            }
                            n8 = n7 << 3;
                            object = (Long)this.zzd[n3];
                            object.getClass();
                            n8 = zzhat.zzD(n8) + 8;
                        }
                        n4 = n8 += n4;
                        break block10;
                    }
                    n8 = n7 << 3;
                    object = (Long)this.zzd[n3];
                    long l2 = (Long)object;
                    n8 = zzhat.zzD(n8);
                    n7 = zzhat.zzE(l2);
                }
                n4 = n7 = n7 + n8 + n4;
            }
            ++n3;
        }
    }

    public final int zzb() {
        int n3 = this.zze;
        int n4 = -1;
        if (n3 == n4) {
            int n7;
            n4 = 0;
            for (n3 = 0; n3 < (n7 = this.zzb); ++n3) {
                int[] nArray = this.zzc;
                n7 = nArray[n3] >>> 3;
                zzhac zzhac2 = (zzhac)this.zzd[n3];
                int n8 = zzhat.zzD(8);
                n8 += n8;
                int n10 = zzhat.zzD(16);
                n7 = zzhat.zzD(n7) + n10;
                n10 = zzhat.zzD(24);
                int n14 = zzhac2.zzd();
                n14 = rk3_1.a(n14, n14, n10);
                n8 = n8 + n7 + n14;
                n4 += n8;
            }
            this.zze = n4;
            return n4;
        }
        return n3;
    }

    public final zzher zzd(zzher zzher2) {
        zzher zzher3 = zza;
        int n3 = zzher2.equals(zzher3);
        if (n3 != 0) {
            return this;
        }
        this.zzg();
        n3 = this.zzb;
        int n4 = zzher2.zzb;
        this.zzn(n3 += n4);
        Object[] objectArray = zzher2.zzc;
        Object[] objectArray2 = this.zzc;
        int n7 = this.zzb;
        int n8 = zzher2.zzb;
        System.arraycopy(objectArray, 0, objectArray2, n7, n8);
        objectArray = zzher2.zzd;
        objectArray2 = this.zzd;
        n7 = this.zzb;
        int n10 = zzher2.zzb;
        System.arraycopy(objectArray, 0, objectArray2, n7, n10);
        this.zzb = n3;
        return this;
    }

    public final void zzg() {
        boolean bl2 = this.zzf;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void zzh() {
        boolean bl2 = this.zzf;
        if (bl2) {
            bl2 = false;
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.zzb); ++i3) {
            n4 = this.zzc[i3] >>> 3;
            String string2 = String.valueOf(n4);
            Object object = this.zzd[i3];
            zzhdg.zzb(stringBuilder, n3, string2, object);
        }
    }

    public final void zzj(int n3, Object object) {
        this.zzg();
        int n4 = this.zzb + 1;
        this.zzn(n4);
        int[] nArray = this.zzc;
        int n7 = this.zzb;
        nArray[n7] = n3;
        this.zzd[n7] = object;
        this.zzb = ++n7;
    }

    public final void zzk(zzhfi zzhfi2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.zzb); ++i3) {
            int[] nArray = this.zzc;
            n3 = nArray[i3] >>> 3;
            Object object = this.zzd[i3];
            zzhfi2.zzw(n3, object);
        }
    }

    public final void zzl(zzhfi object) {
        int n3 = this.zzb;
        if (n3 != 0) {
            int n4;
            zzhcc zzhcc2 = null;
            for (n3 = 0; n3 < (n4 = this.zzb); ++n3) {
                long l2;
                int[] nArray = this.zzc;
                n4 = nArray[n3];
                Object object2 = this.zzd[n3];
                int n7 = n4 & 7;
                int n8 = 3;
                n4 >>>= n8;
                if (n7 != 0) {
                    int n10 = 1;
                    if (n7 != n10) {
                        n10 = 2;
                        if (n7 != n10) {
                            if (n7 != n8) {
                                n8 = 5;
                                if (n7 == n8) {
                                    object2 = (Integer)object2;
                                    int n14 = (Integer)object2;
                                    object.zzk(n4, n14);
                                    continue;
                                }
                                zzhcc2 = zzhcd.zza();
                                object = new RuntimeException(zzhcc2);
                                throw object;
                            }
                            object.zzF(n4);
                            object2 = (zzher)object2;
                            ((zzher)object2).zzl((zzhfi)object);
                            object.zzh(n4);
                            continue;
                        }
                        object2 = (zzhac)object2;
                        object.zzd(n4, (zzhac)object2);
                        continue;
                    }
                    object2 = (Long)object2;
                    l2 = (Long)object2;
                    object.zzm(n4, l2);
                    continue;
                }
                object2 = (Long)object2;
                l2 = (Long)object2;
                object.zzt(n4, l2);
            }
        }
    }

    public final boolean zzm(int n3, zzham object) {
        this.zzg();
        int bl2 = n3 & 7;
        int bl3 = 1;
        if (bl2 != 0) {
            if (bl2 != bl3) {
                int bl4 = 2;
                if (bl2 != bl4) {
                    int n4;
                    int n7 = 4;
                    int n8 = 3;
                    if (bl2 != n8) {
                        if (bl2 != n7) {
                            int n10 = 5;
                            if (bl2 == n10) {
                                object = ((zzham)object).zzg();
                                this.zzj(n3, object);
                                return bl3 != 0;
                            }
                            throw zzhcd.zza();
                        }
                        return false;
                    }
                    zzher zzher2 = new zzher();
                    while ((n4 = ((zzham)object).zzm()) != 0 && (n4 = (int)(zzher2.zzm(n4, (zzham)object) ? 1 : 0)) != 0) {
                    }
                    int n14 = n3 >>> 3 << 3;
                    int n15 = n7 | n14;
                    ((zzham)object).zzz(n15);
                    this.zzj(n3, zzher2);
                    return bl3 != 0;
                }
                object = ((zzham)object).zzw();
                this.zzj(n3, object);
                return bl3 != 0;
            }
            object = ((zzham)object).zzo();
            this.zzj(n3, object);
            return bl3 != 0;
        }
        object = ((zzham)object).zzp();
        this.zzj(n3, object);
        return bl3 != 0;
    }
}

