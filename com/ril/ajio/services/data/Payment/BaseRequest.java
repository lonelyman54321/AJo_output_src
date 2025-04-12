/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.ChannelInfo;
import com.ril.ajio.services.data.Payment.UserInfo;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BaseRequest
implements Serializable {
    private String cartId;
    private ChannelInfo channelInfo;
    private String consumerType;
    private String pageType;
    private String tenantId;
    private UserInfo userInfo;

    public BaseRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public BaseRequest(String string2, ChannelInfo channelInfo, UserInfo userInfo, String string3, String string4, String string5) {
        this.tenantId = string2;
        this.channelInfo = channelInfo;
        this.userInfo = userInfo;
        this.consumerType = string3;
        this.pageType = string4;
        this.cartId = string5;
    }

    public /* synthetic */ BaseRequest(String object, ChannelInfo object2, UserInfo serializable, String object3, String string2, String string3, int n3, DefaultConstructorMarker object4) {
        String string4;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object4 = null;
        } else {
            object4 = object;
        }
        int n7 = n3 & 2;
        Object object5 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        UserInfo userInfo = n7 != 0 ? null : serializable;
        n7 = n3 & 8;
        Object object6 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        String string5 = n7 != 0 ? null : string2;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            n3 = 0;
            string4 = null;
        } else {
            string4 = string3;
        }
        object = this;
        object2 = object4;
        serializable = object5;
        object3 = userInfo;
        string2 = object6;
        string3 = string5;
        this((String)object4, (ChannelInfo)object5, userInfo, (String)object6, string5, string4);
    }

    public static /* synthetic */ BaseRequest copy$default(BaseRequest baseRequest, String string2, ChannelInfo serializable, UserInfo object, String object2, String object3, String string3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = baseRequest.tenantId;
        }
        if ((n4 = n3 & 2) != 0) {
            serializable = baseRequest.channelInfo;
        }
        object4 = serializable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object = baseRequest.userInfo;
        }
        UserInfo userInfo = object;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = baseRequest.consumerType;
        }
        String string4 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object3 = baseRequest.pageType;
        }
        String string5 = object3;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string3 = baseRequest.cartId;
        }
        String string6 = string3;
        serializable = baseRequest;
        object = string2;
        object2 = object4;
        object3 = userInfo;
        string3 = string4;
        object4 = string6;
        return baseRequest.copy(string2, (ChannelInfo)object2, userInfo, string4, string5, string6);
    }

    public final String component1() {
        return this.tenantId;
    }

    public final ChannelInfo component2() {
        return this.channelInfo;
    }

    public final UserInfo component3() {
        return this.userInfo;
    }

    public final String component4() {
        return this.consumerType;
    }

    public final String component5() {
        return this.pageType;
    }

    public final String component6() {
        return this.cartId;
    }

    public final BaseRequest copy(String string2, ChannelInfo channelInfo, UserInfo userInfo, String string3, String string4, String string5) {
        BaseRequest baseRequest = new BaseRequest(string2, channelInfo, userInfo, string3, string4, string5);
        return baseRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BaseRequest;
        if (!bl3) {
            return false;
        }
        object = (BaseRequest)object;
        Object object2 = this.tenantId;
        Object object3 = ((BaseRequest)object).tenantId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.channelInfo;
        object3 = ((BaseRequest)object).channelInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.userInfo;
        object3 = ((BaseRequest)object).userInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.consumerType;
        object3 = ((BaseRequest)object).consumerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageType;
        object3 = ((BaseRequest)object).pageType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.cartId;
        object = ((BaseRequest)object).cartId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public final String getConsumerType() {
        return this.consumerType;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final String getTenantId() {
        return this.tenantId;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.tenantId;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.channelInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ChannelInfo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.userInfo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((UserInfo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.consumerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cartId;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setCartId(String string2) {
        this.cartId = string2;
    }

    public final void setChannelInfo(ChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public final void setConsumerType(String string2) {
        this.consumerType = string2;
    }

    public final void setPageType(String string2) {
        this.pageType = string2;
    }

    public final void setTenantId(String string2) {
        this.tenantId = string2;
    }

    public final void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String toString() {
        String string2 = this.tenantId;
        ChannelInfo channelInfo = this.channelInfo;
        UserInfo userInfo = this.userInfo;
        String string3 = this.consumerType;
        String string4 = this.pageType;
        String string5 = this.cartId;
        StringBuilder stringBuilder = new StringBuilder("BaseRequest(tenantId=");
        stringBuilder.append(string2);
        stringBuilder.append(", channelInfo=");
        stringBuilder.append(channelInfo);
        stringBuilder.append(", userInfo=");
        stringBuilder.append(userInfo);
        stringBuilder.append(", consumerType=");
        stringBuilder.append(string3);
        stringBuilder.append(", pageType=");
        return ko_0.a(stringBuilder, string4, ", cartId=", string5, ")");
    }
}

