/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CartExchangeReturnPolicy {
    private final Boolean cartExchangeReturnPolicyFlag;
    private final ArrayList cartReturnRefundMsg;
    private final String cartReturnRefundMsgReturnFee;
    private final String cartReturnRefundTitle;
    private final String returnPolicyLinkText;
    private final String returnPolicyLinkUrl;

    public CartExchangeReturnPolicy() {
        this(null, null, null, null, null, null, 63, null);
    }

    public CartExchangeReturnPolicy(ArrayList arrayList, String string2, String string3, Boolean bl2, String string4, String string5) {
        this.cartReturnRefundMsg = arrayList;
        this.cartReturnRefundMsgReturnFee = string2;
        this.cartReturnRefundTitle = string3;
        this.cartExchangeReturnPolicyFlag = bl2;
        this.returnPolicyLinkText = string4;
        this.returnPolicyLinkUrl = string5;
    }

    public /* synthetic */ CartExchangeReturnPolicy(ArrayList object, String object2, String string2, Boolean object3, String object4, String string3, int n3, DefaultConstructorMarker object5) {
        String string4;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = Boolean.FALSE;
        }
        Boolean bl2 = object3;
        n7 = n3 & 0x10;
        Object object7 = n7 != 0 ? null : object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        object = this;
        object2 = object5;
        string2 = object6;
        object3 = string5;
        object4 = bl2;
        string3 = object7;
        this((ArrayList)object5, (String)object6, string5, bl2, (String)object7, string4);
    }

    public static /* synthetic */ CartExchangeReturnPolicy copy$default(CartExchangeReturnPolicy cartExchangeReturnPolicy, ArrayList arrayList, String object, String object2, Boolean object3, String string2, String object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = cartExchangeReturnPolicy.cartReturnRefundMsg;
        }
        if ((n4 = n3 & 2) != 0) {
            object = cartExchangeReturnPolicy.cartReturnRefundMsgReturnFee;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = cartExchangeReturnPolicy.cartReturnRefundTitle;
        }
        String string3 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = cartExchangeReturnPolicy.cartExchangeReturnPolicyFlag;
        }
        Boolean bl2 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = cartExchangeReturnPolicy.returnPolicyLinkText;
        }
        String string4 = string2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = cartExchangeReturnPolicy.returnPolicyLinkUrl;
        }
        String string5 = object4;
        object = cartExchangeReturnPolicy;
        object2 = arrayList;
        object3 = object5;
        string2 = string3;
        object4 = bl2;
        object5 = string5;
        return cartExchangeReturnPolicy.copy(arrayList, (String)object3, string3, bl2, string4, string5);
    }

    public final ArrayList component1() {
        return this.cartReturnRefundMsg;
    }

    public final String component2() {
        return this.cartReturnRefundMsgReturnFee;
    }

    public final String component3() {
        return this.cartReturnRefundTitle;
    }

    public final Boolean component4() {
        return this.cartExchangeReturnPolicyFlag;
    }

    public final String component5() {
        return this.returnPolicyLinkText;
    }

    public final String component6() {
        return this.returnPolicyLinkUrl;
    }

    public final CartExchangeReturnPolicy copy(ArrayList arrayList, String string2, String string3, Boolean bl2, String string4, String string5) {
        CartExchangeReturnPolicy cartExchangeReturnPolicy = new CartExchangeReturnPolicy(arrayList, string2, string3, bl2, string4, string5);
        return cartExchangeReturnPolicy;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartExchangeReturnPolicy;
        if (!bl3) {
            return false;
        }
        object = (CartExchangeReturnPolicy)object;
        Object object2 = this.cartReturnRefundMsg;
        Object object3 = ((CartExchangeReturnPolicy)object).cartReturnRefundMsg;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartReturnRefundMsgReturnFee;
        object3 = ((CartExchangeReturnPolicy)object).cartReturnRefundMsgReturnFee;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartReturnRefundTitle;
        object3 = ((CartExchangeReturnPolicy)object).cartReturnRefundTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartExchangeReturnPolicyFlag;
        object3 = ((CartExchangeReturnPolicy)object).cartExchangeReturnPolicyFlag;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnPolicyLinkText;
        object3 = ((CartExchangeReturnPolicy)object).returnPolicyLinkText;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnPolicyLinkUrl;
        object = ((CartExchangeReturnPolicy)object).returnPolicyLinkUrl;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getCartExchangeReturnPolicyFlag() {
        return this.cartExchangeReturnPolicyFlag;
    }

    public final ArrayList getCartReturnRefundMsg() {
        return this.cartReturnRefundMsg;
    }

    public final String getCartReturnRefundMsgReturnFee() {
        return this.cartReturnRefundMsgReturnFee;
    }

    public final String getCartReturnRefundTitle() {
        return this.cartReturnRefundTitle;
    }

    public final String getReturnPolicyLinkText() {
        return this.returnPolicyLinkText;
    }

    public final String getReturnPolicyLinkUrl() {
        return this.returnPolicyLinkUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        ArrayList arrayList = this.cartReturnRefundMsg;
        int n7 = 0;
        if (arrayList == null) {
            n4 = 0;
            arrayList = null;
        } else {
            n4 = arrayList.hashCode();
        }
        n4 *= 31;
        Object object = this.cartReturnRefundMsgReturnFee;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartReturnRefundTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartExchangeReturnPolicyFlag;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnPolicyLinkText;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnPolicyLinkUrl;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        ArrayList arrayList = this.cartReturnRefundMsg;
        String string2 = this.cartReturnRefundMsgReturnFee;
        String string3 = this.cartReturnRefundTitle;
        Boolean bl2 = this.cartExchangeReturnPolicyFlag;
        String string4 = this.returnPolicyLinkText;
        String string5 = this.returnPolicyLinkUrl;
        StringBuilder stringBuilder = new StringBuilder("CartExchangeReturnPolicy(cartReturnRefundMsg=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", cartReturnRefundMsgReturnFee=");
        stringBuilder.append(string2);
        stringBuilder.append(", cartReturnRefundTitle=");
        vw0_1.a(bl2, string3, ", cartExchangeReturnPolicyFlag=", ", returnPolicyLinkText=", stringBuilder);
        return ko_0.a(stringBuilder, string4, ", returnPolicyLinkUrl=", string5, ")");
    }
}

