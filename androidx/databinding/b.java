/*
 * Decompiled with CFR 0.152.
 */
package androidx.databinding;

import androidx.databinding.b$a;
import java.util.ArrayList;

public class b
implements Cloneable {
    public ArrayList a;
    public long b;
    public long[] c;
    public int d;
    public final b$a e;

    public b(b$a b$a) {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.b = 0L;
        this.e = b$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Object object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                if (object != null) {
                    block4: {
                        ArrayList arrayList;
                        try {
                            arrayList = this.a;
                            int n3 = arrayList.lastIndexOf(object);
                            if (n3 >= 0 && (n3 = (int)(this.d(n3) ? 1 : 0)) == 0) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        arrayList = this.a;
                        arrayList.add(object);
                    }
                    return;
                }
                String string2 = "callback cannot be null";
                object = new IllegalArgumentException(string2);
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object clone() {
        synchronized (this) {
            int n3 = 0;
            Object object = null;
            try {
                int n4;
                Object object2;
                block10: {
                    long l2;
                    try {
                        object2 = super.clone();
                        object2 = (b)object2;
                        l2 = 0L;
                    }
                    catch (CloneNotSupportedException cloneNotSupportedException) {}
                    try {
                        ArrayList arrayList;
                        ((b)object2).b = l2;
                        ((b)object2).c = null;
                        n3 = 0;
                        object = null;
                        ((b)object2).d = 0;
                        ((b)object2).a = arrayList = new ArrayList();
                        arrayList = this.a;
                        n4 = arrayList.size();
                        break block10;
                    }
                    catch (CloneNotSupportedException cloneNotSupportedException) {
                        object = object2;
                        return object;
                    }
                    return object;
                }
                while (n3 < n4) {
                    boolean bl2 = this.d(n3);
                    if (!bl2) {
                        ArrayList arrayList = ((b)object2).a;
                        ArrayList arrayList2 = this.a;
                        arrayList2 = arrayList2.get(n3);
                        arrayList.add(arrayList2);
                    }
                    ++n3;
                }
                return object2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean d(int n3) {
        long l2 = 0L;
        long l3 = 1L;
        int n4 = 1;
        int n7 = 64;
        if (n3 < n7) {
            l3 <<= n3;
            long l4 = this.b;
            long l7 = (l3 &= l4) - l2;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 == 0) {
                n4 = 0;
            }
            return n4 != 0;
        }
        long[] lArray = this.c;
        if (lArray == null) {
            return false;
        }
        int n8 = n3 / 64 - n4;
        int n10 = lArray.length;
        if (n8 >= n10) {
            return false;
        }
        long l8 = lArray[n8];
        n3 %= n7;
        long l12 = (l3 = l3 << n3 & l8) - l2;
        if ((n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1))) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(int var1_1, Object var2_2) {
        synchronized (this) {
            block7: {
                block8: {
                    block9: {
                        try {
                            this.d = var3_3 = this.d + 1;
                            var4_4 = this.a;
                            var5_5 = var4_4.size();
                            var4_4 = this.c;
                            var3_3 = var4_4 == null ? -1 : ((Object)var4_4).length + -1;
                            this.g(var1_1, var3_3, var2_2);
                            var6_6 = (var3_3 += 2) * 64;
                            var7_7 = 0L;
                        }
                        catch (Throwable var9_9) {
                            break block7;
                        }
                        {
                            this.f(var2_2, var1_1, var6_6, var7_7, var5_5);
                            this.d = var1_1 = this.d + -1;
                            if (var1_1 != 0) break block8;
                            var9_8 = this.c;
                            var10_10 = 0L;
                            if (var9_8 == null) break block9;
                            ** for (var1_1 = var9_8.length + -1;
                            ; var1_1 >= 0; var1_1 += -1)
                        }
lbl-1000:
                        // 1 sources

                        {
                            var2_2 = this.c;
                            var12_11 = var2_2[var1_1];
                            cfr_temp_0 = var12_11 - var10_10;
                            var14_12 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var14_12 == false) continue;
                            var14_12 = (var1_1 + 1) * 64;
                            this.j((int)var14_12, (long)var12_11);
                            var2_2 = this.c;
                            var2_2[var1_1] = var10_10;
                            continue;
                        }
                    }
                    if ((var17_14 = (cfr_temp_1 = (var15_13 = this.b) - var10_10) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) != false) {
                        var17_14 = 0;
                        this.j(0, var15_13);
                        this.b = var10_10;
                    }
                }
                return;
            }
            throw var9_9;
        }
    }

    public final void f(Object object, int n3, int n4, long l2, int n7) {
        long l3 = 1L;
        while (n4 < n7) {
            long l4 = l2 & l3;
            long l7 = 0L;
            long l8 = l4 - l7;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 == false) {
                Object e2 = this.a.get(n4);
                b$a b$a = this.e;
                b$a.a(n3, e2, object);
            }
            int n8 = 1;
            l3 <<= n8;
            ++n4;
        }
    }

    public final void g(int n3, int n4, Object object) {
        int n7 = 64;
        if (n4 < 0) {
            ArrayList arrayList = this.a;
            n4 = arrayList.size();
            int n8 = Math.min(n7, n4);
            long l2 = this.b;
            b b2 = this;
            this.f(object, n3, 0, l2, n8);
        } else {
            long[] lArray = this.c;
            long l3 = lArray[n4];
            int n10 = (n4 + 1) * 64;
            ArrayList arrayList = this.a;
            n7 = arrayList.size();
            int n14 = n10 + 64;
            int n15 = Math.min(n7, n14);
            this.g(n3, n4 += -1, object);
            this.f(object, n3, n10, l3, n15);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(Object object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            int n3 = this.d;
                            if (n3 != 0) break block4;
                            ArrayList arrayList = this.a;
                            arrayList.remove(object);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    ArrayList arrayList = this.a;
                    int n4 = arrayList.lastIndexOf(object);
                    if (n4 >= 0) {
                        this.k(n4);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void j(int n3, long l2) {
        long l3 = Long.MIN_VALUE;
        for (int i3 = n3 + 63; i3 >= n3; i3 += -1) {
            long l4 = l2 & l3;
            long l7 = 0L;
            long l8 = l4 - l7;
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) {
                ArrayList arrayList = this.a;
                arrayList.remove(i3);
            }
            int n4 = 1;
            l3 >>>= n4;
        }
    }

    public final void k(int n3) {
        long l2 = 1L;
        int n4 = 64;
        if (n3 < n4) {
            l2 <<= n3;
            long l3 = this.b;
            this.b = l2 |= l3;
        } else {
            int n7 = n3 / 64 + -1;
            long[] lArray = this.c;
            if (lArray == null) {
                int n8 = this.a.size() / n4;
                this.c = lArray = new long[n8];
            } else {
                int n10 = lArray.length;
                if (n10 <= n7) {
                    n10 = this.a.size() / n4;
                    lArray = new long[n10];
                    long[] lArray2 = this.c;
                    int n14 = lArray2.length;
                    System.arraycopy(lArray2, 0, lArray, 0, n14);
                    this.c = lArray;
                }
            }
            l2 <<= (n3 %= n4);
            long[] lArray3 = this.c;
            long l4 = lArray3[n7];
            lArray3[n7] = l2 |= l4;
        }
    }
}

