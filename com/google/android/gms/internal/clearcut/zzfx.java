/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfs;
import com.google.android.gms.internal.clearcut.zzfv;
import com.google.android.gms.internal.clearcut.zzfz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class zzfx
implements Cloneable {
    private Object value;
    private zzfv zzrp;
    private List zzrq;

    public zzfx() {
        ArrayList arrayList;
        this.zzrq = arrayList = new ArrayList();
    }

    private final byte[] toByteArray() {
        byte[] byArray = new byte[this.zzen()];
        zzfs zzfs2 = zzfs.zzg(byArray);
        this.zza(zzfs2);
        return byArray;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final zzfx zzeq() {
        block22: {
            block21: {
                var1_1 = new zzfx();
                var2_3 = this.zzrp;
                var1_1.zzrp = var2_3;
                var2_3 = this.zzrq;
                if (var2_3 == null) {
                    var2_3 = null;
                    var1_1.zzrq = null;
                } else {
                    var3_4 = var1_1.zzrq;
                    var3_4.addAll(var2_3);
                }
                var2_3 = this.value;
                if (var2_3 == null) return var1_1;
                var4_5 = var2_3 instanceof zzfz;
                if (var4_5 == 0) ** GOTO lbl22
                var2_3 = (zzfz)var2_3;
                var2_3 = var2_3.clone();
                var2_3 = (zzfz)var2_3;
                break block21;
lbl22:
                // 1 sources

                var4_5 = var2_3 instanceof byte[];
                if (var4_5 != 0) {
                    var2_3 = (zzfz[])((byte[])var2_3);
                    var2_3 = var2_3.clone();
                    break block21;
                }
                var4_5 = var2_3 instanceof byte[][];
                var5_6 = 0;
                if (var4_5 != 0) {
                    var2_3 = (zzfz[])((byte[][])var2_3);
                    var4_5 = var2_3.length;
                    var3_4 = (zzfz[])new byte[var4_5][];
                    var1_1.value = var3_4;
                    while (var5_6 < (var6_7 = var2_3.length)) {
                        var7_9 = var2_3[var5_6];
                        var7_9 = var7_9.clone();
                        var3_4[var5_6] = var7_9 = (Object)((byte[])var7_9);
                        ++var5_6;
                    }
                    return var1_1;
                }
                var4_5 = var2_3 instanceof boolean[];
                if (var4_5 != 0) {
                    var2_3 = (zzfz[])((boolean[])var2_3);
                    var2_3 = var2_3.clone();
                    break block21;
                }
                var4_5 = var2_3 instanceof int[];
                if (var4_5 != 0) {
                    var2_3 = (zzfz[])((int[])var2_3);
                    var2_3 = var2_3.clone();
                    break block21;
                }
                var4_5 = var2_3 instanceof long[];
                if (var4_5 != 0) {
                    var2_3 = (zzfz[])((long[])var2_3);
                    var2_3 = var2_3.clone();
                    break block21;
                }
                var4_5 = var2_3 instanceof float[];
                if (var4_5 != 0) {
                    var2_3 = (zzfz[])((float[])var2_3);
                    var2_3 = var2_3.clone();
                    break block21;
                }
                var4_5 = var2_3 instanceof double[];
                if (var4_5 == 0) break block22;
                var2_3 = (zzfz[])((double[])var2_3);
                var2_3 = var2_3.clone();
            }
            var1_1.value = var2_3;
            return var1_1;
        }
        var4_5 = var2_3 instanceof zzfz[];
        if (var4_5 == 0) return var1_1;
        try {
            var2_3 = var2_3;
            var4_5 = var2_3.length;
            var1_1.value = var3_4 = new zzfz[var4_5];
            while (var5_6 < (var6_8 = var2_3.length)) {
                var7_10 = var2_3[var5_6];
                var7_10 = var7_10.clone();
                var3_4[var5_6] = var7_10 = (zzfz)var7_10;
                ++var5_6;
            }
            return var1_1;
        }
        catch (CloneNotSupportedException var1_2) {}
        var2_3 = new AssertionError((Object)var1_2);
        throw var2_3;
    }

    public final /* synthetic */ Object clone() {
        return this.zzeq();
    }

    public final boolean equals(Object objectArray) {
        if (objectArray == this) {
            return true;
        }
        boolean bl2 = objectArray instanceof zzfx;
        boolean bl3 = false;
        List list = null;
        if (!bl2) {
            return false;
        }
        objectArray = (zzfx)objectArray;
        Object object = this.value;
        if (object != null && (object = objectArray.value) != null) {
            object = this.zzrp;
            zzfv zzfv2 = objectArray.zzrp;
            if (object != zzfv2) {
                return false;
            }
            object = object.zzrk;
            bl2 = object.isArray();
            if (!bl2) {
                object = this.value;
                objectArray = objectArray.value;
                return object.equals(objectArray);
            }
            object = this.value;
            bl3 = object instanceof byte[];
            if (bl3) {
                object = (byte[])object;
                objectArray = (byte[])objectArray.value;
                return Arrays.equals((byte[])object, (byte[])objectArray);
            }
            bl3 = object instanceof int[];
            if (bl3) {
                object = (int[])object;
                objectArray = (int[])objectArray.value;
                return Arrays.equals((int[])object, (int[])objectArray);
            }
            bl3 = object instanceof long[];
            if (bl3) {
                object = (long[])object;
                objectArray = (long[])objectArray.value;
                return Arrays.equals((long[])object, (long[])objectArray);
            }
            bl3 = object instanceof float[];
            if (bl3) {
                object = (float[])object;
                objectArray = (float[])objectArray.value;
                return Arrays.equals((float[])object, (float[])objectArray);
            }
            bl3 = object instanceof double[];
            if (bl3) {
                object = (double[])object;
                objectArray = (double[])objectArray.value;
                return Arrays.equals((double[])object, (double[])objectArray);
            }
            bl3 = object instanceof boolean[];
            if (bl3) {
                object = (boolean[])object;
                objectArray = (boolean[])objectArray.value;
                return Arrays.equals((boolean[])object, (boolean[])objectArray);
            }
            object = object;
            objectArray = (Object[])objectArray.value;
            return Arrays.deepEquals(object, objectArray);
        }
        object = this.zzrq;
        if (object != null && (list = objectArray.zzrq) != null) {
            return object.equals(list);
        }
        try {
            object = this.toByteArray();
        }
        catch (IOException iOException) {
            object = new IllegalStateException(iOException);
            throw object;
        }
        objectArray = super.toByteArray();
        return Arrays.equals((byte[])object, (byte[])objectArray);
    }

    public final int hashCode() {
        byte[] byArray;
        try {
            byArray = this.toByteArray();
        }
        catch (IOException iOException) {
            IllegalStateException illegalStateException = new IllegalStateException(iOException);
            throw illegalStateException;
        }
        return Arrays.hashCode(byArray) + 527;
    }

    public final void zza(zzfs iterator) {
        iterator = this.value;
        if (iterator == null) {
            iterator = this.zzrq.iterator();
            boolean bl2 = iterator.hasNext();
            if (!bl2) {
                return;
            }
            iterator.next();
            iterator = new NoSuchMethodError();
            throw iterator;
        }
        iterator = new NoSuchMethodError();
        throw iterator;
    }

    public final int zzen() {
        Iterator iterator = this.value;
        if (iterator == null) {
            iterator = this.zzrq.iterator();
            boolean bl2 = iterator.hasNext();
            if (!bl2) {
                return 0;
            }
            iterator.next();
            iterator = new NoSuchMethodError();
            throw iterator;
        }
        iterator = new NoSuchMethodError();
        throw iterator;
    }
}

