/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.ril.ajio.myaccount.address.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ril.ajio.myaccount.address.activity.NewAddressActivity;
import kotlin.jvm.internal.Intrinsics;

public final class NewAddressActivity$a {
    public static void a(Context context, Fragment fragment, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intent intent = new Intent(context, NewAddressActivity.class);
        intent.putExtras(bundle);
        fragment.startActivityForResult(intent, 26);
    }
}

