/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.auth-api.zbbj;
import com.google.android.gms.internal.auth-api.zbbk;

public final class zbn {
    public static PendingIntent zba(Context context, Auth$AuthCredentialsOptions object, HintRequest hintRequest, String string2) {
        Preconditions.checkNotNull(context, "context must not be null");
        object = "request must not be null";
        Preconditions.checkNotNull(hintRequest, object);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        object = bl2 ? zbbj.zba() : (String)Preconditions.checkNotNull(string2);
        string2 = new Intent("com.google.android.gms.auth.api.credentials.PICKER");
        object = string2.setPackage("com.google.android.gms").putExtra("claimedCallingPackage", null).putExtra("logSessionId", (String)object);
        SafeParcelableSerializer.serializeToIntentExtra(hintRequest, (Intent)object, "com.google.android.gms.credentials.HintRequest");
        int n3 = zbbk.zba | 0x8000000;
        return PendingIntent.getActivity((Context)context, (int)2000, (Intent)object, (int)n3);
    }
}

