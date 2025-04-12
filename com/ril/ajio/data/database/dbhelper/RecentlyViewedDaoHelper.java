/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.data.database.dbhelper;

import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$deleteAllEntries$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$getRecentlyViewedProds$$inlined$map$1;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$insertToDBAndDelete$1;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$processRecentlyViewed$1;
import com.ril.ajio.data.database.dbhelper.RecentlyViewedDaoHelper$special$$inlined$map$1;
import com.ril.ajio.data.database.entity.ProductExperience;
import com.ril.ajio.services.data.Product.ProductRvStoreType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class RecentlyViewedDaoHelper {
    public static final int $stable = 0;
    public static final RecentlyViewedDaoHelper INSTANCE;
    public static final int STORE_AJIO = 0;
    public static final int STORE_AJIOGRAM = 2;
    public static final int STORE_LUXE = 1;
    private static int storeId;

    static {
        RecentlyViewedDaoHelper recentlyViewedDaoHelper;
        INSTANCE = recentlyViewedDaoHelper = new RecentlyViewedDaoHelper();
        $stable = 8;
    }

    private RecentlyViewedDaoHelper() {
    }

    public static final /* synthetic */ Object access$deleteRecentlyViewed(RecentlyViewedDaoHelper recentlyViewedDaoHelper, AppDataBase appDataBase, ProductExperience productExperience, f80_0 f80_02) {
        return recentlyViewedDaoHelper.deleteRecentlyViewed(appDataBase, productExperience, f80_02);
    }

    public static final /* synthetic */ Object access$insertToDBAndDelete(RecentlyViewedDaoHelper recentlyViewedDaoHelper, AppDataBase appDataBase, ProductExperience productExperience, f80_0 f80_02) {
        return recentlyViewedDaoHelper.insertToDBAndDelete(appDataBase, productExperience, f80_02);
    }

    public static final /* synthetic */ Object access$processRecentlyViewed(RecentlyViewedDaoHelper recentlyViewedDaoHelper, AppDataBase appDataBase, HashMap hashMap, zr1_1 zr1_12, zr1_1 zr1_13, ProductExperience productExperience, zr1_1 zr1_14, f80_0 f80_02) {
        return recentlyViewedDaoHelper.processRecentlyViewed(appDataBase, hashMap, zr1_12, zr1_13, productExperience, zr1_14, f80_02);
    }

    private final boolean canPreserve(long l2) {
        long l3 = System.currentTimeMillis() - l2;
        long l4 = l3 - (l2 = 5184000000L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object < 0;
        return bl2;
    }

    private final Object deleteRecentlyViewed(AppDataBase object, ProductExperience productExperience, f80_0 productExperienceArray) {
        productExperience.getProductId();
        productExperience.getViewedMillis();
        object = ((AppDataBase)object).recentlyViewedDao();
        productExperienceArray = new ProductExperience[]{productExperience};
        object.deleteRecentlyViewed(productExperienceArray);
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    private final Object insertToDBAndDelete(AppDataBase var1_1, ProductExperience var2_2, f80_0 var3_3) {
        block11: {
            block12: {
                block9: {
                    block10: {
                        var4_4 = var3_3 instanceof RecentlyViewedDaoHelper$insertToDBAndDelete$1;
                        if (!var4_4) ** GOTO lbl-1000
                        var5_5 = var3_3;
                        var5_5 = (RecentlyViewedDaoHelper$insertToDBAndDelete$1)var3_3;
                        var6_6 = var5_5.label;
                        var7_7 = -1 << -1;
                        var8_8 = -0.0f;
                        var9_9 = var6_6 & var7_7;
                        if (var9_9 != 0) {
                            var5_5.label = var6_6 -= var7_7;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_5 = new RecentlyViewedDaoHelper$insertToDBAndDelete$1(this, (f80_0)var3_3);
                        }
                        var3_3 = var5_5.result;
                        var10_10 = j90_0.COROUTINE_SUSPENDED;
                        var7_7 = var5_5.label;
                        var9_9 = 1;
                        if (var7_7 == 0) break block9;
                        if (var7_7 != var9_9) break block10;
                        var11_11 = var5_5.I$0;
                        var2_2 = (Iterator)var5_5.L$3;
                        var12_12 = (ProductExperience)var5_5.L$2;
                        var13_13 = (AppDataBase)var5_5.L$1;
                        var14_14 = (RecentlyViewedDaoHelper)var5_5.L$0;
                        vl2_2.b(var3_3);
                        ** GOTO lbl52
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var3_3);
                if (var2_2 == null) break block11;
                var3_3 = var1_1.recentlyViewedDao().getNumberOfRVRows();
                var12_12 = z40_0.Companion;
                var12_12 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var12_12).a;
                var13_13 = "recent_item_max_limit";
                var7_7 = var12_12.g((String)var13_13);
                var15_15 = var3_3.intValue();
                if (var15_15 < var7_7) break block12;
                var13_13 = this;
                while ((var16_16 = var3_3.intValue()) >= var7_7) {
                    block13: {
                        var3_3 = var1_1.recentlyViewedDao();
                        var17_17 = RecentlyViewedDaoHelper.storeId;
                        if ((var3_3 = var3_3.fetchLRV(var17_17)) == null) break block13;
                        var3_3.size();
                        var3_3 = var3_3.iterator();
                        var14_14 = var13_13;
                        var13_13 = var1_1;
                        var11_11 = var7_7;
                        var12_12 = var2_2;
                        var2_2 = var3_3;
lbl52:
                        // 3 sources

                        while ((var16_16 = var2_2.hasNext()) != 0) {
                            var3_3 = (ProductExperience)var2_2.next();
                            Intrinsics.checkNotNull(var3_3);
                            var5_5.L$0 = var14_14;
                            var5_5.L$1 = var13_13;
                            var5_5.L$2 = var12_12;
                            var5_5.L$3 = var2_2;
                            var5_5.I$0 = var11_11;
                            var5_5.label = var9_9;
                            if ((var3_3 = super.deleteRecentlyViewed((AppDataBase)var13_13, (ProductExperience)var3_3, (f80_0)var5_5)) != var10_10) continue;
                            return var10_10;
                        }
                        var2_2 = var12_12;
                        var7_7 = var11_11;
                        var1_1 = var13_13;
                        var13_13 = var14_14;
                    }
                    var3_3 = var1_1.recentlyViewedDao().getNumberOfRVRows();
                }
            }
            var3_3 = var2_2.getProductId();
            var5_5 = "%";
            var14_14 = cP.a((String)var5_5, (String)var3_3, (String)var5_5);
            var3_3 = var1_1.recentlyViewedDao().doesExist((String)var14_14);
            var16_16 = var3_3.intValue();
            if (var16_16 > 0) {
                var10_10 = var1_1.recentlyViewedDao();
                var8_8 = var2_2.getSellingPrice();
                var18_18 = var2_2.getViewedMillis();
                var20_19 = var2_2.getStoreType();
                var10_10.updateRecentlyViewed(var8_8, var18_18, (String)var14_14, var20_19);
                var2_2.getProductId();
            } else {
                var3_3 = var1_1.recentlyViewedDao();
                var3_3.insertRecentlyViewed((ProductExperience)var2_2);
                var2_2.getProductId();
                var2_2.getSellingPrice();
            }
            var1_1 = var1_1.recentlyViewedDao();
            var1_1.getNumberOfRVRows();
        }
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final Object processRecentlyViewed(AppDataBase var1_1, HashMap var2_2, zr1_1 var3_3, zr1_1 var4_4, ProductExperience var5_5, zr1_1 var6_6, f80_0 var7_7) {
        block27: {
            block25: {
                block22: {
                    block23: {
                        block24: {
                            var8_8 = var7_7;
                            var9_9 = var7_7 instanceof RecentlyViewedDaoHelper$processRecentlyViewed$1;
                            if (!var9_9) ** GOTO lbl-1000
                            var10_10 = var7_7;
                            var10_10 = (RecentlyViewedDaoHelper$processRecentlyViewed$1)var7_7;
                            var11_11 = var10_10.label;
                            var12_12 = -1 << -1;
                            var13_13 = var11_11 & var12_12;
                            if (var13_13 != 0) {
                                var10_10.label = var11_11 -= var12_12;
                                var14_14 = this;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var14_14 = this;
                                var10_10 = new RecentlyViewedDaoHelper$processRecentlyViewed$1(this, (f80_0)var8_8);
                            }
                            var8_8 = var10_10.result;
                            var15_15 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                            var13_13 = var10_10.label;
                            var16_16 = 1;
                            var17_17 = 2;
                            if (var13_13 == 0) break block22;
                            if (var13_13 == var16_16) break block23;
                            if (var13_13 != var17_17) break block24;
                            var15_15 /* !! */  = (ArrayList)var10_10.L$5;
                            var18_18 = (StringBuilder)var10_10.L$4;
                            var19_19 = (zr1_1)var10_10.L$3;
                            var20_20 = (zr1_1)var10_10.L$2;
                            var21_21 = (zr1_1)var10_10.L$1;
                            var10_10 = (HashMap)var10_10.L$0;
                            vl2_2.b(var8_8);
                            var22_22 = false;
                            ** GOTO lbl253
                        }
                        var8_8 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var8_8;
                    }
                    var13_13 = var10_10.I$1;
                    var22_23 = var10_10.I$0;
                    var23_24 = (ArrayList)var10_10.L$10;
                    var24_25 = (List)var10_10.L$9;
                    var25_26 = (ArrayList)var10_10.L$8;
                    var26_27 = (StringBuilder)var10_10.L$7;
                    var27_28 = (zr1_1)var10_10.L$6;
                    var28_29 = (ProductExperience)var10_10.L$5;
                    var21_21 = (zr1_1)var10_10.L$4;
                    var29_30 = (zr1_1)var10_10.L$3;
                    var20_20 = (HashMap)var10_10.L$2;
                    var19_19 = (AppDataBase)var10_10.L$1;
                    var14_14 = (RecentlyViewedDaoHelper)var10_10.L$0;
                    vl2_2.b(var8_8);
                    ** GOTO lbl133
                }
                vl2_2.b(var8_8);
                var8_8 = new StringBuilder();
                var14_14 = new ArrayList();
                var18_18 = var1_1.recentlyViewedDao().getNumberOfRVRows();
                var13_13 = var18_18.intValue();
                if (var13_13 <= 0) break block25;
                var18_18 = var1_1.recentlyViewedDao();
                var16_16 = RecentlyViewedDaoHelper.storeId;
                var18_18 = var18_18.fetchRVRowsInOrder(var16_16);
                var18_18.size();
                var19_19 = var18_18.iterator();
                while ((var30_31 = var19_19.hasNext()) != 0) {
                    var20_20 = (ProductExperience)var19_19.next();
                    var20_20.getStoreType();
                    var20_20.toString();
                }
                var19_19 = new ArrayList();
                var30_31 = var18_18.size() - 1;
                var17_17 = 0;
                var29_30 = this;
                var27_28 = var8_8;
                var21_21 = var10_10;
                var26_27 = var14_14;
                var25_26 = var18_18;
                var24_25 = var19_19;
                var31_32 = 0;
                var23_24 = null;
                var32_33 = -1;
                var8_8 = var1_1;
                var10_10 = var2_2;
                var14_14 = var3_3;
                var18_18 = var4_4;
                var19_19 = var5_5;
                var20_20 = var6_6;
                for (var22_23 = var30_31; var32_33 < var22_23; var22_23 += var32_33) {
                    block26: {
                        var28_29 = (ProductExperience)var25_26.get(var22_23);
                        var33_34 = var22_23;
                        var34_35 = var31_32;
                        var35_36 = var28_29.getViewedMillis();
                        var22_23 = (int)super.canPreserve(var35_36);
                        if (var22_23 != 0) break block26;
                        Intrinsics.checkNotNull(var28_29);
                        var21_21.L$0 = var29_30;
                        var21_21.L$1 = var8_8;
                        var21_21.L$2 = var10_10;
                        var21_21.L$3 = var14_14;
                        var21_21.L$4 = var18_18;
                        var21_21.L$5 = var19_19;
                        var21_21.L$6 = var20_20;
                        var21_21.L$7 = var27_28;
                        var21_21.L$8 = var26_27;
                        var21_21.L$9 = var25_26;
                        var21_21.L$10 = var24_25;
                        var22_23 = var31_32;
                        var21_21.I$0 = var31_32;
                        var31_32 = var33_34;
                        var21_21.I$1 = var33_34;
                        var1_1 = var14_14;
                        var11_11 = 1;
                        var37_37 = 1.4E-45f;
                        var21_21.label = var11_11;
                        var14_14 = super.deleteRecentlyViewed((AppDataBase)var8_8, (ProductExperience)var28_29, (f80_0)var21_21);
                        if (var14_14 == var15_15 /* !! */ ) {
                            return var15_15 /* !! */ ;
                        }
                        var28_29 = var19_19;
                        var14_14 = var29_30;
                        var29_30 = var1_1;
                        var19_19 = var8_8;
                        var38_38 = var20_20;
                        var20_20 = var10_10;
                        var10_10 = var21_21;
                        var21_21 = var18_18;
                        var13_13 = var33_34;
                        var23_24 = var24_25;
                        var24_25 = var25_26;
                        var25_26 = var26_27;
                        var26_27 = var27_28;
                        var27_28 = var38_38;
lbl133:
                        // 2 sources

                        var8_8 = var19_19;
                        var19_19 = var28_29;
                        var32_33 = -1;
                        var38_38 = var21_21;
                        var21_21 = var10_10;
                        var10_10 = var20_20;
                        var20_20 = var27_28;
                        var27_28 = var26_27;
                        var26_27 = var25_26;
                        var25_26 = var24_25;
                        var24_25 = var23_24;
                        var31_32 = var22_23;
                        var22_23 = var13_13;
                        var18_18 = var38_38;
                        var39_39 = var29_30;
                        var29_30 = var14_14;
                        var14_14 = var39_39;
                        continue;
                    }
                    var31_32 = var33_34;
                    var22_23 = var34_35;
                    var1_1 = var14_14;
                    var14_14 = z40_0.Companion;
                    var2_2 = var8_8;
                    var8_8 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var14_14).a;
                    var14_14 = "recent_item_max_limit";
                    var40_40 = var8_8.g((String)var14_14);
                    if (var34_35 < var40_40) {
                        var14_14 = var28_29.getProductId();
                        var3_3 = var18_18;
                        var13_13 = var28_29.getStoreType();
                        var8_8 = new ProductRvStoreType((String)var14_14, var13_13);
                        var26_27.add(var8_8);
                        var8_8 = var28_29.getProductId();
                        var24_25.add(var8_8);
                        if (var10_10 != null) {
                            var8_8 = var28_29.getProductId();
                            var37_37 = var28_29.getSellingPrice();
                            var18_18 = new StringBuilder();
                            var18_18.append(var37_37);
                            var14_14 = var18_18.toString();
                            var10_10.put(var8_8, var14_14);
                        }
                        var40_40 = var22_23 + 1;
                        var14_14 = var1_1;
                        var18_18 = var3_3;
                        var22_23 = var31_32;
                        var32_33 = -1;
                        var31_32 = var40_40;
                        var8_8 = var2_2;
                        continue;
                    }
                    var3_3 = var18_18;
                    var14_14 = var1_1;
                    var8_8 = var2_2;
                    var32_33 = -1;
                    var31_32 = var34_35;
                    var22_23 = var33_34;
                }
                var2_2 = var8_8;
                var1_1 = var14_14;
                var3_3 = var18_18;
                var40_40 = var24_25.size();
                if (var40_40 > 0) {
                    var24_25.size();
                    var40_40 = var24_25.size();
                    var11_11 = 1;
                    var37_37 = 1.4E-45f;
                    var40_40 -= var11_11;
                    while (var32_33 < var40_40) {
                        var11_11 = var27_28.length();
                        if (var11_11 > 0) {
                            var14_14 = ",";
                            var27_28.append((String)var14_14);
                        }
                        var14_14 = (String)var24_25.get(var40_40);
                        var27_28.append((String)var14_14);
                        var40_40 += -1;
                    }
                }
                var14_14 = var1_1;
                var8_8 = var2_2;
                var18_18 = var3_3;
                break block27;
            }
            var29_30 = this;
            var18_18 = var4_4;
            var19_19 = var5_5;
            var20_20 = var6_6;
            var27_28 = var8_8;
            var21_21 = var10_10;
            var26_27 = var14_14;
            var8_8 = var1_1;
            var10_10 = var2_2;
            var14_14 = var3_3;
        }
        if (var19_19 != null) {
            var21_21.L$0 = var10_10;
            var21_21.L$1 = var14_14;
            var21_21.L$2 = var18_18;
            var21_21.L$3 = var20_20;
            var21_21.L$4 = var27_28;
            var21_21.L$5 = var26_27;
            var22_23 = 0;
            var21_21.L$6 = null;
            var21_21.L$7 = null;
            var21_21.L$8 = null;
            var21_21.L$9 = null;
            var21_21.L$10 = null;
            var21_21.label = var31_32 = 2;
            if ((var8_8 = super.insertToDBAndDelete((AppDataBase)var8_8, (ProductExperience)var19_19, (f80_0)var21_21)) == var15_15 /* !! */ ) {
                return var15_15 /* !! */ ;
            }
            var21_21 = var14_14;
            var19_19 = var20_20;
            var15_15 /* !! */  = var26_27;
            var20_20 = var18_18;
            var18_18 = var27_28;
lbl253:
            // 2 sources

            var26_27 = var15_15 /* !! */ ;
            var27_28 = var18_18;
            var18_18 = var20_20;
            var14_14 = var21_21;
            var20_20 = var19_19;
        } else {
            var22_23 = 0;
        }
        if (var14_14 != null) {
            var40_40 = TextUtils.isEmpty((CharSequence)var27_28);
            if (var40_40 != 0) {
                var14_14.i(null);
            } else {
                var8_8 = var27_28.toString();
                var14_14.i(var8_8);
            }
        } else if (var18_18 != null && var10_10 != null) {
            var8_8 = "ALL_IDs";
            var14_14 = var27_28.toString();
            var10_10.put(var8_8, var14_14);
            var18_18.i(var10_10);
        }
        if (var20_20 != null) {
            var20_20.i(var26_27);
        }
        return Unit.a;
    }

    public final es0_2 deleteAllEntries() {
        Object object = DatabaseCreator.INSTANCE.getDBInstance();
        RecentlyViewedDaoHelper$deleteAllEntries$$inlined$map$1 recentlyViewedDaoHelper$deleteAllEntries$$inlined$map$1 = new RecentlyViewedDaoHelper$deleteAllEntries$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m(recentlyViewedDaoHelper$deleteAllEntries$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 fetchAndInsertRecentlyViewed(ProductExperience object, zr1_1 zr1_12, zr1_1 zr1_13) {
        Intrinsics.checkNotNullParameter(object, "recentlyViewed");
        Intrinsics.checkNotNullParameter(zr1_12, "mutableRecentlyViewed");
        Intrinsics.checkNotNullParameter(zr1_13, "mutableRVStoreData");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1 recentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1 = new RecentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1(es0_22, zr1_12, (ProductExperience)object, zr1_13);
        object = ir0_2.a;
        return ms0_1.m(recentlyViewedDaoHelper$fetchAndInsertRecentlyViewed$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 getRecentlyViewed(zr1_1 object, zr1_1 zr1_12) {
        Intrinsics.checkNotNullParameter(object, "mutableRecentlyViewed");
        Intrinsics.checkNotNullParameter(zr1_12, "mutableRVStoreData");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1 recentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1 = new RecentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1(es0_22, (zr1_1)object, zr1_12);
        object = ir0_2.a;
        return ms0_1.m(recentlyViewedDaoHelper$getRecentlyViewed$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 getRecentlyViewedCount() {
        Object object = DatabaseCreator.INSTANCE.getDBInstance();
        RecentlyViewedDaoHelper$special$$inlined$map$1 recentlyViewedDaoHelper$special$$inlined$map$1 = new RecentlyViewedDaoHelper$special$$inlined$map$1((es0_2)object);
        object = ir0_2.a;
        return ms0_1.m(recentlyViewedDaoHelper$special$$inlined$map$1, (CoroutineContext)object);
    }

    public final es0_2 getRecentlyViewedProds(zr1_1 object) {
        Intrinsics.checkNotNullParameter(object, "mutableRecentlyViewed");
        es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
        RecentlyViewedDaoHelper$getRecentlyViewedProds$$inlined$map$1 recentlyViewedDaoHelper$getRecentlyViewedProds$$inlined$map$1 = new RecentlyViewedDaoHelper$getRecentlyViewedProds$$inlined$map$1(es0_22, (zr1_1)object);
        object = ir0_2.a;
        return ms0_1.m(recentlyViewedDaoHelper$getRecentlyViewedProds$$inlined$map$1, (CoroutineContext)object);
    }

    public final int getStoreId() {
        return storeId;
    }

    public final void setStoreId(int n3) {
        storeId = n3;
    }
}

