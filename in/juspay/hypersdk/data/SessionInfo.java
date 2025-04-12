/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.net.ConnectivityManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Settings$Secure
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.data;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.SessionInfoInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.SdkInfo;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SessionInfo
implements SessionInfoInterface {
    private static final String LOG_TAG = "in.juspay.hypersdk.data.SessionInfo";
    private final String androidId;
    private JSONObject bundleParams;
    private final Context context;
    private final String deviceId;
    private DisplayMetrics displayMetrics;
    private final JuspayServices juspayServices;
    private String sessionId;
    private JSONObject sessionInfo;
    private final Workspace workspace;

    public SessionInfo(JuspayServices object) {
        Workspace workspace;
        this.juspayServices = object;
        this.workspace = workspace = ((JuspayServices)object).getWorkspace();
        object = ((JuspayServices)object).getContext().getApplicationContext();
        this.context = object;
        this.sessionInfo = object;
        super();
        this.bundleParams = object;
        this.androidId = object = this.generateId("juspay_android_id");
        this.deviceId = object = this.generateId("juspay_device_id");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addOrUpdateOrderId(String string2) {
        String string3;
        JSONObject jSONObject = this.getSessionData();
        String string4 = jSONObject.optString(string3 = "order_id");
        boolean bl2 = string4.equals(string2);
        if (bl2) return;
        string4 = "";
        bl2 = string2.equals(string4);
        if (bl2) return;
        try {
            jSONObject.put(string3, (Object)string2);
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean devOptionsEnabled() {
        Context context;
        boolean bl2 = false;
        try {
            context = this.context;
        }
        catch (Exception exception) {
            return bl2;
        }
        context = context.getContentResolver();
        String string2 = "development_settings_enabled";
        int n3 = Settings.Secure.getInt((ContentResolver)context, (String)string2, (int)0);
        int n4 = 1;
        if (n3 != n4) return bl2;
        return true;
    }

    private String generateId(String string2) {
        Object object = this.workspace;
        Workspace workspace = null;
        if ((object = ((Workspace)object).getFromSharedPreference(string2, null)) == null) {
            object = UUID.randomUUID().toString();
            workspace = this.workspace;
            workspace.writeToSharedPreference(string2, (String)object);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics;
        try {
            displayMetrics = this.displayMetrics;
            if (displayMetrics != null) return this.displayMetrics;
        }
        catch (Exception exception) {
            return null;
        }
        displayMetrics = this.context;
        displayMetrics = displayMetrics.getResources();
        displayMetrics = displayMetrics.getDisplayMetrics();
        this.displayMetrics = displayMetrics;
        return this.displayMetrics;
    }

    public static String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    private String getOrderIdFromPayload(JSONObject jSONObject, String string2) {
        String string3 = "orderId";
        boolean bl2 = jSONObject.has(string3);
        if (bl2) {
            return jSONObject.optString(string3);
        }
        string3 = "order_id";
        bl2 = jSONObject.has(string3);
        if (bl2) {
            return jSONObject.optString(string3);
        }
        return string2;
    }

    private String getScreenPpi() {
        DisplayMetrics displayMetrics = this.getDisplayMetrics();
        if (displayMetrics != null) {
            return String.valueOf(displayMetrics.xdpi);
        }
        return null;
    }

    private int getVersionCode() {
        Context context;
        try {
            context = this.context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return -1;
        }
        context = context.getPackageManager();
        Object object = this.context;
        object = object.getPackageName();
        context = context.getPackageInfo((String)object, 0);
        return context.versionCode;
    }

    private String getVersionName() {
        Context context;
        try {
            context = this.context;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return null;
        }
        context = context.getPackageManager();
        Object object = this.context;
        object = object.getPackageName();
        context = context.getPackageInfo((String)object, 0);
        return context.versionName;
    }

    private static boolean isRooted() {
        String string2;
        boolean bl2;
        Object object = Build.TAGS;
        boolean bl3 = true;
        if (object != null && (bl2 = ((String)object).contains(string2 = "test-keys"))) {
            return bl3;
        }
        string2 = "/system/app/Superuser.apk";
        try {
            object = new File(string2);
            bl2 = ((File)object).exists();
            if (bl2) {
                return bl3;
            }
        }
        catch (Exception exception) {}
        return false;
    }

    private String randomUUID() {
        int n3 = 1;
        int n4 = 16;
        byte[] byArray = new byte[n4];
        Object object = new SecureRandom();
        int n7 = 4;
        Object object2 = new byte[n7];
        ((SecureRandom)object).nextBytes((byte[])object2);
        object = ByteBuffer.allocate(8);
        long l2 = System.currentTimeMillis();
        ((ByteBuffer)object).putLong(l2);
        object = ((ByteBuffer)object).array();
        int n8 = 6;
        int n10 = 2;
        System.arraycopy(object, n10, byArray, 0, n8);
        int n14 = 12;
        System.arraycopy(object2, 0, byArray, n14, n7);
        object = new StringBuilder();
        for (n7 = 0; n7 < n4; n7 += n3) {
            byte by2 = byArray[n7];
            object2 = by2;
            Object[] objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = String.format("%02x", objectArray);
            ((StringBuilder)object).append((String)object2);
        }
        return ((StringBuilder)object).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void addOrderIdInSessionData(JSONObject object) {
        JSONObject jSONObject;
        String string2;
        block19: {
            String string3;
            String string4;
            String string5;
            block18: {
                string2 = "orderDetails";
                string5 = "signaturePayload";
                String string6 = "payload";
                jSONObject = object.optJSONObject(string6);
                if (jSONObject == null) return;
                try {
                    boolean bl2 = jSONObject.has(string5);
                    string4 = "orderId";
                    string3 = "{}";
                    if (!bl2) break block18;
                }
                catch (JSONException jSONException) {
                    return;
                }
                string2 = jSONObject.optString(string5, string3);
                string5 = new JSONObject(string2);
                String string8 = jSONObject.optString(string4);
                string8 = this.getOrderIdFromPayload((JSONObject)string5, string8);
                this.addOrUpdateOrderId(string8);
                return;
            }
            boolean bl3 = jSONObject.has(string2);
            if (!bl3) break block19;
            string2 = jSONObject.optString(string2, string3);
            string5 = new JSONObject(string2);
            String string10 = jSONObject.optString(string4);
            string10 = this.getOrderIdFromPayload((JSONObject)string5, string10);
            this.addOrUpdateOrderId(string10);
            return;
        }
        string2 = "";
        String string11 = this.getOrderIdFromPayload(jSONObject, string2);
        this.addOrUpdateOrderId(string11);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void createSessionDataMap() {
        String string2 = "";
        JSONObject jSONObject = new JSONObject();
        Object object = "brand";
        try {
            boolean bl2;
            Object object2 = Build.BRAND;
            jSONObject.put((String)object, object2);
            object = "model";
            object2 = Build.MODEL;
            jSONObject.put((String)object, object2);
            object = "manufacturer";
            object2 = Build.MANUFACTURER;
            jSONObject.put((String)object, object2);
            object = "device_id";
            object2 = this.getDeviceId();
            jSONObject.put((String)object, object2);
            object = "android_id";
            object2 = this.getAndroidId();
            object2 = EncryptionHelper.getSHA256Hash((String)object2);
            jSONObject.put((String)object, object2);
            object = "os";
            object2 = "android";
            jSONObject.put((String)object, object2);
            object = "os_version";
            object2 = Build.VERSION.RELEASE;
            jSONObject.put((String)object, object2);
            object = "android_api_level";
            int n3 = Build.VERSION.SDK_INT;
            object2 = String.valueOf(n3);
            jSONObject.put((String)object, object2);
            object = "locale";
            object2 = Locale.getDefault();
            object2 = ((Locale)object2).getDisplayLanguage();
            jSONObject.put((String)object, object2);
            object = "app_name";
            object2 = this.context;
            object2 = object2.getApplicationInfo();
            Context context = this.context;
            context = context.getPackageManager();
            object2 = object2.loadLabel((PackageManager)context);
            jSONObject.put((String)object, object2);
            object = "app_version";
            object2 = this.getVersionName();
            jSONObject.put((String)object, object2);
            object = "app_version_code";
            n3 = this.getVersionCode();
            jSONObject.put((String)object, n3);
            object = this.getClientId();
            n3 = (int)(Objects.equals(object, string2) ? 1 : 0);
            if (n3 == 0) {
                object2 = "client_id";
                jSONObject.put((String)object2, object);
            }
            if (!(bl2 = Objects.equals(object = this.getMerchantId(), string2))) {
                string2 = "merchant_id";
                jSONObject.put(string2, object);
            }
            string2 = "dir_name";
            object = this.context;
            object = object.getApplicationInfo();
            object = ((ApplicationInfo)object).sourceDir;
            jSONObject.put(string2, object);
            string2 = "package_name";
            object = this.context;
            object = object.getApplicationInfo();
            object = ((ApplicationInfo)object).packageName;
            jSONObject.put(string2, object);
            string2 = "network_info";
            object = this.getNetworkInfo();
            jSONObject.put(string2, object);
            string2 = "network_type";
            int n4 = this.getNetworkType();
            object = String.valueOf(n4);
            jSONObject.put(string2, object);
            string2 = "ip_address";
            object = this.juspayServices;
            object = Utils.getIPAddress((JuspayServices)object);
            jSONObject.put(string2, object);
            string2 = "vpn_connected";
            object = this.context;
            boolean bl3 = Utils.checkIfVPNConnected((Context)object);
            object = String.valueOf(bl3);
            jSONObject.put(string2, object);
            string2 = "is_rooted";
            boolean bl4 = SessionInfo.isRooted();
            object = String.valueOf(bl4);
            jSONObject.put(string2, object);
            string2 = "is_dev_enabled";
            boolean bl5 = this.devOptionsEnabled();
            object = String.valueOf(bl5);
            jSONObject.put(string2, object);
            string2 = "app_debuggable";
            boolean bl6 = JuspayCoreLib.isAppDebuggable();
            jSONObject.put(string2, bl6);
            string2 = "sdk_debuggable";
            object = this.juspayServices;
            object = ((JuspayServices)object).getSdkInfo();
            boolean bl7 = ((SdkInfo)object).isSdkDebuggable();
            jSONObject.put(string2, bl7);
            string2 = "screen_width";
            object = this.getScreenWidth();
            jSONObject.put(string2, object);
            string2 = "screen_height";
            object = this.getScreenHeight();
            jSONObject.put(string2, object);
            string2 = "screen_ppi";
            object = this.getScreenPpi();
            jSONObject.put(string2, object);
            this.updateSessionData(jSONObject);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public String get(String string2, String string3) {
        return this.sessionInfo.optString(string2, string3);
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public String getAppName() {
        String string2;
        String string3 = this.sessionInfo.optString("app_name");
        boolean bl2 = string3.equals(string2 = "");
        if (bl2) {
            string3 = this.getClientId();
        }
        return string3;
    }

    public JSONObject getBundleParams() {
        return this.bundleParams;
    }

    public String getClientId() {
        JSONObject jSONObject = this.bundleParams;
        String string2 = "payload";
        boolean bl2 = jSONObject.has(string2);
        if (bl2 && (jSONObject = this.bundleParams.optJSONObject(string2)) != null) {
            string2 = "clientId";
            boolean bl3 = jSONObject.has(string2);
            if (bl3) {
                return jSONObject.optString(string2);
            }
            string2 = "client_id";
            bl3 = jSONObject.has(string2);
            if (bl3) {
                return jSONObject.optString(string2);
            }
        }
        return "";
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    /*
     * Exception decompiling
     */
    public String getMerchantId() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 117->121)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public String getNetworkInfo() {
        String string2;
        block7: {
            Object object;
            try {
                object = this.context;
                string2 = "connectivity";
            }
            catch (Exception exception) {
                return null;
            }
            object = object.getSystemService(string2);
            object = (ConnectivityManager)object;
            string2 = "cellular";
            if (object == null) {
                return string2;
            }
            int n3 = 1;
            object = object.getNetworkInfo(n3);
            if (object == null) break block7;
            boolean bl2 = object.isConnected();
            if (!bl2) break block7;
            return "wifi";
        }
        return string2;
    }

    public String getNetworkName() {
        int n3 = this.getNetworkType();
        String string2 = "wifi";
        String string3 = this.getNetworkInfo();
        boolean bl2 = string2.equals(string3);
        if (bl2) {
            return "WIFI";
        }
        switch (n3) {
            default: {
                return "OTHER";
            }
            case 20: {
                return "5G";
            }
            case 18: {
                return "4G";
            }
            case 13: {
                return "4G_OR_5G";
            }
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 14: 
            case 15: 
            case 17: {
                return "3G";
            }
            case 1: 
            case 2: 
            case 4: 
            case 7: 
            case 11: 
            case 16: 
        }
        return "2G";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getNetworkType() {
        int n3;
        String string2;
        int n4;
        block9: {
            Context context;
            n4 = -1;
            try {
                context = this.context;
                string2 = "android.permission.READ_BASIC_PHONE_STATE";
            }
            catch (Exception exception) {
                return n4;
            }
            n3 = t70.checkSelfPermission(context, string2);
            if (n3 == 0) break block9;
            return n4;
        }
        n3 = Build.VERSION.SDK_INT;
        int n7 = 24;
        if (n3 < n7) return n4;
        Context context = this.context;
        string2 = "phone";
        Object object = context.getSystemService(string2);
        TelephonyManager telephonyManager = (TelephonyManager)object;
        if (telephonyManager == null) return n4;
        return uv1_0.a(telephonyManager);
    }

    public String getOrderId() {
        String string2;
        JSONObject jSONObject = this.getSessionData();
        boolean bl2 = jSONObject.has(string2 = "order_id");
        if (bl2) {
            return jSONObject.optString(string2);
        }
        return "";
    }

    public String getPackageName() {
        return this.context.getPackageName();
    }

    public String getScreenHeight() {
        DisplayMetrics displayMetrics = this.getDisplayMetrics();
        if (displayMetrics != null) {
            return String.valueOf(displayMetrics.heightPixels);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getScreenSizeDensity() {
        block14: {
            DisplayMetrics displayMetrics;
            try {
                displayMetrics = this.getDisplayMetrics();
                if (displayMetrics == null) break block14;
            }
            catch (Exception exception) {
                return null;
            }
            float f5 = displayMetrics.density;
            Context context = this.context;
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            int n3 = configuration.screenLayout & 0xF;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n3);
            String string2 = "-";
            stringBuilder.append(string2);
            stringBuilder.append(f5);
            return stringBuilder.toString();
        }
        String string3 = "display metrics null";
        Exception exception = new Exception(string3);
        throw exception;
    }

    public String getScreenWidth() {
        DisplayMetrics displayMetrics = this.getDisplayMetrics();
        if (displayMetrics != null) {
            return String.valueOf(displayMetrics.widthPixels);
        }
        return null;
    }

    public JSONObject getSessionData() {
        JSONObject jSONObject = this.sessionInfo;
        String string2 = "sessionData";
        if ((jSONObject = jSONObject.optJSONObject(string2)) != null) {
            return jSONObject;
        }
        jSONObject = new JSONObject();
        return jSONObject;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public boolean isNetworkAvailable() {
        boolean bl2;
        Context context = this.context;
        String string2 = "connectivity";
        if ((context = ((ConnectivityManager)context.getSystemService(string2)).getActiveNetworkInfo()) != null && (bl2 = context.isConnectedOrConnecting())) {
            bl2 = true;
        } else {
            bl2 = false;
            context = null;
        }
        return bl2;
    }

    public boolean isVerifyAssetsEnabled() {
        return this.sessionInfo.optBoolean("verify_assets", true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void logDeviceIdentifiers() {
        String string2;
        JSONObject jSONObject = new JSONObject();
        Object object = "device_id";
        try {
            string2 = this.getDeviceId();
        }
        catch (JSONException jSONException) {
            return;
        }
        jSONObject.put((String)object, (Object)string2);
        object = "android_id";
        string2 = this.getAndroidId();
        jSONObject.put((String)object, (Object)string2);
        object = this.juspayServices;
        object = ((JuspayServices)object).getSdkTracker();
        string2 = "device";
        String string3 = "info";
        String string4 = "identifiers";
        ((SdkTracker)object).trackContext(string2, string3, string4, jSONObject);
    }

    public void logSessionInfo() {
        Object object = this.juspayServices;
        object = ((JuspayServices)object).getSdkTracker();
        Object object2 = "device";
        String string2 = "info";
        String string3 = "session_info";
        Object object3 = this.sessionInfo;
        try {
            ((SdkTracker)object).trackContext((String)object2, string2, string3, object3);
        }
        catch (Exception exception) {
            object = this.juspayServices;
            object2 = ((JuspayServices)object).getSdkTracker();
            string2 = LOG_TAG;
            String string4 = "session_info";
            String string5 = "Exception while logging ";
            string3 = "action";
            object3 = "system";
            ((SdkTracker)object2).trackAndLogException(string2, string3, (String)object3, string4, string5, exception);
        }
    }

    public void removeAttribute(String string2) {
        this.sessionInfo.remove(string2);
    }

    public void resetSession() {
        JSONObject jSONObject;
        this.sessionId = null;
        this.sessionInfo = jSONObject = new JSONObject();
        this.bundleParams = jSONObject = new JSONObject();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void set(String string2, String string3) {
        JSONObject jSONObject;
        try {
            jSONObject = this.sessionInfo;
        }
        catch (Exception exception) {
            return;
        }
        jSONObject.put(string2, (Object)string3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setBundleParams(JSONObject object) {
        JSONObject jSONObject;
        block20: {
            String string2;
            String string3;
            int n3;
            int n4;
            block19: {
                JSONObject jSONObject2 = this.bundleParams;
                JSONArray jSONArray = jSONObject2.names();
                n4 = 0;
                if (jSONArray == null) break block19;
                n3 = 0;
                string3 = null;
                while (true) {
                    int n7 = jSONArray.length();
                    if (n3 >= n7) break;
                    string2 = jSONArray.getString(n3);
                    JSONObject jSONObject3 = this.bundleParams;
                    jSONObject3.remove(string2);
                    ++n3;
                    continue;
                    break;
                }
            }
            JSONArray jSONArray = object.names();
            if (jSONArray == null) break block20;
            while (true) {
                n3 = jSONArray.length();
                if (n4 >= n3) break;
                string3 = jSONArray.getString(n4);
                string2 = this.bundleParams;
                Object object2 = object.get(string3);
                string2.put(string3, object2);
                ++n4;
                continue;
                break;
            }
        }
        String string4 = "bundleParams";
        try {
            jSONObject = this.bundleParams;
        }
        catch (JSONException jSONException) {
            return;
        }
        String string5 = jSONObject.toString();
        this.set(string4, string5);
    }

    public void setSessionId() {
        String string2;
        this.sessionId = string2 = this.randomUUID();
        string2 = LOG_TAG;
        CharSequence charSequence = new StringBuilder("Session ID: ");
        String string3 = this.sessionId;
        charSequence.append(string3);
        charSequence = charSequence.toString();
        JuspayLogger.d(string2, (String)charSequence);
    }

    public String tryGetClientId() {
        String string2;
        String string3 = this.getClientId();
        boolean bl2 = string3.equals(string2 = "");
        if (bl2) {
            string3 = null;
        }
        return string3;
    }

    public String tryGetMerchantId() {
        String string2;
        String string3 = this.getMerchantId();
        boolean bl2 = string3.equals(string2 = "");
        if (bl2) {
            string3 = null;
        }
        return string3;
    }

    public void updateSessionData(JSONObject jSONObject) {
        Object object = this.sessionInfo;
        String string2 = "sessionData";
        object.remove(string2);
        object = this.sessionInfo;
        try {
            object.put(string2, (Object)jSONObject);
        }
        catch (JSONException jSONException) {
            object = this.juspayServices;
            string2 = LOG_TAG;
            String string3 = "Unable to update sessionInfo: ";
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append((Object)jSONException);
            String string4 = stringBuilder.toString();
            ((JuspayServices)object).sdkDebug(string2, string4);
        }
    }
}

