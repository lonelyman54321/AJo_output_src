/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.services;

import android.content.Context;
import android.os.AsyncTask;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

class RemoteAssetService$AssetDownloadTask
extends AsyncTask {
    private String callback;
    private final WeakReference contextWeakReference;
    private String fileName;
    private String location;
    private RemoteAssetService remoteAssetService;
    private long renewFileStartTime;
    private long ttlInMilliSeconds;

    public RemoteAssetService$AssetDownloadTask(Context context, String weakReference, String string2, String string3, long l2, RemoteAssetService remoteAssetService, long l3) {
        this.location = weakReference;
        this.fileName = string2;
        this.callback = string3;
        this.ttlInMilliSeconds = l2;
        this.remoteAssetService = remoteAssetService;
        this.contextWeakReference = weakReference = new WeakReference<Context>(context);
        this.renewFileStartTime = l3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Boolean doInBackground(Void ... object) {
        Exception exception;
        Object object2;
        block3: {
            Object object3;
            object = this.contextWeakReference.get();
            object2 = object;
            object2 = (Context)object;
            if (object2 == null) return Boolean.FALSE;
            try {
                object = this.location;
                object3 = "certificates";
                boolean bl2 = ((String)object).contains((CharSequence)object3);
                if (!bl2) {
                    object3 = this.remoteAssetService;
                    String string2 = this.location;
                    String string3 = this.fileName;
                    long l2 = this.ttlInMilliSeconds;
                    bl2 = RemoteAssetService.access$000((RemoteAssetService)object3, object2, string2, string3, l2);
                    return bl2;
                }
            }
            catch (Exception exception2) {
                exception = exception2;
                break block3;
            }
            object = this.remoteAssetService;
            object3 = this.location;
            long l3 = this.ttlInMilliSeconds;
            RemoteAssetService.access$100((RemoteAssetService)object, object2, (String)object3, l3);
            return Boolean.FALSE;
        }
        SdkTracker sdkTracker = RemoteAssetService.access$200(this.remoteAssetService).getSdkTracker();
        StringBuilder stringBuilder = new StringBuilder("Could not renew file ");
        object2 = this.location;
        stringBuilder.append((String)object2);
        stringBuilder.append(": ");
        object2 = exception.getMessage();
        stringBuilder.append((String)object2);
        String string4 = stringBuilder.toString();
        String string5 = "system";
        String string6 = "remote_asset_service";
        object2 = "RemoteAssetService";
        String string7 = "action";
        sdkTracker.trackAndLogException((String)object2, string7, string5, string6, string4, exception);
        return Boolean.FALSE;
    }

    public void onPostExecute(Boolean object) {
        long l2;
        super.onPostExecute(object);
        long l3 = System.currentTimeMillis();
        long l4 = this.renewFileStartTime;
        l4 = l3 - l4;
        JSONObject jSONObject = new JSONObject();
        String string2 = "startTime";
        try {
            l2 = this.renewFileStartTime;
        }
        catch (JSONException jSONException) {}
        jSONObject.put(string2, l2);
        string2 = "endTime";
        jSONObject.put(string2, l3);
        Object object2 = "totalTime";
        jSONObject.put((String)object2, l4);
        object2 = "fileName";
        String string3 = this.fileName;
        jSONObject.put((String)object2, (Object)string3);
        RemoteAssetService.access$300().put((Object)jSONObject);
        object2 = this.callback;
        if (object2 != null) {
            string3 = this.location;
            Object object3 = RemoteAssetService.access$200(this.remoteAssetService).getFileProviderService();
            Object[] objectArray = this.fileName;
            object3 = ((FileProviderService)object3).appendSdkNameAndVersion((String)objectArray);
            int n3 = 4;
            objectArray = new Object[n3];
            jSONObject = null;
            objectArray[0] = object2;
            int n4 = 1;
            objectArray[n4] = object;
            objectArray[2] = string3;
            int n7 = 3;
            objectArray[n7] = object3;
            object = String.format("window.callUICallback('%s', '%b', '%s', '%s');", objectArray);
            object2 = RemoteAssetService.access$200(this.remoteAssetService);
            string3 = "RemoteAssetService";
            ((JuspayServices)object2).sdkDebug(string3, (String)object);
            object2 = RemoteAssetService.access$200(this.remoteAssetService);
            ((JuspayServices)object2).addJsToWebView((String)object);
        }
    }
}

