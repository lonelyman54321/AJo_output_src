/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.services.data.Closet.ClosetComponentModel;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class MY1$c$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;

    public MY1$c$a(fs0_2 fs0_22, ArrayList arrayList, long l2) {
        this.a = fs0_22;
        this.b = arrayList;
        this.c = l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof MY1$c$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (MY1$c$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new MY1$c$a$a(this, (f80_0)var2_2);
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
            var9_9 = var1_1;
            var9_9 = (HashMap)var1_1;
            var10_10 = this.b;
            if (var10_10 != null) {
                var1_1 = null;
                var2_2 = (Product)var10_10.get(0);
                var11_11 = var2_2.getWishListCreatedDate();
                var13_13 = var9_9.size();
                if (var13_13 > 0) {
                    var10_10 = new List<Product>();
                    var2_2 = this.b.iterator();
                    var14_14 = false;
                    while ((var6_6 = (int)var2_2.hasNext()) != 0) {
                        var15_17 = (Product)var2_2.next();
                        var16_18 = var15_17.getFnlColorVariantData();
                        var17_21 = 0.0f;
                        var18_22 /* !! */  = null;
                        if (var16_18 != null) {
                            var16_18 = var16_18.getColorGroup();
                        } else {
                            var19_23 = 0;
                            var16_18 = null;
                            var20_24 = 0.0f;
                        }
                        var19_23 = TextUtils.isEmpty((CharSequence)var16_18);
                        if (var19_23 == 0) {
                            var16_18 = var15_17.getFnlColorVariantData();
                            if (var16_18 != null) {
                                var18_22 /* !! */  = var16_18.getColorGroup();
                            }
                        } else {
                            var16_18 = var15_17.getCode();
                            var19_23 = TextUtils.isEmpty((CharSequence)var16_18);
                            var18_22 /* !! */  = var19_23 == 0 ? var15_17.getCode() : "";
                        }
                        if ((var19_23 = TextUtils.isEmpty(var18_22 /* !! */ )) == 0 && (var19_23 = var9_9.containsKey(var18_22 /* !! */ )) != 0) {
                            var16_18 = var15_17.getPrice();
                            var18_22 /* !! */  = var9_9.get(var18_22 /* !! */ );
                            Intrinsics.checkNotNull(var18_22 /* !! */ );
                            var17_21 = Float.parseFloat(var18_22 /* !! */ );
                            if (var16_18 != null && (var16_18 = var16_18.getValue()) != null) {
                                var20_24 = Float.parseFloat((String)var16_18);
                            } else {
                                var19_23 = 0;
                                var20_24 = 0.0f;
                                var16_18 = null;
                            }
                            var21_25 = Float.compare(var17_21, var20_24);
                            if (var21_25 > 0 && (var19_23 = (cfr_temp_0 = (var17_21 -= var20_24) - (var20_24 = (float)(var22_26 = this.c))) == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1)) >= 0) {
                                var10_10.add(0, (Product)var15_17);
                                var15_17 = Unit.a;
                                var14_14 = true;
                                continue;
                            }
                            var10_10.add((Product)var15_17);
                            continue;
                        }
                        var10_10.add((Product)var15_17);
                    }
                    var16_18 = var1_1;
                    var1_1 = new ClosetComponentModel(var10_10, (HashMap)var9_9, var11_11, var14_14);
                } else {
                    var10_10 = this.b;
                    var14_15 = false;
                    var16_19 = var1_1;
                    var1_1 = new ClosetComponentModel(var10_10, (HashMap)var9_9, var11_11, false);
                }
            } else {
                var11_12 = -1;
                var14_16 = false;
                var16_20 = var1_1;
                var1_1 = new ClosetComponentModel(var10_10, (HashMap)var9_9, var11_12, false);
            }
            var4_4.b = var7_7;
            var2_2 = this.a;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

