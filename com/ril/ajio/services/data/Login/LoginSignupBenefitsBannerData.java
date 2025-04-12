/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Login;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class LoginSignupBenefitsBannerData {
    private final String allowedCustomerState;
    private final String allowedCustomerType;
    private final Boolean appLoginBannerEnabled;
    private final String appLoginBannerUrl;
    private final Boolean appSignUpBannerEnabled;
    private final String appSignUpBannerUrl;
    private final String application;
    private final String timeOut;

    public LoginSignupBenefitsBannerData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public LoginSignupBenefitsBannerData(String string2, String string3, Boolean bl2, String string4, Boolean bl3, String string5, String string6, String string7) {
        this.allowedCustomerState = string2;
        this.allowedCustomerType = string3;
        this.appLoginBannerEnabled = bl2;
        this.appLoginBannerUrl = string4;
        this.appSignUpBannerEnabled = bl3;
        this.appSignUpBannerUrl = string5;
        this.application = string6;
        this.timeOut = string7;
    }

    public /* synthetic */ LoginSignupBenefitsBannerData(String object, String string2, Boolean object2, String object3, Boolean object4, String object5, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        int n4 = n3;
        int n7 = n3 & 1;
        String string10 = null;
        if (n7 != 0) {
            n7 = 0;
            string9 = null;
        } else {
            string9 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string8 = null;
        } else {
            string8 = string2;
        }
        int n10 = n4 & 4;
        Object object6 = n10 != 0 ? Boolean.FALSE : object2;
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string7 = null;
        } else {
            string7 = object3;
        }
        int n15 = n4 & 0x10;
        Object object7 = n15 != 0 ? Boolean.FALSE : object4;
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string6 = null;
        } else {
            string6 = object5;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string5 = null;
        } else {
            string5 = string3;
        }
        if ((n4 &= 0x80) == 0) {
            string10 = string4;
        }
        object = this;
        string2 = string9;
        object2 = string8;
        object3 = object6;
        object4 = string7;
        object5 = object7;
        string3 = string6;
        string4 = string5;
        this(string9, string8, (Boolean)object6, string7, (Boolean)object7, string6, string5, string10);
    }

    public static /* synthetic */ LoginSignupBenefitsBannerData copy$default(LoginSignupBenefitsBannerData loginSignupBenefitsBannerData, String string2, String string3, Boolean bl2, String string4, Boolean bl3, String string5, String string6, String string7, int n3, Object object) {
        LoginSignupBenefitsBannerData loginSignupBenefitsBannerData2 = loginSignupBenefitsBannerData;
        int n4 = n3;
        int n7 = n3 & 1;
        String string8 = n7 != 0 ? loginSignupBenefitsBannerData.allowedCustomerState : string2;
        int n8 = n4 & 2;
        String string9 = n8 != 0 ? loginSignupBenefitsBannerData2.allowedCustomerType : string3;
        int n10 = n4 & 4;
        Boolean bl4 = n10 != 0 ? loginSignupBenefitsBannerData2.appLoginBannerEnabled : bl2;
        int n14 = n4 & 8;
        String string10 = n14 != 0 ? loginSignupBenefitsBannerData2.appLoginBannerUrl : string4;
        int n15 = n4 & 0x10;
        Boolean bl5 = n15 != 0 ? loginSignupBenefitsBannerData2.appSignUpBannerEnabled : bl3;
        int n16 = n4 & 0x20;
        String string11 = n16 != 0 ? loginSignupBenefitsBannerData2.appSignUpBannerUrl : string5;
        int n17 = n4 & 0x40;
        String string12 = n17 != 0 ? loginSignupBenefitsBannerData2.application : string6;
        String string13 = (n4 &= 0x80) != 0 ? loginSignupBenefitsBannerData2.timeOut : string7;
        string2 = string8;
        string3 = string9;
        bl2 = bl4;
        string4 = string10;
        bl3 = bl5;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        return loginSignupBenefitsBannerData.copy(string8, string9, bl4, string10, bl5, string11, string12, string13);
    }

    public final String component1() {
        return this.allowedCustomerState;
    }

    public final String component2() {
        return this.allowedCustomerType;
    }

    public final Boolean component3() {
        return this.appLoginBannerEnabled;
    }

    public final String component4() {
        return this.appLoginBannerUrl;
    }

    public final Boolean component5() {
        return this.appSignUpBannerEnabled;
    }

    public final String component6() {
        return this.appSignUpBannerUrl;
    }

    public final String component7() {
        return this.application;
    }

    public final String component8() {
        return this.timeOut;
    }

    public final LoginSignupBenefitsBannerData copy(String string2, String string3, Boolean bl2, String string4, Boolean bl3, String string5, String string6, String string7) {
        LoginSignupBenefitsBannerData loginSignupBenefitsBannerData = new LoginSignupBenefitsBannerData(string2, string3, bl2, string4, bl3, string5, string6, string7);
        return loginSignupBenefitsBannerData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LoginSignupBenefitsBannerData;
        if (!bl3) {
            return false;
        }
        object = (LoginSignupBenefitsBannerData)object;
        Object object2 = this.allowedCustomerState;
        Object object3 = ((LoginSignupBenefitsBannerData)object).allowedCustomerState;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.allowedCustomerType;
        object3 = ((LoginSignupBenefitsBannerData)object).allowedCustomerType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appLoginBannerEnabled;
        object3 = ((LoginSignupBenefitsBannerData)object).appLoginBannerEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appLoginBannerUrl;
        object3 = ((LoginSignupBenefitsBannerData)object).appLoginBannerUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appSignUpBannerEnabled;
        object3 = ((LoginSignupBenefitsBannerData)object).appSignUpBannerEnabled;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.appSignUpBannerUrl;
        object3 = ((LoginSignupBenefitsBannerData)object).appSignUpBannerUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.application;
        object3 = ((LoginSignupBenefitsBannerData)object).application;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timeOut;
        object = ((LoginSignupBenefitsBannerData)object).timeOut;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAllowedCustomerState() {
        return this.allowedCustomerState;
    }

    public final String getAllowedCustomerType() {
        return this.allowedCustomerType;
    }

    public final Boolean getAppLoginBannerEnabled() {
        return this.appLoginBannerEnabled;
    }

    public final String getAppLoginBannerUrl() {
        return this.appLoginBannerUrl;
    }

    public final Boolean getAppSignUpBannerEnabled() {
        return this.appSignUpBannerEnabled;
    }

    public final String getAppSignUpBannerUrl() {
        return this.appSignUpBannerUrl;
    }

    public final String getApplication() {
        return this.application;
    }

    public final String getTimeOut() {
        return this.timeOut;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.allowedCustomerState;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.allowedCustomerType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.appLoginBannerEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.appLoginBannerUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.appSignUpBannerEnabled;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.appSignUpBannerUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.application;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.timeOut;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.allowedCustomerState;
        String string2 = this.allowedCustomerType;
        Boolean bl2 = this.appLoginBannerEnabled;
        String string3 = this.appLoginBannerUrl;
        Boolean bl3 = this.appSignUpBannerEnabled;
        String string4 = this.appSignUpBannerUrl;
        String string5 = this.application;
        String string6 = this.timeOut;
        charSequence = og_1.a("LoginSignupBenefitsBannerData(allowedCustomerState=", charSequence, ", allowedCustomerType=", string2, ", appLoginBannerEnabled=");
        xi0_2.a(bl2, ", appLoginBannerUrl=", string3, ", appSignUpBannerEnabled=", (StringBuilder)charSequence);
        xi0_2.a(bl3, ", appSignUpBannerUrl=", string4, ", application=", (StringBuilder)charSequence);
        return ko_0.a((StringBuilder)charSequence, string5, ", timeOut=", string6, ")");
    }
}

