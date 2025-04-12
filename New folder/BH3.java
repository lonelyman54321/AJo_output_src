/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.data.repo.WishListRepo;
import com.ril.ajio.services.data.Product.PDPClosetActionIdentifier;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.query.QueryCart;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class BH3 {
    public final WishListRepo a;
    public Product b;
    public Product c;
    public PDPClosetActionIdentifier d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final zr1_1 g;
    public final zr1_1 h;
    public final zr1_1 i;

    public BH3(WishListRepo object) {
        Intrinsics.checkNotNullParameter(object, "wishListRepo");
        this.a = object;
        object = PDPClosetActionIdentifier.DEFAULT;
        this.d = object;
        this.e = object;
        super();
        this.f = object;
        this.g = object;
        super();
        this.h = object;
        this.i = object;
    }

    public static /* synthetic */ Object b(BH3 bH3, String string2, String string3, String string4, String string5, boolean bl2, f80_0 f80_02, int n3) {
        boolean bl3;
        int n4;
        int n7 = n3 & 8;
        if (n7 != 0) {
            n4 = 0;
            string5 = null;
        }
        String string6 = string5;
        n4 = n3 & 0x10;
        if (n4 != 0) {
            bl2 = false;
            bl3 = false;
        } else {
            bl3 = bl2;
        }
        return bH3.a(string2, string3, string4, string6, bl3, f80_02);
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(String var1_1, String var2_2, String var3_3, String var4_4, boolean var5_5, f80_0 var6_6) {
        block8: {
            block9: {
                block5: {
                    block6: {
                        block7: {
                            var7_7 = var6_6 instanceof BH3$a;
                            if (!var7_7) ** GOTO lbl-1000
                            var8_8 = var6_6;
                            var8_8 = (BH3$a)var6_6;
                            var9_9 = var8_8.e;
                            var10_10 = -1 << -1;
                            var11_11 = var9_9 & var10_10;
                            if (var11_11 != 0) {
                                var8_8.e = var9_9 -= var10_10;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var8_8 = new BH3$a(this, (f80_0)var6_6);
                            }
                            var6_6 = var8_8.c;
                            var12_12 = j90_0.COROUTINE_SUSPENDED;
                            var10_10 = var8_8.e;
                            var11_11 = 2;
                            var13_13 = 1;
                            if (var10_10 == 0) break block5;
                            if (var10_10 == var13_13) break block6;
                            if (var10_10 != var11_11) break block7;
                            vl2_2.b(var6_6);
                            break block8;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var8_8.b;
                    var2_2 = var8_8.a;
                    vl2_2.b(var6_6);
                    break block9;
                }
                vl2_2.b(var6_6);
                var6_6 = new QueryCart();
                var6_6.setProductCode((String)var1_1);
                var6_6.setQuantity(var13_13);
                if (!var5_5) {
                    var14_14 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                    var15_15 = this.b;
                    var14_14.pushAddToClosetWidgetEvent(var15_15, (String)var3_3, var4_4);
                }
                var8_8.a = this;
                var8_8.b = var1_1;
                var8_8.e = var13_13;
                var3_3 = this.a;
                if ((var6_6 = var3_3.addToWishList((QueryCart)var6_6, (String)var2_2, var8_8)) == var12_12) {
                    return var12_12;
                }
                var2_2 = this;
            }
            var6_6 = (es0_2)var6_6;
            var4_4 = null;
            var3_3 = new BH3$b((BH3)var2_2, null);
            var14_14 = new at0_1((es0_2)var6_6, (gx0_2)var3_3);
            var3_3 = new BH3$c((BH3)var2_2, (String)var1_1);
            var8_8.a = null;
            var8_8.b = null;
            var8_8.e = var11_11;
            var1_1 = var14_14.collect((fs0_2)var3_3, var8_8);
            if (var1_1 == var12_12) {
                return var12_12;
            }
        }
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(String var1_1, String var2_2, String var3_3, f80_0 var4_4) {
        block8: {
            block9: {
                block5: {
                    block6: {
                        block7: {
                            var5_5 = var4_4 instanceof BH3$d;
                            if (!var5_5) ** GOTO lbl-1000
                            var6_6 = var4_4;
                            var6_6 = (BH3$d)var4_4;
                            var7_7 = var6_6.e;
                            var8_8 = -1 << -1;
                            var9_9 = var7_7 & var8_8;
                            if (var9_9 != 0) {
                                var6_6.e = var7_7 -= var8_8;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var6_6 = new BH3$d(this, (f80_0)var4_4);
                            }
                            var4_4 = var6_6.c;
                            var10_10 = j90_0.COROUTINE_SUSPENDED;
                            var8_8 = var6_6.e;
                            var9_9 = 2;
                            var11_11 = 1;
                            if (var8_8 == 0) break block5;
                            if (var8_8 == var11_11) break block6;
                            if (var8_8 != var9_9) break block7;
                            vl2_2.b(var4_4);
                            break block8;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var6_6.b;
                    var2_2 = var6_6.a;
                    vl2_2.b(var4_4);
                    break block9;
                }
                vl2_2.b(var4_4);
                var4_4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var12_12 = this.c;
                var4_4.pushRemoveFromClosetWidgetEvent(var12_12, (String)var2_2, (String)var3_3);
                var2_2 = this.c;
                if (var2_2 != null) {
                    var3_3 = el1_2.a;
                    var3_3 = yt2_2.PLP;
                    el1_2.d((yt2_2)var3_3, (Product)var2_2);
                }
                var2_2 = new QueryCart();
                var2_2.setProductCode((String)var1_1);
                var6_6.a = this;
                var6_6.b = var1_1;
                var6_6.e = var11_11;
                var3_3 = this.a;
                var4_4 = var3_3.removeFromWishList((QueryCart)var2_2, var6_6);
                if (var4_4 == var10_10) {
                    return var10_10;
                }
                var2_2 = this;
            }
            var4_4 = (es0_2)var4_4;
            var8_8 = 0;
            var12_12 = null;
            var3_3 = new BH3$e((BH3)var2_2, null);
            var13_13 = new at0_1((es0_2)var4_4, (gx0_2)var3_3);
            var3_3 = new BH3$f((BH3)var2_2, (String)var1_1);
            var6_6.a = null;
            var6_6.b = null;
            var6_6.e = var9_9;
            var1_1 = var13_13.collect((fs0_2)var3_3, var6_6);
            if (var1_1 == var10_10) {
                return var10_10;
            }
        }
        return Unit.a;
    }

    public final void d(Product product, String string2) {
        Intrinsics.checkNotNullParameter(string2, "screenName");
        this.a.removedFromClosetAnalytics(product, string2);
    }
}

