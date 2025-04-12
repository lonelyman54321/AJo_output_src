/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputLayout;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class pA1
extends N51
implements View.OnClickListener {
    public static final pA1$a Companion;
    public final NewCustomEventsRevamp A;
    public final String B;
    public final String C;
    public final t30_0 D;
    public final hh3_2 f;
    public AccountCheckResponse g;
    public TextInputLayout h;
    public EditText i;
    public TextView j;
    public TextView k;
    public boolean l;
    public boolean m;
    public TextView n;
    public String o;
    public String p;
    public oa1_1 q;
    public View r;
    public ImageView s;
    public EditText t;
    public TextInputLayout u;
    public TextView v;
    public com.ril.ajio.login.activity.a w;
    public Bundle x;
    public boolean y;
    public final NewEEcommerceEventsRevamp z;

    static {
        pA1$a pA1$a;
        Companion = pA1$a = new Object();
    }

    public pA1() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new o21_0(this, 1);
        this.f = object = yr1_2.b((Function0)object);
        this.o = "";
        object = AnalyticsManager.Companion;
        this.z = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.A = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.B = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.C = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.D = object = new t30_0();
    }

    /*
     * Unable to fully structure code
     */
    public static final void Pa(pA1 var0) {
        var1_1 = var0.r;
        var2_2 = 1;
        var3_3 = 0;
        var4_4 = null;
        var5_5 = 32;
        var6_6 = 0;
        if (var1_1 == null || (var7_7 = var1_1.getVisibility()) != 0) ** GOTO lbl-1000
        var1_1 = var0.t;
        if (var1_1 != null && (var1_1 = var1_1.getText()) != null && (var1_1 = var1_1.toString()) != null) {
            var8_8 = var1_1.length() - var2_2;
            var9_9 = 0;
            var10_10 = false;
            while (var9_9 <= var8_8) {
                var11_11 = var10_10 == false ? var9_9 : var8_8;
                var11_11 = Intrinsics.compare(var1_1.charAt(var11_11), var5_5);
                var11_11 = var11_11 <= 0 ? 1 : 0;
                if (!var10_10) {
                    if (var11_11 == 0) {
                        var10_10 = true;
                        continue;
                    }
                    ++var9_9;
                    continue;
                }
                if (var11_11 == 0) break;
                var8_8 += -1;
            }
            var1_1 = com.jio.jioads.adinterfaces.a.a(var8_8, var2_2, var9_9, (String)var1_1);
        } else {
            var7_7 = 0;
            var1_1 = null;
        }
        if (var1_1 == null || (var7_7 = var1_1.length()) == 0) {
            var7_7 = 0;
            var1_1 = null;
        } else lbl-1000:
        // 2 sources

        {
            var7_7 = 1;
        }
        var12_12 = var0.i;
        if (var12_12 != null && (var12_12 = var12_12.getText()) != null && (var12_12 = var12_12.toString()) != null) {
            var3_3 = var12_12.length() - var2_2;
            var9_9 = 0;
            var10_10 = false;
            while (var9_9 <= var3_3) {
                var11_11 = var10_10 == false ? var9_9 : var3_3;
                var11_11 = Intrinsics.compare(var12_12.charAt(var11_11), var5_5);
                var11_11 = var11_11 <= 0 ? 1 : 0;
                if (!var10_10) {
                    if (var11_11 == 0) {
                        var10_10 = true;
                        continue;
                    }
                    ++var9_9;
                    continue;
                }
                if (var11_11 == 0) break;
                var3_3 += -1;
            }
            var4_4 = com.jio.jioads.adinterfaces.a.a(var3_3, var2_2, var9_9, (String)var12_12);
        }
        if (var4_4 != null && (var2_2 = var4_4.length()) != 0) {
            var6_6 = var7_7;
        }
        var0.Qa((boolean)var6_6);
    }

    public final void Qa(boolean bl2) {
        if (bl2) {
            float f5;
            int n3;
            TextView textView = this.j;
            if (textView != null) {
                n3 = 1;
                f5 = Float.MIN_VALUE;
                textView.setClickable(n3 != 0);
            }
            if ((textView = this.j) != null) {
                n3 = 1065353216;
                f5 = 1.0f;
                textView.setAlpha(f5);
            }
        } else {
            float f6;
            int n4;
            TextView textView = this.j;
            if (textView != null) {
                n4 = 0;
                f6 = 0.0f;
                textView.setClickable(false);
            }
            if ((textView = this.j) != null) {
                n4 = 1058642330;
                f6 = 0.6f;
                textView.setAlpha(f6);
            }
        }
    }

    public final QueryCustomer Ra() {
        QueryCustomer queryCustomer = new QueryCustomer();
        boolean bl2 = this.l;
        if (bl2) {
            bl2 = true;
            queryCustomer.setMobileNumberEnterered(bl2);
            String string2 = this.p;
            queryCustomer.setMobileNumber(string2);
        } else {
            bl2 = false;
            queryCustomer.setMobileNumberEnterered(false);
            String string3 = this.p;
            Intrinsics.checkNotNull(string3);
            string3 = string3.toLowerCase();
            String string4 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string3, string4);
            queryCustomer.setEmail(string3);
        }
        return queryCustomer;
    }

    public final void Sa(String object) {
        Object object2 = new mA1(this, (String)object);
        object = new o53_0((Callable)object2);
        object2 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object2);
        object2 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object2);
        object2 = new fy0_2(this, 1);
        nA1 nA12 = new nA1((Function1)object2);
        object2 = new oA1(this);
        ia1_0 ia1_02 = new ia1_0((oA1)object2);
        object = ((g53_0)object).f(nA12, ia1_02);
        Intrinsics.checkNotNullExpressionValue(object, "subscribe(...)");
        this.D.b((yr0_2)object);
    }

    public final void Ta(boolean bl2) {
        Object object;
        Object object2 = this.w;
        if (object2 != null) {
            object2.startLoader();
        }
        object2 = new QueryCustomer();
        boolean bl3 = this.l;
        if (bl3) {
            object = this.p;
            ((QueryCustomer)object2).setMobileNumber((String)object);
            bl3 = true;
            ((QueryCustomer)object2).setMobileNumberEnterered(bl3);
        } else {
            object = this.p;
            Intrinsics.checkNotNull(object);
            object = ((String)object).toLowerCase();
            String string2 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ((QueryCustomer)object2).setEmail((String)object);
            bl3 = false;
            object = null;
            ((QueryCustomer)object2).setMobileNumberEnterered(false);
        }
        object = this.q;
        if (object != null) {
            ((oa1_1)object).H = bl2;
        }
        Intrinsics.checkNotNull(object);
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "<set-?>");
        ((oa1_1)object).C = object2;
        oa1_1 oa1_12 = this.q;
        Intrinsics.checkNotNull(oa1_12);
        oa1_12.k((QueryCustomer)object2, "login - password screen");
    }

    public final void Ua() {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && (object = this.g) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.p)))) {
            object = this.w;
            if (object != null) {
                object.startLoader();
            }
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            Object object2 = "captcha regenration";
            String string2 = "login - password screen";
            ((GTMEvents)object).pushButtonTapEvent((String)object2, object2, string2);
            object = this.Ra();
            object2 = "";
            ((QueryCustomer)object).setPassword((String)object2);
            String string3 = ((jo_2)this.f.getValue()).a();
            ((QueryCustomer)object).setAdId(string3);
            boolean bl3 = true;
            ((QueryCustomer)object).setRefreshCaptcha(bl3);
            string3 = "manual";
            ((QueryCustomer)object).setLoginvia(string3);
            this.o = object2;
            object2 = this.q;
            Intrinsics.checkNotNull(object2);
            ((oa1_1)object2).l((QueryCustomer)object, string2);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void Va() {
        hv3_0.S(this.getActivity());
        var1_1 /* !! */  = this.i;
        Intrinsics.checkNotNull(var1_1 /* !! */ );
        var1_1 /* !! */  = var1_1 /* !! */ .getText();
        var2_2 = 32;
        var3_3 /* !! */  = null;
        var4_4 = 0;
        var5_5 /* !! */  = null;
        var6_6 = 1;
        if (var1_1 /* !! */  != null && (var1_1 /* !! */  = var1_1 /* !! */ .toString()) != null) {
            var7_7 = var1_1 /* !! */ .length() - var6_6;
            var8_8 = 0;
            var9_9 = null;
            var10_10 = 0;
            var11_11 = null;
            while (var8_8 <= var7_7) {
                var12_12 = var10_10 == 0 ? var8_8 : var7_7;
                if ((var12_12 = Intrinsics.compare(var1_1 /* !! */ .charAt(var12_12), var2_2)) <= 0) {
                    var12_12 = 1;
                } else {
                    var12_12 = 0;
                    var13_13 = null;
                }
                if (var10_10 == 0) {
                    if (var12_12 == 0) {
                        var10_10 = 1;
                        continue;
                    }
                    ++var8_8;
                    continue;
                }
                if (var12_12 == 0) break;
                var7_7 += -1;
            }
            var1_1 /* !! */  = com.jio.jioads.adinterfaces.a.a(var7_7, var6_6, var8_8, (String)var1_1 /* !! */ );
        } else {
            var14_14 = 0;
            var1_1 /* !! */  = null;
        }
        var15_15 = this.r;
        Intrinsics.checkNotNull(var15_15);
        var7_7 = var15_15.getVisibility();
        if (var7_7 != 0) ** GOTO lbl91
        var15_15 = this.t;
        if (var15_15 != null && (var15_15 = var15_15.getText()) != null && (var15_15 = var15_15.toString()) != null) {
            var8_8 = var15_15.length() - var6_6;
            var10_10 = 0;
            var11_11 = null;
            var12_12 = 0;
            var13_13 = null;
            while (var10_10 <= var8_8) {
                var16_16 = var12_12 == 0 ? var10_10 : var8_8;
                var16_16 = Intrinsics.compare(var15_15.charAt(var16_16), var2_2);
                var16_16 = var16_16 <= 0 ? 1 : 0;
                if (var12_12 == 0) {
                    if (var16_16 == 0) {
                        var12_12 = 1;
                        continue;
                    }
                    ++var10_10;
                    continue;
                }
                if (var16_16 == 0) break;
                var8_8 += -1;
            }
            var17_17 = com.jio.jioads.adinterfaces.a.a(var8_8, var6_6, var10_10, (String)var15_15);
        } else {
            var2_2 = 0;
            var17_17 = null;
        }
        var7_7 = (int)TextUtils.isEmpty(var17_17);
        if (var7_7 != 0) {
            var3_3 /* !! */  = this.u;
            var18_18 = "Please enter text";
            if (var3_3 /* !! */  != null) {
                var3_3 /* !! */ .setError((CharSequence)var18_18);
            }
            if ((var3_3 /* !! */  = this.v) != null) {
                var3_3 /* !! */ .setText((CharSequence)var18_18);
            }
            if ((var3_3 /* !! */  = this.v) != null) {
                var3_3 /* !! */ .setVisibility(0);
            }
            var18_18 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            var15_15 = "formErrorEvent";
            var9_9 = "Password page form";
            var11_11 = "Please enter text";
            var13_13 = "login - password screen";
            var16_16 = 0;
            var19_19 = 112;
            GTMEvents.gtmEventsToGa$default((GTMEvents)var18_18, (String)var15_15, var9_9, var11_11, var13_13, null, null, null, var19_19, null);
            var3_3 /* !! */  = var17_17;
        } else {
            var5_5 /* !! */  = this.u;
            if (var5_5 /* !! */  != null) {
                var5_5 /* !! */ .setError(null);
            }
            if ((var3_3 /* !! */  = this.v) != null) {
                var4_4 = 4;
                var3_3 /* !! */ .setVisibility(var4_4);
            }
            var3_3 /* !! */  = var17_17;
lbl91:
            // 2 sources

            var4_4 = 1;
        }
        if (var1_1 /* !! */  != null && (var2_2 = var1_1 /* !! */ .length()) != 0) {
            if (var4_4 != 0 && (var2_2 = (int)TextUtils.isEmpty((CharSequence)var1_1 /* !! */ )) == 0 && (var17_17 = this.getActivity()) != null && (var17_17 = this.g) != null && (var2_2 = (int)TextUtils.isEmpty((CharSequence)(var17_17 = this.p))) == 0) {
                var17_17 = this.w;
                if (var17_17 != null) {
                    var17_17.startLoader();
                }
                var17_17 = this.Ra();
                var17_17.setPassword((String)var1_1 /* !! */ );
                var5_5 /* !! */  = ((jo_2)this.f.getValue()).a();
                var17_17.setAdId((String)var5_5 /* !! */ );
                this.o = var1_1 /* !! */ ;
                var14_14 = (int)TextUtils.isEmpty((CharSequence)var3_3 /* !! */ );
                if (var14_14 == 0) {
                    var17_17.setCaptchaInput((String)var3_3 /* !! */ );
                }
                var17_17.setLoginvia("manual");
                var1_1 /* !! */  = this.q;
                Intrinsics.checkNotNull(var1_1 /* !! */ );
                var3_3 /* !! */  = "login - password screen";
                var1_1 /* !! */ .l((QueryCustomer)var17_17, (String)var3_3 /* !! */ );
            }
        } else {
            var1_1 /* !! */  = this.h;
            if (var1_1 /* !! */  != null) {
                var2_2 = R$string.password_empty_msg;
                var17_17 = hv3_0.K(var2_2);
                var1_1 /* !! */ .setError((CharSequence)var17_17);
            }
            var1_1 /* !! */  = AnalyticsManager.Companion.getInstance();
            var17_17 = var1_1 /* !! */ .getGtmEvents();
            var14_14 = R$string.password_empty_msg;
            var18_18 = hv3_0.K(var14_14);
            var10_10 = 0;
            var11_11 = null;
            var12_12 = 0;
            var13_13 = null;
            var3_3 /* !! */  = "formErrorEvent";
            var5_5 /* !! */  = "Password page form";
            var15_15 = "login - password screen";
            var8_8 = 0;
            var9_9 = null;
            var16_16 = 112;
            GTMEvents.gtmEventsToGa$default((GTMEvents)var17_17, (String)var3_3 /* !! */ , (String)var5_5 /* !! */ , (String)var18_18, (String)var15_15, null, null, null, var16_16, null);
        }
    }

    public final void onActivityCreated(Bundle object) {
        boolean bl2;
        boolean bl3;
        super.onActivityCreated((Bundle)object);
        object = this.q;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).o;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        F62 f62 = new la1_0(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.q;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).k;
        mu1_12 = this.getViewLifecycleOwner();
        int n3 = 1;
        f62 = new s21_0(this, n3);
        ((LiveData)object).e(mu1_12, f62);
        object = this.g;
        if (object != null && (bl3 = ((AccountCheckResponse)object).isCaptchaInputRequired()) == (bl2 = true)) {
            object = this.g;
            if (object != null) {
                object = ((AccountCheckResponse)object).getCaptchaImage();
            } else {
                bl3 = false;
                object = null;
            }
            this.Sa((String)object);
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof com.ril.ajio.login.activity.a;
        if (bl2) {
            object = (com.ril.ajio.login.activity.a)object;
            this.w = object;
            return;
        }
        object = pn_2.b(object, " must implement LoginActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.login_password_start_shopping_tv;
        if (n3 == n4) {
            this.Va();
        } else {
            n4 = R$id.login_password_login_otp_tv;
            int n7 = 1;
            if (n3 == n4) {
                String string3;
                hv3_0.S(this.getActivity());
                object = this.getArguments();
                n4 = 0;
                string2 = null;
                if (object != null && (object = this.getArguments()) != null && (n3 = (int)(object.containsKey(string3 = "FromOtpScreen") ? 1 : 0)) == n7 && (object = this.getArguments()) != null) {
                    n3 = object.getBoolean(string3);
                } else {
                    n3 = 0;
                    object = null;
                }
                if (n3) {
                    object = this.getActivity();
                    if (object != null) {
                        ((ComponentActivity)object).onBackPressed();
                    }
                } else {
                    this.Ta(false);
                }
            } else {
                n4 = R$id.iv_retry_captcha;
                if (n3 == n4) {
                    this.Ua();
                } else {
                    n4 = R$id.tv_retry_captcha;
                    if (n3 == n4) {
                        this.Ua();
                    } else {
                        n4 = R$id.login_forgot_pass_tv;
                        if (n3 == n4) {
                            object = AnalyticsManager.Companion;
                            string2 = "forgot password";
                            String string4 = "login - password screen";
                            String string5 = "login/signup clicks";
                            tj2_0.e((AnalyticsManager$Companion)object, string5, string2, string4);
                            this.Ta(n7 != 0);
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        String string2;
        int n3;
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Object object3 = null;
        if (object != null) {
            int n4;
            this.l = n4 = object.getBoolean("mobileNumber");
            this.m = n4 = object.getBoolean("isFromLogin");
            object2 = object.getString("mobileEmailInputValue");
            if (object2 != null) {
                n3 = ((String)object2).length();
                int n7 = 1;
                n3 -= n7;
                string2 = null;
                int n8 = 0;
                boolean bl3 = false;
                while (n8 <= n3) {
                    int n10 = !bl3 ? n8 : n3;
                    n10 = ((String)object2).charAt(n10);
                    int n14 = 32;
                    n10 = Intrinsics.compare(n10, n14);
                    n10 = n10 <= 0 ? 1 : 0;
                    if (!bl3) {
                        if (n10 == 0) {
                            bl3 = true;
                            continue;
                        }
                        ++n8;
                        continue;
                    }
                    if (n10 == 0) break;
                    n3 += -1;
                }
                object2 = com.jio.jioads.adinterfaces.a.a(n3, n7, n8, (String)object2);
            } else {
                n4 = 0;
                object2 = null;
            }
            this.p = object2;
            n4 = Build.VERSION.SDK_INT;
            n3 = 33;
            if (n4 >= n3) {
                object = ha1_0.a((Bundle)object);
            } else {
                object2 = "AccountCheckResponse";
                n4 = (object = object.getSerializable((String)object2)) instanceof AccountCheckResponse;
                if (n4 == 0) {
                    bl2 = false;
                    object = null;
                }
                object = (AccountCheckResponse)object;
            }
            object = (AccountCheckResponse)object;
            this.g = object;
        }
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object4, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object5 = oa1_1.class;
        string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object4, (Wd0)object, object5, string2);
        object2 = "<this>";
        object4 = sw0_0.a(object5, (String)object2, object5, string2, string2);
        Intrinsics.checkNotNullParameter(object4, (String)object2);
        object2 = object4.getQualifiedName();
        if (object2 != null) {
            object5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object2 = ((String)object5).concat((String)object2);
            this.q = object = (oa1_1)((pD3)object).a((yn1_2)object4, (String)object2);
            object = new Bundle();
            this.x = object;
            n3 = 3;
            object.putInt("Step_Number", n3);
            bl2 = this.l;
            object2 = "login_type";
            object4 = "eventBundle";
            if (bl2) {
                object = this.x;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                object = "mobile number";
                object3.putString((String)object2, (String)object);
            } else {
                object = this.x;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                object = "email address";
                object3.putString((String)object2, (String)object);
            }
            return;
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_login_password_layout_new;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.D.d();
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Object object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        Object object2 = this.x;
        Object object3 = null;
        String string2 = "eventBundle";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object2 = null;
        }
        ((GTMEvents)object).pushOpenScreenEvent("login - password screen", (Bundle)object2);
        Bundle bundle = new Bundle();
        object = this.A;
        object2 = ((NewCustomEventsRevamp)object).getSTEP();
        Bundle bundle2 = this.x;
        if (bundle2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            bundle2 = null;
        }
        String string3 = "Step_Number";
        n3 = bundle2.getInt(string3);
        bundle.putInt((String)object2, n3);
        object = ((NewCustomEventsRevamp)object).getLOGIN_TYPE();
        object2 = this.x;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = object2;
        }
        object2 = object3.getString("login_type");
        bundle.putString((String)object, (String)object2);
        String string4 = this.B;
        String string5 = this.C;
        this.A.newPushCustomScreenView("login - password screen", "user account screen", string4, bundle, string5);
    }

    public final void onStop() {
        super.onStop();
        this.z.setPreviousScreenData("login - password screen", "user account screen");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View object, Bundle object2) {
        TextView textView;
        TextView textView2;
        EditText editText;
        TextInputLayout textInputLayout;
        ImageView imageView;
        View view;
        TextView textView3;
        TextView textView4;
        EditText editText2;
        TextInputLayout textInputLayout2;
        TextView textView5;
        int n3;
        com.ril.ajio.login.activity.a a2;
        com.ril.ajio.login.activity.a a3;
        int n4 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        com.ril.ajio.login.activity.a a4 = this.w;
        if (a4 != null) {
            a4.s0(false);
        }
        if ((a3 = this.w) != null) {
            a3.v0(false);
        }
        if ((a2 = this.w) != null) {
            n3 = R$color.accent_color_11;
            a2.F1(n3);
        }
        int n7 = R$id.login_password_subheader_tv;
        this.n = textView5 = (TextView)object.findViewById(n7);
        n3 = 8;
        if (textView5 != null) {
            textView5.setVisibility(n3);
        }
        n7 = R$id.login_password_til;
        this.h = textInputLayout2 = (TextInputLayout)object.findViewById(n7);
        n7 = R$id.login_password_tiet;
        this.i = editText2 = (EditText)object.findViewById(n7);
        n7 = R$id.login_password_start_shopping_tv;
        this.j = textView4 = (TextView)object.findViewById(n7);
        n7 = R$id.login_password_login_otp_tv;
        this.k = textView3 = (TextView)object.findViewById(n7);
        TextView textView6 = this.j;
        Intrinsics.checkNotNull(textView6);
        textView6.setOnClickListener((View.OnClickListener)this);
        TextView textView7 = this.k;
        Intrinsics.checkNotNull(textView7);
        textView7.setOnClickListener((View.OnClickListener)this);
        n7 = R$id.login_password_toggle_tv;
        TextView textView8 = (TextView)object.findViewById(n7);
        n7 = R$id.layout_captcha;
        this.r = view = object.findViewById(n7);
        n7 = R$id.iv_login_captcha;
        this.s = imageView = (ImageView)object.findViewById(n7);
        n7 = R$id.iv_retry_captcha;
        ImageView imageView2 = (ImageView)object.findViewById(n7);
        int n8 = R$id.login_password_captcha_til;
        this.u = textInputLayout = (TextInputLayout)object.findViewById(n8);
        n8 = R$id.login_password_captcha_tiet;
        this.t = editText = (EditText)object.findViewById(n8);
        n8 = R$id.captcha_error_tv;
        this.v = textView2 = (TextView)object.findViewById(n8);
        View view2 = this.r;
        Intrinsics.checkNotNull(view2);
        view2.setVisibility(n3);
        if (imageView2 != null) {
            imageView2.setOnClickListener((View.OnClickListener)this);
        }
        if ((textView = (TextView)object.findViewById(n7 = R$id.tv_retry_captcha)) != null) {
            textView.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = (TextView)object.findViewById(n7 = R$id.login_forgot_pass_tv)) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        this.Qa(false);
        object = this.g;
        if (object == null) {
            return;
        }
        object = this.i;
        Intrinsics.checkNotNull(object);
        qa1_0 qa1_02 = new qa1_0(this);
        object.addTextChangedListener((TextWatcher)qa1_02);
        object = this.t;
        if (object != null) {
            rA1 rA12 = new rA1(this);
            object.addTextChangedListener((TextWatcher)rA12);
        }
        object = this.i;
        Intrinsics.checkNotNull(object);
        ja1_0 ja1_02 = new ja1_0(this);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)ja1_02);
        object = this.t;
        if (object != null) {
            ka1_0 ka1_02 = new ka1_0(this);
            object.setOnEditorActionListener((TextView.OnEditorActionListener)ka1_02);
        }
        object = z40_0.Companion;
        Application application = this.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        object.getClass();
        object = z40$a.a((Context)application).a;
        String string3 = "referral_feature_enable";
        int n10 = ((ao0_0)object).a(string3);
        if (n10 != 0) {
            object = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = z40$a.a((Context)object).a;
            String string4 = "referee_enable";
            n10 = ((ao0_0)object).a(string4);
            if (n10 != 0 && (object = bv1_0.a) != null && (n10 = ((String)object).length()) != 0) {
                object = this.n;
                if (object != null) {
                    n7 = R$string.referral_only_new_users;
                    String string5 = hv3_0.K(n7);
                    object.setText((CharSequence)string5);
                }
                if ((object = this.n) != null) {
                    object.setVisibility(0);
                }
                n10 = 0;
                object = null;
                bv1_0.a = null;
                bv1_0.b = null;
                bv1_0.c = null;
                bv1_0.d = false;
                bv1_0.h = n4;
                String string6 = bv1_0.e;
                String string7 = "used referal - custom";
                n7 = (int)(kotlin.text.b.i(string6, string7, false) ? 1 : 0);
                if (n7 != 0) {
                    object = "User Already existing - custom";
                } else {
                    String string8 = bv1_0.e;
                    string7 = "used referal - auto filled";
                    n7 = (int)(kotlin.text.b.i(string8, string7, false) ? 1 : 0);
                    if (n7 != 0) {
                        object = "User Already existing - auto filled";
                    }
                }
                bv1_0.e = object;
                return;
            }
        }
        if ((n10 = this.m) != 0) {
            object = this.n;
            if (object == null) return;
            object.setVisibility(n3);
            return;
        }
        object = this.n;
        if (object != null) {
            n7 = R$string.account_already_exist;
            String string9 = this.p;
            Object[] objectArray = new Object[n4];
            objectArray[0] = string9;
            String string10 = hv3_0.L(n7, objectArray);
            object.setText((CharSequence)string10);
        }
        if ((object = this.n) == null) return;
        object.setVisibility(0);
    }
}

