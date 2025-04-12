/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Order.CartOrder;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PlaceOrder {
    private Cart cartData;
    private String message;
    private CartOrder orderData;
    private Boolean orderStatus;
    private Boolean paymentStatus;

    public PlaceOrder() {
        this(null, null, null, null, null, 31, null);
    }

    public PlaceOrder(String string2, CartOrder cartOrder, Cart cart, Boolean bl2, Boolean bl3) {
        this.message = string2;
        this.orderData = cartOrder;
        this.cartData = cart;
        this.orderStatus = bl2;
        this.paymentStatus = bl3;
    }

    public /* synthetic */ PlaceOrder(String object, CartOrder object2, Cart cartAndOrder, Boolean serializable, Boolean bl2, int n3, DefaultConstructorMarker object3) {
        int n4 = n3 & 1;
        Cart cart = null;
        if (n4 != 0) {
            n4 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n7 = n3 & 2;
        Object object4 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        if (n7 == 0) {
            cart = cartAndOrder;
        }
        n7 = n3 & 8;
        if (n7 != 0) {
            serializable = Boolean.FALSE;
        }
        Boolean bl3 = serializable;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            bl2 = Boolean.FALSE;
        }
        Boolean bl4 = bl2;
        object = this;
        object2 = object3;
        cartAndOrder = object4;
        serializable = cart;
        bl2 = bl3;
        this((String)object3, (CartOrder)object4, cart, bl3, bl4);
    }

    public static /* synthetic */ PlaceOrder copy$default(PlaceOrder placeOrder, String string2, CartOrder object, Cart object2, Boolean object3, Boolean serializable, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = placeOrder.message;
        }
        if ((n4 = n3 & 2) != 0) {
            object = placeOrder.orderData;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = placeOrder.cartData;
        }
        Cart cart = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = placeOrder.orderStatus;
        }
        Boolean bl2 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            serializable = placeOrder.paymentStatus;
        }
        Boolean bl3 = serializable;
        object = placeOrder;
        object2 = string2;
        object3 = object4;
        serializable = cart;
        object4 = bl3;
        return placeOrder.copy(string2, (CartOrder)object3, cart, bl2, bl3);
    }

    public final String component1() {
        return this.message;
    }

    public final CartOrder component2() {
        return this.orderData;
    }

    public final Cart component3() {
        return this.cartData;
    }

    public final Boolean component4() {
        return this.orderStatus;
    }

    public final Boolean component5() {
        return this.paymentStatus;
    }

    public final PlaceOrder copy(String string2, CartOrder cartOrder, Cart cart, Boolean bl2, Boolean bl3) {
        PlaceOrder placeOrder = new PlaceOrder(string2, cartOrder, cart, bl2, bl3);
        return placeOrder;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PlaceOrder;
        if (!bl3) {
            return false;
        }
        object = (PlaceOrder)object;
        Object object2 = this.message;
        Object object3 = ((PlaceOrder)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderData;
        object3 = ((PlaceOrder)object).orderData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartData;
        object3 = ((PlaceOrder)object).cartData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderStatus;
        object3 = ((PlaceOrder)object).orderStatus;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paymentStatus;
        object = ((PlaceOrder)object).paymentStatus;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Cart getCartData() {
        return this.cartData;
    }

    public final String getMessage() {
        return this.message;
    }

    public final CartOrder getOrderData() {
        return this.orderData;
    }

    public final Boolean getOrderStatus() {
        return this.orderStatus;
    }

    public final Boolean getPaymentStatus() {
        return this.paymentStatus;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.message;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Serializable serializable = this.orderData;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.cartData;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.orderStatus;
        if (serializable == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = serializable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        serializable = this.paymentStatus;
        if (serializable != null) {
            n7 = serializable.hashCode();
        }
        return n4 + n7;
    }

    public final void setCartData(Cart cart) {
        this.cartData = cart;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setOrderData(CartOrder cartOrder) {
        this.orderData = cartOrder;
    }

    public final void setOrderStatus(Boolean bl2) {
        this.orderStatus = bl2;
    }

    public final void setPaymentStatus(Boolean bl2) {
        this.paymentStatus = bl2;
    }

    public String toString() {
        String string2 = this.message;
        CartOrder cartOrder = this.orderData;
        Cart cart = this.cartData;
        Boolean bl2 = this.orderStatus;
        Boolean bl3 = this.paymentStatus;
        StringBuilder stringBuilder = new StringBuilder("PlaceOrder(message=");
        stringBuilder.append(string2);
        stringBuilder.append(", orderData=");
        stringBuilder.append(cartOrder);
        stringBuilder.append(", cartData=");
        stringBuilder.append(cart);
        stringBuilder.append(", orderStatus=");
        stringBuilder.append(bl2);
        stringBuilder.append(", paymentStatus=");
        return nx3_0.a(stringBuilder, bl3, ")");
    }
}

