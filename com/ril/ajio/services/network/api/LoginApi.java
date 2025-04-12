/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.network.api;

import com.ril.ajio.services.data.Login.UcpTokenRequest;
import java.util.Map;

public interface LoginApi {
    public Object checkAccount(String var1, String var2, String var3, String var4, Map var5, String var6, String var7, f80_0 var8);

    public Object getLoginSignupBanner(String var1, String var2, String var3, f80_0 var4);

    public Object getUcpTokens(String var1, UcpTokenRequest var2, f80_0 var3);

    public Object loginAnonymous(String var1, Map var2, String var3, String var4, f80_0 var5);

    public Object loginUser(String var1, Map var2, Map var3, String var4, String var5, f80_0 var6);

    public Object newRegisterAndLogin(String var1, String var2, String var3, String var4, Map var5, String var6, String var7, f80_0 var8);

    public Object registerAndLogin(String var1, String var2, String var3, String var4, Map var5, String var6, String var7, f80_0 var8);

    public Object requestOtp(String var1, String var2, String var3, String var4, Map var5, String var6, String var7, f80_0 var8);

    public Object resetPasswordWithToken(String var1, Map var2, String var3, String var4, f80_0 var5);

    public Object sendOtp(String var1, String var2, String var3, String var4, Map var5, String var6, String var7, f80_0 var8);

    public Object setPassword(String var1, String var2, String var3, String var4, Map var5, String var6, String var7, f80_0 var8);
}

