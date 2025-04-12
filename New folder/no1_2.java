/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/*
 * Renamed from No1
 */
public final class no1_2
implements z60_0 {
    public final wz2_0 a;
    public final ArrayList b;

    public no1_2(ml1_2 object) {
        boolean bl2;
        boolean bl3;
        Object object2 = "format";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.a = object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = oh0_2.a;
        ArrayList<oo1_2> arrayList = new ArrayList<oo1_2>();
        object2 = object2.iterator();
        while (bl3 = object2.hasNext()) {
            oo1_2 oo1_22 = ((po1_2)object2.next()).a((wz2_0)object);
            if (oo1_22 == null) continue;
            arrayList.add(oo1_22);
        }
        this.b = arrayList;
        object = this.a;
        boolean bl4 = object instanceof jx_1;
        if (!bl4 && !(bl2 = object instanceof ge3_1)) {
            object = new StringBuilder("Only binary and string formats are supported, ");
            object2 = this.a;
            ((StringBuilder)object).append(object2);
            ((StringBuilder)object).append(" is not supported.");
            object = ((StringBuilder)object).toString();
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(Charset var1_1, at3_0 var2_3, uf_1 var3_4, f80_0 var4_5) {
        block17: {
            block15: {
                block16: {
                    block13: {
                        block14: {
                            var5_6 = "Unsupported format ";
                            var6_7 = var4_5 instanceof No1$b;
                            if (!var6_7) ** GOTO lbl-1000
                            var7_8 = var4_5;
                            var7_8 = (No1$b)var4_5;
                            var8_9 = var7_8.g;
                            var9_10 = -1 << -1;
                            var10_11 = var8_9 & var9_10;
                            if (var10_11 != 0) {
                                var7_8.g = var8_9 -= var9_10;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var7_8 = new No1$b(this, (f80_0)var4_5);
                            }
                            var4_5 = var7_8.e;
                            var11_12 = j90_0.COROUTINE_SUSPENDED;
                            var9_10 = var7_8.g;
                            var10_11 = 2;
                            var12_13 = 1;
                            if (var9_10 == 0) break block13;
                            if (var9_10 == var12_13) break block14;
                            if (var9_10 != var10_11) {
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var1_1 = (KSerializer)var7_8.c;
                            var2_3 = var7_8.b;
                            var3_4 = var7_8.a;
                            vl2_2.b(var4_5);
                            break block15;
                        }
                        var3_4 = var7_8.d;
                        var2_3 = var1_1 = var7_8.c;
                        var2_3 = (at3_0)var1_1;
                        var1_1 = var7_8.b;
                        var13_14 = var7_8.a;
                        vl2_2.b(var4_5);
                        var14_15 = var4_5;
                        var4_5 = var3_4;
                        var3_4 = var13_14;
                        var13_14 = var14_15;
                        break block16;
                    }
                    vl2_2.b(var4_5);
                    var4_5 = this.b;
                    var13_14 = new ns0_1((Iterable)var4_5);
                    var4_5 = new no1$a_0((ns0_1)var13_14, (Charset)var1_1, (at3_0)var2_3, (uf_1)var3_4);
                    var13_14 = new No1$c((uf_1)var3_4, null);
                    var7_8.a = this;
                    var7_8.b = var1_1;
                    var7_8.c = var2_3;
                    var7_8.d = var3_4;
                    var7_8.g = var12_13;
                    var4_5 = ms0_1.l((es0_2)var4_5, (Function2)var13_14, (f80_0)var7_8);
                    if (var4_5 == var11_12) {
                        return var11_12;
                    }
                    var13_14 = var4_5;
                    var4_5 = var3_4;
                    var3_4 = this;
                }
                var15_16 = var3_4.b;
                var16_17 = var15_16.isEmpty();
                if ((var12_13 ^= var16_17) != 0) {
                    if (var13_14 != null) return var13_14;
                    var12_13 = (int)var4_5.i();
                    if (var12_13 != 0) {
                        return var13_14;
                    }
                }
                var13_14 = var3_4.a.a();
                var2_3 = h03_0.c((i0_0)var13_14, (at3_0)var2_3);
                var7_8.a = var3_4;
                var7_8.b = var1_1;
                var7_8.c = var2_3;
                var7_8.d = null;
                var7_8.g = var10_11;
                if ((var4_5 = wf_1.k((uf_1)var4_5, (f80_0)var7_8)) == var11_12) {
                    return var11_12;
                }
                var14_15 = var2_3;
                var2_3 = var1_1;
                var1_1 = var14_15;
            }
            var4_5 = (b93_0)var4_5;
            try {
                var7_8 = var3_4.a;
            }
            catch (Throwable var1_2) {}
            var8_9 = var7_8 instanceof ge3_1;
            if (var8_9 != 0) {
                try {
                    var7_8 = (ge3_1)var7_8;
                    var2_3 = be3_1.a((b93_0)var4_5, (Charset)var2_3, var10_11);
                    var1_1 = var7_8.c((qp0_2)var1_1, (String)var2_3);
                    return var1_1;
                }
                finally {
                    return var1_1;
                }
            }
            var17_18 = var7_8 instanceof jx_1;
            if (var17_18 == 0) break block17;
            var7_8 = (jx_1)var7_8;
            var1_1 = "<this>";
            Intrinsics.checkNotNullParameter(var4_5, (String)var1_1);
            var17_18 = -1;
            o93_0.b((b93_0)var4_5, var17_18);
            return var7_8.d();
        }
        var18_19 = 0x7FFFFFFFFFFFFFFFL;
        af_2.b((b93_0)var4_5, var18_19);
        var2_3 = new StringBuilder(var5_6);
        var3_4 = var3_4.a;
        var2_3.append(var3_4);
        var2_3 = var2_3.toString();
        var2_3 = var2_3.toString();
        var1_1 = new IllegalStateException((String)var2_3);
        throw var1_1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object b(k70_0 var1_1, Charset var2_2, at3_0 var3_3, Object var4_4, f80_0 var5_5) {
        block15: {
            block14: {
                block13: {
                    var6_6 = var5_5 instanceof No1$e;
                    if (!var6_6) ** GOTO lbl-1000
                    var7_7 = var5_5;
                    var7_7 = (No1$e)var5_5;
                    var8_8 = var7_7.h;
                    var9_9 = -1 << -1;
                    var10_10 = var8_8 & var9_9;
                    if (var10_10 != 0) {
                        var7_7.h = var8_8 -= var9_9;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var7_7 = new No1$e(this, (f80_0)var5_5);
                    }
                    var5_5 = var7_7.f;
                    var11_11 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var9_9 = var7_7.h;
                    var10_10 = 1;
                    if (var9_9 == 0) ** GOTO lbl27
                    if (var9_9 == var10_10) {
                        var4_4 = var7_7.e;
                        var3_3 = var7_7.d;
                        var2_2 = var7_7.c;
                        var1_1 = var7_7.b;
                        var7_7 = var7_7.a;
                        vl2_2.b(var5_5);
                    } else {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
lbl27:
                        // 1 sources

                        vl2_2.b(var5_5);
                        var5_5 = this.b;
                        var12_12 = new ns0_1((Iterable)var5_5);
                        var5_5 = new No1$d(var12_12, (k70_0)var1_1, (Charset)var2_2, (at3_0)var3_3, var4_4);
                        var14_14 = 2;
                        var12_12 = null;
                        var13_13 = new qg3_2(var14_14, null);
                        var7_7.a = this;
                        var7_7.b = var1_1;
                        var7_7.c = var2_2;
                        var7_7.d = var3_3;
                        var7_7.e = var4_4;
                        var7_7.h = var10_10;
                        var5_5 = ms0_1.l((es0_2)var5_5, var13_13, (f80_0)var7_7);
                        if (var5_5 == var11_11 /* !! */ ) {
                            return var11_11 /* !! */ ;
                        }
                        var7_7 = this;
                    }
                    var5_5 = (bg2_2)var5_5;
                    if (var5_5 != null) {
                        return var5_5;
                    }
                    var5_5 = var7_7.a;
                    var5_5 = var5_5.a();
                    try {
                        var3_3 = h03_0.c((i0_0)var5_5, (at3_0)var3_3);
                    }
                    catch (SerializationException v0) {
                        var3_3 = var7_7.a.a();
                        var3_3 = h03_0.b(var4_4, (i0_0)var3_3);
                    }
                    var5_5 = var7_7.a;
                    var6_6 = var5_5 instanceof ge3_1;
                    var11_11 /* !! */  = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>";
                    if (!var6_6) break block13;
                    var5_5 = (ge3_1)var5_5;
                    Intrinsics.checkNotNull(var3_3, (String)var11_11 /* !! */ );
                    var3_3 = var5_5.b((b03_0)var3_3, var4_4);
                    var1_1 = m70_0.b((k70_0)var1_1, (Charset)var2_2);
                    var4_4 = new hj3_1((String)var3_3, (k70_0)var1_1);
                    break block14;
                }
                var15_15 = var5_5 instanceof jx_1;
                if (!var15_15) break block15;
                var5_5 = (jx_1)var5_5;
                Intrinsics.checkNotNull(var3_3, (String)var11_11 /* !! */ );
                var2_2 = var5_5.e();
                var4_4 = new se_2((byte[])var2_2, (k70_0)var1_1);
            }
            return var4_4;
        }
        var2_2 = new StringBuilder("Unsupported format ");
        var2_2.append(var5_5);
        var2_2 = var2_2.toString().toString();
        var1_1 = new IllegalStateException((String)var2_2);
        throw var1_1;
    }
}

