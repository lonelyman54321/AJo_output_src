/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zziy;
import com.google.android.gms.internal.measurement.zzjn;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzlr;
import com.google.android.gms.internal.measurement.zznl;
import java.util.Arrays;

public final class zzmx {
    private static final zzmx zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzmx zzmx2;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        zza = zzmx2 = new zzmx(0, nArray, objectArray, false);
    }

    private zzmx() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private zzmx(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.zze = -1;
        this.zzb = n3;
        this.zzc = nArray;
        this.zzd = objectArray;
        this.zzf = bl2;
    }

    public static zzmx zza(zzmx zzmx2, zzmx zzmx3) {
        int n3 = zzmx2.zzb;
        int n4 = zzmx3.zzb;
        int[] nArray = Arrays.copyOf(zzmx2.zzc, n3 += n4);
        Object[] objectArray = zzmx3.zzc;
        int n7 = zzmx2.zzb;
        int n8 = zzmx3.zzb;
        System.arraycopy(objectArray, 0, nArray, n7, n8);
        objectArray = Arrays.copyOf(zzmx2.zzd, n3);
        Object[] objectArray2 = zzmx3.zzd;
        int n10 = zzmx2.zzb;
        int n14 = zzmx3.zzb;
        System.arraycopy(objectArray2, 0, objectArray, n10, n14);
        zzmx2 = new zzmx(n3, nArray, objectArray, true);
        return zzmx2;
    }

    private final void zza(int n3) {
        Object[] objectArray = this.zzc;
        int n4 = objectArray.length;
        if (n3 > n4) {
            n4 = this.zzb;
            int n7 = n4 / 2 + n4;
            if (n7 >= n3) {
                n3 = n7;
            }
            n4 = 8;
            if (n3 < n4) {
                n3 = 8;
            }
            this.zzc = objectArray = Arrays.copyOf(objectArray, n3);
            objectArray = this.zzd;
            int[] nArray = Arrays.copyOf(objectArray, n3);
            this.zzd = nArray;
        }
    }

    private static void zza(int n3, Object object, zznl zznl2) {
        int n4 = n3 >>> 3;
        if ((n3 &= 7) != 0) {
            int n7 = 1;
            if (n3 != n7) {
                int n8 = 2;
                if (n3 != n8) {
                    n8 = 3;
                    if (n3 != n8) {
                        n7 = 5;
                        if (n3 == n7) {
                            n3 = (Integer)object;
                            zznl2.zzb(n4, n3);
                            return;
                        }
                        object = zzkp.zza();
                        RuntimeException runtimeException = new RuntimeException((Throwable)object);
                        throw runtimeException;
                    }
                    n3 = zznl2.zza();
                    if (n3 == n7) {
                        zznl2.zzb(n4);
                        ((zzmx)object).zzb(zznl2);
                        zznl2.zza(n4);
                        return;
                    }
                    zznl2.zza(n4);
                    ((zzmx)object).zzb(zznl2);
                    zznl2.zzb(n4);
                    return;
                }
                object = (zziy)object;
                zznl2.zza(n4, (zziy)object);
                return;
            }
            long l2 = (Long)object;
            zznl2.zza(n4, l2);
            return;
        }
        long l3 = (Long)object;
        zznl2.zzb(n4, l3);
    }

    public static zzmx zzc() {
        return zza;
    }

    public static zzmx zzd() {
        zzmx zzmx2 = new zzmx();
        return zzmx2;
    }

    private final void zzf() {
        boolean bl2 = this.zzf;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
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
            int n3 = objectArray instanceof zzmx;
            if (n3 == 0) {
                return false;
            }
            objectArray = (zzmx)objectArray;
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
        int n7 = (n4 + 527) * 31;
        int[] nArray = this.zzc;
        int n8 = 17;
        int n10 = 0;
        Object object = null;
        int n14 = 17;
        for (n3 = 0; n3 < n4; ++n3) {
            n14 *= 31;
            int n15 = nArray[n3];
            n14 += n15;
        }
        n7 = (n7 + n14) * 31;
        Object[] objectArray = this.zzd;
        int n16 = this.zzb;
        while (n10 < n16) {
            n8 *= 31;
            object = objectArray[n10];
            n3 = object.hashCode();
            n8 += n3;
            ++n10;
        }
        return n7 + n8;
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
        zzko zzko2 = null;
        while (true) {
            block9: {
                block8: {
                    long l2;
                    int n7;
                    Object object;
                    int n8;
                    block4: {
                        block5: {
                            block6: {
                                int n10;
                                block7: {
                                    if (n3 >= (n8 = this.zzb)) {
                                        this.zze = n4;
                                        return n4;
                                    }
                                    object = this.zzc;
                                    n8 = object[n3];
                                    n7 = n8 >>> 3;
                                    if ((n8 &= 7) == 0) break block4;
                                    n10 = 1;
                                    if (n8 == n10) break block5;
                                    int n14 = 2;
                                    if (n8 == n14) break block6;
                                    n14 = 3;
                                    if (n8 == n14) break block7;
                                    n10 = 5;
                                    if (n8 != n10) {
                                        zzko2 = zzkp.zza();
                                        illegalStateException = new IllegalStateException(zzko2);
                                        throw illegalStateException;
                                    }
                                    object = (Integer)this.zzd[n3];
                                    n8 = (Integer)object;
                                    n8 = zzjn.zzb(n7, n8);
                                    break block8;
                                }
                                n8 = zzjn.zzf(n7) << n10;
                                zzmx zzmx2 = (zzmx)this.zzd[n3];
                                n4 = n7 = zzmx2.zza() + n8 + n4;
                                break block9;
                            }
                            object = (zziy)this.zzd[n3];
                            n8 = zzjn.zza(n7, (zziy)object);
                            break block8;
                        }
                        object = (Long)this.zzd[n3];
                        l2 = (Long)object;
                        n8 = zzjn.zza(n7, l2);
                        break block8;
                    }
                    object = (Long)this.zzd[n3];
                    l2 = (Long)object;
                    n8 = zzjn.zze(n7, l2);
                }
                n4 = n8 += n4;
            }
            ++n3;
        }
    }

    public final zzmx zza(zzmx zzmx2) {
        zzmx zzmx3 = zza;
        int n3 = zzmx2.equals(zzmx3);
        if (n3 != 0) {
            return this;
        }
        this.zzf();
        n3 = this.zzb;
        int n4 = zzmx2.zzb;
        this.zza(n3 += n4);
        Object[] objectArray = zzmx2.zzc;
        Object[] objectArray2 = this.zzc;
        int n7 = this.zzb;
        int n8 = zzmx2.zzb;
        System.arraycopy(objectArray, 0, objectArray2, n7, n8);
        objectArray = zzmx2.zzd;
        objectArray2 = this.zzd;
        n7 = this.zzb;
        int n10 = zzmx2.zzb;
        System.arraycopy(objectArray, 0, objectArray2, n7, n10);
        this.zzb = n3;
        return this;
    }

    public final void zza(int n3, Object object) {
        this.zzf();
        int n4 = this.zzb + 1;
        this.zza(n4);
        int[] nArray = this.zzc;
        int n7 = this.zzb;
        nArray[n7] = n3;
        this.zzd[n7] = object;
        this.zzb = ++n7;
    }

    public final void zza(zznl zznl2) {
        int n3;
        int n4 = zznl2.zza();
        if (n4 == (n3 = 2)) {
            for (n4 = this.zzb + -1; n4 >= 0; n4 += -1) {
                int[] nArray = this.zzc;
                n3 = nArray[n4] >>> 3;
                Object object = this.zzd[n4];
                zznl2.zza(n3, object);
            }
            return;
        }
        for (n4 = 0; n4 < (n3 = this.zzb); ++n4) {
            int[] nArray = this.zzc;
            n3 = nArray[n4] >>> 3;
            Object object = this.zzd[n4];
            zznl2.zza(n3, object);
        }
    }

    public final void zza(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.zzb); ++i3) {
            n4 = this.zzc[i3] >>> 3;
            String string2 = String.valueOf(n4);
            Object object = this.zzd[i3];
            zzlr.zza(stringBuilder, n3, string2, object);
        }
    }

    public final int zzb() {
        int n3;
        int n4 = this.zze;
        int n7 = -1;
        if (n4 != n7) {
            return n4;
        }
        n7 = 0;
        for (n4 = 0; n4 < (n3 = this.zzb); ++n4) {
            int[] nArray = this.zzc;
            n3 = nArray[n4] >>> 3;
            zziy zziy2 = (zziy)this.zzd[n4];
            n3 = zzjn.zzb(n3, zziy2);
            n7 += n3;
        }
        this.zze = n7;
        return n7;
    }

    public final void zzb(zznl zznl2) {
        int n3;
        int n4 = this.zzb;
        if (n4 == 0) {
            return;
        }
        n4 = zznl2.zza();
        if (n4 == (n3 = 1)) {
            for (n4 = 0; n4 < (n3 = this.zzb); ++n4) {
                int[] nArray = this.zzc;
                n3 = nArray[n4];
                Object object = this.zzd[n4];
                zzmx.zza(n3, object, zznl2);
            }
            return;
        }
        for (n4 = this.zzb - n3; n4 >= 0; n4 += -1) {
            int[] nArray = this.zzc;
            n3 = nArray[n4];
            Object object = this.zzd[n4];
            zzmx.zza(n3, object, zznl2);
        }
    }

    public final void zze() {
        boolean bl2 = this.zzf;
        if (bl2) {
            bl2 = false;
            this.zzf = false;
        }
    }
}

