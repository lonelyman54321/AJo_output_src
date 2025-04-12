/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.facebook.login.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookButtonBase;
import com.facebook.g;
import com.facebook.j;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.R$string;
import com.facebook.login.j$a;
import com.facebook.login.j$b;
import com.facebook.login.j$c;
import com.facebook.login.widget.LoginButton;
import com.facebook.login.widget.LoginButton$a;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public class LoginButton$b
implements View.OnClickListener {
    public final /* synthetic */ LoginButton a;

    public LoginButton$b(LoginButton loginButton) {
        this.a = loginButton;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public com.facebook.login.j a() {
        LoginButton loginButton = this.a;
        boolean bl2 = td0.b(this);
        if (bl2) {
            return null;
        }
        try {
            boolean bl3;
            boolean bl4;
            String string2;
            Object object;
            Object object2;
            block6: {
                object2 = com.facebook.login.j.j;
                object2 = ((j$b)object2).a();
                object = loginButton.getDefaultAudience();
                object2.getClass();
                string2 = "defaultAudience";
                Intrinsics.checkNotNullParameter(object, string2);
                ((com.facebook.login.j)object2).b = object;
                object = loginButton.getLoginBehavior();
                string2 = "loginBehavior";
                Intrinsics.checkNotNullParameter(object, string2);
                ((com.facebook.login.j)object2).a = object;
                bl4 = td0.b(this);
                if (!bl4) {
                    try {
                        object = LA1.FACEBOOK;
                        break block6;
                    }
                    catch (Throwable throwable) {
                        td0.a(this, throwable);
                    }
                }
                bl4 = false;
                object = null;
            }
            string2 = "targetApp";
            Intrinsics.checkNotNullParameter(object, string2);
            ((com.facebook.login.j)object2).g = object;
            object = loginButton.getAuthType();
            string2 = "authType";
            Intrinsics.checkNotNullParameter(object, string2);
            ((com.facebook.login.j)object2).d = object;
            td0.b(this);
            bl4 = false;
            object = null;
            ((com.facebook.login.j)object2).h = false;
            ((com.facebook.login.j)object2).i = bl4 = loginButton.getShouldSkipAccountDeduplication();
            ((com.facebook.login.j)object2).e = object = loginButton.getMessengerPageId();
            ((com.facebook.login.j)object2).f = bl3 = loginButton.getResetMessengerState();
            return object2;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        Throwable throwable2;
        block8: {
            Object object;
            Object object2;
            Object object3;
            block6: {
                Object object4;
                block7: {
                    object3 = this.a;
                    boolean bl2 = td0.b(this);
                    if (bl2) {
                        return;
                    }
                    try {
                        object2 = this.a();
                        object = ((LoginButton)((Object)object3)).x;
                        if (object == null) break block6;
                        object2 = ((N3)object).c;
                        object4 = "null cannot be cast to non-null type com.facebook.login.LoginManager.FacebookLoginActivityResultContract";
                        Intrinsics.checkNotNull(object2, (String)object4);
                        object2 = (j$c)object2;
                        object4 = ((LoginButton)((Object)object3)).getCallbackManager();
                        if (object4 != null) break block7;
                        object4 = new dk_1();
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                ((j$c)object2).a = object4;
                object3 = ((LoginButton)((Object)object3)).getProperties();
                object3 = ((LoginButton$a)object3).b;
                ((N3)object).a(object3);
                return;
            }
            object = ((FacebookButtonBase)((Object)object3)).getFragment();
            Object object5 = "fragment";
            if (object != null) {
                object = ((FacebookButtonBase)((Object)object3)).getFragment();
                if (object == null) return;
                Object object6 = ((LoginButton)((Object)object3)).getProperties();
                object6 = ((LoginButton$a)object6).b;
                object6 = (Collection)object6;
                object3 = ((LoginButton)((Object)object3)).getLoggerID();
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object5);
                object5 = new mw0_0((androidx.fragment.app.Fragment)object);
                ((com.facebook.login.j)object2).d((mw0_0)object5, (Collection)object6, (String)object3);
                return;
            }
            object = ((FacebookButtonBase)((Object)object3)).getNativeFragment();
            if (object != null) {
                object = ((FacebookButtonBase)((Object)object3)).getNativeFragment();
                if (object == null) return;
                Object object7 = ((LoginButton)((Object)object3)).getProperties();
                object7 = ((LoginButton$a)object7).b;
                object7 = (Collection)object7;
                object3 = ((LoginButton)((Object)object3)).getLoggerID();
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object5);
                object5 = new mw0_0((Fragment)object);
                ((com.facebook.login.j)object2).d((mw0_0)object5, (Collection)object7, (String)object3);
                return;
            }
            object = ((FacebookButtonBase)((Object)object3)).getActivity();
            object5 = ((LoginButton)((Object)object3)).getProperties();
            object5 = ((LoginButton$a)object5).b;
            object5 = (Collection)object5;
            object3 = ((LoginButton)((Object)object3)).getLoggerID();
            object2.getClass();
            Object object8 = "activity";
            Intrinsics.checkNotNullParameter(object, (String)object8);
            object8 = new yy1((Collection)object5);
            object5 = ((com.facebook.login.j)object2).a((yy1)object8);
            if (object3 != null) {
                object8 = "<set-?>";
                Intrinsics.checkNotNullParameter(object3, (String)object8);
                ((LoginClient$Request)object5).e = object3;
            }
            object3 = new j$a((Activity)object);
            ((com.facebook.login.j)object2).j((rb3_2)object3, (LoginClient$Request)object5);
            return;
        }
        td0.a(this, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Context context) {
        Throwable throwable2;
        block8: {
            Object object;
            String string2;
            Object object2;
            Object object3;
            Object object4;
            int n3;
            block7: {
                int n4;
                block6: {
                    n3 = 1;
                    object4 = this.a;
                    boolean bl2 = td0.b(this);
                    if (bl2) {
                        return;
                    }
                    object3 = "context";
                    try {
                        int n7;
                        Object[] objectArray;
                        Intrinsics.checkNotNullParameter(context, (String)object3);
                        object3 = this.a();
                        boolean bl3 = object4.j;
                        if (!bl3) {
                            ((com.facebook.login.j)object3).f();
                            return;
                        }
                        object2 = object4.getResources();
                        int n8 = R$string.com_facebook_loginview_log_out_action;
                        object2 = object2.getString(n8);
                        string2 = "resources.getString(R.st\u2026loginview_log_out_action)";
                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                        string2 = object4.getResources();
                        n4 = R$string.com_facebook_loginview_cancel_action;
                        string2 = string2.getString(n4);
                        object = "resources.getString(R.st\u2026_loginview_cancel_action)";
                        Intrinsics.checkNotNullExpressionValue(string2, (String)object);
                        object = g.d;
                        object = object.a();
                        object = object.c;
                        if (object != null) {
                            objectArray = object.e;
                        } else {
                            n7 = 0;
                            objectArray = null;
                        }
                        if (objectArray == null) break block6;
                        objectArray = StringCompanionObject.INSTANCE;
                        object4 = object4.getResources();
                        n7 = R$string.com_facebook_loginview_logged_in_as;
                        object4 = object4.getString(n7);
                        objectArray = "resources.getString(R.st\u2026k_loginview_logged_in_as)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)objectArray);
                        object = object.e;
                        objectArray = new Object[n3];
                        objectArray[0] = object;
                        object = Arrays.copyOf(objectArray, n3);
                        object4 = String.format((String)object4, object);
                        object = "format(format, *args)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object);
                        break block7;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                object4 = object4.getResources();
                n4 = R$string.com_facebook_loginview_logged_in_using_facebook;
                object4 = object4.getString(n4);
                object = "{\n          resources.ge\u2026using_facebook)\n        }";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object);
            }
            object = new AlertDialog.Builder(context);
            context = object.setMessage((CharSequence)object4);
            context = context.setCancelable(n3 != 0);
            wy1 wy12 = new wy1((com.facebook.login.j)object3);
            context = context.setPositiveButton((CharSequence)object2, (DialogInterface.OnClickListener)wy12);
            context.setNegativeButton((CharSequence)string2, null);
            context = object.create();
            context.show();
            return;
        }
        td0.a(this, throwable2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View var1_1) {
        var2_5 /* !! */  = this.a;
        var3_6 = td0.b(this);
        if (var3_6 != 0) {
            return;
        }
        try {
            var3_6 = td0.b(this);
            if (var3_6 != 0) {
                return;
            }
            var4_7 = "v";
        }
        catch (Throwable var1_4) {
            td0.a(this, var1_4);
            return;
        }
        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , var4_7);
        var3_6 = LoginButton.y;
        var2_5 /* !! */ .getClass();
        var3_6 = (int)td0.b((Object)var2_5 /* !! */ );
        if (var3_6 == 0) ** GOTO lbl24
        ** GOTO lbl31
        {
            block16: {
                catch (Throwable var1_3) {
                    ** GOTO lbl-1000
                }
lbl24:
                // 1 sources

                try {
                    var4_7 = var2_5 /* !! */ .c;
                    if (var4_7 != null) {
                        var4_7.onClick(var1_1 /* !! */ );
                    }
                    break block16;
                }
                catch (Throwable var1_2) {}
                td0.a((Object)var2_5 /* !! */ , var1_2);
            }
            var1_1 /* !! */  = AccessToken.l;
            var1_1 /* !! */  = AccessToken$b.b();
            var3_6 = (int)AccessToken$b.c();
            if (var3_6 != 0) {
                var5_8 = var2_5 /* !! */ .getContext();
                var6_9 = "context";
                Intrinsics.checkNotNullExpressionValue(var5_8, var6_9);
                this.c((Context)var5_8);
            } else {
                this.b();
            }
            var2_5 /* !! */  = var2_5 /* !! */ .getContext();
            var6_9 = null;
            var5_8 = new com.facebook.appevents.g((Context)var2_5 /* !! */ , null);
            var2_5 /* !! */  = "loggerImpl";
            Intrinsics.checkNotNullParameter(var5_8, (String)var2_5 /* !! */ );
            var2_5 /* !! */  = new Bundle();
            var6_9 = "logging_in";
            if (var1_1 /* !! */  != null) {
                var7_10 = 0;
                var1_1 /* !! */  = null;
            } else {
                var7_10 = 1;
            }
            var2_5 /* !! */ .putInt(var6_9, var7_10);
            var1_1 /* !! */  = "access_token_expired";
            var2_5 /* !! */ .putInt((String)var1_1 /* !! */ , var3_6);
            var1_1 /* !! */  = "fb_login_view_usage";
            var3_6 = (int)j.c();
            if (var3_6 != 0) {
                var5_8.h((Bundle)var2_5 /* !! */ , (String)var1_1 /* !! */ );
            }
            return;
        }
lbl-1000:
        // 1 sources

        {
            td0.a(this, var1_3);
            return;
        }
    }
}

