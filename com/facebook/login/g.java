/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.LoginMethodHandler;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
implements lz3$a {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ GetTokenLoginMethodHandler b;
    public final /* synthetic */ LoginClient$Request c;

    public g(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient$Request loginClient$Request) {
        this.a = bundle;
        this.b = getTokenLoginMethodHandler;
        this.c = loginClient$Request;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JSONObject object) {
        JSONException jSONException2;
        Object object2;
        Object object3;
        ArrayList<String> arrayList;
        Object object4;
        block5: {
            block4: {
                object4 = this.a;
                arrayList = this.b;
                object3 = "com.facebook.platform.extra.USER_ID";
                if (object != null) {
                    object2 = "id";
                    try {
                        object = object.getString((String)object2);
                        break block4;
                    }
                    catch (JSONException jSONException2) {
                        break block5;
                    }
                }
                object = null;
            }
            object4.putString((String)object3, (String)object);
            object = this.c;
            ((GetTokenLoginMethodHandler)((Object)arrayList)).m((LoginClient$Request)object, (Bundle)object4);
            return;
        }
        object4 = ((LoginMethodHandler)((Object)arrayList)).e();
        object2 = ((LoginMethodHandler)((Object)arrayList)).e().g;
        Object object5 = jSONException2.getMessage();
        arrayList = new ArrayList<String>();
        object3 = "Caught exception";
        arrayList.add((String)object3);
        if (object5 != null) {
            arrayList.add((String)object5);
        }
        String string2 = TextUtils.join((CharSequence)": ", arrayList);
        LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
        object3 = object5;
        object5 = new LoginClient$Result((LoginClient$Request)object2, loginClient$Result$a, null, string2, null);
        ((LoginClient)object4).c((LoginClient$Result)object5);
    }

    public final void b(FacebookException object) {
        ArrayList<String> arrayList = this.b;
        LoginClient loginClient = ((LoginMethodHandler)((Object)arrayList)).e();
        arrayList = ((LoginMethodHandler)((Object)arrayList)).e();
        LoginClient$Request loginClient$Request = ((LoginClient)((Object)arrayList)).g;
        object = object != null ? ((Throwable)object).getMessage() : null;
        arrayList = new ArrayList<String>();
        Object object2 = "Caught exception";
        arrayList.add((String)object2);
        if (object != null) {
            arrayList.add((String)object);
        }
        String string2 = TextUtils.join((CharSequence)": ", arrayList);
        LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
        object2 = object;
        object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string2, null);
        loginClient.c((LoginClient$Result)object);
    }
}

