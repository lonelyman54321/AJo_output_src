/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.entity.ProductExperience;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class GH3$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ List b;

    public GH3$a(fs0_2 fs0_22, List list) {
        this.a = fs0_22;
        this.b = list;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof GH3$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (GH3$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new GH3$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var1_1 = (AppDataBase)var1_1;
            var2_2 = var1_1.recentlyViewedDao().fetchCloset();
            var9_9 = new ArrayList();
            Intrinsics.checkNotNull(var2_2);
            var10_10 = var2_2;
            var10_10 = ((Iterable)var2_2).iterator();
            while (true) {
                var11_11 = var10_10.hasNext();
                var12_12 = this.b;
                var13_13 = null;
                if (var11_11 == 0) break;
                var14_14 = (Object[])var10_10.next();
                if (var14_14 == null || (var15_15 = var14_14.length()) == 0 || (var16_16 = var12_12.contains(var14_14)) != 0) continue;
                var12_12 = yn3_0.a;
                var17_17 = kp1_0.c("wishlistSync: productToRemove: ", (String)var14_14);
                var13_13 = new Object[]{};
                var12_12.a((String)var17_17, var13_13);
                var9_9.add(var14_14);
            }
            var18_18 = var9_9.isEmpty() ^ var7_7;
            if (var18_18 != 0) {
                var1_1.recentlyViewedDao().bulkDeleteClosetData((List)var9_9);
                var9_9 = yn3_0.a;
                var10_10 = "wishlistSync: bulkDelete";
                var14_14 = new Object[]{};
                var9_9.a((String)var10_10, (Object[])var14_14);
            }
            var9_9 = new ArrayList();
            var18_18 = (int)ih3_1.a;
            ih3_1.b.clear();
            var12_12 = (Iterable)var12_12;
            var10_10 = var12_12.iterator();
            while ((var11_11 = var10_10.hasNext()) != 0) {
                var14_14 = (String)var10_10.next();
                if (var14_14 == null || (var16_16 = var14_14.length()) == 0) continue;
                var16_16 = (int)ih3_1.a;
                var12_12 = ih3_1.b;
                var12_12.add(var14_14);
                var16_16 = (int)var2_2.contains(var14_14);
                if (var16_16 != 0) continue;
                var12_12 = new ProductExperience();
                var12_12.setProductId((String)var14_14);
                var12_12.setSellingPrice(0.0f);
                var19_19 = System.currentTimeMillis();
                var12_12.setViewedMillis(var19_19);
                var11_11 = 2;
                var12_12.setExpType(var11_11);
                var9_9.add(var12_12);
                var14_14 = yn3_0.a;
                var12_12 = var12_12.getProductId();
                var12_12 = kp1_0.c("wishlistSync: productToAdd: ", (String)var12_12);
                var17_17 = new Object[]{};
                var14_14.a((String)var12_12, var17_17);
            }
            var21_20 = var9_9.isEmpty() ^ var7_7;
            if (var21_20 != 0) {
                var1_1.recentlyViewedDao().bulkInsertClosetData((List)var9_9);
                var1_1 = yn3_0.a;
                var2_2 = "wishlistSync: bulkInsert";
                var9_9 = new Object[]{};
                var1_1.a((String)var2_2, var9_9);
            }
            var1_1 = Boolean.TRUE;
            var4_4.b = var7_7;
            var2_2 = this.a;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

