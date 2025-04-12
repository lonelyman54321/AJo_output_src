/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer.deeplink;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult$Error;
import com.appsflyer.deeplink.DeepLinkResult$Status;
import org.json.JSONException;
import org.json.JSONObject;

public class DeepLinkResult {
    private final DeepLink deepLink;
    private final DeepLinkResult$Error error;
    private final DeepLinkResult$Status status;

    public DeepLinkResult(DeepLink object, DeepLinkResult$Error deepLinkResult$Error) {
        this.deepLink = object;
        this.error = deepLinkResult$Error;
        if (deepLinkResult$Error != null) {
            object = DeepLinkResult$Status.ERROR;
            this.status = object;
        } else if (object != null) {
            object = DeepLinkResult$Status.FOUND;
            this.status = object;
        } else {
            object = DeepLinkResult$Status.NOT_FOUND;
            this.status = object;
        }
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public DeepLinkResult$Error getError() {
        return this.error;
    }

    public DeepLinkResult$Status getStatus() {
        return this.status;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        String string2 = "deepLink";
        Object object = this.deepLink;
        jSONObject.put(string2, object);
        string2 = "error";
        object = this.error;
        jSONObject.put(string2, object);
        string2 = "status";
        object = this.status;
        try {
            jSONObject.put(string2, object);
        }
        catch (JSONException jSONException) {
            object = "error while creating deep link json";
            AFLogger.afErrorLogForExcManagerOnly((String)object, jSONException);
        }
        return jSONObject.toString();
    }
}

