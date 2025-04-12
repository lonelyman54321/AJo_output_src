/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest$b;
import com.facebook.common.R$string;
import com.facebook.f;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.DeviceAuthDialog$RequestState;
import com.facebook.login.DeviceAuthDialog$a;
import com.facebook.login.DeviceAuthDialog$b;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
implements GraphRequest$b {
    public final /* synthetic */ DeviceAuthDialog a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Date c;
    public final /* synthetic */ Date d;

    public /* synthetic */ d(DeviceAuthDialog deviceAuthDialog, String string2, Date date, Date date2) {
        this.a = deviceAuthDialog;
        this.b = string2;
        this.c = date;
        this.d = date2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(f object) {
        JSONException jSONException2;
        DeviceAuthDialog deviceAuthDialog;
        block10: {
            Object object2;
            boolean bl2;
            Object object3;
            Date date;
            Date date2;
            Object object4;
            boolean bl3;
            block9: {
                bl3 = true;
                deviceAuthDialog = this.a;
                object4 = this.b;
                date2 = this.c;
                date = this.d;
                Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
                Intrinsics.checkNotNullParameter(object4, "$accessToken");
                Intrinsics.checkNotNullParameter(object, "response");
                object3 = deviceAuthDialog.e;
                bl2 = ((AtomicBoolean)object3).get();
                if (bl2) {
                    return;
                }
                object3 = ((f)object).c;
                if (object3 != null) {
                    object = ((FacebookRequestError)object3).i;
                    if (object == null) {
                        object = new FacebookException();
                    }
                    deviceAuthDialog.Ra((FacebookException)object);
                    return;
                }
                try {
                    object = ((f)object).b;
                    if (object != null) break block9;
                    object = new JSONObject();
                }
                catch (JSONException jSONException2) {
                    break block10;
                }
            }
            object3 = "id";
            Object object5 = object.getString((String)object3);
            object3 = "jsonObject.getString(\"id\")";
            Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
            Object object6 = DeviceAuthDialog$a.a((JSONObject)object);
            object3 = "name";
            object = object.getString((String)object3);
            object3 = "jsonObject.getString(\"name\")";
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            object3 = deviceAuthDialog.h;
            if (object3 != null) {
                object3 = ((DeviceAuthDialog$RequestState)object3).b;
                Qp0.a((String)object3);
            }
            if ((object3 = dl0_2.b(FacebookSdk.b())) != null && (object3 = ((al0_2)object3).e) != null) {
                object2 = y73_0.RequireConfirm;
                bl2 = ((AbstractCollection)object3).contains(object2);
                object3 = bl2;
            } else {
                bl2 = false;
                object3 = null;
            }
            object2 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object3, object2);
            if (bl2 && !(bl2 = deviceAuthDialog.j)) {
                cp0_0 cp0_02;
                deviceAuthDialog.j = bl3;
                object3 = deviceAuthDialog.getResources();
                int n3 = R$string.com_facebook_smart_login_confirmation_title;
                object3 = object3.getString(n3);
                Intrinsics.checkNotNullExpressionValue(object3, "resources.getString(R.st\u2026login_confirmation_title)");
                object2 = deviceAuthDialog.getResources();
                int n4 = R$string.com_facebook_smart_login_confirmation_continue_as;
                object2 = object2.getString(n4);
                Intrinsics.checkNotNullExpressionValue(object2, "resources.getString(R.st\u2026confirmation_continue_as)");
                Object object7 = deviceAuthDialog.getResources();
                int n7 = R$string.com_facebook_smart_login_confirmation_cancel;
                object7 = object7.getString(n7);
                Intrinsics.checkNotNullExpressionValue(object7, "resources.getString(R.st\u2026ogin_confirmation_cancel)");
                AlertDialog.Builder builder = StringCompanionObject.INSTANCE;
                builder = new Object[bl3];
                builder[0] = object;
                object = xh2_0.a((Object[])builder, (int)(bl3 ? 1 : 0), (String)object2, "format(format, *args)");
                object2 = deviceAuthDialog.getContext();
                builder = new AlertDialog.Builder((Context)object2);
                Object object8 = builder.setMessage((CharSequence)object3).setCancelable(bl3);
                object3 = cp0_02;
                object2 = deviceAuthDialog;
                cp0_02 = new cp0_0(deviceAuthDialog, (String)object5, (DeviceAuthDialog$b)object6, (String)object4, date2, date);
                object = object8.setNegativeButton((CharSequence)object, (DialogInterface.OnClickListener)cp0_02);
                object8 = new dp0_0(deviceAuthDialog);
                object.setPositiveButton((CharSequence)object7, (DialogInterface.OnClickListener)object8);
                object = builder.create();
                object.show();
                return;
            }
            object3 = deviceAuthDialog;
            object2 = object5;
            object5 = object6;
            object6 = object4;
            object4 = date2;
            date2 = date;
            deviceAuthDialog.Oa((String)object2, (DeviceAuthDialog$b)object5, (String)object6, (Date)object4, date);
            return;
        }
        FacebookException facebookException = new RuntimeException(jSONException2);
        deviceAuthDialog.Ra(facebookException);
    }
}

