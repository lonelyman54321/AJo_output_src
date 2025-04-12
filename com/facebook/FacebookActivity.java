/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 */
package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.common.R$id;
import com.facebook.common.R$layout;
import com.facebook.internal.a;
import com.facebook.login.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

public class FacebookActivity
extends FragmentActivity {
    public Fragment X;

    public final void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        String string3 = "prefix";
        try {
            Intrinsics.checkNotNullParameter(string2, string3);
            string3 = "writer";
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
        Intrinsics.checkNotNullParameter(printWriter, string3);
        super.dump(string2, fileDescriptor, printWriter, stringArray);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.X;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        Object object2;
        Object object3;
        Object object4;
        super.onCreate((Bundle)object);
        object = this.getIntent();
        int n3 = FacebookSdk.isInitialized();
        if (n3 == 0) {
            object4 = lz3_0.a;
            object4 = this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(object4, "applicationContext");
            object3 = FacebookSdk.class;
            synchronized (object3) {
                object2 = "applicationContext";
                Intrinsics.checkNotNullParameter(object4, (String)object2);
                FacebookSdk.l((Context)object4);
            }
        }
        n3 = R$layout.com_facebook_activity_layout;
        this.setContentView(n3);
        object4 = "PassThrough";
        object = object.getAction();
        boolean bl2 = Intrinsics.areEqual(object4, object);
        if (bl2) {
            object = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object, "requestIntent");
            object = os1_1.j(os1_1.m((Intent)object));
            object4 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object4, "intent");
            object = os1_1.f((Intent)object4, null, (FacebookException)object);
            this.setResult(0, (Intent)object);
            this.finish();
            return;
        }
        object = this.getIntent();
        object4 = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object4, "supportFragmentManager");
        object3 = "SingleFragment";
        object2 = ((FragmentManager)object4).E((String)object3);
        if (object2 == null) {
            object2 = "FacebookDialogFragment";
            object = object.getAction();
            bl2 = Intrinsics.areEqual(object2, object);
            int n4 = 1;
            if (bl2) {
                object = new a();
                ((Fragment)object).setRetainInstance(n4 != 0);
                ((DialogFragment)object).show((FragmentManager)object4, (String)object3);
            } else {
                object = new h();
                ((Fragment)object).setRetainInstance(n4 != 0);
                androidx.fragment.app.a a2 = new androidx.fragment.app.a((FragmentManager)object4);
                n3 = R$id.com_facebook_fragment_container;
                a2.h(n3, (Fragment)object, (String)object3, n4);
                a2.d();
            }
            object2 = object;
        }
        this.X = object2;
    }
}

