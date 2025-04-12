/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.data;

import android.content.Context;
import in.juspay.hypersdk.R$string;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.utils.IntegrationUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public class PaymentSessionInfo {
    private static final String LOG_TAG = "PaymentSessionInfo";
    private String acsJsHash;
    private boolean godelDisabled;
    private WeakReference godelManager;
    private final JuspayServices juspayServices;
    private JSONObject paymentDetails;
    private final SdkTracker sdkTracker;
    private final JSONObject sessionDetails;
    private final SessionInfo sessionInfo;

    public PaymentSessionInfo(JuspayServices object) {
        Object object2;
        this.sessionDetails = object2 = new JSONObject();
        this.juspayServices = object;
        super(null);
        this.godelManager = object2;
        object2 = ((JuspayServices)object).getSessionInfo();
        this.sessionInfo = object2;
        this.sdkTracker = object = ((JuspayServices)object).getSdkTracker();
    }

    public static String getGodelRemotesVersion(Context context) {
        int n3 = R$string.godel_remotes_version;
        return context.getString(n3);
    }

    public void addToSessionDetails(String string2, String string3) {
        Object object = this.sessionDetails;
        try {
            object.put(string2, (Object)string3);
        }
        catch (JSONException jSONException) {
            object = this.sdkTracker;
            String string4 = "payment_session_info";
            String string5 = "Exception when adding to sessionDetails";
            String string6 = LOG_TAG;
            String string7 = "action";
            String string8 = "system";
            ((SdkTracker)object).trackAndLogException(string6, string7, string8, string4, string5, jSONException);
        }
    }

    public void createSessionDataMap() {
        SessionInfo sessionInfo = this.sessionInfo;
        sessionInfo.createSessionDataMap();
        sessionInfo = this.sessionInfo;
        sessionInfo = sessionInfo.getSessionData();
        Object object = "godel_version";
        Object object2 = this.juspayServices;
        object2 = ((JuspayServices)object2).getContext();
        object2 = IntegrationUtils.getGodelVersion((Context)object2);
        sessionInfo.put((String)object, object2);
        object = "godel_build_version";
        object2 = this.juspayServices;
        object2 = ((JuspayServices)object2).getContext();
        object2 = IntegrationUtils.getGodelBuildVersion((Context)object2);
        sessionInfo.put((String)object, object2);
        object = "godel_remotes_version";
        object2 = this.juspayServices;
        object2 = ((JuspayServices)object2).getContext();
        object2 = PaymentSessionInfo.getGodelRemotesVersion((Context)object2);
        sessionInfo.put((String)object, object2);
        object = "is_godel";
        boolean bl2 = this.isGodelEnabled();
        sessionInfo.put((String)object, bl2);
        object = this.sessionInfo;
        try {
            ((SessionInfo)object).updateSessionData((JSONObject)sessionInfo);
        }
        catch (Exception exception) {
            object = this.sdkTracker;
            String string2 = "payment_session_info";
            String string3 = "Exception while creatingSession Data Map";
            object2 = LOG_TAG;
            String string4 = "action";
            String string5 = "system";
            ((SdkTracker)object).trackAndLogException((String)object2, string4, string5, string2, string3, exception);
        }
    }

    public String getAcsJsHash() {
        return this.acsJsHash;
    }

    public JSONObject getPaymentDetails() {
        JSONObject jSONObject = this.paymentDetails;
        if (jSONObject != null) {
            return jSONObject;
        }
        jSONObject = new JSONObject();
        return jSONObject;
    }

    public JSONObject getSessionDetails() {
        return this.sessionDetails;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isGodelEnabled() {
        JSONException jSONException2;
        block5: {
            boolean bl2;
            JSONObject jSONObject;
            boolean bl3;
            Object object;
            block4: {
                object = "GODEL";
                String string2 = "weblab";
                boolean bl4 = this.godelDisabled;
                bl3 = false;
                if (bl4) {
                    return false;
                }
                Godel godel = (Godel)this.godelManager.get();
                if (godel == null) {
                    return false;
                }
                try {
                    jSONObject = new JSONObject();
                    JSONObject jSONObject2 = godel.getConfig();
                    boolean bl5 = jSONObject2.has(string2);
                    if (!bl5) break block4;
                    godel = godel.getConfig();
                    jSONObject = godel.getJSONObject(string2);
                }
                catch (JSONException jSONException2) {
                    break block5;
                }
            }
            if (!(bl2 = jSONObject.has((String)object))) return true;
            object = jSONObject.get((String)object);
            int n3 = Integer.parseInt((String)(object = String.valueOf(object)));
            if (n3 == 0) return bl3;
            return true;
        }
        this.sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "payment_session_info", "Exception while retrieving Godel value", jSONException2);
        return false;
    }

    public void setAcsJsHash(String string2) {
        this.acsJsHash = string2;
    }

    public void setGodelDisabled(String string2) {
        this.godelDisabled = true;
        this.sdkTracker.trackAction("system", "info", "payment_session_info", "godel_switching_off", string2);
    }

    public void setGodelManager(Godel godel) {
        WeakReference<Godel> weakReference;
        this.godelManager = weakReference = new WeakReference<Godel>(godel);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setPaymentDetails(String string2, String string3) {
        JSONException jSONException2;
        block3: {
            JSONObject jSONObject;
            block2: {
                try {
                    jSONObject = this.paymentDetails;
                    if (jSONObject != null) break block2;
                    this.paymentDetails = jSONObject = new JSONObject();
                }
                catch (JSONException jSONException2) {
                    break block3;
                }
            }
            jSONObject = this.paymentDetails;
            jSONObject.put(string2, (Object)string3);
            return;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string4 = "payment_session_info";
        String string5 = "Exception while trying to set payment details";
        String string6 = LOG_TAG;
        String string7 = "action";
        String string8 = "system";
        sdkTracker.trackAndLogException(string6, string7, string8, string4, string5, jSONException2);
    }

    public void setPaymentDetails(JSONObject jSONObject) {
        this.paymentDetails = jSONObject;
    }
}

