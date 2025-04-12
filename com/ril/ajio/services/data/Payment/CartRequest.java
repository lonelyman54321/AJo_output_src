/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.BaseRequest;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CartRequest
implements Serializable {
    private BaseRequest baseRequest;
    private String cartId;
    private List cartItemRequests;
    private Boolean isCodOrder;
    private String orderType;

    public CartRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public CartRequest(Boolean bl2, String string2, String string3, List list, BaseRequest baseRequest) {
        this.isCodOrder = bl2;
        this.orderType = string2;
        this.cartId = string3;
        this.cartItemRequests = list;
        this.baseRequest = baseRequest;
    }

    public /* synthetic */ CartRequest(Boolean bl2, String object, String object2, List object3, BaseRequest object4, int n3, DefaultConstructorMarker object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = Boolean.FALSE;
        }
        n4 = n3 & 2;
        BaseRequest baseRequest = null;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 4;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 8;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 == 0) {
            baseRequest = object4;
        }
        object = this;
        object2 = bl2;
        object3 = object5;
        object4 = object6;
        object5 = baseRequest;
        this(bl2, (String)object3, (String)object6, (List)object7, baseRequest);
    }

    public static /* synthetic */ CartRequest copy$default(CartRequest cartRequest, Boolean bl2, String object, String object2, List object3, BaseRequest object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = cartRequest.isCodOrder;
        }
        if ((n4 = n3 & 2) != 0) {
            object = cartRequest.orderType;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = cartRequest.cartId;
        }
        String string2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = cartRequest.cartItemRequests;
        }
        List list = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = cartRequest.baseRequest;
        }
        BaseRequest baseRequest = object4;
        object = cartRequest;
        object2 = bl2;
        object3 = object5;
        object4 = string2;
        object5 = baseRequest;
        return cartRequest.copy(bl2, (String)object3, string2, list, baseRequest);
    }

    public final Boolean component1() {
        return this.isCodOrder;
    }

    public final String component2() {
        return this.orderType;
    }

    public final String component3() {
        return this.cartId;
    }

    public final List component4() {
        return this.cartItemRequests;
    }

    public final BaseRequest component5() {
        return this.baseRequest;
    }

    public final CartRequest copy(Boolean bl2, String string2, String string3, List list, BaseRequest baseRequest) {
        CartRequest cartRequest = new CartRequest(bl2, string2, string3, list, baseRequest);
        return cartRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartRequest;
        if (!bl3) {
            return false;
        }
        object = (CartRequest)object;
        Object object2 = this.isCodOrder;
        Object object3 = ((CartRequest)object).isCodOrder;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.orderType;
        object3 = ((CartRequest)object).orderType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartId;
        object3 = ((CartRequest)object).cartId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartItemRequests;
        object3 = ((CartRequest)object).cartItemRequests;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.baseRequest;
        object = ((CartRequest)object).baseRequest;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final List getCartItemRequests() {
        return this.cartItemRequests;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.isCodOrder;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.orderType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartItemRequests;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.baseRequest;
        if (object != null) {
            n7 = ((BaseRequest)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isCodOrder() {
        return this.isCodOrder;
    }

    public final void setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
    }

    public final void setCartId(String string2) {
        this.cartId = string2;
    }

    public final void setCartItemRequests(List list) {
        this.cartItemRequests = list;
    }

    public final void setCodOrder(Boolean bl2) {
        this.isCodOrder = bl2;
    }

    public final void setOrderType(String string2) {
        this.orderType = string2;
    }

    public String toString() {
        Boolean bl2 = this.isCodOrder;
        String string2 = this.orderType;
        String string3 = this.cartId;
        List list = this.cartItemRequests;
        BaseRequest baseRequest = this.baseRequest;
        StringBuilder stringBuilder = new StringBuilder("CartRequest(isCodOrder=");
        stringBuilder.append(bl2);
        stringBuilder.append(", orderType=");
        stringBuilder.append(string2);
        stringBuilder.append(", cartId=");
        stringBuilder.append(string3);
        stringBuilder.append(", cartItemRequests=");
        stringBuilder.append(list);
        stringBuilder.append(", baseRequest=");
        stringBuilder.append(baseRequest);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

