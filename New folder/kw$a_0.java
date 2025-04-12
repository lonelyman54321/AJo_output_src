/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.entity.ProductExperience;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kW$a
 */
public final class kw$a_0
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ List b;

    public kw$a_0(fs0_2 fs0_22, ArrayList arrayList) {
        this.a = fs0_22;
        this.b = arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        block14: {
            block10: {
                block15: {
                    block11: {
                        block12: {
                            block13: {
                                var3_3 = var2_2 instanceof kW$a$a;
                                if (!var3_3) ** GOTO lbl-1000
                                var4_4 = var2_2;
                                var4_4 = (kW$a$a)var2_2;
                                var5_5 = var4_4.b;
                                var6_6 = -1 << -1;
                                var7_7 = var5_5 & var6_6;
                                if (var7_7 != 0) {
                                    var4_4.b = var5_5 -= var6_6;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var4_4 = new kW$a$a(this, (f80_0)var2_2);
                                }
                                var2_2 = var4_4.a;
                                var8_8 = j90_0.COROUTINE_SUSPENDED;
                                var6_6 = var4_4.b;
                                var7_7 = 1;
                                var9_9 = 2;
                                if (var6_6 == 0) break block11;
                                if (var6_6 == var7_7) break block12;
                                if (var6_6 != var9_9) break block13;
                                vl2_2.b(var2_2);
                                break block14;
                            }
                            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var1_1;
                        }
                        var1_1 = var4_4.f;
                        var10_10 = var4_4.e;
                        var11_11 = var4_4.c;
                        vl2_2.b(var2_2);
                        break block15;
                    }
                    vl2_2.b(var2_2);
                    var1_1 = (AppDataBase)var1_1;
                    var2_2 = this.b.iterator();
                    var11_11 = this.a;
                    var10_10 = var1_1;
                    var1_1 = var2_2;
                }
                do {
                    var12_12 = var1_1.hasNext();
                    var13_13 = null;
                    if (!var12_12) break block10;
                    var2_2 = (Product)var1_1.next();
                    var14_14 = new ProductExperience();
                    var15_15 = var2_2.getCode();
                    Intrinsics.checkNotNull(var15_15);
                    var14_14.setProductId((String)var15_15);
                    var15_15 = z40_0.Companion;
                    var15_15 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var15_15).a;
                    var16_16 = "wishlist_state_enable";
                    var17_17 = var15_15.a(var16_16);
                    if (var17_17 != 0) {
                        var15_15 = ih3_1.b;
                        var16_16 = var14_14.getProductId();
                        var15_15.add(var16_16);
                    }
                    if ((var15_15 = var2_2.getPrice()) != null) {
                        var15_15 = var15_15.getValue();
                    } else {
                        var17_17 = 0;
                        var15_15 = null;
                    }
                    if (var15_15 != null && (var17_17 = var15_15.length()) != 0) {
                        if ((var2_2 = var2_2.getPrice()) != null) {
                            var13_13 = var2_2.getValue();
                        }
                        Intrinsics.checkNotNull(var13_13);
                        var2_2 = Float.valueOf(var13_13);
                        var18_18 = var2_2.floatValue();
                        var14_14.setSellingPrice(var18_18);
                    } else {
                        var12_12 = false;
                        var18_18 = 0.0f;
                        var2_2 = null;
                        var14_14.setSellingPrice(0.0f);
                    }
                    var19_19 = System.currentTimeMillis();
                    var14_14.setViewedMillis(var19_19);
                    var14_14.setExpType(var9_9);
                    var2_2 = iw_1.a;
                    var4_4.c = var11_11;
                    var4_4.e = var10_10;
                    var4_4.f = var1_1;
                    var4_4.b = var7_7;
                    iw_1.b((iw_1)var2_2, var14_14, (AppDataBase)var10_10);
                } while ((var2_2 = Boolean.TRUE) != var8_8);
                return var8_8;
            }
            var1_1 = Boolean.TRUE;
            var4_4.c = null;
            var4_4.e = null;
            var4_4.f = null;
            var4_4.b = var9_9;
            if ((var1_1 = var11_11.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

