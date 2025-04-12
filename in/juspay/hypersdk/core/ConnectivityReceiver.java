/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.os.Build$VERSION
 *  android.provider.Settings$Global
 *  android.telephony.TelephonyManager
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersmshandler.JuspayDuiHook;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class ConnectivityReceiver
extends BroadcastReceiver
implements JuspayDuiHook {
    private static final String LOG_TAG = "ConnectivityReceiver";
    private final Map attachedMap;
    private final JuspayServices juspayServices;

    public ConnectivityReceiver(JuspayServices juspayServices) {
        WeakHashMap weakHashMap;
        this.attachedMap = weakHashMap = new WeakHashMap();
        this.juspayServices = juspayServices;
    }

    private String getNetworkType() {
        String string2 = this.juspayServices.getSessionInfo().getNetworkInfo();
        string2 = string2 != null ? this.juspayServices.getSessionInfo().getNetworkInfo() : "";
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isMobileDataOn() {
        int n3;
        int n4;
        boolean bl2;
        block18: {
            JuspayServices juspayServices;
            block17: {
                int n7;
                int n8;
                Object object;
                block16: {
                    block15: {
                        bl2 = false;
                        try {
                            juspayServices = this.juspayServices;
                        }
                        catch (Exception exception) {
                            return bl2;
                        }
                        juspayServices = juspayServices.getContext();
                        object = "phone";
                        object = juspayServices.getSystemService((String)object);
                        object = (TelephonyManager)object;
                        ContentResolver contentResolver = juspayServices.getContentResolver();
                        String string2 = "airplane_mode_on";
                        n4 = Settings.Global.getInt((ContentResolver)contentResolver, (String)string2, (int)0);
                        n8 = 1;
                        if (n4 == 0) {
                            n4 = 1;
                            break block15;
                        }
                        n4 = 0;
                        contentResolver = null;
                    }
                    n7 = Build.VERSION.SDK_INT;
                    int n10 = 29;
                    if (n7 < n10) break block16;
                    String string3 = "android.permission.READ_BASIC_PHONE_STATE";
                    n3 = t70.checkSelfPermission((Context)juspayServices, string3);
                    if (n3 != 0) break block17;
                    n3 = (int)(fl3_1.a((TelephonyManager)object) ? 1 : 0);
                    break block18;
                }
                int n14 = object.getSimState();
                n7 = 5;
                if (n14 != n7) break block17;
                juspayServices = juspayServices.getContentResolver();
                object = "mobile_data";
                n3 = Settings.Global.getInt((ContentResolver)juspayServices, (String)object, (int)n8);
                if (n3 != n8) break block17;
                n3 = 1;
                break block18;
            }
            n3 = 0;
            juspayServices = null;
        }
        if (n3 == 0) return bl2;
        if (n4 == 0) return bl2;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean isNetworkAvailable() {
        Exception exception;
        block4: {
            boolean bl2;
            Object object;
            boolean bl3;
            block3: {
                block2: {
                    bl3 = false;
                    try {
                        object = this.juspayServices;
                        object = ((JuspayServices)object).getContext();
                        String string2 = "connectivity";
                        object = object.getSystemService(string2);
                        object = (ConnectivityManager)object;
                        if (object == null) break block2;
                        object = object.getActiveNetworkInfo();
                        break block3;
                    }
                    catch (Exception exception2) {
                        exception = exception2;
                        break block4;
                    }
                }
                bl2 = false;
                object = null;
            }
            if (object == null) return bl3;
            bl2 = object.isConnected();
            if (!bl2) return bl3;
            return true;
        }
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        String string3 = LOG_TAG;
        sdkTracker.trackAndLogException(string3, "action", "system", "is_network_available", "network failure", exception);
        return false;
    }

    public void attach(Activity activity) {
        boolean bl2;
        Object object = (Boolean)this.attachedMap.get(activity);
        if (object == null || !(bl2 = ((Boolean)object).booleanValue())) {
            object = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            activity.registerReceiver((BroadcastReceiver)this, (IntentFilter)object);
            object = this.juspayServices;
            Object object2 = LOG_TAG;
            String string2 = "Attaching the ";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append((String)object2);
            charSequence = charSequence.toString();
            ((JuspayServices)object).sdkDebug((String)object2, (String)charSequence);
            object = this.attachedMap;
            object2 = Boolean.TRUE;
            object.put(activity, object2);
        }
    }

    public void detach(Activity activity) {
        boolean bl2;
        Object object = (Boolean)this.attachedMap.get(activity);
        if (object != null && (bl2 = ((Boolean)object).booleanValue())) {
            activity.unregisterReceiver((BroadcastReceiver)this);
            object = this.juspayServices;
            Object object2 = LOG_TAG;
            String string2 = "Detaching the ";
            CharSequence charSequence = new StringBuilder(string2);
            charSequence.append((String)object2);
            charSequence = charSequence.toString();
            ((JuspayServices)object).sdkDebug((String)object2, (String)charSequence);
            object = this.attachedMap;
            object2 = Boolean.FALSE;
            object.put(activity, object2);
        }
    }

    public String execute(Activity activity, String string2, JSONObject jSONObject) {
        return String.valueOf(this.isNetworkAvailable());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceive(Context object, Intent object2) {
        object = new JSONObject();
        object2 = "connected";
        try {
            boolean bl2 = this.isNetworkAvailable();
            String string2 = String.valueOf(bl2);
            object.put((String)object2, (Object)string2);
            object2 = "networkType";
            string2 = this.getNetworkType();
            object.put((String)object2, (Object)string2);
            object2 = "isMobileDataOn";
            bl2 = this.isMobileDataOn();
            string2 = String.valueOf(bl2);
            object.put((String)object2, (Object)string2);
        }
        catch (JSONException jSONException) {}
        object2 = this.juspayServices.getJBridge();
        object = object.toString();
        ((DuiInterface)object2).invokeFnInDUIWebview("onNetworkChange", (String)object);
    }
}

