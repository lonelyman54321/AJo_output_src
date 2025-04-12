/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.google.gson.JsonObject;
import com.ril.ajio.data.repo.CartApiRepo;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.NetPrice;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceRequest;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

final class CartApiRepo$getInternalWalletOnCart$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Cart $cartResp;
    final /* synthetic */ HashSet $internalWalletSelectedViews;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartApiRepo this$0;

    public CartApiRepo$getInternalWalletOnCart$1(CartApiRepo cartApiRepo, Cart cart, HashSet hashSet, f80_0 f80_02) {
        this.this$0 = cartApiRepo;
        this.$cartResp = cart;
        this.$internalWalletSelectedViews = hashSet;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CartApiRepo cartApiRepo = this.this$0;
        Cart cart = this.$cartResp;
        HashSet hashSet = this.$internalWalletSelectedViews;
        CartApiRepo$getInternalWalletOnCart$1 cartApiRepo$getInternalWalletOnCart$1 = new CartApiRepo$getInternalWalletOnCart$1(cartApiRepo, cart, hashSet, f80_02);
        cartApiRepo$getInternalWalletOnCart$1.L$0 = object;
        return cartApiRepo$getInternalWalletOnCart$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CartApiRepo$getInternalWalletOnCart$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CartApiRepo$getInternalWalletOnCart$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block21: {
            Object object2;
            int n3;
            j90_0 j90_02;
            Object object3;
            CartApiRepo$getInternalWalletOnCart$1 cartApiRepo$getInternalWalletOnCart$1;
            block22: {
                float f5;
                Object object4;
                int n4;
                block18: {
                    block19: {
                        block20: {
                            cartApiRepo$getInternalWalletOnCart$1 = this;
                            object3 = null;
                            n4 = 1;
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.label;
                            n3 = 2;
                            if (n7 == 0) break block18;
                            if (n7 == n4) break block19;
                            if (n7 != n3) break block20;
                            vl2_2.b(object);
                            break block21;
                        }
                        object3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object3;
                    }
                    object3 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    object2 = object3;
                    object3 = object;
                    break block22;
                }
                vl2_2.b(object);
                object2 = object4 = this.L$0;
                object2 = (fs0_2)object4;
                object4 = CartApiRepo.access$getUserInformation$p(this.this$0).getCustomerUUID();
                Object object5 = UrlHelper.Companion.getInstance();
                Object object6 = new Object[n4];
                object6[0] = object4;
                Object object7 = "calculate_price_cart";
                object4 = ((UrlHelper)object5).getApiUrl("cart", (String)object7, (Object[])object6);
                object5 = this.$cartResp;
                object5 = object5 != null ? ((Cart)object5).getCode() : null;
                object6 = h40_0.a;
                boolean bl2 = h40_0.O1();
                object7 = new StringBuilder();
                ((StringBuilder)object7).append((String)object4);
                ((StringBuilder)object7).append("?cartCode=");
                ((StringBuilder)object7).append((String)object5);
                ((StringBuilder)object7).append("&priorityDeliveryEnable=");
                ((StringBuilder)object7).append(bl2);
                object4 = ((StringBuilder)object7).toString();
                Object object8 = object5;
                boolean bl3 = false;
                PaymentInstrumentInfo paymentInstrumentInfo = null;
                boolean bl4 = false;
                String string2 = null;
                int n8 = 1048575;
                object5 = new PriceRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n8, null);
                object6 = cartApiRepo$getInternalWalletOnCart$1.$cartResp;
                if (object6 != null) {
                    object6 = ((Cart)object6).getInternalWallets();
                } else {
                    bl2 = false;
                    object6 = null;
                    f5 = 0.0f;
                }
                if (object6 != null && !(bl2 = object6.isEmpty())) {
                    boolean bl5;
                    object6 = in_0.a;
                    object7 = cartApiRepo$getInternalWalletOnCart$1.$cartResp;
                    if (object7 != null) {
                        object7 = ((Cart)object7).getInternalWallets();
                    } else {
                        bl5 = false;
                        object7 = null;
                    }
                    object8 = cartApiRepo$getInternalWalletOnCart$1.$internalWalletSelectedViews;
                    object6.getClass();
                    object6 = new ArrayList();
                    if (object8 != null && object7 != null) {
                        object7 = object7.iterator();
                        while (bl3 = object7.hasNext()) {
                            paymentInstrumentInfo = (PaymentInstrumentInfo)object7.next();
                            if (paymentInstrumentInfo == null || !(bl4 = CollectionsKt.F((Iterable)object8, string2 = paymentInstrumentInfo.getCode()))) continue;
                            ((ArrayList)object6).add(paymentInstrumentInfo);
                        }
                    }
                    if (bl5 = ((ArrayList)object6).isEmpty()) {
                        object6 = new ArrayList();
                        ((PriceRequest)object5).setInternalWallets((List)object6);
                    } else {
                        ((PriceRequest)object5).setInternalWallets((List)object6);
                    }
                } else {
                    object6 = new ArrayList();
                    ((PriceRequest)object5).setInternalWallets((List)object6);
                }
                object6 = cartApiRepo$getInternalWalletOnCart$1.$cartResp;
                if (object6 != null) {
                    object6 = ((Cart)object6).getRefreshChecksum();
                } else {
                    bl2 = false;
                    object6 = null;
                    f5 = 0.0f;
                }
                ((PriceRequest)object5).setRefreshChecksum((String)object6);
                object6 = cartApiRepo$getInternalWalletOnCart$1.$cartResp;
                if (object6 != null && (object6 = ((Cart)object6).getNetPrice()) != null) {
                    object6 = ((NetPrice)object6).getValue();
                } else {
                    bl2 = false;
                    object6 = null;
                    f5 = 0.0f;
                }
                object6 = String.valueOf(object6);
                ((PriceRequest)object5).setNetPayableAmount((String)object6);
                object6 = cartApiRepo$getInternalWalletOnCart$1.$cartResp;
                if (object6 != null && (object6 = ((Cart)object6).getTotalPrice()) != null && (object6 = ((Price)object6).getValue()) != null) {
                    ((PriceRequest)object5).setTotalAmount((String)object6);
                    f5 = Float.parseFloat((String)object6);
                    object7 = new Float(f5);
                    ((PriceRequest)object5).setAmount((Float)object7);
                }
                object5 = JsonUtils.toJson(object5);
                object6 = JsonObject.class;
                if ((object5 = (JsonObject)JsonUtils.fromJson((String)object5, (Class)object6)) == null) {
                    object5 = new JsonObject();
                }
                object6 = yn3_0.a;
                object3 = new Object[]{};
                ((yn3$a)object6).a("paymentDebug: before calculate price", (Object[])object3);
                object3 = CartApiRepo.access$getCartDataApi$p(cartApiRepo$getInternalWalletOnCart$1.this$0);
                object6 = fm_1.a(cartApiRepo$getInternalWalletOnCart$1.this$0, "access$getUserInformation$p(...)");
                object6 = kp1_0.c("Bearer ", (String)object6);
                cartApiRepo$getInternalWalletOnCart$1.L$0 = object2;
                cartApiRepo$getInternalWalletOnCart$1.label = n4;
                Object object9 = object4;
                object4 = object6;
                object6 = "CART_PriceCalculation";
                object7 = this;
                object3 = object3.calculatePrice((String)object9, (String)object4, (JsonObject)object5, (String)object6, this);
                if (object3 == j90_02) {
                    return j90_02;
                }
            }
            cartApiRepo$getInternalWalletOnCart$1.L$0 = null;
            cartApiRepo$getInternalWalletOnCart$1.label = n3;
            object3 = object2.emit(object3, cartApiRepo$getInternalWalletOnCart$1);
            if (object3 == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

