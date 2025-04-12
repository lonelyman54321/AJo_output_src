/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from lE
 */
public class le_2
implements dr_2 {
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicLongFieldUpdater g;
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicReferenceFieldUpdater j;
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final Function1 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final ie_2 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Class<le_2> clazz = le_2.class;
        d = AtomicLongFieldUpdater.newUpdater(clazz, "sendersAndCloseStatus$volatile");
        e = AtomicLongFieldUpdater.newUpdater(clazz, "receivers$volatile");
        f = AtomicLongFieldUpdater.newUpdater(clazz, "bufferEnd$volatile");
        g = AtomicLongFieldUpdater.newUpdater(clazz, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> clazz2 = Object.class;
        h = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "sendSegment$volatile");
        i = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "receiveSegment$volatile");
        j = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "bufferEndSegment$volatile");
        k = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "_closeCause$volatile");
        l = AtomicReferenceFieldUpdater.newUpdater(clazz, clazz2, "closeHandler$volatile");
    }

    public le_2(int n3, Function1 object) {
        this.a = n3;
        this.b = object;
        if (n3 >= 0) {
            Object object2;
            int n4;
            Object object3 = pe_2.a;
            long l2 = n3 != 0 ? (n3 != (n4 = -1 >>> 1) ? (long)n3 : Long.MAX_VALUE) : 0L;
            this.bufferEnd$volatile = l2;
            this.completedExpandBuffersAndPauseFlag$volatile = l2 = f.get(this);
            int n7 = 3;
            long l3 = 0L;
            this.sendSegment$volatile = object2 = new wr_2(l3, null, this, n7);
            this.receiveSegment$volatile = object2;
            n4 = (int)(this.D() ? 1 : 0);
            if (n4 != 0) {
                object2 = pe_2.a;
                object3 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>";
                Intrinsics.checkNotNull(object2, (String)object3);
            }
            this.bufferEndSegment$volatile = object2;
            if (object != null) {
                object2 = new ie_2(this);
            } else {
                n3 = 0;
                object2 = null;
            }
            this.c = object2;
            this._closeCause$volatile = object2 = pe_2.s;
            return;
        }
        String string2 = Gj0.b(n3, "Invalid channel capacity: ", ", should be >=0");
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object G(le_2 var0, f80_0 var1_1) {
        block9: {
            block8: {
                block13: {
                    block12: {
                        block10: {
                            block11: {
                                var2_2 = var1_1 instanceof lE$e;
                                if (var2_2) {
                                    var3_3 /* !! */  = var1_1;
                                    var3_3 /* !! */  = (lE$e)var1_1;
                                    var4_4 = var3_3 /* !! */ .c;
                                    var5_5 = -1 << -1;
                                    var6_6 = var4_4 & var5_5;
                                    if (var6_6 != 0) {
                                        var3_3 /* !! */ .c = var4_4 -= var5_5;
lbl10:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                }
                                var3_3 /* !! */  = new lE$e((le_2)var0, (f80_0)var1_1);
                                ** while (true)
                                var7_7 = var3_3 /* !! */ ;
                                var1_1 = var3_3 /* !! */ .a;
                                var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                var4_4 = var7_7.c;
                                var5_5 = 1;
                                if (var4_4 == 0) break block10;
                                if (var4_4 != var5_5) break block11;
                                vl2_2.b(var1_1);
                                var1_1 = (vr_2)var1_1;
                                var0 = var1_1.a;
                                break block12;
                            }
                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var0;
                        }
                        vl2_2.b(var1_1);
                        var1_1 = (wr_2)le_2.i.get(var0);
                        while (true) {
                            if ((var4_4 = (int)var0.B()) != 0) {
                                var0 = var0.u();
                                var1_1 = new VR$a((Throwable)var0);
                                break block8;
                            }
                            var8_8 = le_2.e;
                            var9_9 = var8_8.getAndIncrement(var0);
                            var4_4 = pe_2.b;
                            var11_10 = var4_4;
                            var11_10 = var9_9 / var11_10;
                            var13_11 = var4_4;
                            var6_6 = (int)(var9_9 % var13_11);
                            var13_11 = var1_1.c;
                            cfr_temp_0 = var13_11 - var11_10;
                            var4_4 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                            if (var4_4 != 0) {
                                var8_8 = var0.t(var11_10, (wr_2)var1_1);
                                if (var8_8 == null) continue;
                                var1_1 = var8_8;
                            }
                            var15_12 = var0;
                            var8_8 = var0.L((wr_2)var1_1, var6_6, var9_9, null);
                            if (var8_8 == (var15_12 = pe_2.m)) break block9;
                            var15_12 = pe_2.o;
                            if (var8_8 != var15_12) break;
                            var11_10 = var0.x();
                            cfr_temp_1 = var9_9 - var11_10;
                            var4_4 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                            if (var4_4 >= 0) continue;
                            var1_1.a();
                        }
                        var15_12 = pe_2.n;
                        if (var8_8 == var15_12) {
                            var7_7.c = var5_5;
                            var8_8 = var0;
                            if ((var0 = var0.H((wr_2)var1_1, var6_6, var9_9, var7_7)) == var3_3 /* !! */ ) {
                                return var3_3 /* !! */ ;
                            } else {
                                ** GOTO lbl68
                            }
                        }
                        break block13;
                    }
                    var1_1 = var0;
                    break block8;
                }
                var1_1.a();
                var1_1 = var8_8;
            }
            return var1_1;
        }
        var1_1 = "unexpected".toString();
        var0 = new IllegalStateException((String)var1_1);
        throw var0;
    }

    public static final wr_2 a(le_2 le_22, long l2, wr_2 wr_22) {
        boolean bl2;
        Object object;
        int n3;
        Object object2;
        Object object3;
        wx2_2 wx2_22;
        Object object4;
        boolean bl3;
        le_22.getClass();
        Object object5 = pe_2.a;
        object5 = oe_2.a;
        block0: while (!(bl3 = zx2_2.b(object4 = c40_0.a(wr_22, l2, (Function2)object5)))) {
            wx2_22 = zx2_2.a(object4);
            while (true) {
                object3 = h;
                object2 = (wx2_2)((AtomicReferenceFieldUpdater)object3).get(le_22);
                long l3 = ((wx2_2)object2).c;
                long l4 = wx2_22.c;
                long l7 = l3 - l4;
                Object object6 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object6 >= 0) break block0;
                n3 = wx2_22.j();
                if (n3 == 0) continue block0;
                do {
                    if ((n3 = ((AtomicReferenceFieldUpdater)object3).compareAndSet(le_22, object2, wx2_22)) == 0) continue;
                    bl2 = ((wx2_2)object2).f();
                    if (!bl2) break block0;
                    ((d40_0)object2).e();
                    break block0;
                } while ((object = ((AtomicReferenceFieldUpdater)object3).get(le_22)) == object2);
                boolean bl4 = wx2_22.f();
                if (!bl4) continue;
                wx2_22.e();
            }
        }
        bl2 = zx2_2.b(object4);
        bl3 = false;
        wx2_22 = null;
        object3 = e;
        if (bl2) {
            le_22.r();
            int n4 = pe_2.b;
            l2 = n4;
            long l8 = wr_22.c * l2;
            long l12 = ((AtomicLongFieldUpdater)object3).get(le_22);
            long l14 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (l14 < 0) {
                wr_22.a();
            }
        } else {
            wr_22 = (wr_2)zx2_2.a(object4);
            long l15 = wr_22.c;
            long l16 = l15 - l2;
            Object object7 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object7 > 0) {
                long l17;
                long l18;
                long l19;
                int n7 = pe_2.b;
                l2 = (long)n7 * l15;
                while ((n3 = (l19 = (l18 = 0xFFFFFFFFFFFFFFFL & (l17 = ((AtomicLongFieldUpdater)(object2 = d)).get(le_22))) - l2) == 0L ? 0 : (l19 < 0L ? -1 : 1)) < 0) {
                    n3 = 60;
                    int n8 = (int)(l17 >> n3);
                    long l20 = (long)n8 << n3;
                    object = le_22;
                    object7 = ((AtomicLongFieldUpdater)object2).compareAndSet(le_22, l17, l18 += l20);
                    if (object7 == false) continue;
                }
                n7 = pe_2.b;
                l2 = n7;
                long l21 = ((AtomicLongFieldUpdater)object3).get(le_22);
                long l22 = (l15 *= l2) - l21;
                long l23 = l22 == 0L ? 0 : (l22 < 0L ? -1 : 1);
                if (l23 < 0) {
                    wr_22.a();
                }
            } else {
                wx2_22 = wr_22;
            }
        }
        return wx2_22;
    }

    public static final void b(le_2 object, Object object2, CancellableContinuationImpl cancellableContinuationImpl) {
        Function1 function1 = ((le_2)object).b;
        if (function1 != null) {
            CoroutineContext coroutineContext = cancellableContinuationImpl.e;
            hz0_2.a(function1, object2, coroutineContext);
        }
        object = ((le_2)object).w();
        object2 = tl2_2.b;
        object = vl2_2.a((Throwable)object);
        cancellableContinuationImpl.resumeWith(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int c(le_2 object, wr_2 wr_22, int n3, Object object2, long l2, Object object3, boolean bl2) {
        object.getClass();
        wr_22.n(n3, object2);
        if (bl2) {
            return ((le_2)object).M(wr_22, n3, object2, l2, object3, bl2);
        }
        Object object4 = wr_22.l(n3);
        int n4 = 1;
        if (object4 == null) {
            boolean bl3 = ((le_2)object).e(l2);
            if (bl3) {
                object4 = pe_2.d;
                bl3 = wr_22.k(n3, null, object4);
                if (!bl3) return ((le_2)object).M(wr_22, n3, object2, l2, object3, bl2);
                return 1;
            }
            if (object3 == null) {
                return 3;
            }
            bl3 = wr_22.k(n3, null, object3);
            if (!bl3) return ((le_2)object).M(wr_22, n3, object2, l2, object3, bl2);
            return 2;
        }
        boolean bl4 = object4 instanceof me3_2;
        if (!bl4) return ((le_2)object).M(wr_22, n3, object2, l2, object3, bl2);
        wr_22.n(n3, null);
        int n7 = (int)(((le_2)object).J(object4, object2) ? 1 : 0);
        if (n7 != 0) {
            object = pe_2.i;
            wr_22.o(n3, object);
            return 0;
        }
        object = pe_2.k;
        object2 = wr_22.f;
        int n8 = n3 * 2 + n4;
        if ((object2 = ((AtomicReferenceArray)object2).getAndSet(n8, object)) == object) return 5;
        wr_22.m(n3, n4 != 0);
        return 5;
    }

    public static void y(le_2 le_22) {
        le_22.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        long l2 = atomicLongFieldUpdater.addAndGet(le_22, 1L);
        long l3 = 0x4000000000000000L;
        long l4 = 0L;
        long l7 = (l2 &= l3) - l4;
        long l8 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (l8 != false) {
            long l12;
            while ((l8 = (l12 = (l2 = atomicLongFieldUpdater.get(le_22) & l3) - l4) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false) {
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean A(long var1_1, boolean var3_2) {
        block24: {
            var4_3 = this;
            var5_4 = 60;
            var6_5 = var1_1 >> var5_4;
            var8_6 = (int)var6_5;
            var9_7 = false;
            if (var8_6 == 0 || var8_6 == (var10_8 = 1)) break block24;
            var5_4 = 2;
            var11_9 = le_2.e;
            var12_10 = 0xFFFFFFFFFFFFFFFL;
            if (var8_6 != var5_4) {
                var5_4 = 3;
                if (var8_6 == var5_4) {
                    var6_5 = var1_1 & var12_10;
                    var14_11 = this.n(var6_5);
                    var15_14 = 0;
                    var8_6 = 0;
                    var16_16 = null;
                    var17_19 = null;
                    block0: do {
                        block1: for (var18_20 = pe_2.b - var10_8; (var19_22 = -1) < var18_20; var18_20 += -1) {
                            var20_23 = pe_2.b;
                            var21_25 = var20_23;
                            var23_27 = var14_11.c * var21_25;
                            var21_25 = var18_20;
                            var23_27 += var21_25;
                            block2: while ((var25_29 = var14_11.l(var18_20)) != (var26_30 = pe_2.i)) {
                                var26_30 = pe_2.d;
                                var27_31 = var14_11.f;
                                var28_32 = var4_3.b;
                                if (var25_29 == var26_30) {
                                    var29_33 = var11_9.get(var4_3);
                                    cfr_temp_0 = var23_27 - var29_33;
                                    var31_34 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                    if (var31_34 /* !! */  < 0) break block0;
                                    var26_30 = pe_2.l;
                                    var20_23 = (int)var14_11.k(var18_20, var25_29, var26_30);
                                    if (var20_23 == 0) continue;
                                    if (var28_32 != null) {
                                        var19_22 = var18_20 * 2;
                                        var32_35 /* !! */  = var27_31.get(var19_22);
                                        var16_16 = hz0_2.b(var28_32, var32_35 /* !! */ , var16_16);
                                    }
                                    var14_11.n(var18_20, null);
                                    var14_11.i();
                                    continue block1;
                                }
                                var26_30 = pe_2.e;
                                if (var25_29 != var26_30 && var25_29 != null) {
                                    var31_34 /* !! */  = var25_29 instanceof me3_2;
                                    if (var31_34 /* !! */  == false && (var31_34 /* !! */  = (long)(var25_29 instanceof ne3_2)) == false) {
                                        var26_30 = pe_2.g;
                                        if (var25_29 == var26_30 || var25_29 == (var27_31 = pe_2.f)) break block0;
                                        if (var25_29 == var26_30) continue;
                                        continue block1;
                                    }
                                    var29_33 = var11_9.get(var4_3);
                                    cfr_temp_1 = var23_27 - var29_33;
                                    var31_34 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                                    if (var31_34 /* !! */  < 0) break block0;
                                    var31_34 /* !! */  = var25_29 instanceof ne3_2;
                                    if (var31_34 /* !! */  != false) {
                                        var26_30 = var25_29;
                                        var26_30 = ((ne3_2)var25_29).a;
                                    } else {
                                        var26_30 = var25_29;
                                        var26_30 = (me3_2)var25_29;
                                    }
                                    var32_35 /* !! */  = pe_2.l;
                                    var19_22 = (int)var14_11.k(var18_20, var25_29, var32_35 /* !! */ );
                                    if (var19_22 != 0) {
                                        if (var28_32 != null) {
                                            var19_22 = var18_20 * 2;
                                            var32_35 /* !! */  = var27_31.get(var19_22);
                                            var16_16 = hz0_2.b(var28_32, var32_35 /* !! */ , var16_16);
                                        }
                                        var17_19 = dh1_0.a(var17_19, var26_30);
                                        var14_11.n(var18_20, null);
                                        var14_11.i();
                                        continue block1;
                                    }
                                    while (true) {
                                        var19_22 = -1;
                                        continue block2;
                                        break;
                                    }
                                }
                                if ((var19_22 = (int)var14_11.k(var18_20, var25_29, var32_35 /* !! */  = pe_2.l)) == 0) ** continue;
                                var14_11.i();
                                continue block1;
                            }
                            break block0;
                        }
                    } while ((var14_11 = (wr_2)((d40_0)(var33_37 = d40_0.b).get(var14_11))) != null);
                    if (var17_19 != null) {
                        var5_4 = var17_19 instanceof ArrayList;
                        if (var5_4 == 0) {
                            var17_19 = (me3_2)var17_19;
                            var4_3.I((me3_2)var17_19, false);
                        } else {
                            var14_11 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>";
                            Intrinsics.checkNotNull(var17_19, (String)var14_11);
                            var17_19 = (ArrayList)var17_19;
                            var15_14 = -1;
                            for (var5_4 = var17_19.size() - var10_8; var15_14 < var5_4; var5_4 += -1) {
                                var33_37 = (me3_2)var17_19.get(var5_4);
                                var4_3.I((me3_2)var33_37, false);
                            }
                        }
                    }
                    if (var16_16 == null) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            var9_7 = true;
                            break block24;
                            break;
                        }
                    }
                    throw var16_16;
                }
                var14_12 = hj0_0.a(var8_6, "unexpected close status: ");
                var14_12 = var14_12.toString();
                var16_17 = new IllegalStateException(var14_12);
                throw var16_17;
            }
            var6_5 = var1_1 & var12_10;
            this.n(var6_5);
            if (!var3_2) ** GOTO lbl-1000
            block6: while (true) {
                block25: {
                    var14_13 = le_2.i;
                    var16_18 = (wr_2)var14_13.get(var4_3);
                    var12_10 = var11_9.get(var4_3);
                    var34_39 = this.x();
                    cfr_temp_2 = var34_39 - var12_10;
                    var20_24 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                    if (var20_24 /* !! */  <= 0) ** GOTO lbl-1000
                    var23_28 = var16_18.c;
                    var18_21 = pe_2.b;
                    var34_39 = var18_21;
                    var21_26 = var12_10 / var34_39;
                    cfr_temp_3 = var23_28 - var21_26;
                    var36_40 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                    if (var36_40 /* !! */  != false && (var16_18 = var4_3.t(var21_26, (wr_2)var16_18)) == null) {
                        var14_13 = (wr_2)var14_13.get(var4_3);
                        var6_5 = var14_13.c;
                        cfr_temp_4 = var6_5 - var21_26;
                        var15_15 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                        if (var15_15 /* !! */  >= 0) continue;
                        ** continue;
                    }
                    var16_18.a();
                    var34_39 = var12_10 % var34_39;
                    var5_4 = (int)var34_39;
                    do {
                        if ((var33_38 = var16_18.l(var5_4)) == null || var33_38 == (var32_36 = pe_2.e)) continue;
                        var14_13 = pe_2.d;
                        if (var33_38 == var14_13 || var33_38 != (var14_13 = pe_2.j) && var33_38 != (var14_13 = pe_2.l) && var33_38 != (var14_13 = pe_2.i) && var33_38 != (var14_13 = pe_2.h) && (var33_38 == (var14_13 = pe_2.g) || var33_38 != (var14_13 = pe_2.f) && (var18_21 = (int)((cfr_temp_5 = var12_10 - (var6_5 = var11_9.get(var4_3))) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) == 0)) {
                            break block6;
                        }
                        break block25;
                    } while ((var18_21 = (int)var16_18.k(var5_4, var33_38, var32_36 = pe_2.h)) == 0);
                    this.s();
                }
                var6_5 = 1L;
                var34_39 = var12_10 + var6_5;
                var14_13 = le_2.e;
                var16_18 = this;
                var14_13.compareAndSet(this, var12_10, var34_39);
            }
        }
        return var9_7;
    }

    public final boolean B() {
        long l2 = d.get(this);
        return this.A(l2, true);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        boolean bl2;
        long l2;
        long l3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long l4 = atomicLongFieldUpdater.get(this);
        long l7 = l4 - (l3 = 0L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false && (object = (l2 = l4 - (l3 = Long.MAX_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            bl2 = false;
            atomicLongFieldUpdater = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void E(long var1_1, wr_2 var3_2) {
        while ((var6_4 = (cfr_temp_0 = (var4_3 = var3_2.c) - var1_1) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) < 0 && (var7_5 /* !! */  = (wr_2)var3_2.c()) != null) {
            var3_2 = var7_5 /* !! */ ;
        }
        block1: while (true) {
            if ((var8_6 = var3_2.d()) && (var9_7 = (wr_2)var3_2.c()) != null) {
                var3_2 = var9_7;
                continue;
            }
            while (true) {
                var9_7 = le_2.j;
                var10_8 = (wx2_2)var9_7.get(this);
                var4_3 = var10_8.c;
                var11_9 = var3_2.c;
                cfr_temp_1 = var4_3 - var11_9;
                var13_10 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                if (var13_10 /* !! */  >= 0) ** GOTO lbl24
                var14_11 = var3_2.j();
                if (var14_11) ** break;
                continue block1;
                do {
                    if (!(var14_11 = var9_7.compareAndSet(this, var10_8, var3_2))) continue;
                    var8_6 = var10_8.f();
                    if (var8_6) {
                        var10_8.e();
                    }
lbl24:
                    // 4 sources

                    return;
                } while ((var7_5 /* !! */  = var9_7.get(this)) == var10_8);
                var8_6 = var3_2.f();
                if (!var8_6) continue;
                var3_2.e();
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final Object F(f80_0 var1_1, Object var2_2) {
        var4_4 = zj1_2.b(var1_1);
        var5_5 = 1;
        var3_3 = new CancellableContinuationImpl(var5_5, (f80_0)var4_4);
        var3_3.r();
        var4_4 = this.b;
        if (var4_4 == null) ** GOTO lbl-1000
        var5_5 = 0;
        if ((var2_2 = hz0_2.b((Function1)var4_4, var2_2, null)) != null) {
            var4_4 = this.w();
            yc0_2.a((Throwable)var2_2, (Throwable)var4_4);
            var4_4 = tl2_2.b;
            var2_2 = vl2_2.a((Throwable)var2_2);
            var3_3.resumeWith(var2_2);
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = this.w();
            var4_4 = tl2_2.b;
            var2_2 = vl2_2.a((Throwable)var2_2);
            var3_3.resumeWith(var2_2);
        }
        var2_2 = var3_3.q();
        var3_3 = j90_0.COROUTINE_SUSPENDED;
        if (var2_2 == var3_3) {
            var4_4 = "frame";
            Intrinsics.checkNotNullParameter(var1_1, (String)var4_4);
        }
        if (var2_2 == var3_3) {
            return var2_2;
        }
        return Unit.a;
    }

    /*
     * Exception decompiling
     */
    public final Object H(wr_2 var1_1, int var2_2, long var3_3, f80_0 var5_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [9 : 317->320)] java.lang.Throwable
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

    public final void I(me3_2 object, boolean bl2) {
        block5: {
            block10: {
                block7: {
                    block9: {
                        Object object2;
                        block8: {
                            block6: {
                                boolean bl3 = object instanceof lE$b;
                                if (bl3) break block5;
                                bl3 = object instanceof bl_2;
                                if (!bl3) break block6;
                                object = (f80_0)object;
                                tL2$a tL2$a = tl2_2.b;
                                Serializable serializable = bl2 ? this.v() : this.w();
                                serializable = vl2_2.a(serializable);
                                object.resumeWith(serializable);
                                break block7;
                            }
                            bl2 = object instanceof ze2_2;
                            if (!bl2) break block8;
                            object = ((ze2_2)object).a;
                            Object object3 = tl2_2.b;
                            object3 = this.u();
                            VR$a vR$a = new VR$a((Throwable)object3);
                            object3 = new vr_2(vR$a);
                            ((CancellableContinuationImpl)object).resumeWith(object3);
                            break block7;
                        }
                        bl2 = object instanceof lE$a;
                        if (!bl2) break block9;
                        object = (lE$a)object;
                        CancellableContinuationImpl cancellableContinuationImpl = ((lE$a)object).b;
                        Intrinsics.checkNotNull(cancellableContinuationImpl);
                        ((lE$a)object).b = null;
                        ((lE$a)object).a = object2 = pe_2.l;
                        object = ((lE$a)object).c.u();
                        if (object == null) {
                            object = tl2_2.b;
                            object = Boolean.FALSE;
                            cancellableContinuationImpl.resumeWith(object);
                        } else {
                            object2 = tl2_2.b;
                            object = vl2_2.a((Throwable)object);
                            cancellableContinuationImpl.resumeWith(object);
                        }
                        break block7;
                    }
                    bl2 = object instanceof gx2_2;
                    if (!bl2) break block10;
                    object = (gx2_2)object;
                    gh3_2 gh3_22 = pe_2.l;
                    object.d(this, gh3_22);
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Unexpected waiter: ");
            stringBuilder.append(object);
            object = stringBuilder.toString().toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        ((lE$b)object).getClass();
        object = tl2_2.b;
        throw null;
    }

    public final boolean J(Object object, Object object2) {
        block10: {
            boolean bl2;
            block7: {
                gx0_2 gx0_22;
                Object object3;
                boolean bl3;
                block9: {
                    block8: {
                        block6: {
                            bl3 = object instanceof gx2_2;
                            if (!bl3) break block6;
                            object = (gx2_2)object;
                            bl2 = object.d(this, object2);
                            break block7;
                        }
                        bl3 = object instanceof ze2_2;
                        object3 = this.b;
                        gx0_22 = null;
                        if (!bl3) break block8;
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
                        object = ((ze2_2)object).a;
                        vr_2 vr_22 = new vr_2(object2);
                        if (object3 != null) {
                            gx0_22 = new ne_2(this);
                        }
                        bl2 = pe_2.a((bl_2)object, vr_22, gx0_22);
                        break block7;
                    }
                    bl3 = object instanceof lE$a;
                    if (!bl3) break block9;
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
                    object = (lE$a)object;
                    CancellableContinuationImpl cancellableContinuationImpl = ((lE$a)object).b;
                    Intrinsics.checkNotNull(cancellableContinuationImpl);
                    ((lE$a)object).b = null;
                    ((lE$a)object).a = object2;
                    object3 = Boolean.TRUE;
                    object = ((lE$a)object).c.b;
                    if (object != null) {
                        gx0_22 = new je_2((Function1)object, object2);
                    }
                    bl2 = pe_2.a(cancellableContinuationImpl, object3, gx0_22);
                    break block7;
                }
                bl3 = object instanceof bl_2;
                if (!bl3) break block10;
                String string2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>";
                Intrinsics.checkNotNull(object, string2);
                object = (bl_2)object;
                if (object3 != null) {
                    gx0_22 = new me_2(this);
                }
                bl2 = pe_2.a((bl_2)object, object2, gx0_22);
            }
            return bl2;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected receiver type: ");
        stringBuilder.append(object);
        object = stringBuilder.toString().toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean K(Object object, wr_2 object2, int n3) {
        block9: {
            cs3_0 cs3_02;
            void var1_9;
            block8: {
                block10: {
                    int n4 = object instanceof bl_2;
                    if (n4 != 0) {
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        bl_2 bl_22 = (bl_2)object;
                        Unit unit = Unit.a;
                        return pe_2.a(bl_22, unit, null) != 0;
                    }
                    n4 = object instanceof gx2_2;
                    if (n4 == 0) break block9;
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                    fx2_2 fx2_22 = (fx2_2)object;
                    Unit unit = Unit.a;
                    int n7 = fx2_22.j(this, unit);
                    n4 = 1;
                    if (n7 == 0) break block10;
                    if (n7 != n4) {
                        int n8 = 2;
                        if (n7 != n8) {
                            n8 = 3;
                            if (n7 != n8) {
                                StringBuilder stringBuilder = new StringBuilder("Unexpected internal result: ");
                                stringBuilder.append(n7);
                                String string2 = stringBuilder.toString().toString();
                                IllegalStateException illegalStateException = new IllegalStateException(string2);
                                throw illegalStateException;
                            }
                            cs3_0 cs3_03 = cs3_0.ALREADY_SELECTED;
                            break block8;
                        } else {
                            cs3_0 cs3_04 = cs3_0.CANCELLED;
                        }
                        break block8;
                    } else {
                        cs3_0 cs3_05 = cs3_0.REREGISTER;
                    }
                    break block8;
                }
                cs3_0 cs3_06 = cs3_0.SUCCESSFUL;
            }
            cs3_0 cs3_07 = cs3_0.REREGISTER;
            if (var1_9 == cs3_07) {
                void var3_18;
                void var2_13;
                var2_13.n((int)var3_18, null);
            }
            if (var1_9 != (cs3_02 = cs3_0.SUCCESSFUL)) return 0 != 0;
            return 1 != 0;
        }
        boolean bl2 = object instanceof lE$b;
        if (bl2) {
            ((lE$b)object).getClass();
            Boolean bl3 = Boolean.TRUE;
            pe_2.a(null, bl3, null);
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected waiter: ");
        stringBuilder.append(object);
        String string3 = stringBuilder.toString().toString();
        IllegalStateException illegalStateException = new IllegalStateException(string3);
        throw illegalStateException;
    }

    public final Object L(wr_2 object, int n3, long l2, Object object2) {
        Object object3;
        block22: {
            gh3_2 gh3_22;
            boolean bl2;
            Object object4;
            long l3;
            Object object5 = ((wr_2)object).l(n3);
            AtomicReferenceArray atomicReferenceArray = ((wr_2)object).f;
            long l4 = 0xFFFFFFFFFFFFFFFL;
            AtomicLongFieldUpdater atomicLongFieldUpdater = d;
            if (object5 == null) {
                l3 = atomicLongFieldUpdater.get(this) & l4;
                long l7 = l2 - l3;
                object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object4 >= 0) {
                    if (object2 == null) {
                        return pe_2.n;
                    }
                    bl2 = ((wr_2)object).k(n3, object5, object2);
                    if (bl2) {
                        this.s();
                        return pe_2.m;
                    }
                }
            } else {
                gh3_22 = pe_2.d;
                if (object5 == gh3_22 && (bl2 = ((wr_2)object).k(n3, object5, gh3_22 = pe_2.i))) {
                    this.s();
                    int n4 = n3 * 2;
                    Object e2 = atomicReferenceArray.get(n4);
                    ((wr_2)object).n(n3, null);
                    return e2;
                }
            }
            while (true) {
                if ((object5 = ((wr_2)object).l(n3)) != null && object5 != (gh3_22 = pe_2.e)) {
                    gh3_22 = pe_2.d;
                    if (object5 == gh3_22) {
                        gh3_22 = pe_2.i;
                        bl2 = ((wr_2)object).k(n3, object5, gh3_22);
                        if (!bl2) continue;
                        this.s();
                        int n7 = n3 * 2;
                        object3 = atomicReferenceArray.get(n7);
                        ((wr_2)object).n(n3, null);
                    } else {
                        gh3_22 = pe_2.j;
                        if (object5 == gh3_22) {
                            object3 = pe_2.o;
                        } else {
                            gh3_2 gh3_23 = pe_2.h;
                            if (object5 == gh3_23) {
                                object3 = pe_2.o;
                            } else {
                                gh3_23 = pe_2.l;
                                if (object5 == gh3_23) {
                                    this.s();
                                    object3 = pe_2.o;
                                } else {
                                    boolean bl3;
                                    boolean bl4;
                                    gh3_23 = pe_2.g;
                                    if (object5 == gh3_23 || !(bl4 = ((wr_2)object).k(n3, object5, gh3_23 = pe_2.f))) continue;
                                    int n8 = object5 instanceof ne3_2;
                                    if (n8 != 0) {
                                        object5 = ((ne3_2)object5).a;
                                    }
                                    if (bl3 = this.K(object5, (wr_2)object, n3)) {
                                        object3 = pe_2.i;
                                        ((wr_2)object).o(n3, object3);
                                        this.s();
                                        n8 = n3 * 2;
                                        object3 = atomicReferenceArray.get(n8);
                                        ((wr_2)object).n(n3, null);
                                    } else {
                                        ((wr_2)object).o(n3, gh3_22);
                                        ((wx2_2)object).i();
                                        if (n8 != 0) {
                                            this.s();
                                        }
                                        object3 = object = pe_2.o;
                                    }
                                }
                            }
                        }
                    }
                    break block22;
                }
                l3 = atomicLongFieldUpdater.get(this) & l4;
                long l8 = l2 - l3;
                object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object4 < 0) {
                    gh3_22 = pe_2.h;
                    bl2 = ((wr_2)object).k(n3, object5, gh3_22);
                    if (!bl2) continue;
                    this.s();
                    object3 = pe_2.o;
                    break block22;
                }
                if (object2 == null) {
                    object3 = pe_2.n;
                    break block22;
                }
                bl2 = ((wr_2)object).k(n3, object5, object2);
                if (bl2) break;
            }
            this.s();
            object3 = pe_2.m;
        }
        return object3;
    }

    public final int M(wr_2 wr_22, int n3, Object object, long l2, Object object2, boolean bl2) {
        boolean bl3;
        int n4;
        int n7;
        Object object3;
        block12: {
            while (true) {
                boolean bl4;
                object3 = wr_22.l(n3);
                n7 = 1;
                n4 = 4;
                if (object3 == null) {
                    bl4 = this.e(l2);
                    if (bl4 && !bl2) {
                        object3 = pe_2.d;
                        bl4 = wr_22.k(n3, null, object3);
                        if (!bl4) continue;
                        return n7;
                    }
                    if (bl2) {
                        object3 = pe_2.j;
                        bl4 = wr_22.k(n3, null, object3);
                        if (!bl4) continue;
                        wr_22.i();
                        return n4;
                    }
                    if (object2 == null) {
                        return 3;
                    }
                    bl4 = wr_22.k(n3, null, object2);
                    if (!bl4) continue;
                    return 2;
                }
                gh3_2 gh3_22 = pe_2.e;
                if (object3 != gh3_22) break block12;
                gh3_2 gh3_23 = pe_2.d;
                bl4 = wr_22.k(n3, object3, gh3_23);
                if (bl4) break;
            }
            return n7;
        }
        gh3_2 gh3_24 = pe_2.k;
        int n8 = 5;
        if (object3 == gh3_24) {
            wr_22.n(n3, null);
            return n8;
        }
        object2 = pe_2.h;
        if (object3 == object2) {
            wr_22.n(n3, null);
            return n8;
        }
        object2 = pe_2.l;
        if (object3 == object2) {
            wr_22.n(n3, null);
            this.r();
            return n4;
        }
        wr_22.n(n3, null);
        int n10 = object3 instanceof ne3_2;
        if (n10 != 0) {
            object3 = ((ne3_2)object3).a;
        }
        if (bl3 = this.J(object3, object)) {
            object = pe_2.i;
            wr_22.o(n3, object);
            n8 = 0;
        } else {
            object = wr_22.f;
            n10 = n3 * 2 + n7;
            if ((object = ((AtomicReferenceArray)object).getAndSet(n10, gh3_24)) != gh3_24) {
                wr_22.m(n3, n7 != 0);
            }
        }
        return n8;
    }

    public final void N(long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long l12;
        long l14;
        long l15;
        le_2 le_22 = this;
        int n3 = this.D();
        if (n3 != 0) {
            return;
        }
        while ((l15 = (l14 = (l12 = (atomicLongFieldUpdater2 = f).get(le_22)) - l2) == 0L ? 0 : (l14 < 0L ? -1 : 1)) <= 0) {
        }
        n3 = pe_2.c;
        int n4 = 0;
        while (true) {
            long l16;
            atomicLongFieldUpdater = g;
            l8 = 0x3FFFFFFFFFFFFFFFL;
            if (n4 >= n3) break;
            l7 = atomicLongFieldUpdater2.get(le_22);
            long l17 = l7 - (l4 = atomicLongFieldUpdater.get(le_22) & l8);
            Object object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
            if (object == false && (object = (l16 = l7 - (l4 = atomicLongFieldUpdater2.get(le_22))) == 0L ? 0 : (l16 < 0L ? -1 : 1)) == false) {
                return;
            }
            ++n4;
        }
        while ((n3 = (int)(atomicLongFieldUpdater.compareAndSet(this, l7 = atomicLongFieldUpdater.get(le_22), l4 = (l3 = 0x4000000000000000L) + (l12 = l7 & l8)) ? 1 : 0)) == 0) {
        }
        while (true) {
            long l18;
            long l19;
            long l20;
            l12 = atomicLongFieldUpdater2.get(le_22);
            l7 = atomicLongFieldUpdater.get(le_22);
            l4 = l7 & l8;
            long l21 = l7 & l3;
            long l22 = 0L;
            long l23 = l21 - l22;
            Object object = l23 == 0L ? 0 : (l23 < 0L ? -1 : 1);
            boolean bl2 = object != false;
            Object object2 = l12 == l4 ? 0 : (l12 < l4 ? -1 : 1);
            if (object2 == false && (l20 = (l19 = l12 - (l18 = atomicLongFieldUpdater2.get(le_22))) == 0L ? 0 : (l19 < 0L ? -1 : 1)) == false) {
                while ((n3 = (int)(atomicLongFieldUpdater.compareAndSet(this, l7 = atomicLongFieldUpdater.get(le_22), l4 = l7 & l8) ? 1 : 0)) == 0) {
                }
                return;
            }
            if (bl2) continue;
            atomicLongFieldUpdater.compareAndSet(this, l7, l4 += l3);
        }
    }

    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            String string2 = "Channel was cancelled";
            cancellationException = new CancellationException(string2);
        }
        this.k(cancellationException, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e(long l2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long l3 = atomicLongFieldUpdater.get(this);
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) return true;
        atomicLongFieldUpdater = e;
        l3 = atomicLongFieldUpdater.get(this);
        long l7 = this.a;
        long l8 = l2 - (l3 += l7);
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 >= 0) return false;
        return true;
    }

    public final Object f(f80_0 f80_02) {
        return le_2.G(this, f80_02);
    }

    /*
     * Exception decompiling
     */
    public final Object g(f80_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 328->332)] java.lang.Throwable
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

    public final void i(Lz2$b object) {
        gh3_2 gh3_22;
        boolean bl2;
        Object object2;
        Object object3;
        do {
            object3 = null;
            object2 = l;
            bl2 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(this, null, object);
            if (!bl2) continue;
            return;
        } while ((object3 = (Object)((AtomicReferenceFieldUpdater)object2).get(this)) == null);
        while ((object3 = (Object)((AtomicReferenceFieldUpdater)object2).get(this)) == (gh3_22 = pe_2.q)) {
            gh3_2 gh3_23 = pe_2.r;
            do {
                if (!(bl2 = ((AtomicReferenceFieldUpdater)object2).compareAndSet(this, gh3_22, gh3_23))) continue;
                object3 = this.u();
                ((Lz2$b)object).invoke(object3);
                return;
            } while ((object3 = ((AtomicReferenceFieldUpdater)object2).get(this)) == gh3_22);
        }
        object = pe_2.r;
        if (object3 == object) {
            object3 = "Another handler was already registered and successfully invoked".toString();
            object = new IllegalStateException((String)object3);
            throw object;
        }
        object2 = new StringBuilder("Another handler is already registered: ");
        ((StringBuilder)object2).append(object3);
        object3 = ((StringBuilder)object2).toString().toString();
        object = new IllegalStateException((String)object3);
        throw object;
    }

    public final rr_2 iterator() {
        lE$a lE$a = new lE$a(this);
        return lE$a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object j(Object object) {
        VR$b vR$b;
        Object object2;
        block16: {
            wr_2 wr_22;
            block13: {
                int n3;
                int n4;
                wr_2 wr_23;
                int n7;
                boolean bl2;
                Object object3;
                int n8;
                block14: {
                    Object object4;
                    block15: {
                        long l2;
                        le_2 le_22 = this;
                        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
                        long l3 = atomicLongFieldUpdater.get(this);
                        int n10 = this.A(l3, false);
                        int n14 = 1;
                        long l4 = 0xFFFFFFFFFFFFFFFL;
                        if (n10 != 0) {
                            n8 = 0;
                            object2 = null;
                        } else {
                            n8 = this.e(l3 &= l4) ^ n14;
                        }
                        vR$b = vr_2.b;
                        if (n8 != 0) {
                            return vR$b;
                        }
                        object3 = pe_2.j;
                        object2 = (wr_2)h.get(le_22);
                        while (true) {
                            long l7 = atomicLongFieldUpdater.getAndIncrement(le_22);
                            l2 = l7 & l4;
                            bl2 = le_22.A(l7, false);
                            int n15 = pe_2.b;
                            l7 = n15;
                            long l8 = l2 / l7;
                            n7 = (int)(l2 % l7);
                            l7 = ((wx2_2)object2).c;
                            long l12 = l7 - l8;
                            Object object5 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                            if (object5 != false) {
                                object4 = le_2.a(le_22, l8, (wr_2)object2);
                                if (object4 == null) {
                                    if (!bl2) continue;
                                    object2 = this.w();
                                    return new VR$a((Throwable)object2);
                                }
                                wr_22 = object4;
                            } else {
                                wr_22 = object2;
                            }
                            object2 = this;
                            object4 = wr_22;
                            n10 = n7;
                            wr_23 = wr_22;
                            n4 = n7;
                            n3 = n15;
                            n15 = (int)(bl2 ? 1 : 0);
                            n8 = le_2.c(this, wr_22, n7, object, l2, object3, bl2);
                            if (n8 == 0) break block13;
                            if (n8 == n14) return Unit.a;
                            int n16 = 2;
                            if (n8 == n16) break block14;
                            n16 = 3;
                            if (n8 == n16) break block15;
                            n16 = 4;
                            if (n8 == n16) break;
                            n16 = 5;
                            if (n8 == n16) {
                                wr_22.a();
                            }
                            object2 = wr_23;
                        }
                        object2 = e;
                        l3 = ((AtomicLongFieldUpdater)object2).get(le_22);
                        long l14 = l2 - l3;
                        n10 = (int)(l14 == 0L ? 0 : (l14 < 0L ? -1 : 1));
                        if (n10 < 0) {
                            wr_22.a();
                        }
                        object2 = this.w();
                        return new VR$a((Throwable)object2);
                    }
                    object4 = "unexpected".toString();
                    object2 = new IllegalStateException((String)object4);
                    throw object2;
                }
                if (bl2) {
                    wr_22.i();
                    object2 = this.w();
                    return new VR$a((Throwable)object2);
                }
                n8 = object3 instanceof me3_2;
                if ((object3 = n8 != 0 ? (me3_2)object3 : null) != null) {
                    n7 = n4 + n3;
                    object2 = wr_23;
                    object3.a(wr_23, n7);
                } else {
                    object2 = wr_23;
                }
                break block16;
            }
            object2 = wr_22;
            wr_22.a();
            return Unit.a;
        }
        ((wx2_2)object2).i();
        return vR$b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean k(Throwable object, boolean n3) {
        long l2;
        boolean bl2;
        boolean bl3;
        int n4;
        Object object2;
        Object object3;
        long l3;
        long l4;
        long l7;
        int n7;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long l8;
        int n8;
        block12: {
            n8 = 60;
            l8 = 0xFFFFFFFFFFFFFFFL;
            atomicLongFieldUpdater = d;
            n7 = 1;
            if (n3 != 0) {
                int n10;
                while ((n10 = (int)(l7 = (l4 = atomicLongFieldUpdater.get(this)) >> n8)) == 0) {
                    l7 = l4 & l8;
                    l3 = ((long)n7 << n8) + l7;
                    object3 = atomicLongFieldUpdater;
                    object2 = this;
                    n4 = atomicLongFieldUpdater.compareAndSet(this, l4, l3);
                    if (n4 == 0) continue;
                }
            }
            object3 = pe_2.s;
            do {
                boolean bl4;
                if (!(bl4 = ((AtomicReferenceFieldUpdater)(object2 = k)).compareAndSet(this, object3, object))) continue;
                bl3 = true;
                break block12;
            } while ((object2 = ((AtomicReferenceFieldUpdater)object2).get(this)) == object3);
            bl2 = false;
            object = null;
            bl3 = false;
        }
        int n14 = 3;
        if (n3 != 0) {
            do {
                l4 = atomicLongFieldUpdater.get(this);
                l2 = l4 & l8;
                l7 = (long)n14 << n8;
                l3 = l7 + l2;
                object3 = atomicLongFieldUpdater;
                object2 = this;
            } while (!(bl2 = atomicLongFieldUpdater.compareAndSet(this, l4, l3)));
        } else {
            do {
                if ((n3 = (int)(l2 = (l4 = atomicLongFieldUpdater.get(this)) >> n8)) != 0) {
                    if (n3 != n7) break;
                    l2 = l4 & l8;
                    l7 = n14;
                } else {
                    l2 = l4 & l8;
                    n4 = 2;
                    l7 = n4;
                }
                l3 = l7 = (l7 << n8) + l2;
                object3 = atomicLongFieldUpdater;
                object2 = this;
            } while (!(bl2 = atomicLongFieldUpdater.compareAndSet(this, l4, l7)));
        }
        this.r();
        if (!bl3) return bl3;
        while (true) {
            Object v4;
            Object object4;
            gh3_2 gh3_22 = (object4 = ((AtomicReferenceFieldUpdater)(object = l)).get(this)) == null ? pe_2.q : pe_2.r;
            do {
                boolean bl5;
                if (!(bl5 = ((AtomicReferenceFieldUpdater)object).compareAndSet(this, object4, gh3_22))) continue;
                if (object4 == null) {
                    return bl3;
                }
                object = (Function1)TypeIntrinsics.beforeCheckcastToFunctionOfArity(object4, n7);
                object4 = (Function1)object4;
                object = this.u();
                object4.invoke(object);
                return bl3;
            } while ((v4 = ((AtomicReferenceFieldUpdater)object).get(this)) == object4);
        }
    }

    public final ex2_2 l() {
        gx0_2 gx0_22 = lE$c.a;
        Intrinsics.checkNotNull(gx0_22, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        int n3 = 3;
        gx0_22 = (gx0_2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(gx0_22, n3);
        gx0_2 gx0_23 = lE$d.a;
        Intrinsics.checkNotNull(gx0_23, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        gx0_2 gx0_24 = (gx0_2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(gx0_23, n3);
        gx0_23 = this.c;
        ex2_2 ex2_22 = new ex2_2(this, gx0_22, gx0_24, (ie_2)gx0_23);
        return ex2_22;
    }

    public final Object m() {
        Object object;
        Object object2;
        block13: {
            block11: {
                Object object3;
                block12: {
                    Object object4;
                    object2 = e;
                    long l2 = ((AtomicLongFieldUpdater)object2).get(this);
                    AtomicLongFieldUpdater atomicLongFieldUpdater = d;
                    long l3 = atomicLongFieldUpdater.get(this);
                    boolean bl2 = this.A(l3, true);
                    if (bl2) {
                        object2 = this.u();
                        VR$a vR$a = new VR$a((Throwable)object2);
                        return vR$a;
                    }
                    long l4 = 0xFFFFFFFFFFFFFFFL;
                    object3 = vr_2.b;
                    long l7 = l2 - (l3 &= l4);
                    Object object5 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object5 >= 0) {
                        return object3;
                    }
                    object = pe_2.k;
                    wr_2 wr_22 = (wr_2)i.get(this);
                    while (true) {
                        boolean bl3;
                        if (bl3 = this.B()) {
                            object2 = this.u();
                            object = new VR$a((Throwable)object2);
                            break block11;
                        }
                        l3 = ((AtomicLongFieldUpdater)object2).getAndIncrement(this);
                        object5 = pe_2.b;
                        long l8 = object5;
                        long l12 = l3 / l8;
                        int n3 = (int)(l3 % l8);
                        l8 = wr_22.c;
                        long l14 = l8 - l12;
                        Object object6 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                        if (object6 != false) {
                            object4 = this.t(l12, wr_22);
                            if (object4 == null) continue;
                            wr_22 = object4;
                        }
                        Object object7 = this;
                        object4 = this.L(wr_22, n3, l3, object);
                        if (object4 == (object7 = pe_2.m)) {
                            boolean bl4 = object instanceof me3_2;
                            if ((object = bl4 ? (me3_2)object : null) != null) {
                                object.a(wr_22, n3);
                            }
                            this.N(l3);
                            wr_22.i();
                            break block12;
                        }
                        object7 = pe_2.o;
                        if (object4 != object7) break;
                        l8 = this.x();
                        long l15 = l3 - l8;
                        Object object8 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                        if (object8 >= 0) continue;
                        wr_22.a();
                    }
                    object2 = pe_2.n;
                    if (object4 == object2) break block13;
                    wr_22.a();
                    object3 = object4;
                }
                object = object3;
            }
            return object;
        }
        object = "unexpected".toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final wr_2 n(long l2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        long l3;
        long l4;
        int n3;
        int n4;
        int n7;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block21: {
            long l7;
            boolean bl2;
            object4 = j.get(this);
            object3 = (wr_2)h.get(this);
            long l8 = ((wx2_2)object3).c;
            Object object5 = object4;
            object5 = (wr_2)object4;
            long l12 = ((wx2_2)object5).c;
            long l14 = l8 - l12;
            object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (object2 > 0) {
                object4 = object3;
            }
            object3 = (wr_2)i.get(this);
            l8 = ((wx2_2)object3).c;
            object5 = object4;
            object5 = (wr_2)object4;
            l12 = ((wx2_2)object5).c;
            long l15 = l8 - l12;
            object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object2 > 0) {
                object4 = object3;
            }
            object4 = (d40_0)object4;
            block0: while (true) {
                object4.getClass();
                object3 = d40_0.a.get(object4);
                gh3_2 gh3_22 = c40_0.a;
                object = null;
                boolean bl3 = true;
                do {
                    block25: {
                        block24: {
                            if (!bl3 || (bl3 = false)) break block24;
                            if (object3 == gh3_22) break block25;
                            if ((object3 = (d40_0)object3) != null) {
                                object4 = object3;
                                continue block0;
                            }
                        }
                        if ((n7 = ((AtomicReferenceFieldUpdater)(object3 = d40_0.a)).compareAndSet(object4, null, gh3_22)) == 0) continue;
                    }
                    object4 = (wr_2)object4;
                    bl2 = this.C();
                    n4 = -1;
                    n7 = 1;
                    if (bl2) {
                        break block0;
                    }
                    break block21;
                } while ((object3 = ((AtomicReferenceFieldUpdater)object3).get(object4)) == null);
            }
            object3 = object4;
            block2: while (true) {
                n3 = pe_2.b - n7;
                while (true) {
                    block22: {
                        gh3_2 gh3_23;
                        Object object6;
                        int n8;
                        block27: {
                            block28: {
                                block26: {
                                    l4 = -1;
                                    if (n4 >= n3) break block26;
                                    n8 = pe_2.b;
                                    l3 = n8;
                                    l7 = ((wx2_2)object3).c * l3;
                                    l3 = n3;
                                    object6 = e;
                                    long l16 = (l7 += l3) - (l3 = ((AtomicLongFieldUpdater)object6).get(this));
                                    Object object7 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                                    if (object7 >= 0) break block27;
                                    break block28;
                                }
                                atomicReferenceFieldUpdater = d40_0.b;
                                if ((object3 = (wr_2)((d40_0)atomicReferenceFieldUpdater.get(object3))) != null) continue block2;
                            }
                            l7 = l4;
                            break block2;
                        }
                        do {
                            if ((object6 = ((wr_2)object3).l(n3)) == null || object6 == (gh3_23 = pe_2.e)) continue;
                            gh3_23 = pe_2.d;
                            if (object6 == gh3_23) {
                                break block2;
                            }
                            break block22;
                        } while ((n8 = (int)(((wr_2)object3).k(n3, object6, gh3_23 = pe_2.l) ? 1 : 0)) == 0);
                        ((wx2_2)object3).i();
                    }
                    n3 += -1;
                }
                break;
            }
            bl2 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1);
            if (bl2) {
                this.p(l7);
            }
        }
        object3 = object4;
        block5: while (object3 != null) {
            n3 = pe_2.b - n7;
            while (true) {
                block23: {
                    block31: {
                        block30: {
                            block29: {
                                if (n4 >= n3) break block29;
                                l4 = pe_2.b;
                                l3 = ((wx2_2)object3).c * l4;
                                l4 = n3;
                                long l17 = (l3 += l4) - l2;
                                object2 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                                if (object2 < 0) break block30;
                                break block31;
                            }
                            atomicReferenceFieldUpdater = d40_0.b;
                            object3 = (wr_2)((d40_0)atomicReferenceFieldUpdater.get(object3));
                            continue block5;
                        }
                        if (object == null) return object4;
                        int n10 = object instanceof ArrayList;
                        if (n10 == 0) {
                            object = (me3_2)object;
                            this.I((me3_2)object, n7 != 0);
                            return object4;
                        }
                        String string2 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>";
                        Intrinsics.checkNotNull(object, string2);
                        object = (ArrayList)object;
                        n10 = ((ArrayList)object).size() - n7;
                        while (n4 < n10) {
                            me3_2 me3_22 = (me3_2)((ArrayList)object).get(n10);
                            this.I(me3_22, n7 != 0);
                            n10 += -1;
                        }
                        return object4;
                    }
                    while (true) {
                        gh3_2 gh3_24;
                        Object object8;
                        if ((object8 = ((wr_2)object3).l(n3)) != null && object8 != (gh3_24 = pe_2.e)) {
                            boolean bl4 = object8 instanceof ne3_2;
                            if (bl4) {
                                gh3_24 = pe_2.l;
                                bl4 = ((wr_2)object3).k(n3, object8, gh3_24);
                                if (!bl4) continue;
                                object8 = ((ne3_2)object8).a;
                                object = dh1_0.a(object, object8);
                                ((wr_2)object3).m(n3, n7 != 0);
                                break block23;
                            }
                            bl4 = object8 instanceof me3_2;
                            if (bl4) {
                                gh3_24 = pe_2.l;
                                bl4 = ((wr_2)object3).k(n3, object8, gh3_24);
                                if (!bl4) continue;
                                object = dh1_0.a(object, object8);
                                ((wr_2)object3).m(n3, n7 != 0);
                            }
                            break block23;
                        }
                        gh3_24 = pe_2.l;
                        object2 = ((wr_2)object3).k(n3, object8, gh3_24);
                        if (object2 != false) break;
                    }
                    ((wx2_2)object3).i();
                }
                n3 += -1;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public Object o(f80_0 var1_1, Object var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 14[TRYBLOCK] [14 : 725->729)] java.lang.Throwable
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

    public final void p(long l2) {
        Object object;
        Object object2 = (wr_2)i.get(this);
        while (true) {
            Object object3;
            object = e;
            long l3 = ((AtomicLongFieldUpdater)object).get(this);
            int n3 = this.a;
            long l4 = (long)n3 + l3;
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long l7 = atomicLongFieldUpdater.get(this);
            long l8 = l2 - (l4 = Math.max(l4, l7));
            Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object4 < 0) {
                return;
            }
            l4 = 1L;
            long l12 = l3 + l4;
            Object object5 = this;
            long l14 = l3;
            int n4 = ((AtomicLongFieldUpdater)object).compareAndSet(this, l3, l12);
            if (n4 == 0) continue;
            n4 = pe_2.b;
            long l15 = n4;
            l14 = l3 / l15;
            int n7 = (int)(l3 % l15);
            l15 = ((wx2_2)object2).c;
            long l16 = l15 - l14;
            Object object6 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
            if (object6 != false) {
                object = this.t(l14, (wr_2)object2);
                if (object == null) continue;
                object2 = object;
            }
            object5 = this;
            object4 = n7;
            l12 = l3;
            object = this.L((wr_2)object2, n7, l3, null);
            if (object == (object5 = pe_2.o)) {
                l15 = this.x();
                long l17 = l3 - l15;
                object3 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                if (object3 >= 0) continue;
                ((d40_0)object2).a();
                continue;
            }
            ((d40_0)object2).a();
            object5 = this.b;
            if (object5 == null) continue;
            object3 = 0;
            if ((object = hz0_2.b((Function1)object5, object, null)) != null) break;
        }
        throw object;
    }

    public final boolean q(Throwable throwable) {
        return this.k(throwable, false);
    }

    public final boolean r() {
        long l2 = d.get(this);
        return this.A(l2, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void s() {
        block26: {
            var1_1 = this;
            var2_2 = this.D();
            if (var2_2 != 0) {
                return;
            }
            var3_3 = le_2.j;
            var4_4 = (wr_2)var3_3.get(this);
            var5_5 = var4_4;
            block0: while (true) {
                block27: {
                    var4_4 = le_2.f;
                    var6_6 = var4_4.getAndIncrement(var1_1);
                    var2_2 = pe_2.b;
                    var8_7 = var2_2;
                    var8_7 = var6_6 / var8_7;
                    var10_8 = this.x();
                    cfr_temp_0 = var10_8 - var6_6;
                    var12_9 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var12_9 /* !! */  <= 0) {
                        var10_8 = var5_5.c;
                        cfr_temp_1 = var10_8 - var8_7;
                        var12_9 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var12_9 /* !! */  < 0 && (var13_10 = var5_5.c()) != null) {
                            var1_1.E(var8_7, var5_5);
                        }
                        le_2.y(this);
                        return;
                    }
                    var10_8 = var5_5.c;
                    cfr_temp_2 = var10_8 - var8_7;
                    var12_9 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                    if (var12_9 /* !! */  != false) {
                        var13_10 = oe_2.a;
                        block1: while ((var12_9 /* !! */  = (long)zx2_2.b(var14_11 = c40_0.a(var5_5, var8_7, (Function2)var13_10))) == false) {
                            var15_12 = zx2_2.a(var14_11);
                            while (true) {
                                var16_13 = (wx2_2)var3_3.get(var1_1);
                                var17_14 = var16_13.c;
                                var19_15 = var15_12.c;
                                cfr_temp_3 = var17_14 - var19_15;
                                var21_16 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                if (var21_16 /* !! */  >= 0) break block1;
                                var22_17 = var15_12.j();
                                if (!var22_17) continue block1;
                                do {
                                    if (!(var22_17 = var3_3.compareAndSet(var1_1, var16_13, var15_12))) continue;
                                    var23_18 = (int)var16_13.f();
                                    if (var23_18 == 0) break block1;
                                    var16_13.e();
                                    break block1;
                                } while ((var24_19 = var3_3.get(var1_1)) == var16_13);
                                var25_20 /* !! */  = var15_12.f();
                                if (!var25_20 /* !! */ ) continue;
                                var15_12.e();
                            }
                        }
                        var23_18 = zx2_2.b(var14_11);
                        var22_17 = false;
                        var24_19 = null;
                        if (var23_18 != 0) {
                            this.r();
                            var1_1.E(var8_7, var5_5);
                            le_2.y(this);
                        } else {
                            var13_10 = (wr_2)zx2_2.a(var14_11);
                            var26_21 = var13_10.c;
                            cfr_temp_4 = var26_21 - var8_7;
                            var28_22 /* !! */  = (long)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                            if (var28_22 /* !! */  > 0) {
                                var8_7 = 1L;
                                var10_8 = var6_6 + var8_7;
                                var29_23 = pe_2.b;
                                var31_24 = var26_21 * var29_23;
                                var4_4 = le_2.f;
                                var33_25 = this;
                                var2_2 = (int)var4_4.compareAndSet(this, var10_8, var31_24);
                                if (var2_2 != 0) {
                                    var26_21 = var26_21 * var29_23 - var6_6;
                                    var4_4 = le_2.g;
                                    var34_26 = var4_4.addAndGet(var1_1, var26_21);
                                    var36_27 = 0x4000000000000000L;
                                    var26_21 = 0L;
                                    cfr_temp_5 = (var34_26 &= var36_27) - var26_21;
                                    var25_20 /* !! */  = cfr_temp_5 == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1);
                                    if (var25_20 /* !! */ ) {
                                        while (var25_20 /* !! */  = (cfr_temp_6 = (var34_26 = var4_4.get(var1_1) & var36_27) - var26_21) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) {
                                        }
                                    }
                                } else {
                                    le_2.y(this);
                                }
                            } else {
                                var24_19 = var13_10;
                            }
                        }
                        if (var24_19 == null) continue;
                        var5_5 = var24_19;
                    }
                    var2_2 = pe_2.b;
                    var8_7 = var2_2;
                    var8_7 = var6_6 % var8_7;
                    var38_28 = (int)var8_7;
                    var4_4 = var5_5.l(var38_28);
                    var23_18 = var4_4 instanceof me3_2;
                    var14_11 = le_2.e;
                    if (var23_18 == 0 || (var23_18 = (cfr_temp_7 = var6_6 - (var31_24 = var14_11.get(var1_1))) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) < 0 || (var23_18 = (int)var5_5.k(var38_28, var4_4, var13_10 = pe_2.g)) == 0) break block27;
                    var2_2 = (int)var1_1.K(var4_4, var5_5, var38_28);
                    if (var2_2 != 0) {
                        var4_4 = pe_2.d;
                        var5_5.o(var38_28, var4_4);
                        break block26;
                    }
                    var4_4 = pe_2.j;
                    var5_5.o(var38_28, var4_4);
                    var5_5.i();
                    ** GOTO lbl135
                }
                while (true) {
                    block30: {
                        block29: {
                            block28: {
                                if ((var23_18 = (var4_4 = var5_5.l(var38_28)) instanceof me3_2) == 0) break block28;
                                var31_24 = var14_11.get(var1_1);
                                cfr_temp_8 = var6_6 - var31_24;
                                var23_18 = (int)(cfr_temp_8 == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1));
                                if (var23_18 < 0) {
                                    var15_12 = var4_4;
                                    var15_12 = (me3_2)var4_4;
                                    var13_10 = new ne3_2((me3_2)var15_12);
                                    var2_2 = (int)var5_5.k(var38_28, var4_4, var13_10);
                                    if (var2_2 == 0) continue;
                                    break block26;
                                }
                                var13_10 = pe_2.g;
                                var23_18 = (int)var5_5.k(var38_28, var4_4, var13_10);
                                if (var23_18 == 0) continue;
                                var2_2 = (int)var1_1.K(var4_4, var5_5, var38_28);
                                if (var2_2 != 0) {
                                    var4_4 = pe_2.d;
                                    var5_5.o(var38_28, var4_4);
                                    break block26;
                                }
                                var4_4 = pe_2.j;
                                var5_5.o(var38_28, var4_4);
                                var5_5.i();
                                break block29;
                            }
                            var13_10 = pe_2.j;
                            if (var4_4 != var13_10) break block30;
                        }
                        le_2.y(this);
                        continue block0;
                    }
                    if (var4_4 == null) {
                        var13_10 = pe_2.e;
                        var2_2 = (int)var5_5.k(var38_28, var4_4, var13_10);
                        if (var2_2 == 0) continue;
                        break block26;
                    }
                    var13_10 = pe_2.d;
                    if (var4_4 == var13_10 || var4_4 == (var13_10 = pe_2.h) || var4_4 == (var13_10 = pe_2.i) || var4_4 == (var13_10 = pe_2.k) || var4_4 == (var13_10 = pe_2.l)) break block26;
                    var13_10 = pe_2.f;
                    if (var4_4 != var13_10) break block0;
                }
                break;
            }
            var13_10 = new StringBuilder("Unexpected cell state: ");
            var13_10.append(var4_4);
            var4_4 = var13_10.toString().toString();
            var33_25 = new IllegalStateException((String)var4_4);
            throw var33_25;
        }
        le_2.y(this);
    }

    public final wr_2 t(long l2, wr_2 wr_22) {
        long l3;
        int n3;
        AtomicLongFieldUpdater<Object> atomicLongFieldUpdater;
        Object object;
        long l4;
        long l7;
        wx2_2 wx2_22;
        Object object2;
        boolean bl2;
        Object object3 = pe_2.a;
        object3 = oe_2.a;
        block0: while (!(bl2 = zx2_2.b(object2 = c40_0.a(wr_22, l2, (Function2)object3)))) {
            wx2_22 = zx2_2.a(object2);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                wx2_2 wx2_23 = (wx2_2)atomicReferenceFieldUpdater.get(this);
                l7 = wx2_23.c;
                l4 = wx2_22.c;
                long l8 = l7 - l4;
                Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object4 >= 0) break block0;
                object = wx2_22.j();
                if (object == 0) continue block0;
                do {
                    if ((object = atomicReferenceFieldUpdater.compareAndSet(this, wx2_23, wx2_22)) == 0) continue;
                    n3 = (int)(wx2_23.f() ? 1 : 0);
                    if (n3 == 0) break block0;
                    wx2_23.e();
                    break block0;
                } while ((atomicLongFieldUpdater = atomicReferenceFieldUpdater.get(this)) == wx2_23);
                l3 = (long)wx2_22.f();
                if (l3 == false) continue;
                wx2_22.e();
            }
        }
        n3 = zx2_2.b(object2);
        bl2 = false;
        wx2_22 = null;
        if (n3 != 0) {
            this.r();
            int n4 = pe_2.b;
            l2 = n4;
            long l12 = wr_22.c * l2;
            l2 = this.x();
            l3 = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1);
            if (l3 < 0) {
                wr_22.a();
            }
        } else {
            wr_22 = (wr_2)zx2_2.a(object2);
            n3 = this.D();
            long l14 = wr_22.c;
            if (n3 == 0) {
                object3 = f;
                long l15 = ((AtomicLongFieldUpdater)object3).get(this);
                l7 = pe_2.b;
                long l16 = l2 - (l15 /= l7);
                object = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (object <= 0) {
                    block3: while (true) {
                        object3 = j;
                        object2 = (wx2_2)((AtomicReferenceFieldUpdater)object3).get(this);
                        l7 = ((wx2_2)object2).c;
                        long l17 = l7 - l14;
                        Object object5 = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
                        if (object5 >= 0 || (object = (Object)wr_22.j()) == 0) break;
                        do {
                            if ((object = (Object)((AtomicReferenceFieldUpdater)object3).compareAndSet(this, object2, wr_22)) == 0) continue;
                            n3 = (int)(((wx2_2)object2).f() ? 1 : 0);
                            if (n3 == 0) break block3;
                            ((d40_0)object2).e();
                            break block3;
                        } while ((atomicLongFieldUpdater = ((AtomicReferenceFieldUpdater)object3).get(this)) == object2);
                        n3 = (int)(wr_22.f() ? 1 : 0);
                        if (n3 == 0) continue;
                        wr_22.e();
                    }
                }
            }
            if ((n3 = l14 == l2 ? 0 : (l14 < l2 ? -1 : 1)) > 0) {
                long l18;
                int n7 = pe_2.b;
                l2 = (long)n7 * l14;
                while ((n3 = (int)((l18 = (l4 = (atomicLongFieldUpdater = e).get(this)) - l2) == 0L ? 0 : (l18 < 0L ? -1 : 1))) < 0 && (n3 = (int)(atomicLongFieldUpdater.compareAndSet(this, l4, l2) ? 1 : 0)) == 0) {
                }
                n7 = pe_2.b;
                l2 = n7;
                long l19 = (l14 *= l2) - (l2 = this.x());
                n3 = (int)(l19 == 0L ? 0 : (l19 < 0L ? -1 : 1));
                if (n3 < 0) {
                    wr_22.a();
                }
            } else {
                wx2_22 = wr_22;
            }
        }
        return wx2_22;
    }

    public final String toString() {
        Serializable serializable;
        block16: {
            long l2;
            long l3;
            Object object;
            Object object2;
            Object object3;
            le_2 le_22 = this;
            serializable = new StringBuilder();
            Iterator iterator = d;
            long l4 = ((AtomicLongFieldUpdater)((Object)iterator)).get(this) >> 60;
            int n3 = (int)l4;
            int n4 = 2;
            int n7 = 3;
            if (n3 != n4) {
                if (n3 == n7) {
                    object3 = "cancelled,";
                    ((StringBuilder)serializable).append((String)object3);
                }
            } else {
                object3 = "closed,";
                ((StringBuilder)serializable).append((String)object3);
            }
            String string2 = "capacity=";
            object3 = new StringBuilder(string2);
            int c2 = le_22.a;
            ((StringBuilder)object3).append(c2);
            int n8 = 44;
            ((StringBuilder)object3).append((char)n8);
            object3 = ((StringBuilder)object3).toString();
            ((StringBuilder)serializable).append((String)object3);
            ((StringBuilder)serializable).append("data=[");
            object3 = new wr_2[n7];
            Object object4 = i.get(le_22);
            Object object5 = null;
            object3[0] = object4;
            object4 = h.get(le_22);
            int n10 = 1;
            object3[n10] = object4;
            object4 = j.get(le_22);
            object3[n4] = object4;
            iterator = xx_2.i((Object[])object3);
            object3 = new ArrayList();
            iterator = iterator.iterator();
            while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                object4 = iterator.next();
                object2 = object4;
                object2 = (wr_2)object4;
                object = pe_2.a;
                if (object2 == object) continue;
                ((ArrayList)object3).add(object4);
            }
            iterator = ((ArrayList)object3).iterator();
            n3 = (int)(iterator.hasNext() ? 1 : 0);
            if (n3 == 0) break block16;
            object3 = iterator.next();
            n7 = (int)(iterator.hasNext() ? 1 : 0);
            if (n7 != 0) {
                object4 = object3;
                object4 = (wr_2)object3;
                l3 = ((wx2_2)object4).c;
                do {
                    Object object6 = object4 = iterator.next();
                    object6 = (wr_2)object4;
                    l2 = ((wx2_2)object6).c;
                    long l7 = l3 - l2;
                    Object object7 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object7 <= 0) continue;
                    object3 = object4;
                    l3 = l2;
                } while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0);
            }
            object3 = (wr_2)object3;
            iterator = e;
            l2 = ((AtomicLongFieldUpdater)((Object)iterator)).get(le_22);
            long l8 = this.x();
            while (true) {
                block25: {
                    block15: {
                        n4 = pe_2.b;
                        object4 = null;
                        for (n7 = 0; n7 < n4; ++n7) {
                            block24: {
                                Object object8;
                                block18: {
                                    block23: {
                                        Object object9;
                                        block22: {
                                            block21: {
                                                block20: {
                                                    block19: {
                                                        Object object10;
                                                        block17: {
                                                            long l12;
                                                            l3 = ((wx2_2)object3).c;
                                                            long l14 = pe_2.b;
                                                            l3 *= l14;
                                                            l14 = n7;
                                                            long l15 = (l3 += l14) - l8;
                                                            object10 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                                                            if (object10 >= 0 && (l12 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) >= 0) break block15;
                                                            object9 = ((wr_2)object3).l(n7);
                                                            object5 = ((wr_2)object3).f;
                                                            n10 = n7 * 2;
                                                            object5 = ((AtomicReferenceArray)object5).get(n10);
                                                            n10 = object9 instanceof bl_2;
                                                            if (n10 == 0) break block17;
                                                            n10 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
                                                            object8 = n10 < 0 && object10 >= 0 ? "receive" : (object10 < 0 && n10 >= 0 ? "send" : "cont");
                                                            break block18;
                                                        }
                                                        n10 = object9 instanceof gx2_2;
                                                        if (n10 == 0) break block19;
                                                        n10 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
                                                        object8 = n10 < 0 && object10 >= 0 ? "onReceive" : (object10 < 0 && n10 >= 0 ? "onSend" : "select");
                                                        break block18;
                                                    }
                                                    n10 = object9 instanceof ze2_2;
                                                    if (n10 == 0) break block20;
                                                    object8 = "receiveCatching";
                                                    break block18;
                                                }
                                                n10 = object9 instanceof lE$b;
                                                if (n10 == 0) break block21;
                                                object8 = "sendBroadcast";
                                                break block18;
                                            }
                                            n10 = object9 instanceof ne3_2;
                                            if (n10 == 0) break block22;
                                            object2 = "EB(";
                                            object8 = new StringBuilder((String)object2);
                                            ((StringBuilder)object8).append(object9);
                                            char c3 = ')';
                                            ((StringBuilder)object8).append(c3);
                                            object8 = ((StringBuilder)object8).toString();
                                            break block18;
                                        }
                                        object8 = pe_2.f;
                                        n10 = (int)(Intrinsics.areEqual(object9, object8) ? 1 : 0);
                                        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object9, object8 = pe_2.g) ? 1 : 0)) != 0) break block23;
                                        if (object9 == null || (n10 = (int)(Intrinsics.areEqual(object9, object8 = pe_2.e) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object9, object8 = pe_2.i) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object9, object8 = pe_2.h) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object9, object8 = pe_2.k) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object9, object8 = pe_2.j) ? 1 : 0)) != 0 || (n10 = (int)(Intrinsics.areEqual(object9, object8 = pe_2.l) ? 1 : 0)) != 0) break block24;
                                        object8 = object9.toString();
                                        break block18;
                                    }
                                    object8 = "resuming_sender";
                                }
                                if (object5 != null) {
                                    object = "(";
                                    object2 = new StringBuilder((String)object);
                                    ((StringBuilder)object2).append((String)object8);
                                    ((StringBuilder)object2).append((char)n8);
                                    ((StringBuilder)object2).append(object5);
                                    ((StringBuilder)object2).append("),");
                                    object5 = ((StringBuilder)object2).toString();
                                    ((StringBuilder)serializable).append((String)object5);
                                } else {
                                    object5 = new StringBuilder();
                                    ((StringBuilder)object5).append((String)object8);
                                    ((StringBuilder)object5).append((char)n8);
                                    object5 = ((StringBuilder)object5).toString();
                                    ((StringBuilder)serializable).append((String)object5);
                                }
                            }
                            object5 = null;
                            n10 = 1;
                        }
                        object3 = iterator = ((d40_0)object3).c();
                        object3 = (wr_2)((Object)iterator);
                        if (object3 != null) break block25;
                    }
                    if ((n4 = (int)le3_2.D((CharSequence)((Object)serializable))) == n8) {
                        n4 = ((StringBuilder)serializable).length();
                        n7 = 1;
                        iterator = ((StringBuilder)serializable).deleteCharAt(n4 -= n7);
                        object3 = "deleteCharAt(...)";
                        Intrinsics.checkNotNullExpressionValue(iterator, (String)object3);
                    }
                    ((StringBuilder)serializable).append("]");
                    return ((StringBuilder)serializable).toString();
                }
                object5 = null;
                n10 = 1;
            }
        }
        serializable = new NoSuchElementException();
        throw serializable;
    }

    public final Throwable u() {
        return (Throwable)k.get(this);
    }

    public final Throwable v() {
        Throwable throwable = this.u();
        if (throwable == null) {
            String string2 = "Channel was closed";
            throwable = new NoSuchElementException(string2);
        }
        return throwable;
    }

    public final Throwable w() {
        Throwable throwable = this.u();
        if (throwable == null) {
            String string2 = "Channel was closed";
            throwable = new IllegalStateException(string2);
        }
        return throwable;
    }

    public final long x() {
        return d.get(this) & 0xFFFFFFFFFFFFFFFL;
    }
}

