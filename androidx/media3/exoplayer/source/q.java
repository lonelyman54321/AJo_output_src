/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.drm.c$b;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.source.p$a;
import androidx.media3.exoplayer.source.q$a;
import androidx.media3.exoplayer.source.q$b;
import androidx.media3.exoplayer.source.q$c;
import java.io.EOFException;
import java.util.Objects;

public final class q
implements wp3 {
    public boolean A;
    public boolean B;
    public final p a;
    public final q$a b;
    public final Z93 c;
    public final c d;
    public final b$a e;
    public q$c f;
    public d g;
    public DrmSession h;
    public int i;
    public long[] j;
    public long[] k;
    public int[] l;
    public int[] m;
    public long[] n;
    public wp3$a[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public d z;

    public q(Cj0 object, c object2, b$a b$a) {
        long l2;
        int n3;
        this.d = object2;
        this.e = b$a;
        this.a = object2 = new p((Cj0)object);
        object = new Object();
        this.b = object;
        this.i = n3 = 1000;
        object2 = new long[n3];
        this.j = (long[])object2;
        object2 = new long[n3];
        this.k = (long[])object2;
        object2 = new long[n3];
        this.n = (long[])object2;
        object2 = new int[n3];
        this.m = (int[])object2;
        object2 = new int[n3];
        this.l = (int[])object2;
        object = new wp3$a[n3];
        this.o = object;
        object2 = new Object();
        super((im0)object2);
        this.c = object;
        this.t = l2 = Long.MIN_VALUE;
        this.u = l2;
        this.v = l2;
        n3 = 1;
        this.y = n3;
        this.x = n3;
        this.A = n3;
    }

    public final void a(long l2, int n3, int n4, int n7, wp3$a wp3$a) {
        Object object;
        int n8 = n3 & 1;
        boolean bl2 = true;
        boolean bl3 = false;
        d d2 = null;
        int n10 = n8 != 0 ? 1 : 0;
        Object object2 = this.x;
        if (object2 != 0) {
            if (n10 == 0) {
                return;
            }
            this.x = false;
        }
        if (bl3 = this.A) {
            long l3 = this.t;
            long l4 = l2 - l3;
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 < 0) {
                return;
            }
            if (n8 == 0) {
                n8 = (int)(this.B ? 1 : 0);
                if (n8 == 0) {
                    object = new StringBuilder("Overriding unexpected non-sync sample for format: ");
                    d2 = this.z;
                    ((StringBuilder)object).append(d2);
                    object = ((StringBuilder)object).toString();
                    Cx.f((String)object);
                    this.B = bl2;
                }
                n3 |= 1;
            }
        }
        n10 = n3;
        long l7 = this.a.g;
        long l8 = n4;
        l7 -= l8;
        l8 = n7;
        l8 = l7 - l8;
        object = this;
        this.g(l2, n3, l8, n4, wp3$a);
    }

    public final void b(Xm2 xm2, int n3, int n4) {
        p p2;
        while (true) {
            p2 = this.a;
            if (n3 <= 0) break;
            int n7 = p2.b(n3);
            p$a p$a = p2.f;
            ae_0 ae_02 = p$a.c;
            byte[] byArray = ae_02.a;
            long l2 = p2.g;
            long l3 = p$a.a;
            int n8 = (int)(l2 -= l3);
            int n10 = ae_02.b;
            xm2.g(n8 += n10, byArray, n7);
            n3 -= n7;
            long l4 = p2.g;
            long l7 = n7;
            p2.g = l4 += l7;
            p$a p$a2 = p2.f;
            l7 = p$a2.b;
            long l8 = l4 - l7;
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) continue;
            p2.f = p$a2 = p$a2.d;
        }
        p2.getClass();
    }

    public final int c(mi0_0 mi0_02, int n3, boolean bl2) {
        return this.e(mi0_02, n3, bl2);
    }

    /*
     * Exception decompiling
     */
    public final void d(d var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 20[TRYBLOCK] [21 : 173->181)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int e(mi0_0 object, int n3, boolean bl2) {
        p$a p$a;
        p p2 = this.a;
        n3 = p2.b(n3);
        p$a p$a2 = p2.f;
        ae_0 ae_02 = p$a2.c;
        byte[] byArray = ae_02.a;
        long l2 = p2.g;
        long l3 = p$a2.a;
        int n4 = (int)(l2 -= l3);
        int n7 = ae_02.b;
        int n8 = object.read(byArray, n4 += n7, n3);
        if (n8 == (n3 = -1)) {
            if (bl2) {
                return -1;
            }
            object = new EOFException();
            throw object;
        }
        long l4 = p2.g;
        long l7 = n8;
        p2.g = l4 += l7;
        p$a2 = p2.f;
        long l8 = p$a2.b;
        long l12 = l4 - l8;
        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 != false) return n8;
        p2.f = p$a = p$a2.d;
        return n8;
    }

    public final void f(int n3, Xm2 xm2) {
        this.b(xm2, n3, 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(long var1_1, int var3_2, long var4_3, int var6_4, wp3$a var7_5) {
        synchronized (this) {
            block22: {
                block21: {
                    try {
                        var8_6 = this.p;
                        var9_7 = 1;
                        if (var8_6 <= 0) break block21;
                        var8_6 -= var9_7;
                    }
                    catch (Throwable var16_12) {
                        break block22;
                    }
                    var8_6 = this.m(var8_6);
                    var10_8 /* !! */  = this.k;
                    var11_9 = var10_8 /* !! */ [var8_6];
                    var10_8 /* !! */  = this.l;
                    var13_10 = var10_8 /* !! */ [var8_6];
                    cfr_temp_0 = (var11_9 += var13_10) - var4_3;
                    var8_6 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var8_6 <= 0) {
                        var8_6 = 1;
                    } else {
                        var8_6 = 0;
                        var15_11 = null;
                    }
                    ct3.a((boolean)var8_6);
                }
                if ((var8_6 = 0x20000000 & var3_2) != 0) {
                    var8_6 = 1;
                } else {
                    var8_6 = 0;
                    var15_11 = null;
                }
                this.w = var8_6;
                var17_14 = this.v;
                this.v = var17_14 = Math.max(var17_14, var1_1);
                var8_6 = this.p;
                var8_6 = this.m(var8_6);
                var10_8 /* !! */  = this.n;
                var10_8 /* !! */ [var8_6] = var1_1;
                var16_13 = this.k;
                var16_13[var8_6] = var4_3;
                var16_13 = this.l;
                var16_13[var8_6] = var6_4;
                var16_13 = this.m;
                var16_13[var8_6] = var3_2;
                var16_13 = this.o;
                var16_13[var8_6] = (long)var7_5;
                var16_13 = this.j;
                var16_13[var8_6] = var19_15 = 0L;
                var16_13 = this.c;
                var16_13 = var16_13.b;
                var21_16 = var16_13.size();
                if (var21_16 == 0) {
                    var21_16 = 1;
                } else {
                    var21_16 = 0;
                    var16_13 = null;
                }
                if (var21_16 != 0) ** GOTO lbl64
                var16_13 = this.c;
                var16_13 = var16_13.b;
                var22_17 = var16_13.size() - var9_7;
                {
                    var16_13 = var16_13.valueAt(var22_17);
                    var16_13 = (q$b)var16_13;
                    var16_13 = var16_13.a;
                    var23_18 = this.z;
                    var21_16 = (int)var16_13.equals(var23_18);
                    if (var21_16 != 0) ** GOTO lbl104
lbl64:
                    // 2 sources

                    var16_13 = this.z;
                    var16_13.getClass();
                    var23_18 = this.d;
                    if (var23_18 != null) {
                        var24_19 = this.e;
                        var23_18 = var23_18.d((b$a)var24_19, (d)var16_13);
                    } else {
                        var23_18 = c$b.a;
                    }
                    var24_19 = this.c;
                    var25_20 = this.q;
                    var26_21 = this.p;
                    var25_20 += var26_21;
                    var27_22 = new q$b((d)var16_13, (c$b)var23_18);
                    var21_16 = var24_19.a;
                    var23_18 = var24_19.b;
                    var6_4 = -1;
                    if (var21_16 == var6_4) {
                        var21_16 = var23_18.size();
                        if (var21_16 == 0) {
                            var21_16 = 1;
                        } else {
                            var21_16 = 0;
                            var16_13 = null;
                        }
                        ct3.f((boolean)var21_16);
                        var24_19.a = 0;
                    }
                    if ((var21_16 = var23_18.size()) <= 0) ** GOTO lbl103
                    var21_16 = var23_18.size() - var9_7;
                }
                {
                    if (var25_20 >= (var21_16 = var23_18.keyAt(var21_16))) {
                        var6_4 = 1;
                    } else {
                        var6_4 = 0;
                        var28_23 = null;
                    }
                    ct3.a((boolean)var6_4);
                    if (var21_16 != var25_20) ** GOTO lbl103
                    var21_16 = var23_18.size() - var9_7;
                }
                {
                    var16_13 = var23_18.valueAt(var21_16);
                    var24_19 = var24_19.c;
                    var24_19.accept(var16_13);
lbl103:
                    // 3 sources

                    var23_18.append(var25_20, var27_22);
lbl104:
                    // 2 sources

                    this.p = var21_16 = this.p + var9_7;
                    var22_17 = this.i;
                    if (var21_16 != var22_17) ** GOTO lbl153
                    var21_16 = var22_17 + 1000;
                    var24_19 = new long[var21_16];
                    var29_24 = new long[var21_16];
                    var27_22 = new long[var21_16];
                    var28_23 = new int[var21_16];
                    var7_5 = new int[var21_16];
                    var15_11 = new wp3$a[var21_16];
                    var9_7 = this.r;
                }
                {
                    var10_8 /* !! */  = this.k;
                    System.arraycopy(var10_8 /* !! */ , var9_7, var29_24, 0, var22_17 -= var9_7);
                    var30_25 /* !! */  = this.n;
                    var31_26 = this.r;
                    System.arraycopy(var30_25 /* !! */ , var31_26, var27_22, 0, var22_17);
                    var30_25 /* !! */  = this.m;
                    var31_26 = this.r;
                    System.arraycopy(var30_25 /* !! */ , var31_26, var28_23, 0, var22_17);
                    var30_25 /* !! */  = this.l;
                    var31_26 = this.r;
                    System.arraycopy(var30_25 /* !! */ , var31_26, var7_5, 0, var22_17);
                    var30_25 /* !! */  = (long[])this.o;
                    var31_26 = this.r;
                    System.arraycopy(var30_25 /* !! */ , var31_26, var15_11, 0, var22_17);
                    var30_25 /* !! */  = this.j;
                    var31_26 = this.r;
                    System.arraycopy(var30_25 /* !! */ , var31_26, var24_19, 0, var22_17);
                    var9_7 = this.r;
                    var10_8 /* !! */  = this.k;
                    System.arraycopy(var10_8 /* !! */ , 0, var29_24, var22_17, var9_7);
                    var10_8 /* !! */  = this.n;
                    System.arraycopy(var10_8 /* !! */ , 0, var27_22, var22_17, var9_7);
                    var10_8 /* !! */  = this.m;
                    System.arraycopy(var10_8 /* !! */ , 0, var28_23, var22_17, var9_7);
                    var10_8 /* !! */  = this.l;
                    System.arraycopy(var10_8 /* !! */ , 0, var7_5, var22_17, var9_7);
                    var10_8 /* !! */  = (long[])this.o;
                    System.arraycopy(var10_8 /* !! */ , 0, var15_11, var22_17, var9_7);
                    var10_8 /* !! */  = this.j;
                    System.arraycopy(var10_8 /* !! */ , 0, var24_19, var22_17, var9_7);
                    this.k = var29_24;
                    this.n = (long[])var27_22;
                    this.m = var28_23;
                    this.l = (int[])var7_5;
                    this.o = var15_11;
                    this.j = (long[])var24_19;
                    this.r = 0;
                    this.i = var21_16;
lbl153:
                    // 2 sources

                    return;
                }
            }
            throw var16_12;
        }
    }

    public final long h(int n3) {
        int n4;
        int n7;
        long l2 = this.u;
        long l3 = this.l(n3);
        this.u = l2 = Math.max(l2, l3);
        this.p = n7 = this.p - n3;
        this.q = n7 = this.q + n3;
        this.r = n4 = this.r + n3;
        int n8 = this.i;
        if (n4 >= n8) {
            this.r = n4 -= n8;
        }
        this.s = n4 = this.s - n3;
        n3 = 0;
        long[] lArray = null;
        if (n4 < 0) {
            this.s = 0;
        }
        while (true) {
            int n10;
            Z93 z93 = this.c;
            SparseArray sparseArray = z93.b;
            int n14 = sparseArray.size() + -1;
            if (n3 >= n14 || n7 < (n10 = sparseArray.keyAt(n14 = n3 + 1))) break;
            Object object = sparseArray.valueAt(n3);
            n60_0 n60_02 = z93.c;
            n60_02.accept(object);
            sparseArray.removeAt(n3);
            n3 = z93.a;
            if (n3 > 0) {
                z93.a = n3 += -1;
            }
            n3 = n14;
        }
        n3 = this.p;
        if (n3 == 0) {
            n3 = this.r;
            if (n3 == 0) {
                n3 = this.i;
            }
            long l4 = this.k[n3 += -1];
            long l7 = this.l[n3];
            return l4 + l7;
        }
        lArray = this.k;
        n7 = this.r;
        return lArray[n7];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        long l2;
        p p2 = this.a;
        synchronized (this) {
            int n3 = this.p;
            if (n3 == 0) {
                // MONITOREXIT @DISABLED, blocks:[3, 5] lbl5 : MonitorExitStatement: MONITOREXIT : this
                l2 = -1;
            } else {
                l2 = this.h(n3);
            }
        }
        p2.a(l2);
    }

    public final int j(int n3, int n4, long l2, boolean bl2) {
        Object[] objectArray;
        long l3;
        long l4;
        long l7;
        int n7 = -1;
        for (int i3 = 0; i3 < n4 && (l7 = (l4 = (l3 = (objectArray = this.n)[n3]) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0; ++i3) {
            if (!bl2 || (l7 = (long)((objectArray = (Object[])this.m)[n3] & 1)) != false) {
                n7 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
                if (n7 == 0) {
                    n7 = i3;
                    break;
                }
                n7 = i3;
            }
            if (++n3 != (l7 = (long)this.i)) continue;
            n3 = 0;
        }
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long k() {
        synchronized (this) {
            return this.v;
        }
    }

    public final long l(int n3) {
        long l2 = Long.MIN_VALUE;
        if (n3 == 0) {
            return l2;
        }
        int n4 = n3 + -1;
        n4 = this.m(n4);
        for (int i3 = 0; i3 < n3; ++i3) {
            long l3 = this.n[n4];
            l2 = Math.max(l2, l3);
            int[] nArray = this.m;
            int n7 = nArray[n4] & 1;
            if (n7 != 0) break;
            n7 = -1;
            if ((n4 += -1) != n7) continue;
            n4 = this.i + -1;
        }
        return l2;
    }

    public final int m(int n3) {
        int n4 = this.r + n3;
        if (n4 >= (n3 = this.i)) {
            n4 -= n3;
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final d n() {
        synchronized (this) {
            boolean bl2 = this.y;
            if (!bl2) return this.z;
            return null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean o(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl3;
                int n3;
                int n4;
                block6: {
                    try {
                        n4 = this.s;
                        n3 = this.p;
                        boolean bl4 = false;
                        bl3 = true;
                        n3 = n4 != n3 ? 1 : 0;
                        if (n3 != 0) break block6;
                        if (bl2) return true;
                        bl2 = this.w;
                        if (bl2) return true;
                        d d2 = this.z;
                        if (d2 == null) return bl4;
                        d d5 = this.g;
                        if (d2 == d5) return bl4;
                        return true;
                    }
                    catch (Throwable throwable2) {}
                }
                Object object = this.c;
                n3 = this.q + n4;
                object = ((Z93)object).a(n3);
                object = (q$b)object;
                object = ((q$b)object).a;
                d d7 = this.g;
                if (object == d7) break block7;
                return bl3;
            }
            bl2 = this.s;
            bl2 = this.m((int)(bl2 ? 1 : 0));
            return this.p((int)(bl2 ? 1 : 0));
            throw throwable2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final boolean p(int object) {
        void var1_7;
        DrmSession drmSession;
        boolean bl2;
        Object object2;
        int n3;
        int n4;
        int n7;
        Object object3 = this.h;
        if (!(object3 == null || (n7 = object3.getState()) == (n4 = 4) || (n3 = (object2 = (object3 = (Object)this.m)[object]) & (n7 = 0x40000000)) == 0 && (bl2 = (drmSession = this.h).b()))) {
            boolean bl3 = false;
            drmSession = null;
        } else {
            boolean bl4 = true;
        }
        return (boolean)var1_7;
    }

    public final void q(d object, HV0 hV0) {
        Object object2;
        boolean bl2;
        b$a b$a;
        boolean bl3;
        Object object3 = this.g;
        if (object3 == null) {
            bl3 = true;
        } else {
            bl3 = false;
            b$a = null;
        }
        if (object3 == null) {
            bl2 = false;
            object3 = null;
        } else {
            object3 = ((d)object3).s;
        }
        this.g = object;
        DrmInitData drmInitData = ((d)object).s;
        c c2 = this.d;
        if (c2 != null) {
            int n3 = c2.c((d)object);
            d$a d$a = ((d)object).a();
            d$a.L = n3;
            object2 = d$a.a();
        } else {
            object2 = object;
        }
        hV0.b = object2;
        hV0.a = object2 = this.h;
        if (c2 == null) {
            return;
        }
        if (!bl3 && (bl2 = Objects.equals(object3, drmInitData))) {
            return;
        }
        object3 = this.h;
        b$a = this.e;
        this.h = object = c2.b(b$a, (d)object);
        hV0.a = object;
        if (object3 != null) {
            object3.e(b$a);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void r(boolean bl2) {
        long l2;
        long l3;
        long l4;
        boolean bl3;
        int n3;
        Object object;
        Object object2;
        Object object3 = this.a;
        Object object4 = ((p)object3).d;
        Object object5 = ((p$a)object4).c;
        int n4 = 1;
        if (object5 != null) {
            object5 = ((p)object3).a;
            // MONITORENTER : object5
            object2 = object4;
            while (object2 != null) {
                int n7;
                object = ((Cj0)object5).f;
                int n8 = ((Cj0)object5).e;
                ((Cj0)object5).e = n7 = n8 + 1;
                ae_0 ae_02 = ((p$a)object2).c;
                ae_02.getClass();
                object[n8] = ae_02;
                n3 = ((Cj0)object5).d - n4;
                ((Cj0)object5).d = n3;
                object2 = ((p$a)object2).d;
                if (object2 != null && (object = ((p$a)object2).c) != null) continue;
                bl3 = false;
                object2 = null;
            }
            object5.notifyAll();
            // MONITOREXIT : object5
            ((p$a)object4).c = null;
            ((p$a)object4).d = null;
        }
        object4 = ((p)object3).d;
        int n10 = ((p)object3).b;
        object2 = ((p$a)object4).c;
        n3 = 0;
        object = null;
        if (object2 == null) {
            bl3 = true;
        } else {
            bl3 = false;
            object2 = null;
        }
        ct3.f(bl3);
        ((p$a)object4).a = l4 = 0L;
        ((p$a)object4).b = l3 = (long)n10;
        object4 = ((p)object3).d;
        ((p)object3).e = object4;
        ((p)object3).f = object4;
        ((p)object3).g = l4;
        ((p)object3).a.b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = n4;
        this.t = l2 = Long.MIN_VALUE;
        this.u = l2;
        this.v = l2;
        this.w = false;
        object3 = this.c;
        while (true) {
            if (n3 >= (n10 = (object4 = ((Z93)object3).b).size())) {
                ((Z93)object3).a = n10 = -1;
                object4.clear();
                if (!bl2) return;
                this.z = null;
                this.y = n4;
                this.A = n4;
                return;
            }
            object4 = object4.valueAt(n3);
            object5 = ((Z93)object3).c;
            object5.accept(object4);
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void s() {
        synchronized (this) {
            p$a p$a;
            p p2 = null;
            this.s = 0;
            p2 = this.a;
            p2.e = p$a = p2.d;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean t(long l2, boolean bl2) {
        synchronized (this) {
            int n3;
            boolean bl3;
            int n4;
            block14: {
                long l3;
                long[] lArray;
                Object object;
                int n7;
                int n8;
                block13: {
                    block12: {
                        this.s();
                        n4 = this.s;
                        n8 = this.m(n4);
                        n4 = this.s;
                        n7 = this.p;
                        bl3 = true;
                        if (n4 == n7) return false;
                        object = 1;
                        if (object == 0) return false;
                        lArray = this.n;
                        l3 = lArray[n8];
                        long l4 = l2 - l3;
                        object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                        if (object < 0) return false;
                        long l7 = this.v;
                        long l8 = l2 - l7;
                        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object2 > 0 && !bl2) break block12;
                        object = this.A;
                        n3 = -1;
                        if (object != 0) {
                            n7 -= n4;
                            break block13;
                        }
                        object = n7 - n4;
                        boolean bl4 = true;
                        l3 = l2;
                        n4 = this.j(n8, (int)object, l2, bl4);
                        break block14;
                    }
                    return false;
                }
                for (n4 = 0; n4 < n7; ++n4) {
                    lArray = this.n;
                    l3 = lArray[n8];
                    object = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (object < 0) {
                        object = this.i;
                        if (++n8 != object) continue;
                        n8 = 0;
                        continue;
                    }
                    break block14;
                }
                if (!bl2) {
                    n7 = -1;
                }
                n4 = n7;
            }
            if (n4 == n3) {
                return false;
            }
            try {
                int n10;
                this.t = l2;
                this.s = n10 = this.s + n4;
                return bl3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                int n4;
                block5: {
                    block4: {
                        if (n3 >= 0) {
                            try {
                                n4 = this.s + n3;
                                int n7 = this.p;
                                if (n4 > n7) break block4;
                                n4 = 1;
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                    }
                    n4 = 0;
                }
                ct3.a(n4 != 0);
                this.s = n4 = this.s + n3;
                return;
            }
            throw throwable2;
        }
    }
}

