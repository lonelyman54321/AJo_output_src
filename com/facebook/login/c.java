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
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
implements GraphRequest$b {
    public final /* synthetic */ DeviceAuthDialog a;

    public /* synthetic */ c(DeviceAuthDialog deviceAuthDialog) {
        this.a = deviceAuthDialog;
    }

    public final void b(f object) {
        int n3 = 1;
        DeviceAuthDialog deviceAuthDialog = this.a;
        Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
        Object object2 = "response";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = deviceAuthDialog.i;
        if (!bl2) {
            object2 = ((f)object).c;
            if (object2 != null) {
                object = ((FacebookRequestError)object2).i;
                if (object == null) {
                    object = new FacebookException();
                }
                deviceAuthDialog.Ra((FacebookException)object);
            } else {
                object = ((f)object).b;
                if (object == null) {
                    object = new JSONObject();
                }
                object2 = new DeviceAuthDialog$RequestState();
                String string2 = "user_code";
                string2 = object.getString(string2);
                ((DeviceAuthDialog$RequestState)object2).b = string2;
                Object object3 = StringCompanionObject.INSTANCE;
                object3 = Locale.ENGLISH;
                Object[] objectArray = new Object[n3];
                objectArray[0] = string2;
                Object object4 = Arrays.copyOf(objectArray, n3);
                string2 = "https://facebook.com/device?user_code=%1$s&qr=1";
                object4 = String.format((Locale)object3, string2, object4);
                string2 = "format(locale, format, *args)";
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                ((DeviceAuthDialog$RequestState)object2).a = object4;
                object4 = "code";
                object4 = object.getString((String)object4);
                ((DeviceAuthDialog$RequestState)object2).c = object4;
                object4 = "interval";
                long l2 = object.getLong((String)object4);
                try {
                    ((DeviceAuthDialog$RequestState)object2).d = l2;
                    deviceAuthDialog.Va((DeviceAuthDialog$RequestState)object2);
                }
                catch (JSONException jSONException) {
                    object4 = new RuntimeException(jSONException);
                    deviceAuthDialog.Ra((FacebookException)object4);
                }
            }
        }
    }
}

