/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest$b;
import com.facebook.f;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.DeviceAuthDialog$RequestState;
import com.facebook.login.LoginClient$Request;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
implements GraphRequest$b {
    public final /* synthetic */ DeviceAuthDialog a;

    public /* synthetic */ b(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(f object) {
        JSONException jSONException2;
        Object object2;
        DeviceAuthDialog deviceAuthDialog;
        block11: {
            block10: {
                deviceAuthDialog = this.a;
                Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
                Intrinsics.checkNotNullParameter(object, "response");
                object2 = deviceAuthDialog.e;
                boolean bl2 = ((AtomicBoolean)object2).get();
                if (bl2) {
                    return;
                }
                object2 = ((f)object).c;
                if (object2 != null) {
                    int n3 = ((FacebookRequestError)object2).c;
                    int n4 = 1349174;
                    if (n3 == n4 || n3 == (n4 = 1349172)) {
                        deviceAuthDialog.Ua();
                        return;
                    }
                    n4 = 1349152;
                    if (n3 == n4) {
                        object = deviceAuthDialog.h;
                        if (object != null) {
                            object = ((DeviceAuthDialog$RequestState)object).b;
                            Qp0.a((String)object);
                        }
                        if ((object = deviceAuthDialog.k) != null) {
                            deviceAuthDialog.Wa((LoginClient$Request)object);
                            return;
                        }
                        deviceAuthDialog.Qa();
                        return;
                    }
                    n4 = 1349173;
                    if (n3 == n4) {
                        deviceAuthDialog.Qa();
                        return;
                    }
                    object = ((FacebookRequestError)object2).i;
                    if (object == null) {
                        object = new FacebookException();
                    }
                    deviceAuthDialog.Ra((FacebookException)object);
                    return;
                }
                try {
                    object = ((f)object).b;
                    if (object != null) break block10;
                    object = new JSONObject();
                }
                catch (JSONException jSONException2) {
                    break block11;
                }
            }
            object2 = "access_token";
            object2 = object.getString((String)object2);
            String string2 = "resultObject.getString(\"access_token\")";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            string2 = "expires_in";
            long l2 = object.getLong(string2);
            String string3 = "data_access_expiration_time";
            long l3 = object.optLong(string3);
            object = l3;
            deviceAuthDialog.Sa((String)object2, l2, (Long)object);
            return;
        }
        object2 = new RuntimeException(jSONException2);
        deviceAuthDialog.Ra((FacebookException)object2);
    }
}

