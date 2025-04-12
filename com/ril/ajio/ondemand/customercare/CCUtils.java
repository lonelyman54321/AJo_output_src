/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.ondemand.customercare;

import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;

public final class CCUtils {
    public static final CCUtils INSTANCE;

    static {
        CCUtils cCUtils;
        INSTANCE = cCUtils = new CCUtils();
    }

    private CCUtils() {
    }

    public static final String getCCContactNumber1() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.b("customer_number_1");
    }

    public static final String getCCContactNumber2() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.b("customer_number_2");
    }

    public static final String getCCEmailId() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.b("cc_contact_email");
    }

    public static final String getCCLuxContactNumber() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.b("cc_luxe_customercare_number");
    }

    public static final String getCCLuxEmailId() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.b("cc_luxe_contact_email");
    }

    public static final boolean isCCEmailIdEnable() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.a("cc_email_enable");
    }

    public static final boolean isCCHelplineEnable() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.a("cc_helpline_enable");
    }

    public static final boolean isCallMeBackEnabled() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.a("CALL_ME_BACK");
    }

    public static final boolean isLuxCallMeBackEnable() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.a("cc_luxe_contact");
    }

    public static final boolean isLuxChatEnable() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.a("cc_luxe_chat_enable");
    }

    public static final boolean isLuxEmailEnable() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.a("cc_luxe_email_enable");
    }

    public static final boolean isLuxHelpLineEnable() {
        z40$a z40$a = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        z40$a.getClass();
        return z40$a.a((Context)aJIOApplication).a.a("cc_luxe_helpline_enable");
    }
}

