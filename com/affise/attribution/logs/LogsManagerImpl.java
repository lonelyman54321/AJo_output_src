/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.affise.attribution.logs;

import com.affise.attribution.exceptions.CloudException;
import com.affise.attribution.exceptions.NetworkException;
import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.AffiseLog$DevicedataLog;
import com.affise.attribution.logs.AffiseLog$NetworkLog;
import com.affise.attribution.logs.AffiseLog$SdkLog;
import com.affise.attribution.logs.AffiseLog$UserdataLog;
import com.affise.attribution.logs.LogsManager;
import com.affise.attribution.logs.StoreLogsUseCase;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class LogsManagerImpl
implements LogsManager {
    private final StoreLogsUseCase storeLogsUseCase;

    public LogsManagerImpl(StoreLogsUseCase storeLogsUseCase2) {
        Intrinsics.checkNotNullParameter(storeLogsUseCase2, "storeLogsUseCase");
        this.storeLogsUseCase = storeLogsUseCase2;
    }

    private final JSONObject createCloudExceptionJson(CloudException cloudException) {
        Integer n3;
        JSONObject jSONObject = new JSONObject();
        Object object = cloudException.getThrowable();
        int n4 = object instanceof NetworkException;
        if (n4 != 0) {
            object = cloudException.getThrowable().getMessage();
            if (object == null) {
                object = "";
            }
            n4 = ((NetworkException)cloudException.getThrowable()).getStatus();
            n3 = n4;
        } else {
            n4 = object instanceof SocketTimeoutException;
            if (n4 != 0) {
                int n7 = 522;
                n3 = n7;
                object = "Timeout Exception";
            } else {
                n4 = object instanceof SSLException;
                if (n4 != 0) {
                    int n8 = 525;
                    n3 = n8;
                    object = "SSL Exception";
                } else {
                    int n10 = object instanceof UnknownHostException;
                    if (n10 != 0) {
                        n10 = 434;
                        n3 = n10;
                        object = "DNS Exception";
                    } else {
                        object = String.valueOf(cloudException.getThrowable().getMessage());
                        n4 = 0;
                        n3 = null;
                    }
                }
            }
        }
        String string2 = cloudException.getUrl();
        jSONObject.put("endpoint", (Object)string2);
        jSONObject.put("code", (Object)n3);
        int n14 = cloudException.getAttempts();
        jSONObject.put("attempts", n14);
        boolean bl2 = cloudException.getRetry();
        jSONObject.put("retry", bl2);
        jSONObject.put("message", object);
        return jSONObject;
    }

    private final void storeLog(AffiseLog affiseLog) {
        this.storeLogsUseCase.storeLog(affiseLog);
    }

    public void addDeviceError(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        AffiseLog$DevicedataLog affiseLog$DevicedataLog = new AffiseLog$DevicedataLog(string2);
        this.storeLog(affiseLog$DevicedataLog);
    }

    public void addDeviceError(Throwable object) {
        Intrinsics.checkNotNullParameter(object, "throwable");
        object = yc0_2.b((Throwable)object);
        AffiseLog$DevicedataLog affiseLog$DevicedataLog = new AffiseLog$DevicedataLog((String)object);
        this.storeLog(affiseLog$DevicedataLog);
    }

    public void addNetworkError(Throwable object) {
        Object object2;
        String string2 = "throwable";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof CloudException;
        if (bl2) {
            object = (CloudException)object;
            object = a.b(this.createCloudExceptionJson((CloudException)object));
        } else {
            string2 = new JSONObject();
            object2 = "network_error";
            object = yc0_2.b((Throwable)object);
            string2.put((String)object2, object);
            object = a.b(string2);
        }
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            string2 = (JSONObject)object.next();
            object2 = new AffiseLog$NetworkLog((JSONObject)string2);
            this.storeLog((AffiseLog)object2);
        }
    }

    public void addSdkError(Throwable object) {
        Intrinsics.checkNotNullParameter(object, "throwable");
        object = yc0_2.b((Throwable)object);
        AffiseLog$SdkLog affiseLog$SdkLog = new AffiseLog$SdkLog((String)object);
        this.storeLog(affiseLog$SdkLog);
    }

    public void addUserError(Throwable object) {
        Intrinsics.checkNotNullParameter(object, "throwable");
        object = yc0_2.b((Throwable)object);
        AffiseLog$UserdataLog affiseLog$UserdataLog = new AffiseLog$UserdataLog((String)object);
        this.storeLog(affiseLog$UserdataLog);
    }
}

