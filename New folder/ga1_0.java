/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.text.method.DigitsKeyListener
 *  android.text.method.KeyListener
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputEditText;
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
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from GA1
 */
public final class ga1_0
extends P51
implements View.OnClickListener {
    public static final GA1$a Companion;
    public final String A;
    public final String B;
    public String C;
    public String f;
    public String g;
    public String h;
    public com.ril.ajio.login.activity.a i;
    public fv0_2 j;
    public EditText k;
    public TextInputLayout l;
    public AjioTextView m;
    public AccountCheckResponse n;
    public AjioTextView o;
    public TextInputEditText p;
    public TextInputLayout q;
    public TextInputLayout r;
    public EditText s;
    public oa1_1 t;
    public final hh3_2 u;
    public Bundle v;
    public String w;
    public boolean x;
    public final NewEEcommerceEventsRevamp y;
    public final NewCustomEventsRevamp z;

    static {
        GA1$a gA1$a;
        Companion = gA1$a = new Object();
    }

    public ga1_0() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        String string2;
        this.f = string2 = "";
        this.g = string2;
        Object object = new fa1_0(this);
        this.u = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.y = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.z = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.A = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.B = object = newEEcommerceEventsRevamp.getPrevScreenType();
        this.C = string2;
    }

    public final void Pa(String string2) {
        int n3;
        ga1_0 ga1_02 = this;
        Object object = uy1_0.a;
        Intrinsics.checkNotNullParameter(string2, "errorMessage");
        Bundle bundle = new Bundle();
        object = uy1_0.c;
        Object object2 = uy1_0.a();
        bundle.putString((String)object, (String)object2);
        bundle.putString("page_type", "login/signup");
        object = uy1_0.a;
        object2 = ((NewCustomEventsRevamp)object).getEC_USER_ACCOUNTS();
        Object object3 = AnalyticsManager.Companion;
        String string3 = bv_0.a((AnalyticsManager$Companion)object3);
        String string4 = cv_0.a((AnalyticsManager$Companion)object3);
        object3 = uy1_0.i;
        int n4 = 1536;
        String string5 = "user_account_interactions";
        String string6 = "social login - mobile screen";
        String string7 = "social login - mobile screen";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object2, (String)object3, string2, string5, string6, string7, string3, bundle, string4, false, null, n4, null);
        this.C = string2;
        object = this.i;
        if (object != null) {
            object.startLoader();
        }
        object = new QueryCustomer();
        object2 = ga1_02.k;
        Intrinsics.checkNotNull(object2);
        object2 = object2.getText();
        if (object2 != null && (object2 = object2.toString()) != null) {
            int n7 = ((String)object2).length();
            n3 = 1;
            n7 -= n3;
            boolean bl2 = false;
            string5 = null;
            int n8 = 0;
            string6 = null;
            while (n8 <= n7) {
                int n10 = !bl2 ? n8 : n7;
                n10 = ((String)object2).charAt(n10);
                int n14 = 32;
                if ((n10 = Intrinsics.compare(n10, n14)) <= 0) {
                    n10 = 1;
                } else {
                    n10 = 0;
                    string7 = null;
                }
                if (!bl2) {
                    if (n10 == 0) {
                        bl2 = true;
                        continue;
                    }
                    n8 += n3;
                    continue;
                }
                if (n10 == 0) break;
                n7 += -1;
            }
            object2 = com.jio.jioads.adinterfaces.a.a(n7, n3, n8, (String)object2);
        } else {
            n3 = 1;
            object2 = null;
        }
        ((QueryCustomer)object).setMobileNumber((String)object2);
        ((QueryCustomer)object).setMobileNumberEnterered(n3 != 0);
        object2 = ga1_02.t;
        if (object2 != null) {
            object3 = "social login - mobile screen";
            ((oa1_1)object2).b((QueryCustomer)object, (String)object3);
        }
    }

    public final jo_2 Qa() {
        return (jo_2)this.u.getValue();
    }

    public final void Ra() {
        boolean bl2;
        int n3;
        Object object = this.k;
        if (object != null) {
            n3 = 3;
            object.setInputType(n3);
        }
        object = this.j;
        n3 = 0;
        Object object2 = null;
        if (object != null) {
            bl2 = ((fv0_2)object).a.h();
            object = bl2;
        } else {
            bl2 = false;
            object = null;
        }
        Object object3 = Boolean.TRUE;
        bl2 = Intrinsics.areEqual(object, object3);
        if (bl2) {
            String string2;
            int n4;
            object = this.i;
            if (object != null) {
                object.startLoader();
            }
            if ((object = this.l) != null) {
                ((TextInputLayout)((Object)object)).setError(null);
            }
            object = new QueryCustomer();
            object3 = this.f;
            String string3 = "";
            String string4 = "SIGIN_SOURCE_GOOGLE";
            String string5 = "SIGIN_SOURCE_FACEBOOK";
            if (object3 != null) {
                Intrinsics.checkNotNull(object3);
                n4 = ((String)object3).length();
                if (n4 > 0) {
                    object3 = this.f;
                    boolean bl3 = true;
                    n4 = (int)(kotlin.text.b.i((String)object3, string5, bl3) ? 1 : 0);
                    if (n4 != 0) {
                        object3 = this.Qa();
                        string2 = "FACEBOOK_PROFILE_NAME";
                        this.h = object3 = ((sw_0)object3).getPreference(string2, string3);
                    } else {
                        object3 = this.f;
                        n4 = (int)(kotlin.text.b.i((String)object3, string4, bl3) ? 1 : 0);
                        if (n4 != 0) {
                            object3 = this.Qa();
                            string2 = "GOOGLE_PROFILE_NAME";
                            this.h = object3 = ((sw_0)object3).getPreference(string2, string3);
                        }
                    }
                }
            }
            object3 = this.h;
            ((QueryCustomer)object).setFirstName((String)object3);
            n4 = (int)(this.x ? 1 : 0);
            if (n4 != 0) {
                object3 = this.s;
                string2 = "emailAddressEditText";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object3 = null;
                }
                object3 = object3.getText();
                String string6 = "getText(...)";
                Intrinsics.checkNotNullExpressionValue(object3, string6);
                n4 = object3.length();
                if (n4 > 0) {
                    object3 = this.s;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object3 = null;
                    }
                    object3 = object3.getText().toString();
                } else {
                    object3 = string3;
                }
            } else {
                object3 = this.g;
            }
            ((QueryCustomer)object).setLogin((String)object3);
            ((QueryCustomer)object).setPassword(string3);
            object3 = this.k;
            Intrinsics.checkNotNull(object3);
            object3 = object3.getText();
            if (object3 != null) {
                object3 = object3.toString();
            } else {
                n4 = 0;
                object3 = null;
            }
            ((QueryCustomer)object).setMobileNumber((String)object3);
            ((QueryCustomer)object).setReferralCode(string3);
            ((QueryCustomer)object).setRequestMode("SENDOTP");
            ((QueryCustomer)object).setGender(string3);
            object3 = this.Qa().h();
            if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                object3 = this.Qa().h();
                ((QueryCustomer)object).setProfileId((String)object3);
            }
            if ((object3 = this.f) != null && (n4 = (int)(((String)object3).equalsIgnoreCase(string5) ? 1 : 0)) != 0) {
                ((QueryCustomer)object).setLoginvia("facebook");
                object3 = this.Qa();
                string4 = "FACEBOOK_PROFILE_ACCESS_TOKEN";
                object3 = ((sw_0)object3).getPreference(string4, string3);
                ((QueryCustomer)object).setToken((String)object3);
            } else {
                object3 = this.f;
                if (object3 != null && (n4 = (int)(((String)object3).equalsIgnoreCase(string4) ? 1 : 0)) != 0) {
                    ((QueryCustomer)object).setLoginvia("google");
                    object3 = this.Qa();
                    string4 = "GOOGLE_PROFILE_ACCESS_TOKEN";
                    object3 = ((sw_0)object3).getPreference(string4, string3);
                    ((QueryCustomer)object).setToken((String)object3);
                }
            }
            object3 = this.p;
            if (object3 != null && (object3 = ((AppCompatEditText)object3).getText()) != null) {
                object3 = object3.toString();
            } else {
                n4 = 0;
                object3 = null;
            }
            if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                object3 = this.p;
                if (object3 != null && (object3 = ((AppCompatEditText)object3).getText()) != null) {
                    object2 = object3.toString();
                }
                ((QueryCustomer)object).setRilFnlRegisterReferralCode((String)object2);
            }
            if ((object2 = this.t) != null) {
                object3 = "<set-?>";
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object2.C = object;
            }
            if ((object2 = this.t) != null) {
                n4 = 0;
                object3 = null;
                string3 = "social login - mobile screen";
                object2.o((QueryCustomer)object, string3, false);
            }
        } else {
            object = this.k;
            if (object != null) {
                object2 = DigitsKeyListener.getInstance((String)"0123456789");
                object.setKeyListener((KeyListener)object2);
            }
        }
    }

    public final void onActivityCreated(Bundle object) {
        F62 f62;
        mu1_1 mu1_12;
        super.onActivityCreated((Bundle)object);
        object = this.t;
        if (object != null && (object = ((oa1_1)object).l) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new ba1_0(this);
            ((LiveData)object).e(mu1_12, f62);
        }
        object = this.t;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).n;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new ca1_1(this, 0);
        ((LiveData)object).e(mu1_12, f62);
        object = this.t;
        if (object != null && (object = ((oa1_1)object).o) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new da1_0(this);
            ((LiveData)object).e(mu1_12, f62);
        }
        if ((object = this.t) != null && (object = ((oa1_1)object).N) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new ea1_1(this);
            ((LiveData)object).e(mu1_12, f62);
        }
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof com.ril.ajio.login.activity.a;
        if (bl2) {
            object = (com.ril.ajio.login.activity.a)object;
            this.i = object;
        }
    }

    public final void onClick(View view) {
        ga1_0 ga1_02 = this;
        Object object = "view";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.login_social_mobile_continue_tv;
        if (n3 == n4) {
            boolean bl2;
            String string2;
            object = this.p;
            n4 = 0;
            object2 = null;
            if (object != null && (object = ((AppCompatEditText)object).getText()) != null) {
                object = object.toString();
            } else {
                n3 = 0;
                object = null;
            }
            n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
            if (n3 == 0) {
                object = ga1_02.p;
                if (object != null && (object = ((AppCompatEditText)object).getText()) != null) {
                    object2 = object.toString();
                }
            } else {
                object2 = "No code";
            }
            object = (n3 = (int)(kotlin.text.b.i((String)(object = ga1_02.f), string2 = "SIGIN_SOURCE_FACEBOOK", bl2 = true) ? 1 : 0)) != 0 ? "Google" : ((n3 = (int)(kotlin.text.b.i((String)(object = ga1_02.f), string2 = "SIGIN_SOURCE_GOOGLE", bl2) ? 1 : 0)) != 0 ? "FB" : "");
            string2 = " - ";
            String string3 = n1.a((String)object, string2, (String)object2);
            int n7 = 1536;
            NewCustomEventsRevamp newCustomEventsRevamp = ga1_02.z;
            String string4 = "user accounts interactions";
            String string5 = "One last step | Continue";
            String string6 = "user_account_interactions";
            String string7 = "One Last Step";
            String string8 = "";
            String string9 = ga1_02.A;
            String string10 = ga1_02.B;
            NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string4, string5, string3, string6, string7, string8, string9, null, string10, false, null, n7, null);
            this.Ra();
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            object2 = object.getString("param1");
            this.f = object2;
            object2 = "param2";
            this.x = bl2 = object.getBoolean((String)object2);
            object = this.f;
            if (object != null) {
                object2 = "SIGIN_SOURCE_FACEBOOK";
                boolean bl3 = ((String)object).equalsIgnoreCase((String)object2);
                if (bl3) {
                    object = "social - facebook - mobilenumber screen";
                    this.w = object;
                } else {
                    object2 = "SIGIN_SOURCE_GOOGLE";
                    bl2 = ((String)object).equalsIgnoreCase((String)object2);
                    if (bl2) {
                        this.w = object = "social - google - mobilenumber screen";
                    }
                }
            }
        }
        if ((object = this.w) == null) {
            object = "social -  - mobilenumber screen";
            this.w = object;
        }
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Class<oa1_1> clazz = oa1_1.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, clazz, string2);
        object2 = ef0_0.a(clazz, string2, string2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.t = object = (oa1_1)((pD3)object).a((yn1_2)object2, (String)object3);
            object = new Bundle();
            this.v = object;
            object.putInt("Step_Number", 2);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_login_social_number_verific_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        Object object;
        int n3;
        super.onResume();
        Object object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = this.w;
        String string3 = "gaScreenName";
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n3 = 0;
            string2 = null;
        }
        Object object3 = this.v;
        String string4 = "eventBundle";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            object3 = null;
        }
        ((GTMEvents)object2).pushOpenScreenEvent(string2, (Bundle)object3);
        Bundle bundle = new Bundle();
        object2 = this.z.getSTEP();
        string2 = this.v;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n3 = 0;
            string2 = null;
        }
        object3 = "Step_Number";
        n3 = string2.getInt((String)object3);
        bundle.putInt((String)object2, n3);
        object2 = this.w;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            object = null;
        } else {
            object = object2;
        }
        object2 = this.y;
        String string5 = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        String string6 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        this.z.newPushCustomScreenView((String)object, "user account screen", string5, bundle, string6);
    }

    public final void onStop() {
        super.onStop();
        String string2 = this.w;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gaScreenName");
            string2 = null;
        }
        this.y.setPreviousScreenData(string2, "user account screen");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        String string2;
        Object object3;
        block40: {
            TextInputLayout textInputLayout;
            int n4;
            block39: {
                String string3;
                TextInputLayout textInputLayout2;
                za1_0 za1_02;
                int n7;
                Object object4;
                int n8 = 1;
                String string4 = "view";
                Intrinsics.checkNotNullParameter(object, string4);
                super.onViewCreated((View)object, (Bundle)object4);
                object4 = this.i;
                if (object4 != null) {
                    object4.stopLoader();
                }
                object4 = this.f;
                String string5 = "";
                if (object4 != null && (n4 = ((String)object4).equalsIgnoreCase((String)(object3 = "SIGIN_SOURCE_FACEBOOK"))) != 0) {
                    void var4_33;
                    object4 = this.Qa().g();
                    if (object4 != null) {
                        Object object5 = object4;
                    }
                    this.g = var4_33;
                } else {
                    object4 = this.f;
                    if (object4 != null && (n4 = ((String)object4).equalsIgnoreCase((String)(object3 = "SIGIN_SOURCE_GOOGLE"))) != 0) {
                        void var4_35;
                        object4 = this.Qa();
                        object3 = "GOOGLE_PROFILE_EMAIL";
                        if ((object4 = ((sw_0)object4).getPreference((String)object3, string5)) != null) {
                            Object object6 = object4;
                        }
                        this.g = var4_35;
                    }
                }
                object4 = this.i;
                if (object4 != null) {
                    object4.s0(n8 != 0);
                }
                if ((object4 = this.i) != null) {
                    object4.v0(false);
                }
                if ((object4 = this.i) != null) {
                    n7 = R$color.accent_color_11;
                    object4.F1(n7);
                }
                n4 = R$id.login_social_mobile_header_tv;
                this.m = object4 = (AjioTextView)object.findViewById(n4);
                n4 = R$id.login_social_mobile_til;
                object4 = (TextInputLayout)object.findViewById(n4);
                this.l = object4;
                n4 = R$id.login_social_mobile_tiet;
                object4 = (EditText)object.findViewById(n4);
                this.k = object4;
                n4 = R$id.login_new_user_email_til;
                object4 = (TextInputLayout)object.findViewById(n4);
                this.r = object4;
                n4 = R$id.login_new_user_email_tiet;
                object4 = (EditText)object.findViewById(n4);
                this.s = object4;
                object4 = this.k;
                if (object4 != null) {
                    n7 = 3;
                    object4.setInputType(n7);
                }
                if ((object4 = this.k) != null) {
                    DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance((String)"0123456789");
                    object4.setKeyListener((KeyListener)digitsKeyListener);
                }
                vz3_0 vz3_02 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
                object4 = new fv0_2(vz3_02);
                this.j = object4;
                EditText editText = this.k;
                object3 = this.l;
                int n10 = R$string.mobile_alert_text;
                Object object7 = hv3_0.K(n10);
                ((fv0_2)object4).c(editText, (TextInputLayout)((Object)object3), (String)object7);
                n4 = (int)(this.x ? 1 : 0);
                string2 = "emailTextInputLayout";
                object3 = null;
                object7 = "emailAddressEditText";
                if (n4 != 0) {
                    object4 = this.s;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                        n4 = 0;
                        object4 = null;
                    }
                    int n14 = 32;
                    object4.setInputType(n14);
                    object4 = h40_0.a;
                    n4 = (int)(h40_0.X0() ? 1 : 0);
                    if (n4 == 0 && (object4 = this.j) != null) {
                        TextInputLayout textInputLayout3;
                        za1_02 = this.s;
                        if (za1_02 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                            n14 = 0;
                            za1_02 = null;
                        }
                        if ((textInputLayout3 = this.r) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            textInputLayout3 = null;
                        }
                        int n15 = R$string.newuser_emailid_error;
                        String string6 = hv3_0.K(n15);
                        ((fv0_2)object4).c((EditText)za1_02, textInputLayout3, string6);
                    }
                }
                if ((object4 = this.k) != null) {
                    za1_02 = new za1_0(this);
                    object4.setOnEditorActionListener((TextView.OnEditorActionListener)za1_02);
                }
                if ((object4 = this.s) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n4 = 0;
                    object4 = null;
                }
                object7 = new AA1(this);
                object4.setOnEditorActionListener((TextView.OnEditorActionListener)object7);
                n4 = R$id.login_social_mobile_continue_tv;
                ((TextView)object.findViewById(n4)).setOnClickListener((View.OnClickListener)this);
                object4 = this.k;
                if (object4 != null) {
                    object7 = new HA1(this);
                    object4.addTextChangedListener((TextWatcher)object7);
                }
                if ((object4 = this.k) != null) {
                    object7 = new IA1(this);
                    object4.addTextChangedListener((TextWatcher)object7);
                }
                n4 = R$id.login_social_enter_tv;
                this.o = object4 = (AjioTextView)object.findViewById(n4);
                n4 = R$id.login_social_invite_code_tiet;
                this.p = object4 = (TextInputEditText)object.findViewById(n4);
                n4 = R$id.login_social_invite_code_til;
                this.q = textInputLayout2 = (TextInputLayout)object.findViewById(n4);
                z40$a z40$a = z40_0.Companion;
                object4 = this.requireActivity().getApplication();
                object7 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object7);
                z40$a.getClass();
                ao0_0 ao0_02 = z40$a.a((Context)object4).a;
                object4 = "referral_feature_enable";
                n3 = ao0_02.a((String)object4);
                if (n3 == 0) break block39;
                Application application = this.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(application, (String)object7);
                ao0_0 ao0_03 = z40$a.a((Context)application).a;
                object4 = "referee_enable";
                n3 = ao0_03.a((String)object4);
                if (n3 == 0) break block39;
                TextInputLayout textInputLayout4 = this.q;
                if (textInputLayout4 != null) {
                    textInputLayout4.setVisibility(0);
                }
                if ((string3 = bv1_0.a) != null && (n3 = string3.length()) != 0) {
                    oa1_1 oa1_12;
                    TextInputEditText textInputEditText;
                    TextInputEditText textInputEditText2 = this.p;
                    if (textInputEditText2 != null) {
                        object4 = bv1_0.a;
                        textInputEditText2.setText((CharSequence)object4);
                    }
                    bv1_0.e = "used referal - auto filled";
                    String string7 = bv1_0.b;
                    if (string7 != null && (n3 = string7.length()) != 0) {
                        AjioTextView ajioTextView = this.m;
                        if (ajioTextView != null) {
                            n4 = R$string.invited_you;
                            Object[] objectArray = new Object[n8];
                            objectArray[0] = object7 = bv1_0.b;
                            object4 = hv3_0.L(n4, objectArray);
                            ajioTextView.setText((CharSequence)object4);
                        }
                    } else {
                        AjioTextView ajioTextView = this.m;
                        if (ajioTextView != null) {
                            n4 = R$string.invited_you_friend;
                            object4 = hv3_0.K(n4);
                            ajioTextView.setText((CharSequence)object4);
                        }
                    }
                    if ((textInputEditText = this.p) != null) {
                        object4 = new Object();
                        textInputEditText.addTextChangedListener((TextWatcher)object4);
                    }
                    if ((oa1_12 = this.t) != null) {
                        oa1_12.i();
                    }
                }
                break block40;
            }
            if ((textInputLayout = this.q) != null) {
                n4 = 8;
                textInputLayout.setVisibility(n4);
            }
        }
        if ((n3 = this.x) != 0) {
            void var1_21;
            TextInputLayout textInputLayout = this.r;
            if (textInputLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                Object var1_20 = null;
            }
            ai0_2.B((View)var1_21);
            h40_0 h40_02 = h40_0.a;
            n3 = h40_0.X0();
            if (n3 != 0) {
                TextInputLayout textInputLayout5 = this.r;
                if (textInputLayout5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = textInputLayout5;
                }
                n3 = R$string.hint_email_address_optional;
                String string8 = this.getString(n3);
                ((TextInputLayout)((Object)object3)).setHint(string8);
                return;
            }
            TextInputLayout textInputLayout6 = this.r;
            if (textInputLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = textInputLayout6;
            }
            n3 = R$string.email_address_hint;
            String string9 = this.getString(n3);
            ((TextInputLayout)((Object)object3)).setHint(string9);
            return;
        }
        TextInputLayout textInputLayout = this.r;
        if (textInputLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = textInputLayout;
        }
        ai0_2.i((View)object3);
    }
}

