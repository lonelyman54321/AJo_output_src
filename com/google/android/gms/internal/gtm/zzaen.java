/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacp;
import com.google.android.gms.internal.gtm.zzadn;
import com.google.android.gms.internal.gtm.zzaez;
import com.google.android.gms.internal.gtm.zzyx;
import com.google.android.gms.internal.gtm.zzzi;
import java.util.Arrays;

public final class zzaen {
    private static final zzaen zza;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    static {
        zzaen zzaen2;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        zza = zzaen2 = new zzaen(0, nArray, objectArray, false);
    }

    private zzaen() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    private zzaen(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.zze = -1;
        this.zzb = n3;
        this.zzc = nArray;
        this.zzd = objectArray;
        this.zzf = bl2;
    }

    public static zzaen zzc() {
        return zza;
    }

    public static zzaen zze(zzaen zzaen2, zzaen zzaen3) {
        int n3 = zzaen2.zzb;
        int n4 = zzaen3.zzb;
        int[] nArray = Arrays.copyOf(zzaen2.zzc, n3 += n4);
        Object[] objectArray = zzaen3.zzc;
        int n7 = zzaen2.zzb;
        int n8 = zzaen3.zzb;
        System.arraycopy(objectArray, 0, nArray, n7, n8);
        objectArray = Arrays.copyOf(zzaen2.zzd, n3);
        Object[] objectArray2 = zzaen3.zzd;
        int n10 = zzaen2.zzb;
        int n14 = zzaen3.zzb;
        System.arraycopy(objectArray2, 0, objectArray, n10, n14);
        zzaen2 = new zzaen(n3, nArray, objectArray, true);
        return zzaen2;
    }

    public static zzaen zzf() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        zzaen zzaen2 = new zzaen(0, nArray, objectArray, true);
        return zzaen2;
    }

    private final void zzm(int n3) {
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
            int n3 = objectArray instanceof zzaen;
            if (n3 == 0) {
                return false;
            }
            objectArray = (zzaen)objectArray;
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
        zzacp zzacp2 = null;
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
                                            zzacp2 = new zzacp("Protocol message tag had invalid wire type.");
                                            illegalStateException = new IllegalStateException(zzacp2);
                                            throw illegalStateException;
                                        }
                                        n8 = n7 << 3;
                                        object = (Integer)this.zzd[n3];
                                        object.getClass();
                                        n8 = zzzi.zzC(n8) + 4;
                                        break block8;
                                    }
                                    n8 = zzzi.zzC(n7 << 3);
                                    n8 += n8;
                                    object = (zzaen)this.zzd[n3];
                                    n7 = ((zzaen)object).zza();
                                    break block9;
                                }
                                n8 = n7 << 3;
                                object = (zzyx)this.zzd[n3];
                                n8 = zzzi.zzC(n8);
                                n7 = ((zzyx)object).zzd();
                                n4 = n10 = zzzi.zzC(n7) + n7 + n8 + n4;
                                break block10;
                            }
                            n8 = n7 << 3;
                            object = (Long)this.zzd[n3];
                            object.getClass();
                            n8 = zzzi.zzC(n8) + 8;
                        }
                        n4 = n8 += n4;
                        break block10;
                    }
                    n8 = n7 << 3;
                    object = (Long)this.zzd[n3];
                    long l2 = (Long)object;
                    n8 = zzzi.zzC(n8);
                    n7 = zzzi.zzD(l2);
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
                zzyx zzyx2 = (zzyx)this.zzd[n3];
                int n8 = zzzi.zzC(8);
                n8 += n8;
                int n10 = zzzi.zzC(16);
                n7 = zzzi.zzC(n7) + n10;
                n10 = zzzi.zzC(24);
                int n14 = zzyx2.zzd();
                n14 = d90_0.a(n14, n14, n10);
                n8 = n8 + n7 + n14;
                n4 += n8;
            }
            this.zze = n4;
            return n4;
        }
        return n3;
    }

    public final zzaen zzd(zzaen zzaen2) {
        zzaen zzaen3 = zza;
        int n3 = zzaen2.equals(zzaen3);
        if (n3 != 0) {
            return this;
        }
        this.zzg();
        n3 = this.zzb;
        int n4 = zzaen2.zzb;
        this.zzm(n3 += n4);
        Object[] objectArray = zzaen2.zzc;
        Object[] objectArray2 = this.zzc;
        int n7 = this.zzb;
        int n8 = zzaen2.zzb;
        System.arraycopy(objectArray, 0, objectArray2, n7, n8);
        objectArray = zzaen2.zzd;
        objectArray2 = this.zzd;
        n7 = this.zzb;
        int n10 = zzaen2.zzb;
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
            zzadn.zzb(stringBuilder, n3, string2, object);
        }
    }

    public final void zzj(int n3, Object object) {
        this.zzg();
        int n4 = this.zzb + 1;
        this.zzm(n4);
        int[] nArray = this.zzc;
        int n7 = this.zzb;
        nArray[n7] = n3;
        this.zzd[n7] = object;
        this.zzb = ++n7;
    }

    public final void zzk(zzaez zzaez2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.zzb); ++i3) {
            int[] nArray = this.zzc;
            n3 = nArray[i3] >>> 3;
            Object object = this.zzd[i3];
            zzaez2.zzw(n3, object);
        }
    }

    public final void zzl(zzaez object) {
        int n3 = this.zzb;
        if (n3 != 0) {
            int n4;
            zzacp zzacp2 = null;
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
                                zzacp2 = new zzacp("Protocol message tag had invalid wire type.");
                                object = new RuntimeException(zzacp2);
                                throw object;
                            }
                            object.zzF(n4);
                            object2 = (zzaen)object2;
                            ((zzaen)object2).zzl((zzaez)object);
                            object.zzh(n4);
                            continue;
                        }
                        object2 = (zzyx)object2;
                        object.zzd(n4, (zzyx)object2);
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
}

