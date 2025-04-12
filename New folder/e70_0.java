/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KTypeProjection$a;
import kotlin.text.Charsets;

/*
 * Renamed from e70
 */
public final class e70_0 {
    public static final ux1_2 a = Q93.a("io.ktor.client.plugins.contentnegotiation.ContentNegotiation");
    public static final Set b;
    public static final xq_2 c;
    public static final nv_2 d;

    static {
        Object object = Reflection.getOrCreateKotlinClass(byte[].class);
        Object object2 = Reflection.getOrCreateKotlinClass(String.class);
        Object object3 = Reflection.getOrCreateKotlinClass(ub1_2.class);
        Object object4 = Reflection.getOrCreateKotlinClass(uf_1.class);
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(bg2_2.class);
        int n3 = 5;
        Object[] objectArray = new yn1_2[n3];
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        objectArray[3] = object4;
        int n4 = 4;
        objectArray[n4] = yn1_22;
        b = p03_0.f(objectArray);
        object = List.class;
        object2 = Reflection.getOrCreateKotlinClass((Class)object);
        object3 = KTypeProjection.c;
        object4 = k70_0.class;
        object4 = Reflection.typeOf((Class)object4);
        object3.getClass();
        object3 = KTypeProjection$a.a((kn1_1)object4);
        try {
            object = Reflection.typeOf((Class)object, (KTypeProjection)object3);
        }
        catch (Throwable throwable) {
            n4 = 0;
            object = null;
        }
        object3 = new at3_0((yn1_2)object2, (kn1_1)object);
        c = object = new xq_2("ExcludedContentTypesAttr", (at3_0)object3);
        object = e70$a.a;
        object2 = new Object();
        d = td0_2.a("ContentNegotiation", (Function0)object, (Function1)object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(List var0, Set var1_1, mv_2 var2_2, db1_2 var3_3, Object var4_4, f80_0 var5_5) {
        block29: {
            block28: {
                block30: {
                    block41: {
                        block40: {
                            block39: {
                                block38: {
                                    block37: {
                                        block36: {
                                            block33: {
                                                block31: {
                                                    block32: {
                                                        var6_6 = var3_3;
                                                        var7_7 = var4_4;
                                                        var8_8 = var5_5;
                                                        var9_9 = var5_5 instanceof f70_0;
                                                        if (!var9_9) ** GOTO lbl-1000
                                                        var10_10 = var5_5;
                                                        var10_10 = (f70_0)var5_5;
                                                        var11_11 = var10_10.h;
                                                        var12_12 = -1 << -1;
                                                        var13_13 = var11_11 & var12_12;
                                                        if (var13_13 != 0) {
                                                            var10_10.h = var11_11 -= var12_12;
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var10_10 = new Iterator<T>((f80_0)var8_8);
                                                        }
                                                        var8_8 = var10_10.g;
                                                        var14_14 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                                        var12_12 = var10_10.h;
                                                        var13_13 = 1;
                                                        var15_15 = e70_0.a;
                                                        if (var12_12 == 0) break block31;
                                                        if (var12_12 != var13_13) break block32;
                                                        var6_6 = var10_10.f;
                                                        var7_7 = var10_10.e;
                                                        var16_16 = var10_10.d;
                                                        var17_17 = var10_10.c;
                                                        var18_18 = var10_10.b;
                                                        var19_19 = var10_10.a;
                                                        vl2_2.b(var8_8);
                                                        var20_20 = var16_16;
                                                        var16_16 = var10_10;
                                                        var10_10 = var7_7;
                                                        var7_7 = var18_18;
                                                        ** GOTO lbl266
                                                    }
                                                    var6_6 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    throw var6_6;
                                                }
                                                vl2_2.b(var8_8);
                                                var8_8 = var6_6.f;
                                                var16_16 = e70_0.c;
                                                var21_21 = var8_8.f((xq_2)var16_16);
                                                var17_17 = var6_6.f;
                                                if (!var21_21) break block33;
                                                var8_8 = (List)var17_17.g((xq_2)var16_16);
                                                var16_16 = var0;
                                                var16_16 = (Iterable)var0;
                                                var18_18 = new ArrayList();
                                                var16_16 = var16_16.iterator();
                                                block0: while (var22_22 = var16_16.hasNext()) {
                                                    block35: {
                                                        block34: {
                                                            var23_23 = var19_19 = var16_16.next();
                                                            var23_23 = (a70$a)var19_19;
                                                            var24_24 = var8_8;
                                                            var24_24 = (Iterable)var8_8;
                                                            var25_25 = var24_24 instanceof Collection;
                                                            if (!var25_25) break block34;
                                                            var26_26 = var24_24;
                                                            var26_26 = (Collection)var24_24;
                                                            var25_25 = var26_26.isEmpty();
                                                            if (var25_25) break block35;
                                                        }
                                                        var24_24 = ((Iterable)var24_24).iterator();
                                                        while (var25_25 = var24_24.hasNext()) {
                                                            var27_27 = var23_23.b;
                                                            var26_26 = (k70_0)var24_24.next();
                                                            var25_25 = var27_27.b((k70_0)var26_26);
                                                            if (!var25_25) continue;
                                                            continue block0;
                                                        }
                                                    }
                                                    var18_18.add(var19_19);
                                                }
                                                break block36;
                                            }
                                            var18_18 = var0;
                                        }
                                        var8_8 = ja1_1.a;
                                        var8_8 = var6_6.c;
                                        var16_16 = "Accept";
                                        var19_19 = var8_8.f((String)var16_16);
                                        if (var19_19 == null) {
                                            var19_19 = mz0_2.a;
                                        }
                                        var18_18 = ((Iterable)var18_18).iterator();
                                        while (true) {
                                            var28_28 = var18_18.hasNext();
                                            var24_24 = var6_6.a;
                                            if (!var28_28) break;
                                            var23_23 = (a70$a)var18_18.next();
                                            var26_26 = var19_19;
                                            var26_26 = (Iterable)var19_19;
                                            var29_29 = var26_26 instanceof Collection;
                                            if (!var29_29) ** GOTO lbl-1000
                                            var27_27 = var26_26;
                                            var27_27 = (Collection)var26_26;
                                            var29_29 = var27_27.isEmpty();
                                            if (var29_29) {
                                                while (true) {
                                                    break;
                                                }
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                var26_26 = ((Iterable)var26_26).iterator();
                                                do {
                                                    if (!(var29_29 = var26_26.hasNext())) ** continue;
                                                    var27_27 = (String)var26_26.next();
                                                } while ((var30_30 = (int)(var27_27 = k70$b.a((String)var27_27)).b((k70_0)(var20_20 = var23_23.b))) == 0);
                                                var20_20 = var2_2;
                                                continue;
                                            }
                                            var20_20 = var2_2;
                                            ((a70_0)var2_2.b).getClass();
                                            var23_23 = var23_23.b;
                                            var26_26 = new StringBuilder("Adding Accept=");
                                            var26_26.append(var23_23);
                                            var27_27 = " header for ";
                                            var26_26.append((String)var27_27);
                                            var26_26.append(var24_24);
                                            var24_24 = var26_26.toString();
                                            var15_15.g((String)var24_24);
                                            Intrinsics.checkNotNullParameter(var6_6, "<this>");
                                            Intrinsics.checkNotNullParameter(var23_23, "contentType");
                                            var24_24 = ja1_1.a;
                                            var23_23 = var23_23.toString();
                                            var8_8.b((String)var16_16, (String)var23_23);
                                        }
                                        var12_12 = var7_7 instanceof bg2_2;
                                        var30_30 = 46;
                                        if (var12_12 != 0) break block28;
                                        var16_16 = var1_1;
                                        var16_16 = var1_1;
                                        var31_31 = var16_16 instanceof Collection;
                                        if (var31_31 == 0) break block37;
                                        var18_18 = var16_16;
                                        var18_18 = (Collection)var16_16;
                                        var31_31 = var18_18.isEmpty();
                                        if (var31_31 != 0) break block38;
                                    }
                                    var16_16 = ((Iterable)var16_16).iterator();
                                    while ((var31_31 = var16_16.hasNext()) != 0) {
                                        var18_18 = (yn1_2)var16_16.next();
                                        var31_31 = var18_18.isInstance(var7_7);
                                        if (var31_31 == 0) continue;
                                        break block28;
                                    }
                                }
                                var16_16 = oa1_0.c(var3_3);
                                if (var16_16 == null) {
                                    var7_7 = "Request doesn't have Content-Type header. Skipping ContentNegotiation for ";
                                    var6_6 = new StringBuilder((String)var7_7);
                                    var6_6.append(var24_24);
                                    var6_6.append((char)var30_30);
                                    var6_6 = var6_6.toString();
                                    var15_15.g((String)var6_6);
lbl155:
                                    // 4 sources

                                    while (true) {
                                        var11_11 = 0;
                                        var14_14 /* !! */  = null;
                                        break block29;
                                        break;
                                    }
                                }
                                var31_31 = var7_7 instanceof Unit;
                                var19_19 = "name";
                                var8_8 = var8_8.b;
                                var23_23 = "Content-Type";
                                if (var31_31 == 0) break block39;
                                var7_7 = "Sending empty body for ";
                                var6_6 = new StringBuilder((String)var7_7);
                                var6_6.append(var24_24);
                                var6_6 = var6_6.toString();
                                var15_15.g((String)var6_6);
                                var6_6 = ja1_1.a;
                                Intrinsics.checkNotNullParameter(var23_23, (String)var19_19);
                                var8_8.remove(var23_23);
                                var14_14 /* !! */  = gz0_2.a;
                                break block29;
                            }
                            var18_18 = var0;
                            var18_18 = (Iterable)var0;
                            var26_26 = new ArrayList();
                            var18_18 = var18_18.iterator();
                            while (var29_29 = var18_18.hasNext()) {
                                var20_20 = var27_27 = var18_18.next();
                                var20_20 = ((a70$a)var27_27).c;
                                var30_30 = (int)var20_20.a((k70_0)var16_16);
                                if (var30_30 != 0) {
                                    var26_26.add(var27_27);
                                }
                                var30_30 = 46;
                            }
                            var30_30 = var26_26.isEmpty() ^ var13_13;
                            if (var30_30 == 0) {
                                var25_25 = false;
                                var26_26 = null;
                            }
                            if (var26_26 != null) break block40;
                            var6_6 = new StringBuilder("None of the registered converters match request Content-Type=");
                            var6_6.append(var16_16);
                            var7_7 = ". Skipping ContentNegotiation for ";
                            var6_6.append((String)var7_7);
                            var6_6.append(var24_24);
                            var32_32 = '.';
                            var6_6.append(var32_32);
                            var6_6 = var6_6.toString();
                            var15_15.g((String)var6_6);
                            ** GOTO lbl155
                        }
                        var20_20 = qj2_1.a;
                        if ((var20_20 = (at3_0)var17_17.a((xq_2)var20_20)) != null) break block41;
                        var7_7 = "Request has unknown body type. Skipping ContentNegotiation for ";
                        var6_6 = new StringBuilder((String)var7_7);
                        var6_6.append(var24_24);
                        var32_33 = '.';
                        var6_6.append(var32_33);
                        var6_6 = var6_6.toString();
                        var15_15.g((String)var6_6);
                        ** GOTO lbl155
                    }
                    var20_20 = ja1_1.a;
                    Intrinsics.checkNotNullParameter(var23_23, (String)var19_19);
                    var8_8.remove(var23_23);
                    var8_8 = var26_26.iterator();
                    var20_20 = var16_16;
                    var16_16 = var26_26;
                    while (var33_35 = var8_8.hasNext()) {
                        var27_27 = var17_17 = var8_8.next();
                        var27_27 = (a70$a)var17_17;
                        var17_17 = var27_27.a;
                        var18_18 = m70_0.a((b41_0)var20_20);
                        if (var18_18 == null) {
                            var18_18 = Charsets.UTF_8;
                        }
                        var19_19 = var18_18;
                        var6_6.getClass();
                        var18_18 = qj2_1.a;
                        var23_23 = var18_18 = var6_6.f.a((xq_2)var18_18);
                        var23_23 = (at3_0)var18_18;
                        Intrinsics.checkNotNull(var23_23);
                        var18_18 = g52_0.a;
                        var31_31 = Intrinsics.areEqual(var7_7, var18_18) ^ var13_13;
                        var24_24 = var31_31 != 0 ? var7_7 : null;
                        var10_10.a = var6_6;
                        var10_10.b = var7_7;
                        var10_10.c = var20_20;
                        var18_18 = var16_16;
                        var10_10.d = var18_18 = (List)var16_16;
                        var10_10.e = var8_8;
                        var10_10.f = var27_27;
                        var10_10.h = var13_13;
                        var18_18 = var20_20;
                        var26_26 = var10_10;
                        var17_17 = var17_17.b((k70_0)var20_20, (Charset)var19_19, (at3_0)var23_23, var24_24, (f80_0)var10_10);
                        if (var17_17 == var14_14 /* !! */ ) break block29;
                        var19_19 = var6_6;
                        var6_6 = var27_27;
                        var10_10 = var8_8;
                        var8_8 = var17_17;
                        var17_17 = var20_20;
                        var20_20 = var16_16;
                        var16_16 = var26_26;
lbl266:
                        // 2 sources

                        var8_8 = (bg2_2)var8_8;
                        if (var8_8 != null) {
                            var23_23 = "Converted request body using ";
                            var18_18 = new StringBuilder((String)var23_23);
                            var6_6 = var6_6.a;
                            var18_18.append(var6_6);
                            var18_18.append(" for ");
                            var6_6 = var19_19.a;
                            var18_18.append(var6_6);
                            var6_6 = var18_18.toString();
                            var15_15.g((String)var6_6);
                        }
                        if (var8_8 != null) {
                            var14_14 /* !! */  = var8_8;
                            var16_16 = var20_20;
                            var20_20 = var17_17;
                            break block30;
                        }
                        var8_8 = var10_10;
                        var10_10 = var16_16;
                        var16_16 = var20_20;
                        var20_20 = var17_17;
                        var6_6 = var19_19;
                    }
                    var11_11 = 0;
                    var14_14 /* !! */  = null;
                }
                if (var14_14 /* !! */  == null) {
                    var8_8 = new StringBuilder("Can't convert ");
                    var8_8.append(var7_7);
                    var8_8.append(" with contentType ");
                    var8_8.append(var20_20);
                    var8_8.append(" using converters ");
                    var7_7 = var16_16;
                    var7_7 = (Iterable)var16_16;
                    var10_10 = new Iterator<T>();
                    var0 = var7_7;
                    var4_4 = var10_10;
                    var34_36 = 31;
                    var7_7 = CollectionsKt.R((Iterable)var7_7, null, null, null, (Function1)var10_10, var34_36);
                    var8_8.append((String)var7_7);
                    var7_7 = var8_8.toString();
                    Intrinsics.checkNotNullParameter(var7_7, "message");
                    var6_6 = new Exception((String)var7_7);
                    throw var6_6;
                }
                break block29;
            }
            var8_8 = "Body type ";
            var6_6 = new StringBuilder((String)var8_8);
            var7_7 = Reflection.getOrCreateKotlinClass(var4_4.getClass());
            var6_6.append(var7_7);
            var7_7 = " is in ignored types. Skipping ContentNegotiation for ";
            var6_6.append((String)var7_7);
            var6_6.append(var24_24);
            var32_34 = '.';
            var6_6.append(var32_34);
            var6_6 = var6_6.toString();
            var15_15.g((String)var6_6);
            ** while (true)
        }
        return var14_14 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(Set var0, List var1_1, fx3_0 var2_2, at3_0 var3_3, Object var4_4, k70_0 var5_5, Charset var6_6, f80_0 var7_7) {
        block13: {
            block16: {
                block17: {
                    block14: {
                        block15: {
                            var8_8 = var7_7 instanceof g70_0;
                            if (!var8_8) ** GOTO lbl-1000
                            var9_9 = var7_7;
                            var9_9 = (g70_0)var7_7;
                            var10_10 = var9_9.c;
                            var11_11 = -1 << -1;
                            var12_12 = var10_10 & var11_11;
                            if (var12_12 != 0) {
                                var9_9.c = var10_10 -= var11_11;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var9_9 = new h80_0((f80_0)var7_7);
                            }
                            var7_7 = var9_9.b;
                            var13_13 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var11_11 = var9_9.c;
                            var12_12 = 1;
                            var14_14 = '.';
                            var15_15 = e70_0.a;
                            if (var11_11 == 0) break block14;
                            if (var11_11 != var12_12) break block15;
                            var2_2 = var9_9.a;
                            vl2_2.b(var7_7);
                            break block16;
                        }
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    vl2_2.b(var7_7);
                    var16_16 = var4_4 instanceof uf_1;
                    var11_11 = 0;
                    if (var16_16 == 0) {
                        var1_1 = "Response body is already transformed. Skipping ContentNegotiation for ";
                        var0 = new StringBuilder((String)var1_1);
                        var0.append(var2_2);
                        var0.append(var14_14);
                        var0 = var0.toString();
                        var15_15.g((String)var0);
lbl39:
                        // 3 sources

                        while (true) {
                            var10_10 = 0;
                            var13_13 /* !! */  = null;
                            break block13;
                            break;
                        }
                    }
                    var7_7 = var3_3.a;
                    var17_17 = var0.contains(var7_7);
                    if (var17_17 == 0) break block17;
                    var0 = new StringBuilder("Response body type ");
                    var1_1 = var3_3.a;
                    var0.append(var1_1);
                    var1_1 = " is in ignored types. Skipping ContentNegotiation for ";
                    var0.append((String)var1_1);
                    var0.append(var2_2);
                    var0.append(var14_14);
                    var0 = var0.toString();
                    var15_15.g((String)var0);
                    ** GOTO lbl39
                }
                var1_1 = (Iterable)var1_1;
                var0 = new ArrayList();
                var1_1 = var1_1.iterator();
                while ((var16_16 = var1_1.hasNext()) != 0) {
                    var18_18 = var7_7 = var1_1.next();
                    var18_18 = ((a70$a)var7_7).c;
                    var19_19 = var18_18.a(var5_5);
                    if (!var19_19) continue;
                    var0.add(var7_7);
                }
                var16_16 = yx_2.o((Iterable)var0, 10);
                var1_1 = new ArrayList(var16_16);
                var0 = var0.iterator();
                while ((var16_16 = (int)var0.hasNext()) != 0) {
                    var7_7 = ((a70$a)var0.next()).a;
                    var1_1.add(var7_7);
                }
                var17_17 = var1_1.isEmpty() ^ var12_12;
                if (var17_17 == 0) {
                    var1_1 = null;
                }
                if (var1_1 == null) {
                    var0 = new StringBuilder("None of the registered converters match response with Content-Type=");
                    var0.append(var5_5);
                    var1_1 = ". Skipping ContentNegotiation for ";
                    var0.append((String)var1_1);
                    var0.append(var2_2);
                    var0.append(var14_14);
                    var0 = var0.toString();
                    var15_15.g((String)var0);
                    ** continue;
                }
                var4_4 = (uf_1)var4_4;
                var9_9.a = var2_2;
                var9_9.c = var12_12;
                var7_7 = d60_0.a(var1_1, (uf_1)var4_4, var3_3, var6_6, var9_9);
                if (var7_7 == var13_13 /* !! */ ) break block13;
            }
            var17_17 = var7_7 instanceof uf_1;
            if (var17_17 == 0) {
                var0 = new StringBuilder("Response body was converted to ");
                var1_1 = Reflection.getOrCreateKotlinClass(var7_7.getClass());
                var0.append(var1_1);
                var1_1 = " for ";
                var0.append((String)var1_1);
                var0.append(var2_2);
                var0.append(var14_14);
                var0 = var0.toString();
                var15_15.g((String)var0);
            }
            var13_13 /* !! */  = var7_7;
        }
        return var13_13 /* !! */ ;
    }
}

