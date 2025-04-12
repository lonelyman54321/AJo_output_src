/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.ril.ajio.notifications.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

public final class NotificationCenterActivity
extends BaseActivity {
    public final void onActivityResult(int n3, int n4, Intent intent) {
        int n7 = 45;
        if (n3 == n7) {
            this.setResult(n4, intent);
            this.finish();
        } else {
            super.onActivityResult(n3, n4, intent);
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        Object object = AJIOApplication.Companion;
        object.getClass();
        object = AJIOApplication$a.a();
        try {
            o43_0.a((AJIOApplication)object, 0);
        }
        catch (Exception exception) {
            yn3$a yn3$a = yn3_0.a;
            yn3$a.e(exception);
        }
        this.getAppPreferences().y(0);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.new_activity_notification_center;
        this.setContentView(n3);
        object = this.getSupportFragmentManager();
        object.getClass();
        a a2 = new a((FragmentManager)object);
        Intrinsics.checkNotNullExpressionValue(a2, "beginTransaction(...)");
        n3 = R$id.fragment;
        jz1_2 jz1_22 = new jz1_2();
        a2.j(n3, jz1_22, "tag");
        a2.d();
    }

    public final void onDestroy() {
        super.onDestroy();
        Object object = AJIOApplication.Companion;
        object.getClass();
        object = AJIOApplication$a.a();
        try {
            o43_0.a((AJIOApplication)object, 0);
        }
        catch (Exception exception) {
            yn3$a yn3$a = yn3_0.a;
            yn3$a.e(exception);
        }
        this.getAppPreferences().y(0);
    }
}

