/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package in.juspay.hyperinteg;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.services.HyperServices;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONObject;

public class HyperServiceHolder {
    private static WeakReference activeMerchantCallback;
    private static final Queue events;
    private static HyperServices hyperServices;
    private static final HyperPaymentsCallbackAdapter staticCallbackAdapter;
    private final FragmentActivity fragmentActivity;
    private HyperPaymentsCallback merchantCallback;

    static {
        LinkedList linkedList = new LinkedList(null);
        staticCallbackAdapter = linkedList;
        events = linkedList = new LinkedList();
    }

    public HyperServiceHolder(FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
        HyperServices hyperServices = HyperServiceHolder.hyperServices;
        if (hyperServices == null) {
            HyperServiceHolder.hyperServices = hyperServices = new HyperServices(fragmentActivity);
        }
    }

    public HyperServiceHolder(FragmentActivity weakReference, HyperPaymentsCallback hyperPaymentsCallback) {
        this((FragmentActivity)((Object)weakReference));
        activeMerchantCallback = weakReference = new WeakReference<HyperPaymentsCallback>(hyperPaymentsCallback);
        this.merchantCallback = hyperPaymentsCallback;
        this.runQueuedEvents();
    }

    public static /* synthetic */ WeakReference access$100() {
        return activeMerchantCallback;
    }

    public static /* synthetic */ Queue access$200() {
        return events;
    }

    private void runQueuedEvents() {
        Object object;
        Object object2;
        HyperPaymentsCallback hyperPaymentsCallback = (HyperPaymentsCallback)activeMerchantCallback.get();
        if (hyperPaymentsCallback == null) {
            return;
        }
        while ((object2 = (object = events).peek()) != null) {
            if ((object = (Pair)object.poll()) == null) continue;
            object2 = (JSONObject)((Pair)object).first;
            object = (JuspayResponseHandler)((Pair)object).second;
            hyperPaymentsCallback.onEvent((JSONObject)object2, (JuspayResponseHandler)object);
        }
    }

    public HyperServices getHyperServices() {
        HyperServices hyperServices = HyperServiceHolder.hyperServices;
        if (hyperServices == null) {
            FragmentActivity fragmentActivity = this.fragmentActivity;
            HyperServiceHolder.hyperServices = hyperServices = new HyperServices(fragmentActivity);
        }
        return HyperServiceHolder.hyperServices;
    }

    public void initiate(JSONObject jSONObject) {
        HyperServices hyperServices = this.getHyperServices();
        FragmentActivity fragmentActivity = this.fragmentActivity;
        HyperPaymentsCallbackAdapter hyperPaymentsCallbackAdapter = staticCallbackAdapter;
        hyperServices.initiate(fragmentActivity, jSONObject, hyperPaymentsCallbackAdapter);
    }

    public boolean isInitialised() {
        return this.getHyperServices().isInitialised();
    }

    public boolean onBackPressed() {
        return this.getHyperServices().onBackPressed();
    }

    public void process(ViewGroup viewGroup, JSONObject jSONObject) {
        HyperServices hyperServices = this.getHyperServices();
        FragmentActivity fragmentActivity = this.fragmentActivity;
        hyperServices.process(fragmentActivity, viewGroup, jSONObject);
    }

    public void process(JSONObject jSONObject) {
        HyperServices hyperServices = this.getHyperServices();
        FragmentActivity fragmentActivity = this.fragmentActivity;
        hyperServices.process(fragmentActivity, jSONObject);
    }

    public void resetActivity() {
        HyperServices hyperServices = HyperServiceHolder.hyperServices;
        if (hyperServices != null) {
            FragmentActivity fragmentActivity = this.fragmentActivity;
            hyperServices.resetActivity(fragmentActivity);
        }
    }

    public void setCallback(HyperPaymentsCallback hyperPaymentsCallback) {
        WeakReference<HyperPaymentsCallback> weakReference;
        activeMerchantCallback = weakReference = new WeakReference<HyperPaymentsCallback>(hyperPaymentsCallback);
        this.merchantCallback = hyperPaymentsCallback;
        this.runQueuedEvents();
    }

    public void terminate() {
        this.getHyperServices().terminate();
    }
}

