/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class c$b {
    public final long[] a;
    public final boolean[] b;
    public final int[] c;
    public boolean d;

    public c$b(int n3) {
        Object[] objectArray = new long[n3];
        this.a = objectArray;
        objectArray = new boolean[n3];
        this.b = (boolean[])objectArray;
        int[] nArray = new int[n3];
        this.c = nArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int[] a() {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block8: {
                    try {
                        boolean bl2 = this.d;
                        if (bl2) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    return null;
                }
                Object object = this.a;
                int n3 = ((long[])object).length;
                int n4 = 0;
                for (int i3 = 0; i3 < n3; ++i3) {
                    int[] nArray;
                    boolean[] blArray;
                    boolean bl3;
                    long l2 = object[i3];
                    int n7 = n4 + 1;
                    long l3 = 0L;
                    int n8 = 1;
                    Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    boolean bl4 = object2 > 0;
                    if (bl4 != (bl3 = (blArray = this.b)[n4])) {
                        nArray = this.c;
                        if (!bl4) {
                            n8 = 2;
                        }
                        nArray[n4] = n8;
                    } else {
                        nArray = this.c;
                        nArray[n4] = 0;
                    }
                    blArray[n4] = bl4;
                    n4 = n7;
                }
                this.d = false;
                object = this.c;
                object = object.clone();
                return (int[])object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(int ... object) {
        int n3 = 1;
        String string2 = "tableIds";
        Intrinsics.checkNotNullParameter(object, string2);
        synchronized (this) {
            boolean bl2;
            int n4;
            try {
                n4 = ((int[])object).length;
                bl2 = false;
            }
            catch (Throwable throwable) {}
            throw throwable;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                long l2;
                int n7 = object[i3];
                long[] lArray = this.a;
                long l3 = lArray[n7];
                lArray[n7] = l2 = 1L + l3;
                long l4 = 0L;
                long l7 = l3 - l4;
                Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 != false) continue;
                this.d = n3;
                bl2 = true;
            }
            object = Unit.a;
            return bl2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean c(int ... object) {
        int n3 = 1;
        String string2 = "tableIds";
        Intrinsics.checkNotNullParameter(object, string2);
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                try {
                    int n4 = ((int[])object).length;
                    bl2 = false;
                    for (int i3 = 0; i3 < n4; i3 += n3) {
                        int n7 = object[i3];
                        long[] lArray = this.a;
                        long l2 = lArray[n7];
                        long l3 = 1L;
                        long l4 = l2 - l3;
                        lArray[n7] = l4;
                        n7 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                        if (n7 != 0) continue;
                        this.d = n3;
                        bl2 = true;
                    }
                    object = Unit.a;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return bl2;
            }
            throw throwable2;
        }
    }
}

