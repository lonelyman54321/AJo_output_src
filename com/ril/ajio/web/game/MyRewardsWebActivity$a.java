/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 */
package com.ril.ajio.web.game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ril.ajio.web.game.MyRewardsWebActivity;
import kotlin.jvm.internal.Intrinsics;

public final class MyRewardsWebActivity$a {
    public static void a(int n3, Activity activity, String string2, String string3) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent((Context)activity, MyRewardsWebActivity.class);
        intent.putExtra("URL", string2);
        intent.putExtra("SOURCE", n3);
        intent.putExtra("TITLE", string3);
        intent.putExtra("IS_APP_PARAMS", true);
        activity.startActivityForResult(intent, 45);
    }
}

