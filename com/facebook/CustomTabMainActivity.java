/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import com.facebook.CustomTabMainActivity$a;
import com.facebook.CustomTabMainActivity$onCreate$redirectReceiver$1;
import com.facebook.FacebookSdk;
import com.facebook.login.a;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

public final class CustomTabMainActivity
extends Activity {
    public static final /* synthetic */ int c;
    public boolean a = true;
    public CustomTabMainActivity$onCreate$redirectReceiver$1 b;

    public final void a(int n3, Intent object) {
        Xv1 xv1;
        Object object2 = this.b;
        if (object2 != null) {
            xv1 = Xv1.a((Context)this);
            xv1.d((BroadcastReceiver)object2);
        }
        object2 = "intent";
        xv1 = null;
        if (object != null) {
            Bundle bundle;
            String string2 = object.getStringExtra("CustomTabMainActivity.extra_url");
            if (string2 != null) {
                string2 = Uri.parse((String)string2);
                bundle = lz3_0.F(string2.getQuery());
                string2 = lz3_0.F(string2.getFragment());
                bundle.putAll((Bundle)string2);
            } else {
                bundle = new Bundle();
            }
            string2 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
            object2 = os1_1.f((Intent)string2, bundle, null);
            if (object2 != null) {
                object = object2;
            }
            this.setResult(n3, (Intent)object);
        } else {
            object = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = os1_1.f(object, null, null);
            this.setResult(n3, (Intent)object);
        }
        this.finish();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Object object2 = this.getIntent().getAction();
        String string2 = "CustomTabActivity.action_customTabRedirect";
        boolean bl2 = Intrinsics.areEqual(string2, object2);
        IntentFilter intentFilter = null;
        if (bl2) {
            this.setResult(0);
            this.finish();
            return;
        }
        if (object == null) {
            boolean bl3;
            boolean bl4;
            block20: {
                void var7_14;
                void var13_23;
                StringBuilder stringBuilder;
                int n3;
                String string3;
                String string4;
                block19: {
                    object = this.getIntent();
                    object2 = "CustomTabMainActivity.extra_action";
                    if ((object = object.getStringExtra((String)object2)) == null) {
                        return;
                    }
                    object2 = this.getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
                    string4 = this.getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
                    LA1$a lA1$a = LA1.Companion;
                    Intent intent = this.getIntent();
                    string3 = "CustomTabMainActivity.extra_targetApp";
                    String string5 = intent.getStringExtra(string3);
                    lA1$a.getClass();
                    LA1[] lA1Array = LA1.values();
                    n3 = lA1Array.length;
                    stringBuilder = null;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        LA1 lA1 = lA1Array[i3];
                        String string6 = lA1.toString();
                        boolean bl5 = Intrinsics.areEqual(string6, string5);
                        if (!bl5) {
                            continue;
                        }
                        break block19;
                    }
                    LA1 lA1 = LA1.FACEBOOK;
                }
                int[] nArray = CustomTabMainActivity$a.$EnumSwitchMapping$0;
                int n4 = var13_23.ordinal();
                boolean bl6 = nArray[n4];
                bl4 = true;
                if (bl6 == bl4) {
                    string3 = "action";
                    Intrinsics.checkNotNullParameter(object, string3);
                    oi1_0 oi1_02 = new rf0_1((String)object, (Bundle)object2);
                    if (object2 == null) {
                        object2 = new Bundle();
                    }
                    Intrinsics.checkNotNullParameter(object, string3);
                    string3 = "oauth";
                    n3 = (int)(Intrinsics.areEqual(object, string3) ? 1 : 0);
                    if (n3 != 0) {
                        object = q03.c();
                        string3 = "oauth/authorize";
                        object = lz3_0.b((Bundle)object2, (String)object, string3);
                    } else {
                        string3 = q03.c();
                        stringBuilder = new StringBuilder();
                        String string7 = FacebookSdk.e();
                        stringBuilder.append(string7);
                        String string8 = "/dialog/";
                        stringBuilder.append(string8);
                        stringBuilder.append((String)object);
                        object = stringBuilder.toString();
                        object = lz3_0.b((Bundle)object2, string3, (String)object);
                    }
                    bl2 = td0.b(oi1_02);
                    if (!bl2) {
                        object2 = "<set-?>";
                        try {
                            Intrinsics.checkNotNullParameter(object, (String)object2);
                            oi1_02.a = object;
                        }
                        catch (Throwable throwable) {
                            td0.a(oi1_02, throwable);
                        }
                    }
                } else {
                    rf0_1 rf0_12 = new rf0_1((String)object, (Bundle)object2);
                }
                bl3 = td0.b(var7_14);
                if (!bl3) {
                    object = "activity";
                    try {
                        Intrinsics.checkNotNullParameter((Object)this, (String)object);
                        object = com.facebook.login.a.c;
                        ((ReentrantLock)object).lock();
                        object2 = com.facebook.login.a.b;
                        n3 = 0;
                        string3 = null;
                        com.facebook.login.a.b = null;
                        ((ReentrantLock)object).unlock();
                        object = new CustomTabsIntent$e((bg0)object2);
                        object = ((CustomTabsIntent$e)object).a();
                        object2 = ((CustomTabsIntent)object).intent;
                        object2.setPackage(string4);
                        try {
                            object2 = var7_14.a;
                            ((CustomTabsIntent)object).launchUrl((Context)this, (Uri)object2);
                            bl3 = true;
                            break block20;
                        }
                        catch (ActivityNotFoundException activityNotFoundException) {
                        }
                    }
                    catch (Throwable throwable2) {}
                    td0.a(var7_14, throwable2);
                }
                bl3 = false;
                object = null;
            }
            this.a = false;
            if (!bl3) {
                object = this.getIntent().putExtra("CustomTabMainActivity.no_activity_exception", bl4);
                this.setResult(0, (Intent)object);
                this.finish();
                return;
            }
            object = new CustomTabMainActivity$onCreate$redirectReceiver$1(this);
            this.b = object;
            object2 = Xv1.a((Context)this);
            intentFilter = new IntentFilter(string2);
            ((Xv1)object2).b((BroadcastReceiver)object, intentFilter);
        }
    }

    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        String string2 = intent.getAction();
        String string3 = "CustomTabMainActivity.action_refresh";
        boolean bl2 = Intrinsics.areEqual(string3, string2);
        int n3 = -1;
        if (bl2) {
            string2 = new Intent("CustomTabActivity.action_destroy");
            Xv1 xv1 = Xv1.a((Context)this);
            xv1.c((Intent)string2);
            this.a(n3, intent);
        } else {
            string2 = "CustomTabActivity.action_customTabRedirect";
            String string4 = intent.getAction();
            bl2 = Intrinsics.areEqual(string2, string4);
            if (bl2) {
                this.a(n3, intent);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        boolean bl2 = this.a;
        if (bl2) {
            bl2 = false;
            this.a(0, null);
        }
        this.a = true;
    }
}

