/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 */
package com.ril.ajio.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class CustomWebViewActivity$a {
    public static void a(Context context, String string2, int n3, Boolean bl2, Activity activity) {
        boolean bl3;
        String string3 = "context";
        Intrinsics.checkNotNullParameter(context, string3);
        String string4 = "respect_policy_page";
        String string5 = "SOURCE";
        String string6 = "URL";
        Class<CustomWebViewActivity> clazz = CustomWebViewActivity.class;
        if (activity != null && (bl3 = activity instanceof BaseActivity)) {
            Intrinsics.checkNotNullParameter(context, string3);
            Intrinsics.checkNotNullParameter(activity, "activity");
            string3 = new Intent(context, clazz);
            string3.putExtra(string6, string2);
            string3.putExtra(string5, n3);
            string3.putExtra(string4, (Serializable)bl2);
            int n4 = 80;
            activity.startActivityForResult((Intent)string3, n4);
        } else {
            Intrinsics.checkNotNullParameter(context, string3);
            activity = new Intent(context, clazz);
            activity.putExtra(string6, string2);
            activity.putExtra(string5, n3);
            activity.putExtra(string4, (Serializable)bl2);
            context.startActivity((Intent)activity);
        }
    }

    public static /* synthetic */ void b(CustomWebViewActivity$a customWebViewActivity$a, Context context, String string2, int n3) {
        Boolean bl2 = Boolean.FALSE;
        customWebViewActivity$a.getClass();
        CustomWebViewActivity$a.a(context, string2, n3, bl2, null);
    }

    public static void c(Context object, Fragment fragment, String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Class<CustomWebViewActivity> clazz = CustomWebViewActivity.class;
        Intent intent = new Intent(object, clazz);
        intent.putExtra("URL", string2);
        object = "SOURCE";
        int n3 = 10;
        intent.putExtra((String)object, n3);
        if (string3 != null) {
            object = "product_id";
            intent.putExtra((String)object, string3);
        }
        if (string4 != null) {
            object = "product_name";
            intent.putExtra((String)object, string4);
        }
        fragment.startActivityForResult(intent, 61);
    }
}

