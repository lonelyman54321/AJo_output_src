/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class Vz0 {
    static {
        qx1.b("EnqueueRunnable");
    }

    public static void a(qh3_2 object) {
        object.getClass();
        Object object2 = new HashSet();
        boolean bl2 = qh3_2.R((qh3_2)object, object2);
        if (!bl2) {
            WorkDatabase workDatabase;
            block6: {
                object2 = ((qh3_2)object).a;
                workDatabase = ((ni3_1)object2).c;
                workDatabase.beginTransaction();
                a a2 = ((ni3_1)object2).b;
                Wz0.a(workDatabase, a2, (qh3_2)object);
                boolean bl3 = Vz0.b((qh3_2)object);
                workDatabase.setTransactionSuccessful();
                if (!bl3) break block6;
                object = ((ni3_1)object2).b;
                workDatabase = ((ni3_1)object2).c;
                object2 = ((ni3_1)object2).e;
                rt2_0.b((a)object, workDatabase, (List)object2);
            }
            return;
            finally {
                workDatabase.endTransaction();
            }
        }
        StringBuilder stringBuilder = new StringBuilder("WorkContinuation has cycles (");
        stringBuilder.append(object);
        stringBuilder.append(")");
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean b(qh3_2 var0) {
        block47: {
            block48: {
                var1_1 = var0;
                var2_2 = var0.g;
                var3_3 = 0;
                var4_4 /* !! */  = null;
                if (var2_2 != null) {
                    var2_2 = var2_2.iterator();
                    var5_5 = 0;
                    var6_6 = 0.0f;
                    var7_7 /* !! */  = null;
                    while ((var8_8 = var2_2.hasNext()) != 0) {
                        var9_9 /* !! */  = (qh3_2)var2_2.next();
                        var10_10 = var9_9 /* !! */ .h;
                        if (!var10_10) {
                            var8_8 = Vz0.b((qh3_2)var9_9 /* !! */ );
                            var5_5 |= var8_8;
                            continue;
                        }
                        var11_11 = qx1.a();
                        var9_9 /* !! */  = var9_9 /* !! */ .e;
                        var12_12 = ", ";
                        TextUtils.join((CharSequence)var12_12, (Iterable)var9_9 /* !! */ );
                        var11_11.getClass();
                    }
                } else {
                    var5_5 = 0;
                    var6_6 = 0.0f;
                    var7_7 /* !! */  = null;
                }
                var2_2 = qh3_2.S(var0);
                var9_9 /* !! */  = new String[]{};
                var2_2 = var2_2.toArray(var9_9 /* !! */ );
                var9_9 /* !! */  = var1_1.a;
                var11_11 = var9_9 /* !! */ .b.d;
                var11_11.getClass();
                var13_13 = System.currentTimeMillis();
                var15_14 = 1;
                if (var2_2 != null && (var16_15 = ((String[])var2_2).length) > 0) {
                    var16_15 = 1;
                } else {
                    var16_15 = 0;
                    var17_16 /* !! */  = null;
                }
                var18_17 = var9_9 /* !! */ .c;
                if (var16_15 != 0) {
                    var19_18 = ((String[])var2_2).length;
                    var21_20 = null;
                    var22_21 = 1;
                    var23_22 = false;
                    var24_23 = false;
                    for (var20_19 = 0; var20_19 < var19_18; ++var20_19) {
                        var25_24 /* !! */  = var2_2[var20_19];
                        var4_4 /* !! */  = var18_17.f().i(var25_24 /* !! */ );
                        if (var4_4 /* !! */  == null) {
                            var2_2 = qx1.a();
                            var2_2.getClass();
                            while (true) {
                                var26_26 = var5_5;
                                var27_27 = true;
                                var3_3 = 0;
                                var4_4 /* !! */  = null;
                                break block47;
                                break;
                            }
                        }
                        var4_4 /* !! */  = var4_4 /* !! */ .b;
                        var25_24 /* !! */  = hI3$b.SUCCEEDED;
                        if (var4_4 /* !! */  == var25_24 /* !! */ ) {
                            var28_25 = 1;
                        } else {
                            var28_25 = 0;
                            var25_24 /* !! */  = null;
                        }
                        var22_21 &= var28_25;
                        var25_24 /* !! */  = hI3$b.FAILED;
                        if (var4_4 /* !! */  == var25_24 /* !! */ ) {
                            var24_23 = true;
                        } else {
                            var25_24 /* !! */  = hI3$b.CANCELLED;
                            if (var4_4 /* !! */  == var25_24 /* !! */ ) {
                                var23_22 = true;
                            }
                        }
                        var3_3 = 0;
                        var4_4 /* !! */  = null;
                    }
                } else {
                    var22_21 = 1;
                    var23_22 = false;
                    var24_23 = false;
                }
                if ((var19_18 = TextUtils.isEmpty((CharSequence)(var4_4 /* !! */  = var1_1.b)) ^ var15_14) == 0 || var16_15 != 0 || (var28_25 = (var21_20 = var18_17.f().p((String)var4_4 /* !! */ )).isEmpty()) != 0) ** GOTO lbl176
                var29_28 /* !! */  = var1_1.c;
                var25_24 /* !! */  = DE0.APPEND;
                if (var29_28 /* !! */  != var25_24 /* !! */  && var29_28 /* !! */  != (var25_24 /* !! */  = DE0.APPEND_OR_REPLACE)) {
                    var25_24 /* !! */  = DE0.KEEP;
                    if (var29_28 /* !! */  == var25_24 /* !! */ ) {
                        var29_28 /* !! */  = var21_20.iterator();
                        while ((var28_25 = var29_28 /* !! */ .hasNext()) != 0) {
                            var25_24 /* !! */  = ((EI3$b)var29_28 /* !! */ .next()).b;
                            var30_29 /* !! */  = var29_28 /* !! */ ;
                            if (var25_24 /* !! */  == (var29_28 /* !! */  = hI3$b.ENQUEUED) || var25_24 /* !! */  == (var29_28 /* !! */  = hI3$b.RUNNING)) ** continue;
                            var29_28 /* !! */  = var30_29 /* !! */ ;
                        }
                    }
                    Intrinsics.checkNotNullParameter(var4_4 /* !! */ , "name");
                    Intrinsics.checkNotNullParameter(var9_9 /* !! */ , "workManagerImpl");
                    var29_28 /* !! */  = var9_9 /* !! */ .c;
                    Intrinsics.checkNotNullExpressionValue(var29_28 /* !! */ , "workManagerImpl.workDatabase");
                    var25_24 /* !! */  = new TK((WorkDatabase)var29_28 /* !! */ , (String)var4_4 /* !! */ , (ni3_1)var9_9 /* !! */ );
                    var29_28 /* !! */ .runInTransaction((Runnable)var25_24 /* !! */ );
                    var29_28 /* !! */  = var18_17.f();
                    var21_20 = var21_20.iterator();
                    while ((var28_25 = var21_20.hasNext()) != 0) {
                        var25_24 /* !! */  = ((EI3$b)var21_20.next()).a;
                        var29_28 /* !! */ .delete(var25_24 /* !! */ );
                    }
                    var26_26 = var5_5;
                    var5_5 = 1;
                    var6_6 = 1.4E-45f;
                } else {
                    var17_16 /* !! */  = var18_17.a();
                    var25_24 /* !! */  = new ArrayList();
                    var21_20 = var21_20.iterator();
                    while ((var26_26 = var21_20.hasNext()) != 0) {
                        var30_29 /* !! */  = var21_20.next();
                        var31_30 = var21_20;
                        var21_20 = var30_29 /* !! */ ;
                        var21_20 = (EI3$b)var30_29 /* !! */ ;
                        var26_26 = var5_5;
                        var7_7 /* !! */  = var21_20.a;
                        var5_5 = (int)var17_16 /* !! */ .d((String)var7_7 /* !! */ );
                        if (var5_5 == 0) {
                            var7_7 /* !! */  = hI3$b.SUCCEEDED;
                            var32_31 = var17_16 /* !! */ ;
                            var17_16 /* !! */  = var21_20.b;
                            if (var17_16 /* !! */  == var7_7 /* !! */ ) {
                                var5_5 = 1;
                                var6_6 = 1.4E-45f;
                            } else {
                                var5_5 = 0;
                                var6_6 = 0.0f;
                                var7_7 /* !! */  = null;
                            }
                            var5_5 &= var22_21;
                            var33_32 = hI3$b.FAILED;
                            if (var17_16 /* !! */  == var33_32) {
                                var24_23 = true;
                            } else {
                                var33_32 = hI3$b.CANCELLED;
                                if (var17_16 /* !! */  == var33_32) {
                                    var23_22 = true;
                                }
                            }
                            var17_16 /* !! */  = var21_20.a;
                            var25_24 /* !! */ .add(var17_16 /* !! */ );
                            var22_21 = var5_5;
                        } else {
                            var32_31 = var17_16 /* !! */ ;
                        }
                        var5_5 = var26_26;
                        var21_20 = var31_30;
                        var17_16 /* !! */  = var32_31;
                    }
                    var26_26 = var5_5;
                    var7_7 /* !! */  = DE0.APPEND_OR_REPLACE;
                    if (var29_28 /* !! */  == var7_7 /* !! */  && (var23_22 || var24_23)) {
                        var7_7 /* !! */  = var18_17.f();
                        var29_28 /* !! */  = var7_7 /* !! */ .p((String)var4_4 /* !! */ ).iterator();
                        while ((var16_15 = (int)var29_28 /* !! */ .hasNext()) != 0) {
                            var17_16 /* !! */  = ((EI3$b)var29_28 /* !! */ .next()).a;
                            var7_7 /* !! */ .delete((String)var17_16 /* !! */ );
                        }
                        var25_24 /* !! */  = Collections.emptyList();
                        var23_22 = false;
                        var24_23 = false;
                    }
                    if ((var5_5 = ((Object)(var2_2 = (String[])var25_24 /* !! */ .toArray((T[])var2_2))).length) > 0) {
                        var16_15 = 1;
                    } else {
                        var16_15 = 0;
                        var17_16 /* !! */  = null;
                    }
lbl171:
                    // 3 sources

                    while (true) {
                        var5_5 = 0;
                        var6_6 = 0.0f;
                        var7_7 /* !! */  = null;
                        break block48;
                        break;
                    }
lbl176:
                    // 1 sources

                    var26_26 = var5_5;
                    ** continue;
                }
            }
            var29_28 /* !! */  = var1_1.d.iterator();
            while ((var20_19 = (int)var29_28 /* !! */ .hasNext()) != 0) {
                var21_20 = (CI3)var29_28 /* !! */ .next();
                var25_24 /* !! */  = var21_20.b;
                if (var16_15 != 0 && var22_21 == 0) {
                    if (var24_23) {
                        var34_33 = var5_5;
                        var35_34 = var6_6;
                        var7_7 /* !! */  = hI3$b.FAILED;
                        var25_24 /* !! */ .b = var7_7 /* !! */ ;
                    } else {
                        var34_33 = var5_5;
                        var35_34 = var6_6;
                        if (var23_22) {
                            var7_7 /* !! */  = hI3$b.CANCELLED;
                            var25_24 /* !! */ .b = var7_7 /* !! */ ;
                        } else {
                            var7_7 /* !! */  = hI3$b.BLOCKED;
                            var25_24 /* !! */ .b = var7_7 /* !! */ ;
                        }
                    }
                } else {
                    var34_33 = var5_5;
                    var35_34 = var6_6;
                    var25_24 /* !! */ .n = var13_13;
                }
                var7_7 /* !! */  = var25_24 /* !! */ .b;
                var36_35 = var13_13;
                var11_11 = hI3$b.ENQUEUED;
                if (var7_7 /* !! */  == var11_11) {
                    var5_5 = 1;
                    var6_6 = 1.4E-45f;
                } else {
                    var5_5 = var34_33;
                    var6_6 = var35_34;
                }
                var11_11 = var18_17.f();
                var12_12 = Wz0.c(var9_9 /* !! */ .e, (EI3)var25_24 /* !! */ );
                var11_11.j((EI3)var12_12);
                var11_11 = "id.toString()";
                var12_12 = var21_20.a;
                if (var16_15 != 0) {
                    var28_25 = ((Object)var2_2).length;
                    var34_33 = var5_5;
                    var35_34 = var6_6;
                    var6_6 = 0.0f;
                    var7_7 /* !! */  = null;
                    for (var5_5 = 0; var5_5 < var28_25; ++var5_5) {
                        var38_36 /* !! */  = var9_9 /* !! */ ;
                        var9_9 /* !! */  = var2_2[var5_5];
                        var39_37 = var2_2;
                        var40_38 = var29_28 /* !! */ ;
                        var29_28 /* !! */  = var12_12.toString();
                        Intrinsics.checkNotNullExpressionValue(var29_28 /* !! */ , (String)var11_11);
                        var2_2 = new Yo0((String)var29_28 /* !! */ , (String)var9_9 /* !! */ );
                        var18_17.a().c((Yo0)var2_2);
                        var9_9 /* !! */  = var38_36 /* !! */ ;
                        var2_2 = var39_37;
                        var29_28 /* !! */  = var40_38;
                    }
                    var39_37 = var2_2;
lbl236:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var39_37 = var2_2;
                var34_33 = var5_5;
                var35_34 = var6_6;
                ** continue;
                var38_36 /* !! */  = var9_9 /* !! */ ;
                var40_38 = var29_28 /* !! */ ;
                var2_2 = var18_17.g();
                var7_7 /* !! */  = var12_12.toString();
                Intrinsics.checkNotNullExpressionValue(var7_7 /* !! */ , (String)var11_11);
                var9_9 /* !! */  = var21_20.c;
                var2_2.c((String)var7_7 /* !! */ , (Set)var9_9 /* !! */ );
                if (var19_18 != 0) {
                    var2_2 = var18_17.d();
                    var9_9 /* !! */  = var12_12.toString();
                    Intrinsics.checkNotNullExpressionValue(var9_9 /* !! */ , (String)var11_11);
                    var7_7 /* !! */  = new si3_0((String)var4_4 /* !! */ , (String)var9_9 /* !! */ );
                    var2_2.a((si3_0)var7_7 /* !! */ );
                }
                var5_5 = var34_33;
                var6_6 = var35_34;
                var13_13 = var36_35;
                var9_9 /* !! */  = var38_36 /* !! */ ;
                var2_2 = var39_37;
                var29_28 /* !! */  = var40_38;
            }
            var34_33 = var5_5;
            var35_34 = var6_6;
            var3_3 = var5_5;
            var27_27 = true;
        }
        var1_1.h = var27_27;
        return var26_26 | var3_3;
    }
}

