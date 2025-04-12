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
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jpl.crasdk.CraActivity;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.FacebookSDKHelper;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.managers.ActivityTransitionManager;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.login.activity.Hilt_LoginActivityRevampNew;
import com.ril.ajio.login.activity.LoginActivityRevampNew$a;
import com.ril.ajio.login.activity.LoginActivityRevampNew$b;
import com.ril.ajio.login.activity.LoginBaseActivity;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.Login.Data;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserProfileData;
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

public final class LoginActivityRevampNew
extends Hilt_LoginActivityRevampNew
implements View.OnClickListener,
a,
zh_2 {
    public static final LoginActivityRevampNew$a Companion;
    public static volatile String N0 = "";
    public String A0;
    public hy3_0 B0;
    public fz1_2 C0;
    public AjioLoaderView D0;
    public View E0;
    public AccountCheckResponse F0;
    public ImageView G0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public String K0;
    public boolean L0;
    public String M0;
    public final hh3_2 q0;
    public oa1_1 r0;
    public boolean s0;
    public GoogleSignInClient t0;
    public TextView u0;
    public ImageView v0;
    public dk_1 w0;
    public final List x0;
    public j y0;
    public String z0;

    static {
        LoginActivityRevampNew$a loginActivityRevampNew$a;
        Companion = loginActivityRevampNew$a = new Object();
    }

    public LoginActivityRevampNew() {
        Object object;
        this.q0 = object = yr1_2.b((Function0)object);
        this.x0 = object = xx_2.i("public_profile", "email");
        this.z0 = object = "";
        this.A0 = object;
        AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
        analyticsManager$Companion.getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
        this.M0 = object;
        analyticsManager$Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void A0(boolean bl2) {
        this.H0 = bl2;
    }

    public final void A1(boolean bl2) {
        wh_2 wh_22;
        if (!bl2) {
            int n3 = -1;
            this.setResult(n3);
        }
        if ((wh_22 = xh_1.a) != null) {
            wh_22.j1();
        }
        this.finish();
    }

    public final void E1(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            this.K2(string2);
        } else {
            this.finish();
        }
    }

    public final void F1(int n3) {
        View view = this.E0;
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
            this.z0 = "SIGIN_SOURCE_FACEBOOK";
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
                this.z0 = "SIGIN_SOURCE_GOOGLE";
                var4_4 = this.getAppPreferences();
                var5_5 = "GOOGLE_PROFILE_EMAIL";
                var4_4 = var4_4.getPreference((String)var5_5, (String)var3_3);
                ** continue;
            }
            var4_4 = var3_3;
        }
        var5_5 = this.r0;
        var7_7 = null;
        var8_8 = "loginViewModel";
        if (var5_5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
            var5_5 = null;
        }
        var5_5.w = var2_2;
        var9_9 = this.r0;
        if (var9_9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
            var2_2 = false;
            var9_9 = null;
        }
        var9_9.v = var1_1;
        var10_10 = this.r0;
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
        var9_9 = this.r0;
        if (var9_9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(var8_8);
        } else {
            var7_7 = var9_9;
        }
        var7_7.b((QueryCustomer)var10_10, "login/signup screen");
    }

    public final void H0(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "eventLabel");
        Object object = this.r0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            object = null;
        }
        object = ((oa1_1)object).I;
        this.E2(string2, (String)object, true, bl2);
    }

    public final void H2() {
        Object object = this.B0;
        if (object != null) {
            ((hy3_0)object).h();
        }
        if ((object = this.B0) != null) {
            ((hy3_0)object).f();
        }
        if ((object = this.B0) != null) {
            ((hy3_0)object).e();
        }
        tj2_2.Companion.getClass();
        object = tj2$a_0.a();
        object.getClass();
        String string2 = "";
        String string3 = "pincode";
        Intrinsics.checkNotNullParameter(string2, string3);
        ((tj2_2)object).a = string2;
        object = this.B0;
        if (object != null) {
            ((hy3_0)object).d();
        }
        this.getAppPreferences().putPreference("LOCATION_DATA", string2);
        this.getAppPreferences().B();
    }

    public final Fragment I2() {
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

    public final UserInformation J2() {
        Object object = this.q0.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void K2(String string2) {
        oa1_1 oa1_12 = this.r0;
        if (oa1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            oa1_12 = null;
        }
        oa1_12.getClass();
        Intrinsics.checkNotNullParameter(string2, "authCode");
        aW aW2 = md3_0.c(oa1_12);
        pa1_2 pa1_22 = new pa1_2(oa1_12, string2, null);
        Ae3.d(aW2, null, null, pa1_22, 3);
    }

    public final void L2() {
        Object object = new dk_1();
        this.w0 = object;
        object = new ry1_0(this);
        Object object2 = j.j;
        ((j$b)object2).a().f();
        Object object3 = AccessToken.l;
        object3 = null;
        AccessToken$b.d(null);
        this.y0 = object2 = ((j$b)object2).a();
        if (object2 != null) {
            object3 = this.w0;
            Intrinsics.checkNotNull(object3);
            ((j)object2).i((bk_1)object3, (pi0_1)object);
        }
    }

    public final void M2() {
        Object object = this.r0;
        Object object2 = null;
        Object object3 = "loginViewModel";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((oa1_1)object).o;
        int n3 = 0;
        Function1 function1 = new jy1_2(this, 0);
        LoginActivityRevampNew$b loginActivityRevampNew$b = new LoginActivityRevampNew$b(function1);
        ((LiveData)object).e(this, loginActivityRevampNew$b);
        object = this.r0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        if ((object = ((oa1_1)object).n) != null) {
            function1 = new ky1_2(this);
            loginActivityRevampNew$b = new LoginActivityRevampNew$b(function1);
            ((LiveData)object).e(this, loginActivityRevampNew$b);
        }
        if ((object = this.r0) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((oa1_1)object).i;
        function1 = new ly1_1(this);
        loginActivityRevampNew$b = new LoginActivityRevampNew$b(function1);
        ((LiveData)object).e(this, loginActivityRevampNew$b);
        object = this.r0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object = null;
        }
        object = ((oa1_1)object).k;
        n3 = 1;
        function1 = new gg0_1(this, n3);
        loginActivityRevampNew$b = new LoginActivityRevampNew$b(function1);
        ((LiveData)object).e(this, loginActivityRevampNew$b);
        object = this.r0;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object2 = object;
        }
        object = ((oa1_1)object2).j;
        if (object != null) {
            object2 = new my1_1(this);
            object3 = new LoginActivityRevampNew$b((Function1)object2);
            ((LiveData)object).e(this, (F62)object3);
        }
        if ((object = this.B0) != null && (object = ((hy3_0)object).l) != null) {
            object2 = new ny1_1(this);
            object3 = new LoginActivityRevampNew$b((Function1)object2);
            ((LiveData)object).e(this, (F62)object3);
        }
    }

    public final void N2(j80_0 object, String object2, String string2) {
        String string3 = "manual";
        Intrinsics.checkNotNullParameter(object, string3);
        object = new fz1_2();
        this.C0 = object;
        object = new Bundle();
        Object object3 = this.r0;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
            object3 = null;
        }
        object3 = ((oa1_1)object3).I;
        String string4 = "SOURCE";
        object.putString(string4, (String)object3);
        object3 = "Mobile Number";
        object.putString((String)object3, (String)object2);
        object.putString("Email Id", string2);
        object.putString("Continue Button Click Type", string3);
        object2 = this.C0;
        if (object2 != null) {
            ((Fragment)object2).setArguments((Bundle)object);
        }
        if ((object = this.C0) != null) {
            object2 = this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(object2, "getSupportFragmentManager(...)");
            string2 = "LoginFragmentNew";
            ((fz1_2)object).show((FragmentManager)object2, string2);
        }
    }

    public final void O2(UserProfileData object, boolean bl2, String string2) {
        Object object2;
        Object object3 = this.getAppPreferences();
        Object object4 = ((UserProfileData)object).getIdentity();
        if (object4 != null) {
            object2 = "IDENTITY";
            ((sw_0)object3).putPreference((String)object2, (String)object4);
        } else {
            object3.getClass();
        }
        object3 = this.getAppPreferences();
        boolean bl3 = ((UserProfileData)object).getDisplayEmail();
        ((sw_0)object3).putPreference("user_email_account_screen", bl3);
        object3 = this.getAppPreferences();
        bl3 = ((UserProfileData)object).getEmailVerified();
        object2 = "IS_RIL_EMAIL_VERIFIED";
        ((sw_0)object3).putPreference((String)object2, bl3);
        object3 = AnalyticsManager.Companion.getInstance().getCt();
        ((CleverTapEvents)object3).userLogin((UserProfileData)object);
        if (!bl2) {
            bl2 = this.s0;
            if (bl2) {
                at2_1.d((Context)this);
                this.finish();
            } else {
                Intent intent = new Intent();
                string2 = ((UserProfileData)object).getFirstName();
                intent.putExtra("first_name", string2);
                string2 = ((UserProfileData)object).getDisplayUid();
                intent.putExtra("user_name", string2);
                string2 = ((UserProfileData)object).getPassword();
                object3 = "user_pwd";
                intent.putExtra((String)object3, string2);
                object = ((UserProfileData)object).getLastName();
                intent.putExtra("last_name", (String)object);
                object = "GAME_URL";
                string2 = this.K0;
                intent.putExtra((String)object, string2);
                int n3 = -1;
                this.setResult(n3, intent);
                this.finish();
            }
        } else {
            this.stopLoader();
            Object object5 = xA1.Companion;
            object3 = ((UserProfileData)object).getDisplayUid();
            Intrinsics.checkNotNullExpressionValue(object3, "getDisplayUid(...)");
            object = ((UserProfileData)object).getName();
            object4 = this.r0;
            object2 = null;
            String string3 = "loginViewModel";
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl3 = false;
                object4 = null;
            }
            bl3 = ((oa1_1)object4).F;
            oa1_1 oa1_12 = this.r0;
            if (oa1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object2 = oa1_12;
            }
            object2 = ((oa1_1)object2).G;
            object5.getClass();
            object = xA1$a.a((String)object3, string2, (String)object, (String)object2, bl3);
            object5 = "SetPasswordFragment";
            this.Z0((Fragment)object, (String)object5);
        }
    }

    public final boolean Q0(User object, boolean bl2, String object2, boolean bl3, String string2) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "user");
        Intrinsics.checkNotNullParameter(object2, "otpValue");
        Object object3 = this.J2().getSecureRefreshToken();
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            Object object4;
            boolean bl4;
            tj2_2.Companion.getClass();
            object3 = tj2$a_0.a();
            object3.getClass();
            Object object5 = "";
            Intrinsics.checkNotNullParameter(object5, "pincode");
            ((tj2_2)object3).a = object5;
            this.getAppPreferences().putPreference("LOCATION_DATA", (String)object5);
            object3 = this.r0;
            object5 = null;
            String string3 = "loginViewModel";
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object3 = null;
            }
            object3.getClass();
            String string4 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, string4);
            ((oa1_1)object3).z = object;
            object = this.r0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl4 = false;
                object = null;
            }
            ((oa1_1)object).A = bl2;
            object = this.r0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl4 = false;
                object = null;
            }
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, string4);
            ((oa1_1)object).B = object2;
            if (bl2) {
                object = this.r0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl4 = false;
                    object = null;
                }
                ((oa1_1)object).F = bl3;
                object = this.r0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl4 = false;
                    object = null;
                }
                ((oa1_1)object).G = string2;
            }
            bl4 = true;
            if (!bl2) {
                object4 = bv1_0.a;
                if (object4 != null && (bl2 = ((String)object4).length())) {
                    bv1_0.d = bl4;
                } else {
                    bl2 = bv1_0.h;
                    object2 = "login_source";
                    if (bl2) {
                        object4 = new Bundle();
                        Object object6 = bv1_0.e;
                        string2 = "AJIO_Referral";
                        object4.putString(string2, (String)object6);
                        object6 = this.r0;
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                        } else {
                            object5 = object6;
                        }
                        object6 = ((oa1_1)object5).I;
                        object4.putString((String)object2, (String)object6);
                        object2 = AnalyticsManager.Companion.getInstance();
                        object3 = ((AnalyticsManager)object2).getGtmEvents();
                        string3 = bv1_0.f;
                        AnalyticsData analyticsData = ne_0.b((Bundle)object4);
                        string4 = "login - otp screen";
                        object5 = "user logged in";
                        int n4 = 16;
                        GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, (String)object5, string3, string4, analyticsData, null, n4, null);
                        bv1_0.d();
                    } else {
                        bl2 = bv1_0.g;
                        if (bl2) {
                            object4 = new Bundle();
                            Object object7 = this.r0;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                            } else {
                                object5 = object7;
                            }
                            object7 = ((oa1_1)object5).I;
                            object4.putString((String)object2, (String)object7);
                            object2 = AnalyticsManager.Companion.getInstance();
                            object3 = ((AnalyticsManager)object2).getGtmEvents();
                            string3 = bv1_0.f;
                            AnalyticsData analyticsData = ne_0.b((Bundle)object4);
                            string4 = "login - otp screen";
                            object5 = "user logged in";
                            int n7 = 16;
                            GTMEvents.pushButtonTapEvent$default((GTMEvents)object3, (String)object5, string3, string4, analyticsData, null, n7, null);
                            bv1_0.d();
                        } else {
                            bv1_0.d();
                        }
                    }
                }
            }
            object4 = this.B0;
            Intrinsics.checkNotNull(object4);
            ((hy3_0)object4).n();
            return bl4;
        }
        object = this.B0;
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
    public final void T(String object, String object2, boolean bl2) {
        IllegalStateException illegalStateException2;
        block16: {
            Object object3;
            boolean bl3;
            String string2;
            String string3;
            String string4;
            Object object4;
            int n3;
            block15: {
                block14: {
                    n3 = 1;
                    this.I0 = n3;
                    Intrinsics.checkNotNullExpressionValue(this.getSupportFragmentManager().c.f(), "getFragments(...)");
                    object4 = this.getSupportFragmentManager();
                    int n4 = ((FragmentManager)object4).J();
                    string4 = null;
                    if (n4 == n3) {
                        this.m0((String)object, (String)object2, false, bl2);
                        return;
                    }
                    try {
                        object4 = this.I2();
                        string3 = null;
                        if (object4 == null) break block14;
                        string2 = ((Fragment)object4).getTag();
                        break block15;
                    }
                    catch (IllegalStateException illegalStateException2) {
                        break block16;
                    }
                }
                bl3 = false;
                string2 = null;
            }
            String string5 = "LoginPasswordFragment";
            bl3 = b.i(string2, string5, n3 != 0);
            if (bl3) {
                int n7;
                object = this.getSupportFragmentManager();
                object2 = "getSupportFragmentManager(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                while ((n7 = ((FragmentManager)object).J()) > n3) {
                    ((FragmentManager)object).W();
                }
                return;
            }
            if (object4 != null) {
                string2 = ((Fragment)object4).getTag();
            } else {
                bl3 = false;
                string2 = null;
            }
            string5 = "SetPasswordFragment";
            bl3 = b.i(string2, string5, n3 != 0);
            if (bl3) {
                this.m0(null, null, n3 != 0, false);
                return;
            }
            if (!bl2) {
                super.onBackPressed();
                return;
            }
            if (object4 != null) {
                object3 = ((Fragment)object4).getTag();
            } else {
                bl2 = false;
                object3 = null;
            }
            string4 = "LoginPasswordFragmentNew";
            bl2 = b.i(object3, string4, n3 != 0);
            if (!bl2) {
                if (object4 != null) {
                    string3 = ((Fragment)object4).getTag();
                }
                if (!(bl2 = b.i(string3, object3 = "SignInOTPFragment", n3 != 0))) {
                    object3 = j80_0.MANUAL;
                    this.N2((j80_0)((Object)object3), (String)object, (String)object2);
                    return;
                }
            }
            super.onBackPressed();
            return;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(illegalStateException2);
    }

    public final boolean V() {
        return this.I0;
    }

    public final boolean W1() {
        return this.H0;
    }

    public final void X(String string2, String object) {
        Object object2;
        if (string2 != null) {
            this.startLoader();
            this.K2(string2);
            this.M0 = object = String.valueOf(object);
            object = this.r0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginViewModel");
                object = null;
            }
            object2 = this.M0;
            object.getClass();
            String string3 = "userType";
            Intrinsics.checkNotNullParameter(object2, string3);
            ((oa1_1)object).L = object2;
        }
        object = yn3_0.a;
        ((yn3$a)object).l("UCpauthcode");
        object2 = new Object[]{};
        ((yn3$a)object).a(string2, object2);
    }

    public final void Z0(Fragment fragment, String string2) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        int n3 = R$id.login_main_container;
        Object object = (FrameLayout)this.findViewById(n3);
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

    public final void e2() {
        Object object;
        Object object2 = this.J2().getUcpAccessToken();
        Intrinsics.checkNotNullExpressionValue(object2, "getUcpAccessToken(...)");
        String string2 = this.J2().getUcpRefreshToken();
        Intrinsics.checkNotNullExpressionValue(string2, "getUcpRefreshToken(...)");
        long l2 = this.J2().getUcpExpiresIn();
        int n3 = (int)l2;
        int n4 = 24;
        JsonObject jsonObject = null;
        String string3 = null;
        Object object3 = object;
        object = new Data((String)object2, n3, string2, null, null, n4, null);
        object3 = new Gson();
        ((Gson)object3).toJson(object);
        object = this.J2().getUcpAccessToken();
        object3 = "";
        if (object == null) {
            object = object3;
        }
        if ((object2 = this.J2().getUcpRefreshToken()) == null) {
            object2 = object3;
        }
        long l3 = this.J2().getUcpExpiresIn();
        jsonObject = new JsonObject();
        string3 = "access_token";
        jsonObject.addProperty(string3, (String)object);
        jsonObject.addProperty("refresh_token", (String)object2);
        object = l3;
        jsonObject.addProperty("expires", (Number)object);
        object = new JsonObject();
        ((JsonObject)object).add("cra_session", jsonObject);
        new JsonObject();
        object2 = new JsonObject();
        string2 = "success";
        ((JsonObject)object2).addProperty("status", string2);
        ((JsonObject)object2).add("result", (JsonElement)object);
        String string4 = "getSessionDetails";
        ((JsonObject)object2).addProperty("resolveKey", string4);
        object = com.jpl.crasdk.a.c;
        if (object == null) {
            object = new Object();
            ((com.jpl.crasdk.a)object).b = object3;
            com.jpl.crasdk.a.c = object;
        }
        object = com.jpl.crasdk.a.c;
        Intrinsics.checkNotNull(object);
        object3 = ((JsonElement)object2).toString();
        object2 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
        object.getClass();
        Intrinsics.checkNotNullParameter(object3, "sessionDetails");
        object = xh_1.a;
        if (object != null) {
            object.x0((String)object3);
        }
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
        boolean bl3 = this.J0;
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
        this.A0 = object;
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
            object = this.y0;
            if (object != null) {
                object2 = this.x0;
                ((j)object).e(this, (Collection)object2);
            }
            this.startLoader();
        } else {
            object = new AlertDialog.Builder((Context)this);
            object = object.setMessage((CharSequence)"Please Change to network other than Reliance Network");
            object2 = new oy1_0(this);
            string2 = "OK";
            object = object.setPositiveButton((CharSequence)string2, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
            object.show();
        }
    }

    public final void m0(String object, String string2, boolean n3, boolean n4) {
        Object object2;
        Object object3 = new Intent();
        Object object4 = new Bundle();
        String string3 = "OPTYPE";
        int n7 = 665;
        object4.putInt(string3, n7);
        object3.putExtras(object4);
        if (n3 != 0) {
            object2 = "GAME_URL";
            object4 = this.K0;
            object3.putExtra((String)object2, (String)object4);
            n3 = -1;
            this.setResult(n3, (Intent)object3);
        }
        if (n4 == 0) {
            this.finish();
            object = ActivityTransitionManager.getInstance();
            ((ActivityTransitionManager)object).slideInOutRight(this);
        } else {
            object2 = this.getSupportFragmentManager();
            n3 = ((FragmentManager)object2).J();
            if (n3 >= 0) {
                n4 = 0;
                while (true) {
                    object3 = this.getSupportFragmentManager();
                    ((FragmentManager)object3).V();
                    if (n4 == n3) break;
                    ++n4;
                }
            }
            object2 = j80_0.MANUAL;
            this.N2((j80_0)((Object)object2), (String)object, string2);
        }
    }

    public final void o1() {
        this.I0 = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onActivityResult(int n3, int n4, Intent intent) {
        block16: {
            block17: {
                ApiException apiException2;
                block15: {
                    Object object;
                    Object object2;
                    block14: {
                        AppCompatEditText appCompatEditText;
                        int n7;
                        int n8;
                        object2 = this.w0;
                        if (object2 != null) {
                            Intrinsics.checkNotNull(object2);
                            ((dk_1)object2).onActivityResult(n3, n4, intent);
                        }
                        int n10 = -1;
                        int n14 = 1;
                        if (n4 == n10 && n3 == 0 && (object2 = this.C0) != null) {
                            n10 = 0;
                            object2 = null;
                            if (intent != null && (n8 = intent.hasExtra((String)(object = "com.google.android.gms.credentials.Credential"))) == n14) {
                                n8 = Build.VERSION.SDK_INT;
                                int n15 = 33;
                                if (n8 > n15) {
                                    object = (Parcelable)qx1_0.a(intent);
                                } else {
                                    n8 = (object = intent.getParcelableExtra((String)object)) instanceof Credential;
                                    if (n8 == 0) {
                                        n7 = 0;
                                        object = null;
                                    }
                                    object = (Credential)object;
                                }
                                object = (Credential)object;
                                if (object != null) {
                                    object2 = object;
                                }
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
                            if (n10 > (n8 = 10)) {
                                n10 = object.length() - n8;
                                n8 = object.length();
                                object2 = ((Object)object.subSequence(n10, n8)).toString();
                                object = this.C0;
                                if (object != null) {
                                    Intrinsics.checkNotNullParameter(object2, "number");
                                    ((fz1_2)object).f = n14;
                                    appCompatEditText = ((fz1_2)object).Qa().mobileEt;
                                    appCompatEditText.setText((CharSequence)object2);
                                    ((fz1_2)object).Ta();
                                }
                            }
                        }
                        if (n3 != (n10 = 16)) break block16;
                        object2 = GoogleSignIn.getSignedInAccountFromIntent(intent);
                        object = "getSignedInAccountFromIntent(...)";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                        try {
                            object = this.A0;
                            this.y2((Task)object2, (String)object);
                            object2 = UrlHelper.Companion;
                            object2 = ((UrlHelper$Companion)object2).getInstance();
                            object2 = ((UrlHelper)object2).getBaseUrl();
                            n7 = ((String)object2).length();
                            n8 = 0;
                            appCompatEditText = null;
                            if (n7 <= 0 || (n10 = (int)(StringsKt.F((CharSequence)object2, (CharSequence)(object = "ajio.com"), false) ? 1 : 0)) == 0) break block14;
                            this.G2(false, n14 != 0);
                        }
                        catch (ApiException apiException2) {
                            break block15;
                        }
                    }
                    object2 = new AlertDialog.Builder((Context)this);
                    String string2 = "Please Change to Reliance Network";
                    object2 = object2.setMessage((CharSequence)string2);
                    string2 = "OK";
                    object = new fy1_0(this);
                    object2 = object2.setPositiveButton((CharSequence)string2, (DialogInterface.OnClickListener)object);
                    object2 = object2.setCancelable(false);
                    object2 = object2.create();
                    object2.show();
                    break block17;
                }
                this.z2(apiException2);
            }
            super.onActivityResult(n3, n4, intent);
        }
    }

    public final void onBackPressed() {
        boolean bl2;
        oa1_1 oa1_12 = this.r0;
        Object object = null;
        String string2 = "loginViewModel";
        if (oa1_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            oa1_12 = null;
        }
        bl2 = oa1_12.h;
        String string3 = "";
        if (bl2) {
            oa1_12 = this.r0;
            if (oa1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                oa1_12 = null;
            }
            bl2 = oa1_12.e;
            oa1_1 oa1_13 = this.r0;
            if (oa1_13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = oa1_13;
            }
            object = ((oa1_1)object).f;
            this.T((String)object, string3, bl2);
        } else {
            oa1_12 = this.r0;
            if (oa1_12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                oa1_12 = null;
            }
            bl2 = oa1_12.e;
            oa1_1 oa1_14 = this.r0;
            if (oa1_14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = oa1_14;
            }
            object = ((oa1_1)object).g;
            this.T(string3, (String)object, bl2);
        }
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
                object = this.I2();
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
                    object = this.I2();
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
        super.onCreate((Bundle)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        boolean bl2 = true;
        if (n3 != n4) {
            this.setRequestedOrientation((int)(bl2 ? 1 : 0));
        }
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        Object object6 = "store";
        Intrinsics.checkNotNullParameter(object3, (String)object6);
        Object object7 = "factory";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        String string2 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string2);
        Object object8 = oa1_1.class;
        String string3 = "modelClass";
        object3 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object5, object8, string3);
        object4 = "<this>";
        object5 = sw0_0.a(object8, (String)object4, object8, string3, string3);
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object8 = object5.getQualifiedName();
        String string4 = "Local and anonymous classes can not be ViewModels";
        if (object8 != null) {
            String string5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object8 = string5.concat((String)object8);
            this.r0 = object3 = (oa1_1)((pD3)object3).a((yn1_2)object5, (String)object8);
            object3 = kd3_2.a();
            object8 = this.getApplication();
            String string6 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object8, string6);
            object5 = new UserRepo((Application)object8);
            object8 = this.getApplication();
            ((kd3_2)object3).a = object5;
            ((kd3_2)object3).b = object8;
            Intrinsics.checkNotNull(object3);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object3, (String)object7);
            object5 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object2 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object5, (String)object6);
            Intrinsics.checkNotNullParameter(object3, (String)object7);
            Intrinsics.checkNotNullParameter(object2, string2);
            object6 = hy3_0.class;
            object2 = im_1.a((rd3_0)object5, (kd3_2)object3, (Wd0)object2, (Class)object6, string3);
            object3 = sw0_0.a((Class)object6, (String)object4, (Class)object6, string3, string3);
            Intrinsics.checkNotNullParameter(object3, (String)object4);
            object4 = object3.getQualifiedName();
            if (object4 != null) {
                block33: {
                    object4 = string5.concat((String)object4);
                    this.B0 = object2 = (hy3_0)((pD3)object2).a((yn1_2)object3, (String)object4);
                    object2 = h40_0.a;
                    n4 = (int)(h40_0.u2() ? 1 : 0);
                    object3 = "<set-?>";
                    int n7 = 0;
                    object4 = null;
                    object5 = "loginViewModel";
                    object6 = null;
                    if (n4 != 0) {
                        object = this.getIntent();
                        object2 = "isEditProfile";
                        n3 = (int)(object.getBooleanExtra((String)object2, false) ? 1 : 0);
                        this.L0 = n3;
                        this.M2();
                        n3 = (int)(h40_0.u2() ? 1 : 0);
                        if (n3 != 0) {
                            JI3.a = this;
                            object = new Object();
                            object2 = vh_2.LOGIN;
                            ((yh_2)object).e = object2;
                            ((yh_2)object).a = "074297cf-f238-4c48-8cbc-7c14fd07a8f9";
                            String string7 = "";
                            ((yh_2)object).b = "70001";
                            ((yh_2)object).c = "ajioapp";
                            ((yh_2)object).f = "prod";
                            ((yh_2)object).d = "ajio.com";
                            object4 = bv1_0.a;
                            object4 = object4 != null && (n7 = ((String)object4).length()) != 0 ? String.valueOf(bv1_0.a) : string7;
                            boolean bl3 = this.L0;
                            if (bl3) {
                                object2 = vh_2.UPDATE_PROFILE;
                                Intrinsics.checkNotNullParameter(object2, (String)object3);
                                ((yh_2)object).e = object2;
                            } else {
                                bl3 = TextUtils.isEmpty((CharSequence)object4);
                                if (!bl3) {
                                    object7 = "utm_source=Ajio_Android_App&utm_medium=referral ingress&referral_code=";
                                    ((yh_2)object).g = object4 = ((String)object7).concat((String)object4);
                                } else {
                                    object4 = this.r0;
                                    if (object4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                        n7 = 0;
                                        object4 = null;
                                    }
                                    Companion.getClass();
                                    object7 = N0;
                                    object4.getClass();
                                    object4 = oa1_1.n((String)object7);
                                    object7 = "utm_source=Ajio_Android_App&utm_medium=";
                                    ((yh_2)object).g = object4 = kp1_0.c((String)object7, (String)object4);
                                }
                                Intrinsics.checkNotNullParameter(object2, (String)object3);
                                ((yh_2)object).e = object2;
                            }
                            object2 = com.jpl.crasdk.a.c;
                            if (object2 == null) {
                                object2 = new Object();
                                ((com.jpl.crasdk.a)object2).b = string7;
                                com.jpl.crasdk.a.c = object2;
                            }
                            object2 = com.jpl.crasdk.a.c;
                            Intrinsics.checkNotNull(object2);
                            object2.getClass();
                            Intrinsics.checkNotNullParameter(this, "clientActivity");
                            Intrinsics.checkNotNullParameter(object, "craConfigModel");
                            ((com.jpl.crasdk.a)object2).a = object;
                            object = new StringBuilder();
                            object4 = this.getPackageName();
                            ((StringBuilder)object).append((String)object4);
                            ((StringBuilder)object).append(string7);
                            ((com.jpl.crasdk.a)object2).b = object = ((StringBuilder)object).toString();
                            object2 = CraActivity.class;
                            object = new Intent((Context)this, (Class)object2);
                            this.startActivity((Intent)object);
                        }
                        object = this.r0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        } else {
                            object6 = object;
                        }
                        Companion.getClass();
                        object = N0;
                        object6.getClass();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        ((oa1_1)object6).I = object;
                    } else {
                        n4 = R$layout.activity_login_layout;
                        this.setContentView(n4);
                        object2 = FacebookSDKHelper.INSTANCE;
                        ((FacebookSDKHelper)object2).initialize();
                        n4 = 23;
                        if (n3 >= n4) {
                            object = this.getWindow();
                            object.clearFlags(0x4000000);
                            object.addFlags(-1 << -1);
                            n4 = hv3_0.m(R$color.accent_color_11);
                            object.setStatusBarColor(n4);
                            object = object.getDecorView();
                            n4 = 8192;
                            object.setSystemUiVisibility(n4);
                        }
                        n3 = R$id.login_toolbar;
                        object = this.findViewById(n3);
                        this.E0 = object;
                        n3 = R$id.login_toolbar_imv_back;
                        object = (ImageView)this.findViewById(n3);
                        this.v0 = object;
                        n3 = R$id.login_toolbar_tv_skip;
                        object = (TextView)this.findViewById(n3);
                        this.u0 = object;
                        n3 = R$id.login_toolbar_iv_close;
                        object = (ImageView)this.findViewById(n3);
                        this.G0 = object;
                        n3 = R$id.ajio_loader_view;
                        object = (AjioLoaderView)this.findViewById(n3);
                        this.D0 = object;
                        object = this.getIntent();
                        object2 = "FIRST_TIME_ON_BOARDING";
                        n3 = (int)(object.getBooleanExtra((String)object2, false) ? 1 : 0);
                        this.s0 = n3;
                        object = this.u0;
                        if (object != null) {
                            ai0_2.i((View)object);
                        }
                        if ((object = this.G0) != null) {
                            ai0_2.i((View)object);
                        }
                        if ((object = this.getIntent()) != null) {
                            object2 = "GAME_URL";
                            object = object.getStringExtra((String)object2);
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        this.K0 = object;
                        object = this.getIntent();
                        object2 = "SOURCE";
                        if (object != null) {
                            object = object.getStringExtra((String)object2);
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        object7 = this.r0;
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            boolean bl4 = false;
                            object7 = null;
                        }
                        if (object == null) {
                            Companion.getClass();
                            object = N0;
                        }
                        object7.getClass();
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        ((oa1_1)object7).I = object;
                        this.M2();
                        object = this.v0;
                        if (object != null) {
                            object.setOnClickListener((View.OnClickListener)this);
                        }
                        if ((object = this.u0) != null) {
                            object.setOnClickListener((View.OnClickListener)this);
                        }
                        if ((object = this.G0) != null) {
                            object.setOnClickListener((View.OnClickListener)this);
                        }
                        this.C0 = object = new fz1_2();
                        object = new Bundle();
                        object3 = this.r0;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                        } else {
                            object6 = object3;
                        }
                        object3 = ((oa1_1)object6).I;
                        object.putString((String)object2, (String)object3);
                        object2 = this.C0;
                        if (object2 != null) {
                            ((Fragment)object2).setArguments((Bundle)object);
                        }
                        if ((object = this.C0) != null) {
                            object2 = this.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(object2, "getSupportFragmentManager(...)");
                            object3 = "LoginFragmentNew";
                            ((fz1_2)object).show((FragmentManager)object2, (String)object3);
                        }
                        object2 = GoogleSignInOptions.DEFAULT_SIGN_IN;
                        object = new GoogleSignInOptions$Builder((GoogleSignInOptions)object2);
                        object = ((GoogleSignInOptions$Builder)object).requestEmail();
                        n4 = R$string.default_web_client_id;
                        object2 = hv3_0.K(n4);
                        object = ((GoogleSignInOptions$Builder)object).requestIdToken((String)object2).build();
                        object2 = "build(...)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        this.t0 = object = GoogleSignIn.getClient(this, (GoogleSignInOptions)object);
                        this.L2();
                        try {
                            this.J0 = bl2;
                        }
                        catch (Exception exception) {
                            object2 = exception.getMessage();
                            if (object2 == null) break block33;
                            Object object9 = exception.getMessage();
                            Intrinsics.checkNotNull(object9);
                            object2 = "webview";
                            n3 = (int)(StringsKt.F((CharSequence)object9, (CharSequence)object2, bl2) ? 1 : 0);
                            if (n3 == 0) break block33;
                            object9 = yn3_0.a;
                            object2 = new Object[]{};
                            String string8 = "web view app is either not present or updating in the phone";
                            ((yn3$a)object9).a(string8, (Object[])object2);
                        }
                    }
                }
                return;
            }
            object2 = string4.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string4.toString();
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
        ImageView imageView = this.v0;
        if (imageView != null) {
            Intrinsics.checkNotNull(imageView);
            n3 = n3 != 0 ? 0 : 8;
            imageView.setVisibility(n3);
        }
    }

    public final void startLoader() {
        AjioLoaderView ajioLoaderView = this.D0;
        if (ajioLoaderView != null && ajioLoaderView != null) {
            ajioLoaderView.startLoader();
        }
    }

    public final void stopLoader() {
        AjioLoaderView ajioLoaderView = this.D0;
        if (ajioLoaderView != null && ajioLoaderView != null) {
            ajioLoaderView.stopLoader();
        }
    }

    public final void v0(boolean bl2) {
        if (bl2) {
            ImageView imageView = this.G0;
            if (imageView != null) {
                ai0_2.i((View)imageView);
            }
        } else {
            ImageView imageView = this.G0;
            if (imageView != null) {
                ai0_2.B((View)imageView);
            }
        }
    }

    public final void w0(String object) {
        boolean bl2;
        Object object2 = "sourceScreen";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.A0 = object;
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
            object = this.t0;
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
            object2 = new ey1_1(this);
            String string3 = "OK";
            object = object.setPositiveButton((CharSequence)string3, (DialogInterface.OnClickListener)object2).setCancelable(false).create();
            object.show();
        }
    }
}

