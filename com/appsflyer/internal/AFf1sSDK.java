/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.LinkGenerator$ResponseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class AFf1sSDK
extends AFf1oSDK {
    private final String component3;
    private final UUID copy;
    private final LinkGenerator copydefault;
    private final LinkGenerator$ResponseListener equals;
    private final String hashCode;
    private final Map toString;

    public AFf1sSDK(AFd1kSDK hashMap, UUID uUID, String string2, Map map2, String string3, LinkGenerator$ResponseListener linkGenerator$ResponseListener, LinkGenerator linkGenerator) {
        AFf1zSDK aFf1zSDK = AFf1zSDK.areAllFieldsValid;
        Object object = AFf1zSDK.getRevenue;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{object};
        object = ((Object)uUID).toString();
        super(aFf1zSDK, aFf1zSDKArray, (AFd1kSDK)((Object)hashMap), (String)object);
        this.copy = uUID;
        this.component3 = string2;
        this.toString = hashMap = new HashMap(map2);
        this.equals = linkGenerator$ResponseListener;
        this.hashCode = string3;
        this.copydefault = linkGenerator;
    }

    public final boolean a_() {
        return false;
    }

    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public final boolean copydefault() {
        return false;
    }

    public final AFe1tSDK getMediationNetwork(String string2) {
        AFe1qSDK aFe1qSDK = this.component2;
        String string3 = this.component3;
        Map map2 = this.toString;
        String string4 = this.hashCode;
        UUID uUID = this.copy;
        return aFe1qSDK.getCurrencyIso4217Code(string3, map2, string4, uUID, string2);
    }

    public final long getMonetizationNetwork() {
        return 3000L;
    }

    public final void getRevenue() {
        super.getRevenue();
        LinkGenerator$ResponseListener linkGenerator$ResponseListener = this.equals;
        if (linkGenerator$ResponseListener != null) {
            Object object = this.getMediationNetwork;
            AFe1cSDK aFe1cSDK = AFe1cSDK.getRevenue;
            if (object == aFe1cSDK && (object = this.component4) != null) {
                object = (String)((AFe1kSDK)object).getBody();
                linkGenerator$ResponseListener.onResponse((String)object);
                return;
            }
            object = this.component1();
            boolean bl2 = object instanceof ParsingException;
            if (bl2) {
                boolean bl3 = ((AFe1kSDK)(object = ((ParsingException)object).getRawResponse())).isSuccessful();
                if (bl3) {
                    linkGenerator$ResponseListener.onResponseError("Can't parse one link data");
                    return;
                }
                object = this.copydefault.generateLink();
                linkGenerator$ResponseListener.onResponse((String)object);
                return;
            }
            object = this.copydefault.generateLink();
            linkGenerator$ResponseListener.onResponse((String)object);
        }
    }
}

