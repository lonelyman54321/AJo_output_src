/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.ril.ajio.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class AjioHomeActivity$a {
    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, AjioHomeActivity.class);
        intent.addFlags(0x10008000);
        intent.putExtra("is_force_start", true);
        context.startActivity(intent);
    }

    public static void b(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Class<AjioHomeActivity> clazz = AjioHomeActivity.class;
        Intent intent = new Intent(context, clazz);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("is_force_start", true);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
}

