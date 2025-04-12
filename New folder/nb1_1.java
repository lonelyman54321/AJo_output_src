/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.NetworkOnMainThreadException
 *  android.webkit.MimeTypeMap
 */
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from Nb1
 */
public final class nb1_1
implements el0_0 {
    public static final ti_1 f;
    public static final ti_1 g;
    public final String a;
    public final ba2 b;
    public final rq1_2 c;
    public final rq1_2 d;
    public final boolean e;

    static {
        boolean bl2;
        TI$a tI$a = new TI$a();
        tI$a.a = bl2 = true;
        tI$a.b = bl2;
        f = tI$a.a();
        tI$a = new TI$a();
        tI$a.a = bl2;
        tI$a.f = bl2;
        g = tI$a.a();
    }

    public nb1_1(String string2, ba2 ba22, hh3_2 hh3_22, hh3_2 hh3_23, boolean bl2) {
        this.a = string2;
        this.b = ba22;
        this.c = hh3_22;
        this.d = hh3_23;
        this.e = bl2;
    }

    public static String d(String string2, jn1_0 object) {
        String string3;
        block6: {
            MimeTypeMap mimeTypeMap;
            block5: {
                string3 = null;
                if ((object = object != null ? ((jn1_0)object).a : null) == null) break block5;
                mimeTypeMap = null;
                String string4 = "text/plain";
                boolean bl2 = kotlin.text.b.s((String)object, string4, false);
                if (!bl2) break block6;
            }
            if ((string2 = m.b(mimeTypeMap = MimeTypeMap.getSingleton(), string2)) != null) {
                return string2;
            }
        }
        if (object != null) {
            char c2 = ';';
            string3 = StringsKt.i0((String)object, c2);
        }
        return string3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(f80_0 var1_1) {
        block35: {
            block37: {
                block33: {
                    block38: {
                        block39: {
                            block34: {
                                block36: {
                                    block40: {
                                        block41: {
                                            var2_5 = 2;
                                            var3_6 = var1_1 instanceof Nb1$c;
                                            if (!var3_6) ** GOTO lbl-1000
                                            var4_7 /* !! */  = var1_1;
                                            var4_7 /* !! */  = (Nb1$c)var1_1;
                                            var5_8 = var4_7 /* !! */ .f;
                                            var6_9 = -1 << -1;
                                            var7_10 = var5_8 & var6_9;
                                            if (var7_10 != 0) {
                                                var4_7 /* !! */ .f = var5_8 -= var6_9;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var4_7 /* !! */  = new Nb1$c(this, (f80_0)var1_1);
                                            }
                                            var1_1 = var4_7 /* !! */ .d;
                                            var8_11 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                            var6_9 = var4_7 /* !! */ .f;
                                            var9_12 /* !! */  = "response body == null";
                                            var10_13 = null;
                                            var11_14 = 1;
                                            if (var6_9 == 0) break block40;
                                            if (var6_9 == var11_14) break block41;
                                            if (var6_9 != var2_5) {
                                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                throw var1_1;
                                            }
                                            var8_11 /* !! */  = (cl2_2)var4_7 /* !! */ .c;
                                            var12_15 /* !! */  = var4_7 /* !! */ .b;
                                            var4_7 /* !! */  = var4_7 /* !! */ .a;
                                            try {
                                                vl2_2.b(var1_1);
                                                ** GOTO lbl-1000
                                            }
                                            catch (Exception var1_2) {
                                                break block33;
                                            }
                                        }
                                        var12_15 /* !! */  = (lj_0)var4_7 /* !! */ .c;
                                        var13_16 = var4_7 /* !! */ .b;
                                        var14_17 = var4_7 /* !! */ .a;
                                        try {
                                            vl2_2.b(var1_1);
                                            var15_18 = var13_16;
                                            var13_16 = var12_15 /* !! */ ;
                                            var12_15 /* !! */  = var15_18;
                                            break block34;
                                        }
                                        catch (Exception var1_3) {
                                            break block35;
                                        }
                                    }
                                    vl2_2.b(var1_1);
                                    var1_1 = this.b;
                                    var12_15 /* !! */  = var1_1.n;
                                    var6_9 = (int)var12_15 /* !! */ .getReadEnabled();
                                    var14_17 = this.a;
                                    if (var6_9 != 0 && (var12_15 /* !! */  = (Lq0)this.d.getValue()) != null) {
                                        var1_1 = var1_1.i;
                                        if (var1_1 == null) {
                                            var1_1 = var14_17;
                                        }
                                        var1_1 = var12_15 /* !! */ .b((String)var1_1);
                                    } else {
                                        var1_1 = null;
                                    }
                                    if (var1_1 != null) {
                                        try {
                                            var12_15 /* !! */  = this.c();
                                            var16_20 = var1_1.getMetadata();
                                            var12_15 /* !! */  = var12_15 /* !! */ .h((hn2_2)var16_20);
                                            var12_15 /* !! */  = var12_15 /* !! */ .d;
                                            if (var12_15 /* !! */  != null && (var6_9 = (int)((cfr_temp_0 = (var17_21 = var12_15 /* !! */ .longValue()) - (var19_22 = 0L)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0) {
                                                var4_7 /* !! */  = this.g((Lq0$b)var1_1);
                                                var8_11 /* !! */  = nb1_1.d((String)var14_17, null);
                                                var12_15 /* !! */  = ri0.DISK;
                                                return new N93((Fe1)var4_7 /* !! */ , (String)var8_11 /* !! */ , (ri0)var12_15 /* !! */ );
                                            }
                                        }
                                        catch (Exception var21_24) {
                                            var13_16 = var1_1;
                                            var1_1 = var21_24;
                                            break block35;
                                        }
                                        var6_9 = (int)this.e;
                                        if (var6_9 != 0) {
                                            var16_20 = this.e();
                                            var22_33 = this.f((Lq0$b)var1_1);
                                            var12_15 /* !! */  = new lJ$b((kj2_2)var16_20, (jJ)var22_33);
                                            var12_15 /* !! */  = var12_15 /* !! */ .a();
                                            var16_20 = var12_15 /* !! */ .a;
                                            if (var16_20 == null && (var16_20 = var12_15 /* !! */ .b) != null) {
                                                var4_7 /* !! */  = this.g((Lq0$b)var1_1);
                                                var8_11 /* !! */  = var16_20.b;
                                                var8_11 /* !! */  = var8_11 /* !! */ .getValue();
                                                var8_11 /* !! */  = (jn1_0)var8_11 /* !! */ ;
                                                var8_11 /* !! */  = nb1_1.d((String)var14_17, (jn1_0)var8_11 /* !! */ );
                                                var12_15 /* !! */  = ri0.DISK;
                                                return new N93((Fe1)var4_7 /* !! */ , (String)var8_11 /* !! */ , (ri0)var12_15 /* !! */ );
                                            }
                                            break block36;
                                        } else {
                                            var4_7 /* !! */  = this.g((Lq0$b)var1_1);
                                            var8_11 /* !! */  = this.f((Lq0$b)var1_1);
                                            if (var8_11 /* !! */  != null) {
                                                var8_11 /* !! */  = var8_11 /* !! */ .b;
                                                var8_11 /* !! */  = var8_11 /* !! */ .getValue();
                                                var10_13 = var8_11 /* !! */ ;
                                                var10_13 = (jn1_0)var8_11 /* !! */ ;
                                            }
                                            var8_11 /* !! */  = nb1_1.d((String)var14_17, var10_13);
                                            var12_15 /* !! */  = ri0.DISK;
                                            return new N93((Fe1)var4_7 /* !! */ , (String)var8_11 /* !! */ , (ri0)var12_15 /* !! */ );
                                        }
                                    }
                                    var14_17 = this.e();
                                    var12_15 /* !! */  = new lJ$b((kj2_2)var14_17, null);
                                    var12_15 /* !! */  = var12_15 /* !! */ .a();
                                }
                                var14_17 = var12_15 /* !! */ .a;
                                Intrinsics.checkNotNull(var14_17);
                                var4_7 /* !! */ .a = this;
                                var4_7 /* !! */ .b = var1_1;
                                var4_7 /* !! */ .c = var12_15 /* !! */ ;
                                var4_7 /* !! */ .f = var11_14;
                                var13_16 = this.b((kj2_2)var14_17, (f80_0)var4_7 /* !! */ );
                                if (var13_16 == var8_11 /* !! */ ) {
                                    return var8_11 /* !! */ ;
                                }
                                var14_17 = this;
                                var15_19 /* !! */  = var12_15 /* !! */ ;
                                var12_15 /* !! */  = var1_1;
                                var1_1 = var13_16;
                                var13_16 = var15_19 /* !! */ ;
                            }
                            try {
                                var1_1 = (cl2_2)var1_1;
                                var16_20 = m.a;
                                var16_20 = var1_1.g;
                                if (var16_20 == null) break block37;
                            }
                            catch (Exception var1_4) {
                                var13_16 = var12_15 /* !! */ ;
                                break block35;
                            }
                            try {
                                var22_33 = var13_16.a;
                                var13_16 = var13_16.b;
                                var12_15 /* !! */  = var14_17.h((Lq0$b)var12_15 /* !! */ , (kj2_2)var22_33, (cl2_2)var1_1, (jJ)var13_16);
                                var13_16 = var14_17.a;
                                if (var12_15 /* !! */  == null) break block38;
                                break block39;
lbl134:
                                // 1 sources

                                while (true) {
                                    var8_11 /* !! */  = var1_1;
                                    var1_1 = var21_28;
                                    break block33;
                                    break;
                                }
                            }
                            catch (Exception var21_28) {
                                ** continue;
                            }
                        }
                        var4_7 /* !! */  = var14_17.g((Lq0$b)var12_15 /* !! */ );
                        var8_11 /* !! */  = var14_17.f((Lq0$b)var12_15 /* !! */ );
                        if (var8_11 /* !! */  != null) {
                            var8_11 /* !! */  = var8_11 /* !! */ .b;
                            var8_11 /* !! */  = var8_11 /* !! */ .getValue();
                            var10_13 = var8_11 /* !! */ ;
                            var10_13 = (jn1_0)var8_11 /* !! */ ;
                        }
                        var8_11 /* !! */  = nb1_1.d((String)var13_16, (jn1_0)var10_13);
                        var9_12 /* !! */  = ri0.NETWORK;
                        return new N93((Fe1)var4_7 /* !! */ , (String)var8_11 /* !! */ , (ri0)var9_12 /* !! */ );
                    }
                    var22_33 = var16_20.h();
                    var23_34 = var22_33.request(var19_22 = 1L);
                    if (var23_34) {
                        var8_11 /* !! */  = var16_20.h();
                        var9_12 /* !! */  = var14_17.b;
                        var9_12 /* !! */  = var9_12 /* !! */ .a;
                        var22_33 = new a00(var9_12 /* !! */ , var2_5);
                        var14_17 = new f93_0((se_1)var8_11 /* !! */ , (Function0)var22_33, null);
                        var21_29 = var16_20.d();
                        var21_29 = nb1_1.d((String)var13_16, (jn1_0)var21_29);
                        var8_11 /* !! */  = var1_1.h;
                        var8_11 /* !! */  = var8_11 /* !! */  != null ? ri0.NETWORK : ri0.DISK;
                        return new N93((Fe1)var14_17, (String)var21_29, (ri0)var8_11 /* !! */ );
                    }
                    m.a((Closeable)var1_1);
                    var13_16 = var14_17.e();
                    var4_7 /* !! */ .a = var14_17;
                    var4_7 /* !! */ .b = var12_15 /* !! */ ;
                    var4_7 /* !! */ .c = var1_1;
                    var4_7 /* !! */ .f = var2_5;
                    var4_7 /* !! */  = var14_17.b((kj2_2)var13_16, (f80_0)var4_7 /* !! */ );
                    if (var4_7 /* !! */  == var8_11 /* !! */ ) {
                        return var8_11 /* !! */ ;
                    }
                    var8_11 /* !! */  = var1_1;
                    var1_1 = var4_7 /* !! */ ;
                    var4_7 /* !! */  = var14_17;
lbl-1000:
                    // 2 sources

                    {
                        var1_1 = (cl2_2)var1_1;
                    }
                    {
                        var8_11 /* !! */  = m.a;
                        var8_11 /* !! */  = var1_1.g;
                        if (var8_11 /* !! */  == null) {
                            var4_7 /* !! */  = var9_12 /* !! */ .toString();
                            var21_31 = new IllegalStateException((String)var4_7 /* !! */ );
                            throw var21_31;
                        }
                        var4_7 /* !! */ .getClass();
                        var13_16 = var8_11 /* !! */ .h();
                        var14_17 = var4_7 /* !! */ .b;
                        var14_17 = var14_17.a;
                        var22_33 = new a00(var14_17, var2_5);
                        var16_20 = new f93_0((se_1)var13_16, (Function0)var22_33, null);
                        var21_30 = var4_7 /* !! */ .a;
                        var4_7 /* !! */  = var8_11 /* !! */ .d();
                        var21_30 = nb1_1.d(var21_30, (jn1_0)var4_7 /* !! */ );
                        var4_7 /* !! */  = var1_1.h;
                        var4_7 /* !! */  = var4_7 /* !! */  != null ? ri0.NETWORK : ri0.DISK;
                        return new N93((Fe1)var16_20, var21_30, (ri0)var4_7 /* !! */ );
                    }
                }
                m.a((Closeable)var8_11 /* !! */ );
                throw var1_1;
            }
            var21_32 = var9_12 /* !! */ .toString();
            var1_1 = new IllegalStateException(var21_32);
            throw var1_1;
        }
        if (var13_16 == null) throw var1_1;
        m.a((Closeable)var13_16);
        throw var1_1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(kj2_2 var1_1, f80_0 var2_2) {
        block8: {
            block9: {
                var3_3 = var2_2 /* !! */  instanceof Nb1$b;
                if (var3_3 == 0) ** GOTO lbl-1000
                var4_4 = var2_2 /* !! */ ;
                var4_4 = (Nb1$b)var2_2 /* !! */ ;
                var5_5 = var4_4.c;
                var6_6 = -1 << -1;
                var7_7 = var5_5 & var6_6;
                if (var7_7 != 0) {
                    var4_4.c = var5_5 -= var6_6;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = new Nb1$b(this, (f80_0)var2_2 /* !! */ );
                }
                var2_2 /* !! */  = var4_4.a;
                var8_8 = j90_0.COROUTINE_SUSPENDED;
                var6_6 = var4_4.c;
                var7_7 = 1;
                if (var6_6 == 0) break block8;
                if (var6_6 != var7_7) break block9;
                vl2_2.b(var2_2 /* !! */ );
                ** GOTO lbl53
            }
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
        }
        vl2_2.b(var2_2 /* !! */ );
        var2_2 /* !! */  = m.a;
        var2_2 /* !! */  = Looper.myLooper();
        var9_9 = Looper.getMainLooper();
        var10_10 = Intrinsics.areEqual(var2_2 /* !! */ , var9_9);
        var9_9 = this.c;
        if (var10_10 == 0) ** GOTO lbl39
        var2_2 /* !! */  = this.b.o;
        var10_10 = (int)var2_2 /* !! */ .getReadEnabled();
        if (var10_10 == 0) {
            var2_2 /* !! */  = (IJ$a)var9_9.getValue();
            var1_1 = var2_2 /* !! */ .b((kj2_2)var1_1).execute();
        } else {
            var1_1 = new NetworkOnMainThreadException();
            throw var1_1;
lbl39:
            // 1 sources

            var1_1 = ((IJ$a)var9_9.getValue()).b((kj2_2)var1_1);
            var4_4.c = var7_7;
            var9_9 = zj1_2.b((f80_0)var4_4);
            var2_2 /* !! */  = new CancellableContinuationImpl(var7_7, (f80_0)var9_9);
            var2_2 /* !! */ .r();
            var9_9 = new g80_0((ij_2)var1_1, (CancellableContinuationImpl)var2_2 /* !! */ );
            var1_1.c((wj_2)var9_9);
            var2_2 /* !! */ .x((Function1)var9_9);
            var2_2 /* !! */  = var2_2 /* !! */ .q();
            if (var2_2 /* !! */  == var8_8) {
                var1_1 = "frame";
                Intrinsics.checkNotNullParameter(var4_4, (String)var1_1);
            }
            if (var2_2 /* !! */  == var8_8) {
                return var8_8;
            }
lbl53:
            // 3 sources

            var1_1 = var2_2 /* !! */ ;
            var1_1 = (cl2_2)var2_2 /* !! */ ;
        }
        var10_10 = var1_1.d();
        if (var10_10 == 0 && (var3_3 = var1_1.d) != (var10_10 = 304)) {
            var2_2 /* !! */  = var1_1.g;
            if (var2_2 /* !! */  != null) {
                m.a((Closeable)var2_2 /* !! */ );
            }
            var4_4 = wk0_0.a(var3_3, "HTTP ", ": ");
            var1_1 = var1_1.c;
            var4_4.append((String)var1_1);
            var1_1 = var4_4.toString();
            var2_2 /* !! */  = new RuntimeException((String)var1_1);
            throw var2_2 /* !! */ ;
        }
        return var1_1;
    }

    public final hm0_2 c() {
        Object object = this.d.getValue();
        Intrinsics.checkNotNull(object);
        return ((Lq0)object).c();
    }

    public final kj2_2 e() {
        boolean bl2;
        KJ2$a kJ2$a = new KJ2$a();
        Object object = this.a;
        kJ2$a.h((String)object);
        object = this.b;
        Object object2 = ((ba2)object).j;
        Object object3 = "headers";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        kJ2$a.c = object2 = ((m41_0)object2).e();
        object2 = ((ba2)object).k.a.entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            object3 = object2.next();
            Object object4 = object3.getKey();
            String string2 = "null cannot be cast to non-null type java.lang.Class<kotlin.Any>";
            Intrinsics.checkNotNull(object4, string2);
            object4 = (Class)object4;
            object3 = object3.getValue();
            kJ2$a.g((Class)object4, object3);
        }
        object2 = ((ba2)object).n;
        bl2 = ((fj_1)((Object)object2)).getReadEnabled();
        object = ((ba2)object).o;
        boolean bl3 = ((fj_1)((Object)object)).getReadEnabled();
        if (!bl3 && bl2) {
            object = ti_1.o;
            kJ2$a.c((ti_1)object);
        } else if (bl3 && !bl2) {
            bl3 = ((fj_1)((Object)object2)).getWriteEnabled();
            if (bl3) {
                object = ti_1.n;
                kJ2$a.c((ti_1)object);
            } else {
                object = f;
                kJ2$a.c((ti_1)object);
            }
        } else if (!bl3 && !bl2) {
            object = g;
            kJ2$a.c((ti_1)object);
        }
        return kJ2$a.b();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final jJ f(Lq0$b var1_1) {
        var2_4 = this.c();
        var1_1 = var1_1.getMetadata();
        var1_1 = var2_4.l((hn2_2)var1_1);
        var1_1 = o72_0.b((a93_0)var1_1);
        try {
            var2_4 = new jJ((ie2_2)var1_1);
        }
        catch (Throwable var2_5) {
            try {
                var1_1.close();
                ** GOTO lbl15
            }
            catch (Throwable var1_3) {
                try {
                    yc0_2.a(var2_5, var1_3);
lbl15:
                    // 2 sources

                    var1_1 = var2_5;
                    var2_4 = null;
lbl17:
                    // 3 sources

                    if (var1_1 != null) throw var1_1;
                    return var2_4;
                }
                catch (IOException v0) {
                    return null;
                }
            }
        }
        try {
            var1_1.close();
            var1_1 = null;
        }
        catch (Throwable var1_2) {}
        ** GOTO lbl17
    }

    public final vL0 g(Lq0$b lq0$b) {
        hn2_2 hn2_22 = lq0$b.getData();
        hm0_2 hm0_22 = this.c();
        String string2 = this.b.i;
        if (string2 == null) {
            string2 = this.a;
        }
        vL0 vL02 = new vL0(hn2_22, hm0_22, string2, lq0$b);
        return vL02;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Lq0$b h(Lq0$b var1_1, kj2_2 var2_3, cl2_2 var3_10, jJ var4_11) {
        block34: {
            block33: {
                block35: {
                    var5_14 = this.b;
                    var6_15 /* !! */  = var5_14.n;
                    var7_16 = var6_15 /* !! */ .getWriteEnabled();
                    var8_17 = null;
                    if (!var7_16) break block34;
                    var7_16 = this.e;
                    var9_20 = var3_10.f;
                    if (!var7_16) break block35;
                    var2_3 = var2_3.a();
                    var10_21 = var2_3.b;
                    if (var10_21 != 0) break block34;
                    var2_3 = var3_10.a();
                    var10_21 = (int)var2_3.b;
                    if (var10_21 != 0 || (var10_21 = (int)Intrinsics.areEqual(var2_3 = var9_20.a("Vary"), (Object)(var6_15 /* !! */  = "*"))) != 0) break block34;
                }
                if (var1_1 != null) {
                    var1_1 = var1_1.p0();
                } else {
                    var1_1 = (Lq0)this.d.getValue();
                    if (var1_1 == null) return null;
                    var2_3 = var5_14.i;
                    if (var2_3 == null) {
                        var2_3 = this.a;
                    }
                    var1_1 = var1_1.a((String)var2_3);
                }
                if (var1_1 == null) {
                    return null;
                }
                var10_21 = var3_10.d;
                var11_22 = 304;
                if (var10_21 != var11_22 || var4_11 == null) ** GOTO lbl59
                var2_3 = var3_10.h();
                var4_11 = var4_11.f;
                var4_11 = lJ$a.a((m41_0)var4_11, var9_20);
                var2_3.c((m41_0)var4_11);
                var2_3 = var2_3.a();
                var4_11 = this.c();
                var5_14 = var1_1.d();
                var4_11 = var4_11.k((hn2_2)var5_14);
                var4_11 = o72_0.a((y63_0)var4_11);
                var5_14 = new jJ((cl2_2)var2_3);
                var5_14.a((he2_2)var4_11);
                var2_3 = Unit.a;
                try {
                    var4_11.close();
                }
                catch (Throwable var8_18) {}
                ** GOTO lbl57
                catch (Throwable var2_4) {
                    var8_17 = var2_4;
                    try {
                        var4_11.close();
                        ** GOTO lbl57
                    }
                    catch (Throwable var2_5) {
                        yc0_2.a(var8_17, var2_5);
lbl57:
                        // 4 sources

                        if (var8_17 != null) throw var8_17;
                        ** GOTO lbl107
lbl59:
                        // 1 sources

                        var2_3 = this.c();
                        var4_11 = var1_1.d();
                        var2_3 = var2_3.k((hn2_2)var4_11);
                        var2_3 = o72_0.a((y63_0)var2_3);
                        var4_11 = new jJ(var3_10);
                        var4_11.a((he2_2)var2_3);
                        var4_11 = Unit.a;
                        try {
                            var2_3.close();
                            var10_21 = 0;
                            var2_3 = null;
                        }
                        catch (Throwable var2_7) {}
                        ** GOTO lbl82
                        catch (Throwable var4_12) {
                            try {
                                var2_3.close();
                                ** GOTO lbl81
                            }
                            catch (Throwable var2_8) {
                                yc0_2.a(var4_12, var2_8);
lbl81:
                                // 2 sources

                                var2_3 = var4_12;
lbl82:
                                // 3 sources

                                if (var2_3 != null) throw var2_3;
                                var2_3 = this.c();
                                var4_11 = var1_1.c();
                                var2_3 = var2_3.k((hn2_2)var4_11);
                                var2_3 = o72_0.a((y63_0)var2_3);
                                var4_11 = var3_10.g;
                                Intrinsics.checkNotNull(var4_11);
                                var4_11 = var4_11.h();
                                var4_11.j0((y63_0)var2_3);
                                try {
                                    var2_3.close();
                                }
                                catch (Throwable var8_19) {}
                                ** GOTO lbl106
                                catch (Throwable var4_13) {
                                    var8_17 = var4_13;
                                    try {
                                        var2_3.close();
                                        ** GOTO lbl106
                                    }
                                    catch (Throwable var2_9) {
                                        block32: {
                                            yc0_2.a(var8_17, var2_9);
lbl106:
                                            // 4 sources

                                            if (var8_17 != null) break block32;
lbl107:
                                            // 2 sources

                                            var1_1 = var1_1.b();
                                            m.a(var3_10);
                                            return var1_1;
                                        }
                                        try {
                                            ** try [egrp 14[TRYBLOCK] [64 : 507->512)] { 
lbl113:
                                            // 1 sources

                                            throw var8_17;
                                        }
                                        catch (Throwable var1_2) {
                                            break block33;
                                        }
lbl116:
                                        // 5 sources

                                        catch (Exception var2_6) {}
                                    }
                                }
                            }
                        }
                    }
                }
                var4_11 = m.a;
                try {
                    var1_1.a();
                }
                catch (Exception v0) {
                    throw var2_6;
                }
                throw var2_6;
            }
            m.a(var3_10);
            throw var1_2;
        }
        if (var1_1 == null) return null;
        m.a((Closeable)var1_1);
        return null;
    }
}

