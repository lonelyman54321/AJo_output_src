/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.telephony.TelephonyManager
 *  android.text.Spannable
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.EditText
 *  android.widget.TextView$BufferType
 *  android.widget.TextView$OnEditorActionListener
 */
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import com.ril.ajio.login.CommonLoginSignUpConfig;
import com.ril.ajio.login.RemovalLoginPasswordConfig;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.utils.JsonUtils;
import com.ril.ajio.utility.validators.Validator;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Ry1
 */
public final class ry1_1
extends H51
implements View.OnClickListener {
    public static final Ry1$a Companion;
    public boolean f;
    public a g;
    public AccountCheckResponse h;
    public oa1_1 i;
    public Bundle j;
    public boolean k;
    public final fv0_2 l;
    public final NewCustomEventsRevamp m;
    public final String n;
    public final String o;
    public Py1 p;
    public j80_0 q;
    public FragmentLoginLayoutNewBinding r;

    static {
        Ry1$a ry1$a;
        Companion = ry1$a = new Object();
    }

    public ry1_1() {
        Object object = vz3_0.BASICVALIDATOR;
        Object object2 = new fv0_2((vz3_0)((Object)object));
        this.l = object2;
        object2 = AnalyticsManager.Companion;
        object = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp();
        this.m = object2 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        this.n = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.o = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object2 = j80_0.MANUAL;
        this.q = object2;
    }

    public final void Pa() {
        Object object = this.q;
        Object object2 = j80_0.AUTO;
        if (object == object2) {
            object = Ey1.a;
            Ey1.g();
        } else {
            Ey1.h();
        }
        object = this.r;
        if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEtError) != null) {
            ai0_2.i((View)object);
        }
        object = Ey1.a;
        object = this.getActivity();
        object2 = this.r;
        object2 = object2 != null && (object2 = ((FragmentLoginLayoutNewBinding)object2).mobileEt) != null && (object2 = ((AppCompatEditText)object2).getText()) != null ? ((Object)object2).toString() : null;
        object = Ey1.a((FragmentActivity)object, (String)object2);
        object2 = this.i;
        if (object2 != null) {
            String string2 = "login/signup screen";
            ((oa1_1)object2).b((QueryCustomer)object, string2);
        }
    }

    public final void Qa() {
        Object object = this.r;
        if (object == null || (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) == null || (object = ((AppCompatEditText)object).getText()) == null || (object = object.toString()) == null || (object = ((Object)StringsKt.m0((CharSequence)object)).toString()) == null) {
            object = "";
        }
        int n3 = ((String)object).length();
        float f5 = 0.6f;
        if (n3 > 0) {
            boolean bl2;
            Object object2;
            n3 = (int)(this.k ? 1 : 0);
            boolean bl3 = true;
            if (n3 == 0) {
                this.k = bl3;
                object2 = Ey1.a;
                Ey1.j();
            }
            if (bl2 = TextUtils.isDigitsOnly((CharSequence)object)) {
                object = this.l.a;
                bl2 = ((Validator)object).h();
            } else {
                bl2 = false;
                object = null;
            }
            if (bl2) {
                object2 = this.r;
                if (object2 != null && (object2 = ((FragmentLoginLayoutNewBinding)object2).loginContinueTv) != null) {
                    float f6 = 1.0f;
                    Ey1.l((View)object2, bl3, 0, f6);
                }
                if (bl2 && (object = this.q) == (object2 = j80_0.AUTO)) {
                    object = this.r;
                    if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).progressBarMobile) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                        object.setAlpha(f5);
                    }
                    if (!(bl2 = km_1.b((cp$a)(object = cp_1.Companion))) && (object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                        Ey1.l((View)object, false, 0, f5);
                    }
                    object2 = Looper.getMainLooper();
                    object = new Handler((Looper)object2);
                    object2 = new Ly1(this, 0);
                    long l2 = 1000L;
                    object.postDelayed((Runnable)object2, l2);
                }
            } else {
                object = cp_1.Companion;
                bl2 = km_1.b((cp$a)object);
                if (!bl2 && (object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                    Ey1.l((View)object, false, 0, f5);
                }
            }
        } else {
            object = cp_1.Companion;
            boolean bl4 = km_1.b((cp$a)object);
            if (!bl4 && (object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                Ey1.l((View)object, false, 0, f5);
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof a;
        if (bl2) {
            object = (a)object;
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
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        Object object4 = oa1_1.class;
        String string2 = "modelClass";
        object = rl3_0.b((rd3_0)object2, (E$b)object3, (Wd0)object, object4, string2);
        object2 = "<this>";
        object3 = sw0_0.a(object4, (String)object2, object4, string2, string2);
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object2 = ((String)object4).concat((String)object2);
            object = (oa1_1)object.a((yn1_2)object3, (String)object2);
            this.i = object;
            object = AJIOApplication.Companion;
            object.getClass();
            object2 = AJIOApplication$a.a().getSystemService("phone");
            object3 = "null cannot be cast to non-null type android.telephony.TelephonyManager";
            Intrinsics.checkNotNull(object2, (String)object3);
            object2 = (TelephonyManager)object2;
            int n3 = object2.getSimState();
            int n4 = 1;
            if (n3 != n4 && (n3 = (int)(km_1.b((cp$a)(object2 = cp_1.Companion)) ? 1 : 0)) == 0) {
                object2 = Ey1.a;
                object2 = this.getContext();
                object4 = this.getActivity();
                object2 = (gc3_2)((Object)object2);
                Ey1.d((gc3_2)((Object)object2), (FragmentActivity)object4);
            }
            object2 = new Bundle();
            this.j = object2;
            object4 = "Step_Number";
            object2.putInt((String)object4, n4);
            object2 = this.getArguments();
            n4 = 0;
            object3 = null;
            if (object2 != null) {
                object4 = "SOURCE";
                object2 = object2.getString((String)object4);
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                object4 = this.j;
                if (object4 == null) {
                    object4 = "eventBundle";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object4;
                }
                object4 = "login_source";
                object3.putString((String)object4, (String)object2);
            }
            object2 = Ey1.a;
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object = Q.a((AJIOApplication$a)object, (z40$a)object2).a;
            object2 = "enable_continue_auto_click";
            boolean bl2 = object.a((String)object2);
            object = bl2 ? j80_0.AUTO : j80_0.MANUAL;
            this.q = object;
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_login_layout_new;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Object object = this.g;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (object != null && (n3 = object.W1()) == n4 || (object = this.g) != null && (n3 = object.V()) == n4) {
            Object object2;
            object = j80_0.MANUAL;
            this.q = object;
            object = this.r;
            if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).progressBarMobile) != null) {
                n4 = 8;
                f5 = 1.1E-44f;
                object.setVisibility(n4);
            }
            if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null && (object = ((AppCompatEditText)object).getText()) != null) {
                n3 = object.length();
                object2 = this.r;
                if (object2 != null && (object2 = ((FragmentLoginLayoutNewBinding)object2).mobileEt) != null) {
                    object2.setSelection(n3);
                }
            }
            if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                n4 = 1065353216;
                f5 = 1.0f;
                object.setAlpha(f5);
            }
            if ((object = this.g) != null) {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
                object.A0(false);
            }
            if ((object = this.g) != null) {
                object.o1();
            }
            if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                object.requestFocus();
            }
            if ((object = this.r) != null) {
                object = ((FragmentLoginLayoutNewBinding)object).mobileEt;
            } else {
                n3 = 0;
                object = null;
            }
            hv3_0.m0((View)object);
        }
    }

    public final void onStop() {
        super.onStop();
        Ey1.a.setPreviousScreenData("mobile - login/signup screen", "user account screen");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        float f5;
        int n4;
        Object object4;
        int n7;
        block85: {
            int n8;
            int n10;
            Object object5;
            float f6;
            int n14;
            int n15;
            block86: {
                block84: {
                    float f7;
                    block83: {
                        block82: {
                            n7 = 1;
                            object4 = "view";
                            Intrinsics.checkNotNullParameter(object, (String)object4);
                            super.onViewCreated((View)object, (Bundle)object2);
                            this.r = object = FragmentLoginLayoutNewBinding.bind((View)object);
                            object = Ey1.a;
                            object = this.j;
                            n4 = 0;
                            f5 = 0.0f;
                            object2 = null;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("eventBundle");
                                n3 = 0;
                                object = null;
                            }
                            Ey1.k((Bundle)object);
                            object = this.r;
                            if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).rootView) != null) {
                                object4 = new Ky1(this);
                                object.setOnTouchListener((View.OnTouchListener)object4);
                            }
                            if ((object = this.g) != null) {
                                object.s0(false);
                            }
                            if ((object = this.g) != null) {
                                object.v0(false);
                            }
                            if ((object = this.g) != null) {
                                n15 = R$color.transparent;
                                object.F1(n15);
                            }
                            if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                                object.setOnClickListener((View.OnClickListener)this);
                            }
                            object = new DisplayMetrics();
                            object4 = this.getActivity();
                            if (object4 != null && (object4 = object4.getWindowManager()) != null && (object4 = object4.getDefaultDisplay()) != null) {
                                object4.getMetrics((DisplayMetrics)object);
                            }
                            double d2 = ((DisplayMetrics)object).heightPixels;
                            double d5 = 0.2;
                            n3 = (int)(d2 *= d5);
                            object4 = this.r;
                            if (object4 != null && (object4 = ((FragmentLoginLayoutNewBinding)object4).loginAjioLogo) != null) {
                                n14 = mz3_0.d(60);
                                n3 -= n14;
                                n14 = 13;
                                f6 = 1.8E-44f;
                                ai0_2.u(n3, 0, n14, object4);
                            }
                            object = h40_0.a;
                            object = z40_0.Companion;
                            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("common_login_signup_page_banner_config");
                            object4 = CommonLoginSignUpConfig.class;
                            if ((object = (CommonLoginSignUpConfig)JsonUtils.fromJson((String)object, object4)) != null) {
                                object4 = ((CommonLoginSignUpConfig)object).b();
                                object3 = Boolean.TRUE;
                                n15 = (int)(Intrinsics.areEqual(object4, object3) ? 1 : 0);
                            } else {
                                n15 = 0;
                                f7 = 0.0f;
                                object4 = null;
                            }
                            n14 = 42;
                            f6 = 5.9E-44f;
                            object5 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
                            if (n15 == 0) break block82;
                            object4 = this.r;
                            if (object4 != null) {
                                object4 = ((FragmentLoginLayoutNewBinding)object4).loginAjioLogo;
                            } else {
                                n15 = 0;
                                object4 = null;
                                f7 = 0.0f;
                            }
                            String string2 = ((CommonLoginSignUpConfig)object).a();
                            if (string2 != null && (n10 = string2.length()) != 0) {
                                object3 = Uri.parse((String)((CommonLoginSignUpConfig)object).a()).getPathSegments();
                                object5 = object3;
                                object5 = (Collection)object3;
                                if (object5 != null && (n8 = object5.isEmpty()) == 0 && (object3 = (String)CollectionsKt.T((List)object3)) != null) {
                                    uy1_0.c((String)object3);
                                }
                                if (object4 != null) {
                                    object3 = new da$a();
                                    object3.k = n7;
                                    object3.g = n7;
                                    object3.n = object = ((CommonLoginSignUpConfig)object).a();
                                    object3.u = object4;
                                    object3.a();
                                }
                                break block83;
                            } else {
                                object = this.r;
                                if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).loginAjioLogo) != null) {
                                    n15 = R$drawable.ic_ajio_login;
                                    ((AppCompatImageView)((Object)object)).setImageResource(n15);
                                }
                                if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginAjioLogo) != null) {
                                    object4 = object.getLayoutParams();
                                    if (object4 == null) {
                                        object = new NullPointerException((String)object5);
                                        throw object;
                                    }
                                    ((ViewGroup.LayoutParams)object4).height = n14 = mz3_0.d(n14);
                                    object.setLayoutParams((ViewGroup.LayoutParams)object4);
                                }
                            }
                            break block83;
                        }
                        object = this.r;
                        if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).loginAjioLogo) != null) {
                            n15 = R$drawable.ic_ajio_login;
                            ((AppCompatImageView)((Object)object)).setImageResource(n15);
                        }
                        if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginAjioLogo) != null) {
                            object4 = object.getLayoutParams();
                            if (object4 == null) {
                                object = new NullPointerException((String)object5);
                                throw object;
                            }
                            ((ViewGroup.LayoutParams)object4).height = n14 = mz3_0.d(n14);
                            object.setLayoutParams((ViewGroup.LayoutParams)object4);
                        }
                    }
                    object = this.requireActivity().getApplication();
                    object4 = "getApplication(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                    object = z40$a.a((Context)object).a;
                    object3 = "referral_feature_enable";
                    n3 = (int)(((ao0_0)object).a((String)object3) ? 1 : 0);
                    if (n3 != 0) {
                        object = this.requireActivity().getApplication();
                        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                        object = z40$a.a((Context)object).a;
                        object4 = "referee_enable";
                        n3 = (int)(((ao0_0)object).a((String)object4) ? 1 : 0);
                        if (n3 != 0 && (object = bv1_0.a) != null && (n3 = ((String)object).length()) != 0) {
                            object = bv1_0.b;
                            if (object != null && (n3 = ((String)object).length()) != 0) {
                                object = this.r;
                                if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).loginWelcomeMsgTv) != null) {
                                    n15 = R$string.invited_you;
                                    object3 = new Object[n7];
                                    object3[0] = object5 = bv1_0.b;
                                    object4 = hv3_0.L(n15, object3);
                                    object.setText((CharSequence)object4);
                                }
                            } else {
                                object = this.r;
                                if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).loginWelcomeMsgTv) != null) {
                                    n15 = R$string.invited_you_friend;
                                    object4 = hv3_0.K(n15);
                                    object.setText((CharSequence)object4);
                                }
                            }
                            if ((object = this.i) != null) {
                                ((oa1_1)object).i();
                            }
                        }
                    }
                    if ((object = this.getView()) != null) {
                        object = object.getViewTreeObserver();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object4 = new Py1((ViewTreeObserver)object, this);
                    this.p = object4;
                    if (object != null) {
                        object.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object4);
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileLayout) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                        object.setText(null);
                    }
                    this.k = false;
                    object = cp_1.Companion;
                    n3 = (int)(km_1.b((cp$a)object) ? 1 : 0);
                    if (n3 == 0) {
                        object = this.r;
                        if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                            n15 = 1058642330;
                            f7 = 0.6f;
                            ((AjioTextView)object).setAlpha(f7);
                        }
                        if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                            object.setClickable(false);
                        }
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                        object4 = new qy1_0(this);
                        ai0_2.o((EditText)object, (hx0_2)object4);
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                        object4 = new Hy1(this);
                        object.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                        object4 = new Iy1(this);
                        object.setOnEditorActionListener((TextView.OnEditorActionListener)object4);
                    }
                    object = this.l;
                    ((fv0_2)object).a.a.clear();
                    object4 = this.r;
                    if (object4 != null) {
                        object4 = ((FragmentLoginLayoutNewBinding)object4).mobileEt;
                    } else {
                        n15 = 0;
                        object4 = null;
                        f7 = 0.0f;
                    }
                    n14 = R$string.login_mobile_emailid_error;
                    object3 = hv3_0.K(n14);
                    ((fv0_2)object).f((EditText)object4, (String)object3);
                    object = this.r;
                    if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).loginGoogleIv) != null) {
                        object.setOnClickListener((View.OnClickListener)this);
                    }
                    if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginFbIv) != null) {
                        object.setOnClickListener((View.OnClickListener)this);
                    }
                    object = h40_0.a;
                    n3 = (int)(h40_0.a1() ? 1 : 0);
                    if (n3 == 0) {
                        object4 = this.r;
                        if (object4 != null && (object4 = ((FragmentLoginLayoutNewBinding)object4).loginFbIv) != null) {
                            ai0_2.i((View)object4);
                        }
                    } else {
                        object4 = this.r;
                        if (object4 != null && (object4 = ((FragmentLoginLayoutNewBinding)object4).loginFbIv) != null) {
                            ai0_2.B((View)object4);
                        }
                    }
                    if ((n15 = (int)(h40_0.g1() ? 1 : 0)) == 0) {
                        object3 = this.r;
                        if (object3 != null && (object3 = object3.loginGoogleIv) != null) {
                            ai0_2.i((View)object3);
                        }
                    } else {
                        object3 = this.r;
                        if (object3 != null && (object3 = object3.loginGoogleIv) != null) {
                            ai0_2.B((View)object3);
                        }
                    }
                    if ((object3 = this.r) != null && (object3 = object3.loginOrView) != null) {
                        if (n15 == 0 && n3 == 0) {
                            n3 = 8;
                        } else {
                            n3 = 0;
                            object = null;
                        }
                        object3.setVisibility(n3);
                    }
                    if ((object = this.getContext()) != null && (object4 = this.r) != null && (object4 = ((FragmentLoginLayoutNewBinding)object4).loginTermsConditionsTv) != null) {
                        object3 = this.getActivity();
                        object5 = "login/signup screen";
                        object = (gc3_2)((Object)object);
                        object = Ey1.c((View)object4, (FragmentActivity)object3, (gc3_2)((Object)object), (String)object5);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object4 = this.r;
                    if (object4 != null && (object4 = ((FragmentLoginLayoutNewBinding)object4).loginTermsConditionsTv) != null) {
                        object4.setText((CharSequence)object);
                        object4.setContentDescription((CharSequence)object);
                        object = LinkMovementMethod.getInstance();
                        object4.setMovementMethod((MovementMethod)object);
                    }
                    if ((n3 = (int)(((RemovalLoginPasswordConfig)(object = h40_0.R())).getEnable_restore_phone_number() ? 1 : 0)) != 0) break block84;
                    object = this.r;
                    if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).idLoginRemoval) != null) {
                        ai0_2.i((View)object);
                    }
                    break block85;
                }
                uy1_0.e("seen");
                object = h40_0.R().getLogin_restore_phone_number_message();
                object4 = h40_0.R().getLogin_click_text_highlight();
                object3 = cp$a.e();
                object3.getClass();
                n14 = (int)(cp_1.f() ? 1 : 0);
                if (n14 == 0) break block86;
                object2 = this.r;
                if (object2 != null && (object2 = object2.loginTermsConditionsTv) != null) {
                    object3 = new Ny1(this, 0);
                    object2.setOnClickListener((View.OnClickListener)object3);
                }
                if ((object2 = this.r) != null && (object2 = object2.loginTermsConditionsTv) != null) {
                    object3 = this.getContext();
                    if (object3 != null && (object3 = object3.getResources()) != null) {
                        n8 = R$dimen.dp24;
                        f6 = object3.getDimension(n8);
                        n14 = (int)f6;
                    } else {
                        n14 = 24;
                        f6 = 3.4E-44f;
                    }
                    object2.setPadding(n14, n14, n14, n14);
                }
                n4 = R$string.acc_use_link_below;
                object2 = hv3_0.K(n4);
                object = kotlin.text.b.n((String)object, (String)object4, (String)object2, false);
                object2 = this.r;
                if (object2 != null && (object2 = object2.idLoginRemovalText) != null) {
                    object2.setText((CharSequence)object);
                }
                if ((object2 = this.r) != null && (object2 = object2.idLoginRemovalText) != null) {
                    object2.setContentDescription((CharSequence)object);
                }
                if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).accessibilityClickHereEmailBasedLogin) != null) {
                    ai0_2.B((View)object);
                    n4 = R$string.acc_click_to_restore;
                    object2 = hv3_0.K(n4);
                    object.setText((CharSequence)object2);
                    object2 = this.r;
                    if (object2 != null && (object2 = object2.idLoginRemovalText) != null && (object2 = object2.getResources()) != null) {
                        n15 = R$color.pesdk_color_3;
                        n4 = object2.getColor(n15);
                        object.setTextColor(n4);
                    }
                    object2 = new Oy1(object, 0);
                    object.setOnClickListener((View.OnClickListener)object2);
                }
                if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).idLoginRemovalText) != null && (object = object.getResources()) != null) {
                    n4 = R$color.accent_color_10;
                    n3 = object.getColor(n4);
                    object2 = this.r;
                    if (object2 != null && (object2 = object2.idLoginRemovalText) != null) {
                        object2.setTextColor(n3);
                    }
                }
                break block85;
            }
            object3 = this.r;
            if (object3 != null && (object3 = object3.accessibilityClickHereEmailBasedLogin) != null) {
                ai0_2.i((View)object3);
            }
            if ((object3 = this.r) != null && (object3 = object3.idLoginRemovalText) != null) {
                object5 = TextView.BufferType.SPANNABLE;
                object3.setText((CharSequence)object, (TextView.BufferType)object5);
            }
            if ((object3 = this.r) != null && (object3 = object3.idLoginRemovalText) != null) {
                object2 = object3.getText();
            }
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.text.Spannable");
            object2 = (Spannable)object2;
            f6 = 8.4E-45f;
            n3 = StringsKt.O((CharSequence)object, (String)object4, 0, false, 6);
            n8 = hv3_0.m(R$color.pesdk_color_3);
            object3 = new ForegroundColorSpan(n8);
            n8 = ((String)object4).length() + n3;
            n10 = 33;
            object2.setSpan(object3, n3, n8, n10);
            object3 = FontsManager.getInstance();
            object5 = AJIOApplication$a.a();
            object3 = object3.getTypefaceWithFont((Context)object5, 10);
            String string3 = "";
            object5 = new AjioCustomTypefaceSpan(string3, (Typeface)object3);
            n14 = ((String)object4).length() + n3;
            int n16 = 34;
            object2.setSpan(object5, n3, n14, n16);
            object3 = new Sy1(this);
            n15 = ((String)object4).length() + n3;
            object2.setSpan(object3, n3, n15, n10);
            object = this.r;
            if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).idLoginRemovalText) != null) {
                object2 = LinkMovementMethod.getInstance();
                object.setMovementMethod((MovementMethod)object2);
            }
        }
        if ((object = this.i) != null && (object = ((oa1_1)object).n) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new d00(this, n7);
            object3 = new Ry1$b((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.i) != null && (object = ((oa1_1)object).o) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new My1(this);
            object3 = new Ry1$b((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.i) != null && (object = ((oa1_1)object).N) != null) {
            object2 = this.getViewLifecycleOwner();
            object4 = new tw0_1(this, n7);
            object3 = new Ry1$b((Function1)object4);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
        if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginWelcomeMsgTv) != null) {
            object2 = Ey1.e();
            object.setText((CharSequence)object2);
        }
        object = cp$a.e();
        object.getClass();
        n3 = (int)(cp_1.f() ? 1 : 0);
        if (n3 != 0) {
            object = this.r;
            if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                object.setClickable(n7 != 0);
            }
            if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                object.setVisibility(0);
            }
            if ((object = this.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).loginContinueTv) != null) {
                n4 = 1065353216;
                f5 = 1.0f;
                ((AjioTextView)object).setAlpha(f5);
            }
        }
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new r4(this, n7);
        object.postDelayed((Runnable)object2, (long)100);
    }
}

