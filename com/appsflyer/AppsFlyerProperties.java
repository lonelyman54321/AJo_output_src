/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.AFLogger$LogLevel;
import com.appsflyer.internal.AFd1rSDK;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String ENABLE_TCF_DATA_COLLECTION = "enableTCFDataCollection";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";
    public static AppsFlyerProperties instance;
    private boolean AFAdRevenueData;
    public String getCurrencyIso4217Code;
    public boolean getMonetizationNetwork;
    private final Map getRevenue;

    public AppsFlyerProperties() {
        HashMap hashMap;
        this.getRevenue = hashMap = new HashMap();
        this.AFAdRevenueData = false;
    }

    public static AppsFlyerProperties getInstance() {
        AppsFlyerProperties appsFlyerProperties = instance;
        if (appsFlyerProperties == null) {
            instance = appsFlyerProperties = new AppsFlyerProperties();
        }
        return instance;
    }

    private boolean getRevenue() {
        return this.AFAdRevenueData;
    }

    public boolean getBoolean(String string2, boolean bl2) {
        if ((string2 = this.getString(string2)) == null) {
            return bl2;
        }
        return Boolean.parseBoolean(string2);
    }

    public int getInt(String string2, int n3) {
        if ((string2 = this.getString(string2)) == null) {
            return n3;
        }
        return Integer.parseInt(string2);
    }

    public int getLogLevel() {
        int n3 = AFLogger$LogLevel.NONE.getLevel();
        return this.getInt("logLevel", n3);
    }

    public long getLong(String string2, long l2) {
        if ((string2 = this.getString(string2)) == null) {
            return l2;
        }
        return Long.parseLong(string2);
    }

    public final boolean getMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    public String getReferrer(AFd1rSDK aFd1rSDK) {
        String string2 = this.getCurrencyIso4217Code;
        if (string2 != null) {
            return string2;
        }
        string2 = "AF_REFERRER";
        String string3 = this.getString(string2);
        if (string3 != null) {
            return this.getString(string2);
        }
        return aFd1rSDK.getMonetizationNetwork("referrer", null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getString(String string2) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            return map2.get(string2);
        }
    }

    public boolean isEnableLog() {
        AFLogger$LogLevel aFLogger$LogLevel;
        int n3;
        int n4 = this.getLogLevel();
        return n4 > (n3 = (aFLogger$LogLevel = AFLogger$LogLevel.NONE).getLevel());
    }

    public boolean isLogsDisabledCompletely() {
        return this.getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return this.getBoolean(DISABLE_OTHER_SDK, false);
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public void loadProperties(AFd1rSDK object) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                block12: {
                    String[] stringArray;
                    boolean bl2;
                    block11: {
                        JSONException jSONException2;
                        block10: {
                            boolean bl3;
                            String string2;
                            Object object2;
                            Object object3;
                            int n3;
                            String string3;
                            int n4;
                            block13: {
                                block8: {
                                    bl2 = this.getRevenue();
                                    if (!bl2) break block8;
                                    return;
                                }
                                stringArray = "savedProperties";
                                n4 = 0;
                                string3 = null;
                                stringArray = object.getMonetizationNetwork((String)stringArray, null);
                                if (stringArray == null) break block12;
                                string3 = "Loading properties..";
                                AFLogger.afDebugLog(string3);
                                string3 = new JSONObject((String)stringArray);
                                stringArray = string3.keys();
                                while ((n3 = stringArray.hasNext()) != 0) {
                                    object3 = stringArray.next();
                                    object3 = (String)object3;
                                    object2 = this.getRevenue;
                                    if ((object2 = object2.get(object3)) != null) continue;
                                    object2 = this.getRevenue;
                                    string2 = string3.getString(object3);
                                    object2.put(object3, string2);
                                }
                                break block13;
                                catch (Throwable throwable2) {
                                    break block9;
                                }
                                catch (JSONException jSONException2) {
                                    break block10;
                                }
                            }
                            stringArray = "AppsFlyerKey";
                            string3 = "custom_host";
                            object3 = "custom_host_prefix";
                            object2 = "advertiserIdEnabled";
                            string2 = "advertiserId";
                            stringArray = new String[]{stringArray, string3, object3, object2, string2};
                            string3 = null;
                            for (n4 = 0; n4 < (n3 = 5); ++n4) {
                                object3 = stringArray[n4];
                                object2 = this.getRevenue;
                                object2.remove(object3);
                            }
                            this.saveProperties((AFd1rSDK)object);
                            this.AFAdRevenueData = bl3 = true;
                            break block11;
                        }
                        stringArray = "Failed loading properties";
                        AFLogger.afErrorLog((String)stringArray, jSONException2);
                    }
                    stringArray = "Done loading properties: ";
                    object = new StringBuilder((String)stringArray);
                    bl2 = this.AFAdRevenueData;
                    ((StringBuilder)object).append(bl2);
                    object = object.toString();
                    AFLogger.afDebugLog((String)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void remove(String string2) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            map2.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void saveProperties(AFd1rSDK aFd1rSDK) {
        synchronized (this) {
            Object object = this.getRevenue;
            String string2 = "AppsFlyerKey";
            object.remove(string2);
            object = "savedProperties";
            Map map2 = this.getRevenue;
            string2 = new JSONObject(map2);
            string2 = string2.toString();
            aFd1rSDK.AFAdRevenueData((String)object, string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void set(String string2, int n3) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            String string3 = Integer.toString(n3);
            map2.put(string2, string3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void set(String string2, long l2) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            String string3 = Long.toString(l2);
            map2.put(string2, string3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void set(String string2, String string3) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            map2.put(string2, string3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void set(String string2, boolean bl2) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            String string3 = Boolean.toString(bl2);
            map2.put(string2, string3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void set(String string2, String[] stringArray) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            map2.put(string2, stringArray);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCustomData(String string2) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            String string3 = ADDITIONAL_CUSTOM_DATA;
            map2.put(string3, string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setUserEmails(String string2) {
        synchronized (this) {
            Map map2 = this.getRevenue;
            String string3 = USER_EMAILS;
            map2.put(string3, string2);
            return;
        }
    }
}

