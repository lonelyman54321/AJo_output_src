/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.phone.SmsCodeAutofillClient;
import com.google.android.gms.auth.api.phone.SmsCodeBrowserClient;
import com.google.android.gms.internal.auth-api-phone.zzr;
import com.google.android.gms.internal.auth-api-phone.zzv;

public final class SmsCodeRetriever {
    public static final String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    private SmsCodeRetriever() {
    }

    public static SmsCodeAutofillClient getAutofillClient(Activity activity) {
        zzr zzr2 = new zzr(activity);
        return zzr2;
    }

    public static SmsCodeAutofillClient getAutofillClient(Context context) {
        zzr zzr2 = new zzr(context);
        return zzr2;
    }

    public static SmsCodeBrowserClient getBrowserClient(Activity activity) {
        zzv zzv2 = new zzv(activity);
        return zzv2;
    }

    public static SmsCodeBrowserClient getBrowserClient(Context context) {
        zzv zzv2 = new zzv(context);
        return zzv2;
    }
}

