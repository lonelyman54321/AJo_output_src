/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.entity.ProductExperience;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iW
 */
public final class iw_1 {
    public static final iw_1 a;
    public static final long b;

    static {
        Object object = new Object();
        a = object;
        object = z40_0.Companion;
        b = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("price_drop_min_value");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Serializable a(iw_1 var0, AppDataBase var1_1, f80_0 var2_2) {
        block11: {
            block12: {
                block13: {
                    var3_3 = var2_2;
                    var0.getClass();
                    var4_4 = var2_2 instanceof jw_2;
                    if (var4_4 == 0) ** GOTO lbl-1000
                    var5_5 = var2_2;
                    var5_5 = (jw_2)var2_2;
                    var6_6 = var5_5.j;
                    var7_7 = -1 << -1;
                    var8_8 = var6_6 & var7_7;
                    if (var8_8 != 0) {
                        var5_5.j = var6_6 -= var7_7;
                        var9_9 = var0;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var9_9 = var0;
                        var5_5 = new jw_2(var0, (f80_0)var3_3);
                    }
                    var3_3 = var5_5.h;
                    var10_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var8_8 = var5_5.j;
                    var11_11 = -1;
                    var12_12 = 1;
                    if (var8_8 == 0) break block12;
                    if (var8_8 != var12_12) break block13;
                    var6_6 = var5_5.g;
                    var13_13 = var5_5.f;
                    var14_14 = var5_5.e;
                    var15_15 = var5_5.d;
                    var16_16 = var5_5.c;
                    var17_17 = var5_5.b;
                    var18_18 = var5_5.a;
                    vl2_2.b(var3_3);
                    ** GOTO lbl101
                }
                var3_3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var3_3;
            }
            vl2_2.b(var3_3);
            var3_3 = new StringBuilder();
            var13_13 = new HashMap();
            var14_14 = var1_1.recentlyViewedDao().getNumberOfClosetRows();
            var19_19 = var14_14.intValue();
            if (var19_19 > 0) {
                var14_14 = var1_1.recentlyViewedDao().fetchClosetInOrder();
                var14_14.size();
                var15_15 = var14_14.iterator();
                while ((var20_20 = var15_15.hasNext()) != 0) {
                    var16_16 = (ProductExperience)var15_15.next();
                    Objects.toString(var16_16);
                }
                var15_15 = new ArrayList();
                var17_17 = var3_3;
                var3_3 = var1_1;
                var21_21 = var15_15;
                var15_15 = var13_13;
                var13_13 = var21_21;
                for (var20_20 = var14_14.size() - var12_12; var11_11 < var20_20; var20_20 += var11_11) {
                    var18_18 = (ProductExperience)var14_14.get(var20_20);
                    var22_22 = var18_18.getViewedMillis();
                    var9_9.getClass();
                    var24_23 = System.currentTimeMillis() - var22_22;
                    var22_22 = 5184000000L;
                    var26_24 = var24_23 == var22_22 ? 0 : (var24_23 < var22_22 ? -1 : 1);
                    if (var26_24 < 0) {
                        var27_25 = var18_18.getProductId();
                        var13_13.add(var27_25);
                        var27_25 = var18_18.getProductId();
                        var28_26 = var18_18.getSellingPrice();
                        var29_27 = new StringBuilder();
                        var29_27.append(var28_26);
                        var18_18 = var29_27.toString();
                        var15_15.put(var27_25, var18_18);
                        continue;
                    }
                    Intrinsics.checkNotNull(var18_18);
                    var5_5.a = var9_9;
                    var5_5.b = var3_3;
                    var5_5.c = var17_17;
                    var5_5.d = var15_15;
                    var27_25 = var14_14;
                    var27_25 = (List)var14_14;
                    var5_5.e = var27_25;
                    var5_5.f = var13_13;
                    var5_5.g = var20_20;
                    var5_5.j = var12_12;
                    var27_25 = new ArrayList<Object>();
                    var18_18 = var18_18.getProductId();
                    var27_25.add(var18_18);
                    var3_3.recentlyViewedDao().bulkDeleteClosetData(var27_25);
                    var18_18 = Unit.a;
                    if (var18_18 == var10_10 /* !! */ ) break block11;
                    var18_18 = var9_9;
                    var6_6 = var20_20;
                    var16_16 = var17_17;
                    var17_17 = var3_3;
lbl101:
                    // 2 sources

                    var3_3 = var17_17;
                    var17_17 = var16_16;
                    var20_20 = var6_6;
                    var9_9 = var18_18;
                }
                var30_28 = var13_13.size();
                if (var30_28 > 0) {
                    var13_13.size();
                    for (var30_28 = var13_13.size() - var12_12; var11_11 < var30_28; var30_28 += -1) {
                        var4_4 = var17_17.length();
                        if (var4_4 > 0) {
                            var5_5 = ",";
                            var17_17.append((String)var5_5);
                        }
                        var5_5 = (String)var13_13.get(var30_28);
                        var17_17.append((String)var5_5);
                    }
                }
                var10_10 /* !! */  = var15_15;
            } else {
                var10_10 /* !! */  = var13_13;
            }
        }
        return (Serializable)var10_10 /* !! */ ;
    }

    public static final void b(iw_1 object, ProductExperience productExperience, AppDataBase appDataBase) {
        object.getClass();
        if (productExperience != null) {
            appDataBase.recentlyViewedDao().getNumberOfClosetRows();
            object = productExperience.getProductId();
            Object object2 = "%";
            object = cP.a((String)object2, (String)object, (String)object2);
            object2 = appDataBase.recentlyViewedDao().doesClosetEntityExist((String)object);
            int n3 = (Integer)object2;
            if (n3 > 0) {
                object2 = appDataBase.recentlyViewedDao();
                float f5 = productExperience.getSellingPrice();
                long l2 = productExperience.getViewedMillis();
                object2.updateClosetData(f5, l2, (String)object);
                productExperience.getProductId();
            } else {
                object = appDataBase.recentlyViewedDao();
                object.insertClosetData(productExperience);
                productExperience.getProductId();
                productExperience.getSellingPrice();
            }
            object = appDataBase.recentlyViewedDao();
            object.getNumberOfClosetRows();
        }
    }

    public static es0_2 c(String object, String object2) {
        float f5;
        boolean bl2;
        ProductExperience productExperience = new ProductExperience();
        Intrinsics.checkNotNull(object);
        productExperience.setProductId((String)object);
        if (object2 != null && !(bl2 = Intrinsics.areEqual(object2, object = "null"))) {
            f5 = Float.parseFloat((String)object2);
        } else {
            bl2 = false;
            f5 = 0.0f;
            object = null;
        }
        productExperience.setSellingPrice(f5);
        long l2 = System.currentTimeMillis();
        productExperience.setViewedMillis(l2);
        productExperience.setExpType(2);
        object = DatabaseCreator.INSTANCE.getDBInstance();
        object2 = new lw_2((es0_2)object, productExperience);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public static es0_2 d() {
        Object object = DW.a;
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        Object object2 = "closet_price_drop";
        boolean bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            object = DatabaseCreator.INSTANCE.getDBInstance();
            object2 = new iw$a_0((es0_2)object);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        } else {
            object = new HashMap();
            object = object2 = new ps0_2(object);
        }
        return object;
    }

    public static boolean e(Product object, String string2) {
        long l2;
        float f5;
        float f6;
        float f7;
        int n3;
        float f8;
        Intrinsics.checkNotNullParameter(object, "product");
        Object object2 = ((Product)object).getPrice();
        boolean bl2 = false;
        if (object2 == null) {
            return false;
        }
        object2 = ((Product)object).getPrice();
        Intrinsics.checkNotNull(object2);
        object2 = ((Price)object2).getValue();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
        if (bl3) {
            return false;
        }
        object = ((Product)object).getPrice();
        bl3 = false;
        object2 = null;
        if (object != null && (object = ((Price)object).getValue()) != null) {
            f8 = Float.parseFloat((String)object);
        } else {
            n3 = 0;
            f8 = 0.0f;
            object = null;
        }
        if (string2 != null) {
            f7 = Float.parseFloat(string2);
        } else {
            f7 = 0.0f;
            string2 = null;
        }
        n3 = (f6 = (f7 -= f8) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (n3 > 0 && (n3 = (int)((f5 = f7 - (f8 = (float)(l2 = b))) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean f(HashMap hashMap, ArrayList object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "products");
        Object object2 = "savedProducts";
        Intrinsics.checkNotNullParameter(hashMap, (String)object2);
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Product)object.next();
            String string2 = ((Product)object2).getCode();
            boolean bl3 = hashMap.containsKey(string2);
            if (!bl3) continue;
            string2 = ((Product)object2).getCode();
            bl2 = iw_1.e((Product)object2, string2 = (String)hashMap.get(string2));
            if (!bl2) continue;
            return true;
        }
        return false;
    }
}

