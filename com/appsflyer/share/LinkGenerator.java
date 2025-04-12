/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask$ResponseListener;
import com.appsflyer.internal.AFb1hSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK$2;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1sSDK;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.share.LinkGenerator$2;
import com.appsflyer.share.LinkGenerator$ResponseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LinkGenerator {
    String AFAdRevenueData;
    private String areAllFieldsValid;
    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private final Map copy;
    private String copydefault;
    private String equals;
    private final String getCurrencyIso4217Code;
    String getMediationNetwork;
    private String getMonetizationNetwork;
    private String getRevenue;

    public LinkGenerator(String string2) {
        HashMap hashMap;
        this.copy = hashMap = new HashMap();
        this.getCurrencyIso4217Code = string2;
    }

    private Map AFAdRevenueData() {
        boolean bl2;
        String string2;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        Object object = this.getCurrencyIso4217Code;
        hashMap.put("pid", object);
        Object object2 = this.component4;
        if (object2 != null) {
            object = "af_referrer_uid";
            hashMap.put(object, object2);
        }
        if ((object2 = this.getMonetizationNetwork) != null) {
            object = "af_channel";
            hashMap.put(object, object2);
        }
        if ((object2 = this.component2) != null) {
            object = "af_referrer_customer_id";
            hashMap.put(object, object2);
        }
        if ((object2 = this.getRevenue) != null) {
            object = "c";
            hashMap.put(object, object2);
        }
        if ((object2 = this.areAllFieldsValid) != null) {
            object = "af_referrer_name";
            hashMap.put(object, object2);
        }
        if ((object2 = this.component3) != null) {
            object = "af_referrer_image_url";
            hashMap.put(object, object2);
        }
        if ((object2 = this.equals) != null) {
            object2 = new StringBuilder();
            object = this.equals;
            ((StringBuilder)object2).append((String)object);
            object = this.component1;
            if (object != null) {
                String string3 = "";
                this.component1 = object = ((String)object).replaceFirst("^[/]", string3);
                object = this.equals;
                string2 = "/";
                bl2 = ((String)object).endsWith(string2);
                if (!bl2) {
                    string3 = string2;
                }
                ((StringBuilder)object2).append(string3);
                object = this.component1;
                ((StringBuilder)object2).append((String)object);
            }
            object2 = object2.toString();
            object = "af_dp";
            hashMap.put(object, object2);
        }
        object2 = this.copy.entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            object = (Map.Entry)object2.next();
            string2 = (String)object.getKey();
            object = (String)object.getValue();
            hashMap.put(string2, object);
        }
        return AFb1hSDK.AFAdRevenueData(hashMap);
    }

    public LinkGenerator addParameter(String string2, String string3) {
        this.copy.put(string2, string3);
        return this;
    }

    public LinkGenerator addParameters(Map map2) {
        if (map2 != null) {
            Map map3 = this.copy;
            map3.putAll(map2);
        }
        return this;
    }

    public String generateLink() {
        boolean bl2;
        Object object;
        Object object2;
        CharSequence charSequence;
        char c3;
        StringBuilder stringBuilder = new StringBuilder();
        Object object3 = this.getMediationNetwork;
        if (object3 != null && (c3 = ((String)object3).startsWith((String)(charSequence = "http"))) != '\u0000') {
            object3 = this.getMediationNetwork;
            stringBuilder.append((String)object3);
        } else {
            object3 = AFj1fSDK.getCurrencyIso4217Code;
            charSequence = AppsFlyerLib.getInstance().getHostPrefix();
            object2 = AFb1rSDK.getRevenue().getHostName();
            int c2 = 2;
            object = new Object[c2];
            object[0] = charSequence;
            int n3 = 1;
            object[n3] = object2;
            object3 = String.format((String)object3, object);
            stringBuilder.append((String)object3);
        }
        object3 = this.AFAdRevenueData;
        if (object3 != null) {
            c3 = '/';
            stringBuilder.append(c3);
            object3 = this.AFAdRevenueData;
            stringBuilder.append((String)object3);
        }
        object3 = this.AFAdRevenueData();
        charSequence = new StringBuilder();
        object3 = object3.entrySet().iterator();
        while (bl2 = object3.hasNext()) {
            object2 = object3.next();
            int n4 = ((StringBuilder)charSequence).length();
            if (n4 == 0) {
                n4 = 63;
                ((StringBuilder)charSequence).append((char)n4);
            } else {
                n4 = 38;
                ((StringBuilder)charSequence).append((char)n4);
            }
            object = (String)object2.getKey();
            ((StringBuilder)charSequence).append((String)object);
            n4 = 61;
            ((StringBuilder)charSequence).append((char)n4);
            object2 = (String)object2.getValue();
            ((StringBuilder)charSequence).append((String)object2);
        }
        object3 = charSequence.toString();
        stringBuilder.append((String)object3);
        return ((Object)stringBuilder).toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask$ResponseListener createOneLinkHttpTask$ResponseListener) {
        LinkGenerator$2 linkGenerator$2 = new LinkGenerator$2(this, createOneLinkHttpTask$ResponseListener);
        this.generateLink(context, linkGenerator$2);
    }

    public void generateLink(Context object, LinkGenerator$ResponseListener object2) {
        Object object3;
        String string2 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String string3 = this.copydefault;
        Map map2 = this.AFAdRevenueData();
        Object object4 = AppsFlyerProperties.getInstance();
        boolean bl2 = ((AppsFlyerProperties)object4).getBoolean((String)(object3 = "waitForCustomerId"), false);
        if (bl2) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1rSDK.getRevenue().AFAdRevenueData((Context)object);
        object = AFb1rSDK.getRevenue().getMonetizationNetwork();
        UUID uUID = UUID.randomUUID();
        object4 = new AFf1sSDK((AFd1kSDK)object, uUID, string2, map2, string3, (LinkGenerator$ResponseListener)object2, this);
        object = object.copy();
        object2 = ((AFe1aSDK)object).AFAdRevenueData;
        object3 = new AFe1aSDK$2((AFe1aSDK)object, (AFe1eSDK)object4);
        object2.execute((Runnable)object3);
    }

    public String getBrandDomain() {
        return this.copydefault;
    }

    public String getCampaign() {
        return this.getRevenue;
    }

    public String getChannel() {
        return this.getMonetizationNetwork;
    }

    public String getMediaSource() {
        return this.getCurrencyIso4217Code;
    }

    public Map getUserParams() {
        Map map2 = this.copy;
        HashMap hashMap = new HashMap(map2);
        return hashMap;
    }

    public LinkGenerator setBaseDeeplink(String string2) {
        this.equals = string2;
        return this;
    }

    public LinkGenerator setBaseURL(String string2, String string3, String string4) {
        int n3;
        String string5 = "/";
        String string6 = "https://";
        if (string2 != null && (n3 = string2.length()) > 0) {
            int n4;
            if (string3 == null || (n4 = string3.length()) < (n3 = 5)) {
                string3 = "go.onelink.me";
            }
            this.getMediationNetwork = string2 = UX.c(string6, string3, string5, string2);
        } else {
            string2 = AppsFlyerLib.getInstance().getHostPrefix();
            string3 = AFb1rSDK.getRevenue().getHostName();
            String string7 = "app.";
            string2 = n1.a(string2, string7, string3);
            this.getMediationNetwork = string2 = UX.c(string6, string2, string5, string4);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String string2) {
        this.copydefault = string2;
        return this;
    }

    public LinkGenerator setCampaign(String string2) {
        this.getRevenue = string2;
        return this;
    }

    public LinkGenerator setChannel(String string2) {
        this.getMonetizationNetwork = string2;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String string2) {
        this.component1 = string2;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String string2) {
        this.component2 = string2;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String string2) {
        this.component3 = string2;
        return this;
    }

    public LinkGenerator setReferrerName(String string2) {
        this.areAllFieldsValid = string2;
        return this;
    }

    public LinkGenerator setReferrerUID(String string2) {
        this.component4 = string2;
        return this;
    }
}

