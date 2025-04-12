/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzjk;
import com.google.android.gms.internal.vision.zzjn;
import com.google.android.gms.internal.vision.zzkp;
import com.google.android.gms.internal.vision.zzmq;
import com.google.android.gms.internal.vision.zzmr;
import java.util.Arrays;

public final class zzlx {
    private static final zzlx zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzlx zzlx2;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        zza = zzlx2 = new zzlx(0, nArray, objectArray, false);
    }

    private zzlx() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private zzlx(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.zze = -1;
        this.zzb = n3;
        this.zzc = nArray;
        this.zzd = objectArray;
        this.zzf = bl2;
    }

    public static zzlx zza() {
        return zza;
    }

    public static zzlx zza(zzlx zzlx2, zzlx zzlx3) {
        int n3 = zzlx2.zzb;
        int n4 = zzlx3.zzb;
        int[] nArray = Arrays.copyOf(zzlx2.zzc, n3 += n4);
        Object[] objectArray = zzlx3.zzc;
        int n7 = zzlx2.zzb;
        int n8 = zzlx3.zzb;
        System.arraycopy(objectArray, 0, nArray, n7, n8);
        objectArray = Arrays.copyOf(zzlx2.zzd, n3);
        Object[] objectArray2 = zzlx3.zzd;
        int n10 = zzlx2.zzb;
        int n14 = zzlx3.zzb;
        System.arraycopy(objectArray2, 0, objectArray, n10, n14);
        zzlx2 = new zzlx(n3, nArray, objectArray, true);
        return zzlx2;
    }

    private static void zza(int n3, Object object, zzmr zzmr2) {
        int n4 = n3 >>> 3;
        if ((n3 &= 7) != 0) {
            int n7 = 1;
            if (n3 != n7) {
                n7 = 2;
                if (n3 != n7) {
                    n7 = 3;
                    if (n3 != n7) {
                        n7 = 5;
                        if (n3 == n7) {
                            n3 = (Integer)object;
                            zzmr2.zzd(n4, n3);
                            return;
                        }
                        object = zzjk.zzf();
                        RuntimeException runtimeException = new RuntimeException((Throwable)object);
                        throw runtimeException;
                    }
                    n3 = zzmr2.zza();
                    if (n3 == (n7 = zzmq.zza)) {
                        zzmr2.zza(n4);
                        ((zzlx)object).zzb(zzmr2);
                        zzmr2.zzb(n4);
                        return;
                    }
                    zzmr2.zzb(n4);
                    ((zzlx)object).zzb(zzmr2);
                    zzmr2.zza(n4);
                    return;
                }
                object = (zzht)object;
                zzmr2.zza(n4, (zzht)object);
                return;
            }
            long l2 = (Long)object;
            zzmr2.zzd(n4, l2);
            return;
        }
        long l3 = (Long)object;
        zzmr2.zza(n4, l3);
    }

    public static zzlx zzb() {
        zzlx zzlx2 = new zzlx();
        return zzlx2;
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
            int n3 = objectArray instanceof zzlx;
            if (n3 == 0) {
                return false;
            }
            objectArray = (zzlx)objectArray;
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

    public final void zza(int n3, Object object) {
        int n4 = this.zzf;
        if (n4 != 0) {
            int[] nArray;
            n4 = this.zzb;
            Object[] objectArray = this.zzc;
            int n7 = objectArray.length;
            if (n4 == n7) {
                n7 = 4;
                n7 = n4 < n7 ? 8 : n4 >> 1;
                this.zzc = objectArray = Arrays.copyOf(objectArray, n4 += n7);
                objectArray = this.zzd;
                nArray = Arrays.copyOf(objectArray, n4);
                this.zzd = nArray;
            }
            nArray = this.zzc;
            int n8 = this.zzb;
            nArray[n8] = n3;
            this.zzd[n8] = object;
            this.zzb = ++n8;
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void zza(zzmr zzmr2) {
        int n3;
        int n4 = zzmr2.zza();
        if (n4 == (n3 = zzmq.zzb)) {
            for (n4 = this.zzb + -1; n4 >= 0; n4 += -1) {
                int[] nArray = this.zzc;
                n3 = nArray[n4] >>> 3;
                Object object = this.zzd[n4];
                zzmr2.zza(n3, object);
            }
            return;
        }
        for (n4 = 0; n4 < (n3 = this.zzb); ++n4) {
            int[] nArray = this.zzc;
            n3 = nArray[n4] >>> 3;
            Object object = this.zzd[n4];
            zzmr2.zza(n3, object);
        }
    }

    public final void zza(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.zzb); ++i3) {
            n4 = this.zzc[i3] >>> 3;
            String string2 = String.valueOf(n4);
            Object object = this.zzd[i3];
            zzkp.zza(stringBuilder, n3, string2, object);
        }
    }

    public final void zzb(zzmr zzmr2) {
        int n3;
        int n4 = this.zzb;
        if (n4 == 0) {
            return;
        }
        n4 = zzmr2.zza();
        if (n4 == (n3 = zzmq.zza)) {
            for (n4 = 0; n4 < (n3 = this.zzb); ++n4) {
                int[] nArray = this.zzc;
                n3 = nArray[n4];
                Object object = this.zzd[n4];
                zzlx.zza(n3, object, zzmr2);
            }
            return;
        }
        for (n4 = this.zzb + -1; n4 >= 0; n4 += -1) {
            int[] nArray = this.zzc;
            n3 = nArray[n4];
            Object object = this.zzd[n4];
            zzlx.zza(n3, object, zzmr2);
        }
    }

    public final void zzc() {
        this.zzf = false;
    }

    public final int zzd() {
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
            zzht zzht2 = (zzht)this.zzd[n4];
            n3 = zzii.zzd(n3, zzht2);
            n7 += n3;
        }
        this.zze = n7;
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int zze() {
        int n3 = this.zze;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = 0;
        IllegalStateException illegalStateException = null;
        n4 = 0;
        zzjn zzjn2 = null;
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
                                        zzjn2 = zzjk.zzf();
                                        illegalStateException = new IllegalStateException(zzjn2);
                                        throw illegalStateException;
                                    }
                                    object = (Integer)this.zzd[n3];
                                    n8 = (Integer)object;
                                    n8 = zzii.zzi(n7, n8);
                                    break block8;
                                }
                                n8 = zzii.zze(n7) << n10;
                                zzlx zzlx2 = (zzlx)this.zzd[n3];
                                n4 = n7 = zzlx2.zze() + n8 + n4;
                                break block9;
                            }
                            object = (zzht)this.zzd[n3];
                            n8 = zzii.zzc(n7, (zzht)object);
                            break block8;
                        }
                        object = (Long)this.zzd[n3];
                        l2 = (Long)object;
                        n8 = zzii.zzg(n7, l2);
                        break block8;
                    }
                    object = (Long)this.zzd[n3];
                    l2 = (Long)object;
                    n8 = zzii.zze(n7, l2);
                }
                n4 = n8 += n4;
            }
            ++n3;
        }
    }
}

