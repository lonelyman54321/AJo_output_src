/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.view.ViewGroup
 *  android.view.WindowManager$LayoutParams
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R$bool;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.PrefetchServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.data.JuspayResponseHandlerDummyImpl;
import in.juspay.hypersdk.services.SdkConfigService;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.LogType;
import in.juspay.hypersdk.utils.TrackerFallback;
import in.juspay.hypersdk.utils.network.NetUtils;
import in.juspay.services.HyperServices$2;
import in.juspay.services.HyperServices$3;
import in.juspay.services.HyperServices$HyperExceptionHandler;
import in.juspay.services.SDKState;
import in.juspay.services.TenantParams;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public class HyperServices {
    private static final String LOG_TAG = "HyperServices";
    private static final String REQUEST_ID = "requestId";
    protected FragmentActivity activity;
    private final HashMap activityIds;
    protected ViewGroup container;
    private final Context context;
    private String currentActivityId;
    private HyperServices$HyperExceptionHandler hyperExceptionHandler;
    protected boolean jpConsumingBackPress;
    private final JuspayServices juspayServices;
    protected HyperPaymentsCallback merchantCallback;
    private final W72 onBackPressedCallback;
    private final Set onBackPressedCallbackSet;
    private final Queue processWaitingQueue;
    private final AtomicReference sdkStateReference;
    private final TrackerFallback trackerFallBack;

    public HyperServices(Activity object) {
        Object object2 = new LinkedList();
        this.processWaitingQueue = object2;
        this.onBackPressedCallbackSet = object2 = Collections.newSetFromMap(object2);
        if (object != null) {
            object = object.getClass().getName();
            object2 = " (";
            String string2 = ")";
            object = cP.a((String)object2, (String)object, string2);
        } else {
            object = "";
        }
        object = cP.a("Instantiating HyperServices with plain Activity", (String)object, " is not allowed, please pass FragmentActivity");
        object2 = new InstantiationException((String)object);
        throw object2;
    }

    public HyperServices(Context context) {
        this(context, null, null);
    }

    public HyperServices(Context object, TenantParams object2, String string2) {
        JuspayServices juspayServices;
        HashMap hashMap = new HashMap();
        this.processWaitingQueue = hashMap;
        hashMap = Collections.newSetFromMap(hashMap);
        this.onBackPressedCallbackSet = hashMap;
        this.context = object;
        JuspayCoreLib.setApplicationContext(object.getApplicationContext());
        NetUtils.setApplicationHeaders(object);
        this.activityIds = hashMap = new HashMap();
        this.jpConsumingBackPress = false;
        this.juspayServices = juspayServices = new JuspayServices((Context)object, (TenantParams)object2, string2, false);
        super(this);
        this.hyperExceptionHandler = object;
        object2 = SDKState.INSTANTIATED;
        super(object2);
        this.sdkStateReference = object;
        object2 = juspayServices.getSdkConfigService().getSdkConfig();
        super((JSONObject)object2);
        this.trackerFallBack = object;
        super(this, false);
        this.onBackPressedCallback = object;
    }

    public HyperServices(Context context, String string2) {
        this(context, null, string2);
    }

    public HyperServices(FragmentActivity fragmentActivity) {
        Object object = (ViewGroup)fragmentActivity.getWindow().getDecorView().findViewById(0x1020002);
        this(fragmentActivity, (ViewGroup)object, null);
        object = this.juspayServices.getSdkTracker();
        Boolean bl2 = Boolean.FALSE;
        ((SdkTracker)object).trackLifecycle("hypersdk", "info", "hyper_service", "view_group", bl2);
    }

    public HyperServices(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        this(fragmentActivity, viewGroup, null);
    }

    public HyperServices(FragmentActivity object, ViewGroup viewGroup, TenantParams tenantParams, String string2) {
        Context context = object.getApplicationContext();
        this(context, tenantParams, string2);
        this.activity = object;
        this.container = viewGroup;
        this.currentActivityId = object = this.getIdForActivity((FragmentActivity)object);
        this.juspayServices.getSdkTracker().trackLifecycle("hypersdk", "info", "hyper_service", "sdk_create", "success");
    }

    public HyperServices(FragmentActivity fragmentActivity, ViewGroup viewGroup, String string2) {
        this(fragmentActivity, viewGroup, null, string2);
    }

    public HyperServices(FragmentActivity fragmentActivity, String string2) {
        Object object = (ViewGroup)fragmentActivity.getWindow().getDecorView().findViewById(0x1020002);
        this(fragmentActivity, (ViewGroup)object, string2);
        object = this.juspayServices.getSdkTracker();
        Boolean bl2 = Boolean.FALSE;
        ((SdkTracker)object).trackLifecycle("hypersdk", "info", "hyper_service", "view_group", bl2);
    }

    public static /* synthetic */ void a(HyperServices hyperServices, long l2, JSONObject jSONObject) {
        hyperServices.lambda$doProcess$7(l2, jSONObject);
    }

    public static /* synthetic */ JuspayServices access$000(HyperServices hyperServices) {
        return hyperServices.juspayServices;
    }

    public static /* synthetic */ void access$100(HyperServices hyperServices, Throwable throwable) {
        hyperServices.uncaughtException(throwable);
    }

    public static /* synthetic */ void b(HyperServices hyperServices) {
        hyperServices.lambda$runProcessWaitQueue$4();
    }

    public static /* synthetic */ void c(HyperServices hyperServices, FragmentActivity fragmentActivity, ViewGroup viewGroup, JSONObject jSONObject) {
        hyperServices.lambda$process$5(fragmentActivity, viewGroup, jSONObject);
    }

    public static /* synthetic */ void d(HyperServices hyperServices, Throwable throwable) {
        hyperServices.lambda$uncaughtException$9(throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void doProcess(JSONObject object) {
        Object object2;
        String string2;
        Object object3;
        block8: {
            int n3;
            Object object4;
            object3 = "payload";
            string2 = "process";
            object2 = "info";
            Object object5 = "started";
            try {
                this.logSafeEvents((String)object2, string2, (String)object5, object);
                object2 = this.trackerFallBack;
                object5 = this.juspayServices;
                object4 = LogType.PROCESS_START;
                ((TrackerFallback)object2).log((JSONObject)object, (JuspayServices)object5, (LogType)((Object)object4));
                object2 = object.getJSONObject((String)object3);
                object5 = "merchant_root_view";
                object4 = this.container;
                n3 = -1;
                if (object4 != null) {
                    int n4 = object4.getId();
                    object4 = String.valueOf(n4);
                } else {
                    object4 = n3;
                }
            }
            catch (JSONException jSONException) {
                break block8;
            }
            object2.put((String)object5, object4);
            object5 = "merchant_keyboard_mode";
            object4 = this.activity;
            if (object4 != null) {
                object4 = object4.getWindow();
                object4 = object4.getAttributes();
                n3 = ((WindowManager.LayoutParams)object4).softInputMode;
            }
            object2.put((String)object5, n3);
            object5 = "processStartedTime";
            long l2 = System.currentTimeMillis();
            object2.put((String)object5, l2);
            object5 = "currentActivityId";
            object4 = this.currentActivityId;
            object2.put((String)object5, object4);
            object.put((String)object3, object2);
            object3 = this.juspayServices;
            ((JuspayServices)object3).setUpMerchantFragments((JSONObject)object2);
        }
        object3 = REQUEST_ID;
        boolean bl2 = object.has((String)object3);
        if (!bl2) {
            object = Boolean.FALSE;
            this.logSafeEvents("error", string2, "request_id_present", object);
            return;
        }
        long l3 = System.currentTimeMillis();
        object2 = new vb1_1(this, l3, (JSONObject)object);
        ExecutorManager.runOnMainThread((Runnable)object2);
    }

    public static /* synthetic */ void e(HyperServices hyperServices) {
        hyperServices.lambda$initiate$2();
    }

    public static /* synthetic */ void f(HyperServices hyperServices) {
        hyperServices.lambda$handleOnEvent$0();
    }

    public static /* synthetic */ void g(HyperServices hyperServices, long l2, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        hyperServices.lambda$initiate$3(l2, jSONObject, hyperPaymentsCallback);
    }

    private String getIdForActivity(FragmentActivity fragmentActivity) {
        Object object;
        Map.Entry entry;
        boolean bl2;
        Object object2 = this.activityIds.entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            entry = object2.next();
            object = (FragmentActivity)((WeakReference)entry.getKey()).get();
            if (object != fragmentActivity) continue;
            return (String)entry.getValue();
        }
        object2 = UUID.randomUUID().toString();
        entry = this.activityIds;
        object = new WeakReference(fragmentActivity);
        ((HashMap)((Object)entry)).put(object, object2);
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static JSONObject getVersions(Context object) {
        String string2;
        JSONObject jSONObject = new JSONObject();
        String string3 = "sdkVersion";
        try {
            string2 = IntegrationUtils.getSdkVersion(object);
        }
        catch (JSONException jSONException) {
            return jSONObject;
        }
        jSONObject.put(string3, (Object)string2);
        return jSONObject;
    }

    public static /* synthetic */ void h(HyperServices hyperServices, long l2) {
        hyperServices.lambda$terminate$8(l2);
    }

    public static /* synthetic */ void i(HyperServices hyperServices, JSONObject jSONObject) {
        hyperServices.lambda$setupJuspayServices$1(jSONObject);
    }

    private void initiateNotCalled() {
        IllegalStateException illegalStateException = new IllegalStateException("initiate() must be called before calling process()");
        throw illegalStateException;
    }

    private void initiateTerminated(JSONObject jSONObject) {
        String string2 = "process() called after terminate()";
        this.notifyMerchant("JP_017", string2, "process_result", jSONObject);
        this.logSafeEvents("error", "process", "interrupted", string2);
    }

    public static /* synthetic */ void j(HyperServices hyperServices, FragmentActivity fragmentActivity) {
        hyperServices.lambda$process$6(fragmentActivity);
    }

    private /* synthetic */ void lambda$doProcess$7(long l2, JSONObject jSONObject) {
        long l3 = System.currentTimeMillis();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        Long l4 = l3 - l2;
        sdkTracker.trackLifecycle("hypersdk", "debug", "process", "main_thread_handover", l4);
        this.juspayServices.onMerchantEvent("process", jSONObject);
    }

    private /* synthetic */ void lambda$handleOnEvent$0() {
        W72 w72 = this.onBackPressedCallback;
        boolean bl2 = this.jpConsumingBackPress;
        w72.setEnabled(bl2);
    }

    private /* synthetic */ void lambda$initiate$2() {
        HyperServices$HyperExceptionHandler hyperServices$HyperExceptionHandler = this.hyperExceptionHandler;
        if (hyperServices$HyperExceptionHandler == null) {
            this.hyperExceptionHandler = hyperServices$HyperExceptionHandler = new HyperServices$HyperExceptionHandler(this);
        }
        this.hyperExceptionHandler.setAsDefaultExceptionHandler();
    }

    private /* synthetic */ void lambda$initiate$3(long l2, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        long l3 = System.currentTimeMillis();
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        Long l4 = l3 - l2;
        sdkTracker.trackLifecycle("hypersdk", "debug", "initiate", "main_thread_handover", l4);
        this.setupJuspayServices(jSONObject, hyperPaymentsCallback);
    }

    private /* synthetic */ void lambda$process$5(FragmentActivity fragmentActivity, ViewGroup viewGroup, JSONObject jSONObject) {
        this.process(fragmentActivity, viewGroup, jSONObject);
    }

    private void lambda$process$6(FragmentActivity object) {
        object = ((ComponentActivity)object).getOnBackPressedDispatcher();
        Object object2 = this.onBackPressedCallback;
        object.getClass();
        String string2 = "onBackPressedCallback";
        Intrinsics.checkNotNullParameter(object2, string2);
        try {
            ((d82_0)object).b((W72)object2);
        }
        catch (Exception exception) {
            object2 = "Exception while adding onBackPressedCallback";
            string2 = "hypersdk";
            String string3 = "on_back_pressed_callback";
            this.logSafeExceptions(string2, string3, (String)object2, exception);
        }
    }

    private /* synthetic */ void lambda$runProcessWaitQueue$4() {
        int n3 = this.processWaitingQueue.size();
        Object object = n3;
        String string2 = "process_wait_queue";
        String string3 = "pending_processes";
        String string4 = "info";
        this.logSafeEvents(string4, string2, string3, object);
        while ((n3 = (int)((object = this.processWaitingQueue).isEmpty() ? 1 : 0)) == 0) {
            object = (Runnable)this.processWaitingQueue.poll();
            if (object == null) continue;
            object.run();
        }
    }

    private /* synthetic */ void lambda$setupJuspayServices$1(JSONObject jSONObject) {
        AtomicReference atomicReference = this.sdkStateReference;
        SDKState sDKState = SDKState.INITIATE_COMPLETED;
        atomicReference.set(sDKState);
        this.notifyMerchant("JP_020", "No web view is present in the device", "initiate_result", jSONObject);
    }

    private /* synthetic */ void lambda$terminate$8(long l2) {
        long l3 = System.currentTimeMillis();
        Object object = this.juspayServices;
        Object object2 = ((JuspayServices)object).getSdkTracker();
        Long l4 = l3 -= l2;
        String string2 = "terminate";
        String string3 = "main_thread_handover";
        String string4 = "hypersdk";
        String string5 = "debug";
        ((SdkTracker)object2).trackLifecycle(string4, string5, string2, string3, l4);
        JuspayServices juspayServices = this.juspayServices;
        try {
            juspayServices.terminate();
        }
        catch (Exception exception) {
            juspayServices = this.juspayServices;
            SdkTracker sdkTracker = juspayServices.getSdkTracker();
            string4 = "terminate";
            string5 = "Failed to remove the fragment";
            String string6 = LOG_TAG;
            object = "lifecycle";
            object2 = "hypersdk";
            sdkTracker.trackAndLogException(string6, (String)object, (String)object2, string4, string5, exception);
        }
        this.container = null;
        this.activity = null;
    }

    private /* synthetic */ void lambda$uncaughtException$9(Throwable throwable) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        throwable = sdkTracker.getExceptionLog("lifecycle", "hypersdk", "sdk_crashed", "SDK Crashed Uncaught exception handler", throwable);
        sdkTracker.addLogToPersistedQueue((JSONObject)throwable);
    }

    private void logSafeEvents(String string2, String string3, String string4, Object object) {
        this.juspayServices.getSdkTracker().trackLifecycle("hypersdk", string2, string3, string4, object);
    }

    private void logSafeExceptions(String string2, String string3, String string4, Throwable throwable) {
        this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, "lifecycle", string2, string3, string4, throwable);
    }

    private JSONObject notifyMerchant(HyperPaymentsCallback hyperPaymentsCallback, String object, String string2, String string3, JSONObject object2) {
        String string4 = REQUEST_ID;
        String string5 = "service";
        JSONObject jSONObject = new JSONObject();
        String string6 = "";
        string6 = object2.optString(string4, string6);
        jSONObject.put(string4, (Object)string6);
        object2 = object2.optString(string5, string5);
        jSONObject.put(string5, object2);
        object2 = "error";
        boolean bl2 = true;
        jSONObject.put((String)object2, bl2);
        object2 = "errorCode";
        jSONObject.put((String)object2, object);
        object = "errorMessage";
        jSONObject.put((String)object, (Object)string2);
        object = "event";
        jSONObject.put((String)object, (Object)string3);
        object = "payload";
        string2 = new JSONObject();
        jSONObject.put((String)object, (Object)string2);
        object = new JuspayResponseHandlerDummyImpl();
        try {
            hyperPaymentsCallback.onEvent(jSONObject, (JuspayResponseHandler)object);
        }
        catch (Exception exception) {
            String string7 = "exit_sdk_error";
            String string8 = "Error while sending response to merchant";
            string6 = LOG_TAG;
            String string9 = "action";
            String string10 = "system";
            SdkTracker.trackAndLogBootException(string6, string9, string10, string7, string8, exception);
        }
        return jSONObject;
    }

    private void notifyMerchant(String string2, String string3, String string4, JSONObject object) {
        HyperPaymentsCallback hyperPaymentsCallback = this.merchantCallback;
        if (hyperPaymentsCallback != null) {
            string2 = this.notifyMerchant(hyperPaymentsCallback, string2, string3, string4, (JSONObject)object);
            string3 = "initiate_result";
            boolean bl2 = string4.equals(string3);
            string3 = bl2 ? "initiate" : "process";
            string4 = "error";
            object = "ended";
            this.logSafeEvents(string4, string3, (String)object, string2);
        }
    }

    private boolean objectMatch(Object object, Object object2) {
        int n3 = 0;
        Class<?> clazz = null;
        boolean bl2 = Objects.equals(object, null);
        boolean bl3 = false;
        if (!bl2 && (n3 = Objects.equals(object2, null)) == 0) {
            Class<?> clazz2;
            clazz = object.getClass();
            n3 = clazz.equals(clazz2 = object2.getClass());
            if (n3 == 0) {
                return false;
            }
            n3 = object2 instanceof JSONObject;
            bl2 = true;
            if (n3 != 0) {
                boolean bl4;
                n3 = (object2 = (JSONObject)object2).length();
                if (n3 == 0) {
                    return false;
                }
                object = (JSONObject)object;
                clazz = object2.keys();
                while (bl4 = clazz.hasNext()) {
                    Object object3 = (String)clazz.next();
                    Object object4 = object.opt((String)object3);
                    bl4 = this.objectMatch(object4, object3 = object2.opt((String)object3));
                    if (bl4) continue;
                    return false;
                }
                return bl2;
            }
            n3 = object2 instanceof String;
            if (n3 != 0) {
                return object2.equals(object);
            }
            if (object == object2) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public static void preFetch(Context context, JSONObject jSONObject) {
        String string2 = "clientId";
        boolean bl2 = jSONObject.has(string2);
        String string3 = null;
        if (bl2) {
            string3 = jSONObject.optString(string2, null);
        }
        PrefetchServices.preFetch(context, jSONObject, string3);
    }

    public static void preFetch(Context context, JSONObject jSONObject, String string2) {
        PrefetchServices.preFetch(context, jSONObject, string2);
    }

    private void runProcessWaitQueue() {
        ec1_2 ec1_22 = new ec1_2(this, 0);
        ExecutorManager.runOnBackgroundThread(ec1_22);
    }

    private void setupJuspayServices(JSONObject jSONObject, HyperPaymentsCallback object) {
        this.merchantCallback = object;
        this.modifyParams(jSONObject);
        this.juspayServices.setBundleParameter(jSONObject);
        object = this.juspayServices;
        Object object2 = new HyperServices$2(this);
        ((JuspayServices)object).setHyperCallback((HyperPaymentsCallback)object2);
        object = this.juspayServices;
        object2 = new xb1_1(this, jSONObject);
        ((JuspayServices)object).initiate((Runnable)object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean shouldPushExp(String string2, JSONObject jSONObject) {
        boolean bl2;
        block9: {
            Object object;
            LogManager logManager = this.juspayServices.getLogManager();
            bl2 = logManager.experimentalEnabled();
            if (!bl2) return false;
            bl2 = true;
            try {
                object = this.juspayServices;
            }
            catch (Exception exception) {
                return bl2;
            }
            object = ((JuspayServices)object).getSdkConfigService();
            object = ((SdkConfigService)object).getSdkConfig();
            String string3 = "logsConfig";
            object = object.optJSONObject(string3);
            if (object == null) break block9;
            string3 = "bufferLogsTill";
            string3 = object.optString(string3, string2);
            boolean bl3 = string2.equals(string3);
            if (!bl3) return false;
            bl3 = this.shouldStopBuffer((JSONObject)object, jSONObject);
            if (!bl3) return false;
        }
        return bl2;
    }

    private boolean shouldStopBuffer(JSONObject jSONObject, JSONObject jSONObject2) {
        block8: {
            String string2 = "dontStopBufferOn";
            int n3 = jSONObject.has(string2);
            if (n3 != 0) {
                int n4;
                try {
                    jSONObject = jSONObject.getJSONArray(string2);
                    string2 = null;
                    n3 = 0;
                }
                catch (Exception exception) {}
                while (true) {
                    n4 = jSONObject.length();
                    if (n3 >= n4) break block8;
                    break;
                }
                {
                    Object object = jSONObject.get(n3);
                    n4 = (int)(this.objectMatch(jSONObject2, object) ? 1 : 0);
                    if (n4 != 0) {
                        return false;
                    }
                    ++n3;
                    continue;
                }
            }
        }
        return true;
    }

    private void uncaughtException(Throwable throwable) {
        bc1_2 bc1_22 = new bc1_2(this, throwable);
        ExecutorManager.runOnSdkTrackerPool(bc1_22);
    }

    public boolean checkAndStartInitiate(JSONObject jSONObject) {
        Object object;
        SDKState sDKState;
        SDKState sDKState2 = (SDKState)((Object)this.sdkStateReference.get());
        if (sDKState2 != (sDKState = SDKState.INITIATE_STARTED) && sDKState2 != (object = SDKState.INITIATE_COMPLETED)) {
            this.sdkStateReference.set(sDKState);
            this.juspayServices.getSdkTracker().trackLifecycle("hypersdk", "info", "initiate", "started", "Started initiating the SDK");
            return true;
        }
        object = "initiate() can only be called once without terminate()";
        this.notifyMerchant("JP_017", (String)object, "initiate_result", jSONObject);
        this.logSafeEvents("error", "initiate", "interrupted", object);
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean handleOnEvent(JSONObject var1_1) {
        block19: {
            block14: {
                block15: {
                    block18: {
                        var2_3 = "on_event";
                        var3_4 /* !! */  = "event";
                        var4_5 = "payload";
                        var5_6 = 1;
                        try {
                            block17: {
                                block16: {
                                    var6_7 /* !! */  = var1_1.optJSONObject((String)var4_5);
                                    var7_8 = var1_1.optString((String)var3_4 /* !! */ );
                                    var8_9 = var7_8.hashCode();
                                    var9_10 = -1917311628;
                                    var10_11 = "jp_consuming_backpress";
                                    var11_12 = -1;
                                    if (var8_9 == var9_10) break block16;
                                    var9_10 = 731104317;
                                    if (var8_9 != var9_10 || (var12_13 = (int)var7_8.equals(var10_11)) == 0) ** GOTO lbl-1000
                                    var12_13 = 0;
                                    var7_8 = null;
                                    break block17;
                                }
                                var13_14 /* !! */  = "onJOSReady";
                                var12_13 = var7_8.equals(var13_14 /* !! */ );
                                if (var12_13 != 0) {
                                    var12_13 = 1;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var12_13 = -1;
                                }
                            }
                            if (var12_13 == 0) ** GOTO lbl66
                            if (var12_13 == var5_6) return false;
                            var6_7 /* !! */  = "default";
                        }
lbl29:
                        // 3 sources

                        catch (Exception var1_2) {}
                        var3_4 /* !! */  = var1_1.optString((String)var3_4 /* !! */ , (String)var6_7 /* !! */ );
                        var14_15 = var3_4 /* !! */ .hashCode();
                        var12_13 = 24468461;
                        if (var14_15 != var12_13) {
                            var12_13 = 1858061443;
                            if (var14_15 == var12_13 && (var15_16 = var3_4 /* !! */ .equals(var6_7 /* !! */  = "initiate_result"))) {
                                var11_12 = 1;
                            }
                        } else {
                            var6_7 /* !! */  = "process_result";
                            var15_17 = var3_4 /* !! */ .equals(var6_7 /* !! */ );
                            if (var15_17) {
                                var11_12 = 0;
                                var16_18 = null;
                            }
                        }
                        var3_4 /* !! */  = "ended";
                        var6_7 /* !! */  = "info";
                        if (var11_12 == 0) break block18;
                        if (var11_12 != var5_6) {
                            this.logSafeEvents((String)var6_7 /* !! */ , var2_3, (String)var4_5, var1_1);
                        } else {
                            var4_5 = this.trackerFallBack;
                            var7_8 = this.juspayServices;
                            var13_14 /* !! */  = LogType.INITIATE_RESULT;
                            var4_5.log((JSONObject)var1_1, (JuspayServices)var7_8, (LogType)var13_14 /* !! */ );
                            var4_5 = "initiate";
                            this.logSafeEvents((String)var6_7 /* !! */ , (String)var4_5, (String)var3_4 /* !! */ , var1_1);
                        }
                        ** GOTO lbl79
                    }
                    var4_5 = "process";
                    this.logSafeEvents((String)var6_7 /* !! */ , (String)var4_5, (String)var3_4 /* !! */ , var1_1);
                    var3_4 /* !! */  = this.trackerFallBack;
                    var4_5 = this.juspayServices;
                    var6_7 /* !! */  = LogType.PROCESS_END;
                    var3_4 /* !! */ .log((JSONObject)var1_1, (JuspayServices)var4_5, (LogType)var6_7 /* !! */ );
                    ** GOTO lbl79
                    {
                        catch (Exception v0) {}
lbl66:
                        // 1 sources

                        this.jpConsumingBackPress = var6_7 /* !! */  == null ? var5_6 : (var18_23 = var6_7 /* !! */ .getBoolean(var10_11));
                        var1_1 = this.juspayServices;
                        var6_7 /* !! */  = var1_1.getSdkTracker();
                        var7_8 = "hypersdk";
                        var13_14 /* !! */  = "info";
                        var19_24 = "jp_consuming_backpress";
                        var10_11 = "jp_consuming_backpress";
                        var18_23 = this.jpConsumingBackPress;
                        var16_19 = var18_23;
                        var6_7 /* !! */ .trackLifecycle((String)var7_8, var13_14 /* !! */ , var19_24, var10_11, var16_19);
                        var1_1 = new yb1_1(this);
                        ExecutorManager.runOnMainThread((Runnable)var1_1);
                        return false;
lbl79:
                        // 4 sources

                        var3_4 /* !! */  = "action";
                        var4_5 = "";
                        var3_4 /* !! */  = var1_1.optString((String)var3_4 /* !! */ , (String)var4_5);
                        var4_5 = "OnRenderProcessGone";
                        var17_20 = var3_4 /* !! */ .equals(var4_5);
                        if (!var17_20) break block14;
                        var3_4 /* !! */  = "isRecreating";
                        var18_21 = var1_1.optBoolean((String)var3_4 /* !! */ );
                        if (!var18_21) break block15;
                        var1_1 = this.sdkStateReference;
                        if ((var1_1 = var1_1.get()) == (var3_4 /* !! */  = SDKState.INSTANTIATED)) return false;
                        ** try [egrp 3[TRYBLOCK] [26 : 421->579)] { 
lbl92:
                        // 1 sources

                        var1_1 = this.sdkStateReference;
                        var3_4 /* !! */  = SDKState.INITIATE_STARTED;
                        var1_1.set(var3_4 /* !! */ );
                        return false;
                    }
                    break block19;
                }
                this.terminate();
                return false;
            }
            var1_1 = "DUI_READY";
            var18_22 = var3_4 /* !! */ .equals(var1_1);
            if (var18_22 == false) return (boolean)var5_6;
            var1_1 = this.sdkStateReference;
            var3_4 /* !! */  = SDKState.INITIATE_COMPLETED;
            var1_1.set(var3_4 /* !! */ );
            this.runProcessWaitQueue();
            return false;
        }
        var3_4 /* !! */  = "android";
        var4_5 = "on_event_failed_during_evaluation";
        this.logSafeExceptions((String)var3_4 /* !! */ , var2_3, (String)var4_5, var1_2);
        return (boolean)var5_6;
    }

    public void initiate(FragmentActivity fragmentActivity, ViewGroup viewGroup, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.container = viewGroup;
        this.initiate(fragmentActivity, jSONObject, hyperPaymentsCallback);
    }

    public void initiate(FragmentActivity object, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        Object object2 = this.activity;
        if (object2 != object) {
            object2 = this.juspayServices;
            SdkTracker sdkTracker = ((JuspayServices)object2).getSdkTracker();
            String string2 = "activity_changed";
            String string3 = "true";
            String string4 = "hypersdk";
            String string5 = "info";
            String string6 = "initiate";
            sdkTracker.trackLifecycle(string4, string5, string6, string2, string3);
        }
        this.activity = object;
        this.currentActivityId = object = this.getIdForActivity((FragmentActivity)object);
        this.initiate(jSONObject, hyperPaymentsCallback);
    }

    public void initiate(JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        Object object;
        Object object2;
        Object object3 = "payload";
        try {
            object2 = jSONObject.getJSONObject((String)object3);
            object = "initiateStartedTime";
        }
        catch (JSONException jSONException) {}
        long l2 = System.currentTimeMillis();
        object2.put(object, l2);
        jSONObject.put((String)object3, object2);
        boolean bl2 = this.checkAndStartInitiate(jSONObject);
        if (bl2) {
            object3 = this.trackerFallBack;
            object2 = this.juspayServices;
            object = LogType.INITIATE_START;
            ((TrackerFallback)object3).log(jSONObject, (JuspayServices)object2, (LogType)((Object)object));
            this.juspayServices.getSdkTracker().resetSerialNumber();
            this.juspayServices.getSessionInfo().setSessionId();
            object3 = this.juspayServices.getLogManager();
            boolean bl3 = this.shouldPushExp("initiate", jSONObject);
            ((LogManager)object3).startPushTasks(bl3);
            object2 = this.juspayServices.getSdkTracker();
            String string2 = "initiate";
            String string3 = "started";
            object = "hypersdk";
            Object object4 = "info";
            Object object5 = jSONObject;
            ((SdkTracker)object2).trackLifecycle((String)object, (String)object4, string2, string3, jSONObject);
            object2 = this.juspayServices.getSdkTracker();
            object3 = this.activity;
            if (object3 != null) {
                bl2 = true;
            } else {
                bl2 = false;
                object3 = null;
            }
            object5 = String.valueOf(bl2);
            string2 = "initiate";
            string3 = "fragment_activity_used";
            ((SdkTracker)object2).trackLifecycle("hypersdk", "info", string2, string3, object5);
            bl3 = false;
            object2 = null;
            object3 = new zb1_1(this, 0);
            ExecutorManager.runOnBackgroundThread((Runnable)object3);
            long l3 = System.currentTimeMillis();
            object = object3;
            object4 = this;
            object5 = jSONObject;
            object3 = new ac1_2(this, l3, jSONObject, hyperPaymentsCallback);
            ExecutorManager.runOnMainThread((Runnable)object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean isInitialised() {
        boolean bl2;
        SDKState sDKState;
        SDKState sDKState2 = (SDKState)((Object)this.sdkStateReference.get());
        if (sDKState2 != (sDKState = SDKState.INITIATE_STARTED) && sDKState2 != (sDKState = SDKState.INITIATE_COMPLETED)) {
            bl2 = false;
            sDKState = null;
        } else {
            bl2 = true;
        }
        JSONObject jSONObject = new JSONObject();
        String string2 = "sdkState";
        try {
            String string3 = String.valueOf((Object)sDKState2);
            jSONObject.put(string2, (Object)string3);
            String string4 = "isInitialised";
            jSONObject.put(string4, bl2);
        }
        catch (JSONException jSONException) {}
        this.juspayServices.getSdkTracker().trackLifecycle("hypersdk", "info", "initiate", "isInitialised()", jSONObject);
        return bl2;
    }

    public void modifyParams(JSONObject jSONObject) {
        String string2 = "service_based";
        boolean bl2 = true;
        jSONObject.put(string2, bl2);
        string2 = "use_local_assets";
        String string3 = "useLocalAssets";
        Context context = this.context;
        context = context.getResources();
        int n3 = R$bool.use_local_assets;
        boolean bl3 = context.getBoolean(n3);
        bl2 = jSONObject.optBoolean(string3, bl3);
        jSONObject.put(string2, bl2);
        string2 = "payload";
        jSONObject = jSONObject.getJSONObject(string2);
        string2 = "currentActivityId";
        string3 = this.currentActivityId;
        try {
            jSONObject.put(string2, (Object)string3);
        }
        catch (Exception exception) {
            string2 = LOG_TAG;
            string3 = "Failed to write to JSON";
            JuspayLogger.e(string2, string3, exception);
        }
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        JuspayServices juspayServices = this.juspayServices;
        juspayServices.onActivityResult(n3 &= (char)-1, n4, intent);
    }

    public boolean onBackPressed() {
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        Object object = "consuming_backpress";
        try {
            bl2 = this.jpConsumingBackPress;
        }
        catch (Exception exception) {}
        jSONObject.put((String)object, bl2);
        object = "triggered_on";
        String string2 = "HyperServices.onBackPressed()";
        jSONObject.put((String)object, (Object)string2);
        object = this.juspayServices.getSdkTracker();
        string2 = "info";
        String string3 = "on_back_pressed";
        String string4 = "android";
        ((SdkTracker)object).trackLifecycle(string4, string2, string3, jSONObject);
        boolean bl3 = this.jpConsumingBackPress;
        if (bl3) {
            this.juspayServices.onBackPressed();
            return true;
        }
        return false;
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        JuspayServices juspayServices = this.juspayServices;
        juspayServices.onRequestPermissionsResult(n3 &= (char)-1, stringArray, nArray);
    }

    public void process(FragmentActivity object, ViewGroup object2, JSONObject jSONObject) {
        Object object3 = (SDKState)((Object)this.sdkStateReference.get());
        Object object4 = HyperServices$3.$SwitchMap$in$juspay$services$SDKState;
        int n3 = ((Enum)object3).ordinal();
        n3 = object4[n3];
        int n4 = 1;
        Object object5 = "error";
        String string2 = "process";
        if (n3 != n4) {
            n4 = 2;
            String string3 = "info";
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    int n7 = 4;
                    if (n3 == n7) {
                        object = "called_after_terminate";
                        this.logSafeEvents((String)object5, string2, (String)object, jSONObject);
                        this.initiateTerminated(jSONObject);
                    }
                } else {
                    this.logSafeEvents(string3, string2, "called_and_started", jSONObject);
                    object3 = this.juspayServices;
                    n3 = (int)(((JuspayServices)object3).isWebViewAvailable() ? 1 : 0);
                    if (n3 == 0) {
                        this.notifyMerchant("JP_020", "No web view is present in the device", "process_result", jSONObject);
                        return;
                    }
                    object3 = this.activity;
                    if (object != object3) {
                        object3 = "activity_changed";
                        object4 = "true";
                        this.logSafeEvents(string3, string2, (String)object3, object4);
                    }
                    if ((n3 = (int)((object4 = (Object)this.onBackPressedCallbackSet).add(object3 = this.getIdForActivity((FragmentActivity)object)) ? 1 : 0)) != 0) {
                        n4 = 0;
                        object4 = null;
                        object3 = new fc1_2(0, this, object);
                        ExecutorManager.runOnMainThread((Runnable)object3);
                    }
                    this.container = object2;
                    this.activity = object;
                    object2 = this.getIdForActivity((FragmentActivity)object);
                    this.currentActivityId = object2;
                    this.juspayServices.getSessionInfo().addOrderIdInSessionData(jSONObject);
                    object2 = this.juspayServices;
                    object3 = this.container;
                    ((JuspayServices)object2).process((FragmentActivity)object, (ViewGroup)object3);
                    boolean bl2 = this.shouldPushExp(string2, jSONObject);
                    if (bl2) {
                        object = this.juspayServices.getLogManager();
                        ((LogManager)object).startPushExp();
                    }
                    this.doProcess(jSONObject);
                }
            } else {
                object3 = this.trackerFallBack;
                object4 = this.juspayServices;
                object5 = LogType.PROCESS_QUEUED;
                ((TrackerFallback)object3).log(jSONObject, (JuspayServices)object4, (LogType)((Object)object5));
                this.logSafeEvents(string3, string2, "queued", jSONObject);
                object3 = this.processWaitingQueue;
                object4 = new wb1_1;
                ((wb1_1)object4)(this, (FragmentActivity)object, (ViewGroup)object2, jSONObject);
                object3.add(object4);
            }
        } else {
            object = "called_before_initiate";
            this.logSafeEvents((String)object5, string2, (String)object, jSONObject);
            this.initiateNotCalled();
        }
    }

    public void process(FragmentActivity fragmentActivity, JSONObject jSONObject) {
        ViewGroup viewGroup = (ViewGroup)fragmentActivity.getWindow().getDecorView().findViewById(0x1020002);
        this.process(fragmentActivity, viewGroup, jSONObject);
    }

    public void process(JSONObject jSONObject) {
        SDKState sDKState;
        Object object = (SDKState)((Object)this.sdkStateReference.get());
        if (object == (sDKState = SDKState.INSTANTIATED)) {
            this.initiateNotCalled();
            return;
        }
        sDKState = SDKState.TERMINATED;
        if (object == sDKState) {
            this.initiateTerminated(jSONObject);
            return;
        }
        object = this.activity;
        if (object == null) {
            this.notifyMerchant("JP_003", "FragmentActivity needs to be send in process", "process_result", jSONObject);
            return;
        }
        sDKState = this.container;
        if (sDKState != null) {
            this.process((FragmentActivity)object, (ViewGroup)sDKState, jSONObject);
        } else {
            this.process((FragmentActivity)object, jSONObject);
        }
    }

    public void resetActivity(FragmentActivity object) {
        Object object2 = this.activity;
        if (object != object2) {
            return;
        }
        this.juspayServices.getSdkTracker().trackLifecycle("hypersdk", "info", "terminate", "resetActivity()", "called");
        this.juspayServices.reset();
        object = this.onBackPressedCallback;
        Objects.requireNonNull(object);
        object2 = new cc1_2(object, 0);
        ExecutorManager.runOnMainThread((Runnable)object2);
        this.onBackPressedCallbackSet.clear();
        this.activity = null;
        this.currentActivityId = null;
        this.container = null;
    }

    public void setActivityLaunchDelegate(ActivityLaunchDelegate activityLaunchDelegate) {
        this.juspayServices.setActivityLaunchDelegate(activityLaunchDelegate);
    }

    public void setIntentSenderDelegate(IntentSenderDelegate intentSenderDelegate) {
        this.juspayServices.setIntentSenderDelegate(intentSenderDelegate);
    }

    public void setRequestPermissionDelegate(RequestPermissionDelegate requestPermissionDelegate) {
        this.juspayServices.setRequestPermissionDelegate(requestPermissionDelegate);
    }

    public void setWebViewConfigurationCallback(JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback) {
        this.juspayServices.setWebViewConfigurationCallback(juspayWebViewConfigurationCallback);
    }

    public void terminate() {
        Object object;
        Object object2 = (SDKState)((Object)this.sdkStateReference.get());
        if (object2 == (object = SDKState.TERMINATED)) {
            this.juspayServices.getSdkTracker().trackLifecycle("hypersdk", "warning", "terminate", "started", "Terminate called again, skipping");
            return;
        }
        Object object3 = SDKState.INSTANTIATED;
        if (object2 == object3) {
            this.juspayServices.getSdkTracker().trackLifecycle("hypersdk", "warning", "terminate", "started", "Terminate called without initiate, skipping");
            return;
        }
        this.sdkStateReference.set(object);
        object = this.juspayServices.getSdkTracker();
        String string2 = "started";
        String string3 = "Terminating the SDK";
        object3 = "hypersdk";
        String string4 = "info";
        String string5 = "terminate";
        ((SdkTracker)object).trackLifecycle((String)object3, string4, string5, string2, string3);
        this.jpConsumingBackPress = false;
        object2 = this.hyperExceptionHandler;
        if (object2 != null) {
            ((HyperServices$HyperExceptionHandler)object2).clearHyperExceptionHandler();
            object2 = null;
            this.hyperExceptionHandler = null;
        }
        object2 = this.activity;
        this.resetActivity((FragmentActivity)object2);
        long l2 = System.currentTimeMillis();
        object3 = new dc1_2(this, l2);
        ExecutorManager.runOnMainThread((Runnable)object3);
        this.juspayServices.getSessionInfo().resetSession();
        this.juspayServices.getLogManager().stopPushTasks();
    }

    public void terminate(JSONObject jSONObject) {
        this.logSafeEvents("info", "terminate_process", "request", jSONObject);
        this.juspayServices.onMerchantEvent("terminate", jSONObject);
    }
}

