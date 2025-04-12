/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.os.Build
 *  android.os.Build$VERSION
 *  org.json.JSONObject
 */
package ai.haptik.android.wrapper.sdk;

import ai.haptik.android.wrapper.sdk.HaptikSDK$a;
import ai.haptik.android.wrapper.sdk.HaptikSDK$b;
import ai.haptik.android.wrapper.sdk.HaptikSDK$c;
import ai.haptik.android.wrapper.sdk.HaptikSDK$d;
import ai.haptik.android.wrapper.sdk.HaptikWebView;
import ai.haptik.android.wrapper.sdk.R$string;
import ai.haptik.android.wrapper.sdk.model.InitData;
import ai.haptik.android.wrapper.sdk.model.Response;
import ai.haptik.android.wrapper.sdk.model.SignupData;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import org.json.JSONObject;

public final class HaptikSDK {
    public static final HaptikSDK INSTANCE;
    private static Context context;
    private static boolean handleLink;
    private static JSONObject initData;
    private static boolean initialized;
    private static JSONObject launchMessageData;
    private static Function1 sdkEventCallback;
    private static Function1 signupCallback;
    private static JSONObject signupData;
    private static hk3_2 view;

    static {
        HaptikSDK haptikSDK;
        INSTANCE = haptikSDK = new HaptikSDK();
        haptikSDK = new JSONObject();
        initData = haptikSDK;
        haptikSDK = new JSONObject();
        signupData = haptikSDK;
        signupCallback = HaptikSDK$d.c;
    }

    private HaptikSDK() {
    }

    public static final /* synthetic */ void access$downloadBundleAndSetInitializedStatus(HaptikSDK haptikSDK, String string2, String string3, String string4) {
        haptikSDK.downloadBundleAndSetInitializedStatus(string2, string3, string4);
    }

    public static final /* synthetic */ JSONObject access$getInitData$p() {
        return initData;
    }

    public static /* synthetic */ void changeLanguage$default(HaptikSDK haptikSDK, Context context, String string2, boolean bl2, int n3, Object object) {
        if ((n3 &= 4) != 0) {
            bl2 = false;
        }
        haptikSDK.changeLanguage(context, string2, bl2);
    }

    private final void checkAndSetSignupData(SignupData object) {
        String string2 = ((SignupData)object).getSignupType();
        boolean bl2 = b.k(string2);
        if (!(bl2 || (bl2 = b.k(string2 = ((SignupData)object).getAuthCode())) || (bl2 = b.k(string2 = ((SignupData)object).getAuthId())))) {
            signupData = ((SignupData)object).getJsonObject$sdk_release();
            string2 = initData;
            object = ((SignupData)object).getSignupType();
            string2.put("signup-type", object);
            return;
        }
        object = new Exception("Haptik SDK - Required data missing in signupData object");
        throw object;
    }

    private final void downloadBundleAndSetInitializedStatus(String string2, String string3, String string4) {
        this.prepareInitSettings(string2, string3, string4);
        initialized = true;
    }

    private final void downloadCustomCSSFile(String string2, long l2, String object, String object2, String string3) {
        Object object3 = context;
        Intrinsics.checkNotNull(object3);
        String string4 = object3.getFilesDir().getPath();
        object3 = "context!!.filesDir.path";
        Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
        HaptikSDK$a haptikSDK$a = new HaptikSDK$a((String)object, (String)object2, string3, string2);
        Intrinsics.checkNotNullParameter(string2, "customCSSFileURL");
        Intrinsics.checkNotNullParameter(string4, "filePath");
        object = "callback";
        Intrinsics.checkNotNullParameter(haptikSDK$a, (String)object);
        int n3 = string2.length();
        if (n3 == 0) {
            object2 = null;
            string3 = "Custom CSS URL was empty";
            object = new Response(false, string3);
            haptikSDK$a.invoke(object);
        }
        object2 = new yj3_1(l2, string2, string4, haptikSDK$a);
        object = new Thread((Runnable)object2);
        ((Thread)object).start();
    }

    public static /* synthetic */ void init$default(HaptikSDK haptikSDK, Context context, InitData initData, Function1 function1, int n3, Object object) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            initData = new InitData();
        }
        if ((n3 &= 4) != 0) {
            function1 = null;
        }
        haptikSDK.init(context, initData, function1);
    }

    public static /* synthetic */ void loadConversation$default(HaptikSDK haptikSDK, SignupData signupData, Function1 function1, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            function1 = HaptikSDK$b.c;
        }
        haptikSDK.loadConversation(signupData, function1);
    }

    public static /* synthetic */ void loadGuestConversation$default(HaptikSDK haptikSDK, Function1 function1, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            function1 = HaptikSDK$c.c;
        }
        haptikSDK.loadGuestConversation(function1);
    }

    private final void prepareInitSettings(String string2, String string3, String string4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("wrapper-version", (Object)"1.12.3");
        String string5 = INSTANCE.getSystemDetail$sdk_release();
        String string6 = "device-details";
        jSONObject.put(string6, (Object)string5);
        string5 = yl0.a;
        if (string5 != null) {
            string5 = string5.getString("bundle_version_number", "");
            Intrinsics.checkNotNull(string5);
            Intrinsics.checkNotNullExpressionValue(string5, "helper.getString(BUNDLE_VERSION, \"\")!!");
            jSONObject.put("web-sdk-version", (Object)string5);
            string5 = initData;
            string5.put("mode", (Object)"fsm");
            string5.put("wrapper-platform-type", (Object)"android");
            string5.put("client-id", (Object)string2);
            string5.put("base-url", (Object)string4);
            string5.put("business-id", (Object)string3);
            string2 = jSONObject.toString();
            string5.put("wrapper-details", (Object)string2);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helper");
        throw null;
    }

    public static /* synthetic */ void setLaunchMessage$default(HaptikSDK haptikSDK, String string2, boolean bl2, boolean bl3, boolean bl4, int n3, Object object) {
        int n4 = n3 & 2;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n4 = n3 & 4) != 0) {
            bl3 = false;
        }
        if ((n3 &= 8) != 0) {
            bl4 = false;
        }
        haptikSDK.setLaunchMessage(string2, bl2, bl3, bl4);
    }

    public final void changeLanguage(Context object, String string2, boolean bl2) {
        block4: {
            block3: {
                hk3_2 hk3_22;
                boolean bl3;
                String string3;
                String string4;
                block2: {
                    string4 = "context";
                    Intrinsics.checkNotNullParameter(object, string4);
                    string3 = "languageCode";
                    Intrinsics.checkNotNullParameter(string2, string3);
                    bl3 = initialized;
                    if (!bl3 || (hk3_22 = view) == null) break block2;
                    Intrinsics.checkNotNull(hk3_22);
                    hk3_22 = (HaptikWebView)hk3_22;
                    object = new C31((HaptikWebView)hk3_22, string2, bl2);
                    hk3_22.runOnUiThread((Runnable)object);
                    break block3;
                }
                Intrinsics.checkNotNullParameter(object, string4);
                bl3 = false;
                hk3_22 = null;
                object = object.getSharedPreferences("haptikWrapperPreferences", 0);
                string4 = "context.getSharedPreferences(\"haptikWrapperPreferences\", Context.MODE_PRIVATE)";
                Intrinsics.checkNotNullExpressionValue(object, string4);
                yl0.a = object;
                Intrinsics.checkNotNullParameter(string2, string3);
                object = yl0.a;
                if (object == null) break block4;
                object = object.edit();
                string4 = "language_code";
                object.putString(string4, string2);
                object.putBoolean("language_sync_hidden", bl2);
                string2 = "language_sync_pending";
                bl2 = true;
                object.putBoolean(string2, bl2);
                object.apply();
            }
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helper");
        throw null;
    }

    public final void clearLaunchMessage$sdk_release() {
        launchMessageData = null;
    }

    public final void closeConversation() {
        hk3_2 hk3_22 = view;
        if (hk3_22 != null) {
            hk3_22 = (HaptikWebView)hk3_22;
            int n3 = 1;
            V7 v7 = new V7((AppCompatActivity)((Object)hk3_22), n3);
            hk3_22.runOnUiThread(v7);
        }
    }

    public final void destroy() {
        JSONObject jSONObject;
        this.closeConversation();
        context = null;
        initialized = false;
        initData = jSONObject = new JSONObject();
        signupData = jSONObject = new JSONObject();
        view = null;
    }

    public final void fireSignupCallback$sdk_release(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        signupCallback.invoke(response);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String getFormattedNotificationText(Map object, Context object2) {
        void var2_5;
        Intrinsics.checkNotNullParameter(object, "data");
        Intrinsics.checkNotNullParameter(object2, "context");
        Object object3 = view;
        if (object3 != null) {
            Intrinsics.checkNotNull(object3);
            object3 = (HaptikWebView)object3;
            boolean bl2 = ((HaptikWebView)object3).s0;
            if (bl2) {
                return "";
            }
        }
        int n3 = R$string.haptik_default_notification_text;
        String string2 = object2.getString(n3);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.haptik_default_notification_text)");
        object3 = object.get("type");
        String string3 = "message_payload";
        boolean bl3 = Intrinsics.areEqual(object3, string3);
        if (!bl3) return var2_5;
        try {
            string3 = "chat_obj";
            object = object.get(string3);
            object = (String)object;
            object3 = new JSONObject((String)object);
            object = "body";
            object = object3.getString((String)object);
            object3 = "chatBody";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            char c2 = '{';
            boolean bl4 = StringsKt.d0((CharSequence)object, c2);
            if (bl4) {
                object3 = new JSONObject((String)object);
                object = "text";
                object = object3.getString((String)object);
                object3 = "{\n                    // if notification message is a HSL then parse text field\n                    JSONObject(chatBody).getString(\"text\")\n                }";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            }
            Object object4 = object;
            return var2_5;
        }
        catch (Exception exception) {
            return var2_5;
        }
    }

    public final JSONObject getInitSettings$sdk_release() {
        return initData;
    }

    public final JSONObject getLaunchMessageData$sdk_release() {
        return launchMessageData;
    }

    public final JSONObject getSignupData$sdk_release() {
        return signupData;
    }

    public final String getSystemDetail$sdk_release() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = Build.BRAND;
        stringBuilder.append(string2);
        char c2 = '_';
        stringBuilder.append(c2);
        String string3 = Build.MODEL;
        stringBuilder.append((Object)string3);
        stringBuilder.append(c2);
        string2 = Build.VERSION.RELEASE;
        stringBuilder.append((Object)string2);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void handleNotification(Context object, Map object2, int n3) {
        Object object3;
        Object object4;
        Object object5 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        Object object6 = "data";
        Intrinsics.checkNotNullParameter(object2, (String)object6);
        object2 = this.getFormattedNotificationText((Map)object2, (Context)object);
        Intrinsics.checkNotNullParameter(object, (String)object5);
        object5 = "text";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        int n4 = b.k((CharSequence)object2);
        if (n4 != 0) {
            return;
        }
        n4 = Build.VERSION.SDK_INT;
        object6 = "ChatNotification";
        int n7 = 26;
        if (n4 >= n7) {
            object4 = y31.a();
            w31.a((NotificationChannel)object4);
            object3 = object.getSystemService("notification");
            if (object3 == null) {
                object = new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                throw object;
            }
            object3 = (NotificationManager)object3;
            x31.a((NotificationManager)object3, (NotificationChannel)object4);
        }
        object3 = HaptikWebView.class;
        object4 = new Intent((Context)object, object3);
        Object object7 = new Ui3((Context)object);
        Intrinsics.checkNotNullExpressionValue(object7, "create(context)");
        int n8 = 0x20000000;
        object4.setFlags(n8);
        Context context = ((Ui3)object7).b;
        ComponentName componentName = new ComponentName(context, (Class)object3);
        ((Ui3)object7).a(componentName);
        object3 = ((Ui3)object7).a;
        ((ArrayList)object3).add(object4);
        object4 = new J42((Context)object, (String)object6);
        int n10 = R$string.haptik_notification_title;
        object6 = J42.b(object.getString(n10));
        ((J42)object4).e = object6;
        object6 = "taskStackBuilder";
        Intrinsics.checkNotNullParameter(object7, (String)object6);
        n10 = 23;
        n4 = n4 >= n10 ? 0xC000000 : 0x8000000;
        object5 = ((Ui3)object7).c(n4);
        ((J42)object4).g = object5;
        ((J42)object4).f = object2 = J42.b((CharSequence)object2);
        ((J42)object4).P.icon = n3;
        n3 = 1;
        ((J42)object4).d(16, n3 != 0);
        object2 = null;
        ((J42)object4).l = 0;
        Intrinsics.checkNotNullExpressionValue(object4, "Builder(context, \"ChatNotification\")\n        .setContentTitle(context.getString(R.string.haptik_notification_title))\n        .setContentIntent(getPendingIntent(taskStackBuilder))\n        .setContentText(text)\n        .setSmallIcon(icon)\n        .setAutoCancel(true)\n        .setPriority(NotificationCompat.PRIORITY_DEFAULT)");
        s52 s522 = new s52((Context)object);
        object5 = ((J42)object4).a();
        object6 = ((Notification)object5).extras;
        s522 = s522.b;
        n7 = 101010;
        object3 = null;
        if (object6 != null && (n10 = (int)(object6.getBoolean((String)(object7 = "android.support.useSideChannel")) ? 1 : 0)) != 0) {
            object7 = object.getPackageName();
            object6 = new s52$b((String)object7, (Notification)object5);
            object7 = s52.f;
            // MONITORENTER : object7
            object5 = s52.g;
            if (object5 == null) {
                object = object.getApplicationContext();
                s52.g = object5 = new s52$d((Context)object);
            }
            object = s52.g;
            object = ((s52$d)object).b;
            object = object.obtainMessage(0, object6);
            object.sendToTarget();
            // MONITOREXIT : object7
            s522.cancel(null, n7);
            return;
        }
        s522.notify(null, n7, (Notification)object5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void init(Context object, InitData object2, Function1 object3) {
        int n3;
        int n4;
        String string2;
        Object object4;
        Intrinsics.checkNotNullParameter(object, "applicationContext");
        String string3 = "initData";
        Intrinsics.checkNotNullParameter(object4, string3);
        boolean bl2 = initialized;
        if (bl2) {
            return;
        }
        sdkEventCallback = string2;
        handleLink = n4 = ((InitData)object4).getHandleLink();
        object4 = ((InitData)object4).getJsonObject$sdk_release();
        initData = object4;
        string3 = "";
        object4 = object4.optString("base-url", string3);
        string2 = initData.optString("client-id", string3);
        String string4 = initData.optString("business-id", string3);
        String string5 = "context!!.getString(string)";
        if (string2 == null || (n3 = string2.length()) == 0) {
            n4 = R$string.haptik_client_id;
            Intrinsics.checkNotNull(object);
            string2 = object.getString(n4);
            Intrinsics.checkNotNullExpressionValue(string2, string5);
        }
        String string6 = string2;
        if (string4 == null || (n4 = string4.length()) == 0) {
            n4 = R$string.haptik_business_id;
            Intrinsics.checkNotNull(object);
            string4 = object.getString(n4);
            Intrinsics.checkNotNullExpressionValue(string4, string5);
        }
        String string7 = string4;
        if (object4 == null || (n4 = ((String)object4).length()) == 0) {
            int n7 = R$string.haptik_base_url;
            Intrinsics.checkNotNull(object);
            object4 = object.getString(n7);
            Intrinsics.checkNotNullExpressionValue(object4, string5);
        }
        Object object5 = object4;
        object4 = "clientId";
        Intrinsics.checkNotNullExpressionValue(string6, (String)object4);
        n4 = string6.length();
        if (n4 != 0) {
            string2 = "businessId";
            Intrinsics.checkNotNullExpressionValue(string7, string2);
            int n8 = string7.length();
            if (n8 != 0) {
                string4 = "baseUrl";
                Intrinsics.checkNotNullExpressionValue(object5, string4);
                int n10 = ((String)object5).length();
                if (n10 != 0) {
                    int n14;
                    int n15;
                    context = object;
                    Intrinsics.checkNotNullParameter(object, "context");
                    n3 = 0;
                    SharedPreferences sharedPreferences2 = object.getSharedPreferences("haptikWrapperPreferences", 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPreferences(\"haptikWrapperPreferences\", Context.MODE_PRIVATE)");
                    yl0.a = sharedPreferences2;
                    JSONObject jSONObject = initData;
                    string5 = "custom-css";
                    String string8 = jSONObject.optString(string5, string3);
                    long l2 = initData.optLong("custom-css-ttl", 1440L);
                    JSONObject jSONObject2 = initData;
                    string3 = "locally-download-custom-css";
                    int n16 = jSONObject2.optBoolean(string3, false);
                    int n17 = 1;
                    if (string8 == null || (n10 = (int)(b.k(string8) ? 1 : 0)) != 0) {
                        n3 = 1;
                    }
                    if ((n15 = n16 & (n14 = n17 ^ n3)) != 0) {
                        String string9 = "customCSSUrl";
                        Intrinsics.checkNotNullExpressionValue(string8, string9);
                        Intrinsics.checkNotNullExpressionValue(string6, (String)object4);
                        Intrinsics.checkNotNullExpressionValue(string7, string2);
                        Intrinsics.checkNotNullExpressionValue(object5, string4);
                        this.downloadCustomCSSFile(string8, l2, string6, string7, (String)object5);
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(string6, (String)object4);
                    Intrinsics.checkNotNullExpressionValue(string7, string2);
                    Intrinsics.checkNotNullExpressionValue(object5, string4);
                    this.downloadBundleAndSetInitializedStatus(string6, string7, (String)object5);
                    return;
                }
            }
        }
        Exception exception = new Exception("Haptik SDK - Required data missing in strings.xml");
        throw exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isActive() {
        hk3_2 hk3_22 = view;
        if (hk3_22 == null) return false;
        Intrinsics.checkNotNull(hk3_22);
        hk3_22 = (HaptikWebView)hk3_22;
        boolean bl2 = ((HaptikWebView)hk3_22).s0;
        if (!bl2) return false;
        return true;
    }

    public final boolean isHandleLink$sdk_release() {
        return handleLink;
    }

    public final boolean isHaptikNotification(Map map2) {
        if (map2 != null) {
            boolean bl2;
            String string2;
            boolean bl3 = map2.isEmpty();
            boolean bl4 = true;
            if ((bl3 ^= bl4) && ((bl3 = map2.containsKey(string2 = "push_id")) || (bl2 = map2.containsKey(string2 = "fromHaptik")))) {
                return bl4;
            }
        }
        return false;
    }

    public final boolean isSdkEventAvailable$sdk_release() {
        boolean bl2;
        Function1 function1 = sdkEventCallback;
        if (function1 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            function1 = null;
        }
        return bl2;
    }

    public final void loadConversation(SignupData object, Function1 function1) {
        Intrinsics.checkNotNullParameter(object, "signupData");
        String string2 = "callback";
        Intrinsics.checkNotNullParameter(function1, string2);
        boolean bl2 = initialized;
        if (bl2) {
            this.checkAndSetSignupData((SignupData)object);
            this.loadGuestConversation(function1);
        } else {
            Response.Companion.getClass();
            string2 = Response.access$getSDK_NOT_INITIALIZED$cp();
            object = new Response(false, string2);
            function1.invoke(object);
        }
    }

    public final void loadGuestConversation(Function1 function1) {
        Object object = "callback";
        Intrinsics.checkNotNullParameter(function1, (String)object);
        boolean bl2 = initialized;
        if (bl2) {
            Context context = HaptikSDK.context;
            Class<HaptikWebView> clazz = HaptikWebView.class;
            object = new Intent(context, clazz);
            int n3 = 0x10000000;
            object.setFlags(n3);
            context = HaptikSDK.context;
            if (context != null) {
                context.startActivity((Intent)object);
            }
            signupCallback = function1;
        } else {
            Response.Companion.getClass();
            String string2 = Response.access$getSDK_NOT_INITIALIZED$cp();
            Object var5_7 = null;
            object = new Response(false, string2);
            function1.invoke(object);
        }
    }

    public final void logout(Context context) {
        Object object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        Intrinsics.checkNotNullParameter(context, (String)object);
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("haptikWrapperPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPreferences(\"haptikWrapperPreferences\", Context.MODE_PRIVATE)");
        yl0.a = sharedPreferences2;
        if (sharedPreferences2 != null) {
            sharedPreferences2 = sharedPreferences2.edit();
            sharedPreferences2.putBoolean("logout_pending", true);
            sharedPreferences2.apply();
            Intrinsics.checkNotNullParameter(context, (String)object);
            object = new s52(context);
            ((s52)object).b.cancel(null, 101010);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helper");
        throw null;
    }

    public final void sendSdkEvent$sdk_release(String string2) {
        Intrinsics.checkNotNullParameter(string2, "data");
        Function1 function1 = sdkEventCallback;
        if (function1 != null) {
            Intrinsics.checkNotNull(function1);
            function1.invoke(string2);
        }
    }

    public final void setLaunchMessage(String string2, boolean bl2, boolean bl3, boolean bl4) {
        String string3 = "message";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl5 = initialized;
        if (bl5) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(string3, (Object)string2);
            jSONObject.put("hidden", bl2);
            jSONObject.put("skipMessage", bl3);
            string2 = "hideWelcomeMessage";
            jSONObject.put(string2, bl4);
            launchMessageData = jSONObject;
        }
    }

    public final void setNotificationToken(Context context, String string2) {
        String string3 = "context";
        Intrinsics.checkNotNullParameter(context, string3);
        Intrinsics.checkNotNullParameter(string2, "token");
        Intrinsics.checkNotNullParameter(context, string3);
        context = context.getSharedPreferences("haptikWrapperPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(context, "context.getSharedPreferences(\"haptikWrapperPreferences\", Context.MODE_PRIVATE)");
        yl0.a = context;
        Intrinsics.checkNotNullParameter(string2, "value");
        context = yl0.a;
        string3 = null;
        String string4 = "helper";
        if (context != null) {
            context = context.edit();
            String string5 = "fcm_token";
            context.putString(string5, string2);
            context.apply();
            context = yl0.a;
            if (context != null) {
                context = context.edit();
                context.putBoolean("fcm_token_sync_required", true);
                context.apply();
                return;
            }
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException(string4);
        throw null;
    }

    public final void setSignupData$sdk_release(SignupData signupData) {
        String string2 = "signupData";
        Intrinsics.checkNotNullParameter(signupData, string2);
        boolean bl2 = initialized;
        if (bl2) {
            this.checkAndSetSignupData(signupData);
        }
    }

    public final void setWebView$sdk_release(hk3_2 hk3_22) {
        view = hk3_22;
    }

    public final void syncAuthToken(String string2) {
        hk3_2 hk3_22;
        Object object = "token";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        boolean bl2 = initialized;
        if (bl2 && (hk3_22 = view) != null) {
            hk3_22 = (HaptikWebView)hk3_22;
            Intrinsics.checkNotNullParameter(string2, (String)object);
            object = new z31((HaptikWebView)hk3_22, string2);
            hk3_22.runOnUiThread((Runnable)object);
        }
    }

    public final void updateUserData(JSONObject jSONObject) {
        hk3_2 hk3_22;
        Object object = "userData";
        Intrinsics.checkNotNullParameter(jSONObject, (String)object);
        boolean bl2 = initialized;
        if (bl2 && (hk3_22 = view) != null) {
            hk3_22 = (HaptikWebView)hk3_22;
            Intrinsics.checkNotNullParameter(jSONObject, (String)object);
            object = new A31((HaptikWebView)hk3_22, jSONObject);
            hk3_22.runOnUiThread((Runnable)object);
        }
    }
}

