/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzap;
import com.google.android.gms.internal.fido.zzaq;
import com.google.android.gms.internal.fido.zzat;
import com.google.android.gms.internal.fido.zzax;
import com.google.android.gms.internal.fido.zzay;
import com.google.android.gms.internal.fido.zzaz;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class zzau
extends zzaq
implements Set {
    private transient zzat zza;

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

    public static zzau zzi(Object object, Object object2) {
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        return zzau.zzk(n3, objectArray);
    }

    private static zzau zzk(int n3, Object ... objectArray) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Object[] objectArray2;
                int n7;
                int n8 = zzau.zzf(n3);
                Object[] objectArray3 = new Object[n8];
                int n10 = n8 + -1;
                int n14 = 0;
                int n15 = 0;
                block0: for (n7 = 0; n7 < n3; ++n7) {
                    objectArray2 = objectArray[n7];
                    if (objectArray2 != null) {
                        int n16 = objectArray2.hashCode();
                        int n17 = zzap.zza(n16);
                        while (true) {
                            int n18;
                            Object object;
                            if ((object = objectArray3[n18 = n17 & n10]) == null) {
                                n17 = n15 + 1;
                                objectArray[n15] = objectArray2;
                                objectArray3[n18] = objectArray2;
                                n14 += n16;
                                n15 = n17;
                                continue block0;
                            }
                            n18 = (int)(object.equals(objectArray2) ? 1 : 0);
                            if (n18 != 0) continue block0;
                            ++n17;
                        }
                    }
                    objectArray = hj0_0.a(n7, "at index ");
                    NullPointerException nullPointerException = new NullPointerException((String)objectArray);
                    throw nullPointerException;
                }
                n7 = 0;
                Arrays.fill(objectArray, n15, n3, null);
                if (n15 == n4) {
                    Object object = objectArray[0];
                    object.getClass();
                    objectArray = new zzay(object);
                    return objectArray;
                }
                n3 = zzau.zzf(n15);
                if (n3 >= (n8 /= 2)) {
                    if (n15 <= 0) {
                        objectArray = Arrays.copyOf(objectArray, n15);
                    }
                    objectArray2 = objectArray;
                    zzax zzax2 = new zzax(objectArray, n14, objectArray3, n10, n15);
                    return zzax2;
                }
                return zzau.zzk(n15, objectArray);
            }
            Object object = objectArray[0];
            object.getClass();
            objectArray = new zzay(object);
            return objectArray;
        }
        return zzax.zza;
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
        int n4 = object instanceof zzau;
        if (n4 != 0 && (n4 = this.zzj()) != 0) {
            Object object2 = object;
            object2 = (zzau)object;
            n4 = ((zzau)object2).zzj();
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
        int n3;
        Iterator iterator = this.iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Object e2 = iterator.next();
            if (e2 != null) {
                n3 = e2.hashCode();
            } else {
                n3 = 0;
                e2 = null;
            }
            n4 += n3;
        }
        return n4;
    }

    public abstract zzaz zzd();

    public final zzat zzg() {
        zzat zzat2 = this.zza;
        if (zzat2 == null) {
            this.zza = zzat2 = this.zzh();
        }
        return zzat2;
    }

    public zzat zzh() {
        Object[] objectArray = this.toArray();
        int n3 = zzat.zzd;
        n3 = objectArray.length;
        return zzat.zzg(objectArray, n3);
    }

    public boolean zzj() {
        return false;
    }
}

