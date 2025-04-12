/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowInsets
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  in.juspay.hyperapay.APayBridge
 *  in.juspay.hyperapayupi.APayUPIBridge
 *  in.juspay.hypergpay.GPayBridge
 *  in.juspay.hypergpayintl.GPayIntlBridge
 *  in.juspay.hyperpaypal.PaypalBridge
 *  in.juspay.hyperpayu.PayUBridge
 *  in.juspay.hyperqr.QrBridge
 *  in.juspay.hypersimpl.SimplBridge
 *  in.juspay.hypertrident.TridentBridge
 *  in.juspay.hyperupi.UPIBridge
 *  in.juspay.mobility.app.MobilityAppBridge
 *  in.juspay.mobility.customer.MobilityCustomerBridge
 *  in.juspay.mobility.driver.MobilityDriverBridge
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import in.juspay.hyper.bridge.BridgeList;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.FragmentHooks;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyperapay.APayBridge;
import in.juspay.hyperapayupi.APayUPIBridge;
import in.juspay.hypergpay.GPayBridge;
import in.juspay.hypergpayintl.GPayIntlBridge;
import in.juspay.hypernfc.NfcBridge;
import in.juspay.hyperpaypal.PaypalBridge;
import in.juspay.hyperpayu.PayUBridge;
import in.juspay.hyperqr.QrBridge;
import in.juspay.hypersdk.R$bool;
import in.juspay.hypersdk.analytics.LogManager;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.JBridge;
import in.juspay.hypersdk.core.JuspayServices$1;
import in.juspay.hypersdk.core.JuspayServices$2;
import in.juspay.hypersdk.core.JuspayServices$3;
import in.juspay.hypersdk.core.JuspayServices$4;
import in.juspay.hypersdk.core.JuspayServices$5;
import in.juspay.hypersdk.core.JuspayServices$6;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.MPINUtil;
import in.juspay.hypersdk.core.PaymentUtils;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SdkInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.lifecycle.ActivityResultHolder;
import in.juspay.hypersdk.lifecycle.FragmentEvent;
import in.juspay.hypersdk.lifecycle.HyperActivityLaunchDelegate;
import in.juspay.hypersdk.lifecycle.HyperFragment;
import in.juspay.hypersdk.lifecycle.HyperIntentSenderDelegate;
import in.juspay.hypersdk.lifecycle.HyperRequestPermissionDelegate;
import in.juspay.hypersdk.lifecycle.RequestPermissionResult;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.ota.ApplicationManager;
import in.juspay.hypersdk.ota.Mode;
import in.juspay.hypersdk.ota.Mode$Beta;
import in.juspay.hypersdk.ota.Mode$CUG;
import in.juspay.hypersdk.ota.Mode$DevQa;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.services.SdkConfigService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersimpl.SimplBridge;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsServices;
import in.juspay.hypertrident.TridentBridge;
import in.juspay.hyperupi.UPIBridge;
import in.juspay.mobility.app.MobilityAppBridge;
import in.juspay.mobility.customer.MobilityCustomerBridge;
import in.juspay.mobility.driver.MobilityDriverBridge;
import in.juspay.services.TenantParams;
import java.lang.reflect.Constructor;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JuspayServices
implements FragmentHooks {
    private static final String DEFAULT_WORKSPACE_PATH = "juspay";
    private static final String fragmentTag = "JuspayServiceFragment";
    private final String LOG_TAG;
    private FragmentActivity activity;
    private ActivityLaunchDelegate activityLaunchDelegate;
    private ApplicationManager applicationManager;
    private final BridgeComponents bridgeComponents;
    private final BridgeList bridgeList;
    private final String buildId;
    private JSONObject bundleParameters;
    private final String clientId;
    private FrameLayout container;
    private final Context context;
    private final DynamicUI dynamicUI;
    private final FileProviderService fileProviderService;
    HyperFragment fragment;
    private final EnumSet fragmentEvents;
    private HyperPaymentsCallback hyperCallback;
    private IntentSenderDelegate intentSenderDelegate;
    private boolean isPrefetch;
    private boolean isWebViewAvailable;
    private final JBridge jBridge;
    private JSONObject lastProcessPayload;
    private final LogManager logManager;
    private String merchantClientId;
    private boolean paused;
    private final PaymentSessionInfo paymentSessionInfo;
    private final RemoteAssetService remoteAssetService;
    private RequestPermissionDelegate requestPermissionDelegate;
    private final SdkConfigService sdkConfigService;
    private final SdkInfo sdkInfo;
    private final SdkTracker sdkTracker;
    private final SessionInfo sessionInfo;
    SmsComponents smsComponents;
    private final SmsServices smsServices;
    private final TenantParams tenantParams;
    private JuspayWebViewConfigurationCallback webViewConfigurationCallback;
    Runnable webViewCrashCallback;
    private final Workspace workspace;

    public JuspayServices(Context context, TenantParams tenantParams, String string2, boolean bl2) {
        DynamicUI dynamicUI;
        EnumSet<FragmentEvent> enumSet;
        SdkTracker sdkTracker;
        SdkConfigService sdkConfigService;
        boolean bl3;
        JuspayServices juspayServices = this;
        Context context2 = context;
        Object object = tenantParams;
        Object object2 = string2;
        Object object3 = this.getClass().getSimpleName();
        this.LOG_TAG = object3;
        this.bridgeList = object3 = new BridgeList();
        object3 = null;
        this.fragment = null;
        this.paused = false;
        this.isPrefetch = false;
        this.isWebViewAvailable = bl3 = true;
        Object object4 = new JuspayServices$5(this);
        this.smsComponents = object4;
        this.clientId = string2;
        this.tenantParams = tenantParams;
        this.sdkInfo = object4 = IntegrationUtils.getSdkInfo(context);
        object4 = context.getApplicationContext();
        this.context = object4;
        object4 = new StringBuilder("jus_");
        Object object5 = "_";
        Object object6 = IntegrationUtils.getSdkVersion(context, (String)object5);
        ((StringBuilder)object4).append((String)object6);
        ((StringBuilder)object4).append((String)object5);
        object5 = IntegrationUtils.getAssetAarVersion(context, string2);
        ((StringBuilder)object4).append((String)object5);
        this.buildId = object4 = ((StringBuilder)object4).toString();
        object4 = tenantParams != null && (object4 = tenantParams.getTenant()) != null ? tenantParams.getTenant() : DEFAULT_WORKSPACE_PATH;
        if (object2 != null) {
            object5 = "/";
            object4 = n1.a((String)object4, (String)object5, (String)object2);
        }
        juspayServices.workspace = object2 = new Workspace(context2, (String)object4);
        juspayServices.isPrefetch = bl2;
        object4 = new JuspayServices$1(juspayServices);
        object5 = new JuspayServices$2(juspayServices);
        JuspayServices$3 juspayServices$3 = new JuspayServices$3(juspayServices);
        juspayServices.sdkConfigService = sdkConfigService = new SdkConfigService(juspayServices);
        object6 = sdkConfigService.getSdkConfig();
        juspayServices.logManager = object2 = LogManager.registerWorkspace(context2, (Workspace)object2, (JSONObject)object6);
        juspayServices.sdkTracker = sdkTracker = new SdkTracker(juspayServices);
        juspayServices.sessionInfo = object2 = new SessionInfo(juspayServices);
        juspayServices.fileProviderService = object2 = new FileProviderService(juspayServices);
        juspayServices.remoteAssetService = object2 = new RemoteAssetService(juspayServices);
        juspayServices.jBridge = object2 = new JBridge(juspayServices);
        juspayServices.activityLaunchDelegate = object2 = new HyperActivityLaunchDelegate(juspayServices);
        juspayServices.intentSenderDelegate = object2 = new HyperIntentSenderDelegate(juspayServices);
        juspayServices.requestPermissionDelegate = object2 = new HyperRequestPermissionDelegate(juspayServices);
        sdkConfigService.renewConfig(context2);
        juspayServices.bridgeComponents = object6 = this.createBridgeComponents();
        if (object != null) {
            object = tenantParams.getBaseContent();
            enumSet = object;
        } else {
            enumSet = null;
        }
        juspayServices.applicationManager = object = this.createApplicationManager();
        Map map2 = this.getJavaScriptInterfaces();
        Object object7 = sdkConfigService.getSdkConfig();
        object3 = juspayServices.applicationManager;
        object = dynamicUI;
        object2 = context;
        Object object8 = object3;
        object3 = object5;
        object5 = object6;
        object6 = enumSet;
        enumSet = map2;
        map2 = object7;
        object7 = object8;
        juspayServices.dynamicUI = dynamicUI = new DynamicUI(context, (DuiLogger)object3, (Callback)object4, (BridgeComponents)object5, (String)object6, (Map)((Object)enumSet), (JSONObject)map2, (ApplicationManager)object8, juspayServices$3, bl2);
        juspayServices.paymentSessionInfo = object = new PaymentSessionInfo(juspayServices);
        juspayServices.logMemoryInfo(sdkTracker, context2);
        object = EnumSet.allOf(FragmentEvent.class);
        juspayServices.fragmentEvents = object;
        object2 = juspayServices.smsComponents;
        juspayServices.smsServices = object = new SmsServices((SmsComponents)object2);
        object = sdkConfigService.getSdkConfig();
        object2 = "logsConfig";
        object = object.optJSONObject((String)object2);
        if (object != null) {
            object3 = null;
            object2 = new cn1_1(0, juspayServices, object);
            ExecutorManager.runOnBackgroundThread((Runnable)object2);
        }
    }

    public static /* synthetic */ void a(JuspayServices juspayServices, JSONObject jSONObject) {
        juspayServices.lambda$setBundleParameter$2(jSONObject);
    }

    public static /* synthetic */ SdkTracker access$000(JuspayServices juspayServices) {
        return juspayServices.sdkTracker;
    }

    public static /* synthetic */ SdkInfo access$1000(JuspayServices juspayServices) {
        return juspayServices.sdkInfo;
    }

    public static /* synthetic */ boolean access$102(JuspayServices juspayServices, boolean bl2) {
        juspayServices.isWebViewAvailable = bl2;
        return bl2;
    }

    public static /* synthetic */ SdkConfigService access$1100(JuspayServices juspayServices) {
        return juspayServices.sdkConfigService;
    }

    public static /* synthetic */ SessionInfo access$1200(JuspayServices juspayServices) {
        return juspayServices.sessionInfo;
    }

    public static /* synthetic */ HyperPaymentsCallback access$200(JuspayServices juspayServices) {
        return juspayServices.hyperCallback;
    }

    public static /* synthetic */ JSONObject access$300(JuspayServices juspayServices) {
        return juspayServices.bundleParameters;
    }

    public static /* synthetic */ String access$400(JuspayServices juspayServices) {
        return juspayServices.LOG_TAG;
    }

    public static /* synthetic */ Context access$500(JuspayServices juspayServices) {
        return juspayServices.context;
    }

    public static /* synthetic */ FragmentActivity access$600(JuspayServices juspayServices) {
        return juspayServices.activity;
    }

    public static /* synthetic */ JBridge access$700(JuspayServices juspayServices) {
        return juspayServices.jBridge;
    }

    public static /* synthetic */ FileProviderService access$800(JuspayServices juspayServices) {
        return juspayServices.fileProviderService;
    }

    public static /* synthetic */ DynamicUI access$900(JuspayServices juspayServices) {
        return juspayServices.dynamicUI;
    }

    private void addFragment(FragmentActivity fragmentActivity) {
        en1_1 en1_12 = new en1_1(this, fragmentActivity);
        ExecutorManager.runOnMainThread(en1_12);
    }

    public static /* synthetic */ void b(JuspayServices juspayServices, String string2) {
        juspayServices.lambda$initiate$4(string2);
    }

    public static /* synthetic */ void c(JuspayServices juspayServices) {
        juspayServices.lambda$setBundleParameter$3();
    }

    private void commitFragmentTransaction(k k2) {
        boolean bl2 = this.useCommit();
        if (bl2) {
            k2.e();
        } else {
            k2.f();
        }
    }

    private BridgeComponents createBridgeComponents() {
        JuspayServices$4 juspayServices$4 = new JuspayServices$4(this);
        return juspayServices$4;
    }

    private FrameLayout createSubLayout(Activity activity) {
        FrameLayout frameLayout = new FrameLayout((Context)activity);
        int n3 = -1;
        activity = new FrameLayout.LayoutParams(n3, n3);
        frameLayout.setLayoutParams((ViewGroup.LayoutParams)activity);
        frameLayout.setVisibility(0);
        return frameLayout;
    }

    public static /* synthetic */ void d(JuspayServices juspayServices, FragmentActivity fragmentActivity) {
        juspayServices.lambda$addFragment$11(fragmentActivity);
    }

    public static /* synthetic */ void e(JuspayServices juspayServices) {
        juspayServices.lambda$reset$9();
    }

    public static /* synthetic */ void f(JuspayServices juspayServices, JSONObject jSONObject) {
        juspayServices.lambda$new$0(jSONObject);
    }

    private void firstTimeSetup() {
        boolean bl2;
        Object object;
        this.sdkInfo.getSdkName();
        Object object2 = this.workspace;
        Object object3 = "jp_hyper_build_id";
        object2 = ((Workspace)object2).getFromSharedPreference((String)object3, "__failed");
        Object object4 = this.clientId;
        Object object5 = null;
        String string2 = "_";
        if (object4 == null) {
            object4 = this.merchantClientId;
            if (object4 != null) {
                object = Locale.getDefault();
                object4 = ((String)object4).toLowerCase((Locale)object).split(string2);
                bl2 = false;
                object = null;
                object4 = object4[0];
            } else {
                object4 = null;
            }
        }
        if (bl2 = ((String)(object4 = IntegrationUtils.getAssetAarVersion(this.context, (String)object4))).equals(object = "undefined")) {
            object4 = IntegrationUtils.getAssetAarVersion(this.context, null);
        }
        object5 = new StringBuilder("jus_");
        object = IntegrationUtils.getSdkVersion(this.context, string2);
        ((StringBuilder)object5).append((String)object);
        ((StringBuilder)object5).append(string2);
        ((StringBuilder)object5).append((String)object4);
        object4 = ((StringBuilder)object5).toString();
        boolean bl3 = ((String)object2).equals(object4);
        if (!bl3) {
            object5 = this.sdkTracker;
            Object object6 = "started";
            string2 = "hypersdk";
            object = "info";
            String string3 = "first_time_setup";
            ((SdkTracker)object5).trackLifecycle(string2, (String)object, string3, (String)object6, null);
            this.workspace.writeToSharedPreference((String)object3, (String)object4);
            object2 = this.workspace;
            object4 = "asset_metadata.json";
            ((Workspace)object2).removeFromSharedPreference((String)object4);
            object2 = this.workspace;
            object4 = this.context;
            ((Workspace)object2).clean((Context)object4);
            object3 = this.sdkTracker;
            object5 = "hypersdk";
            string2 = "info";
            object = "first_time_setup";
            string3 = "completed";
            object6 = null;
            try {
                ((SdkTracker)object3).trackLifecycle((String)object5, string2, (String)object, string3, null);
            }
            catch (Exception exception) {
                object6 = exception;
                object4 = this.sdkTracker;
                object3 = this.LOG_TAG;
                object = "first_time_setup";
                string3 = "Exception while fetching meta-data for manifest.json file";
                object5 = "lifecycle";
                string2 = "hypersdk";
                ((SdkTracker)object4).trackAndLogException((String)object3, (String)object5, string2, (String)object, string3, exception);
            }
        }
    }

    public static /* synthetic */ void g(JuspayServices juspayServices, ViewGroup viewGroup, FragmentActivity fragmentActivity) {
        juspayServices.lambda$process$8(viewGroup, fragmentActivity);
    }

    private String getBootloaderEndpoint(JSONObject stringArray) {
        String string2;
        boolean bl2;
        Object object = this.tenantParams;
        if (object != null && (object = object.getBootLoaderEndpoint()) != null) {
            return object;
        }
        object = null;
        Object object2 = "common";
        if (stringArray != null && (bl2 = stringArray.optBoolean(string2 = "betaAssets", false))) {
            stringArray = "sandbox.";
        } else {
            stringArray = this.merchantClientId;
            string2 = "";
            if (stringArray != null) {
                object2 = Locale.getDefault();
                stringArray = stringArray.toLowerCase((Locale)object2).split("_");
                object2 = stringArray[0];
            }
            stringArray = string2;
        }
        return uc0_0.a("https://", (String)stringArray, "assets.juspay.in/hyper/bundles/app/in.juspay.hyperos/", (String)object2, "/v1-boot_loader.zip");
    }

    private Map getJavaScriptInterfaces() {
        HashMap<Object, Object> hashMap;
        Map map2;
        block38: {
            Exception exception2;
            Object object;
            Object object2;
            String string2;
            Object object3;
            map2 = null;
            int n3 = 1;
            hashMap = new HashMap<Object, Object>();
            Iterator iterator = this.jBridge;
            hashMap.put("JBridge", iterator);
            iterator = this.bridgeList.getInterfaceName();
            Constructor<?>[] constructorArray = this.bridgeList;
            hashMap.put(iterator, constructorArray);
            iterator = "in.juspay.hyperupi.UPIBridge";
            boolean bl2 = PaymentUtils.isClassAvailable((String)((Object)iterator));
            if (bl2) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new UPIBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hyperapayupi.APayUPIBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new APayUPIBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hypersimpl.SimplBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new SimplBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hypergpayintl.GPayIntlBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new GPayIntlBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hyperapay.APayBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new APayBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hyperpaypal.PaypalBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new PaypalBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hyperqr.QrBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new QrBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hypernfc.NfcBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new NfcBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hypergpay.GPayBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new GPayBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hyperpayu.PayUBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new PayUBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.hypertrident.TridentBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new TridentBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.mobility.customer.MobilityCustomerBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new MobilityCustomerBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.mobility.driver.MobilityDriverBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new MobilityDriverBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            if (bl2 = PaymentUtils.isClassAvailable((String)((Object)(iterator = "in.juspay.mobility.app.MobilityAppBridge")))) {
                iterator = this.bridgeList;
                object3 = this.bridgeComponents;
                constructorArray = new MobilityAppBridge((BridgeComponents)object3);
                ((BridgeList)((Object)iterator)).addHyperBridge((HyperBridge)constructorArray);
            }
            iterator = this.tenantParams;
            if (iterator == null) break block38;
            iterator = iterator.getBridgeClasses();
            iterator = iterator.iterator();
            block22: while (true) {
                boolean bl3 = iterator.hasNext();
                if (!bl3) break block38;
                constructorArray = iterator.next();
                constructorArray = (Class)constructorArray;
                constructorArray = constructorArray.getConstructors();
                int n4 = constructorArray.length;
                int n7 = 0;
                string2 = null;
                while (true) {
                    block39: {
                        if (n7 >= n4) continue block22;
                        object2 = constructorArray[n7];
                        object = ((Constructor)object2).getParameterTypes();
                        int n8 = ((Class<?>[])object).length;
                        if (n8 != n3) break block39;
                        object = ((Constructor)object2).getParameterTypes();
                        object = object[0];
                        Object object4 = BridgeComponents.class;
                        n8 = (int)(object.equals(object4) ? 1 : 0);
                        if (n8 == 0) break block39;
                        object = this.bridgeList;
                        object4 = this.bridgeComponents;
                        Object[] objectArray = new Object[n3];
                        objectArray[0] = object4;
                        object2 = ((Constructor)object2).newInstance(objectArray);
                        object2 = (HyperBridge)object2;
                        try {
                            ((BridgeList)object).addHyperBridge((HyperBridge)object2);
                            break block39;
                        }
                        catch (Exception exception2) {
                            object4 = exception2;
                        }
                        break block22;
                    }
                    n7 += n3;
                }
                break;
            }
            iterator = this.sdkTracker;
            constructorArray = this.LOG_TAG;
            object2 = "add_bridge";
            object = "Exception while trying to add tenant bridge";
            object3 = "lifecycle";
            string2 = "hypersdk";
            ((SdkTracker)((Object)iterator)).trackAndLogException((String)constructorArray, (String)object3, string2, (String)object2, (String)object, exception2);
        }
        map2 = this.bridgeList.getBridgeList();
        hashMap.putAll(map2);
        return hashMap;
    }

    public static /* synthetic */ void h(JuspayServices juspayServices, Context context, SdkTracker sdkTracker) {
        juspayServices.lambda$logMemoryInfo$1(context, sdkTracker);
    }

    public static /* synthetic */ void i(JuspayServices juspayServices) {
        juspayServices.lambda$removeFragment$12();
    }

    private void insetUpdated(WindowInsets object) {
        Object object2 = this.activity;
        if (object2 == null) {
            return;
        }
        float f5 = object2.getResources().getDisplayMetrics().density;
        float f6 = (float)object.getSystemWindowInsetTop() / f5;
        float f7 = (float)object.getSystemWindowInsetRight() / f5;
        float f8 = (float)object.getSystemWindowInsetBottom() / f5;
        float f11 = (float)object.getSystemWindowInsetLeft() / f5;
        float f12 = (float)object.getStableInsetTop() / f5;
        float f14 = (float)object.getStableInsetRight() / f5;
        float f15 = (float)object.getStableInsetBottom() / f5;
        float f16 = (float)object.getStableInsetLeft() / f5;
        object2 = new StringBuilder("window.insetUpdated(");
        ((StringBuilder)object2).append(f6);
        String string2 = ",";
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(f7);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(f8);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(f11);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(f12);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(f14);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(f15);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(f16);
        ((StringBuilder)object2).append(",)");
        object = ((StringBuilder)object2).toString();
        this.dynamicUI.addJsToWebView((String)object);
    }

    public static /* synthetic */ void j(JuspayServices juspayServices, Runnable runnable2) {
        juspayServices.lambda$initiate$5(runnable2);
    }

    public static /* synthetic */ void k(JuspayServices juspayServices, FragmentEvent fragmentEvent, String string2, HyperFragment hyperFragment) {
        juspayServices.lambda$addFragment$10(fragmentEvent, string2, hyperFragment);
    }

    public static /* synthetic */ void l(JuspayServices juspayServices) {
        juspayServices.lambda$initiate$6();
    }

    private /* synthetic */ void lambda$addFragment$10(FragmentEvent object, String string2, HyperFragment object2) {
        Object object3 = this.sdkTracker;
        String string3 = object.getKey();
        String string4 = "fragment_lifecycle_event";
        String string5 = "event";
        String string6 = "system";
        String string7 = "debug";
        ((SdkTracker)object3).trackLifecycle(string6, string7, string4, string5, string3);
        object3 = JuspayServices$6.$SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;
        int n3 = object.ordinal();
        Object object4 = object3[n3];
        n3 = 1;
        if (object4 != n3) {
            n3 = 2;
            if (object4 != n3) {
                n3 = 3;
                if (object4 != n3) {
                    n3 = 4;
                    if (object4 == n3 && object2 == (object3 = this.fragment)) {
                        object2 = null;
                        this.fragment = null;
                    }
                } else {
                    object3 = this.fragment;
                    if (object2 == object3) {
                        object2 = this.activityLaunchDelegate;
                        object4 = object2 instanceof HyperActivityLaunchDelegate;
                        if (object4 != false) {
                            object2 = (HyperActivityLaunchDelegate)object2;
                            ((HyperActivityLaunchDelegate)object2).fragmentAttached();
                        }
                        if ((object4 = (Object)((object2 = this.requestPermissionDelegate) instanceof HyperRequestPermissionDelegate)) != false) {
                            object2 = (HyperRequestPermissionDelegate)object2;
                            ((HyperRequestPermissionDelegate)object2).fragmentAttached();
                        }
                        if ((object4 = (Object)((object2 = this.intentSenderDelegate) instanceof HyperIntentSenderDelegate)) != false) {
                            object2 = (HyperIntentSenderDelegate)object2;
                            ((HyperIntentSenderDelegate)object2).fragmentAttached();
                        }
                    }
                }
            } else {
                object3 = this.fragment;
                if (object2 == object3) {
                    this.paused = false;
                    object2 = this.getDynamicUI();
                    ((DynamicUI)object2).onResumeCallback();
                }
            }
        } else {
            object3 = this.fragment;
            if (object2 == object3) {
                this.paused = n3;
                this.logManager.flushLogPush();
                object2 = this.getDynamicUI();
                ((DynamicUI)object2).onPauseCallback();
            }
        }
        object2 = this.jBridge;
        object = object.getKey();
        ((DuiInterface)object2).invokeFnInDUIWebview((String)object, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void lambda$addFragment$11(FragmentActivity object) {
        try {
            Object object2 = new HyperFragment();
            this.fragment = object2;
            object = ((FragmentActivity)object).getSupportFragmentManager();
            object.getClass();
            object2 = new a((FragmentManager)object);
            object = this.fragment;
            Object object3 = fragmentTag;
            in1_1 in1_12 = null;
            int n3 = 1;
            ((a)object2).h(0, (Fragment)object, (String)object3, n3);
            this.commitFragmentTransaction((k)object2);
            SdkTracker sdkTracker = this.sdkTracker;
            String string2 = "hypersdk";
            String string3 = "info";
            String string4 = "fragment_operation";
            String string5 = "fragment_transaction";
            String string6 = "Fragment Addition Done Successfully";
            sdkTracker.trackLifecycle(string2, string3, string4, string5, string6);
            object = this.fragmentEvents;
            object = ((AbstractCollection)object).iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    object = this.fragment;
                    object2 = new jn1_1(this);
                    ((HyperFragment)object).registerOnActivityResult((ActivityResultHolder)object2);
                    object = this.fragment;
                    object2 = new kn1_2(this);
                    ((HyperFragment)object).registerOnRequestPermissionResult((RequestPermissionResult)object2);
                    return;
                }
                object2 = object.next();
                object2 = (FragmentEvent)((Object)object2);
                object3 = this.fragment;
                in1_12 = new in1_1(this, (FragmentEvent)((Object)object2));
                ((HyperFragment)object3).registerForEvent((FragmentEvent)((Object)object2), in1_12);
            }
        }
        catch (Exception exception) {
            Exception exception2 = exception;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string7 = "fragment_operation";
        String string8 = "Exception while committing fragment";
        String string9 = "lifecycle";
        String string10 = "android";
        sdkTracker.trackException(string9, string10, string7, string8, exception);
    }

    private /* synthetic */ void lambda$initiate$4(String string2) {
        this.applicationManager.loadApplication(string2);
    }

    private /* synthetic */ void lambda$initiate$5(Runnable runnable2) {
        DynamicUI dynamicUI = this.dynamicUI;
        boolean bl2 = dynamicUI.initiate();
        if (!bl2) {
            this.webViewCrashCallback = null;
            bl2 = false;
            dynamicUI = null;
            this.isWebViewAvailable = false;
            runnable2.run();
        }
    }

    private /* synthetic */ void lambda$initiate$6() {
        ApplicationManager applicationManager = this.applicationManager;
        String string2 = this.clientId;
        if (string2 == null) {
            string2 = this.merchantClientId;
        }
        applicationManager.loadApplication(string2);
    }

    private /* synthetic */ void lambda$logMemoryInfo$1(Context context, SdkTracker sdkTracker) {
        if ((context = Utils.getMemoryInfo(context)) == null) {
            return;
        }
        Object object = new JSONObject();
        Object object2 = "available_memory";
        long l2 = context.availMem;
        object.put((String)object2, l2);
        object2 = "threshold_memory";
        l2 = context.threshold;
        object.put((String)object2, l2);
        object2 = "total_memory";
        l2 = context.totalMem;
        object.put((String)object2, l2);
        String string2 = "device";
        String string3 = "info";
        String string4 = "memory";
        String string5 = "memory_info";
        object2 = sdkTracker;
        try {
            sdkTracker.trackContext(string2, string3, string4, string5, object);
        }
        catch (Exception exception) {
            string2 = this.LOG_TAG;
            string5 = "session_info";
            object = "Exception while logging memory_info";
            string3 = "action";
            string4 = "system";
            object2 = sdkTracker;
            sdkTracker.trackAndLogException(string2, string3, string4, string5, (String)object, exception);
        }
    }

    private /* synthetic */ void lambda$new$0(JSONObject jSONObject) {
        this.sdkTracker.setLabelsToDrop(jSONObject);
    }

    private /* synthetic */ WindowInsets lambda$process$7(View view, WindowInsets windowInsets) {
        view.onApplyWindowInsets(windowInsets);
        this.insetUpdated(windowInsets);
        return windowInsets;
    }

    private /* synthetic */ void lambda$process$8(ViewGroup object, FragmentActivity fragmentActivity) {
        Object object2 = this.container;
        if (object2 == null || (object2 = object2.getParent()) != object) {
            boolean bl2;
            fragmentActivity = this.createSubLayout(fragmentActivity);
            object.addView((View)fragmentActivity);
            object2 = this.container;
            if (object2 != null && (bl2 = (object2 = object2.getParent()) instanceof ViewGroup)) {
                object2 = (ViewGroup)object2;
                FrameLayout frameLayout = this.container;
                object2.removeView((View)frameLayout);
            }
            this.dynamicUI.setContainer((FrameLayout)fragmentActivity);
            object2 = new pn1_2(this);
            object.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)object2);
            this.container = fragmentActivity;
            object2 = this.jBridge;
            ((DuiInterface)object2).setContainer((ViewGroup)object);
            object = this.dynamicUI;
            ((DynamicUI)object).setContainer((FrameLayout)fragmentActivity);
        }
    }

    private void lambda$removeFragment$12() {
        block11: {
            boolean bl2;
            Object object = this.activity;
            if (object != null && (object = this.fragment) != null && (bl2 = ((Fragment)object).isAdded())) {
                object = this.activity;
                object = ((FragmentActivity)object).getSupportFragmentManager();
                boolean bl3 = ((FragmentManager)object).K;
                if (bl3) break block11;
                Object object2 = fragmentTag;
                object2 = ((FragmentManager)object).E((String)object2);
                if (object2 == null) break block11;
                object2 = new a((FragmentManager)object);
                object = this.fragment;
                ((a)object2).i((Fragment)object);
                this.commitFragmentTransaction((k)object2);
                Object object3 = this.sdkTracker;
                String string2 = "hypersdk";
                String string3 = "info";
                String string4 = "fragment_operation";
                Object object4 = "fragment_transaction";
                String string5 = "Fragment Removed successfully";
                try {
                    ((SdkTracker)object3).trackLifecycle(string2, string3, string4, (String)object4, string5);
                }
                catch (Exception exception) {
                    object4 = exception;
                    object2 = this.sdkTracker;
                    object3 = "lifecycle";
                    string2 = "android";
                    string3 = "fragment_operation";
                    string4 = "Exception while removing fragment";
                    ((SdkTracker)object2).trackException((String)object3, string2, string3, string4, exception);
                }
            }
        }
        this.fragment = null;
    }

    private /* synthetic */ void lambda$reset$9() {
        boolean bl2;
        JBridge jBridge = this.jBridge;
        FragmentActivity fragmentActivity = this.activity;
        jBridge.clearMerchantViews(fragmentActivity);
        this.removeFragment();
        jBridge = null;
        this.activity = null;
        this.jBridge.setActivity(null);
        this.dynamicUI.resetActivity();
        this.jBridge.reset();
        this.resetBridges();
        fragmentActivity = this.container;
        if (fragmentActivity != null && (bl2 = (fragmentActivity = fragmentActivity.getParent()) instanceof ViewGroup)) {
            fragmentActivity = (ViewGroup)fragmentActivity;
            FrameLayout frameLayout = this.container;
            fragmentActivity.removeView((View)frameLayout);
        }
        this.container = null;
        this.dynamicUI.setContainer(null);
    }

    private /* synthetic */ void lambda$setBundleParameter$2(JSONObject jSONObject) {
        this.logManager.setLogHeaderValues(jSONObject, "default");
    }

    private /* synthetic */ void lambda$setBundleParameter$3() {
        this.sessionInfo.createSessionDataMap();
        this.sessionInfo.logDeviceIdentifiers();
        JSONObject jSONObject = this.sessionInfo.getSessionData();
        Object object = "merchant_id";
        Object object2 = this.sessionInfo;
        object2 = ((SessionInfo)object2).getMerchantId();
        jSONObject.put((String)object, object2);
        object = "client_id";
        object2 = this.sessionInfo;
        object2 = ((SessionInfo)object2).getClientId();
        Object object3 = "_";
        object2 = ((String)object2).split((String)object3);
        object3 = null;
        object2 = object2[0];
        object3 = Locale.getDefault();
        object2 = ((String)object2).toLowerCase((Locale)object3);
        jSONObject.put((String)object, object2);
        object = "session_id";
        object2 = this.sessionInfo;
        object2 = ((SessionInfo)object2).getSessionId();
        try {
            jSONObject.put((String)object, object2);
        }
        catch (JSONException jSONException) {
            object2 = this.sdkTracker;
            object3 = this.LOG_TAG;
            String string2 = "set_bundle_parameters";
            String string3 = "Exception while setting bundle parameter";
            String string4 = "lifecycle";
            String string5 = "hypersdk";
            ((SdkTracker)object2).trackAndLogException((String)object3, string4, string5, string2, string3, jSONException);
        }
        this.sessionInfo.logSessionInfo();
        object = new dn1_1(0, this, jSONObject);
        ExecutorManager.runOnLogSessioniserThread((Runnable)object);
    }

    private void logMemoryInfo(SdkTracker sdkTracker, Context context) {
        mn1_1 mn1_12 = new mn1_1(this, context, sdkTracker);
        ExecutorManager.runOnBackgroundThread(mn1_12);
    }

    public static /* synthetic */ WindowInsets m(JuspayServices juspayServices, View view, WindowInsets windowInsets) {
        return juspayServices.lambda$process$7(view, windowInsets);
    }

    private void prefetchBootLoaderFile(JSONObject jSONObject, boolean bl2) {
        if (!bl2) {
            return;
        }
        RemoteAssetService remoteAssetService = this.remoteAssetService;
        Context context = this.context;
        String string2 = this.getBootloaderEndpoint(jSONObject);
        long l2 = System.currentTimeMillis();
        remoteAssetService.renewFile(context, string2, null, "v1-boot_loader.zip", l2);
    }

    private void removeFragment() {
        fn1_1 fn1_12 = new fn1_1(this, 0);
        ExecutorManager.runOnMainThread(fn1_12);
    }

    private void resetBridges() {
        boolean bl2;
        Iterator iterator = this.bridgeList.getBridgeList().values().iterator();
        while (bl2 = iterator.hasNext()) {
            HyperBridge hyperBridge = (HyperBridge)iterator.next();
            hyperBridge.reset();
        }
    }

    private void setLastProcessPayload(JSONObject jSONObject) {
        this.lastProcessPayload = jSONObject;
    }

    private boolean useCommit() {
        String string2 = this.merchantClientId;
        boolean bl2 = true;
        if (string2 == null) {
            return bl2;
        }
        string2 = Utils.optJSONObject(this.sdkConfigService.getSdkConfig(), "useCommitNowClientIds");
        String string3 = this.merchantClientId;
        Locale locale = Locale.getDefault();
        string3 = string3.toLowerCase(locale).split("_")[0];
        return string2.optString(string3).equals("true") ^ bl2;
    }

    public void addJsToWebView(String string2) {
        this.dynamicUI.addJsToWebView(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ApplicationManager createApplicationManager() {
        Object object;
        boolean bl2;
        Object object2;
        Object object3;
        try {
            object3 = this.sdkConfigService;
            object3 = ((SdkConfigService)object3).getSdkConfig();
            object2 = "flags";
            object3 = object3.getJSONObject((String)object2);
            object2 = "sendUpdateNetworkMetrics";
            bl2 = object3.getBoolean((String)object2);
        }
        catch (Exception exception) {
            bl2 = true;
        }
        try {
            object2 = this.sdkConfigService;
            object2 = ((SdkConfigService)object2).getSdkConfig();
            object = "url";
            object2 = object2.getJSONObject((String)object);
            object = "assets";
            object2 = object2.getJSONObject((String)object);
            object = "prod";
            object2 = object2.getString((String)object);
        }
        catch (Exception exception) {
            object2 = "https://assets.juspay.in";
        }
        object = this.tenantParams;
        object = object != null && (object = object.getBootLoaderEndpoint()) != null ? this.tenantParams.getBootLoaderEndpoint() : "https://%sassets.juspay.in/hyper/bundles/in.juspay.merchants/%s/android/%s/release-config.json?toss=%s";
        Object object4 = object;
        Context context = this.context;
        Workspace workspace = this.workspace;
        SdkTracker sdkTracker = this.sdkTracker;
        SessionInfo sessionInfo = this.sessionInfo;
        FileProviderService fileProviderService = this.fileProviderService;
        if (bl2) {
            object3 = Ft2.a((String)object2, "/network-summary");
            return new ApplicationManager(context, (String)object4, workspace, sdkTracker, sessionInfo, fileProviderService, (String)object3);
        } else {
            bl2 = false;
            object3 = null;
        }
        return new ApplicationManager(context, (String)object4, workspace, sdkTracker, sessionInfo, fileProviderService, (String)object3);
    }

    public Activity getActivity() {
        return this.activity;
    }

    public JSONObject getAppWithPackageName(String string2, String string3) {
        block11: {
            int n3;
            JBridge jBridge = this.jBridge;
            string2 = jBridge.findApps(string2);
            try {
                jBridge = new JSONArray(string2);
                n3 = 0;
                string2 = null;
            }
            catch (Exception exception) {}
            while (true) {
                int n4 = jBridge.length();
                if (n3 >= n4) break block11;
                break;
            }
            {
                JSONObject jSONObject = jBridge.getJSONObject(n3);
                String string4 = "packageName";
                String string5 = "";
                string4 = jSONObject.optString(string4, string5);
                boolean bl2 = string4.contains(string3);
                if (bl2) {
                    return jSONObject;
                }
                ++n3;
                continue;
            }
        }
        return null;
    }

    public ApplicationManager getApplicationManager() {
        return this.applicationManager;
    }

    public JSONObject getBundleParameters() {
        return this.bundleParameters;
    }

    public FrameLayout getContainer() {
        return this.container;
    }

    public Context getContext() {
        return this.context;
    }

    public DynamicUI getDynamicUI() {
        return this.dynamicUI;
    }

    public FileProviderService getFileProviderService() {
        return this.fileProviderService;
    }

    public HyperFragment getFragment() {
        return this.fragment;
    }

    public HyperPaymentsCallback getHyperCallback() {
        return this.hyperCallback;
    }

    public JBridge getJBridge() {
        return this.jBridge;
    }

    public Map getJBridgeList() {
        return this.bridgeList.getBridgeList();
    }

    public JSONObject getLastProcessPayload() {
        return this.lastProcessPayload;
    }

    public LogManager getLogManager() {
        return this.logManager;
    }

    public PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    public RemoteAssetService getRemoteAssetService() {
        return this.remoteAssetService;
    }

    public SdkConfigService getSdkConfigService() {
        return this.sdkConfigService;
    }

    public final SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    public SdkTracker getSdkTracker() {
        return this.sdkTracker;
    }

    public SessionInfo getSessionInfo() {
        return this.sessionInfo;
    }

    public SmsServices getSmsServices() {
        return this.smsServices;
    }

    public JuspayWebViewConfigurationCallback getWebViewConfigurationCallback() {
        return this.webViewConfigurationCallback;
    }

    public String getWorkingLogger() {
        return "json-array";
    }

    public Workspace getWorkspace() {
        return this.workspace;
    }

    public void initiate(Runnable object) {
        String string2;
        this.firstTimeSetup();
        Object object2 = this.context.getResources();
        int n3 = R$bool.use_local_assets;
        boolean bl2 = object2.getBoolean(n3);
        Object object3 = this.getBundleParameters();
        if (object3 != null) {
            string2 = "useLocalAssets";
            bl2 = object3.optBoolean(string2, bl2);
        }
        object3 = this.applicationManager;
        ((ApplicationManager)object3).setShouldUpdate(bl2 ^= true);
        bl2 = this.isPrefetch;
        if (!bl2) {
            this.webViewCrashCallback = object;
            object2 = this.clientId;
            if (object2 == null) {
                object2 = this.merchantClientId;
            }
            if (object2 == null) {
                object2 = this.sdkTracker;
                object3 = "juspay_services";
                string2 = "Cannot initiate sdk as clientId is null";
                String string3 = "hypersdk";
                String string4 = "critical";
                ((SdkTracker)object2).trackContext(string3, string4, (String)object3, string2);
            } else {
                object3 = new nn1_2(this, (String)object2);
                ExecutorManager.runOnBackgroundThread((Runnable)object3);
            }
            n3 = 2;
            object2 = new pn_0(n3, this, object);
            ExecutorManager.runOnMainThread((Runnable)object2);
        } else {
            object = this.clientId;
            if (object != null || (object = this.merchantClientId) != null) {
                bl2 = false;
                object2 = null;
                object = new on1_2(this, 0);
                ExecutorManager.runOnBackgroundThread((Runnable)object);
            }
        }
    }

    public Boolean isCug() {
        boolean bl2;
        String string2 = "in.juspay.cug";
        JSONObject jSONObject = this.getAppWithPackageName("juspay://pay/cug", string2);
        if (jSONObject != null) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public String isDevQAUser() {
        String string2 = "in.juspay.devqa";
        Object object = this.getAppWithPackageName("juspay://pay/devqa", string2);
        if (object != null) {
            int n3;
            string2 = "packageName";
            String string3 = "";
            int n4 = ((String)(object = object.optString(string2, string3))).length();
            if (n4 > (n3 = 15)) {
                string3 = ((String)object).substring(n3);
            }
            return string3;
        }
        return null;
    }

    public Boolean isForceCug() {
        boolean bl2;
        String string2 = "in.juspay.cugext";
        JSONObject jSONObject = this.getAppWithPackageName("juspay://pay/cug", string2);
        if (jSONObject != null) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    public boolean isPaused() {
        return this.paused;
    }

    public boolean isPrefetch() {
        return this.isPrefetch;
    }

    public boolean isWebViewAvailable() {
        return this.isWebViewAvailable;
    }

    public void onActivityResult(int n3, int n4, Intent intent) {
        boolean bl2;
        Bundle bundle;
        Object object;
        JuspayServices juspayServices = this;
        int n7 = n3;
        int n8 = n4;
        Intent intent2 = intent;
        int n10 = -1;
        if (n4 == n10) {
            object = this.sdkTracker;
            String string2 = "result_code";
            String string3 = "RESULT_OK";
            String string4 = "hypersdk";
            String string5 = "info";
            String string6 = "on_activity_result";
            ((SdkTracker)object).trackLifecycle(string4, string5, string6, string2, string3);
            if (intent != null && (bundle = intent.getExtras()) != null) {
                object = this.sdkTracker;
                bundle = intent.getExtras();
                string3 = Utils.toJSON(bundle);
                string6 = "on_activity_result";
                string2 = "result_code";
                string4 = "hypersdk";
                string5 = "info";
                ((SdkTracker)object).trackLifecycle(string4, string5, string6, string2, string3);
            }
        } else if (n4 == 0) {
            SdkTracker sdkTracker = this.sdkTracker;
            String string7 = "result_code";
            String string8 = "RESULT_CANCELLED";
            String string9 = "hypersdk";
            String string10 = "info";
            String string11 = "on_activity_result";
            sdkTracker.trackLifecycle(string9, string10, string11, string7, string8);
        }
        bundle = juspayServices.bridgeList.getBridgeList().values().iterator();
        while (bl2 = bundle.hasNext()) {
            object = (HyperBridge)bundle.next();
            bl2 = ((HyperBridge)object).onActivityResult(n7, n8, intent2);
            if (!bl2) continue;
            return;
        }
        juspayServices.jBridge.onActivityResult(n7, n8, intent2);
    }

    public void onBackPressed() {
        this.sdkTracker.trackLifecycle("android", "info", "on_back_pressed", "class", "juspayServices");
        this.jBridge.requestKeyboardHide();
        this.jBridge.invokeFnInDUIWebview("onBackPressed", "{\"shouldShowBackPressDialog\":true}");
    }

    public void onMerchantEvent(String string2, JSONObject object) {
        Object object2 = "process";
        boolean bl2 = string2.equals(object2);
        if (bl2) {
            this.setLastProcessPayload((JSONObject)object);
        }
        object2 = this.dynamicUI;
        object = object.toString();
        String string3 = this.LOG_TAG;
        object = ((DynamicUI)object2).encodeUtfAndWrapDecode((String)object, string3);
        string2 = uc0_0.a("window.onMerchantEvent('", string2, "',", (String)object, ");");
        this.jBridge.invokeCustomFnInDUIWebview(string2);
    }

    public void onMerchantEvent(JSONObject jSONObject) {
        this.onMerchantEvent("default", jSONObject);
    }

    public void onRequestPermissionsResult(int n3, String[] stringArray, int[] nArray) {
        boolean bl2;
        Object object = this.sdkTracker;
        Object object2 = wk0_0.a(n3, "requestCode = [", "],permissions = [");
        String string2 = Arrays.toString(stringArray);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("], grantResults = [");
        string2 = Arrays.toString(nArray);
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("]");
        String string3 = ((StringBuilder)object2).toString();
        String string4 = "on_request_permission_result";
        String string5 = "data";
        object2 = "system";
        string2 = "info";
        ((SdkTracker)object).trackAction((String)object2, string2, string4, string5, string3);
        object = this.bridgeList.getBridgeList().values().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (HyperBridge)object.next();
            bl2 = ((HyperBridge)object2).onRequestPermissionResult(n3, stringArray, nArray);
            if (!bl2) continue;
            return;
        }
        this.jBridge.onRequestPermissionsResult(n3, stringArray, nArray);
    }

    public void process(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        this.smsServices.createSMSConsent();
        Object object = this.activity;
        if (fragmentActivity == object && (object = this.container) != null && viewGroup == (object = object.getParent())) {
            return;
        }
        object = this.activity;
        if (object != fragmentActivity || (object = this.container) != null && (object = object.getParent()) != viewGroup) {
            object = this.jBridge;
            FragmentActivity fragmentActivity2 = this.activity;
            ((DuiInterface)object).clearMerchantViews(fragmentActivity2);
            object = this.jBridge;
            ((DuiInterface)object).clearMerchantViews(fragmentActivity);
        }
        if (fragmentActivity != (object = this.activity)) {
            this.removeFragment();
            this.addFragment(fragmentActivity);
            this.activity = fragmentActivity;
            this.jBridge.setActivity(fragmentActivity);
            object = this.dynamicUI;
            ((DynamicUI)object).setActivity(fragmentActivity);
        }
        object = new ln1_1(this, viewGroup, fragmentActivity);
        ExecutorManager.runOnMainThread((Runnable)object);
    }

    public void requestPermission(String[] stringArray, int n3) {
        this.requestPermissionDelegate.requestPermission(stringArray, n3);
    }

    public void reset() {
        hn1_1 hn1_12 = new hn1_1(this, 0);
        ExecutorManager.runOnMainThread(hn1_12);
    }

    public void sdkDebug(String string2, String string3) {
        SdkInfo sdkInfo = this.sdkInfo;
        boolean bl2 = sdkInfo.isSdkDebuggable();
        if (bl2) {
            JuspayLogger.d(string2, string3);
        }
    }

    public void setActivityLaunchDelegate(ActivityLaunchDelegate activityLaunchDelegate) {
        this.activityLaunchDelegate = activityLaunchDelegate;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setBundleParameter(JSONObject object) {
        Exception exception2;
        String string2;
        Object object2;
        Object object3;
        block10: {
            boolean bl2;
            Object object4;
            block9: {
                block8: {
                    object3 = "clientId";
                    object2 = "environment";
                    string2 = "sdkName";
                    try {
                        object4 = this.sdkInfo;
                        object4 = ((SdkInfo)object4).getSdkName();
                        object.put(string2, object4);
                        string2 = "sdkVersion";
                        object4 = this.sdkInfo;
                        object4 = ((SdkInfo)object4).getSdkVersion();
                        object.put(string2, object4);
                        this.bundleParameters = object;
                        string2 = "payload";
                        string2 = object.getJSONObject(string2);
                        boolean bl3 = string2.has((String)object2);
                        Object var7_9 = null;
                        if (!bl3) break block8;
                        object2 = string2.getString((String)object2);
                        object4 = "sandbox";
                        bl2 = ((String)object2).equalsIgnoreCase((String)object4);
                        break block9;
                    }
                    catch (Exception exception2) {
                        break block10;
                    }
                }
                bl2 = false;
                object2 = null;
            }
            object4 = this.sdkTracker;
            object2 = bl2;
            ((SdkTracker)object4).setEndPointSandbox((Boolean)object2);
            bl2 = string2.has((String)object3);
            if (bl2) {
                this.merchantClientId = object3 = string2.getString((String)object3);
            }
            this.setUpMerchantFragments((JSONObject)string2);
            object3 = this.sessionInfo;
            ((SessionInfo)object3).setBundleParams((JSONObject)object);
            object = this.isDevQAUser();
            if (object != null) {
                object3 = this.applicationManager;
                object2 = new Mode$DevQa((String)object);
                ((ApplicationManager)object3).setMode((Mode)object2);
            } else {
                boolean bl4;
                object = this.bundleParameters;
                if (object != null && (bl4 = object.optBoolean((String)(object3 = "betaAssets"), false))) {
                    object = this.applicationManager;
                    object3 = Mode$Beta.INSTANCE;
                    ((ApplicationManager)object).setMode((Mode)object3);
                } else {
                    object = this.isCug();
                    bl4 = (Boolean)object;
                    if (bl4 || (bl4 = ((Boolean)(object = this.isForceCug())).booleanValue())) {
                        object = this.applicationManager;
                        object3 = Mode$CUG.INSTANCE;
                        ((ApplicationManager)object).setMode((Mode)object3);
                    }
                }
            }
            object3 = null;
            object = new gn1_1(this, 0);
            ExecutorManager.runOnBackgroundThread((Runnable)object);
            return;
        }
        object3 = this.sdkTracker;
        object2 = this.LOG_TAG;
        String string3 = "set_bundle_parameters";
        String string4 = "Exception while setting bundle parameter";
        string2 = "lifecycle";
        String string5 = "hypersdk";
        ((SdkTracker)object3).trackAndLogException((String)object2, string2, string5, string3, string4, exception2);
    }

    public void setHyperCallback(HyperPaymentsCallback hyperPaymentsCallback) {
        this.hyperCallback = hyperPaymentsCallback;
    }

    public void setIntentSenderDelegate(IntentSenderDelegate intentSenderDelegate) {
        this.intentSenderDelegate = intentSenderDelegate;
    }

    public void setPrefetch(boolean bl2) {
        this.isPrefetch = bl2;
    }

    public void setRequestPermissionDelegate(RequestPermissionDelegate requestPermissionDelegate) {
        this.requestPermissionDelegate = requestPermissionDelegate;
    }

    /*
     * Unable to fully structure code
     */
    public void setUpMerchantFragments(JSONObject var1_1) {
        block15: {
            var2_2 = "fragmentViewGroups";
            var3_3 = var1_1.has((String)var2_2);
            if (var3_3 && (var4_4 = this.activity) != null) {
                var1_1 = var1_1.getJSONObject((String)var2_2);
                try {
                    var2_2 = var1_1.keys();
                }
lbl12:
                // 12 sources

                catch (JSONException v0) {}
                while (true) {
                    var3_3 = var2_2.hasNext();
                    if (!var3_3) break block15;
                    break;
                }
                {
                    var4_4 = var2_2.next();
                    var4_4 = (String)var4_4;
                    ** try [egrp 5[TRYBLOCK] [5 : 63->68)] { 
lbl18:
                    // 1 sources

                    var5_5 = var1_1.opt((String)var4_4);
                    var6_6 = var5_5 instanceof ViewGroup;
                    if (!var6_6) continue;
                    var7_7 = this.activity;
                    var7_7 = this.createSubLayout(var7_7);
                    var5_5 = (ViewGroup)var5_5;
                    var5_5.addView((View)var7_7);
                    var5_5 = this.dynamicUI;
                    var5_5 = var5_5.addToContainerList((ViewGroup)var7_7);
                    var1_1.put((String)var4_4, var5_5);
                    continue;
                }
            }
        }
    }

    public void setWebViewConfigurationCallback(JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback) {
        this.webViewConfigurationCallback = juspayWebViewConfigurationCallback;
    }

    public void startActivityForResult(Intent intent, int n3, Bundle bundle) {
        this.activityLaunchDelegate.startActivityForResult(intent, n3, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n3, Intent intent, int n4, int n7, int n8, Bundle bundle) {
        this.intentSenderDelegate.startIntentSenderForResult(intentSender, n3, intent, n4, n7, n8, bundle);
    }

    public void terminate() {
        boolean bl2;
        MPINUtil.closeAllConnections(this.getContext());
        this.jBridge.reset();
        Object object = this.createApplicationManager();
        this.applicationManager = object;
        Object object2 = this.dynamicUI;
        ((DynamicUI)object2).setApplicationManager((ApplicationManager)object);
        object = this.bridgeList.getBridgeList().values().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (HyperBridge)object.next();
            ((HyperBridge)object2).terminate();
        }
        object = this.activityLaunchDelegate;
        bl2 = object instanceof HyperActivityLaunchDelegate;
        if (bl2) {
            object = (HyperActivityLaunchDelegate)object;
            ((HyperActivityLaunchDelegate)object).clearQueue();
        }
        if (bl2 = (object = this.intentSenderDelegate) instanceof HyperIntentSenderDelegate) {
            object = (HyperIntentSenderDelegate)object;
            ((HyperIntentSenderDelegate)object).clearQueue();
        }
        if (bl2 = (object = this.requestPermissionDelegate) instanceof HyperRequestPermissionDelegate) {
            object = (HyperRequestPermissionDelegate)object;
            ((HyperRequestPermissionDelegate)object).clearQueue();
        }
        this.dynamicUI.terminate();
        this.smsServices.unregisterSmsConsent();
    }
}

