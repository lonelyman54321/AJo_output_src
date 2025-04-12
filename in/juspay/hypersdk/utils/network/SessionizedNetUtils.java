/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.utils.network;

import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SessionizedNetUtils
extends NetUtils {
    private final SessionInfo sessionInfo;

    public SessionizedNetUtils(SessionInfo sessionInfo, int n3, int n4, boolean bl2) {
        super(n3, n4, bl2);
        this.sessionInfo = sessionInfo;
    }

    private String trimClientId(String string2) {
        Matcher matcher = Pattern.compile("^(.*)_android$", 2).matcher(string2);
        int n3 = matcher.matches();
        if (n3 != 0 && (n3 = matcher.groupCount()) > 0) {
            int n4 = 1;
            string2 = matcher.group(n4);
        }
        return string2;
    }

    public Map getDefaultSDKHeaders() {
        Map map2 = super.getDefaultSDKHeaders();
        String string2 = this.sessionInfo.tryGetMerchantId();
        String string3 = "x-merchant-id";
        map2.put(string3, string2);
        string2 = this.sessionInfo.tryGetClientId();
        if (string2 != null) {
            string2 = this.trimClientId(string2);
        }
        map2.put("x-client-id", string2);
        return map2;
    }
}

