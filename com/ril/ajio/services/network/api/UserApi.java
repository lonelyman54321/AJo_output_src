/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.DeleteAccountRequest;
import com.ril.ajio.services.data.user.GPSLocationData;
import java.util.HashMap;
import java.util.Map;

public interface UserApi {
    public Object deleteAccount(String var1, String var2, String var3, String var4, DeleteAccountRequest var5, String var6, f80_0 var7);

    public g53_0 getCancelRequest(String var1, String var2, String var3, String var4, Map var5, String var6, String var7);

    public g53_0 getCohortBasedOnDeviceId(String var1, String var2, String var3);

    public g53_0 getGpsData(String var1, String var2, GPSLocationData var3);

    public g53_0 getGpsDataPD(String var1, String var2, GPSLocationData var3);

    public g53_0 getStaticLinks(String var1, String var2, String var3);

    public g53_0 getUserProfile(String var1, String var2, String var3, String var4, String var5, String var6);

    public g53_0 getUserType(String var1, String var2, String var3, Map var4, String var5);

    public g53_0 logoutUser(String var1, String var2, String var3, String var4, String var5, String var6);

    public g53_0 requestOtpForAccessProfile(String var1, String var2, String var3, String var4, Map var5, String var6, String var7);

    public g53_0 requestOtpForProfileEmail(String var1, String var2, String var3, String var4, Boolean var5, Map var6, String var7, String var8);

    public g53_0 requestOtpForProfileMobile(String var1, String var2, String var3, String var4, Map var5, String var6, String var7);

    public g53_0 requestOtpToken(String var1, String var2, Map var3, String var4, String var5);

    public g53_0 updateUserProfile(String var1, String var2, String var3, String var4, Map var5, String var6, String var7);

    public g53_0 updateUserProfileUaas(String var1, String var2, String var3, String var4, Map var5, String var6, String var7);

    public Object updateUserProfileUaasFlowResetPassword(String var1, String var2, String var3, String var4, Map var5, String var6, String var7, f80_0 var8);

    public g53_0 updateUserProfileUaasRequest(String var1, String var2, String var3, String var4, Map var5, String var6, String var7);

    public g53_0 validateSession(String var1, HashMap var2);

    public g53_0 verifyOtpForAccessProfile(String var1, String var2, String var3, String var4, Map var5, String var6, String var7);
}

