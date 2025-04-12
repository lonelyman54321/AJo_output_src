/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.login;

import kotlin.jvm.internal.Intrinsics;

public final class RemovalLoginPasswordConfig {
    public static final int $stable;
    private final String account_check_api_error_msg;
    private final String account_check_api_error_msg_for_signup;
    private final boolean enable_restore_phone_number;
    private final String login_click_text_highlight;
    private final String login_restore_phone_number_message;
    private final String login_restore_phone_number_message_alt_text;
    private final String myaccount_request_phone_update_message;
    private final String profile_change_new_number_note;
    private final String profile_change_text_highlight;
    private final String restore_web_url;
    private final String signup_restore_phone_number_message;

    public RemovalLoginPasswordConfig(boolean bl2, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        Intrinsics.checkNotNullParameter(string2, "login_restore_phone_number_message");
        Intrinsics.checkNotNullParameter(string3, "myaccount_request_phone_update_message");
        Intrinsics.checkNotNullParameter(string4, "profile_change_new_number_note");
        Intrinsics.checkNotNullParameter(string5, "restore_web_url");
        Intrinsics.checkNotNullParameter(string6, "signup_restore_phone_number_message");
        Intrinsics.checkNotNullParameter(string7, "login_click_text_highlight");
        Intrinsics.checkNotNullParameter(string8, "account_check_api_error_msg");
        Intrinsics.checkNotNullParameter(string9, "profile_change_text_highlight");
        Intrinsics.checkNotNullParameter(string10, "account_check_api_error_msg_for_signup");
        Intrinsics.checkNotNullParameter(string11, "login_restore_phone_number_message_alt_text");
        this.enable_restore_phone_number = bl2;
        this.login_restore_phone_number_message = string2;
        this.myaccount_request_phone_update_message = string3;
        this.profile_change_new_number_note = string4;
        this.restore_web_url = string5;
        this.signup_restore_phone_number_message = string6;
        this.login_click_text_highlight = string7;
        this.account_check_api_error_msg = string8;
        this.profile_change_text_highlight = string9;
        this.account_check_api_error_msg_for_signup = string10;
        this.login_restore_phone_number_message_alt_text = string11;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ RemovalLoginPasswordConfig copy$default(RemovalLoginPasswordConfig removalLoginPasswordConfig, boolean bl2, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, int n3, Object object) {
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        void var12_13;
        RemovalLoginPasswordConfig removalLoginPasswordConfig2 = removalLoginPasswordConfig;
        int n4 = var12_13;
        int n7 = var12_13 & 1;
        n7 = n7 != 0 ? (int)(removalLoginPasswordConfig.enable_restore_phone_number ? 1 : 0) : (int)(bl2 ? 1 : 0);
        int n8 = n4 & 2;
        String string22 = n8 != 0 ? removalLoginPasswordConfig2.login_restore_phone_number_message : string21;
        int n10 = n4 & 4;
        String string23 = n10 != 0 ? removalLoginPasswordConfig2.myaccount_request_phone_update_message : string20;
        int n14 = n4 & 8;
        String string24 = n14 != 0 ? removalLoginPasswordConfig2.profile_change_new_number_note : string19;
        int n15 = n4 & 0x10;
        String string25 = n15 != 0 ? removalLoginPasswordConfig2.restore_web_url : string18;
        int n16 = n4 & 0x20;
        String string26 = n16 != 0 ? removalLoginPasswordConfig2.signup_restore_phone_number_message : string17;
        int n17 = n4 & 0x40;
        String string27 = n17 != 0 ? removalLoginPasswordConfig2.login_click_text_highlight : string16;
        int n18 = n4 & 0x80;
        String string28 = n18 != 0 ? removalLoginPasswordConfig2.account_check_api_error_msg : string15;
        int n19 = n4 & 0x100;
        String string29 = n19 != 0 ? removalLoginPasswordConfig2.profile_change_text_highlight : string14;
        int n20 = n4 & 0x200;
        String string30 = n20 != 0 ? removalLoginPasswordConfig2.account_check_api_error_msg_for_signup : string13;
        String string31 = (n4 &= 0x400) != 0 ? removalLoginPasswordConfig2.login_restore_phone_number_message_alt_text : string12;
        int n21 = n7;
        string21 = string22;
        string20 = string23;
        string19 = string24;
        string18 = string25;
        string17 = string26;
        string16 = string27;
        string15 = string28;
        string14 = string29;
        string13 = string30;
        string12 = string31;
        return removalLoginPasswordConfig.copy(n7 != 0, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31);
    }

    public final boolean component1() {
        return this.enable_restore_phone_number;
    }

    public final String component10() {
        return this.account_check_api_error_msg_for_signup;
    }

    public final String component11() {
        return this.login_restore_phone_number_message_alt_text;
    }

    public final String component2() {
        return this.login_restore_phone_number_message;
    }

    public final String component3() {
        return this.myaccount_request_phone_update_message;
    }

    public final String component4() {
        return this.profile_change_new_number_note;
    }

    public final String component5() {
        return this.restore_web_url;
    }

    public final String component6() {
        return this.signup_restore_phone_number_message;
    }

    public final String component7() {
        return this.login_click_text_highlight;
    }

    public final String component8() {
        return this.account_check_api_error_msg;
    }

    public final String component9() {
        return this.profile_change_text_highlight;
    }

    public final RemovalLoginPasswordConfig copy(boolean bl2, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
        Intrinsics.checkNotNullParameter(string2, "login_restore_phone_number_message");
        Intrinsics.checkNotNullParameter(string3, "myaccount_request_phone_update_message");
        Intrinsics.checkNotNullParameter(string4, "profile_change_new_number_note");
        Intrinsics.checkNotNullParameter(string5, "restore_web_url");
        Intrinsics.checkNotNullParameter(string6, "signup_restore_phone_number_message");
        Intrinsics.checkNotNullParameter(string7, "login_click_text_highlight");
        Intrinsics.checkNotNullParameter(string8, "account_check_api_error_msg");
        Intrinsics.checkNotNullParameter(string9, "profile_change_text_highlight");
        Intrinsics.checkNotNullParameter(string10, "account_check_api_error_msg_for_signup");
        Intrinsics.checkNotNullParameter(string11, "login_restore_phone_number_message_alt_text");
        RemovalLoginPasswordConfig removalLoginPasswordConfig = new RemovalLoginPasswordConfig(bl2, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11);
        return removalLoginPasswordConfig;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RemovalLoginPasswordConfig;
        if (!bl3) {
            return false;
        }
        object = (RemovalLoginPasswordConfig)object;
        bl3 = this.enable_restore_phone_number;
        boolean bl4 = ((RemovalLoginPasswordConfig)object).enable_restore_phone_number;
        if (bl3 != bl4) {
            return false;
        }
        String string2 = this.login_restore_phone_number_message;
        String string3 = ((RemovalLoginPasswordConfig)object).login_restore_phone_number_message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.myaccount_request_phone_update_message;
        string3 = ((RemovalLoginPasswordConfig)object).myaccount_request_phone_update_message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.profile_change_new_number_note;
        string3 = ((RemovalLoginPasswordConfig)object).profile_change_new_number_note;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.restore_web_url;
        string3 = ((RemovalLoginPasswordConfig)object).restore_web_url;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.signup_restore_phone_number_message;
        string3 = ((RemovalLoginPasswordConfig)object).signup_restore_phone_number_message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.login_click_text_highlight;
        string3 = ((RemovalLoginPasswordConfig)object).login_click_text_highlight;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.account_check_api_error_msg;
        string3 = ((RemovalLoginPasswordConfig)object).account_check_api_error_msg;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.profile_change_text_highlight;
        string3 = ((RemovalLoginPasswordConfig)object).profile_change_text_highlight;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.account_check_api_error_msg_for_signup;
        string3 = ((RemovalLoginPasswordConfig)object).account_check_api_error_msg_for_signup;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.login_restore_phone_number_message_alt_text;
        object = ((RemovalLoginPasswordConfig)object).login_restore_phone_number_message_alt_text;
        boolean bl5 = Intrinsics.areEqual(string2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final String getAccount_check_api_error_msg() {
        return this.account_check_api_error_msg;
    }

    public final String getAccount_check_api_error_msg_for_signup() {
        return this.account_check_api_error_msg_for_signup;
    }

    public final boolean getEnable_restore_phone_number() {
        return this.enable_restore_phone_number;
    }

    public final String getLogin_click_text_highlight() {
        return this.login_click_text_highlight;
    }

    public final String getLogin_restore_phone_number_message() {
        return this.login_restore_phone_number_message;
    }

    public final String getLogin_restore_phone_number_message_alt_text() {
        return this.login_restore_phone_number_message_alt_text;
    }

    public final String getMyaccount_request_phone_update_message() {
        return this.myaccount_request_phone_update_message;
    }

    public final String getProfile_change_new_number_note() {
        return this.profile_change_new_number_note;
    }

    public final String getProfile_change_text_highlight() {
        return this.profile_change_text_highlight;
    }

    public final String getRestore_web_url() {
        return this.restore_web_url;
    }

    public final String getSignup_restore_phone_number_message() {
        return this.signup_restore_phone_number_message;
    }

    public int hashCode() {
        int n3 = this.enable_restore_phone_number;
        n3 = n3 != 0 ? 1231 : 1237;
        int n4 = 31;
        n3 *= 31;
        String string2 = this.login_restore_phone_number_message;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.myaccount_request_phone_update_message;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.profile_change_new_number_note;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.restore_web_url;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.signup_restore_phone_number_message;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.login_click_text_highlight;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.account_check_api_error_msg;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.profile_change_text_highlight;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.account_check_api_error_msg_for_signup;
        n3 = zy_2.b(n3, n4, string2);
        return this.login_restore_phone_number_message_alt_text.hashCode() + n3;
    }

    public String toString() {
        boolean bl2 = this.enable_restore_phone_number;
        String string2 = this.login_restore_phone_number_message;
        String string3 = this.myaccount_request_phone_update_message;
        String string4 = this.profile_change_new_number_note;
        String string5 = this.restore_web_url;
        String string6 = this.signup_restore_phone_number_message;
        String string7 = this.login_click_text_highlight;
        String string8 = this.account_check_api_error_msg;
        String string9 = this.profile_change_text_highlight;
        String string10 = this.account_check_api_error_msg_for_signup;
        String string11 = this.login_restore_phone_number_message_alt_text;
        StringBuilder stringBuilder = new StringBuilder("RemovalLoginPasswordConfig(enable_restore_phone_number=");
        stringBuilder.append(bl2);
        stringBuilder.append(", login_restore_phone_number_message=");
        stringBuilder.append(string2);
        stringBuilder.append(", myaccount_request_phone_update_message=");
        X50.a(stringBuilder, string3, ", profile_change_new_number_note=", string4, ", restore_web_url=");
        X50.a(stringBuilder, string5, ", signup_restore_phone_number_message=", string6, ", login_click_text_highlight=");
        X50.a(stringBuilder, string7, ", account_check_api_error_msg=", string8, ", profile_change_text_highlight=");
        X50.a(stringBuilder, string9, ", account_check_api_error_msg_for_signup=", string10, ", login_restore_phone_number_message_alt_text=");
        return h30_0.a(stringBuilder, string11, ")");
    }
}

