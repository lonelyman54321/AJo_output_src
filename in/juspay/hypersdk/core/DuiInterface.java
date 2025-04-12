/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.KeyguardManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.ConnectivityManager
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Message
 *  android.util.Base64
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.webkit.CookieSyncManager
 *  android.webkit.URLUtil
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieSyncManager;
import android.webkit.URLUtil;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.ResultAwaitingDuiHook;
import in.juspay.hypersdk.core.AcsInterface;
import in.juspay.hypersdk.core.DuiInterface$1;
import in.juspay.hypersdk.core.DuiInterface$2;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.HyperJsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.MPINUtil;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.core.PaymentUtils;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.services.Workspace;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersmshandler.JuspayDuiHook;
import in.juspay.hypersmshandler.OnResultHook;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.SmsEventInterface$RetrieverEvents;
import in.juspay.hypersmshandler.SmsServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DuiInterface
extends HyperJsInterface
implements CallbackInvoker {
    private static final String LOG_TAG = "DuiInterface";
    protected Activity activity;
    protected Map callBackMapper;
    private ViewGroup container;
    private final Context context;
    private Godel godelManager;
    private int lastFocusedEditView;
    protected Map listenerMap;
    private final ArrayList merchantViewIds;
    private final RemoteAssetService remoteAssetService;
    private final SdkTracker sdkTracker;
    protected final SessionInfo sessionInfo;

    public DuiInterface(JuspayServices hashMap) {
        super((JuspayServices)((Object)hashMap));
        Object object;
        this.merchantViewIds = object = new ArrayList();
        this.lastFocusedEditView = -1;
        this.context = object = ((JuspayServices)((Object)hashMap)).getContext();
        object = ((JuspayServices)((Object)hashMap)).getSdkTracker();
        this.sdkTracker = object;
        object = ((JuspayServices)((Object)hashMap)).getSessionInfo();
        this.sessionInfo = object;
        hashMap = ((JuspayServices)((Object)hashMap)).getRemoteAssetService();
        this.remoteAssetService = hashMap;
        this.listenerMap = hashMap = new HashMap();
        this.callBackMapper = hashMap = new HashMap();
    }

    public static /* synthetic */ Context access$000(DuiInterface duiInterface) {
        return duiInterface.context;
    }

    public static /* synthetic */ void d(DuiInterface duiInterface, int n3, String string2) {
        duiInterface.lambda$attachMerchantView$1(n3, string2);
    }

    public static /* synthetic */ void e(DuiInterface duiInterface) {
        duiInterface.lambda$suppressKeyboard$8();
    }

    public static /* synthetic */ void f(DuiInterface duiInterface, Activity activity) {
        duiInterface.lambda$clearMerchantViews$0(activity);
    }

    public static /* synthetic */ void g(DuiInterface duiInterface, String string2, SdkTracker sdkTracker) {
        duiInterface.lambda$runInJuspayBrowser$3(string2, sdkTracker);
    }

    public static /* synthetic */ void h(DuiInterface duiInterface) {
        duiInterface.lambda$onDuiReady$2();
    }

    public static /* synthetic */ void i(DuiInterface duiInterface, String string2, String string3, SdkTracker sdkTracker) {
        duiInterface.lambda$runInJuspayBrowser$4(string2, string3, sdkTracker);
    }

    public static /* synthetic */ void j(DuiInterface duiInterface, String string2, JuspayWebView juspayWebView) {
        duiInterface.lambda$runInJuspayWebView$5(string2, juspayWebView);
    }

    public static /* synthetic */ void k(DuiInterface duiInterface) {
        duiInterface.lambda$requestKeyboardHide$9();
    }

    public static /* synthetic */ void l(DuiInterface duiInterface, String string2) {
        duiInterface.lambda$requestKeyboardShow$7(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$attachMerchantView$1(int n3, String string2) {
        Exception exception2;
        block5: {
            Object object;
            Activity activity;
            block4: {
                block3: {
                    try {
                        activity = this.activity;
                        if (activity == null) break block3;
                        activity = activity.findViewById(n3);
                        activity = (ViewGroup)activity;
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                activity = null;
            }
            if (activity == null && (object = this.container) != null) {
                activity = object.findViewById(n3);
                activity = (ViewGroup)activity;
            }
            object = this.juspayServices;
            object = ((JuspayServices)object).getHyperCallback();
            if (activity == null) return;
            if (object == null) return;
            ArrayList arrayList = this.merchantViewIds;
            Object object2 = n3;
            arrayList.add(object2);
            object2 = MerchantViewType.valueOf(string2);
            object2 = object.getMerchantView((ViewGroup)activity, (MerchantViewType)((Object)object2));
            if (object2 == null) return;
            activity.addView((View)object2);
            return;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string3 = "jbridge";
        String string4 = "Error while attaching merchant view";
        String string5 = LOG_TAG;
        String string6 = "action";
        String string7 = "system";
        sdkTracker.trackAndLogException(string5, string6, string7, string3, string4, exception2);
    }

    private /* synthetic */ void lambda$clearMerchantViews$0(Activity activity) {
        int n3;
        Iterator iterator = this.merchantViewIds.iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            n3 = (Integer)iterator.next();
            View view = activity.findViewById(n3);
            boolean bl2 = view instanceof ViewGroup;
            if (!bl2) continue;
            view = (ViewGroup)view;
            view.removeAllViews();
        }
    }

    private static /* synthetic */ void lambda$loadUrl$6(String object, JuspayWebView juspayWebView, String string2) {
        if (object != null) {
            object = ((String)object).getBytes();
            juspayWebView.postUrl(string2, (byte[])object);
        } else {
            juspayWebView.loadUrl(string2);
        }
    }

    private /* synthetic */ void lambda$onDuiReady$2() {
        Godel godel = this.godelManager;
        if (godel != null) {
            return;
        }
        JuspayServices juspayServices = this.juspayServices;
        this.godelManager = godel = new Godel(juspayServices);
        godel.setupAllowedDeeplinkPackages();
        this.godelManager.onDuiReady();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$requestKeyboardHide$9() {
        Exception exception2;
        block4: {
            Activity activity;
            block3: {
                try {
                    activity = this.activity;
                    if (activity == null) return;
                    if ((activity = activity.getCurrentFocus()) != null) break block3;
                    activity = this.activity;
                    activity = activity.getWindow();
                    activity = activity.getDecorView();
                }
                catch (Exception exception2) {
                    Exception exception3 = exception2;
                    break block4;
                }
            }
            Object object = this.activity;
            String string2 = "input_method";
            object = object.getSystemService(string2);
            if ((object = (InputMethodManager)object) != null && (string2 = activity.getRootView()) != null) {
                activity = activity.getRootView();
                activity = activity.getWindowToken();
                string2 = null;
                object.hideSoftInputFromWindow((IBinder)activity, 0);
                SdkTracker sdkTracker = this.sdkTracker;
                String string3 = "system";
                String string4 = "info";
                String string5 = "keyboard";
                String string6 = "hidden";
                String string7 = "success";
                sdkTracker.trackAction(string3, string4, string5, string6, string7);
                return;
            }
            object = this.sdkTracker;
            string2 = "system";
            String string8 = "error";
            String string9 = "keyboard";
            String string10 = "hidden";
            String string11 = "failed";
            ((SdkTracker)object).trackAction(string2, string8, string9, string10, string11);
            return;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string12 = "keyboard";
        String string13 = "Hide Keyboard Exception";
        String string14 = LOG_TAG;
        String string15 = "action";
        String string16 = "system";
        sdkTracker.trackAndLogException(string14, string15, string16, string12, string13, exception2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$requestKeyboardShow$7(String string2) {
        Exception exception2;
        block6: {
            int n3;
            int n4;
            View view;
            int n7;
            int n8;
            String string3;
            Object object;
            int n10;
            block5: {
                block4: {
                    try {
                        Activity activity = this.activity;
                        if (activity == null) return;
                        n10 = Integer.parseInt(string2);
                        object = this.activity;
                        string3 = "input_method";
                        object = object.getSystemService(string3);
                        object = (InputMethodManager)object;
                        string3 = this.activity;
                        string3 = string3.findViewById(n10);
                        n8 = this.lastFocusedEditView;
                        n7 = -1;
                        if (n8 == n7) break block4;
                        Activity activity2 = this.activity;
                        view = activity2.findViewById(n8);
                        break block5;
                    }
                    catch (Exception exception2) {
                        break block6;
                    }
                }
                n8 = 0;
                view = null;
            }
            if (object != null && string3 != null) {
                if (view != null && (n7 = this.lastFocusedEditView) != n10) {
                    view.clearFocus();
                }
                string3.requestFocus();
                n8 = 1;
                object.showSoftInput((View)string3, n8);
            }
            if (n10 == (n4 = this.lastFocusedEditView)) return;
            this.lastFocusedEditView = n3 = Integer.parseInt(string2);
            return;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string4 = "keyboard";
        String string5 = "Show Keyboard Exception";
        String string6 = LOG_TAG;
        String string7 = "action";
        String string8 = "system";
        sdkTracker.trackAndLogException(string6, string7, string8, string4, string5, exception2);
    }

    private /* synthetic */ void lambda$runInJuspayBrowser$3(String string2, SdkTracker sdkTracker) {
        block9: {
            Object object = this.activity;
            if (object != null) {
                int n3 = Integer.parseInt(string2);
                string2 = object.findViewById(n3);
                object = this.juspayServices;
                object = ((JuspayServices)object).getHyperCallback();
                if (object == null) break block9;
                object = this.juspayServices;
                object = ((JuspayServices)object).getHyperCallback();
                try {
                    object.onStartWaitingDialogCreated((View)string2);
                }
                catch (Exception exception) {
                    String string3 = "run_in_juspay_browser";
                    String string4 = "Exception while trying to find a view";
                    String string5 = LOG_TAG;
                    String string6 = "lifecycle";
                    String string7 = "hypersdk";
                    object = sdkTracker;
                    sdkTracker.trackAndLogException(string5, string6, string7, string3, string4, exception);
                }
            }
        }
    }

    private /* synthetic */ void lambda$runInJuspayBrowser$4(String object, String string2, SdkTracker sdkTracker) {
        block9: {
            Object object2 = this.juspayServices;
            object2 = ((JuspayServices)object2).getHyperCallback();
            if (object2 == null) break block9;
            object2 = new JSONObject((String)object);
            object = this.juspayServices;
            object = ((JuspayServices)object).getHyperCallback();
            Object object3 = new DuiInterface$2(this, string2, sdkTracker);
            try {
                object.onEvent((JSONObject)object2, (JuspayResponseHandler)object3);
            }
            catch (Exception exception) {
                String string3 = "run_in_juspay_browser";
                String string4 = "Exception in onEvent handler";
                object3 = LOG_TAG;
                String string5 = "lifecycle";
                String string6 = "hypersdk";
                object2 = sdkTracker;
                sdkTracker.trackAndLogException((String)object3, string5, string6, string3, string4, exception);
            }
        }
    }

    private /* synthetic */ void lambda$runInJuspayWebView$5(String object, JuspayWebView object2) {
        SdkTracker sdkTracker;
        String string2;
        object.getClass();
        int n3 = -1;
        int n4 = ((String)object).hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 1275285273: {
                string2 = "loadFirstPage";
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 6;
                break;
            }
            case -318289731: {
                string2 = "goForward";
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 5;
                break;
            }
            case -934641255: {
                string2 = "reload";
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 4;
                break;
            }
            case -1241591313: {
                string2 = "goBack";
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 3;
                break;
            }
            case -1326530834: {
                string2 = "requestPasswordKeyboardShow";
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 2;
                break;
            }
            case -1576267742: {
                string2 = "requestNumericKeyboardShow";
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 1;
                break;
            }
            case -2056769213: {
                string2 = "requestPhoneKeyboardShow";
                n4 = (int)(((String)object).equals(string2) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 0;
                sdkTracker = null;
            }
        }
        switch (n3) {
            default: {
                object2 = this.juspayServices;
                sdkTracker = ((JuspayServices)object2).getSdkTracker();
                String string3 = "run_in_juspay_webview";
                String string4 = "missing";
                string2 = "system";
                String string5 = "error";
                sdkTracker.trackAction(string2, string5, string3, string4, object);
                break;
            }
            case 6: {
                object = this.godelManager;
                if (object == null) break;
                ((Godel)object).loadPage();
                break;
            }
            case 5: {
                object2.goForward();
                break;
            }
            case 4: {
                PaymentUtils.refreshPage((JuspayWebView)((Object)object2));
                break;
            }
            case 3: {
                object2.goBack();
                break;
            }
            case 2: {
                ((JuspayWebView)((Object)object2)).requestPasswordKeyboardShow();
                break;
            }
            case 1: {
                ((JuspayWebView)((Object)object2)).requestNumericKeyboardShow();
                break;
            }
            case 0: {
                ((JuspayWebView)((Object)object2)).requestPhoneKeyboardShow();
            }
        }
    }

    private /* synthetic */ void lambda$suppressKeyboard$8() {
        Activity activity = this.activity;
        if (activity != null) {
            activity = activity.getWindow();
            int n3 = 3;
            activity.setSoftInputMode(n3);
        }
    }

    public static /* synthetic */ void m(String string2, JuspayWebView juspayWebView, String string3) {
        DuiInterface.lambda$loadUrl$6(string2, juspayWebView, string3);
    }

    private void trackWebViewEvent(String string2) {
        this.sdkTracker.trackLifecycle("hypersdk", "info", string2, "message", "Received event from web view.");
    }

    public void addDataToSharedPrefs(String string2, String string3) {
        this.workspace.writeToSharedPreference(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void attach(String object, String object2, String string2) {
        Exception exception2;
        String string3;
        Object object3;
        CharSequence charSequence;
        block19: {
            int n3;
            block20: {
                block22: {
                    block23: {
                        block24: {
                            block25: {
                                int n4;
                                int n7;
                                int n8;
                                int n10;
                                int n14;
                                block21: {
                                    object2 = "Unknown Hook: ";
                                    n3 = this.isHookSupported((String)object);
                                    charSequence = LOG_TAG;
                                    if (n3 == 0) {
                                        object2 = new StringBuilder("Unsupported hook: ");
                                        ((StringBuilder)object2).append((String)object);
                                        object = ((StringBuilder)object2).toString();
                                        JuspayLogger.e((String)charSequence, (String)object);
                                        return;
                                    }
                                    try {
                                        object3 = new String[]{object};
                                        this.detach((String[])object3);
                                        n3 = ((String)object).hashCode();
                                        n14 = 2;
                                        n10 = 1;
                                        n8 = 5;
                                        string3 = "SMS_RETRIEVER";
                                        n7 = 4;
                                        n4 = 3;
                                    }
                                    catch (Exception exception2) {
                                        break block19;
                                    }
                                    switch (n3) {
                                        default: {
                                            break;
                                        }
                                        case 2031367170: {
                                            object3 = "SEND_SMS";
                                            n3 = (int)(((String)object).equals(object3) ? 1 : 0);
                                            if (n3 == 0) break;
                                            n3 = 3;
                                            break block21;
                                        }
                                        case 1205336831: {
                                            object3 = "DELIVER_SMS";
                                            n3 = (int)(((String)object).equals(object3) ? 1 : 0);
                                            if (n3 == 0) break;
                                            n3 = 4;
                                            break block21;
                                        }
                                        case -74735600: {
                                            n3 = (int)(((String)object).equals(string3) ? 1 : 0);
                                            if (n3 == 0) break;
                                            n3 = 5;
                                            break block21;
                                        }
                                        case -901079619: {
                                            object3 = "SMS_RECEIVE";
                                            n3 = (int)(((String)object).equals(object3) ? 1 : 0);
                                            if (n3 == 0) break;
                                            n3 = 1;
                                            break block21;
                                        }
                                        case -1031869708: {
                                            object3 = "SMS_CONSENT";
                                            n3 = (int)(((String)object).equals(object3) ? 1 : 0);
                                            if (n3 == 0) break;
                                            n3 = 0;
                                            object3 = null;
                                            break block21;
                                        }
                                        case -1102737597: {
                                            object3 = "NETWORK_STATUS";
                                            n3 = (int)(((String)object).equals(object3) ? 1 : 0);
                                            if (n3 == 0) break;
                                            n3 = 2;
                                            break block21;
                                        }
                                    }
                                    n3 = -1;
                                }
                                if (n3 == 0) break block22;
                                if (n3 == n10) break block23;
                                if (n3 == n14) break block24;
                                if (n3 == n4) break block25;
                                if (n3 != n7) {
                                    if (n3 != n8) {
                                        object3 = this.juspayServices;
                                        object2 = ((String)object2).concat((String)object);
                                        ((JuspayServices)object3).sdkDebug((String)charSequence, (String)object2);
                                        object2 = null;
                                        break block20;
                                    } else {
                                        object2 = this.juspayServices;
                                        object2 = ((JuspayServices)object2).getSmsServices();
                                        object2 = ((SmsServices)object2).createSmsRetriever();
                                    }
                                    break block20;
                                } else {
                                    object2 = this.juspayServices;
                                    object2 = ((JuspayServices)object2).getSmsServices();
                                    object2 = ((SmsServices)object2).createDeliveredSMSReceiver();
                                }
                                break block20;
                            }
                            object2 = this.juspayServices;
                            object2 = ((JuspayServices)object2).getSmsServices();
                            object2 = ((SmsServices)object2).createSendSMSReceiver();
                            break block20;
                        }
                        object2 = this.juspayServices;
                        object2 = PaymentUtils.getConnectivityReceiver((JuspayServices)object2);
                        break block20;
                    }
                    object2 = this.juspayServices;
                    object2 = ((JuspayServices)object2).getSmsServices();
                    object2 = ((SmsServices)object2).createSMSReceiver();
                    break block20;
                }
                object2 = this.juspayServices;
                object2 = ((JuspayServices)object2).getSmsServices();
                object2 = ((SmsServices)object2).createSmsReceiverForConsent();
            }
            if (object2 != null && (object3 = this.activity) != null) {
                object3 = this.listenerMap;
                object3.put(object, object2);
                n3 = (int)(string3.equals(object) ? 1 : 0);
                if (n3 != 0) {
                    object3 = this.callBackMapper;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object);
                    object = SmsEventInterface$RetrieverEvents.ON_ATTACH;
                    ((StringBuilder)charSequence).append(object);
                    object = ((StringBuilder)charSequence).toString();
                    object3.put(object, string2);
                } else {
                    object3 = this.callBackMapper;
                    object3.put(object, string2);
                }
                object = this.activity;
                object2.attach((Activity)object);
                return;
            }
            object = this.juspayServices;
            object2 = "Nothing to attach";
            ((JuspayServices)object).sdkDebug((String)charSequence, (String)object2);
            return;
        }
        object3 = this.sdkTracker;
        String string4 = "jbridge";
        string3 = "Error while retrieving arguments";
        charSequence = LOG_TAG;
        String string5 = "action";
        String string6 = "system";
        ((SdkTracker)object3).trackAndLogException((String)charSequence, string5, string6, string4, string3, exception2);
    }

    public void attachMerchantView(int n3, String string2) {
        Object object = this.juspayServices.getHyperCallback();
        if (object != null) {
            object = new qw0_2(this, n3, string2);
            ExecutorManager.runOnMainThread((Runnable)object);
        }
    }

    public String checkPermission(String[] stringArray) {
        JSONObject jSONObject = new JSONObject();
        int n3 = stringArray.length;
        String string2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = stringArray[i3];
            String string4 = "android.permission.";
            Object object = "";
            string4 = string3.replace(string4, (CharSequence)object);
            object = this.juspayServices;
            boolean bl2 = Utils.checkIfGranted((JuspayServices)object, string3);
            try {
                jSONObject.put(string4, bl2);
                continue;
            }
            catch (JSONException jSONException) {
                SdkTracker sdkTracker = this.sdkTracker;
                object = "read_sms_permission";
                String string5 = "Error while inserting in json";
                string2 = LOG_TAG;
                string3 = "action";
                string4 = "system";
                sdkTracker.trackAndLogException(string2, string3, string4, (String)object, string5, jSONException);
                break;
            }
        }
        return jSONObject.toString();
    }

    public String checkReadSMSPermission() {
        String string2 = "android.permission.RECEIVE_SMS";
        String string3 = "";
        Object object = "android.permission.";
        String string4 = "android.permission.READ_SMS";
        JSONObject jSONObject = new JSONObject();
        Object object2 = string4.replace((CharSequence)object, string3);
        Object object3 = this.juspayServices;
        boolean bl2 = Utils.checkIfGranted((JuspayServices)object3, string4);
        jSONObject.put((String)object2, bl2);
        string3 = string2.replace((CharSequence)object, string3);
        object = this.juspayServices;
        boolean bl3 = Utils.checkIfGranted((JuspayServices)object, string2);
        try {
            jSONObject.put(string3, bl3);
        }
        catch (JSONException jSONException) {
            object2 = this.sdkTracker;
            String string5 = "read_sms_permission";
            String string6 = "Error while inserting in json";
            object3 = LOG_TAG;
            String string7 = "action";
            String string8 = "system";
            ((SdkTracker)object2).trackAndLogException((String)object3, string7, string8, string5, string6, jSONException);
        }
        return jSONObject.toString();
    }

    public void clearMerchantViews(Activity activity) {
        if (activity == null) {
            return;
        }
        tw0_2 tw0_22 = new tw0_2(0, this, activity);
        ExecutorManager.runOnMainThread(tw0_22);
    }

    public void closeBrowser(String string2) {
        this.reset();
    }

    public void detach(String[] stringArray) {
        int n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = this.listenerMap;
            String string2 = stringArray[i3];
            boolean bl2 = object.containsKey(string2);
            if (!bl2 || (object = this.activity) == null) continue;
            object = this.listenerMap.get(string2);
            bl2 = object instanceof JuspayDuiHook;
            if (bl2 && (object = (JuspayDuiHook)this.listenerMap.get(string2)) != null) {
                Activity activity = this.activity;
                object.detach(activity);
            }
            object = this.listenerMap;
            object.remove(string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void doHandShake(String object, String string2) {
        Exception exception;
        Object object2 = "Doing handshake with following parameters: ";
        try {
            Object object3 = this.sdkTracker;
            String string3 = "system";
            String string4 = "info";
            String string5 = "jbridge";
            Object object4 = "dui_interface_do_handshake";
            CharSequence charSequence = new StringBuilder((String)object2);
            charSequence.append((String)object);
            charSequence = charSequence.toString();
            ((SdkTracker)object3).trackAction(string3, string4, string5, (String)object4, charSequence);
            object2 = new JSONObject((String)object);
            object = "packageName";
            object3 = object2.getString((String)object);
            object = "className";
            string3 = object2.getString((String)object);
            object = "code";
            int n3 = object2.getInt((String)object);
            object = "payload";
            object = object2.getString((String)object);
            object2 = new JSONObject((String)object);
            string5 = new Bundle();
            object = object2.keys();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    object4 = this.juspayServices;
                    charSequence = string2;
                    MPINUtil.communicate((String)object3, string3, n3, (Bundle)string5, (JuspayServices)object4, string2);
                    return;
                }
                object4 = object.next();
                object4 = (String)object4;
                charSequence = object2.getString((String)object4);
                string5.putString((String)object4, (String)charSequence);
            }
        }
        catch (Exception exception2) {
            exception = exception2;
        }
        JuspayServices juspayServices = this.juspayServices;
        int n4 = -1;
        MPINUtil.reportBindFailure(n4, juspayServices, string2);
        object2 = this.sdkTracker;
        String string6 = "jbridge";
        String string7 = "Exception at doHandShake";
        String string8 = LOG_TAG;
        String string9 = "action";
        String string10 = "system";
        ((SdkTracker)object2).trackAndLogException(string8, string9, string10, string6, string7, exception);
    }

    public void enableWebViewRecreate(String string2) {
        DynamicUI dynamicUI = this.juspayServices.getDynamicUI();
        boolean bl2 = string2.equals("true");
        dynamicUI.setWebViewRecreate(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String execute(String object, String string2, String string3, String charSequence) {
        block7: {
            JSONException jSONException;
            Object object2;
            block8: {
                Object object3;
                JSONObject jSONObject;
                object2 = "SMS_RETRIEVER";
                try {
                    jSONObject = new JSONObject(string3);
                    object3 = this.listenerMap;
                    boolean bl2 = object3.containsKey(object);
                    if (!bl2 || (object3 = this.activity) == null) break block7;
                    object3 = this.listenerMap;
                    object3 = object3.get(object);
                    if ((object3 = (JuspayDuiHook)object3) == null) {
                        return "__failed";
                    }
                }
                catch (JSONException jSONException2) {
                    jSONException = jSONException2;
                    break block8;
                }
                boolean bl3 = ((String)object2).equals(object);
                if (bl3) {
                    object = "getOtp";
                    bl3 = ((String)object).equals(string2);
                    if (bl3) {
                        object = this.callBackMapper;
                        StringBuilder stringBuilder = new StringBuilder((String)object2);
                        object2 = SmsEventInterface$RetrieverEvents.ON_RECEIVE;
                        stringBuilder.append(object2);
                        object2 = stringBuilder.toString();
                        object.put(object2, charSequence);
                    } else {
                        object = "cancel";
                        bl3 = ((String)object).equals(string2);
                        if (bl3) {
                            object = this.callBackMapper;
                            charSequence = new StringBuilder((String)object2);
                            object2 = SmsEventInterface$RetrieverEvents.ON_RECEIVE;
                            ((StringBuilder)charSequence).append(object2);
                            charSequence = ((StringBuilder)charSequence).toString();
                            object2 = null;
                            object.put(charSequence, null);
                        }
                    }
                }
                object = this.activity;
                return object3.execute((Activity)object, string2, jSONObject);
            }
            object2 = this.sdkTracker;
            String string4 = "Error while executing ";
            charSequence = " with args ";
            String string5 = UX.c(string4, string2, (String)charSequence, string3);
            String string6 = "system";
            String string7 = "jbridge";
            String string8 = LOG_TAG;
            String string9 = "action";
            ((SdkTracker)object2).trackAndLogException(string8, string9, string6, string7, string5, jSONException);
        }
        return "";
    }

    public String fetchFromInbox(String string2) {
        return this.juspayServices.getSmsServices().fetchSms(string2, "inbox", null);
    }

    public void fetchSMS(String string2, String string3, String string4, String string5) {
        string2 = this.juspayServices.getSmsServices().fetchSms(string2, string3, string4);
        this.invokeCallbackInDUIWebview(string5, string2);
    }

    public String findViewType(String object) {
        block16: {
            JuspayServices juspayServices;
            block15: {
                block14: {
                    block13: {
                        try {
                            juspayServices = this.juspayServices;
                        }
                        catch (Exception exception) {}
                        juspayServices = juspayServices.getContainer();
                        if (juspayServices == null) break block13;
                        juspayServices = this.juspayServices;
                        juspayServices = juspayServices.getContainer();
                        int n3 = Integer.parseInt((String)object);
                        juspayServices = juspayServices.findViewById(n3);
                        break block14;
                    }
                    juspayServices = null;
                }
                if (juspayServices == null) {
                    Activity activity = this.activity;
                    if (activity == null) break block15;
                    int n4 = Integer.parseInt((String)object);
                    juspayServices = activity.findViewById(n4);
                }
            }
            if (juspayServices == null) break block16;
            object = juspayServices.getClass();
            return ((Class)object).getName();
        }
        return "";
    }

    public String getActivityData(String string2) {
        return this.juspayServices.getDynamicUI().getActivityData(string2);
    }

    public String getClipboardItems() {
        return "[]";
    }

    public String getConfigVariables() {
        JuspayServices juspayServices;
        try {
            juspayServices = this.juspayServices;
        }
        catch (JSONException jSONException) {
            JuspayLogger.e(LOG_TAG, "", jSONException);
            return "var clientId = null;var juspayDeviceId = null;var juspayAndroidId = null;var godelRemotesVersion = null;var godelVersion = null;var buildVersion = null;var os_version = null;";
        }
        juspayServices = juspayServices.getContext();
        Object object = this.juspayServices;
        object = ((JuspayServices)object).getSessionInfo();
        return PaymentUtils.getConfigVariableDeclarations((Context)juspayServices, (SessionInfo)object);
    }

    public String getDataFromSharedPrefs(String string2, String string3) {
        return this.workspace.getFromSharedPreference(string2, string3);
    }

    public String getIndexBundleHash(String string2) {
        Object object = ".zip";
        String string3 = ".jsa";
        string2 = string2.replace((CharSequence)object, string3);
        String string4 = "/";
        int n3 = string2.lastIndexOf(string4) + 1;
        string2 = string2.substring(n3).replace((CharSequence)object, string3);
        object = this.remoteAssetService;
        string2 = ((RemoteAssetService)object).getMetadata(string2);
        object = "hashInDisk";
        try {
            string2 = string2.getString((String)object);
        }
        catch (Exception exception) {
            object = this.sdkTracker;
            String string5 = "jbridge";
            String string6 = "exception during IndexBundleHash";
            string3 = LOG_TAG;
            string4 = "action";
            String string7 = "system";
            ((SdkTracker)object).trackAndLogException(string3, string4, string7, string5, string6, exception);
            string2 = null;
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getKeysInSharedPrefs() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator iterator = this.workspace;
            iterator = ((Workspace)((Object)iterator)).getKeysInSharedPreference();
            iterator = iterator.iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = iterator.hasNext())) {
                    return jSONArray.toString();
                }
                Object object = iterator.next();
                object = (String)object;
                jSONArray.put(object);
            }
        }
        catch (Exception exception) {}
        this.sdkTracker.trackAndLogException(LOG_TAG, "action", "system", "SharedPref", "Exception while getting all keys from shared prefs", exception);
        return "[]";
    }

    public String getNetworkType() {
        return this.sessionInfo.getNetworkInfo();
    }

    public String getPackageInfo(String string2) {
        JuspayServices juspayServices;
        try {
            juspayServices = this.juspayServices;
        }
        catch (Exception exception) {
            this.sdkTracker.trackAction("system", "debug", "jbridge", "Exception at getPackageInfo", exception);
            return "{}";
        }
        juspayServices = juspayServices.getContext();
        juspayServices = juspayServices.getPackageManager();
        String string3 = null;
        string2 = juspayServices.getPackageInfo(string2, 0);
        juspayServices = new JSONObject();
        string3 = "packageName";
        String string4 = ((PackageInfo)string2).packageName;
        juspayServices.put(string3, string4);
        string3 = "versionName";
        string4 = ((PackageInfo)string2).versionName;
        juspayServices.put(string3, string4);
        string3 = "versionCode";
        int n3 = ((PackageInfo)string2).versionCode;
        juspayServices.put(string3, n3);
        return juspayServices.toString();
    }

    public String getPaymentDetails() {
        return this.juspayServices.getPaymentSessionInfo().getPaymentDetails().toString();
    }

    public float getPixels() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    public int getResourceIdentifier(String string2, String string3) {
        Context context;
        try {
            context = this.context;
        }
        catch (Exception exception) {
            return 0;
        }
        context = context.getResources();
        Object object = this.context;
        object = object.getPackageName();
        return context.getIdentifier(string2, string3, (String)object);
    }

    public String getSessionAttribute(String string2) {
        return this.getSessionAttribute(string2, "");
    }

    public String getSessionDetails() {
        return this.juspayServices.getPaymentSessionInfo().getSessionDetails().toString();
    }

    public String getSessionInfo() {
        this.juspayServices.getPaymentSessionInfo().createSessionDataMap();
        return this.sessionInfo.getSessionData().toString();
    }

    public SmsEventInterface getSmsEventInterface() {
        DuiInterface$1 duiInterface$1 = new DuiInterface$1(this);
        return duiInterface$1;
    }

    public void invokeCallbackInACSWebview(String string2, String string3) {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        string3 = Base64.encodeToString((byte[])string3.getBytes(), (int)2);
        string2 = uc0_0.a("window.__PROXY_FN['", string2, "'](atob('", string3, "'))");
        this.godelManager.getJuspayWebView().addJsToWebView(string2);
    }

    public void invokeCallbackInDUIWebview(String string2, String string3) {
        if (string2 == null) {
            return;
        }
        if (string3 == null) {
            string3 = "null";
        }
        string3 = Base64.encodeToString((byte[])string3.getBytes(), (int)2);
        string2 = uc0_0.a("window.callUICallback('", string2, "',atob('", string3, "'));");
        this.juspayServices.getDynamicUI().addJsToWebView(string2);
    }

    public void invokeCustomFnInDUIWebview(String string2) {
        this.juspayServices.getDynamicUI().addJsToWebView(string2);
    }

    public void invokeFnInDUIWebview(String string2) {
        this.invokeCustomFnInDUIWebview(string2);
    }

    public void invokeFnInDUIWebview(String string2, String string3) {
        string3 = Base64.encodeToString((byte[])string3.getBytes(), (int)2);
        string2 = uc0_0.a("window[\"onEvent'\"]('", string2, "',atob('", string3, "'))");
        this.juspayServices.getDynamicUI().addJsToWebView(string2);
    }

    public void invokeFnInDUIWebview(String string2, String string3, String string4) {
        Object object = this.godelManager;
        if (object != null) {
            object = ((Godel)object).getAcsInterface();
            ((AcsInterface)object).invoke(string2, string3, string4);
        }
    }

    public void invokeInACSWebview(String string2, String string3) {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        string3 = Base64.encodeToString((byte[])string3.getBytes(), (int)2);
        string2 = uc0_0.a("javascript:window.onAcsFunctionCalled('", string2, "',atob('", string3, "'))");
        this.godelManager.getJuspayWebView().addJsToWebView(string2);
    }

    public void invokeInACSWebview(String string2, String string3, String string4) {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        string3 = Base64.encodeToString((byte[])string3.getBytes(), (int)2);
        string2 = h30_0.a(og_1.a("javascript:window.onAcsFunctionCalled('", string2, "',atob('", string3, "'),'"), string4, "')");
        this.godelManager.getJuspayWebView().addJsToWebView(string2);
    }

    public String isAppInstalled(String string2) {
        PackageManager packageManager = this.juspayServices.getContext().getPackageManager();
        int n3 = 128;
        try {
            packageManager.getPackageInfo(string2, n3);
            return "true";
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return "false";
        }
    }

    public String isDeviceSecure() {
        block6: {
            Object object;
            Exception exception2;
            block7: {
                int n3;
                try {
                    n3 = Build.VERSION.SDK_INT;
                    int n4 = 23;
                    if (n3 < n4) break block6;
                }
                catch (Exception exception2) {}
                Object object2 = this.context;
                object = "keyguard";
                object2 = object2.getSystemService((String)object);
                object2 = (KeyguardManager)object2;
                if (object2 == null) break block6;
                n3 = (int)(jw0_2.a((KeyguardManager)object2) ? 1 : 0);
                object2 = n3 != 0 ? "SECURE" : "NOT_SECURE";
                break block7;
                return object2;
            }
            object = this.sdkTracker;
            String string2 = "jbridge";
            String string3 = "Exception while checking KeyguardManager.isDeviceSecure()";
            String string4 = LOG_TAG;
            String string5 = "action";
            String string6 = "system";
            ((SdkTracker)object).trackAndLogException(string4, string5, string6, string2, string3, exception2);
        }
        return "UNKNOWN";
    }

    public boolean isHookSupported(String string2) {
        boolean bl2 = true;
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 2031367170: {
                String string3 = "SEND_SMS";
                boolean bl3 = string2.equals(string3);
                if (!bl3) break;
                n3 = 5;
                break;
            }
            case 1205336831: {
                String string4 = "DELIVER_SMS";
                boolean bl4 = string2.equals(string4);
                if (!bl4) break;
                n3 = 4;
                break;
            }
            case -74735600: {
                String string5 = "SMS_RETRIEVER";
                boolean bl5 = string2.equals(string5);
                if (!bl5) break;
                n3 = 3;
                break;
            }
            case -901079619: {
                String string6 = "SMS_RECEIVE";
                boolean bl6 = string2.equals(string6);
                if (!bl6) break;
                n3 = 2;
                break;
            }
            case -1031869708: {
                String string7 = "SMS_CONSENT";
                boolean bl7 = string2.equals(string7);
                if (!bl7) break;
                n3 = 1;
                break;
            }
            case -1102737597: {
                String string8 = "NETWORK_STATUS";
                boolean bl8 = string2.equals(string8);
                if (!bl8) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return false;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
        }
        return bl2;
    }

    public boolean isOnline() {
        boolean bl2;
        String string2;
        Activity activity = this.activity;
        if (activity != null) {
            string2 = "connectivity";
            activity = (ConnectivityManager)activity.getSystemService(string2);
        } else {
            bl2 = false;
            activity = null;
        }
        boolean bl3 = false;
        string2 = null;
        if (activity != null && (activity = activity.getActiveNetworkInfo()) != null && (bl2 = activity.isConnected())) {
            bl3 = true;
        }
        return bl3;
    }

    public void loadUrl(String string2, String string3) {
        Object object = this.godelManager;
        if (object != null && string2 != null) {
            object = object.getJuspayWebView();
            sw0_2 sw0_22 = new sw0_2(string3, (JuspayWebView)((Object)object), string2);
            ExecutorManager.runOnMainThread(sw0_22);
        }
    }

    public void onActivityResult(int n3, int n4, Intent object) {
        Object object2;
        Object object3;
        boolean bl2;
        Object object4 = this.listenerMap.values().iterator();
        while (bl2 = object4.hasNext()) {
            object3 = object4.next();
            boolean bl3 = object3 instanceof ResultAwaitingDuiHook;
            if (bl3) {
                object2 = object3;
                object2 = (ResultAwaitingDuiHook)object3;
                bl3 = object2.onActivityResult(n3, n4, (Intent)object);
                if (bl3) {
                    SdkTracker sdkTracker = this.sdkTracker;
                    String string2 = object3.getClass().getName();
                    String string3 = "Result consumed by ResultAwaitingDuiHook ".concat(string2);
                    sdkTracker.trackAction("system", "info", "jbridge", "on_activity_result", string3);
                    return;
                }
            }
            if (!(bl3 = object3 instanceof OnResultHook)) continue;
            object2 = object3;
            object2 = (OnResultHook)object3;
            bl3 = object2.onActivityResult(n3, n4, (Intent)object);
            if (!bl3) continue;
            SdkTracker sdkTracker = this.sdkTracker;
            String string4 = object3.getClass().getName();
            String string5 = "Result consumed by OnResultHook ".concat(string4);
            sdkTracker.trackAction("system", "info", "jbridge", "on_activity_result", string5);
            return;
        }
        object4 = "', '";
        object3 = "window.onActivityResult('";
        if (object != null) {
            object = Utils.toJSON(object.getExtras());
            object2 = object.toString().getBytes();
            int n7 = 2;
            object2 = Base64.encodeToString((byte[])object2, (int)n7);
            SdkTracker sdkTracker = this.sdkTracker;
            CharSequence charSequence = new StringBuilder("Passing data to micro-app. Data is ");
            charSequence.append(object);
            String string6 = charSequence.toString();
            String string7 = "jbridge";
            String string8 = "on_activity_result";
            charSequence = "system";
            String string9 = "info";
            sdkTracker.trackAction((String)charSequence, string9, string7, string8, string6);
            object = "', atob('";
            CharSequence charSequence2 = fQ2.a((String)object3, (String)object4, (String)object, n3, n4);
            charSequence2.append((String)object2);
            String string10 = "'))";
            charSequence2.append(string10);
            charSequence2 = charSequence2.toString();
            this.invokeFnInDUIWebview((String)charSequence2);
        } else {
            object2 = this.sdkTracker;
            String string11 = "on_activity_result";
            String string12 = "Got empty data in onActivityResult. Passing callback to micro-app.";
            String string13 = "system";
            String string14 = "info";
            String string15 = "jbridge";
            ((SdkTracker)object2).trackAction(string13, string14, string15, string11, string12);
            object = "', '{}')";
            String string16 = z41.a((String)object3, (String)object4, (String)object, n3, n4);
            this.invokeFnInDUIWebview(string16);
        }
    }

    public void onDuiReady() {
        rw0_2 rw0_22 = new rw0_2(this, 0);
        ExecutorManager.runOnMainThread(rw0_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onRequestPermissionsResult(int n3, String[] object, int[] object2) {
        Exception exception2;
        CharSequence charSequence;
        Object object3;
        Object object4;
        block10: {
            String string2;
            block9: {
                object4 = "ReqPermi";
                object3 = this.listenerMap;
                charSequence = new StringBuilder((String)object4);
                charSequence.append(n3);
                string2 = charSequence.toString();
                string2 = object3.get(string2);
                boolean bl2 = string2 instanceof String;
                if (bl2) {
                    object4 = new JSONObject();
                    object3 = null;
                    int n4 = 0;
                    charSequence = null;
                    while (true) {
                        int n7;
                        if (n4 >= (n7 = ((Object)object).length)) {
                            object = object4.toString();
                            this.invokeCallbackInDUIWebview(string2, (String)object);
                            return;
                        }
                        Object object5 = object[n4];
                        String string3 = "android.permission.";
                        String string4 = "";
                        object5 = ((String)object5).replace(string3, string4);
                        boolean bl3 = object2[n4];
                        if (!bl3) {
                            bl3 = true;
                        } else {
                            bl3 = false;
                            string3 = null;
                        }
                        object4.put((String)object5, bl3);
                        ++n4;
                    }
                }
                boolean bl4 = string2 instanceof Handler.Callback;
                if (!bl4) break block9;
                try {
                    object = Message.obtain();
                    ((Message)object).obj = object2;
                    string2 = (Handler.Callback)string2;
                    string2.handleMessage((Message)object);
                    return;
                }
                catch (Exception exception2) {}
                break block10;
            }
            object = LOG_TAG;
            object2 = "callback instance not understandable";
            JuspayLogger.e((String)object, (String)object2);
            object4 = this.sdkTracker;
            object3 = "system";
            charSequence = "error";
            String string5 = "on_request_permission_result";
            object = new StringBuilder();
            ((StringBuilder)object).append((Object)string2);
            string2 = " : onRequestPermissionsResult callback instance not understandable";
            ((StringBuilder)object).append(string2);
            String string6 = ((StringBuilder)object).toString();
            Object object6 = JSONObject.NULL;
            ((SdkTracker)object4).trackAction((String)object3, (String)charSequence, string5, string6, object6);
            return;
        }
        object4 = this.sdkTracker;
        String string7 = "on_request_permission_result";
        String string8 = "Error while inserting in json";
        object3 = LOG_TAG;
        charSequence = "action";
        String string9 = "system";
        ((SdkTracker)object4).trackAndLogException((String)object3, (String)charSequence, string9, string7, string8, exception2);
    }

    public void onWebViewReady(String string2, String string3) {
        boolean bl2 = URLUtil.isValidUrl((String)string3);
        if (bl2) {
            bl2 = false;
            this.onWebViewReady(string2, string3, null);
        } else {
            SdkTracker sdkTracker = this.sdkTracker;
            Boolean bl3 = Boolean.FALSE;
            String string4 = "on_webview_ready";
            String string5 = "valid_url";
            String string6 = "system";
            String string7 = "error";
            sdkTracker.trackAction(string6, string7, string4, string5, bl3);
        }
    }

    public void onWebViewReady(String string2, String string3, String string4) {
        Godel godel = this.godelManager;
        if (godel != null) {
            Activity activity = this.activity;
            godel.onBrowserReady(activity, string3, string4, string2);
        }
    }

    public void onWebViewReady(String string2, String string3, String string4, String string5) {
        block10: {
            DuiInterface duiInterface = this;
            Object object = "base64";
            Object object2 = string5;
            int n3 = string5.equalsIgnoreCase((String)object);
            if (n3 != 0) {
                n3 = 2;
                String string6 = string4;
                object = Base64.decode((String)string4, (int)n3);
                object2 = this.godelManager;
                if (object2 == null) break block10;
                Activity activity = this.activity;
                string6 = new String((byte[])object);
                String string7 = "text/html";
                String string8 = "UTF-8";
                Object object3 = string2;
                try {
                    ((Godel)object2).onBrowserReady(activity, string3, string6, string7, string8, null, string2);
                }
                catch (Exception exception) {
                    object3 = duiInterface.sdkTracker;
                    String string9 = "on_webview_ready";
                    String string10 = "Exception while trying to decode content";
                    String string11 = LOG_TAG;
                    String string12 = "action";
                    String string13 = "system";
                    ((SdkTracker)object3).trackAndLogException(string11, string12, string13, string9, string10, exception);
                }
            } else {
                String string14 = string4;
                object2 = this.godelManager;
                if (object2 != null) {
                    Activity activity = this.activity;
                    String string15 = "UTF-8";
                    String string16 = "text/html";
                    String string17 = string2;
                    ((Godel)object2).onBrowserReady(activity, string3, string4, string16, string15, null, string2);
                }
            }
        }
    }

    public void onWebViewReleased() {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.onDuiReleased();
            godel = null;
            this.godelManager = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void openAppWithExplicitIntent(String string2, String object, String string3, int n3, int n4) {
        Exception exception2;
        block3: {
            Bundle bundle;
            block2: {
                try {
                    bundle = new Bundle();
                    String string4 = "data";
                    bundle.putString(string4, string3);
                    string3 = new Intent();
                    if (n4 < 0) break block2;
                    string3.setFlags(n4);
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            string3.putExtras(bundle);
            ComponentName componentName = new ComponentName(string2, (String)object);
            string3.setComponent(componentName);
            int n7 = -1;
            n7 = Math.max(n3, n7);
            object = this.juspayServices;
            n3 = 0;
            ((JuspayServices)object).startActivityForResult((Intent)string3, n7, null);
            return;
        }
        SdkTracker sdkTracker = this.sdkTracker;
        String string5 = "jbridge";
        String string6 = "on method openAppWithExplicitIntent: ";
        String string7 = LOG_TAG;
        String string8 = "action";
        String string9 = "system";
        sdkTracker.trackAndLogException(string7, string8, string9, string5, string6, exception2);
    }

    public void refreshPage() {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        PaymentUtils.refreshPage(godel.getJuspayWebView());
    }

    public void requestKeyboardHide() {
        pw0_2 pw0_22 = new pw0_2(this);
        ExecutorManager.runOnMainThread(pw0_22);
    }

    public void requestKeyboardShow() {
        Object object = this.godelManager;
        if (object == null) {
            return;
        }
        object = object.getJuspayWebView();
        Context context = this.context;
        String string2 = "input_method";
        if ((context = (InputMethodManager)context.getSystemService(string2)) != null) {
            int n3 = 1;
            context.showSoftInput((View)object, n3);
        }
    }

    public void requestKeyboardShow(String string2) {
        uw0_2 uw0_22 = new uw0_2(this, string2);
        ExecutorManager.runOnMainThread(uw0_22);
    }

    public void requestPermission(String[] object, String string2, Handler.Callback callback2) {
        Object object2 = this.juspayServices;
        int n3 = Integer.parseInt(string2);
        ((JuspayServices)object2).requestPermission((String[])object, n3);
        object = this.listenerMap;
        object2 = new StringBuilder("ReqPermi");
        ((StringBuilder)object2).append(string2);
        string2 = ((StringBuilder)object2).toString();
        object.put(string2, callback2);
    }

    public void requestPermission(String[] object, String string2, String string3) {
        Object object2 = this.juspayServices;
        int n3 = Integer.parseInt(string2);
        ((JuspayServices)object2).requestPermission((String[])object, n3);
        object = this.listenerMap;
        object2 = new StringBuilder("ReqPermi");
        ((StringBuilder)object2).append(string2);
        string2 = ((StringBuilder)object2).toString();
        object.put(string2, string3);
    }

    public void requestSMSPermission(String string2) {
        String[] stringArray = new String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_SMS"};
        String string3 = String.valueOf(7);
        this.requestPermission(stringArray, string3, string2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reset() {
        block7: {
            block6: {
                block5: {
                    try {
                        var1_1 = new ArrayList();
                        var2_3 = this.listenerMap;
                        var2_3 = var2_3.keySet();
                        var2_3 = var2_3.iterator();
lbl6:
                        // 3 sources

                        while (var3_4 = var2_3.hasNext()) {
                            var4_5 /* !! */  = var2_3.next();
                            var5_6 = this.listenerMap;
                            break block5;
                        }
                        break block6;
                    }
                    catch (Exception var1_2) {
                        break block7;
                    }
                }
                var6_7 = (var5_6 = var5_6.get(var4_5 /* !! */ )) instanceof JuspayDuiHook;
                if (!var6_7) ** GOTO lbl6
                var1_1.add(var4_5 /* !! */ );
                ** GOTO lbl6
            }
            var2_3 = null;
            var2_3 = new String[]{};
            var1_1 = var1_1.toArray(var2_3);
            this.detach((String[])var1_1);
            var1_1 = this.godelManager;
            var2_3 = null;
            if (var1_1 != null) {
                var1_1.onDuiReleased();
                this.godelManager = null;
            }
            this.container = null;
            return;
        }
        var2_3 = this.sdkTracker;
        var7_8 = "jbridge";
        var8_9 = "Exception while removing Dui Hooks";
        var4_5 /* !! */  = "DuiInterface";
        var5_6 = "action";
        var9_10 = "system";
        var2_3.trackAndLogException(var4_5 /* !! */ , (String)var5_6, var9_10, var7_8, var8_9, var1_2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void revokePermissions(String[] context) {
        try {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 < n4) return;
            ArrayList<String> arrayList = new ArrayList<String>();
            n4 = ((String[])context).length;
            int n7 = 0;
            Object var6_8 = null;
            while (true) {
                if (n7 >= n4) {
                    context = this.context;
                    lw0_2.a(context, arrayList);
                    return;
                }
                String string2 = context[n7];
                arrayList.add(string2);
                ++n7;
            }
        }
        catch (Exception exception) {}
        SdkTracker sdkTracker = this.sdkTracker;
        String string3 = "action";
        String string4 = "system";
        String string5 = LOG_TAG;
        String string6 = "permission";
        String string7 = "Error while revoking permission";
        sdkTracker.trackAndLogException(string5, string3, string4, string6, string7, exception);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void runInJuspayBrowser(String var1_1, String var2_6, String var3_7) {
        var4_8 = 2;
        var5_9 = null;
        var6_10 = "window.onMerchantEvent('prefetch',atob('";
        var7_11 = "Failed to load script for app: '";
        var8_12 = this.juspayServices.getSdkTracker();
        var1_1.getClass();
        var9_13 = "";
        var10_14 = -1;
        var11_15 = var1_1.hashCode();
        switch (var11_15) {
            default: {
                break;
            }
            case 137650334: {
                var12_16 = "onScriptError";
                var11_15 = (int)var1_1.equals(var12_16);
                if (var11_15 == 0) break;
                var10_14 = 5;
                break;
            }
            case -245602922: {
                var12_16 = "onStartWaitingDialogCreated";
                var11_15 = (int)var1_1.equals(var12_16);
                if (var11_15 == 0) break;
                var10_14 = 4;
                break;
            }
            case -1349761029: {
                var12_16 = "onEvent";
                var11_15 = (int)var1_1.equals(var12_16);
                if (var11_15 == 0) break;
                var10_14 = 3;
                break;
            }
            case -1349867671: {
                var12_16 = "onError";
                var11_15 = (int)var1_1.equals(var12_16);
                if (var11_15 == 0) break;
                var10_14 = 2;
                break;
            }
            case -1881018714: {
                var12_16 = "onBundleLoaded";
                var11_15 = (int)var1_1.equals(var12_16);
                if (var11_15 == 0) break;
                var10_14 = 1;
                break;
            }
            case -1895485031: {
                var12_16 = "onHtmlReady";
                var11_15 = (int)var1_1.equals(var12_16);
                if (var11_15 == 0) break;
                var10_14 = 0;
                var13_17 = null;
            }
        }
        switch (var10_14) {
            default: {
                var14_18 = "run_in_juspay_browser";
                var15_23 = "missing";
                var13_17 = "system";
                var12_16 = "error";
                var9_13 = var8_12;
                var16_28 = var1_1;
                var8_12.trackAction(var13_17, var12_16, var14_18, var15_23, var1_1);
                return;
            }
            case 5: {
                try {
                    var1_1 = new JSONObject(var2_6);
                    var2_6 = "app";
                    var2_6 = var1_1.optString(var2_6, (String)var9_13);
                    var3_7 = "serializedError";
                    var1_1 = var1_1.optString((String)var3_7, (String)var9_13);
                    var3_7 = new StringBuilder(var7_11);
                    var3_7.append(var2_6);
                    var2_6 = "', due to error: ";
                    var3_7.append(var2_6);
                    var3_7.append((String)var1_1);
                    var16_29 = var3_7.toString();
                    var13_17 = "hypersdk";
                    var12_16 = "error";
                    var14_19 = "on_script_error";
                    var15_24 = "message";
                    var9_13 = var8_12;
                    var8_12.trackLifecycle(var13_17, var12_16, var14_19, var15_24, var16_29);
                    return;
                }
                catch (JSONException var1_2) {
                    var17_33 = var1_2;
                    var15_25 = "run_in_juspay_browser";
                    var16_30 = "error while dealing with json onEvent";
                    var13_17 = "DuiInterface";
                    var12_16 = "lifecycle";
                    var14_20 = "hypersdk";
                    var9_13 = var8_12;
                    var8_12.trackAndLogException(var13_17, var12_16, var14_20, var15_25, var16_30, var1_2);
                    return;
                }
            }
            case 4: {
                var1_1 = new mw0_2(this, 0, var2_6, var8_12);
                ExecutorManager.runOnMainThread((Runnable)var1_1);
                return;
            }
            case 3: {
                var1_1 = this.juspayServices;
                var18_36 = var1_1.isPrefetch();
                var5_9 = "onJOSReady";
                var7_11 = "event";
                if (var18_36) ** GOTO lbl138
                try {
                    var1_1 = new JSONObject(var2_6);
                    var19_37 = var1_1.optString(var7_11, (String)var9_13);
                    var4_8 = (int)var19_37.equals(var5_9);
                    if (var4_8 != 0) {
                        var1_1 = "on_jos_ready";
                        this.trackWebViewEvent((String)var1_1);
                        var1_1 = this.juspayServices;
                        var1_1 = var1_1.getBundleParameters();
                        if (var1_1 == null) return;
                        var1_1 = this.juspayServices;
                        var19_37 = "initiate";
                        var5_9 = var1_1.getBundleParameters();
                        var1_1.onMerchantEvent(var19_37, (JSONObject)var5_9);
                        return;
                    }
                }
                catch (JSONException var1_3) {
                    var17_34 = var1_3;
                    ** GOTO lbl128
                }
                var19_37 = "action";
                var18_36 = (var1_1 = var1_1.optString(var19_37, (String)var9_13)).equals(var19_37 = "DUI_READY");
                if (var18_36) {
                    var1_1 = "dui_ready";
                    this.trackWebViewEvent((String)var1_1);
                }
                ** GOTO lbl135
lbl128:
                // 1 sources

                var15_26 = "run_in_juspay_browser";
                var16_31 = "error while dealing with json onEvent";
                var13_17 = "DuiInterface";
                var12_16 = "lifecycle";
                var14_21 = "hypersdk";
                var9_13 = var8_12;
                var8_12.trackAndLogException(var13_17, var12_16, var14_21, var15_26, var16_31, var1_3);
lbl135:
                // 2 sources

                var1_1 = new nw0_2(this, var2_6, (String)var3_7, var8_12);
                ExecutorManager.runOnMainThread((Runnable)var1_1);
                return;
lbl138:
                // 1 sources

                try {
                    var1_1 = new JSONObject(var2_6);
                    var3_7 = var1_1.optString(var7_11);
                    var9_13 = "prefetch_result";
                    var20_38 = Objects.equals(var3_7, var9_13);
                    if (var20_38) {
                        var3_7 = this.juspayServices;
                        Objects.requireNonNull(var3_7);
                        var9_13 = new ow0_2((JuspayServices)var3_7);
                        ExecutorManager.runOnMainThread((Runnable)var9_13);
                    }
                }
                catch (JSONException var1_4) {
                    var17_35 = var1_4;
                    ** GOTO lbl169
                }
                if ((var18_36 = (var1_1 = var1_1.getString(var7_11)).equals(var5_9)) == false) return;
                var1_1 = this.juspayServices;
                if ((var1_1 = var1_1.getBundleParameters()) == null) return;
                var1_1 = var1_1.toString();
                var1_1 = var1_1.getBytes();
                var1_1 = Base64.encodeToString((byte[])var1_1, (int)var4_8);
                var3_7 = new StringBuilder(var6_10);
                var3_7.append((String)var1_1);
                var1_1 = "'));";
                var3_7.append((String)var1_1);
                var1_1 = var3_7.toString();
                this.invokeCustomFnInDUIWebview((String)var1_1);
                return;
lbl169:
                // 1 sources

                var1_5 = "error while dealing with json onEvent ";
                var16_32 = kp1_0.c(var1_5, var2_6);
                var14_22 = "hypersdk";
                var15_27 = "run_in_juspay_browser";
                var13_17 = "DuiInterface";
                var12_16 = "lifecycle";
                var9_13 = var8_12;
                var8_12.trackAndLogException(var13_17, var12_16, var14_22, var15_27, var16_32, var17_35);
                return;
            }
            case 2: {
                var1_1 = "not_loaded";
                this.updateLoaded(var2_6, (String)var1_1);
                return;
            }
            case 1: {
                var1_1 = "loaded";
                this.updateLoaded(var2_6, (String)var1_1);
                return;
            }
            case 0: 
        }
        this.trackWebViewEvent("on_html_ready");
        var1_1 = this.juspayServices.getDynamicUI();
        var1_1.setWebViewActive();
    }

    public void runInJuspayWebView(String string2) {
        Object object = this.godelManager;
        if (object == null) {
            return;
        }
        object = object.getJuspayWebView();
        ru_2 ru_22 = new ru_2(this, string2, (View)object, 1);
        ExecutorManager.runOnMainThread(ru_22);
    }

    public void runInJuspayWebView(String string2, String string3) {
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setCardBrand(String string2) {
        this.juspayServices.getPaymentSessionInfo().setPaymentDetails("card_brand", string2);
    }

    public void setConfig(String object) {
        Object object2 = this.godelManager;
        if (object2 == null) {
            return;
        }
        object2 = new JSONObject((String)object);
        object = this.godelManager;
        try {
            ((Godel)object).setConfig((JSONObject)object2);
        }
        catch (JSONException jSONException) {
            object2 = this.sdkTracker;
            String string2 = "jbridge";
            String string3 = "Error while capturing config json";
            String string4 = LOG_TAG;
            String string5 = "action";
            String string6 = "system";
            ((SdkTracker)object2).trackAndLogException(string4, string5, string6, string2, string3, jSONException);
        }
    }

    public void setContainer(ViewGroup viewGroup) {
        this.container = viewGroup;
    }

    public void setIsRupaySupportedAdded(boolean bl2) {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.setIsRupaySupportedAdded(bl2);
        }
    }

    public void setSessionDetails(String string2, String string3) {
        this.juspayServices.getPaymentSessionInfo().addToSessionDetails(string2, string3);
    }

    public void setSessionInfo() {
    }

    public String shouldShowRequestPermissionRationale(String string2) {
        block5: {
            Object object = this.activity;
            if (object == null) break block5;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 23;
            if (n3 < n4) break block5;
            boolean bl2 = kw0_2.a((Activity)object, string2);
            try {
                return String.valueOf(bl2);
            }
            catch (Exception exception) {
                object = this.sdkTracker;
                String string3 = "permission";
                String string4 = "Exception while checking shouldShowRequestPermissionRationale";
                String string5 = LOG_TAG;
                String string6 = "action";
                String string7 = "system";
                ((SdkTracker)object).trackAndLogException(string5, string6, string7, string3, string4, exception);
            }
        }
        return null;
    }

    public void storeActivityData(String string2, String string3) {
        this.juspayServices.getDynamicUI().storeActivityData(string2, string3);
    }

    public void storeCookies() {
        CookieSyncManager.getInstance().sync();
    }

    public void suppressKeyboard() {
        vw0_2 vw0_22 = new vw0_2(this, 0);
        ExecutorManager.runOnMainThread(vw0_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateLoaded(String string2, String string3) {
        Exception exception;
        Object object;
        Object object2;
        SdkTracker sdkTracker;
        block5: {
            JSONObject jSONObject;
            String string4;
            String string5;
            block7: {
                block6: {
                    string5 = "jp_hash_and_status";
                    string4 = "fileName";
                    sdkTracker = this.juspayServices.getSdkTracker();
                    object2 = "";
                    try {
                        object = new JSONObject(string2);
                        boolean bl2 = object.has(string4);
                        if (bl2) {
                            object2 = object.getString(string4);
                        }
                        string2 = object2;
                    }
                    catch (Exception exception2) {
                        exception = exception2;
                        break block5;
                    }
                    string4 = "{}";
                    try {
                        string4 = this.getDataFromSharedPrefs(string5, string4);
                        jSONObject = new JSONObject(string4);
                        string4 = new JSONObject();
                        boolean bl3 = jSONObject.has((String)object2);
                        if (!bl3) break block6;
                        string4 = jSONObject.getJSONObject((String)object2);
                        break block7;
                    }
                    catch (Exception exception3) {
                        object2 = string2;
                        exception = exception3;
                        break block5;
                    }
                }
                object = "system";
                String string6 = "critical";
                String string7 = "auto_fallback";
                String string8 = "loaded";
                String string9 = "hash doesn't have a filename";
                object2 = sdkTracker;
                sdkTracker.trackAction((String)object, string6, string7, string8, string9);
            }
            object2 = "status";
            string4.put((String)object2, (Object)string3);
            jSONObject.put(string2, (Object)string4);
            string3 = jSONObject.toString();
            this.addDataToSharedPrefs(string5, string3);
            string3 = LOG_TAG;
            string5 = "udpateLoaded: ";
            JuspayLogger.d(string3, string5);
            return;
        }
        string2 = "Exception while updating the loaded status for file ";
        String string10 = kp1_0.c(string2, (String)object2);
        String string11 = "hypersdk";
        String string12 = "auto_fallback";
        object = LOG_TAG;
        String string13 = "lifecycle";
        object2 = sdkTracker;
        sdkTracker.trackAndLogException((String)object, string13, string11, string12, string10, exception);
    }
}

