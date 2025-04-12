/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/*
 * Renamed from Bw1
 */
public final class bw1_2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final gh3_2 g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Object object = bw1_2.class;
        e = AtomicReferenceFieldUpdater.newUpdater(object, Object.class, "_next$volatile");
        f = AtomicLongFieldUpdater.newUpdater(object, "_state$volatile");
        g = object = new gh3_2("REMOVE_FROZEN");
    }

    public bw1_2(int n3, boolean n4) {
        AtomicReferenceArray atomicReferenceArray;
        this.a = n3;
        this.b = n4;
        n4 = n3 + -1;
        this.c = n4;
        this.d = atomicReferenceArray = new AtomicReferenceArray(n3);
        int n7 = -1 >>> 2;
        String string2 = "Check failed.";
        if (n4 <= n7) {
            if ((n3 &= n4) == 0) {
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(string2);
            throw illegalStateException;
        }
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(Object object) {
        Object object2;
        Object object3;
        AtomicReferenceArray atomicReferenceArray;
        int n3;
        int n4;
        int n7;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        bw1_2 bw1_22 = this;
        Object object4 = object;
        while (true) {
            Object e2;
            atomicLongFieldUpdater = f;
            long l2 = atomicLongFieldUpdater.get(this);
            long l3 = 0x3000000000000000L & l2;
            long l4 = 0L;
            int n8 = 1;
            Object object5 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object5 != false) {
                l3 = 0x2000000000000000L & l2;
                long l7 = l3 - l4;
                Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object6 == false) return n8;
                return 2;
            }
            l3 = 0x3FFFFFFFL & l2;
            int n10 = (int)l3;
            long l8 = 0xFFFFFFFC0000000L & l2;
            n7 = 30;
            n4 = (int)(l8 >>= n7);
            object5 = n4 + 2;
            n3 = bw1_22.c;
            int n14 = n10 & n3;
            if ((object5 = (Object)(object5 & n3)) == n14) {
                return n8;
            }
            object5 = bw1_22.b;
            n14 = -1 >>> 2;
            atomicReferenceArray = bw1_22.d;
            if (object5 == false && (e2 = atomicReferenceArray.get((int)(object5 = (Object)(n4 & n3)))) != null) {
                int n15 = bw1_22.a;
                n7 = 1024;
                if (n15 < n7) return n8;
                n7 = (n4 -= n10) & n14;
                if (n7 <= (n10 = n15 >> 1)) continue;
                return n8;
            }
            n10 = n4 + 1 & n14;
            long l12 = 0xF00000003FFFFFFFL & l2;
            l4 = n10;
            l3 = l4 << n7;
            object3 = f;
            object2 = this;
            n7 = (int)(((AtomicLongFieldUpdater)object3).compareAndSet(this, l2, l12 |= l3) ? 1 : 0);
            if (n7 != 0) break;
        }
        n7 = n4 & n3;
        atomicReferenceArray.set(n7, object4);
        object3 = bw1_22;
        do {
            long l14;
            long l15;
            long l16;
            long l17;
            if ((l17 = (l16 = (l15 = atomicLongFieldUpdater.get(object3) & 0x1000000000000000L) - (l14 = 0L)) == 0L ? 0 : (l16 < 0L ? -1 : 1)) == false) return 0;
            object3 = ((bw1_2)object3).c();
            object2 = ((bw1_2)object3).d;
            int n16 = ((bw1_2)object3).c & n4;
            Object e5 = ((AtomicReferenceArray)object2).get(n16);
            boolean bl2 = e5 instanceof Bw1$a;
            if (!bl2) return 0;
            Bw1$a bw1$a = (Bw1$a)e5;
            l17 = bw1$a.a;
            if (l17 != n4) return 0;
            ((AtomicReferenceArray)object2).set(n16, object4);
        } while (object3 != null);
        return 0;
    }

    public final boolean b() {
        boolean bl2;
        long l2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean bl3;
        do {
            atomicLongFieldUpdater = f;
            l2 = atomicLongFieldUpdater.get(this);
            long l3 = 0x2000000000000000L;
            long l4 = l2 & l3;
            bl2 = true;
            long l7 = 0L;
            long l8 = l4 - l7;
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) {
                return bl2;
            }
            l4 = 0x1000000000000000L & l2;
            long l12 = l4 - l7;
            object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object == false) continue;
            return false;
        } while (!(bl3 = atomicLongFieldUpdater.compareAndSet(this, l2, l3 |= l2)));
        return bl2;
    }

    public final bw1_2 c() {
        bw1_2 bw1_22;
        Object object;
        long l2;
        long l3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long l4;
        long l7;
        long l8;
        long l12;
        while ((l12 = (l8 = (l7 = (l4 = (atomicLongFieldUpdater = f).get(this)) & (l3 = 0x1000000000000000L)) - (l2 = 0L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) {
            l2 = l4 | l3;
            object = atomicLongFieldUpdater;
            bw1_22 = this;
            l7 = l2;
            boolean bl2 = atomicLongFieldUpdater.compareAndSet(this, l4, l2);
            if (!bl2) continue;
            l4 = l2;
            break;
        }
        while ((bw1_22 = (bw1_2)((AtomicReferenceFieldUpdater)(object = e)).get(this)) == null) {
            Object var20_16;
            int n3 = this.a * 2;
            int n4 = this.b;
            bw1_22 = new bw1_2(n3, n4 != 0);
            l7 = 0x3FFFFFFFL & l4;
            n4 = (int)l7;
            l2 = (0xFFFFFFFC0000000L & l4) >> 30;
            n3 = (int)l2;
            while (true) {
                int n7 = this.c;
                int n8 = n4 & n7;
                if (n8 == (n7 &= n3)) break;
                Object object2 = this.d.get(n8);
                if (object2 == null) {
                    object2 = new Object(n4);
                }
                AtomicReferenceArray atomicReferenceArray = bw1_22.d;
                l12 = bw1_22.c & n4;
                atomicReferenceArray.set((int)l12, object2);
                ++n4;
            }
            l7 = 0xEFFFFFFFFFFFFFFFL & l4;
            atomicLongFieldUpdater.set(bw1_22, l7);
            do {
                var20_16 = null;
            } while ((n3 = (int)(((AtomicReferenceFieldUpdater)object).compareAndSet(this, null, bw1_22) ? 1 : 0)) == 0 && (var20_16 = ((AtomicReferenceFieldUpdater)object).get(this)) == null);
        }
        return bw1_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object d() {
        var1_1 = this;
        do lbl-1000:
        // 3 sources

        {
            block7: {
                if ((var11_7 = (cfr_temp_0 = (var7_5 = (var3_3 = (var2_2 = bw1_2.f).get(var1_1)) & (var5_4 = 0x1000000000000000L)) - (var9_6 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != false) {
                    return bw1_2.g;
                }
                var12_8 = 0x3FFFFFFFL;
                var11_7 = (int)(var3_3 & var12_8);
                var7_5 = (0xFFFFFFFC0000000L & var3_3) >> 30;
                var14_9 = (int)var7_5;
                var15_10 = var1_1.c;
                var16_11 = var11_7 & var15_10;
                if ((var14_9 &= var15_10) == var16_11) {
                    return null;
                }
                var17_12 = var1_1.d;
                var18_13 = var17_12.get(var16_11);
                var14_9 = (int)var1_1.b;
                if (var18_13 != null) break block7;
                if (var14_9 == 0) ** GOTO lbl-1000
                return null;
            }
            var19_14 = var18_13 instanceof Bw1$a;
            if (var19_14 != 0) {
                return null;
            }
            ++var11_7;
            var19_14 = -1 >>> 2;
            var11_7 = var11_7 & var19_14;
            var20_15 = var3_3 & 0xC0000000L;
            var9_6 = var11_7;
            var22_16 = this;
            var23_17 = var18_13;
            var7_5 = var20_15 |= var9_6;
            var24_18 = var2_2.compareAndSet(this, var3_3, var20_15);
            if (var24_18 == 0) continue;
            var17_12.set(var16_11, null);
            return var18_13;
        } while (var14_9 == 0);
        var2_2 = var1_1;
        while (true) {
            var22_16 = bw1_2.f;
            var25_19 = var22_16.get(var2_2);
            var3_3 = var25_19 & var12_8;
            var27_20 = (int)var3_3;
            var7_5 = var25_19 & var5_4;
            var28_21 = 0L;
            cfr_temp_1 = var7_5 - var28_21;
            var30_22 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var30_22 /* !! */  != false) {
                var2_2 = var2_2.c();
                var7_5 = 0xC0000000L;
            } else {
                var7_5 = 0xC0000000L;
                var31_23 = var25_19 & var7_5;
                var33_24 = var31_23 | var9_6;
                var11_7 = (long)var22_16.compareAndSet(var2_2, var25_19, var33_24);
                if (var11_7 == false) continue;
                var22_16 = var2_2.d;
                var24_18 = var2_2.c & var27_20;
                var22_16.set(var24_18, null);
                var24_18 = 0;
                var2_2 = null;
            }
            if (var2_2 == null) break;
        }
        return var23_17;
    }
}

