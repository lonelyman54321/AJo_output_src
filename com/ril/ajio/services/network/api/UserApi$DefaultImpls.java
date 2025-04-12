/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.DeleteAccountRequest;
import com.ril.ajio.services.network.api.UserApi;
import java.util.Map;

public final class UserApi$DefaultImpls {
    public static /* synthetic */ Object deleteAccount$default(UserApi userApi, String string2, String string3, String string4, String string5, DeleteAccountRequest deleteAccountRequest, String string6, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string7;
            int n4 = n3 & 0x20;
            String string8 = n4 != 0 ? (string7 = "B2C") : string6;
            return userApi.deleteAccount(string2, string3, string4, string5, deleteAccountRequest, string8, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAccount");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 getCancelRequest$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.getCancelRequest(string2, string3, string4, string5, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCancelRequest");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 getStaticLinks$default(UserApi object, String string2, String string3, String string4, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 4) != 0) {
                string4 = "B2C";
            }
            return object.getStaticLinks(string2, string3, string4);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStaticLinks");
        throw object;
    }

    public static /* synthetic */ g53_0 getUserProfile$default(UserApi object, String string2, String string3, String string4, String string5, String string6, String string7, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 0x20) != 0) {
                string7 = "B2C";
            }
            return object.getUserProfile(string2, string3, string4, string5, string6, string7);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserProfile");
        throw object;
    }

    public static /* synthetic */ g53_0 getUserType$default(UserApi object, String string2, String string3, String string4, Map map2, String string5, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 0x10) != 0) {
                string5 = "B2C";
            }
            return object.getUserType(string2, string3, string4, map2, string5);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserType");
        throw object;
    }

    public static /* synthetic */ g53_0 logoutUser$default(UserApi object, String string2, String string3, String string4, String string5, String string6, String string7, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 0x20) != 0) {
                string7 = "B2C";
            }
            return object.logoutUser(string2, string3, string4, string5, string6, string7);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logoutUser");
        throw object;
    }

    public static /* synthetic */ g53_0 requestOtpForAccessProfile$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.requestOtpForAccessProfile(string2, string3, string4, string5, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOtpForAccessProfile");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 requestOtpForProfileEmail$default(UserApi userApi, String string2, String string3, String string4, String string5, Boolean bl2, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3;
            n4 = n3 & 0x80;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.requestOtpForProfileEmail(string2, string3, string4, string5, bl2, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOtpForProfileEmail");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 requestOtpForProfileMobile$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.requestOtpForProfileMobile(string2, string3, string4, string5, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOtpForProfileMobile");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 requestOtpToken$default(UserApi object, String string2, String string3, Map map2, String string4, String string5, int n3, Object object2) {
        if (object2 == null) {
            if ((n3 &= 0x10) != 0) {
                string5 = "B2C";
            }
            return object.requestOtpToken(string2, string3, map2, string4, string5);
        }
        object = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOtpToken");
        throw object;
    }

    public static /* synthetic */ g53_0 updateUserProfile$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.updateUserProfile(string2, string3, string4, string5, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserProfile");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 updateUserProfileUaas$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.updateUserProfileUaas(string2, string3, string4, string5, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserProfileUaas");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ Object updateUserProfileUaasFlowResetPassword$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, f80_0 f80_02, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.updateUserProfileUaasFlowResetPassword(string2, string3, string4, string5, map2, string6, string9, f80_02);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserProfileUaasFlowResetPassword");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 updateUserProfileUaasRequest$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.updateUserProfileUaasRequest(string2, string3, string4, string5, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserProfileUaasRequest");
        throw unsupportedOperationException;
    }

    public static /* synthetic */ g53_0 verifyOtpForAccessProfile$default(UserApi userApi, String string2, String string3, String string4, String string5, Map map2, String string6, String string7, int n3, Object object) {
        if (object == null) {
            String string8;
            int n4 = n3 & 0x40;
            String string9 = n4 != 0 ? (string8 = "B2C") : string7;
            return userApi.verifyOtpForAccessProfile(string2, string3, string4, string5, map2, string6, string9);
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyOtpForAccessProfile");
        throw unsupportedOperationException;
    }
}

