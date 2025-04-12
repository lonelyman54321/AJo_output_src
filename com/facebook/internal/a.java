/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 */
package com.facebook.internal;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookSdk;
import com.facebook.internal.WebDialog;
import com.facebook.internal.b;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class a
extends DialogFragment {
    public Dialog a;

    public final void onConfigurationChanged(Configuration object) {
        String string2 = "newConfig";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onConfigurationChanged((Configuration)object);
        object = this.a;
        boolean bl2 = object instanceof WebDialog;
        if (bl2 && (bl2 = this.isResumed())) {
            object = this.a;
            string2 = "null cannot be cast to non-null type com.facebook.internal.WebDialog";
            Intrinsics.checkNotNull(object, string2);
            object = (WebDialog)((Object)object);
            ((WebDialog)((Object)object)).d();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onCreate(Bundle object) {
        void var10_47;
        int n3;
        int n4 = 1;
        Object var3_17 = null;
        super.onCreate((Bundle)object);
        Dialog dialog = this.a;
        if (dialog != null) {
            return;
        }
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity == null) {
            return;
        }
        Intent intent = fragmentActivity.getIntent();
        String string2 = "intent";
        Intrinsics.checkNotNullExpressionValue(intent, string2);
        Bundle bundle = os1_1.m(intent);
        if (bundle != null) {
            String string3 = "is_fallback";
            n3 = bundle.getBoolean(string3, false);
        } else {
            n3 = 0;
            Object var5_25 = null;
        }
        String string4 = null;
        String string5 = "context";
        String string6 = "null cannot be cast to non-null type kotlin.String";
        if (n3 == 0) {
            WebDialog webDialog;
            void var1_10;
            void var1_7;
            void var3_20;
            String string7 = "action";
            if (bundle != null) {
                String string8 = bundle.getString(string7);
            } else {
                Object var3_19 = null;
            }
            if (bundle != null) {
                String string9 = "params";
                Bundle bundle2 = bundle.getBundle(string9);
            } else {
                boolean bl2 = false;
                Object var1_6 = null;
            }
            n3 = lz3_0.A((String)var3_20);
            if (n3 != 0) {
                FacebookSdk facebookSdk = FacebookSdk.a;
                fragmentActivity.finish();
                return;
            }
            Intrinsics.checkNotNull(var3_20, string6);
            Intrinsics.checkNotNullParameter(fragmentActivity, string5);
            Intrinsics.checkNotNullParameter(var3_20, string7);
            Date date = AccessToken.l;
            AccessToken accessToken = AccessToken$b.b();
            n3 = AccessToken$b.c();
            if (n3 == 0) {
                Xz3.f(fragmentActivity, string5);
                string4 = FacebookSdk.b();
            }
            if (var1_7 == null) {
                Bundle bundle3 = new Bundle();
            }
            ri0_2 ri0_22 = new ri0_2(this);
            String string10 = "app_id";
            if (accessToken != null) {
                string4 = accessToken.h;
                var1_10.putString(string10, string4);
                String string11 = "access_token";
                String string12 = accessToken.e;
                var1_10.putString(string11, string12);
            } else {
                var1_10.putString(string10, string4);
            }
            n4 = WebDialog.m;
            Intrinsics.checkNotNullParameter(fragmentActivity, string5);
            WebDialog.b((Context)fragmentActivity);
            LA1 lA1 = LA1.FACEBOOK;
            WebDialog webDialog2 = webDialog;
            string4 = var3_20;
            string5 = var1_10;
            webDialog = new WebDialog((Context)fragmentActivity, (String)var3_20, (Bundle)var1_10, lA1, ri0_22);
        } else {
            String string13;
            boolean bl3;
            String string14 = "url";
            if (bundle != null) {
                string4 = bundle.getString(string14);
            }
            if (bl3 = lz3_0.A(string4)) {
                FacebookSdk facebookSdk = FacebookSdk.a;
                fragmentActivity.finish();
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string15 = FacebookSdk.b();
            Object[] objectArray = new Object[n4];
            objectArray[0] = string15;
            String string16 = xh2_0.a(objectArray, n4, "fb%s://bridge/", "format(format, *args)");
            n4 = b.p;
            Intrinsics.checkNotNull(string4, string6);
            Intrinsics.checkNotNullParameter(fragmentActivity, string5);
            Intrinsics.checkNotNullParameter(string4, string14);
            String string17 = "expectedRedirectUrl";
            Intrinsics.checkNotNullParameter(string16, string17);
            WebDialog.b((Context)fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, string5);
            Intrinsics.checkNotNullParameter(string4, string14);
            Xz3.h();
            n3 = WebDialog.n;
            if (n3 == 0) {
                Xz3.h();
                n3 = WebDialog.n;
            }
            b b2 = new Dialog((Context)fragmentActivity, n3);
            b2.b = string13 = "fbconnect://success";
            b2.a = string4;
            Intrinsics.checkNotNullParameter(string16, string17);
            b2.b = string16;
            zy_1 zy_12 = new zy_1(this);
            b2.c = zy_12;
            b b3 = b2;
        }
        this.a = var10_47;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Object object = this.a;
        if (object == null) {
            object = this.getActivity();
            if (object != null) {
                Intent intent = object.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
                intent = os1_1.f(intent, null, null);
                int n3 = -1;
                object.setResult(n3, intent);
                object.finish();
            }
            this.setShowsDialog(false);
            bundle = super.onCreateDialog(bundle);
            Intrinsics.checkNotNullExpressionValue(bundle, "super.onCreateDialog(savedInstanceState)");
            return bundle;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.app.Dialog");
        return object;
    }

    public final void onDestroyView() {
        boolean bl2;
        Dialog dialog = this.getDialog();
        if (dialog != null && (bl2 = this.getRetainInstance())) {
            bl2 = false;
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public final void onResume() {
        super.onResume();
        Dialog dialog = this.a;
        boolean bl2 = dialog instanceof WebDialog;
        if (bl2) {
            String string2 = "null cannot be cast to non-null type com.facebook.internal.WebDialog";
            Intrinsics.checkNotNull(dialog, string2);
            dialog = (WebDialog)dialog;
            dialog.d();
        }
    }
}

