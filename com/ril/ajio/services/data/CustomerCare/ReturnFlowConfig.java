/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import kotlin.jvm.internal.Intrinsics;

public final class ReturnFlowConfig {
    private final Boolean customer_care_enabled;
    private final Boolean master;
    private final Boolean return_cancel_enabled;
    private final String return_cancel_popup_desc;
    private final String return_cancel_popup_success_title;
    private final String return_cancel_popup_timeline;
    private final String return_cancel_popup_title;
    private final Boolean return_exchange_enabled;
    private final String return_request_reason_desc;
    private final Boolean return_request_reason_enabled;

    public ReturnFlowConfig(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, String string2, String string3, String string4, String string5, String string6) {
        this.master = bl2;
        this.return_exchange_enabled = bl3;
        this.customer_care_enabled = bl4;
        this.return_cancel_enabled = bl5;
        this.return_request_reason_enabled = bl6;
        this.return_request_reason_desc = string2;
        this.return_cancel_popup_title = string3;
        this.return_cancel_popup_desc = string4;
        this.return_cancel_popup_timeline = string5;
        this.return_cancel_popup_success_title = string6;
    }

    public static /* synthetic */ ReturnFlowConfig copy$default(ReturnFlowConfig returnFlowConfig, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, String string2, String string3, String string4, String string5, String string6, int n3, Object object) {
        ReturnFlowConfig returnFlowConfig2 = returnFlowConfig;
        int n4 = n3;
        int n7 = n3 & 1;
        Boolean bl7 = n7 != 0 ? returnFlowConfig.master : bl2;
        int n8 = n4 & 2;
        Boolean bl8 = n8 != 0 ? returnFlowConfig2.return_exchange_enabled : bl3;
        int n10 = n4 & 4;
        Boolean bl9 = n10 != 0 ? returnFlowConfig2.customer_care_enabled : bl4;
        int n14 = n4 & 8;
        Boolean bl10 = n14 != 0 ? returnFlowConfig2.return_cancel_enabled : bl5;
        int n15 = n4 & 0x10;
        Boolean bl11 = n15 != 0 ? returnFlowConfig2.return_request_reason_enabled : bl6;
        int n16 = n4 & 0x20;
        String string7 = n16 != 0 ? returnFlowConfig2.return_request_reason_desc : string2;
        int n17 = n4 & 0x40;
        String string8 = n17 != 0 ? returnFlowConfig2.return_cancel_popup_title : string3;
        int n18 = n4 & 0x80;
        String string9 = n18 != 0 ? returnFlowConfig2.return_cancel_popup_desc : string4;
        int n19 = n4 & 0x100;
        String string10 = n19 != 0 ? returnFlowConfig2.return_cancel_popup_timeline : string5;
        String string11 = (n4 &= 0x200) != 0 ? returnFlowConfig2.return_cancel_popup_success_title : string6;
        bl2 = bl7;
        bl3 = bl8;
        bl4 = bl9;
        bl5 = bl10;
        bl6 = bl11;
        string2 = string7;
        string3 = string8;
        string4 = string9;
        string5 = string10;
        string6 = string11;
        return returnFlowConfig.copy(bl7, bl8, bl9, bl10, bl11, string7, string8, string9, string10, string11);
    }

    public final Boolean component1() {
        return this.master;
    }

    public final String component10() {
        return this.return_cancel_popup_success_title;
    }

    public final Boolean component2() {
        return this.return_exchange_enabled;
    }

    public final Boolean component3() {
        return this.customer_care_enabled;
    }

    public final Boolean component4() {
        return this.return_cancel_enabled;
    }

    public final Boolean component5() {
        return this.return_request_reason_enabled;
    }

    public final String component6() {
        return this.return_request_reason_desc;
    }

    public final String component7() {
        return this.return_cancel_popup_title;
    }

    public final String component8() {
        return this.return_cancel_popup_desc;
    }

    public final String component9() {
        return this.return_cancel_popup_timeline;
    }

    public final ReturnFlowConfig copy(Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, String string2, String string3, String string4, String string5, String string6) {
        ReturnFlowConfig returnFlowConfig = new ReturnFlowConfig(bl2, bl3, bl4, bl5, bl6, string2, string3, string4, string5, string6);
        return returnFlowConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnFlowConfig;
        if (!bl3) {
            return false;
        }
        object = (ReturnFlowConfig)object;
        Object object2 = this.master;
        Object object3 = ((ReturnFlowConfig)object).master;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_exchange_enabled;
        object3 = ((ReturnFlowConfig)object).return_exchange_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.customer_care_enabled;
        object3 = ((ReturnFlowConfig)object).customer_care_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_cancel_enabled;
        object3 = ((ReturnFlowConfig)object).return_cancel_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_request_reason_enabled;
        object3 = ((ReturnFlowConfig)object).return_request_reason_enabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_request_reason_desc;
        object3 = ((ReturnFlowConfig)object).return_request_reason_desc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_cancel_popup_title;
        object3 = ((ReturnFlowConfig)object).return_cancel_popup_title;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_cancel_popup_desc;
        object3 = ((ReturnFlowConfig)object).return_cancel_popup_desc;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_cancel_popup_timeline;
        object3 = ((ReturnFlowConfig)object).return_cancel_popup_timeline;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.return_cancel_popup_success_title;
        object = ((ReturnFlowConfig)object).return_cancel_popup_success_title;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getCustomer_care_enabled() {
        return this.customer_care_enabled;
    }

    public final Boolean getMaster() {
        return this.master;
    }

    public final Boolean getReturn_cancel_enabled() {
        return this.return_cancel_enabled;
    }

    public final String getReturn_cancel_popup_desc() {
        return this.return_cancel_popup_desc;
    }

    public final String getReturn_cancel_popup_success_title() {
        return this.return_cancel_popup_success_title;
    }

    public final String getReturn_cancel_popup_timeline() {
        return this.return_cancel_popup_timeline;
    }

    public final String getReturn_cancel_popup_title() {
        return this.return_cancel_popup_title;
    }

    public final Boolean getReturn_exchange_enabled() {
        return this.return_exchange_enabled;
    }

    public final String getReturn_request_reason_desc() {
        return this.return_request_reason_desc;
    }

    public final Boolean getReturn_request_reason_enabled() {
        return this.return_request_reason_enabled;
    }

    public int hashCode() {
        int n3;
        int n4;
        Boolean bl2 = this.master;
        int n7 = 0;
        if (bl2 == null) {
            n4 = 0;
            bl2 = null;
        } else {
            n4 = ((Object)bl2).hashCode();
        }
        n4 *= 31;
        Object object = this.return_exchange_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.customer_care_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_cancel_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_request_reason_enabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_request_reason_desc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_cancel_popup_title;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_cancel_popup_desc;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_cancel_popup_timeline;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.return_cancel_popup_success_title;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        Boolean bl2 = this.master;
        Boolean bl3 = this.return_exchange_enabled;
        Boolean bl4 = this.customer_care_enabled;
        Boolean bl5 = this.return_cancel_enabled;
        Boolean bl6 = this.return_request_reason_enabled;
        String string2 = this.return_request_reason_desc;
        String string3 = this.return_cancel_popup_title;
        String string4 = this.return_cancel_popup_desc;
        String string5 = this.return_cancel_popup_timeline;
        String string6 = this.return_cancel_popup_success_title;
        StringBuilder stringBuilder = new StringBuilder("ReturnFlowConfig(master=");
        stringBuilder.append(bl2);
        stringBuilder.append(", return_exchange_enabled=");
        stringBuilder.append(bl3);
        stringBuilder.append(", customer_care_enabled=");
        stringBuilder.append(bl4);
        stringBuilder.append(", return_cancel_enabled=");
        stringBuilder.append(bl5);
        stringBuilder.append(", return_request_reason_enabled=");
        xi0_2.a(bl6, ", return_request_reason_desc=", string2, ", return_cancel_popup_title=", stringBuilder);
        X50.a(stringBuilder, string3, ", return_cancel_popup_desc=", string4, ", return_cancel_popup_timeline=");
        return ko_0.a(stringBuilder, string5, ", return_cancel_popup_success_title=", string6, ")");
    }
}

