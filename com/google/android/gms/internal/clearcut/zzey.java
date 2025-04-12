/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzcg$zzg;
import com.google.android.gms.internal.clearcut.zzco;
import com.google.android.gms.internal.clearcut.zzcp;
import com.google.android.gms.internal.clearcut.zzdr;
import com.google.android.gms.internal.clearcut.zzfr;
import java.util.Arrays;

public final class zzey {
    private static final zzey zzoz;
    private int count;
    private boolean zzfa;
    private int zzjq;
    private Object[] zzmj;
    private int[] zzpa;

    static {
        zzey zzey2;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        zzoz = zzey2 = new zzey(0, nArray, objectArray, false);
    }

    private zzey() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private zzey(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.zzjq = -1;
        this.count = n3;
        this.zzpa = nArray;
        this.zzmj = objectArray;
        this.zzfa = bl2;
    }

    public static zzey zza(zzey zzey2, zzey zzey3) {
        int n3 = zzey2.count;
        int n4 = zzey3.count;
        int[] nArray = Arrays.copyOf(zzey2.zzpa, n3 += n4);
        Object[] objectArray = zzey3.zzpa;
        int n7 = zzey2.count;
        int n8 = zzey3.count;
        System.arraycopy(objectArray, 0, nArray, n7, n8);
        objectArray = Arrays.copyOf(zzey2.zzmj, n3);
        Object[] objectArray2 = zzey3.zzmj;
        int n10 = zzey2.count;
        int n14 = zzey3.count;
        System.arraycopy(objectArray2, 0, objectArray, n10, n14);
        zzey2 = new zzey(n3, nArray, objectArray, true);
        return zzey2;
    }

    private static void zzb(int n3, Object object, zzfr zzfr2) {
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
                            zzfr2.zzf(n4, n3);
                            return;
                        }
                        object = zzco.zzbn();
                        RuntimeException runtimeException = new RuntimeException((Throwable)object);
                        throw runtimeException;
                    }
                    n3 = zzfr2.zzaj();
                    if (n3 == (n7 = zzcg$zzg.zzko)) {
                        zzfr2.zzaa(n4);
                        ((zzey)object).zzb(zzfr2);
                        zzfr2.zzab(n4);
                        return;
                    }
                    zzfr2.zzab(n4);
                    ((zzey)object).zzb(zzfr2);
                    zzfr2.zzaa(n4);
                    return;
                }
                object = (zzbb)object;
                zzfr2.zza(n4, (zzbb)object);
                return;
            }
            long l2 = (Long)object;
            zzfr2.zzc(n4, l2);
            return;
        }
        long l3 = (Long)object;
        zzfr2.zzi(n4, l3);
    }

    public static zzey zzea() {
        return zzoz;
    }

    public static zzey zzeb() {
        zzey zzey2 = new zzey();
        return zzey2;
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
            int n3 = objectArray instanceof zzey;
            if (n3 == 0) {
                return false;
            }
            objectArray = (zzey)objectArray;
            n3 = this.count;
            int n4 = objectArray.count;
            if (n3 == n4) {
                int n7;
                int[] nArray = this.zzpa;
                int[] nArray2 = objectArray.zzpa;
                Object object = null;
                for (n7 = 0; n7 < n3; ++n7) {
                    int n8 = nArray[n7];
                    int n10 = nArray2[n7];
                    if (n8 == n10) {
                        continue;
                    }
                    break block8;
                }
                Object[] objectArray2 = this.zzmj;
                objectArray = objectArray.zzmj;
                n4 = this.count;
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
        int n4 = this.count;
        int n7 = (n4 + 527) * 31;
        int[] nArray = this.zzpa;
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
        Object[] objectArray = this.zzmj;
        int n16 = this.count;
        while (n10 < n16) {
            n8 *= 31;
            object = objectArray[n10];
            n3 = object.hashCode();
            n8 += n3;
            ++n10;
        }
        return n7 + n8;
    }

    public final void zza(zzfr zzfr2) {
        int n3;
        int n4 = zzfr2.zzaj();
        if (n4 == (n3 = zzcg$zzg.zzkp)) {
            for (n4 = this.count + -1; n4 >= 0; n4 += -1) {
                int[] nArray = this.zzpa;
                n3 = nArray[n4] >>> 3;
                Object object = this.zzmj[n4];
                zzfr2.zza(n3, object);
            }
            return;
        }
        for (n4 = 0; n4 < (n3 = this.count); ++n4) {
            int[] nArray = this.zzpa;
            n3 = nArray[n4] >>> 3;
            Object object = this.zzmj[n4];
            zzfr2.zza(n3, object);
        }
    }

    public final void zza(StringBuilder stringBuilder, int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = this.count); ++i3) {
            n4 = this.zzpa[i3] >>> 3;
            String string2 = String.valueOf(n4);
            Object object = this.zzmj[i3];
            zzdr.zza(stringBuilder, n3, string2, object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int zzas() {
        int n3 = this.zzjq;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = 0;
        IllegalStateException illegalStateException = null;
        n4 = 0;
        zzcp zzcp2 = null;
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
                                    if (n3 >= (n8 = this.count)) {
                                        this.zzjq = n4;
                                        return n4;
                                    }
                                    object = this.zzpa;
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
                                        zzcp2 = zzco.zzbn();
                                        illegalStateException = new IllegalStateException(zzcp2);
                                        throw illegalStateException;
                                    }
                                    object = (Integer)this.zzmj[n3];
                                    n8 = (Integer)object;
                                    n8 = zzbn.zzj(n7, n8);
                                    break block8;
                                }
                                n8 = zzbn.zzr(n7) << n10;
                                zzey zzey2 = (zzey)this.zzmj[n3];
                                n4 = n7 = zzey2.zzas() + n8 + n4;
                                break block9;
                            }
                            object = (zzbb)this.zzmj[n3];
                            n8 = zzbn.zzc(n7, (zzbb)object);
                            break block8;
                        }
                        object = (Long)this.zzmj[n3];
                        l2 = (Long)object;
                        n8 = zzbn.zzg(n7, l2);
                        break block8;
                    }
                    object = (Long)this.zzmj[n3];
                    l2 = (Long)object;
                    n8 = zzbn.zze(n7, l2);
                }
                n4 = n8 += n4;
            }
            ++n3;
        }
    }

    public final void zzb(int n3, Object object) {
        int n4 = this.zzfa;
        if (n4 != 0) {
            int[] nArray;
            n4 = this.count;
            Object[] objectArray = this.zzpa;
            int n7 = objectArray.length;
            if (n4 == n7) {
                n7 = 4;
                n7 = n4 < n7 ? 8 : n4 >> 1;
                this.zzpa = objectArray = Arrays.copyOf(objectArray, n4 += n7);
                objectArray = this.zzmj;
                nArray = Arrays.copyOf(objectArray, n4);
                this.zzmj = nArray;
            }
            nArray = this.zzpa;
            int n8 = this.count;
            nArray[n8] = n3;
            this.zzmj[n8] = object;
            this.count = ++n8;
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void zzb(zzfr zzfr2) {
        int n3;
        int n4 = this.count;
        if (n4 == 0) {
            return;
        }
        n4 = zzfr2.zzaj();
        if (n4 == (n3 = zzcg$zzg.zzko)) {
            for (n4 = 0; n4 < (n3 = this.count); ++n4) {
                int[] nArray = this.zzpa;
                n3 = nArray[n4];
                Object object = this.zzmj[n4];
                zzey.zzb(n3, object, zzfr2);
            }
            return;
        }
        for (n4 = this.count + -1; n4 >= 0; n4 += -1) {
            int[] nArray = this.zzpa;
            n3 = nArray[n4];
            Object object = this.zzmj[n4];
            zzey.zzb(n3, object, zzfr2);
        }
    }

    public final int zzec() {
        int n3;
        int n4 = this.zzjq;
        int n7 = -1;
        if (n4 != n7) {
            return n4;
        }
        n7 = 0;
        for (n4 = 0; n4 < (n3 = this.count); ++n4) {
            int[] nArray = this.zzpa;
            n3 = nArray[n4] >>> 3;
            zzbb zzbb2 = (zzbb)this.zzmj[n4];
            n3 = zzbn.zzd(n3, zzbb2);
            n7 += n3;
        }
        this.zzjq = n7;
        return n7;
    }

    public final void zzv() {
        this.zzfa = false;
    }
}

