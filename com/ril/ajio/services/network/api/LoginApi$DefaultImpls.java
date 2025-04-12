/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.network.api.LoginApi;
import java.util.Map;

public final class LoginApi$DefaultImpls {
    public static /* synthetic */ Object checkAccount$default(LoginApi loginApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return loginApi.checkAccount(string2, string3, string4, string5, map2, string6, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAccount");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object getLoginSignupBanner$default(LoginApi object, String string2, String string3, String string4, f80_0 f80_02, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                string4 = "B2C";
            }
            return object.getLoginSignupBanner(string2, string3, string4, f80_02);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLoginSignupBanner");
        throw object;
    }

    public static /* synthetic */ Object loginAnonymous$default(LoginApi object, String string2, Map map2, String string3, String string4, f80_0 f80_02, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 8) != 0) {
                string4 = "B2C";
            }
            return object.loginAnonymous(string2, map2, string3, string4, f80_02);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginAnonymous");
        throw object;
    }

    public static /* synthetic */ Object loginUser$default(LoginApi object, String string2, Map map2, Map map3, String string3, String string4, f80_0 f80_02, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 0x10) != 0) {
                string4 = "B2C";
            }
            return object.loginUser(string2, map2, map3, string3, string4, f80_02);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginUser");
        throw object;
    }

    public static /* synthetic */ Object newRegisterAndLogin$default(LoginApi loginApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return loginApi.newRegisterAndLogin(string2, string3, string4, string5, map2, string6, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newRegisterAndLogin");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object registerAndLogin$default(LoginApi loginApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return loginApi.registerAndLogin(string2, string3, string4, string5, map2, string6, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerAndLogin");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object requestOtp$default(LoginApi loginApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return loginApi.requestOtp(string2, string3, string4, string5, map2, string6, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOtp");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object resetPasswordWithToken$default(LoginApi object, String string2, Map map2, String string3, String string4, f80_0 f80_02, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 8) != 0) {
                string4 = "B2C";
            }
            return object.resetPasswordWithToken(string2, map2, string3, string4, f80_02);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetPasswordWithToken");
        throw object;
    }

    public static /* synthetic */ Object sendOtp$default(LoginApi loginApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return loginApi.sendOtp(string2, string3, string4, string5, map2, string6, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendOtp");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object setPassword$default(LoginApi loginApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return loginApi.setPassword(string2, string3, string4, string5, map2, string6, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPassword");
        throw unsupportedOperationException;
    }
}

