/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.ril.ajio.data.repo;

import android.text.TextUtils;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.query.QueryCart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

final class CartApiRepo$addToCart$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Ref$ObjectRef $addToCartURL;
    final /* synthetic */ QueryCart $queryCart;
    final /* synthetic */ String $sourceStoreId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$addToCart$1(QueryCart queryCart, CartApiRepo cartApiRepo, Ref$ObjectRef ref$ObjectRef, String string2, f80_0 f80_02) {
        this.$queryCart = queryCart;
        this.this$0 = cartApiRepo;
        this.$addToCartURL = ref$ObjectRef;
        this.$sourceStoreId = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        QueryCart queryCart = this.$queryCart;
        CartApiRepo cartApiRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$addToCartURL;
        String string2 = this.$sourceStoreId;
        CartApiRepo$addToCart$1 cartApiRepo$addToCart$1 = new CartApiRepo$addToCart$1(queryCart, cartApiRepo, ref$ObjectRef, string2, f80_02);
        cartApiRepo$addToCart$1.L$0 = object;
        return cartApiRepo$addToCart$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartApiRepo$addToCart$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartApiRepo$addToCart$1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block21: {
            block18: {
                block24: {
                    block19: {
                        block23: {
                            block20: {
                                block22: {
                                    var2_2 = this;
                                    var3_3 = j90_0.COROUTINE_SUSPENDED;
                                    var4_4 = this.label;
                                    switch (var4_4) {
                                        default: {
                                            var5_5 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            throw var5_5;
                                        }
                                        case 7: {
                                            var5_6 = (fs0_2)this.L$0;
                                            vl2_2.b(var1_1);
                                            var6_7 = var5_6;
                                            var5_6 = var1_1;
                                            break block18;
                                        }
                                        case 5: {
                                            var5_6 = (fs0_2)this.L$0;
                                            vl2_2.b(var1_1);
                                            var6_7 = var5_6;
                                            var5_6 = var1_1;
                                            break block19;
                                        }
                                        case 3: {
                                            var5_6 = (fs0_2)this.L$0;
                                            vl2_2.b(var1_1);
                                            var6_7 = var5_6;
                                            var5_6 = var1_1;
                                            break block20;
                                        }
                                        case 2: 
                                        case 4: 
                                        case 6: 
                                        case 8: {
                                            vl2_2.b(var1_1);
                                            break block21;
                                        }
                                        case 1: {
                                            var5_6 = (fs0_2)this.L$0;
                                            vl2_2.b(var1_1);
                                            var6_7 = var5_6;
                                            var5_6 = var1_1;
                                            break;
                                        }
                                        case 0: {
                                            vl2_2.b(var1_1);
                                            var6_7 = var5_6 = this.L$0;
                                            var6_7 = (fs0_2)var5_6;
                                            var5_6 = this.$queryCart.getImsBatchId();
                                            var4_4 = (int)TextUtils.isEmpty((CharSequence)var5_6);
                                            var7_8 = "getCommercialType(...)";
                                            var8_9 = "Bearer ";
                                            var9_10 = "access$getUserInformation$p(...)";
                                            if (var4_4 == 0 && (var4_4 = (int)TextUtils.isEmpty((CharSequence)(var5_6 = this.$queryCart.getCommercialType()))) == 0) {
                                                var5_6 = CartApiRepo.access$getCartDataApi$p(this.this$0);
                                                var10_11 = (String)this.$addToCartURL.element;
                                                var11_15 = this.$queryCart.getProductCode();
                                                var12_19 = this.$queryCart.getQuantity();
                                                var13_21 = String.valueOf(var12_19);
                                                var14_25 = this.$sourceStoreId;
                                                var15_29 = this.$queryCart.getImsBatchId();
                                                var16_33 = this.$queryCart.getCommercialType();
                                                Intrinsics.checkNotNullExpressionValue(var16_33, var7_8);
                                                var7_8 = fm_1.a(this.this$0, var9_10);
                                                var17_37 = kp1_0.c(var8_9, var7_8);
                                                this.L$0 = var6_7;
                                                this.label = var18_40 = 1;
                                                var19_44 = "FULL";
                                                var20_46 = "AddtoCart";
                                                var7_8 = var10_11;
                                                var8_9 = var11_15;
                                                var9_10 = var13_21;
                                                var10_11 = var14_25;
                                                var11_15 = var15_29;
                                                var13_21 = var19_44;
                                                var14_25 = var16_33;
                                                var15_29 = var17_37;
                                                var16_33 = var20_46;
                                                var17_37 = this;
                                                var5_6 = var5_6.addToCart(var7_8, var8_9, var9_10, var10_11, var11_15, var19_44, var14_25, var15_29, var20_46, this);
                                                if (var5_6 != var3_3) break;
                                                return var3_3;
                                            }
                                            break block22;
                                        }
                                    }
                                    var2_2.L$0 = null;
                                    var2_2.label = var18_40 = 2;
                                    var5_6 = var6_7.emit(var5_6, var2_2);
                                    if (var5_6 == var3_3) {
                                        return var3_3;
                                    }
                                    break block21;
                                }
                                var5_6 = var2_2.$queryCart.getImsBatchId();
                                var4_4 = (int)TextUtils.isEmpty((CharSequence)var5_6);
                                if (var4_4 == 0) {
                                    var5_6 = CartApiRepo.access$getCartDataApi$p(var2_2.this$0);
                                    var7_8 = (String)var2_2.$addToCartURL.element;
                                    var10_12 = var2_2.$queryCart.getProductCode();
                                    var21_47 = var2_2.$queryCart.getQuantity();
                                    var11_16 = String.valueOf(var21_47);
                                    var13_22 = var2_2.$sourceStoreId;
                                    var14_26 = var2_2.$queryCart.getImsBatchId();
                                    var9_10 = fm_1.a(var2_2.this$0, var9_10);
                                    var15_30 = kp1_0.c(var8_9, var9_10);
                                    var2_2.L$0 = var6_7;
                                    var2_2.label = var22_49 = 3;
                                    var17_38 = "AddtoCart";
                                    var8_9 = var10_12;
                                    var9_10 = var11_16;
                                    var10_12 = var13_22;
                                    var11_16 = var14_26;
                                    var13_22 = "FULL";
                                    var14_26 = var15_30;
                                    var15_30 = var17_38;
                                    var16_34 = this;
                                    if ((var5_6 = var5_6.addToCartWithImsBatchId(var7_8, var8_9, var9_10, var10_12, var11_16, var13_22, var14_26, var17_38, this)) == var3_3) {
                                        return var3_3;
                                    } else {
                                        ** GOTO lbl107
                                    }
                                }
                                break block23;
                            }
                            var2_2.L$0 = null;
                            var2_2.label = var18_41 = 4;
                            var5_6 = var6_7.emit(var5_6, var2_2);
                            if (var5_6 == var3_3) {
                                return var3_3;
                            }
                            break block21;
                        }
                        var5_6 = var2_2.$queryCart.getCommercialType();
                        var4_4 = (int)TextUtils.isEmpty((CharSequence)var5_6);
                        if (var4_4 == 0) {
                            var5_6 = CartApiRepo.access$getCartDataApi$p(var2_2.this$0);
                            var10_13 = (String)var2_2.$addToCartURL.element;
                            var11_17 = var2_2.$queryCart.getProductCode();
                            var12_20 = var2_2.$queryCart.getQuantity();
                            var13_23 = String.valueOf(var12_20);
                            var14_27 = var2_2.$sourceStoreId;
                            var15_31 = var2_2.$queryCart.getCommercialType();
                            Intrinsics.checkNotNullExpressionValue(var15_31, var7_8);
                            var7_8 = fm_1.a(var2_2.this$0, var9_10);
                            var16_35 = kp1_0.c(var8_9, var7_8);
                            var2_2.L$0 = var6_7;
                            var2_2.label = var18_42 = 5;
                            var17_39 = "FULL";
                            var19_45 = "AddtoCart";
                            var7_8 = var10_13;
                            var8_9 = var11_17;
                            var9_10 = var13_23;
                            var10_13 = var14_27;
                            var11_17 = var17_39;
                            var13_23 = var15_31;
                            var14_27 = var16_35;
                            var15_31 = var19_45;
                            var16_35 = this;
                            var5_6 = var5_6.addToCartWithCommercialType(var7_8, var8_9, var9_10, var10_13, var17_39, var13_23, var14_27, var19_45, this);
                            if (var5_6 == var3_3) {
                                return var3_3;
                            } else {
                                ** GOTO lbl145
                            }
                        }
                        break block24;
                    }
                    var2_2.L$0 = null;
                    var2_2.label = var18_42 = 6;
                    var5_6 = var6_7.emit(var5_6, var2_2);
                    if (var5_6 == var3_3) {
                        return var3_3;
                    }
                    break block21;
                }
                var5_6 = CartApiRepo.access$getCartDataApi$p(var2_2.this$0);
                var7_8 = (String)var2_2.$addToCartURL.element;
                var10_14 = var2_2.$queryCart.getProductCode();
                var21_48 = var2_2.$queryCart.getQuantity();
                var11_18 = String.valueOf(var21_48);
                var13_24 = var2_2.$sourceStoreId;
                var9_10 = fm_1.a(var2_2.this$0, var9_10);
                var14_28 = kp1_0.c(var8_9, var9_10);
                var2_2.L$0 = var6_7;
                var2_2.label = var22_50 = 7;
                var16_36 = "AddtoCart";
                var8_9 = var10_14;
                var9_10 = var11_18;
                var10_14 = var13_24;
                var11_18 = "FULL";
                var13_24 = var14_28;
                var14_28 = var16_36;
                var15_32 = this;
                if ((var5_6 = var5_6.addToCartWithOutImsBatchIdCommercialType(var7_8, var8_9, var9_10, var10_14, var11_18, var13_24, var16_36, this)) == var3_3) {
                    return var3_3;
                }
            }
            var2_2.L$0 = null;
            var2_2.label = var18_43 = 8;
            var5_6 = var6_7.emit(var5_6, var2_2);
            if (var5_6 == var3_3) {
                return var3_3;
            }
        }
        return Unit.a;
    }
}

