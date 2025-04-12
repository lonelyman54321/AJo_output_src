/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package ai.haptik.android.wrapper.sdk.model;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class SignupData {
    private String authCode;
    private String authId;
    private JSONObject customData;
    private String email;
    private final JSONObject jsonObject;
    private String mobileNo;
    private String signupType;
    private String userName;

    public SignupData() {
        Object object;
        this.jsonObject = object = new JSONObject();
        object = "";
        this.authId = object;
        this.authCode = object;
        this.signupType = "third_party";
        this.userName = object;
        this.mobileNo = object;
        this.email = object;
        this.customData = object = new JSONObject();
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getAuthId() {
        return this.authId;
    }

    public final JSONObject getCustomData() {
        return this.customData;
    }

    public final String getEmail() {
        return this.email;
    }

    public final JSONObject getJsonObject$sdk_release() {
        return this.jsonObject;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getSignupType() {
        return this.signupType;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setAuthCode(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("auth_code", (Object)string2);
        this.authCode = string2;
    }

    public final void setAuthId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("auth_id", (Object)string2);
        this.authId = string2;
    }

    public final void setCustomData(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "value");
        this.jsonObject.put("custom_data", (Object)jSONObject);
    }

    public final void setEmail(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("email", (Object)string2);
    }

    public final void setMobileNo(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("mobile_no", (Object)string2);
    }

    public final void setSignupType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("signup-type", (Object)string2);
        this.signupType = string2;
    }

    public final void setUserName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.jsonObject.put("username", (Object)string2);
    }
}

