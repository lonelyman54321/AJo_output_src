/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzth;
import com.google.android.gms.internal.gtm.zzti;
import com.google.android.gms.internal.gtm.zztl;
import com.google.android.gms.internal.gtm.zztx;
import com.google.android.gms.internal.gtm.zzty;
import com.google.android.gms.internal.gtm.zztz;
import com.google.android.gms.internal.gtm.zzua;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public abstract class zztp
extends zzti
implements Set {
    private transient zztl zza;

    public static int zzf(int n3) {
        int n4;
        if ((n3 = Math.max(n3, 2)) < (n4 = 0x2CCCCCCC)) {
            double d2;
            double d5;
            double d7;
            double d9;
            n4 = Integer.highestOneBit(n3 + -1);
            while ((d9 = (d7 = (d5 = (double)(n4 += n4) * 0.7) - (d2 = (double)n3)) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
            }
            return n4;
        }
        n4 = 0x40000000;
        if (n3 < n4) {
            return n4;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("collection too large");
        throw illegalArgumentException;
    }

    public static zztp zzi(Object object, Object objectArray, Object object2) {
        int n3 = 3;
        objectArray = new Object[n3];
        objectArray[0] = "";
        objectArray[1] = "0";
        objectArray[2] = "false";
        return zztp.zzl(n3, objectArray);
    }

    public static zztp zzj(Object object, Object objectArray, Object object2, Object object3) {
        int n3 = 4;
        objectArray = new Object[n3];
        objectArray[0] = "GET";
        objectArray[1] = "HEAD";
        objectArray[2] = "POST";
        objectArray[3] = "PUT";
        return zztp.zzl(n3, objectArray);
    }

    private static zztp zzl(int n3, Object ... objectArray) {
        if (n3 != 0) {
            int n4 = 0;
            int n7 = 1;
            if (n3 != n7) {
                Object[] objectArray2;
                int n8;
                int n10 = zztp.zzf(n3);
                Object[] objectArray3 = new Object[n10];
                int n14 = n10 + -1;
                int n15 = 0;
                int n16 = 0;
                block0: for (n8 = 0; n8 < n3; ++n8) {
                    objectArray2 = objectArray[n8];
                    if (objectArray2 != null) {
                        int n17 = objectArray2.hashCode();
                        int n18 = zzth.zza(n17);
                        while (true) {
                            int n19;
                            Object object;
                            if ((object = objectArray3[n19 = n18 & n14]) == null) {
                                n18 = n16 + 1;
                                objectArray[n16] = objectArray2;
                                objectArray3[n19] = objectArray2;
                                n15 += n17;
                                n16 = n18;
                                continue block0;
                            }
                            n19 = (int)(object.equals(objectArray2) ? 1 : 0);
                            if (n19 != 0) continue block0;
                            ++n18;
                        }
                    }
                    objectArray = hj0_0.a(n8, "at index ");
                    NullPointerException nullPointerException = new NullPointerException((String)objectArray);
                    throw nullPointerException;
                }
                n8 = 0;
                Arrays.fill(objectArray, n16, n3, null);
                if (n16 == n7) {
                    Object object = objectArray[0];
                    Objects.requireNonNull(object);
                    objectArray = new zztz(object);
                    return objectArray;
                }
                n3 = zztp.zzf(n16);
                if (n3 < (n10 /= 2)) {
                    return zztp.zzl(n16, objectArray);
                }
                n3 = objectArray.length;
                n4 = n3 >> 1;
                if (n16 < (n4 += (n3 >>= 2))) {
                    objectArray = Arrays.copyOf(objectArray, n16);
                }
                objectArray2 = objectArray;
                zztx zztx2 = new zztx(objectArray, n15, objectArray3, n14, n16);
                return zztx2;
            }
            Object object = objectArray[0];
            Objects.requireNonNull(object);
            objectArray = new zztz(object);
            return objectArray;
        }
        return zztx.zza;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof zztp;
        if (n4 != 0 && (n4 = this.zzk()) != 0) {
            Object object2 = object;
            object2 = (zztp)object;
            n4 = ((zztp)object2).zzk();
            if (n4 != 0) {
                n4 = this.hashCode();
                if (n4 != (n3 = object.hashCode())) return false;
            }
        }
        if (object == this) return bl2;
        n4 = object instanceof Set;
        if (n4 == 0) return false;
        object = (Set)object;
        n4 = this.size();
        n3 = object.size();
        if (n4 != n3) return false;
        try {
            boolean bl3 = this.containsAll((Collection<?>)object);
            if (bl3) return bl2;
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
        return false;
    }

    public int hashCode() {
        return zzty.zza(this);
    }

    public abstract zzua zzd();

    public final zztl zzg() {
        zztl zztl2 = this.zza;
        if (zztl2 == null) {
            this.zza = zztl2 = this.zzh();
        }
        return zztl2;
    }

    public zztl zzh() {
        Object[] objectArray = this.toArray();
        int n3 = zztl.zzd;
        n3 = objectArray.length;
        return zztl.zzg(objectArray, n3);
    }

    public boolean zzk() {
        return false;
    }
}

