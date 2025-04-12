/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.utility.b;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Sz1
 */
public final class sz1_2
extends L51
implements View.OnClickListener,
nr2_2 {
    public static final Sz1$a Companion;
    public b A;
    public boolean B;
    public QueryCustomer C;
    public String D;
    public String E;
    public final hh3_2 F;
    public String G;
    public AccountCheckResponse H;
    public Sz1$b I;
    public boolean J;
    public boolean K;
    public Sz1$e L;
    public final NewEEcommerceEventsRevamp M;
    public final NewCustomEventsRevamp N;
    public final String O;
    public final String P;
    public String Q;
    public final D R;
    public TextView S;
    public TextView T;
    public DataCallback U;
    public boolean f;
    public TextView g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public EditText l;
    public EditText m;
    public EditText n;
    public EditText o;
    public ImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public com.ril.ajio.login.activity.a y;
    public oa1_1 z;

    static {
        Sz1$a sz1$a;
        Companion = sz1$a = new Object();
    }

    public sz1_2() {
        Object object = new pz1_1(this, 0);
        this.F = object = yr1_2.b((Function0)object);
        this.G = "";
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.M = object2;
        this.N = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.O = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.P = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
        object = Reflection.getOrCreateKotlinClass(oa1_1.class);
        object2 = new Sz1$f(this);
        Sz1$g sz1$g = new Sz1$g(this);
        Sz1$h sz1$h = new Sz1$h(this);
        this.R = object = LW0.a(this, (yn1_2)object, (Function0)object2, sz1$g, sz1$h);
    }

    public static final void Pa(sz1_2 object) {
        int n3;
        Object object2 = ((sz1_2)object).l;
        Object object3 = "editText1";
        boolean bl2 = false;
        String string2 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        if ((object2 = object2.getText()) != null && (n3 = object2.length()) != 0) {
            object2 = ((sz1_2)object).m;
            Object object4 = "editText2";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object2 = null;
            }
            if ((object2 = object2.getText()) != null && (n3 = object2.length()) != 0) {
                object2 = ((sz1_2)object).n;
                String string3 = "editText3";
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object2 = null;
                }
                if ((object2 = object2.getText()) != null && (n3 = object2.length()) != 0) {
                    object2 = ((sz1_2)object).o;
                    CharSequence charSequence = "editText4";
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                        n3 = 0;
                        object2 = null;
                    }
                    if ((object2 = object2.getText()) != null && (n3 = object2.length()) != 0) {
                        boolean bl3;
                        boolean bl4;
                        boolean bl5;
                        object2 = ((sz1_2)object).l;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                            n3 = 0;
                            object2 = null;
                        }
                        object2 = object2.getText();
                        object3 = ((sz1_2)object).m;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            bl5 = false;
                            object3 = null;
                        }
                        object3 = object3.getText();
                        object4 = ((sz1_2)object).n;
                        if (object4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            bl4 = false;
                            object4 = null;
                        }
                        object4 = object4.getText();
                        string3 = ((sz1_2)object).o;
                        if (string3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                            bl3 = false;
                            string3 = null;
                        }
                        string3 = string3.getText();
                        charSequence = new StringBuilder();
                        ((StringBuilder)charSequence).append(object2);
                        ((StringBuilder)charSequence).append(object3);
                        ((StringBuilder)charSequence).append(object4);
                        ((StringBuilder)charSequence).append((Object)string3);
                        object2 = ((StringBuilder)charSequence).toString();
                        ((sz1_2)object).G = object2;
                        object3 = ((sz1_2)object).C;
                        if (object3 != null) {
                            string2 = ((QueryCustomer)object3).getMobileNumber();
                        }
                        object3 = ((sz1_2)object).D;
                        bl4 = ((Fragment)object).isAdded();
                        if (bl4) {
                            object4 = ((sz1_2)object).y;
                            if (object4 != null) {
                                object4.startLoader();
                            }
                            object4 = new QueryCustomer();
                            bl3 = ((sz1_2)object).B;
                            charSequence = null;
                            if (bl3) {
                                ((QueryCustomer)object4).setMobileNumber(string2);
                                bl2 = true;
                                ((QueryCustomer)object4).setMobileNumberEnterered(bl2);
                            } else {
                                if (object3 != null && !(bl2 = TextUtils.isEmpty((CharSequence)object3))) {
                                    string2 = ((String)object3).toLowerCase();
                                    string3 = "toLowerCase(...)";
                                    Intrinsics.checkNotNullExpressionValue(string2, string3);
                                    ((QueryCustomer)object4).setEmail(string2);
                                }
                                ((QueryCustomer)object4).setMobileNumberEnterered(false);
                            }
                            string2 = "manual";
                            ((QueryCustomer)object4).setLoginvia(string2);
                            ((QueryCustomer)object4).setLogin((String)object3);
                            ((QueryCustomer)object4).setOtp((String)object2);
                            ((QueryCustomer)object4).setRegistration(false);
                            object2 = ((sz1_2)object).z;
                            Intrinsics.checkNotNull(object2);
                            object2.A = bl5 = ((sz1_2)object).J;
                            object2 = ((jo_2)((sz1_2)object).F.getValue()).a();
                            ((QueryCustomer)object4).setAdId((String)object2);
                            object = ((sz1_2)object).z;
                            Intrinsics.checkNotNull(object);
                            object2 = "login - otp screen";
                            ((oa1_1)object).l((QueryCustomer)object4, (String)object2);
                        }
                    }
                }
            }
        }
    }

    public final void Qa() {
        Object object = this.A;
        if (object != null) {
            object.b(this);
        }
        object = this.I;
        Object object2 = null;
        if (object != null) {
            object.cancel();
            this.I = null;
        }
        object = z40_0.Companion;
        Object object3 = this.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object.getClass();
        object = z40$a.a((Context)object3).a;
        object3 = "login_signup_otp_timer";
        long l2 = ((ao0_0)object).h((String)object3);
        int n3 = 1000;
        long l3 = n3;
        object = new Sz1$b(this, l2 *= l3);
        this.I = object;
        object.start();
        object = this.r;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resendOtpTv");
            object = null;
        }
        int n4 = 8;
        object.setVisibility(n4);
        object = this.q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorTv");
            object = null;
        }
        object.setVisibility(n4);
        object = this.p;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorIv");
            object = null;
        }
        object.setVisibility(n4);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timerTv");
            object = null;
        }
        string2 = null;
        object.setVisibility(0);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkingMsgTv");
            object = null;
        }
        object.setVisibility(0);
        object = this.S;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginButtonAccessibleUser");
            object = null;
        }
        object.setVisibility(n4);
        object = this.T;
        if (object == null) {
            object = "loginOtpVerifiedText";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setVisibility(n4);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void Ra() {
        String string2;
        String string3;
        void var14_16;
        int n3;
        Object object;
        sz1_2 sz1_22 = this;
        int n4 = 2;
        Object object2 = new HashMap();
        CleverTapEvents cleverTapEvents = AnalyticsManager.Companion.getInstance().getCt();
        AnalyticsData$Builder analyticsData$Builder = new AnalyticsData$Builder();
        object2 = analyticsData$Builder.eventMap((HashMap)object2).build();
        cleverTapEvents.loginComplete((AnalyticsData)object2);
        object2 = this.y;
        Intrinsics.checkNotNull(object2);
        int n7 = 1;
        analyticsData$Builder = null;
        Object[] objectArray = "";
        object2.f0((String)objectArray, n7 != 0, false);
        object2 = this.F;
        Object object3 = (jo_2)((hh3_2)object2).getValue();
        int n8 = this.B;
        Object object4 = "IS_INPUT_MOBILENUMBER";
        ((sw_0)object3).putPreference((String)object4, n8 != 0);
        boolean bl2 = this.B;
        if (bl2) {
            object2 = (jo_2)((hh3_2)object2).getValue();
            object3 = this.D;
            if (object3 != null) {
                object = "INPUT_MOBILE_NUMBER";
                ((sw_0)object2).putPreference((String)object, (String)object3);
            } else {
                object2.getClass();
            }
        } else {
            object2 = (jo_2)((hh3_2)object2).getValue();
            object3 = this.D;
            if (object3 != null) {
                object = "INPUT_EMAIL_ID";
                ((sw_0)object2).putPreference((String)object, (String)object3);
            } else {
                object2.getClass();
            }
        }
        object2 = sz1_22.U;
        bl2 = false;
        object3 = null;
        if (object2 != null) {
            object2 = (User)((DataCallback)object2).getData();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 == null) return;
        object2 = bv1_0.f;
        if (object2 == null || (n3 = ((String)object2).length()) == 0) {
            bv1_0.f = object2 = "OTP";
        }
        if ((object2 = sz1_22.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText1");
            n3 = 0;
            object2 = null;
        }
        n8 = R$drawable.rounded_rect_4_green_bg_00bf76_stroke;
        object = hv3_0.r(n8);
        object2.setBackground((Drawable)object);
        object2 = sz1_22.m;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText2");
            n3 = 0;
            object2 = null;
        }
        n8 = R$drawable.rounded_rect_4_green_bg_00bf76_stroke;
        object = hv3_0.r(n8);
        object2.setBackground((Drawable)object);
        object2 = sz1_22.n;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText3");
            n3 = 0;
            object2 = null;
        }
        n8 = R$drawable.rounded_rect_4_green_bg_00bf76_stroke;
        object = hv3_0.r(n8);
        object2.setBackground((Drawable)object);
        object2 = sz1_22.o;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editText4");
            n3 = 0;
            object2 = null;
        }
        n8 = R$drawable.rounded_rect_4_green_bg_00bf76_stroke;
        object = hv3_0.r(n8);
        object2.setBackground((Drawable)object);
        object4 = sz1_22.y;
        Intrinsics.checkNotNull(object4);
        object2 = sz1_22.U;
        if (object2 != null) {
            Object object5 = object2 = (User)((DataCallback)object2).getData();
        } else {
            Object var14_15 = null;
        }
        Intrinsics.checkNotNull(var14_16);
        object2 = sz1_22.z;
        Intrinsics.checkNotNull(object2);
        boolean bl3 = ((oa1_1)object2).A;
        String string4 = sz1_22.G;
        boolean bl4 = sz1_22.B;
        String string5 = sz1_22.D;
        n3 = (int)(object4.Q0((User)var14_16, bl3, string4, bl4, string5) ? 1 : 0);
        object = "format(...)";
        if (n3 == 0) {
            Object object6 = sz1_22.y;
            if (object6 != null) {
                object6.stopLoader();
            }
            object6 = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_error_message;
            object6 = hv3_0.K(n4);
            object2 = hv3_0.K(R$string.cannot_login);
            objectArray = new Object[n7];
            objectArray[0] = object2;
            object6 = xh2_0.a(objectArray, n7, (String)object6, (String)object);
            n3 = R$string.cannot_login;
            object2 = hv3_0.K(n3);
            hv3_0.o0(0, (String)object2, (String)object6);
            return;
        }
        object2 = sz1_22.C;
        if (object2 != null) {
            object2 = ((QueryCustomer)object2).getFirstName();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 == null) {
            n4 = R$string.registration_success_noname;
            string3 = hv3_0.K(n4);
            hv3_0.o0(0, string3, null);
        } else {
            object2 = StringCompanionObject.INSTANCE;
            n3 = R$string.registration_success;
            object2 = hv3_0.K(n3);
            object4 = sz1_22.C;
            object4 = object4 != null ? ((QueryCustomer)object4).getFirstName() : null;
            object4 = mz3_0.P((String)object4);
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = object4;
            objectArray2[n7] = objectArray;
            string3 = xh2_0.a(objectArray2, n4, (String)object2, (String)object);
            hv3_0.o0(0, string3, null);
        }
        n4 = (int)(sz1_22.B ? 1 : 0);
        string3 = n4 != 0 ? "mobile number" : "email address";
        String string6 = string3;
        Bundle bundle = new Bundle();
        object = sz1_22.N;
        string3 = ((NewCustomEventsRevamp)object).getLOGIN_SIGNUP_SRC();
        object2 = sz1_22.E;
        bundle.putString(string3, (String)object2);
        string3 = ((NewCustomEventsRevamp)object).getLOGIN_TYPE();
        bundle.putString(string3, string6);
        object4 = ((NewCustomEventsRevamp)object).getEC_USER_ACCOUNTS();
        string3 = sz1_22.Q;
        if (string3 == null) {
            string3 = "screenName";
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl4 = false;
            string2 = null;
        } else {
            string2 = string3;
        }
        String string7 = "login - success";
        string4 = "login_success";
        string5 = "user account screen";
        String string8 = sz1_22.O;
        string3 = sz1_22.P;
        int n10 = 1536;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object4, string7, string6, string4, string2, string5, string8, bundle, string3, false, null, n10, null);
    }

    public final void c8(String object) {
        String string2 = "otp";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.length();
        if (n3 > 0) {
            object = ((String)object).toCharArray();
            string2 = "toCharArray(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            n3 = ((Object)object).length;
            int n4 = 4;
            if (n3 == n4) {
                string2 = this.l;
                n4 = 0;
                String string3 = null;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editText1");
                    n3 = 0;
                    string2 = null;
                }
                Object object2 = object[0];
                String string4 = String.valueOf((char)object2);
                string2.setText((CharSequence)string4);
                string2 = this.m;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editText2");
                    n3 = 0;
                    string2 = null;
                }
                object2 = object[1];
                string4 = String.valueOf((char)object2);
                string2.setText((CharSequence)string4);
                string2 = this.n;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editText3");
                    n3 = 0;
                    string2 = null;
                }
                object2 = object[2];
                string4 = String.valueOf((char)object2);
                string2.setText((CharSequence)string4);
                string2 = this.o;
                if (string2 == null) {
                    string2 = "editText4";
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    string3 = string2;
                }
                n3 = 3;
                Object object3 = object[n3];
                object = String.valueOf((char)object3);
                string3.setText((CharSequence)object);
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof com.ril.ajio.login.activity.a;
        if (bl2) {
            object = (com.ril.ajio.login.activity.a)object;
            this.y = object;
            return;
        }
        object = pn_2.b(object, " must implement LoginActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        boolean bl2 = false;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.otp_mobile_edit;
        boolean bl3 = true;
        Object object3 = "login/signup clicks";
        String string2 = "login - otp screen";
        String string3 = "";
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            object = this.y;
            if (object != null) {
                object.A0(bl3);
            }
            object = AnalyticsManager.Companion;
            object2 = "mobile edit";
            tj2_0.e((AnalyticsManager$Companion)object, (String)object3, (String)object2, string2);
            n4 = (int)(this.B ? 1 : 0);
            if (n4 != 0) {
                object = this.y;
                if (object != null) {
                    bl2 = this.f;
                    String string4 = this.D;
                    object.T(string4, string3, bl2);
                }
            } else {
                object = this.y;
                if (object != null) {
                    bl2 = this.f;
                    String string5 = this.D;
                    object.T(string3, string5, bl2);
                }
            }
        } else {
            n7 = R$id.otp_email_edit;
            if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                object = this.y;
                if (object != null) {
                    object.A0(bl3);
                }
                object = AnalyticsManager.Companion;
                object2 = "email edit";
                tj2_0.e((AnalyticsManager$Companion)object, (String)object3, (String)object2, string2);
                n4 = (int)(this.B ? 1 : 0);
                if (n4 != 0) {
                    object = this.y;
                    if (object != null) {
                        bl2 = this.f;
                        String string6 = this.D;
                        object.T(string6, string3, bl2);
                    }
                } else {
                    object = this.y;
                    if (object != null) {
                        bl2 = this.f;
                        String string7 = this.D;
                        object.T(string3, string7, bl2);
                    }
                }
            } else {
                n7 = R$id.otp_login_with_pass_tv;
                if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                    object = AnalyticsManager.Companion;
                    Object object4 = "login with password";
                    tj2_0.e((AnalyticsManager$Companion)object, (String)object3, (String)object4, string2);
                    n4 = (int)(this.K ? 1 : 0);
                    if (n4 != 0) {
                        n4 = (int)(this.B ? 1 : 0);
                        if (n4 != 0) {
                            object = this.y;
                            if (object != null) {
                                n7 = (int)(this.f ? 1 : 0);
                                String string8 = this.D;
                                object.T(string8, string3, n7 != 0);
                            }
                        } else {
                            object = this.y;
                            if (object != null) {
                                n7 = (int)(this.f ? 1 : 0);
                                String string9 = this.D;
                                object.T(string3, string9, n7 != 0);
                            }
                        }
                    } else {
                        object = this.y;
                        if (object != null) {
                            object4 = pA1.Companion;
                            object3 = this.H;
                            Intrinsics.checkNotNull(object3);
                            boolean bl4 = this.B;
                            string3 = this.D;
                            object4.getClass();
                            object4 = pA1$a.a((AccountCheckResponse)object3, bl4, bl3, string3, bl3);
                            String string10 = "LoginPasswordFragmentNew";
                            object.Z0((Fragment)object4, string10);
                        }
                    }
                    if ((object = this.A) != null) {
                        ((b)object).a();
                        this.A = null;
                    }
                } else {
                    n7 = R$id.otp_resend_otp_tv;
                    if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                        n4 = (int)(this.J ? 1 : 0);
                        object = n4 != 0 ? "otp verify screen" : string2;
                        Object object5 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        string3 = "Resend OTP";
                        ((GTMEvents)object5).pushButtonTapEvent((String)object3, string3, (String)object);
                        hv3_0.S(this.getActivity());
                        object = this.y;
                        if (object != null) {
                            object.startLoader();
                        }
                        object = new QueryCustomer();
                        n7 = this.B;
                        if (n7) {
                            object2 = this.D;
                            ((QueryCustomer)object).setMobileNumber((String)object2);
                            ((QueryCustomer)object).setMobileNumberEnterered(bl3);
                        } else {
                            n7 = 0;
                            ((QueryCustomer)object).setMobileNumberEnterered(false);
                            object5 = this.D;
                            if (object5 != null && !(n7 = TextUtils.isEmpty((CharSequence)object5))) {
                                object5 = this.D;
                                if (object5 != null) {
                                    object2 = ((String)object5).toLowerCase();
                                    object5 = "toLowerCase(...)";
                                    Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                                }
                                ((QueryCustomer)object).setEmail((String)object2);
                            }
                        }
                        ((QueryCustomer)object).setRequestMode("SENDOTP");
                        object2 = this.z;
                        Intrinsics.checkNotNull(object2);
                        ((oa1_1)object2).k((QueryCustomer)object, string2);
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        Object object3;
        Object object4;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3;
            String string2;
            boolean bl2;
            int n4;
            int n7;
            Object object5;
            int n8;
            int n10;
            int n14;
            object4 = "param1";
            object = object.getBundle((String)object4);
            int n15 = 1;
            if (object != null && (n14 = object.containsKey((String)(object3 = "QUERYCUSTOMER_DATA"))) == n15) {
                object3 = object.get((String)object3);
                object2 = "null cannot be cast to non-null type com.ril.ajio.services.query.QueryCustomer";
                Intrinsics.checkNotNull(object3, (String)object2);
                this.C = object3 = (QueryCustomer)object3;
            }
            object3 = this.R;
            if (object != null && (n10 = object.containsKey((String)(object2 = "ISINPUTMOBILENUMBER"))) == n15) {
                n14 = (int)(object.getBoolean((String)object2) ? 1 : 0);
                this.B = n14;
                object2 = (oa1_1)((D)object3).getValue();
                n10 = (int)(this.B ? 1 : 0);
                ((oa1_1)object2).h = n10;
            }
            n14 = 0;
            object2 = null;
            n10 = 32;
            if (object != null && (n8 = object.containsKey((String)(object5 = "INPUT_MOBILE_EMAILID"))) == n15) {
                if ((object5 = object.getString((String)object5)) != null) {
                    n8 = ((String)object5).length() - n15;
                    n7 = 0;
                    n4 = 0;
                    while (n7 <= n8) {
                        int n16 = n4 == 0 ? n7 : n8;
                        n16 = Intrinsics.compare(((String)object5).charAt(n16), n10);
                        n16 = n16 <= 0 ? 1 : 0;
                        if (n4 == 0) {
                            if (n16 == 0) {
                                n4 = 1;
                                continue;
                            }
                            ++n7;
                            continue;
                        }
                        if (n16 == 0) break;
                        n8 += -1;
                    }
                    object5 = com.jio.jioads.adinterfaces.a.a(n8, n15, n7, (String)object5);
                } else {
                    bl2 = false;
                    object5 = null;
                }
                this.D = object5;
                bl2 = this.B;
                if (bl2) {
                    object5 = (oa1_1)((D)object3).getValue();
                    ((oa1_1)object5).f = string2 = this.D;
                } else {
                    object5 = (oa1_1)((D)object3).getValue();
                    ((oa1_1)object5).g = string2 = this.D;
                }
            }
            if (object != null && (n8 = object.containsKey((String)(object5 = "ACCOUNTCHECK_RESPONSE"))) == n15) {
                object5 = object.get((String)object5);
                string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.user.AccountCheckResponse";
                Intrinsics.checkNotNull(object5, string2);
                this.H = object5 = (AccountCheckResponse)object5;
            }
            if (object != null && (n8 = (int)(object.containsKey((String)(object5 = "is_forgot_password")) ? 1 : 0)) == n15) {
                this.J = bl2 = object.getBoolean((String)object5);
            }
            if (object != null && (n8 = (int)(object.containsKey((String)(object5 = "IsFromPassword")) ? 1 : 0)) == n15) {
                this.K = bl2 = object.getBoolean((String)object5);
            }
            if (object != null && (n8 = (int)(object.containsKey((String)(object5 = "SIGIN_SOURCE")) ? 1 : 0)) == n15) {
                if ((object5 = object.getString((String)object5)) != null) {
                    n14 = ((String)object5).length() - n15;
                    n8 = 0;
                    string2 = null;
                    n7 = 0;
                    while (n8 <= n14) {
                        n4 = n7 == 0 ? n8 : n14;
                        n4 = Intrinsics.compare(((String)object5).charAt(n4), n10);
                        n4 = n4 <= 0 ? 1 : 0;
                        if (n7 == 0) {
                            if (n4 == 0) {
                                n7 = 1;
                                continue;
                            }
                            ++n8;
                            continue;
                        }
                        if (n4 == 0) break;
                        n14 += -1;
                    }
                    object2 = com.jio.jioads.adinterfaces.a.a(n14, n15, n8, (String)object5);
                }
                this.E = object2;
            }
            if (object == null || (n3 = object.getBoolean((String)(object2 = "is_half_card_flow"), false)) != n15) {
                n15 = 0;
                object4 = null;
            }
            this.f = n15;
            object = (oa1_1)((D)object3).getValue();
            n15 = (int)(this.f ? 1 : 0);
            ((oa1_1)object).e = n15;
        }
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object4, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = oa1_1.class;
        String string3 = "modelClass";
        object = rl3_0.b((rd3_0)object4, (E$b)object3, (Wd0)object, (Class)object2, string3);
        object4 = "<this>";
        object3 = sw0_0.a((Class)object2, (String)object4, (Class)object2, string3, string3);
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = object3.getQualifiedName();
        if (object4 != null) {
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object4);
            this.z = object = (oa1_1)((pD3)object).a((yn1_2)object3, (String)object4);
            return;
        }
        object4 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object4);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_otp_login_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = this.I;
        if (object != null) {
            if (object != null) {
                object.cancel();
            }
            this.I = null;
        }
        if ((object = this.L) != null) {
            if (object != null) {
                object.cancel();
            }
            this.L = null;
        }
        if ((object = this.A) != null) {
            if (object != null) {
                ((b)object).a();
            }
            this.A = null;
        }
    }

    public final void onStop() {
        super.onStop();
        String string2 = this.Q;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("screenName");
            string2 = null;
        }
        this.M.setPreviousScreenData(string2, "user account screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        Object object4;
        int n3;
        int n4;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.y;
        Intrinsics.checkNotNull(object2);
        object2.s0(false);
        object2 = com.ril.ajio.utility.b.Companion;
        Object object5 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object5, "requireContext(...)");
        this.A = object2 = (b)((x63_0)object2).a(object5);
        object2 = this.z;
        Intrinsics.checkNotNull(object2);
        object2 = ((oa1_1)object2).o;
        object5 = this.getViewLifecycleOwner();
        F62 f62 = new qz1_1(this);
        ((LiveData)object2).e((mu1_1)object5, f62);
        object2 = this.z;
        Intrinsics.checkNotNull(object2);
        object2 = ((oa1_1)object2).k;
        object5 = this.getViewLifecycleOwner();
        f62 = new rz1_0(this);
        ((LiveData)object2).e((mu1_1)object5, f62);
        int n8 = R$id.otp_login_otp_sent_desc_tv;
        object2 = (TextView)object.findViewById(n8);
        this.g = object2;
        n8 = R$id.otp_phone_tv;
        object2 = (TextView)object.findViewById(n8);
        this.h = object2;
        n8 = R$id.otp_mobile_edit;
        object2 = (TextView)object.findViewById(n8);
        this.i = object2;
        object5 = "mobileEditTv";
        f62 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n8 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n8 = R$id.otp_timer_tv;
        object2 = (TextView)object.findViewById(n8);
        this.j = object2;
        n8 = R$id.otp_checking_msg_tv;
        object2 = (TextView)object.findViewById(n8);
        this.k = object2;
        n8 = R$id.otp_et1;
        object2 = (EditText)object.findViewById(n8);
        this.l = object2;
        n8 = R$id.otp_et2;
        object2 = (EditText)object.findViewById(n8);
        this.m = object2;
        n8 = R$id.otp_et3;
        object2 = (EditText)object.findViewById(n8);
        this.n = object2;
        n8 = R$id.otp_et4;
        object2 = (EditText)object.findViewById(n8);
        this.o = object2;
        n8 = R$id.error_iv;
        object2 = (ImageView)object.findViewById(n8);
        this.p = object2;
        n8 = R$id.error_tv;
        object2 = (TextView)object.findViewById(n8);
        this.q = object2;
        n8 = R$id.otp_resend_otp_tv;
        object2 = (TextView)object.findViewById(n8);
        this.r = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resendOtpTv");
            n8 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n8 = R$id.otp_trouble_getting_tv;
        object2 = (TextView)object.findViewById(n8);
        this.s = object2;
        n8 = R$id.otp_check_also_tv;
        object2 = (TextView)object.findViewById(n8);
        this.t = object2;
        n8 = R$id.otp_email_tv;
        object2 = (TextView)object.findViewById(n8);
        this.u = object2;
        n8 = R$id.otp_email_edit;
        object2 = (TextView)object.findViewById(n8);
        this.v = object2;
        String string2 = "emailEditTv";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n8 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n8 = R$id.otp_you_can_tv;
        object2 = (TextView)object.findViewById(n8);
        this.w = object2;
        n8 = R$id.otp_login_with_pass_tv;
        object2 = (TextView)object.findViewById(n8);
        this.x = object2;
        String string3 = "loginWithPassTv";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n8 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n8 = R$id.login_button_accessible_user;
        object2 = (TextView)object.findViewById(n8);
        this.S = object2;
        n8 = R$id.otp_verified_accessibility_user;
        object = (TextView)object.findViewById(n8);
        this.T = object;
        object = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object);
        if (bl2) {
            object = this.S;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loginButtonAccessibleUser");
                bl2 = false;
                object = null;
            }
            object2 = new oz1_1(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        object = cp$a.e();
        object.getClass();
        bl2 = cp_1.f();
        n8 = 8;
        if (!bl2) {
            this.Qa();
        } else {
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("timerTv");
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("checkingMsgTv");
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
        }
        bl2 = this.B;
        Object object6 = "otpSendDescTv";
        Object object7 = "mobileTv";
        String string4 = "altOtpDesc";
        String string5 = "emailTv";
        if (bl2) {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                bl2 = false;
                object = null;
            }
            if ((object7 = this.C) != null) {
                object7 = ((QueryCustomer)object7).getMobileNumber();
            } else {
                n4 = 0;
                object7 = null;
            }
            object.setText((CharSequence)object7);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl2 = false;
                object = null;
            }
            object.setVisibility(0);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
            object = this.g;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                bl2 = false;
                object = null;
            }
            n3 = R$string.login_otp_desc_mobile1;
            object6 = hv3_0.K(n3);
            object.setText((CharSequence)object6);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object = null;
            }
            n3 = R$string.alt_otp_desc_number;
            object6 = hv3_0.K(n3);
            object.setText((CharSequence)object6);
        } else {
            object = this.h;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                bl2 = false;
                object = null;
            }
            if ((object7 = this.H) != null) {
                object7 = ((AccountCheckResponse)object7).getMaskedMobileNumber();
            } else {
                n4 = 0;
                object7 = null;
            }
            object.setText((CharSequence)object7);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object = null;
            }
            n4 = R$string.your_email_id;
            object4 = this.C;
            object4 = object4 != null ? ((QueryCustomer)object4).getEmail() : null;
            object3 = new Object[n7];
            object3[0] = object4;
            object7 = hv3_0.L(n4, object3);
            object.setText((CharSequence)object7);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                object = null;
            }
            object.setVisibility(0);
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            object.setVisibility(0);
            object = this.g;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                bl2 = false;
                object = null;
            }
            n3 = R$string.login_otp_desc_mobile;
            object6 = hv3_0.K(n3);
            object.setText((CharSequence)object6);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                object = null;
            }
            n3 = R$string.alt_otp_desc_email;
            object6 = hv3_0.K(n3);
            object.setText((CharSequence)object6);
        }
        object = this.s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("troubleGettingOtpTv");
            bl2 = false;
            object = null;
        }
        object.setVisibility(n8);
        object = this.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            bl2 = false;
            object = null;
        }
        object.setVisibility(n8);
        object = this.w;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("youCanTv");
            bl2 = false;
            object = null;
        }
        object.setVisibility(n8);
        object = this.x;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            bl2 = false;
            object = null;
        }
        object.setVisibility(n8);
        bl2 = this.J;
        string3 = "getApplication(...)";
        if (bl2) {
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                bl2 = false;
                object = null;
            }
            object.setVisibility(n8);
        } else {
            object2 = z40_0.Companion;
            object5 = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object5, string3);
            object2.getClass();
            object2 = z40$a.a((Context)object5).a;
            object5 = "otp_trouble_login_timer_in_millis";
            long l2 = ((ao0_0)object2).h((String)object5);
            long l3 = 1000L;
            object = new CountDownTimer(l2, l3);
            this.L = object;
            object.start();
            bv1_0.g = n7;
        }
        object = this.l;
        object2 = "editText1";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        if ((object5 = this.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object5 = null;
        }
        string2 = this.m;
        object6 = "editText2";
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            string2 = null;
        }
        Object object8 = new Sz1$c(this, null, (EditText)object5, (EditText)string2);
        object.setOnKeyListener((View.OnKeyListener)object8);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            bl2 = false;
            object = null;
        }
        if ((object5 = this.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object5 = null;
        }
        if ((string2 = this.m) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            string2 = null;
        }
        object7 = this.n;
        string4 = "editText3";
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n4 = 0;
            object7 = null;
        }
        object8 = new Sz1$c(this, (EditText)object5, (EditText)string2, (EditText)object7);
        object.setOnKeyListener((View.OnKeyListener)object8);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            bl2 = false;
            object = null;
        }
        if ((object5 = this.m) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            object5 = null;
        }
        if ((string2 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            string2 = null;
        }
        object7 = this.o;
        string5 = "editText4";
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            n4 = 0;
            object7 = null;
        }
        object8 = new Sz1$c(this, (EditText)object5, (EditText)string2, (EditText)object7);
        object.setOnKeyListener((View.OnKeyListener)object8);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            bl2 = false;
            object = null;
        }
        if ((object5 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            object5 = null;
        }
        if ((string2 = this.o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            string2 = null;
        }
        object8 = new Sz1$c(this, (EditText)object5, (EditText)string2, null);
        object.setOnKeyListener((View.OnKeyListener)object8);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        if ((object5 = this.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object5 = null;
        }
        if ((string2 = this.m) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            string2 = null;
        }
        object8 = new Sz1$d(this, (EditText)object5, (EditText)string2);
        object.addTextChangedListener((TextWatcher)object8);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            bl2 = false;
            object = null;
        }
        if ((object5 = this.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        }
        if ((object2 = this.m) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n8 = 0;
            object2 = null;
        }
        if ((object5 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            object5 = null;
        }
        object8 = new Sz1$d(this, (EditText)object2, (EditText)object5);
        object.addTextChangedListener((TextWatcher)object8);
        object = this.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            bl2 = false;
            object = null;
        }
        if ((object8 = this.m) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
        }
        if ((object8 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n7 = 0;
            object8 = null;
        }
        if ((object5 = this.o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            object5 = null;
        }
        object2 = new Sz1$d(this, (EditText)object8, (EditText)object5);
        object.addTextChangedListener((TextWatcher)object2);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            bl2 = false;
            object = null;
        }
        if ((object8 = this.n) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
        }
        if ((object8 = this.o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            n7 = 0;
            object8 = null;
        }
        object2 = new Sz1$d(this, (EditText)object8, null);
        object.addTextChangedListener((TextWatcher)object2);
        object = new Bundle();
        n8 = (int)(this.B ? 1 : 0);
        object8 = "login_type";
        if (n8 != 0) {
            object2 = "mobile number";
            object.putString((String)object8, (String)object2);
        } else {
            object2 = "email address";
            object.putString((String)object8, (String)object2);
        }
        n8 = (int)(this.J ? 1 : 0);
        if (n8 != 0) {
            object2 = object.getString((String)object8);
            object5 = " - otp verify screen";
            object2 = Ft2.a((String)object2, (String)object5);
        } else {
            object2 = "login - otp screen";
        }
        this.Q = object2;
        object2 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object5 = this.Q;
        string2 = "screenName";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object5 = null;
        }
        ((GTMEvents)object2).pushOpenScreenEvent((String)object5, (Bundle)object);
        object4 = new Bundle();
        object2 = this.N;
        object5 = ((NewCustomEventsRevamp)object2).getSTEP();
        n3 = 2;
        object4.putInt((String)object5, n3);
        object2 = ((NewCustomEventsRevamp)object2).getLOGIN_TYPE();
        object = object.getString((String)object8);
        object4.putString((String)object2, (String)object);
        object = this.Q;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object7 = null;
        } else {
            object7 = object;
        }
        object6 = this.N;
        string4 = "user account screen";
        string5 = this.O;
        object3 = this.P;
        ((NewCustomEventsRevamp)object6).newPushCustomScreenView((String)object7, string4, string5, (Bundle)object4, (String)object3);
        object = z40_0.Companion;
        object2 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        object.getClass();
        object = z40$a.a((Context)object2).a;
        object2 = "enable_Signup_popup";
        bl2 = ((ao0_0)object).a((String)object2);
        if (bl2) {
            object = this.y;
            if (object != null) {
                n8 = R$color.white;
                object.F1(n8);
            }
            if ((object = this.y) != null) {
                object.v0(false);
            }
        }
    }
}

