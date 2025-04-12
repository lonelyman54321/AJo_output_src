/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.Application
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.login.activity;

import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.login.j;
import com.facebook.login.j$b;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.FacebookSDKHelper;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.managers.ActivityTransitionManager;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import com.ril.ajio.login.activity.Hilt_LoginActivityRevamp;
import com.ril.ajio.login.activity.LoginActivityRevamp$a;
import com.ril.ajio.login.activity.LoginActivityRevamp$b;
import com.ril.ajio.login.activity.LoginActivityRevamp$c;
import com.ril.ajio.login.activity.LoginBaseActivity;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.query.QueryCustomer;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class LoginActivityRevamp
extends Hilt_LoginActivityRevamp
implements View.OnClickListener,
a {
    public static final LoginActivityRevamp$a Companion;
    public hy3_0 A0;
    public ry1_1 B0;
    public AjioLoaderView C0;
    public View D0;
    public AccountCheckResponse E0;
    public ImageView F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public String J0;
    public final hh3_2 K0;
    public oa1_1 q0;
    public boolean r0;
    public GoogleSignInClient s0;
    public TextView t0;
    public ImageView u0;
    public dk_1 v0;
    public final List w0;
    public j x0;
    public String y0;
    public String z0;

    static {
        LoginActivityRevamp$a loginActivityRevamp$a;
        Companion = loginActivityRevamp$a = new Object();
    }

    public LoginActivityRevamp() {
        Object object = xx_2.i("public_profile", "email");
        this.w0 = object;
        this.y0 = object = "";
        this.z0 = object;
        object = new ux1_0(this, 0);
        this.K0 = object = yr1_2.b((Function0)object);
    }

    public final void A0(boolean bl2) {
        this.G0 = bl2;
    }

    public final void F1(int n3) {
        View view = this.D0;
        if (view != null) {
            view.setBackgroundResource(n3);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void G2(boolean var1_1, boolean var2_2) {
        var3_3 = "";
        if (var1_1) {
            this.y0 = "SIGIN_SOURCE_FACEBOOK";
            var4_4 = this.getAppPreferences().g();
            var5_5 = this.getAppPreferences().h();
            if (var5_5 != null) {
                var3_3 = var5_5;
            }
lbl8:
            // 4 sources

            while (true) {
                var6_6 = var4_4;
                var4_4 = var3_3;
                var3_3 = var6_6;
                break;
            }
        } else {
            if (var2_2) {
                this.y0 = "SIGIN_SOURCE_GOOGLE";
                var4_4 = this.getAppPreferences();
                var5_5 = "GOOGLE_PROFILE_EMAIL";
                var4_4 = var4_4.getPreference((String)var5_5, (String)var3_3);
                ** continue;
            }
            var4_4 = var3_3;
        }
        var5_5 = this.q0;
        var7_7 = null;
        var8_8 = "loginViewModel";
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
            var5_5 = null;
        }
        var5_5.w = var2_2;
        var9_9 = this.q0;
        if (var9_9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
            var2_2 = false;
            var9_9 = null;
        }
        var9_9.v = var1_1;
        var10_10 = this.q0;
        if (var10_10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
            var1_1 = false;
            var10_10 = null;
        }
        Intrinsics.checkNotNull(var3_3);
        var10_10.getClass();
        Intrinsics.checkNotNullParameter(var3_3, "<set-?>");
        var10_10.x = var3_3;
        var10_10 = new QueryCustomer();
        var9_9 = Locale.getDefault();
        var5_5 = "getDefault(...)";
        Intrinsics.checkNotNullExpressionValue(var9_9, (String)var5_5);
        var9_9 = var3_3.toLowerCase((Locale)var9_9);
        var3_3 = "toLowerCase(...)";
        Intrinsics.checkNotNullExpressionValue(var9_9, (String)var3_3);
        var10_10.setEmail((String)var9_9);
        var10_10.setProfileId((String)var4_4);
        this.startLoader();
        var9_9 = this.q0;
        if (var9_9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
        } else {
            var7_7 = var9_9;
        }
        var7_7.b((QueryCustomer)var10_10, "login/signup screen");
    }

    public final void H0(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "eventLabel");
        Object object = this.q0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            object = null;
        }
        object = ((oa1_1)object).I;
        this.E2(string2, (String)object, false, bl2);
    }

    public final Fragment H2() {
        Object object = this.getSupportFragmentManager();
        Object object2 = "getSupportFragmentManager(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = ((FragmentManager)object).J();
        if (n3 > 0) {
            n3 = ((FragmentManager)object).J() + -1;
            object2 = ((FragmentManager)object).I(n3);
            String string2 = "getBackStackEntryAt(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = object2.getName();
            object = ((FragmentManager)object).E((String)object2);
        } else {
            object = null;
        }
        return object;
    }

    public final void I2() {
        Object object = new dk_1();
        this.v0 = object;
        object = new LoginActivityRevamp$b(this);
        Object object2 = j.j;
        ((j$b)object2).a().f();
        Object object3 = AccessToken.l;
        object3 = null;
        AccessToken$b.d(null);
        this.x0 = object2 = ((j$b)object2).a();
        if (object2 != null) {
            object3 = this.v0;
            Intrinsics.checkNotNull(object3);
            ((j)object2).i((bk_1)object3, (pi0_1)object);
        }
    }

    public final boolean Q0(User object, boolean bl2, String object2, boolean bl3, String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "user");
        Intrinsics.checkNotNullParameter(object2, "otpValue");
        Object object3 = (UserInformation)this.K0.getValue();
        Object object4 = null;
        if (object3 != null) {
            object3 = ((UserInformation)object3).getSecureRefreshToken();
        } else {
            n3 = 0;
            object3 = null;
        }
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            Object object5;
            boolean bl4;
            tj2_2.Companion.getClass();
            object3 = tj2$a_0.a();
            object3.getClass();
            Object object6 = "";
            Intrinsics.checkNotNullParameter(object6, "pincode");
            ((tj2_2)object3).a = object6;
            this.getAppPreferences().putPreference("LOCATION_DATA", (String)object6);
            object3 = this.q0;
            String string3 = "loginViewModel";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object3 = null;
            }
            object3.getClass();
            Object object7 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, (String)object7);
            ((oa1_1)object3).z = object;
            object = this.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl4 = false;
                object = null;
            }
            ((oa1_1)object).A = bl2;
            object = this.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl4 = false;
                object = null;
            }
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, (String)object7);
            ((oa1_1)object).B = object2;
            if (bl2) {
                object = this.q0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl4 = false;
                    object = null;
                }
                ((oa1_1)object).F = bl3;
                object = this.q0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl4 = false;
                    object = null;
                }
                ((oa1_1)object).G = string2;
            }
            bl4 = true;
            if (!bl2) {
                object5 = bv1_0.a;
                if (object5 != null && (bl2 = ((String)object5).length())) {
                    bv1_0.d = bl4;
                } else {
                    bl2 = bv1_0.h;
                    object2 = "login_source";
                    if (bl2) {
                        object5 = new Bundle();
                        Object object8 = bv1_0.e;
                        string2 = "AJIO_Referral";
                        object5.putString(string2, (String)object8);
                        object8 = this.q0;
                        if (object8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                        } else {
                            object4 = object8;
                        }
                        object8 = ((oa1_1)object4).I;
                        object5.putString((String)object2, (String)object8);
                        object2 = AnalyticsManager.Companion.getInstance();
                        object3 = ((AnalyticsManager)object2).getGtmEvents();
                        object6 = bv1_0.f;
                        object7 = ne_0.b((Bundle)object5);
                        string3 = "login - otp screen";
                        object4 = "user logged in";
                        int n4 = 16;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, (String)object4, object6, string3, (AnalyticsData)object7, null, n4, null);
                        bv1_0.d();
                    } else {
                        bl2 = bv1_0.g;
                        if (bl2) {
                            object5 = new Bundle();
                            Object object9 = this.q0;
                            if (object9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                            } else {
                                object4 = object9;
                            }
                            object9 = ((oa1_1)object4).I;
                            if (object9 != null) {
                                object6 = object9;
                            }
                            object5.putString((String)object2, (String)object6);
                            object2 = AnalyticsManager.Companion.getInstance();
                            object3 = ((AnalyticsManager)object2).getGtmEvents();
                            object6 = bv1_0.f;
                            object7 = ne_0.b((Bundle)object5);
                            string3 = "login - otp screen";
                            object4 = "user logged in";
                            int n7 = 16;
                            GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, (String)object4, object6, string3, (AnalyticsData)object7, null, n7, null);
                            bv1_0.d();
                        } else {
                            bv1_0.d();
                        }
                    }
                }
            }
            if ((object5 = this.A0) != null) {
                ((hy3_0)object5).n();
            }
            return bl4;
        }
        object = this.A0;
        if (object != null) {
            ((hy3_0)object).h();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void T(String string2, String object, boolean n3) {
        IllegalStateException illegalStateException2;
        block13: {
            boolean bl2;
            String string3;
            String string4;
            int n4;
            int n7;
            block12: {
                block11: {
                    n7 = 1;
                    this.H0 = n7;
                    Intrinsics.checkNotNullExpressionValue(this.getSupportFragmentManager().c.f(), "getFragments(...)");
                    object = this.getSupportFragmentManager();
                    n4 = ((FragmentManager)object).J();
                    n3 = 0;
                    string4 = null;
                    if (n4 == n7) {
                        this.m0(null, null, false, false);
                        return;
                    }
                    try {
                        object = this.H2();
                        if (object == null) break block11;
                        string3 = ((Fragment)object).getTag();
                        break block12;
                    }
                    catch (IllegalStateException illegalStateException2) {
                        break block13;
                    }
                }
                bl2 = false;
                string3 = null;
            }
            String string5 = "LoginPasswordFragment";
            bl2 = b.i(string3, string5, n7 != 0);
            if (bl2) {
                object = this.getSupportFragmentManager();
                string4 = "getSupportFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object, string4);
                while ((n3 = ((FragmentManager)object).J()) > n7) {
                    ((FragmentManager)object).W();
                }
                return;
            }
            if (object != null) {
                string3 = ((Fragment)object).getTag();
            } else {
                bl2 = false;
                string3 = null;
            }
            string5 = "SetPasswordFragment";
            bl2 = b.i(string3, string5, n7 != 0);
            if (bl2) {
                this.m0(null, null, n7 != 0, false);
                return;
            }
            if (object != null) {
                object = ((Fragment)object).getTag();
            } else {
                n4 = 0;
                object = null;
            }
            string3 = "LoginFragmentNew";
            n7 = b.i((String)object, string3, n7 != 0);
            if (n7) {
                this.m0(null, null, false, false);
                return;
            }
            super.onBackPressed();
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(illegalStateException2);
    }

    public final boolean V() {
        return this.H0;
    }

    public final boolean W1() {
        return this.G0;
    }

    public final void Z0(Fragment fragment, String string2) {
        Object object = "tag";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        if (fragment == null) {
            return;
        }
        int n3 = R$id.login_main_container;
        object = (FrameLayout)this.findViewById(n3);
        if (object != null) {
            object.removeAllViews();
        }
        object = this.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getSupportFragmentManager(...)");
        object.getClass();
        androidx.fragment.app.a a2 = new androidx.fragment.app.a((FragmentManager)object);
        Intrinsics.checkNotNullExpressionValue(a2, "beginTransaction(...)");
        n3 = R$anim.enter_from_right;
        int n4 = R$anim.exit_to_left;
        int n7 = R$anim.enter_from_left;
        int n8 = R$anim.exit_to_right;
        a2.k(n3, n4, n7, n8);
        n3 = R$id.login_main_container;
        a2.j(n3, fragment, string2);
        a2.c(string2);
        boolean bl2 = true;
        a2.o(bl2, bl2);
    }

    public final void f0(String string2, boolean bl2, boolean bl3) {
        LoginBaseActivity.F2(string2, bl2);
    }

    public final void l1(String object) {
        Object object2;
        boolean bl2;
        int n3 = 1;
        String string2 = "sourceScreen";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl3 = this.I0;
        if (!bl3) {
            object = StringCompanionObject.INSTANCE;
            object = hv3_0.K(R$string.acc_error_message);
            string2 = hv3_0.K(R$string.something_wrong_msg);
            Object[] objectArray = new Object[n3];
            objectArray[0] = string2;
            object = xh2_0.a(objectArray, n3, (String)object, "format(...)");
            hv3_0.o0(0, "Oops something went wrong", (String)object);
            return;
        }
        this.z0 = object;
        object = UrlHelper.Companion.getInstance().getBaseUrl();
        n3 = ((String)object).length();
        if (n3 > 0 && (bl2 = StringsKt.F((CharSequence)object, (CharSequence)(object2 = "ajio.com"), false))) {
            object = this.getAppPreferences();
            string2 = "";
            ((sw_0)object).putPreference("FACEBOOK_PROFILE_USERID", string2);
            ((sw_0)object).putPreference("FACEBOOK_PROFILE_NAME", string2);
            ((sw_0)object).putPreference("FACEBOOK_PROFILE_EMAIL", string2);
            object2 = "FACEBOOK_PROFILE_ACCESS_TOKEN";
            ((sw_0)object).putPreference((String)object2, string2);
            object = this.x0;
            if (object != null) {
                object2 = this.w0;
                ((j)object).e(this, (Collection)object2);
            }
            this.startLoader();
        } else {
            object = new AlertDialog.Builder((Context)this);
            object = object.setMessage((CharSequence)"Please Change to network other than Reliance Network");
            object2 = new wx1_0(this);
            string2 = "OK";
            object = object.setPositiveButton((CharSequence)string2, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
            object.show();
        }
    }

    public final void m0(String string2, String string3, boolean bl2, boolean bl3) {
        string2 = new Intent();
        string3 = new Bundle();
        String string4 = "OPTYPE";
        int n3 = 665;
        string3.putInt(string4, n3);
        string2.putExtras((Bundle)string3);
        if (bl2) {
            string3 = "GAME_URL";
            String string5 = this.J0;
            string2.putExtra(string3, string5);
            int n4 = -1;
            this.setResult(n4, (Intent)string2);
        }
        this.finish();
        ActivityTransitionManager.getInstance().slideInOutRight(this);
    }

    public final void o1() {
        this.H0 = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityResult(int n3, int n4, Intent intent) {
        block18: {
            block19: {
                ApiException apiException2;
                block17: {
                    Object object;
                    Object object2;
                    block16: {
                        Object object3;
                        int n7;
                        int n8;
                        object2 = this.v0;
                        if (object2 != null) {
                            ((dk_1)object2).onActivityResult(n3, n4, intent);
                        }
                        int n10 = -1;
                        boolean bl2 = true;
                        if (n4 == n10 && n3 == 0 && (object2 = this.B0) != null) {
                            n10 = 0;
                            object2 = null;
                            if (intent != null) {
                                n8 = Build.VERSION.SDK_INT;
                                n7 = 33;
                                if (n8 > n7) {
                                    object2 = (Parcelable)qx1_0.a(intent);
                                } else {
                                    object = intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
                                    n7 = object instanceof Credential;
                                    if (n7 != 0) {
                                        object2 = object;
                                    }
                                    object2 = (Credential)object2;
                                }
                                object2 = (Credential)object2;
                            }
                            if (object2 != null) {
                                object2 = ((Credential)object2).getId();
                                object = new StringBuilder((String)object2);
                            } else {
                                object = "";
                            }
                            object = (CharSequence)object;
                            n10 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                            if (n10 != 0) {
                                return;
                            }
                            n10 = object.length();
                            if (n10 > (n7 = 10)) {
                                n10 = object.length() - n7;
                                n7 = object.length();
                                object2 = ((Object)object.subSequence(n10, n7)).toString();
                                object = this.B0;
                                if (object != null) {
                                    Intrinsics.checkNotNullParameter(object2, "number");
                                    ((ry1_1)object).f = bl2;
                                    object3 = ((ry1_1)object).r;
                                    if (object3 != null && (object3 = ((FragmentLoginLayoutNewBinding)object3).mobileEt) != null) {
                                        object3.setText((CharSequence)object2);
                                    }
                                    if ((object2 = ((ry1_1)object).r) != null && (object2 = ((FragmentLoginLayoutNewBinding)object2).mobileEt) != null && (object2 = ((AppCompatEditText)object2).getText()) != null) {
                                        n10 = object2.length();
                                        object3 = ((ry1_1)object).r;
                                        if (object3 != null && (object3 = ((FragmentLoginLayoutNewBinding)object3).mobileEt) != null) {
                                            object3.setSelection(n10);
                                        }
                                    }
                                    ((ry1_1)object).Qa();
                                }
                            }
                        }
                        if (n3 != (n10 = 16)) break block18;
                        object2 = GoogleSignIn.getSignedInAccountFromIntent(intent);
                        object = "getSignedInAccountFromIntent(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                        try {
                            object = this.z0;
                            this.y2((Task)object2, (String)object);
                            object2 = UrlHelper.Companion;
                            object2 = ((UrlHelper$Companion)object2).getInstance();
                            object2 = ((UrlHelper)object2).getBaseUrl();
                            n8 = ((String)object2).length();
                            n7 = 0;
                            object3 = null;
                            if (n8 <= 0 || (n10 = (int)(StringsKt.F((CharSequence)object2, (CharSequence)(object = "ajio.com"), false) ? 1 : 0)) == 0) break block16;
                            this.G2(false, bl2);
                        }
                        catch (ApiException apiException2) {
                            break block17;
                        }
                    }
                    object2 = new AlertDialog.Builder((Context)this);
                    String string2 = "Please Change to Reliance Network";
                    object2 = object2.setMessage((CharSequence)string2);
                    string2 = "OK";
                    object = new cy1_1(this);
                    object2 = object2.setPositiveButton((CharSequence)string2, (DialogInterface.OnClickListener)object);
                    object2 = object2.setCancelable(false);
                    object2 = object2.create();
                    object2.show();
                    break block19;
                }
                this.z2(apiException2);
            }
            super.onActivityResult(n3, n4, intent);
        }
    }

    public final void onBackPressed() {
        this.T(null, null, false);
    }

    public void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.login_toolbar_imv_back;
        String string2 = "Header Clicks";
        if (n3 == n4) {
            object = AnalyticsManager.Companion;
            object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            String string3 = "back";
            ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object2, string2, string3);
            this.T(null, null, false);
        } else {
            n4 = R$id.login_toolbar_tv_skip;
            boolean bl2 = true;
            String string4 = "SetPasswordFragment";
            String string5 = "skip";
            if (n3 == n4) {
                object = AnalyticsManager.Companion;
                object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
                ((GTMEvents)object2).pushButtonTapEvent(string2, string5, (String)object);
                object = this.H2();
                if (object != null) {
                    object = ((Fragment)object).getTag();
                } else {
                    n3 = 0;
                    object = null;
                }
                n3 = (int)(b.i((String)object, string4, bl2) ? 1 : 0);
                if (n3 != 0) {
                    this.m0(null, null, bl2, false);
                } else {
                    this.finish();
                }
            } else {
                n4 = R$id.login_toolbar_iv_close;
                if (n3 == n4) {
                    object = AnalyticsManager.Companion;
                    object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                    object = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().getScreenName();
                    ((GTMEvents)object2).pushButtonTapEvent(string2, string5, (String)object);
                    object = this.H2();
                    if (object != null) {
                        object = ((Fragment)object).getTag();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    n3 = (int)(b.i((String)object, string4, bl2) ? 1 : 0);
                    if (n3 != 0) {
                        this.m0(null, null, bl2, false);
                    } else {
                        this.finish();
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        super.onCreate((Bundle)object);
        int bl22 = R$layout.activity_login_layout;
        this.setContentView(bl22);
        object = FacebookSDKHelper.INSTANCE;
        ((FacebookSDKHelper)object).initialize();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            object = this.getWindow();
            object.clearFlags(0x4000000);
            object.addFlags(-1 << -1);
            int n7 = hv3_0.m(R$color.accent_color_11);
            object.setStatusBarColor(n7);
            object = object.getDecorView();
            int n8 = 8192;
            object.setSystemUiVisibility(n8);
        }
        int n10 = R$id.login_toolbar;
        object = this.findViewById(n10);
        this.D0 = object;
        int n14 = R$id.login_toolbar_imv_back;
        object = (ImageView)this.findViewById(n14);
        this.u0 = object;
        int n15 = R$id.login_toolbar_tv_skip;
        object = (TextView)this.findViewById(n15);
        this.t0 = object;
        int n16 = R$id.login_toolbar_iv_close;
        object = (ImageView)this.findViewById(n16);
        this.F0 = object;
        int n17 = R$id.ajio_loader_view;
        object = (AjioLoaderView)this.findViewById(n17);
        this.C0 = object;
        object = this.getIntent();
        String string2 = null;
        this.r0 = bl2 = object.getBooleanExtra("FIRST_TIME_ON_BOARDING", false);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        Object object5 = "store";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        Object object6 = "factory";
        Intrinsics.checkNotNullParameter(object3, (String)object6);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object4, string3);
        Object object7 = oa1_1.class;
        String string4 = "modelClass";
        object2 = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object4, object7, string4);
        object3 = "<this>";
        object4 = sw0_0.a(object7, (String)object3, object7, string4, string4);
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        object7 = object4.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object7 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object7 = string6.concat((String)object7);
            this.q0 = object2 = (oa1_1)((pD3)object2).a((yn1_2)object4, (String)object7);
            object2 = this.F0;
            if (object2 != null) {
                ai0_2.B((View)object2);
            }
            if ((object2 = this.t0) != null) {
                ai0_2.i((View)object2);
            }
            object2 = kd3_2.a();
            object7 = this.getApplication();
            String string7 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object7, string7);
            object4 = new UserRepo((Application)object7);
            object7 = this.getApplication();
            ((kd3_2)object2).a = object4;
            ((kd3_2)object2).b = object7;
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNullParameter(this, (String)object);
            Intrinsics.checkNotNullParameter(object2, (String)object6);
            object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, (String)object5);
            Intrinsics.checkNotNullParameter(object2, (String)object6);
            Intrinsics.checkNotNullParameter(object, string3);
            object5 = hy3_0.class;
            object = im_1.a((rd3_0)object4, (kd3_2)object2, (Wd0)object, (Class)object5, string4);
            object2 = sw0_0.a((Class)object5, (String)object3, (Class)object5, string4, string4);
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                block25: {
                    object3 = string6.concat((String)object3);
                    this.A0 = object = (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
                    object = this.getIntent();
                    boolean bl3 = false;
                    object2 = null;
                    if (object != null) {
                        object3 = "GAME_URL";
                        object = object.getStringExtra((String)object3);
                    } else {
                        boolean bl4 = false;
                        object = null;
                    }
                    this.J0 = object;
                    object = this.getIntent();
                    object3 = "SOURCE";
                    if (object != null) {
                        object = object.getStringExtra((String)object3);
                    } else {
                        boolean bl5 = false;
                        object = null;
                    }
                    object4 = this.q0;
                    object5 = "loginViewModel";
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        object4 = null;
                    }
                    if (object == null) {
                        object = "";
                    }
                    object4.getClass();
                    object6 = "<set-?>";
                    Intrinsics.checkNotNullParameter(object, (String)object6);
                    ((oa1_1)object4).I = object;
                    object = this.q0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        boolean bl6 = false;
                        object = null;
                    }
                    object = ((oa1_1)object).o;
                    object4 = new xx1_0(this, 0);
                    object6 = new LoginActivityRevamp$c((Function1)object4);
                    ((LiveData)object).e(this, (F62)object6);
                    object = this.q0;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        boolean bl7 = false;
                        object = null;
                    }
                    if ((object = ((oa1_1)object).n) != null) {
                        object4 = new yx1_0(this, 0);
                        object6 = new LoginActivityRevamp$c((Function1)object4);
                        ((LiveData)object).e(this, (F62)object6);
                    }
                    if ((object = this.q0) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        boolean bl8 = false;
                        object = null;
                    }
                    object = ((oa1_1)object).k;
                    object4 = new zx1_0(this, 0);
                    object6 = new LoginActivityRevamp$c((Function1)object4);
                    ((LiveData)object).e(this, (F62)object6);
                    object = this.A0;
                    if (object != null && (object = ((hy3_0)object).l) != null) {
                        object4 = new ay1_2(this, 0);
                        object6 = new LoginActivityRevamp$c((Function1)object4);
                        ((LiveData)object).e(this, (F62)object6);
                    }
                    object = this.getUserViewModel().m;
                    object4 = new by1_2(this, 0);
                    object6 = new LoginActivityRevamp$c((Function1)object4);
                    ((LiveData)object).e(this, (F62)object6);
                    object = this.u0;
                    if (object != null) {
                        object.setOnClickListener((View.OnClickListener)this);
                    }
                    if ((object = this.t0) != null) {
                        object.setOnClickListener((View.OnClickListener)this);
                    }
                    if ((object = this.F0) != null) {
                        object.setOnClickListener((View.OnClickListener)this);
                    }
                    this.B0 = object = new ry1_1();
                    object = new Bundle();
                    object4 = this.q0;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    } else {
                        object2 = object4;
                    }
                    object2 = ((oa1_1)object2).I;
                    object.putString((String)object3, (String)object2);
                    object2 = this.B0;
                    if (object2 != null) {
                        ((Fragment)object2).setArguments((Bundle)object);
                    }
                    object = this.B0;
                    this.Z0((Fragment)object, "NewLoginFragment");
                    object2 = GoogleSignInOptions.DEFAULT_SIGN_IN;
                    object = new GoogleSignInOptions$Builder((GoogleSignInOptions)object2);
                    object = ((GoogleSignInOptions$Builder)object).requestEmail();
                    int n18 = R$string.default_web_client_id;
                    object2 = hv3_0.K(n18);
                    object = ((GoogleSignInOptions$Builder)object).requestIdToken((String)object2).build();
                    object2 = "build(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    this.s0 = object = GoogleSignIn.getClient(this, (GoogleSignInOptions)object);
                    boolean bl9 = true;
                    this.I2();
                    try {
                        this.I0 = bl9;
                    }
                    catch (Exception exception) {
                        object3 = exception.getMessage();
                        if (object3 == null) break block25;
                        Object[] objectArray = exception.getMessage();
                        Intrinsics.checkNotNull(objectArray);
                        object3 = "webview";
                        boolean bl10 = StringsKt.F((CharSequence)objectArray, (CharSequence)object3, bl9);
                        if (!bl10) break block25;
                        object = yn3_0.a;
                        objectArray = new Object[]{};
                        string2 = "web view app is either not present or updating in the phone";
                        ((yn3$a)object).a(string2, objectArray);
                    }
                }
                return;
            }
            object2 = string5.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string5.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onDownloadConfirmation(SplitInstallManager splitInstallManager, SplitInstallSessionState object) {
        if (splitInstallManager != null && object != null) {
            int n3 = 37;
            try {
                splitInstallManager.startConfirmationDialogForResult((SplitInstallSessionState)object, this, n3);
            }
            catch (Exception exception) {
                object = yn3_0.a;
                ((yn3$a)object).e(exception);
            }
        }
    }

    public final void s0(boolean n3) {
        ImageView imageView = this.u0;
        if (imageView != null) {
            n3 = n3 != 0 ? 0 : 8;
            imageView.setVisibility(n3);
        }
    }

    public final void startLoader() {
        AjioLoaderView ajioLoaderView = this.C0;
        if (ajioLoaderView != null && ajioLoaderView != null) {
            ajioLoaderView.startLoader();
        }
    }

    public final void stopLoader() {
        AjioLoaderView ajioLoaderView = this.C0;
        if (ajioLoaderView != null && ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
    }

    public final void v0(boolean bl2) {
        if (bl2) {
            ImageView imageView = this.F0;
            if (imageView != null) {
                ai0_2.i((View)imageView);
            }
        } else {
            ImageView imageView = this.F0;
            if (imageView != null) {
                ai0_2.B((View)imageView);
            }
        }
    }

    public final void w0(String object) {
        boolean bl2;
        Object object2 = "sourceScreen";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.z0 = object;
        object = UrlHelper.Companion.getInstance().getBaseUrl();
        int n3 = ((String)object).length();
        String string2 = null;
        if (n3 > 0 && (bl2 = StringsKt.F((CharSequence)object, (CharSequence)(object2 = "ajio.com"), false))) {
            object = this.getAppPreferences();
            string2 = "";
            ((sw_0)object).putPreference("GOOGLE_PROFILE_EMAIL", string2);
            ((sw_0)object).putPreference("GOOGLE_PROFILE_NAME", string2);
            ((sw_0)object).putPreference("GOOGLE_PROFILE_USERID", string2);
            object2 = "GOOGLE_PROFILE_ACCESS_TOKEN";
            ((sw_0)object).putPreference((String)object2, string2);
            object = this.s0;
            if (object != null) {
                object = ((GoogleSignInClient)object).getSignInIntent();
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                n3 = 16;
                this.startActivityForResult((Intent)object, n3);
            }
        } else {
            object = new AlertDialog.Builder((Context)this);
            object = object.setMessage((CharSequence)"Please Change to network other than Reliance Network");
            object2 = new vx1_0(this);
            String string3 = "OK";
            object = object.setPositiveButton((CharSequence)string3, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
            object.show();
        }
    }
}

