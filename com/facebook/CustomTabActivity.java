/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 */
package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.CustomTabActivity$onActivityResult$closeReceiver$1;
import com.facebook.CustomTabMainActivity;

public final class CustomTabActivity
extends Activity {
    public CustomTabActivity$onActivityResult$closeReceiver$1 a;

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        if (n4 == 0) {
            Object object = new Intent("CustomTabActivity.action_customTabRedirect");
            Object object2 = this.getIntent().getDataString();
            object.putExtra("CustomTabMainActivity.extra_url", (String)object2);
            Xv1.a((Context)this).c((Intent)object);
            object = new CustomTabActivity$onActivityResult$closeReceiver$1(this);
            object2 = Xv1.a((Context)this);
            String string2 = "CustomTabActivity.action_destroy";
            intent = new IntentFilter(string2);
            ((Xv1)object2).b((BroadcastReceiver)object, (IntentFilter)intent);
            this.a = object;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Intent((Context)this, CustomTabMainActivity.class);
        bundle.setAction("CustomTabActivity.action_customTabRedirect");
        String string2 = this.getIntent().getDataString();
        bundle.putExtra("CustomTabMainActivity.extra_url", string2);
        bundle.addFlags(0x24000000);
        this.startActivityForResult((Intent)bundle, 2);
    }

    public final void onDestroy() {
        CustomTabActivity$onActivityResult$closeReceiver$1 customTabActivity$onActivityResult$closeReceiver$1 = this.a;
        if (customTabActivity$onActivityResult$closeReceiver$1 != null) {
            Xv1 xv1 = Xv1.a((Context)this);
            xv1.d(customTabActivity$onActivityResult$closeReceiver$1);
        }
        super.onDestroy();
    }
}

