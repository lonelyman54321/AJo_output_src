/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.telephony.TelephonyManager
 *  android.text.Spannable
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.EditText
 *  android.widget.TextView$BufferType
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.databinding.FragmentLoginNewBinding;
import com.ril.ajio.login.RemovalLoginPasswordConfig;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/*
 * Renamed from fz1
 */
public final class fz1_2
extends I51
implements View.OnClickListener {
    public static final fz1$a Companion;
    public static final /* synthetic */ gn1_2[] s;
    public boolean f;
    public com.ril.ajio.login.activity.a g;
    public AccountCheckResponse h;
    public oa1_1 i;
    public Bundle j;
    public boolean k;
    public final fv0_2 l;
    public final NewCustomEventsRevamp m;
    public final String n;
    public final String o;
    public j80_0 p;
    public final cc3_2 q;
    public String r;

    static {
        Object object = jz.a(fz1_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentLoginNewBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        s = gn1_2Array;
        Companion = object = new Object();
    }

    public fz1_2() {
        Object object = vz3_0.BASICVALIDATOR;
        Object object2 = new fv0_2((vz3_0)((Object)object));
        this.l = object2;
        object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.m = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.n = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.o = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object2 = j80_0.MANUAL;
        this.p = object2;
        object2 = z80_0.c(fz1$b.a, this);
        this.q = object2;
    }

    public final void Pa() {
        Object object = this.p;
        Object object2 = j80_0.AUTO;
        if (object == object2) {
            object = Ey1.a;
            Ey1.g();
        } else {
            Ey1.h();
        }
        object = Ey1.a;
        object = this.getActivity();
        object2 = this.Qa().mobileEt.getText();
        object2 = object2 != null ? ((Object)object2).toString() : null;
        object = Ey1.a((FragmentActivity)object, (String)object2);
        object2 = this.Qa().mobileEtError;
        String string2 = "mobileEtError";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        ai0_2.i((View)object2);
        object2 = this.i;
        if (object2 != null) {
            string2 = "login/signup screen";
            ((oa1_1)object2).b((QueryCustomer)object, string2);
        }
    }

    public final FragmentLoginNewBinding Qa() {
        Object object = s[0];
        object = this.q.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentLoginNewBinding)object;
    }

    public final void Ra() {
        Object object;
        Object object2;
        Object object3 = h40_0.a;
        boolean bl2 = h40_0.a1();
        String string2 = "loginFbIv";
        if (!bl2) {
            object2 = this.Qa().loginFbIv;
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            ai0_2.i((View)object2);
        } else {
            object2 = this.Qa().loginFbIv;
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            ai0_2.B((View)object2);
        }
        boolean bl3 = h40_0.g1();
        object2 = "loginGoogleIv";
        if (!bl3) {
            object = this.Qa().loginGoogleIv;
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            ai0_2.i((View)object);
        } else {
            object = this.Qa().loginGoogleIv;
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            ai0_2.B((View)object);
        }
        object2 = "dividerEnd";
        object = "dividerStart";
        String string3 = "loginOrView";
        if (!bl3 && !bl2) {
            object3 = this.Qa().loginOrView;
            Intrinsics.checkNotNullExpressionValue(object3, string3);
            ai0_2.i((View)object3);
            object3 = this.Qa().dividerStart;
            Intrinsics.checkNotNullExpressionValue(object3, (String)object);
            ai0_2.i((View)object3);
            object3 = this.Qa().dividerEnd;
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            ai0_2.i((View)object3);
        } else {
            object3 = this.Qa().loginOrView;
            Intrinsics.checkNotNullExpressionValue(object3, string3);
            ai0_2.B((View)object3);
            object3 = this.Qa().dividerStart;
            Intrinsics.checkNotNullExpressionValue(object3, (String)object);
            ai0_2.B((View)object3);
            object3 = this.Qa().dividerEnd;
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            ai0_2.B((View)object3);
        }
    }

    public final void Sa() {
        this.Qa().mobileLayout.setVisibility(0);
        this.Qa().mobileEt.setVisibility(0);
        this.Qa().mobileEt.setText("");
        this.k = false;
        this.Qa().loginContinueTv.setAlpha(0.6f);
        this.Qa().loginContinueTv.setClickable(false);
    }

    public final void Ta() {
        Object object = this.Qa().mobileEt.getText();
        if (object == null || (object = object.toString()) == null || (object = ((Object)StringsKt.m0((CharSequence)object)).toString()) == null) {
            object = "";
        }
        int n3 = TextUtils.isEmpty((CharSequence)object);
        String string2 = "loginContinueTv";
        if (n3 == 0) {
            Object object2;
            n3 = this.k;
            boolean bl2 = true;
            if (n3 == 0) {
                this.k = bl2;
                object2 = Ey1.a;
                Ey1.j();
            }
            boolean bl3 = TextUtils.isDigitsOnly((CharSequence)object);
            n3 = 0;
            float f5 = 0.0f;
            object2 = null;
            if (bl3) {
                object = this.l.a;
                bl3 = object.h();
            } else {
                bl3 = false;
                object = null;
            }
            if (bl3) {
                object = Ey1.a;
                object = this.Qa().loginContinueTv;
                Intrinsics.checkNotNullExpressionValue(object, string2);
                float f6 = 1.0f;
                Ey1.l((View)object, bl2, 0, f6);
                object = this.p;
                j80_0 j80_02 = j80_0.AUTO;
                if (object == j80_02) {
                    this.Qa().progressBarMobile.setVisibility(0);
                    object = this.Qa().mobileEt;
                    n3 = 1058642330;
                    f5 = 0.6f;
                    object.setAlpha(f5);
                    object = this.Qa().loginContinueTv;
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    Ey1.m((View)object);
                    object2 = Looper.getMainLooper();
                    object = new Handler((Looper)object2);
                    object2 = new az1_0(this);
                    long l2 = 1000L;
                    object.postDelayed((Runnable)object2, l2);
                }
            } else {
                object = Ey1.a;
                object = this.Qa().loginContinueTv;
                Intrinsics.checkNotNullExpressionValue(object, string2);
                Ey1.m((View)object);
            }
        } else {
            object = Ey1.a;
            object = this.Qa().loginContinueTv;
            Intrinsics.checkNotNullExpressionValue(object, string2);
            Ey1.m((View)object);
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof com.ril.ajio.login.activity.a;
        if (bl2) {
            object = (com.ril.ajio.login.activity.a)object;
            this.g = object;
            return;
        }
        object = pn_2.b(object, " must implement LoginActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.login_continue_tv;
        if (n3 == n4) {
            this.Pa();
        } else {
            n4 = R$id.login_fb_iv;
            String string3 = "Login";
            if (n3 == n4) {
                object = this.g;
                if (object != null) {
                    object.l1(string3);
                }
                object = "FB_login";
                string2 = "facebook";
                Ey1.i((String)object, string2);
            } else {
                n4 = R$id.login_google_iv;
                if (n3 == n4) {
                    object = this.g;
                    if (object != null) {
                        object.w0(string3);
                    }
                    object = "Gmail_login";
                    string2 = "gmail";
                    Ey1.i((String)object, string2);
                } else {
                    n4 = R$id.iv_cancel;
                    if (n3 == n4) {
                        object = this.requireActivity();
                        object.finish();
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = 0;
        int n4 = R$style.PriceRangeBottomSheetFragment;
        this.setStyle(0, n4);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object2, (E$b)object3, (Wd0)object);
        object2 = oa1_1.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = Reflection.getOrCreateKotlinClass((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, string2);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            String string3;
            string2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = string2.concat((String)object3);
            object = (oa1_1)object.a((yn1_2)object2, (String)object3);
            this.i = object;
            this.j = object = new Bundle();
            int n7 = 1;
            object.putInt("Step_Number", n7);
            object = this.getArguments();
            n4 = 0;
            object2 = null;
            if (object != null) {
                string2 = "SOURCE";
                object = object.getString(string2);
            } else {
                n3 = 0;
                object = null;
            }
            string2 = this.getArguments();
            if (string2 != null) {
                string3 = "Mobile Number";
                string2 = string2.getString(string3);
            } else {
                string2 = null;
            }
            this.r = string2;
            string2 = this.getArguments();
            if (string2 != null) {
                string3 = "Email Id";
                string2.getString(string3);
            }
            if ((string2 = this.getArguments()) != null) {
                string3 = "Continue Button Click Type";
                string2 = string2.getString(string3, null);
            } else {
                string2 = null;
            }
            if (object != null) {
                string3 = this.j;
                if (string3 == null) {
                    string3 = "eventBundle";
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    object2 = string3;
                }
                string3 = "login_source";
                object2.putString(string3, (String)object);
            }
            object = AJIOApplication.Companion;
            object.getClass();
            object2 = AJIOApplication$a.a().getSystemService("phone");
            string3 = "null cannot be cast to non-null type android.telephony.TelephonyManager";
            Intrinsics.checkNotNull(object2, string3);
            object2 = (TelephonyManager)object2;
            n4 = object2.getSimState();
            if (n4 != n7 && ((object2 = this.r) == null || (n4 = ((String)object2).length()) == 0)) {
                object2 = Ey1.a;
                object2 = this.getContext();
                object3 = this.getActivity();
                object2 = (gc3_2)((Object)object2);
                Ey1.d((gc3_2)((Object)object2), (FragmentActivity)object3);
            }
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object = Q.a((AJIOApplication$a)object, (z40$a)object2).a;
            object2 = "enable_continue_auto_click";
            n3 = object.a((String)object2);
            object = n3 != 0 && (string2 == null || (n3 = string2.length()) == 0) ? j80_0.AUTO : j80_0.MANUAL;
            this.p = object;
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bundle = this.requireContext();
        int n3 = this.getTheme();
        fz1$c fz1$c = new fz1$c(this, (Context)bundle, n3);
        return fz1$c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        bundle = this.getDialog();
        if (bundle != null) {
            vy1_0 vy1_02 = new Object();
            bundle.setOnShowListener((DialogInterface.OnShowListener)vy1_02);
        }
        int n3 = R$layout.fragment_login_new;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Object object = this.g;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (object != null) {
            object.v0(n4 != 0);
        }
        if ((object = this.g) != null) {
            int n7 = R$color.transparent;
            object.F1(n7);
        }
        if ((object = this.g) != null && (n3 = object.W1()) == n4 || (object = this.g) != null && (n3 = object.V()) == n4) {
            object = j80_0.MANUAL;
            this.p = object;
            object = this.Qa().progressBarMobile;
            String string2 = "progressBarMobile";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object.setVisibility(8);
            object = this.Qa().mobileEt;
            n4 = 1065353216;
            f5 = 1.0f;
            object.setAlpha(f5);
            object = this.g;
            if (object != null) {
                n4 = 0;
                f5 = 0.0f;
                string2 = null;
                object.A0(false);
            }
            if ((object = this.g) != null) {
                object.o1();
            }
            this.Qa().mobileEt.requestFocus();
            object = this.Qa().mobileEt;
            hv3_0.m0((View)object);
        }
    }

    public final void onStop() {
        super.onStop();
        Ey1.a.setPreviousScreenData("mobile - login/signup screen", "user account screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Object object4;
        int n3;
        int n7 = 1;
        fz1$d fz1$d = null;
        Object object5 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        super.onViewCreated((View)object, (Bundle)object2);
        object = Ey1.a;
        object = this.j;
        int n8 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventBundle");
            boolean n4 = false;
            object = null;
        }
        Ey1.k((Bundle)object);
        object = this.g;
        if (object != null) {
            object.s0(false);
        }
        this.Qa().loginContinueTv.setOnClickListener(this);
        object = this.Qa().layoutHalfCard;
        object5 = new zy1_0(this);
        object.setOnTouchListener((View.OnTouchListener)object5);
        this.Qa().ivCancel.setOnClickListener(this);
        object = this.Qa().loginWelcomeMsgTv;
        object5 = Ey1.e();
        object.setText((CharSequence)object5);
        this.Sa();
        object = z40_0.Companion;
        object5 = this.requireActivity().getApplication();
        Object object6 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
        object.getClass();
        object = z40$a.a((Context)object5).a;
        object5 = "referral_feature_enable";
        boolean bl2 = ((ao0_0)object).a((String)object5);
        if (bl2) {
            int n4;
            object = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object, (String)object6);
            object = z40$a.a((Context)object).a;
            object5 = "referee_enable";
            boolean bl3 = ((ao0_0)object).a((String)object5);
            if (bl3 && (object = bv1_0.a) != null && (n4 = ((String)object).length()) != 0) {
                int n10;
                object = bv1_0.b;
                if (object != null && (n10 = ((String)object).length()) != 0) {
                    object = this.Qa().loginWelcomeMsgTv;
                    n3 = R$string.invited_you;
                    object6 = new Object[n7];
                    object6[0] = object4 = bv1_0.b;
                    object5 = hv3_0.L(n3, object6);
                    object.setText((CharSequence)object5);
                } else {
                    object = this.Qa().loginWelcomeMsgTv;
                    n3 = R$string.invited_you_friend;
                    object5 = hv3_0.K(n3);
                    object.setText((CharSequence)object5);
                }
                object = this.i;
                if (object != null) {
                    ((oa1_1)object).i();
                }
            }
        }
        object = this.Qa().mobileEt;
        Intrinsics.checkNotNullExpressionValue(object, "mobileEt");
        object5 = new cz1_2(this);
        ai0_2.o((EditText)object, (hx0_2)object5);
        object = this.Qa().mobileEt;
        object5 = new dz1_1(this);
        object.setOnFocusChangeListener((View.OnFocusChangeListener)object5);
        object = this.Qa().mobileEt;
        object5 = new ez1_1(this);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)object5);
        this.Qa().loginGoogleIv.setOnClickListener(this);
        this.Qa().loginFbIv.setOnClickListener(this);
        this.Ra();
        object = this.Qa().mobileEt;
        n3 = R$string.login_mobile_emailid_error;
        object5 = hv3_0.K(n3);
        object6 = this.l;
        object6.f((EditText)object, (String)object5);
        object = this.Qa().loginTermsConditionsTv;
        object5 = this.getContext();
        if (object5 != null) {
            object6 = this.Qa().loginTermsConditionsTv;
            Intrinsics.checkNotNullExpressionValue(object6, "loginTermsConditionsTv");
            object4 = this.getActivity();
            String string2 = "login/signup screen";
            object5 = (gc3_2)((Object)object5);
            object5 = Ey1.c((View)object6, (FragmentActivity)object4, (gc3_2)((Object)object5), string2);
        } else {
            n3 = 0;
            object5 = null;
        }
        object.setText((CharSequence)object5);
        object = this.Qa().loginTermsConditionsTv;
        object5 = LinkMovementMethod.getInstance();
        object.setMovementMethod((MovementMethod)object5);
        object = this.getView();
        if (object != null) {
            object2 = object.getViewTreeObserver();
        }
        object = new Ref$ObjectRef();
        ((Ref$ObjectRef)object).element = object5 = new bz1_1((ViewTreeObserver)object2, (Ref$ObjectRef)object, this);
        if (object2 != null) {
            object2.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object5);
        }
        this.Sa();
        object = this.Qa().mobileEt;
        object2 = this.r;
        object.setText((CharSequence)object2);
        object = h40_0.a;
        object = h40_0.R();
        boolean bl4 = ((RemovalLoginPasswordConfig)object).getEnable_restore_phone_number();
        if (!bl4) {
            object = this.Qa().idLoginRemoval;
            object2 = "idLoginRemoval";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            ai0_2.i((View)object);
        } else {
            uy1_0.e("seen");
            object = h40_0.R().getLogin_restore_phone_number_message();
            object2 = h40_0.R().getLogin_click_text_highlight();
            object5 = this.Qa().idLoginRemovalText;
            object6 = TextView.BufferType.SPANNABLE;
            object5.setText((CharSequence)object, (TextView.BufferType)object6);
            object5 = this.Qa().idLoginRemovalText.getText();
            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type android.text.Spannable");
            object5 = (Spannable)object5;
            int n14 = StringsKt.O((CharSequence)object, (String)object2, 0, false, 6);
            int n15 = hv3_0.m(R$color.pesdk_color_3);
            object6 = new ForegroundColorSpan(n15);
            n15 = ((String)object2).length() + n14;
            int n16 = 33;
            object5.setSpan(object6, n14, n15, n16);
            object6 = FontsManager.getInstance();
            AJIOApplication.Companion.getClass();
            object4 = AJIOApplication$a.a();
            object6 = object6.getTypefaceWithFont((Context)object4, 10);
            String string3 = "";
            object4 = new AjioCustomTypefaceSpan(string3, (Typeface)object6);
            int n17 = ((String)object2).length() + n14;
            int n18 = 34;
            object5.setSpan(object4, n14, n17, n18);
            object6 = new gz1_0(this);
            n8 = ((String)object2).length() + n14;
            object5.setSpan(object6, n14, n8, n16);
            object = this.Qa().idLoginRemovalText;
            object2 = LinkMovementMethod.getInstance();
            object.setMovementMethod((MovementMethod)object2);
        }
        AJIOApplication.Companion.getClass();
        object = z40$a.a((Context)AJIOApplication$a.a()).a.b("enable_signup_halfcard_banner");
        object2 = j21.class;
        object = (j21)JsonUtils.fromJson((String)object, (Class)object2);
        if (object != null) {
            object2 = ((j21)object).b();
            object5 = Boolean.TRUE;
            n8 = Intrinsics.areEqual(object2, object5);
        } else {
            n8 = 0;
            object2 = null;
        }
        n3 = 8;
        if (n8 != 0) {
            object2 = ((j21)object).a();
            if (object2 != null && (n8 = ((String)object2).length()) != 0) {
                this.Qa().ivSignupBenefit.setVisibility(0);
                object2 = new da$a();
                ((da$a)object2).k = n7;
                ((da$a)object2).g = n7;
                object = ((j21)object).a();
                object3 = this.Qa().ivSignupBenefit;
                ((da$a)object2).n = object;
                ((da$a)object2).u = object3;
                ((da$a)object2).a();
            } else {
                object = this.Qa().ivSignupBenefit;
                object.setVisibility(n3);
            }
        } else {
            object = this.Qa().ivSignupBenefit;
            object.setVisibility(n3);
        }
        object = this.i;
        if (object != null && (object = ((oa1_1)object).n) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new wy1_1(this, 0);
            object5 = new fz1$d((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
        }
        if ((object = this.i) != null && (object = ((oa1_1)object).o) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new xy1_2(this, 0);
            fz1$d = new fz1$d((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, fz1$d);
        }
        if ((object = this.i) != null && (object = ((oa1_1)object).N) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new yy1_1(this);
            fz1$d = new fz1$d((Function1)object3);
            ((LiveData)object).e((mu1_1)object2, fz1$d);
        }
    }

    public final void show(FragmentManager object, String object2) {
        Object object3 = "manager";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object.getClass();
        object3 = new a((FragmentManager)object);
        object = "beginTransaction(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object);
        object = null;
        boolean bl2 = true;
        ((a)object3).h(0, this, (String)object2, (int)(bl2 ? 1 : 0));
        try {
            ((a)object3).o(bl2, bl2);
        }
        catch (IllegalStateException illegalStateException) {
            object2 = yn3_0.a;
            ((yn3$a)object2).e(illegalStateException);
        }
    }
}

