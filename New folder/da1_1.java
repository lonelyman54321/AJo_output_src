/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputLayout;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.referral.RefereeEarnCash;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.utility.b;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from dA1
 */
public final class da1_1
extends M51
implements View.OnClickListener,
nr2_2 {
    public static final da1$a_0 Companion;
    public com.ril.ajio.login.activity.a A;
    public String B;
    public boolean C;
    public AjioTextView D;
    public Bundle E;
    public String F;
    public boolean G;
    public boolean H;
    public final NewEEcommerceEventsRevamp I;
    public final NewCustomEventsRevamp J;
    public final String K;
    public final String L;
    public EditText f;
    public TextInputLayout g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public dA1$b m;
    public AccountCheckResponse n;
    public QueryCustomer o;
    public oa1_1 p;
    public b q;
    public final hh3_2 r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        da1$a_0 da1$a_0;
        Companion = da1$a_0 = new Object();
    }

    public da1_1() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new tz1_1(this, 0);
        this.r = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.I = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.J = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.K = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.L = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean Pa(boolean bl2) {
        int n3 = 1;
        int n4 = 0;
        String string2 = null;
        Object object = z40_0.Companion;
        Application application = this.requireActivity().getApplication();
        String string3 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string3);
        object.getClass();
        object = z40$a.a((Context)application).a;
        String string4 = "referral_feature_enable";
        int n7 = ((ao0_0)object).a(string4);
        if (n7 == 0) return 0 != 0;
        object = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object, string3);
        object = z40$a.a((Context)object).a;
        String string5 = "referee_enable";
        n7 = ((ao0_0)object).a(string5);
        if (n7 == 0) return 0 != 0;
        object = bv1_0.a;
        if (object == null) return 0 != 0;
        n7 = ((String)object).length();
        if (n7 == 0) return 0 != 0;
        if (bl2) {
            float f5;
            float f6;
            Object object2 = bv1_0.b;
            if (object2 != null && (bl2 = ((String)object2).length())) {
                object2 = this.l;
                if (object2 != null) {
                    n7 = R$string.invited_you;
                    Object[] objectArray = new Object[n3];
                    string3 = bv1_0.b;
                    objectArray[0] = string3;
                    string2 = hv3_0.L(n7, objectArray);
                    object2.setText((CharSequence)string2);
                }
            } else {
                object2 = this.l;
                if (object2 != null) {
                    n4 = R$string.invited_you_friend;
                    string2 = hv3_0.K(n4);
                    object2.setText((CharSequence)string2);
                }
            }
            object2 = bv1_0.c;
            n4 = 0;
            string2 = null;
            if (object2 != null) {
                f6 = ((RefereeEarnCash)object2).getAmount();
            } else {
                bl2 = false;
                f6 = 0.0f;
                object2 = null;
            }
            bl2 = (f5 = f6 - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
            if (!bl2) {
                object2 = this.p;
                if (object2 == null) return n3 != 0;
                ((oa1_1)object2).i();
                return n3 != 0;
            } else {
                this.Va();
            }
            return n3 != 0;
        } else {
            void var6_13;
            float f7;
            Object object3 = this.D;
            object = "referralCashInfoTV";
            Object var6_10 = null;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object3 = null;
                f7 = 0.0f;
            }
            int n8 = R$string.referral_only_new_users;
            string3 = hv3_0.K(n8);
            object3.setText((CharSequence)string3);
            object3 = this.D;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                bl2 = false;
                object3 = null;
                f7 = 0.0f;
            }
            object3.setVisibility(0);
            bv1_0.a = null;
            bv1_0.b = null;
            bv1_0.c = null;
            bv1_0.d = false;
            bv1_0.h = n3;
            object3 = bv1_0.e;
            String string6 = "used referal - custom";
            bl2 = kotlin.text.b.i((String)object3, string6, false);
            if (bl2) {
                String string7 = "User Already existing - custom";
            } else {
                object3 = bv1_0.e;
                string6 = "used referal - auto filled";
                bl2 = kotlin.text.b.i((String)object3, string6, false);
                if (bl2) {
                    String string8 = "User Already existing - auto filled";
                }
            }
            bv1_0.e = var6_13;
            return 0 != 0;
        }
    }

    public final void Qa() {
        Object object = this.A;
        if (object != null) {
            object.startLoader();
        }
        object = new QueryCustomer();
        Object object2 = this.s;
        ((QueryCustomer)object).setMobileNumber((String)object2);
        ((QueryCustomer)object).setMobileNumberEnterered(true);
        object2 = this.p;
        Intrinsics.checkNotNull(object2);
        ((oa1_1)object2).b((QueryCustomer)object, "signup - otp screen");
    }

    public final jo_2 Ra() {
        return (jo_2)this.r.getValue();
    }

    public final void Sa() {
        dA1$b dA1$b;
        boolean bl2;
        Object object = this.m;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.cancel();
            bl2 = false;
            object = null;
            this.m = null;
        }
        object = z40_0.Companion;
        Object object2 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
        ((Object)object).getClass();
        long l2 = z40$a.a((Context)object2).a.h("login_signup_otp_timer");
        int n3 = 1000;
        long l3 = n3;
        this.m = dA1$b = new dA1$b(this, l2 *= l3);
        dA1$b.start();
        object = this.i;
        Intrinsics.checkNotNull(object);
        object.setVisibility(0);
        object = this.j;
        Intrinsics.checkNotNull(object);
        object.setEnabled(false);
        object = this.j;
        Intrinsics.checkNotNull(object);
        int n4 = 0x3F000000;
        float f5 = 0.5f;
        object.setAlpha(f5);
        object = this.f;
        Intrinsics.checkNotNull(object);
        object2 = "";
        object.setText((CharSequence)object2);
        object = this.f;
        Intrinsics.checkNotNull(object);
        bl2 = object.hasFocus();
        if (bl2) {
            object = this.g;
            if (object != null) {
                n4 = R$string.login_otp_hint;
                object2 = hv3_0.K(n4);
                ((TextInputLayout)((Object)object)).setHint((CharSequence)object2);
            }
        } else {
            object = this.g;
            if (object != null) {
                n4 = R$string.otp_detecting;
                object2 = hv3_0.K(n4);
                ((TextInputLayout)((Object)object)).setHint((CharSequence)object2);
            }
        }
    }

    public final void Ta(String object, String object2, String string2, boolean bl2, boolean bl3, boolean bl4) {
        Object object3 = this.A;
        if (object3 != null) {
            object3.startLoader();
        }
        object3 = new QueryCustomer();
        boolean bl5 = this.v;
        Object object4 = "";
        boolean bl6 = true;
        if (bl5) {
            object = this.u;
            String string3 = "SIGIN_SOURCE_FACEBOOK";
            int n3 = kotlin.text.b.i((String)object, string3, bl6);
            if (n3 != 0) {
                object = this.Ra().g();
                if (object != null && (n3 = ((String)object).length()) != 0) {
                    object = this.Ra();
                    object2 = ((jo_2)object).g();
                }
                object = this.Ra();
                string3 = "FACEBOOK_PROFILE_ACCESS_TOKEN";
                object4 = ((sw_0)object).getPreference(string3, (String)object4);
                String string4 = object2;
                object2 = "facebook";
                object = object4;
                object4 = string4;
            } else {
                object = this.u;
                object2 = "SIGIN_SOURCE_GOOGLE";
                n3 = (int)(kotlin.text.b.i((String)object, (String)object2, bl6) ? 1 : 0);
                if (n3 != 0) {
                    object = this.Ra().getPreference("GOOGLE_PROFILE_EMAIL", (String)object4);
                    object2 = this.Ra();
                    string3 = "GOOGLE_PROFILE_ACCESS_TOKEN";
                    object4 = ((sw_0)object2).getPreference(string3, (String)object4);
                    object2 = "google";
                    String string5 = object4;
                    object4 = object;
                    object = string5;
                } else {
                    object = object4;
                    object2 = object4;
                }
            }
            ((QueryCustomer)object3).setLogin((String)object4);
            string3 = this.Ra().h();
            if (string3 != null && (bl3 = string3.length())) {
                string3 = this.Ra().h();
                ((QueryCustomer)object3).setProfileId(string3);
            }
            ((QueryCustomer)object3).setToken((String)object);
            ((QueryCustomer)object3).setLoginvia((String)object2);
            object4 = "social login - otp screen";
        } else {
            bl5 = false;
            if (bl3) {
                bl3 = this.z;
                if (bl3) {
                    ((QueryCustomer)object3).setMobileNumber((String)object);
                    ((QueryCustomer)object3).setMobileNumberEnterered(bl6);
                } else {
                    ((QueryCustomer)object3).setEmail((String)object2);
                    ((QueryCustomer)object3).setMobileNumberEnterered(false);
                }
            } else {
                bl3 = this.z;
                if (bl3) {
                    ((QueryCustomer)object3).setMobileNumber((String)object);
                    ((QueryCustomer)object3).setMobileNumberEnterered(bl6);
                } else {
                    boolean bl7;
                    if (object2 != null && !(bl7 = TextUtils.isEmpty((CharSequence)object2))) {
                        object = ((String)object2).toLowerCase();
                        String string6 = "toLowerCase(...)";
                        Intrinsics.checkNotNullExpressionValue(object, string6);
                        ((QueryCustomer)object3).setEmail((String)object);
                    }
                    ((QueryCustomer)object3).setMobileNumberEnterered(false);
                }
                object = "manual";
                ((QueryCustomer)object3).setLoginvia((String)object);
                ((QueryCustomer)object3).setLogin((String)object2);
                object4 = "login - otp screen";
            }
        }
        ((QueryCustomer)object3).setOtp(string2);
        if (bl4) {
            object4 = "signup - otp screen";
        }
        ((QueryCustomer)object3).setRegistration(bl4);
        object = this.p;
        Intrinsics.checkNotNull(object);
        ((oa1_1)object).A = bl2;
        object = this.Ra().a();
        ((QueryCustomer)object3).setAdId((String)object);
        object = this.p;
        Intrinsics.checkNotNull(object);
        ((oa1_1)object).l((QueryCustomer)object3, (String)object4);
    }

    public final void Ua() {
        TextView textView = this.j;
        Intrinsics.checkNotNull(textView);
        textView.setEnabled(true);
        textView = this.j;
        Intrinsics.checkNotNull(textView);
        textView.setAlpha(1.0f);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Va() {
        Object object;
        String string2;
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        block9: {
            Exception exception2;
            String string3;
            float f5;
            String string4;
            int n3;
            block8: {
                float f6;
                Object[] objectArray;
                Object[] objectArray2;
                block7: {
                    block6: {
                        n3 = 1;
                        string4 = "format(...)";
                        ajioTextView2 = this.D;
                        ajioTextView = null;
                        string2 = "referralCashInfoTV";
                        if (ajioTextView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            ajioTextView2 = null;
                        }
                        f5 = 0.0f;
                        string3 = null;
                        try {
                            object = StringCompanionObject.INSTANCE;
                            object = z40_0.Companion;
                            objectArray2 = this.requireActivity();
                            objectArray2 = objectArray2.getApplication();
                            objectArray = "getApplication(...)";
                            Intrinsics.checkNotNullExpressionValue(objectArray2, (String)objectArray);
                            object.getClass();
                            object = z40$a.a((Context)objectArray2);
                            object = ((z40_0)object).a;
                            objectArray2 = "referral_signup_msg";
                            object = ((ao0_0)object).b((String)objectArray2);
                            objectArray2 = bv1_0.c;
                            if (objectArray2 == null) break block6;
                            f6 = objectArray2.getAmount();
                            break block7;
                        }
                        catch (Exception exception2) {
                            break block8;
                        }
                    }
                    f6 = 0.0f;
                    objectArray2 = null;
                }
                objectArray2 = Float.valueOf(f6);
                objectArray2 = qz2_0.x((Float)objectArray2);
                objectArray = new Object[n3];
                objectArray[0] = objectArray2;
                objectArray2 = Arrays.copyOf(objectArray, n3);
                object = String.format((String)object, objectArray2);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                break block9;
            }
            yn3$a yn3$a = yn3_0.a;
            yn3$a.e(exception2);
            object = StringCompanionObject.INSTANCE;
            object = bv1_0.c;
            if (object != null) {
                f5 = ((RefereeEarnCash)object).getAmount();
            }
            string3 = qz2_0.x(Float.valueOf(f5));
            object = new Object[n3];
            object[0] = string3;
            string3 = "Signup to get %s AJIO Cash";
            object = xh2_0.a((Object[])object, n3, string3, string4);
        }
        ajioTextView2.setText((CharSequence)object);
        AjioTextView ajioTextView3 = this.D;
        if (ajioTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            ajioTextView = ajioTextView3;
        }
        ajioTextView.setVisibility(0);
    }

    public final void Wa() {
        block41: {
            String string2;
            int n3;
            int n4;
            String string3;
            String string4;
            int n7;
            int n8;
            Object object;
            int n10;
            Object object2;
            int n14;
            Object object3;
            block39: {
                Object object4;
                block40: {
                    int n15;
                    da1_1 da1_12;
                    block43: {
                        block42: {
                            object3 = this.f;
                            Intrinsics.checkNotNull(object3);
                            object3 = object3.getText();
                            n14 = 32;
                            int n16 = 0;
                            object2 = null;
                            n10 = 0;
                            object = null;
                            n8 = 1;
                            if (object3 != null && (object3 = object3.toString()) != null) {
                                n7 = ((String)object3).length() - n8;
                                int n17 = 0;
                                string4 = null;
                                boolean bl2 = false;
                                string3 = null;
                                while (n17 <= n7) {
                                    n4 = !bl2 ? n17 : n7;
                                    n4 = Intrinsics.compare(((String)object3).charAt(n4), n14);
                                    n4 = n4 <= 0 ? 1 : 0;
                                    if (!bl2) {
                                        if (n4 == 0) {
                                            bl2 = true;
                                            continue;
                                        }
                                        ++n17;
                                        continue;
                                    }
                                    if (n4 == 0) break;
                                    n7 += -1;
                                }
                                object3 = com.jio.jioads.adinterfaces.a.a(n7, n8, n17, (String)object3);
                            } else {
                                n3 = 0;
                                object3 = null;
                            }
                            n3 = TextUtils.isEmpty((CharSequence)object3);
                            if (n3 != 0) break block39;
                            n3 = this.v;
                            if (n3 != 0 || (n7 = (int)(this.x ? 1 : 0)) != 0) break block40;
                            n3 = this.y;
                            if (n3 == 0 && (n3 = this.w) == 0) break block41;
                            string4 = this.s;
                            string3 = this.t;
                            object3 = this.f;
                            Intrinsics.checkNotNull(object3);
                            object3 = object3.getText();
                            if (object3 == null || (object3 = object3.toString()) == null) break block42;
                            n16 = ((String)object3).length() - n8;
                            n7 = 0;
                            da1_12 = null;
                            n4 = 0;
                            while (n7 <= n16) {
                                n15 = n4 == 0 ? n7 : n16;
                                n15 = Intrinsics.compare(((String)object3).charAt(n15), n14);
                                n15 = n15 <= 0 ? 1 : 0;
                                if (n4 == 0) {
                                    if (n15 == 0) {
                                        n4 = 1;
                                        continue;
                                    }
                                    ++n7;
                                    continue;
                                }
                                if (n15 == 0) break;
                                n16 += -1;
                            }
                            if ((object3 = com.jio.jioads.adinterfaces.a.a(n16, n8, n7, (String)object3)) != null) break block43;
                        }
                        object3 = "";
                    }
                    boolean bl3 = this.w;
                    boolean bl4 = false;
                    n15 = 0;
                    da1_12 = this;
                    this.Ta(string4, string3, (String)object3, false, bl3, false);
                    break block41;
                }
                n14 = (int)(this.x ? 1 : 0);
                object = this.A;
                if (object != null) {
                    object.startLoader();
                }
                if ((object = this.o) != null) {
                    object4 = "AUTHUSER";
                    ((QueryCustomer)object).setRequestMode((String)object4);
                }
                if ((object = this.o) != null) {
                    object4 = this.f;
                    Intrinsics.checkNotNull(object4);
                    object4 = object4.getText();
                    if (object4 != null) {
                        object4 = object4.toString();
                    } else {
                        n8 = 0;
                        object4 = null;
                    }
                    ((QueryCustomer)object).setOtp((String)object4);
                }
                if ((object = this.o) != null) {
                    if (n14 != 0) {
                        object = hv3_0.a;
                        object.getClass();
                        n10 = hv3_0.s();
                        if (n10 != 0) {
                            object3 = this.p;
                            if (object3 != null) {
                                QueryCustomer queryCustomer = this.o;
                                Intrinsics.checkNotNull(queryCustomer);
                                Intrinsics.checkNotNullParameter(queryCustomer, "queryCustomer");
                                Intrinsics.checkNotNullParameter("signup - otp screen", "screenName");
                                object = md3_0.c((jD3)object3);
                                object4 = new ra1_2((oa1_1)object3, queryCustomer, null);
                                n3 = 3;
                                Ae3.d((i90_0)object, null, null, (Function2)object4, n3);
                            }
                        } else {
                            object2 = this.p;
                            if (object2 != null) {
                                object = this.o;
                                Intrinsics.checkNotNull(object);
                                ((oa1_1)object2).m((QueryCustomer)object, n14 != 0, n3 != 0);
                            }
                        }
                    } else {
                        object2 = this.p;
                        if (object2 != null) {
                            Intrinsics.checkNotNull(object);
                            ((oa1_1)object2).m((QueryCustomer)object, n14 != 0, n3 != 0);
                        }
                    }
                }
                break block41;
            }
            object3 = this.k;
            if (object3 != null) {
                object3.setVisibility(0);
            }
            if ((object3 = this.k) != null) {
                ai0_2.a((View)object3);
            }
            if ((object3 = this.k) != null) {
                n7 = R$string.otp_invalid;
                string2 = hv3_0.K(n7);
                object3.setText((CharSequence)string2);
            }
            n3 = this.y;
            string2 = "gaScreenName";
            string4 = "Error - ";
            if (n3 != 0) {
                object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                string3 = this.l;
                Intrinsics.checkNotNull(string3);
                string3 = ((Object)string3.getText()).toString();
                n4 = string3.length() - n8;
                int n18 = 0;
                boolean bl5 = false;
                while (n18 <= n4) {
                    int n19 = !bl5 ? n18 : n4;
                    n19 = Intrinsics.compare(string3.charAt(n19), n14);
                    n19 = n19 <= 0 ? 1 : 0;
                    if (!bl5) {
                        if (n19 == 0) {
                            bl5 = true;
                            continue;
                        }
                        ++n18;
                        continue;
                    }
                    if (n19 == 0) break;
                    n4 += -1;
                }
                String string5 = com.jio.jioads.adinterfaces.a.a(n4, n8, n18, string3);
                n10 = R$string.otp_invalid;
                object = hv3_0.K(n10);
                object = kp1_0.c(string4, (String)object);
                String string6 = this.F;
                if (string6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = string6;
                }
                ((GTMEvents)object3).pushButtonTapEvent(string5, object, (String)object2);
            } else {
                object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
                n14 = R$string.otp_invalid;
                String string7 = hv3_0.K(n14);
                string7 = kp1_0.c(string4, string7);
                object = this.F;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object;
                }
                object = "Glad your're back";
                ((GTMEvents)object3).pushButtonTapEvent((String)object, string7, (String)object2);
            }
        }
    }

    public final void c8(String object) {
        String string2 = "otpValue";
        Intrinsics.checkNotNullParameter(object, string2);
        int bl2 = object.length();
        if (bl2 != 0) {
            string2 = this.f;
            Intrinsics.checkNotNull(string2);
            string2.setText((CharSequence)object);
            object = this.g;
            if (object != null) {
                int n3 = R$string.login_otp_hint;
                string2 = hv3_0.K(n3);
                ((TextInputLayout)((Object)object)).setHint(string2);
            }
            object = this.h;
            Intrinsics.checkNotNull(object);
            boolean bl3 = true;
            object.setEnabled(bl3);
        }
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.p;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).o;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        Object object2 = new uz1_1(this);
        ((LiveData)object).e(mu1_12, (F62)object2);
        object = this.p;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).l;
        mu1_12 = this.getViewLifecycleOwner();
        object2 = new Vz1(this);
        ((LiveData)object).e(mu1_12, (F62)object2);
        object = this.p;
        if (object != null && (object = ((oa1_1)object).n) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object2 = new wz1_1(this);
            ((LiveData)object).e(mu1_12, (F62)object2);
        }
        object = this.p;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).k;
        mu1_12 = this.getViewLifecycleOwner();
        object2 = new xz1_0(this);
        ((LiveData)object).e(mu1_12, (F62)object2);
        object = this.p;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).m;
        mu1_12 = this.getViewLifecycleOwner();
        object2 = new yz1_0(this);
        ((LiveData)object).e(mu1_12, (F62)object2);
        object = this.p;
        if (object != null && (object = ((oa1_1)object).u) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object2 = new zz1_0(this, 0);
            dA1$c dA1$c = new dA1$c((zz1_0)object2);
            ((LiveData)object).e(mu1_12, dA1$c);
        }
        if ((object = this.p) != null && (object = ((oa1_1)object).N) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            object2 = new aa1_0(this);
            ((LiveData)object).e(mu1_12, (F62)object2);
        }
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof com.ril.ajio.login.activity.a;
        if (bl2) {
            object = (com.ril.ajio.login.activity.a)object;
            this.A = object;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        block54: {
            block56: {
                block55: {
                    block53: {
                        var2_2 = this;
                        var3_3 /* !! */  = var1_1;
                        Intrinsics.checkNotNullParameter(var1_1, "view");
                        var4_4 /* !! */  = this.getActivity();
                        hv3_0.S((Activity)var4_4 /* !! */ );
                        var5_5 = var1_1.getId();
                        var6_6 = R$id.login_otp_start_shopping_tv;
                        if (var5_5 != var6_6) break block53;
                        var4_4 /* !! */  = bv1_0.a;
                        var4_4 /* !! */  = var4_4 /* !! */  != null && (var5_5 = var4_4 /* !! */ .length()) != 0 ? bv1_0.a : "No code";
                        var6_6 = (int)var2_2.v;
                        if (var6_6 != 0) {
                            var3_3 /* !! */  = var2_2.B;
                            var7_7 = " - ";
                            var4_4 /* !! */  = n1.a((String)var3_3 /* !! */ , var7_7, (String)var4_4 /* !! */ );
lbl16:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var3_3 /* !! */  = "OTP - ";
                        var4_4 /* !! */  = kp1_0.c((String)var3_3 /* !! */ , (String)var4_4 /* !! */ );
                        ** while (true)
                        var8_9 = var4_4 /* !! */ ;
                        var9_12 = var2_2.J;
                        var10_13 = "user accounts interactions";
                        var11_15 = "Sign up success";
                        var12_17 = "user_account_interactions";
                        var13_20 = "signup - otp screen";
                        var14_22 = "";
                        var15_23 = var2_2.K;
                        var4_4 /* !! */  = var2_2.L;
                        var16_24 = 1536;
                        NewCustomEventsRevamp.newPushCustomEvent$default(var9_12, var10_13, var11_15, (String)var8_9, var12_17, var13_20, var14_22, var15_23, null, (String)var4_4 /* !! */ , false, null, var16_24, null);
                        this.Wa();
                        break block54;
                    }
                    var6_6 = R$id.login_otp_resend_otp_tv;
                    var7_8 = "";
                    var17_25 = 4;
                    var18_26 = 1;
                    var19_27 = "Glad your're back";
                    var20_28 = "gaScreenName";
                    var21_29 = 32;
                    var22_30 = false;
                    var10_14 = null;
                    var23_31 = false;
                    var11_16 = null;
                    if (var5_5 != var6_6) break block55;
                    var4_4 /* !! */  = this.m;
                    if (var4_4 /* !! */  != null) {
                        Intrinsics.checkNotNull(var4_4 /* !! */ );
                        var4_4 /* !! */ .cancel();
                        this.m = null;
                    }
                    var4_4 /* !! */  = var2_2.k;
                    Intrinsics.checkNotNull(var4_4 /* !! */ );
                    var4_4 /* !! */ .setVisibility(var17_25);
                    var4_4 /* !! */ .setText((CharSequence)var7_8);
                    var5_5 = (int)var2_2.y;
                    var3_3 /* !! */  = "Resent OTP";
                    if (var5_5 != 0) {
                        var4_4 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var7_8 = var2_2.l;
                        Intrinsics.checkNotNull(var7_8);
                        var7_8 = var7_8.getText().toString();
                        var17_25 = var7_8.length() - var18_26;
                        var24_32 = 0;
                        var19_27 = null;
                        var25_35 = false;
                        var8_10 = null;
                        while (var24_32 <= var17_25) {
                            var26_37 = var25_35 == false ? var24_32 : var17_25;
                            if ((var26_37 = Intrinsics.compare(var7_8.charAt(var26_37), var21_29)) <= 0) {
                                var26_37 = 1;
                            } else {
                                var26_37 = 0;
                                var12_18 = null;
                            }
                            if (!var25_35) {
                                if (var26_37 == 0) {
                                    var25_35 = true;
                                    continue;
                                }
                                ++var24_32;
                                continue;
                            }
                            if (var26_37 == 0) break;
                            var17_25 += -1;
                        }
                        var7_8 = com.jio.jioads.adinterfaces.a.a(var17_25, var18_26, var24_32, (String)var7_8);
                        var27_39 = var2_2.F;
                        if (var27_39 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var20_28);
                            var17_25 = 0;
                            var27_39 = null;
                        }
                        var4_4 /* !! */ .pushButtonTapEvent((String)var7_8, var3_3 /* !! */ , var27_39);
                    } else {
                        var4_4 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        var7_8 = var2_2.F;
                        if (var7_8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(var20_28);
                            var28_42 = false;
                            var7_8 = null;
                        }
                        var4_4 /* !! */ .pushButtonTapEvent(var19_27, var3_3 /* !! */ , (String)var7_8);
                    }
                    var4_4 /* !! */  = var2_2.q;
                    if (var4_4 /* !! */  != null) {
                        var4_4 /* !! */ .b(var2_2);
                    }
                    var5_5 = (int)var2_2.x;
                    var3_3 /* !! */  = "SENDOTP";
                    if (var5_5 == 0 && (var5_5 = (int)var2_2.v) == 0) {
                        hv3_0.S(this.getActivity());
                        var4_4 /* !! */  = var2_2.A;
                        if (var4_4 /* !! */  != null) {
                            var4_4 /* !! */ .startLoader();
                        }
                        var4_4 /* !! */  = new QueryCustomer();
                        var28_42 = var2_2.z;
                        if (var28_42) {
                            var7_8 = var2_2.t;
                            var4_4 /* !! */ .setMobileNumber((String)var7_8);
                            var4_4 /* !! */ .setMobileNumberEnterered((boolean)var18_26);
                        } else {
                            var4_4 /* !! */ .setMobileNumberEnterered(false);
                            var7_8 = var2_2.t;
                            if (var7_8 != null && !(var28_42 = TextUtils.isEmpty((CharSequence)var7_8))) {
                                var7_8 = var2_2.t;
                                if (var7_8 != null) {
                                    var10_14 = var7_8.toLowerCase();
                                    var7_8 = "toLowerCase(...)";
                                    Intrinsics.checkNotNullExpressionValue(var10_14, (String)var7_8);
                                }
                                var4_4 /* !! */ .setEmail(var10_14);
                            }
                        }
                        var4_4 /* !! */ .setRequestMode((String)var3_3 /* !! */ );
                        var3_3 /* !! */  = var2_2.p;
                        Intrinsics.checkNotNull(var3_3 /* !! */ );
                        var7_8 = "login - otp screen";
                        var3_3 /* !! */ .k((QueryCustomer)var4_4 /* !! */ , (String)var7_8);
                    } else {
                        hv3_0.S(this.getActivity());
                        var4_4 /* !! */  = var2_2.A;
                        if (var4_4 /* !! */  != null) {
                            var4_4 /* !! */ .startLoader();
                        }
                        if ((var4_4 /* !! */  = var2_2.o) != null) {
                            var4_4 /* !! */ .setRequestMode((String)var3_3 /* !! */ );
                        }
                        if ((var4_4 /* !! */  = var2_2.o) != null) {
                            var4_4 /* !! */  = var2_2.p;
                            Intrinsics.checkNotNull(var4_4 /* !! */ );
                            var3_3 /* !! */  = var2_2.o;
                            Intrinsics.checkNotNull(var3_3 /* !! */ );
                            var28_42 = var2_2.v;
                            if (!var28_42 && (var28_42 = var2_2.x)) {
                                var7_8 = hv3_0.a;
                                var7_8.getClass();
                                var23_31 = hv3_0.s();
                            }
                            var7_8 = "signup - otp screen";
                            var4_4 /* !! */ .o((QueryCustomer)var3_3 /* !! */ , (String)var7_8, var23_31);
                        }
                    }
                    break block54;
                }
                var6_6 = R$id.login_otp_new_password_tv;
                if (var5_5 != var6_6) break block54;
                var4_4 /* !! */  = this.f;
                Intrinsics.checkNotNull(var4_4 /* !! */ );
                var4_4 /* !! */  = var4_4 /* !! */ .getText();
                if (var4_4 /* !! */  != null && (var4_4 /* !! */  = var4_4 /* !! */ .toString()) != null) {
                    var6_6 = var4_4 /* !! */ .length() - var18_26;
                    var25_36 = 0;
                    var8_11 = null;
                    var26_38 = 0;
                    var12_19 = null;
                    while (var25_36 <= var6_6) {
                        var29_44 = var26_38 == 0 ? var25_36 : var6_6;
                        if ((var29_44 = Intrinsics.compare(var4_4 /* !! */ .charAt(var29_44), var21_29)) <= 0) {
                            var29_44 = 1;
                        } else {
                            var29_44 = 0;
                            var13_21 = null;
                        }
                        if (var26_38 == 0) {
                            if (var29_44 == 0) {
                                var26_38 = 1;
                                continue;
                            }
                            ++var25_36;
                            continue;
                        }
                        if (var29_44 == 0) break;
                        var6_6 += -1;
                    }
                    var4_4 /* !! */  = com.jio.jioads.adinterfaces.a.a(var6_6, var18_26, var25_36, (String)var4_4 /* !! */ );
                } else {
                    var5_5 = 0;
                    var4_4 /* !! */  = null;
                }
                var5_5 = (int)TextUtils.isEmpty((CharSequence)var4_4 /* !! */ );
                if (var5_5 != 0) break block56;
                var4_4 /* !! */  = var2_2.k;
                if (var4_4 /* !! */  != null) {
                    var4_4 /* !! */ .setVisibility(var17_25);
                }
                var3_3 /* !! */  = var2_2.s;
                var27_40 = var2_2.t;
                var4_4 /* !! */  = var2_2.f;
                Intrinsics.checkNotNull(var4_4 /* !! */ );
                var4_4 /* !! */  = var4_4 /* !! */ .getText();
                if (var4_4 /* !! */  == null || (var4_4 /* !! */  = var4_4 /* !! */ .toString()) == null) ** GOTO lbl-1000
                var24_33 = var4_4 /* !! */ .length() - var18_26;
                var30_45 = 0;
                var20_28 = null;
                var22_30 = false;
                var10_14 = null;
                while (var30_45 <= var24_33) {
                    var25_36 = var22_30 == false ? var30_45 : var24_33;
                    if ((var25_36 = Intrinsics.compare(var4_4 /* !! */ .charAt(var25_36), var21_29)) <= 0) {
                        var25_36 = 1;
                    } else {
                        var25_36 = 0;
                        var8_11 = null;
                    }
                    if (!var22_30) {
                        if (var25_36 == 0) {
                            var22_30 = true;
                            continue;
                        }
                        ++var30_45;
                        continue;
                    }
                    if (var25_36 == 0) break;
                    var24_33 += -1;
                }
                if ((var4_4 /* !! */  = com.jio.jioads.adinterfaces.a.a(var24_33, var18_26, var30_45, (String)var4_4 /* !! */ )) != null) {
                    var31_46 = var4_4 /* !! */ ;
                } else lbl-1000:
                // 2 sources

                {
                    var31_46 = var7_8;
                }
                var24_33 = var2_2.w;
                var30_45 = 0;
                var20_28 = null;
                var21_29 = 1;
                var4_4 /* !! */  = this;
                var7_8 = var27_40;
                var27_40 = var31_46;
                var18_26 = var21_29;
                this.Ta((String)var3_3 /* !! */ , (String)var7_8, (String)var31_46, (boolean)var21_29, (boolean)var24_33, false);
                break block54;
            }
            var4_4 /* !! */  = var2_2.k;
            if (var4_4 /* !! */  != null) {
                var4_4 /* !! */ .setVisibility(0);
            }
            if ((var4_4 /* !! */  = var2_2.k) != null) {
                ai0_2.a((View)var4_4 /* !! */ );
            }
            if ((var4_4 /* !! */  = var2_2.k) != null) {
                var6_6 = R$string.otp_invalid;
                var3_3 /* !! */  = hv3_0.K(var6_6);
                var4_4 /* !! */ .setText((CharSequence)var3_3 /* !! */ );
            }
            var5_5 = (int)var2_2.y;
            var3_3 /* !! */  = "Error - ";
            if (var5_5 != 0) {
                var4_4 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var7_8 = var2_2.l;
                Intrinsics.checkNotNull(var7_8);
                var7_8 = var7_8.getText().toString();
                var17_25 = var7_8.length() - var18_26;
                var24_34 = 0;
                var19_27 = null;
                var25_36 = 0;
                var8_11 = null;
                while (var24_34 <= var17_25) {
                    var26_38 = var25_36 == 0 ? var24_34 : var17_25;
                    if ((var26_38 = Intrinsics.compare(var7_8.charAt(var26_38), var21_29)) <= 0) {
                        var26_38 = 1;
                    } else {
                        var26_38 = 0;
                        var12_19 = null;
                    }
                    if (var25_36 == 0) {
                        if (var26_38 == 0) {
                            var25_36 = 1;
                            continue;
                        }
                        ++var24_34;
                        continue;
                    }
                    if (var26_38 == 0) break;
                    var17_25 += -1;
                }
                var7_8 = com.jio.jioads.adinterfaces.a.a(var17_25, var18_26, var24_34, (String)var7_8);
                var17_25 = R$string.otp_invalid;
                var27_41 = hv3_0.K(var17_25);
                var3_3 /* !! */  = kp1_0.c((String)var3_3 /* !! */ , var27_41);
                var27_41 = var2_2.F;
                if (var27_41 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var20_28);
                } else {
                    var10_14 = var27_41;
                }
                var4_4 /* !! */ .pushButtonTapEvent((String)var7_8, var3_3 /* !! */ , var10_14);
            } else {
                var4_4 /* !! */  = AnalyticsManager.Companion.getInstance().getGtmEvents();
                var28_43 = R$string.otp_invalid;
                var7_8 = hv3_0.K(var28_43);
                var3_3 /* !! */  = kp1_0.c((String)var3_3 /* !! */ , (String)var7_8);
                var7_8 = var2_2.F;
                if (var7_8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(var20_28);
                } else {
                    var10_14 = var7_8;
                }
                var4_4 /* !! */ .pushButtonTapEvent(var19_27, var3_3 /* !! */ , var10_14);
            }
        }
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        String string2;
        Object object2;
        int n3;
        Object object3;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        Object object4 = "login - otp screen";
        Object object5 = null;
        if (object != null) {
            int n4;
            boolean bl3;
            int n7;
            String string3;
            int n8;
            int n10;
            int n14;
            object3 = "param1";
            object = object.getBundle((String)object3);
            n3 = 1;
            if (object != null && (n14 = object.containsKey((String)(object2 = "QUERYCUSTOMER_DATA"))) == n3) {
                object2 = object.get((String)object2);
                string2 = "null cannot be cast to non-null type com.ril.ajio.services.query.QueryCustomer";
                Intrinsics.checkNotNull(object2, string2);
                this.o = object2 = (QueryCustomer)object2;
            }
            if (object != null && (n14 = object.containsKey((String)(object2 = "ISINPUTMOBILENUMBER"))) == n3) {
                n10 = (int)(object.getBoolean((String)object2) ? 1 : 0);
                this.z = n10;
            }
            if (object != null && (n14 = object.containsKey((String)(object2 = "ACCOUNTCHECK_RESPONSE"))) == n3) {
                object2 = object.get((String)object2);
                string2 = "null cannot be cast to non-null type com.ril.ajio.services.data.user.AccountCheckResponse";
                Intrinsics.checkNotNull(object2, string2);
                this.n = object2 = (AccountCheckResponse)object2;
            }
            if (object != null && (n14 = object.containsKey((String)(object2 = "ISFROMSOCIALLOGIN"))) == n3) {
                n10 = (int)(object.getBoolean((String)object2) ? 1 : 0);
                this.v = n10;
            }
            if (object != null && (n14 = object.containsKey((String)(object2 = "ISEXISTINGSOCIALLOGINUSER"))) == n3) {
                n10 = (int)(object.getBoolean((String)object2) ? 1 : 0);
                this.w = n10;
            }
            if (object != null && (n14 = object.containsKey((String)(object2 = "ISMANUALSIGNUP"))) == n3) {
                n10 = (int)(object.getBoolean((String)object2) ? 1 : 0);
                this.x = n10;
            }
            if (object != null && (n14 = object.containsKey((String)(object2 = "ISEXISTINGUSER"))) == n3) {
                n10 = (int)(object.getBoolean((String)object2) ? 1 : 0);
                this.y = n10;
            }
            n10 = 32;
            n14 = 0;
            string2 = null;
            if (object != null && (n8 = object.containsKey(string3 = "SIGIN_SOURCE")) == n3) {
                if ((string3 = object.getString(string3)) != null) {
                    n8 = string3.length() - n3;
                    n7 = 0;
                    bl3 = false;
                    while (n7 <= n8) {
                        n4 = !bl3 ? n7 : n8;
                        n4 = Intrinsics.compare(string3.charAt(n4), n10);
                        n4 = n4 <= 0 ? 1 : 0;
                        if (!bl3) {
                            if (n4 == 0) {
                                bl3 = true;
                                continue;
                            }
                            ++n7;
                            continue;
                        }
                        if (n4 == 0) break;
                        n8 += -1;
                    }
                    string3 = com.jio.jioads.adinterfaces.a.a(n8, n3, n7, string3);
                } else {
                    string3 = null;
                }
                this.u = string3;
            }
            if (object != null && (n8 = object.containsKey(string3 = "INPUT_MOBILE_EMAILID")) == n3) {
                if ((string3 = object.getString(string3)) != null) {
                    n8 = string3.length() - n3;
                    n7 = 0;
                    bl3 = false;
                    while (n7 <= n8) {
                        n4 = !bl3 ? n7 : n8;
                        n4 = Intrinsics.compare(string3.charAt(n4), n10);
                        n4 = n4 <= 0 ? 1 : 0;
                        if (!bl3) {
                            if (n4 == 0) {
                                bl3 = true;
                                continue;
                            }
                            ++n7;
                            continue;
                        }
                        if (n4 == 0) break;
                        n8 += -1;
                    }
                    object2 = com.jio.jioads.adinterfaces.a.a(n8, n3, n7, string3);
                } else {
                    n10 = 0;
                    object2 = null;
                }
                this.t = object2;
            }
            if (object != null && (n14 = object.containsKey(object2 = "LOGIN_VIA")) == n3) {
                this.B = object2 = object.getString((String)object2);
            }
            if (object != null && (n14 = object.containsKey((String)(object2 = "is_unrecognised_device"))) == n3) {
                this.C = bl2 = object.getBoolean((String)object2);
            }
            if (bl2 = this.v) {
                object = this.B;
                object3 = "social - ";
                object2 = " - otp screen";
                object = cP.a((String)object3, (String)object, (String)object2);
                this.F = object;
            } else {
                bl2 = this.x;
                if (bl2) {
                    object = "signup - otp screen";
                    this.F = object;
                } else {
                    this.F = object4;
                }
            }
        }
        if ((object = this.F) == null) {
            this.F = object4;
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
        string2 = "modelClass";
        object = rl3_0.b((rd3_0)object4, (E$b)object3, (Wd0)object, (Class)object2, string2);
        object4 = "<this>";
        object3 = sw0_0.a((Class)object2, (String)object4, (Class)object2, string2, string2);
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        object4 = object3.getQualifiedName();
        if (object4 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object4 = ((String)object2).concat((String)object4);
            this.p = object = (oa1_1)((pD3)object).a((yn1_2)object3, (String)object4);
            object = new Bundle();
            this.E = object;
            n3 = 3;
            object.putInt("Step_Number", n3);
            bl2 = this.z;
            object4 = "login_type";
            object3 = "eventBundle";
            if (bl2) {
                object = this.E;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object5 = object;
                }
                object = "mobile number";
                object5.putString((String)object4, (String)object);
            } else {
                object = this.E;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object5 = object;
                }
                object = "email address";
                object5.putString((String)object4, (String)object);
            }
            object = z40_0.Companion;
            object4 = this.requireActivity().getApplication();
            object5 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
            object.getClass();
            this.G = bl2 = z40$a.a((Context)object4).a.a("otp_popup_display_mobile");
            object = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object, (String)object5);
            this.H = bl2 = z40$a.a((Context)object).a.a("otp_popup_display_email");
            return;
        }
        object4 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object4);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_login_otp_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        b b2 = this.q;
        if (b2 != null && b2 != null) {
            b2.a();
        }
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.J;
        Object object2 = ((NewCustomEventsRevamp)object).getSTEP();
        Object object3 = this.E;
        String string2 = "eventBundle";
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object3 = null;
        }
        String string3 = "Step_Number";
        n3 = object3.getInt(string3);
        bundle.putInt((String)object2, n3);
        object = ((NewCustomEventsRevamp)object).getLOGIN_TYPE();
        object2 = this.E;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object2 = null;
        }
        object3 = "login_type";
        string3 = "";
        object2 = object2.getString((String)object3, string3);
        bundle.putString((String)object, (String)object2);
        object = this.F;
        String string4 = "gaScreenName";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            object2 = null;
        } else {
            object2 = object;
        }
        object = this.I;
        string3 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object = this.J;
        object3 = "user account screen";
        ((NewCustomEventsRevamp)object).newPushCustomScreenView((String)object2, (String)object3, string3, bundle, string5);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = this.F;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            object2 = null;
        }
        if ((object3 = this.E) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object4 = object3;
        }
        ((GTMEvents)object).pushOpenScreenEvent((String)object2, (Bundle)object4);
    }

    public final void onStop() {
        super.onStop();
        String string2 = this.F;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gaScreenName");
            string2 = null;
        }
        this.I.setPreviousScreenData(string2, "user account screen");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View view, Bundle bundle) {
        Object object;
        da1_1 da1_12;
        block65: {
            String string2;
            int n3;
            String string3;
            String string4;
            int n4;
            int n7;
            Object object2;
            int n8;
            int n10;
            Object object3;
            int n14;
            Object object4;
            int n15;
            block66: {
                int n16;
                TextView textView;
                Object object5;
                int n17;
                block61: {
                    block62: {
                        block64: {
                            void var26_46;
                            block63: {
                                da1_12 = this;
                                object = view;
                                n15 = 2;
                                Intrinsics.checkNotNullParameter(view, "view");
                                super.onViewCreated(view, bundle);
                                hv3_0.S(this.getActivity());
                                object4 = this.A;
                                Intrinsics.checkNotNull(object4);
                                n17 = 1;
                                object4.s0(n17 != 0);
                                object4 = this.A;
                                n14 = 0;
                                object3 = null;
                                if (object4 != null) {
                                    object4.v0(false);
                                }
                                object4 = com.ril.ajio.utility.b.Companion;
                                Context context = this.requireContext();
                                object5 = "requireContext(...)";
                                Intrinsics.checkNotNullExpressionValue(context, (String)object5);
                                da1_12.q = object4 = (b)((x63_0)object4).a(context);
                                if (object4 != null) {
                                    ((b)object4).b(da1_12);
                                }
                                int n18 = R$id.login_otp_header_tv;
                                object4 = (TextView)object.findViewById(n18);
                                da1_12.l = object4;
                                n18 = R$id.login_ajio_cash_info;
                                da1_12.D = object4 = (AjioTextView)object.findViewById(n18);
                                n18 = (int)(da1_12.v ? 1 : 0);
                                if (n18 == 0 && (n18 = (int)(da1_12.x ? 1 : 0)) == 0) {
                                    bv1_0.g = n17;
                                    da1_12.Pa(false);
                                    object4 = da1_12.l;
                                    Intrinsics.checkNotNull(object4);
                                    n10 = R$string.login_with_otp;
                                    String string5 = hv3_0.K(n10);
                                    object4.setText((CharSequence)string5);
                                } else {
                                    n18 = (int)(da1_12.Pa(n17 != 0) ? 1 : 0);
                                    if (n18 == 0) {
                                        object4 = da1_12.l;
                                        Intrinsics.checkNotNull(object4);
                                        n10 = R$string.login_join_ajio;
                                        String string6 = hv3_0.K(n10);
                                        object4.setText((CharSequence)string6);
                                    }
                                }
                                n18 = R$id.login_otp_send_desc_tv;
                                object4 = (TextView)object.findViewById(n18);
                                n10 = R$id.login_otp_like_to_set_tv;
                                textView = (TextView)object.findViewById(n10);
                                n16 = R$id.login_otp_new_password_tv;
                                object5 = (TextView)object.findViewById(n16);
                                object5.setOnClickListener((View.OnClickListener)da1_12);
                                n8 = R$id.login_otp_tiet;
                                object2 = (EditText)object.findViewById(n8);
                                da1_12.f = object2;
                                n8 = R$id.login_otp_til;
                                object2 = (TextInputLayout)object.findViewById(n8);
                                da1_12.g = object2;
                                n8 = R$id.login_otp_expires_in_tv;
                                object2 = (TextView)object.findViewById(n8);
                                da1_12.i = object2;
                                n8 = R$id.login_otp_resend_otp_tv;
                                object2 = (TextView)object.findViewById(n8);
                                da1_12.j = object2;
                                n8 = R$id.login_otp_start_shopping_tv;
                                object2 = (TextView)object.findViewById(n8);
                                da1_12.h = object2;
                                n8 = R$id.login_otp_error_tv;
                                object = (TextView)object.findViewById(n8);
                                da1_12.k = object;
                                object = da1_12.j;
                                Intrinsics.checkNotNull(object);
                                object.setOnClickListener((View.OnClickListener)da1_12);
                                object = da1_12.h;
                                Intrinsics.checkNotNull(object);
                                object.setOnClickListener((View.OnClickListener)da1_12);
                                this.Sa();
                                object = da1_12.o;
                                if (object != null) {
                                    object = ((QueryCustomer)object).getMobileNumber();
                                } else {
                                    n7 = 0;
                                    object = null;
                                }
                                da1_12.s = object;
                                n7 = da1_12.v;
                                n4 = 6;
                                string4 = "getMaskedEmailId(...)";
                                string3 = "getMaskedMobileNumber(...)";
                                n3 = 10;
                                string2 = "";
                                if (n7 != 0 || (n7 = da1_12.x) != 0) break block62;
                                n7 = da1_12.y;
                                if (n7 == 0 && (n7 = da1_12.w) == 0) break block61;
                                n7 = da1_12.H;
                                if (n7 == 0 || (n7 = (int)(da1_12.G ? 1 : 0)) == 0) break block63;
                                object = da1_12.n;
                                if (object != null) {
                                    object = ((AccountCheckResponse)object).getMaskedMobileNumber();
                                } else {
                                    n7 = 0;
                                    object = null;
                                }
                                if (object == null) break block61;
                                object = da1_12.n;
                                if (object != null) {
                                    object = ((AccountCheckResponse)object).getMaskedEmailId();
                                } else {
                                    n7 = 0;
                                    object = null;
                                }
                                if (object != null) {
                                    void var23_31;
                                    n7 = R$string.login_otp_send_desc;
                                    object2 = da1_12.n;
                                    if (object2 != null) {
                                        object2 = ((AccountCheckResponse)object2).getMaskedMobileNumber();
                                    } else {
                                        n8 = 0;
                                        object2 = null;
                                    }
                                    AccountCheckResponse accountCheckResponse = da1_12.n;
                                    if (accountCheckResponse != null) {
                                        String string7 = accountCheckResponse.getMaskedEmailId();
                                    } else {
                                        Object var23_30 = null;
                                    }
                                    Object object6 = new Object[n15];
                                    object6[0] = object2;
                                    object6[n17] = var23_31;
                                    object = hv3_0.L(n7, (Object[])object6);
                                    object2 = new SpannableStringBuilder((CharSequence)object);
                                    object6 = da1_12.n;
                                    Intrinsics.checkNotNull(object6);
                                    object6 = ((AccountCheckResponse)object6).getMaskedMobileNumber();
                                    Intrinsics.checkNotNullExpressionValue(object6, string3);
                                    int n19 = StringsKt.O((CharSequence)object, (String)object6, 0, false, n4);
                                    FragmentActivity fragmentActivity = this.getActivity();
                                    Typeface typeface = hv3_0.o(n3, (Context)fragmentActivity);
                                    AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, typeface);
                                    AccountCheckResponse accountCheckResponse2 = da1_12.n;
                                    Intrinsics.checkNotNull(accountCheckResponse2);
                                    n15 = accountCheckResponse2.getMaskedMobileNumber().length() + n19;
                                    object2.setSpan((Object)ajioCustomTypefaceSpan, n19, n15, 34);
                                    AccountCheckResponse accountCheckResponse3 = da1_12.n;
                                    Intrinsics.checkNotNull(accountCheckResponse3);
                                    String string8 = accountCheckResponse3.getMaskedEmailId();
                                    Intrinsics.checkNotNullExpressionValue(string8, string4);
                                    n7 = StringsKt.O((CharSequence)object, string8, 0, false, n4);
                                    FragmentActivity fragmentActivity2 = this.getActivity();
                                    Typeface typeface2 = hv3_0.o(n3, (Context)fragmentActivity2);
                                    AjioCustomTypefaceSpan ajioCustomTypefaceSpan2 = new AjioCustomTypefaceSpan(string2, typeface2);
                                    AccountCheckResponse accountCheckResponse4 = da1_12.n;
                                    Intrinsics.checkNotNull(accountCheckResponse4);
                                    String string9 = accountCheckResponse4.getMaskedEmailId();
                                    n17 = string9.length() + n7;
                                    n19 = 34;
                                    object2.setSpan((Object)ajioCustomTypefaceSpan2, n7, n17, n19);
                                    object4.setText((CharSequence)object2);
                                    n7 = (int)(da1_12.w ? 1 : 0);
                                    if (n7 == 0) {
                                        textView.setVisibility(0);
                                        object5.setVisibility(0);
                                        break block61;
                                    } else {
                                        n7 = 8;
                                        textView.setVisibility(n7);
                                        object5.setVisibility(n7);
                                    }
                                }
                                break block61;
                            }
                            object = da1_12.n;
                            if (object != null) {
                                object = ((AccountCheckResponse)object).getMaskedMobileNumber();
                            } else {
                                n7 = 0;
                                object = null;
                            }
                            if (object == null || (n7 = (int)(da1_12.G ? 1 : 0)) == 0) break block64;
                            n7 = R$string.sigup_otp_send_desc;
                            AccountCheckResponse accountCheckResponse = da1_12.n;
                            if (accountCheckResponse != null) {
                                String string10 = accountCheckResponse.getMaskedMobileNumber();
                            } else {
                                n15 = 0;
                                Object var26_47 = null;
                            }
                            n17 = 1;
                            object2 = new Object[n17];
                            object2[0] = var26_46;
                            object = hv3_0.L(n7, (Object[])object2);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                            AccountCheckResponse accountCheckResponse5 = da1_12.n;
                            Intrinsics.checkNotNull(accountCheckResponse5);
                            String string11 = accountCheckResponse5.getMaskedMobileNumber();
                            Intrinsics.checkNotNullExpressionValue(string11, string3);
                            n7 = StringsKt.O((CharSequence)object, string11, 0, false, n4);
                            object2 = this.getActivity();
                            object2 = hv3_0.o(n3, (Context)object2);
                            AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, (Typeface)object2);
                            object2 = da1_12.n;
                            Intrinsics.checkNotNull(object2);
                            object2 = ((AccountCheckResponse)object2).getMaskedMobileNumber();
                            n8 = ((String)object2).length() + n7;
                            int n20 = 34;
                            spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan, n7, n8, n20);
                            object4.setText((CharSequence)spannableStringBuilder);
                            n7 = (int)(da1_12.w ? 1 : 0);
                            if (n7 == 0) {
                                textView.setVisibility(0);
                                object5.setVisibility(0);
                                break block61;
                            } else {
                                n7 = 8;
                                textView.setVisibility(n7);
                                object5.setVisibility(n7);
                            }
                            break block61;
                        }
                        n7 = (int)(da1_12.H ? 1 : 0);
                        if (n7 == 0) break block61;
                        object = da1_12.n;
                        if (object != null) {
                            object = ((AccountCheckResponse)object).getMaskedEmailId();
                        } else {
                            n7 = 0;
                            object = null;
                        }
                        if (object != null) {
                            void var26_51;
                            n7 = R$string.sigup_otp_send_desc;
                            AccountCheckResponse accountCheckResponse = da1_12.n;
                            if (accountCheckResponse != null) {
                                String string12 = accountCheckResponse.getMaskedEmailId();
                            } else {
                                n15 = 0;
                                Object var26_52 = null;
                            }
                            n17 = 1;
                            object2 = new Object[n17];
                            object2[0] = var26_51;
                            object = hv3_0.L(n7, (Object[])object2);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                            AccountCheckResponse accountCheckResponse6 = da1_12.n;
                            Intrinsics.checkNotNull(accountCheckResponse6);
                            String string13 = accountCheckResponse6.getMaskedEmailId();
                            Intrinsics.checkNotNullExpressionValue(string13, string4);
                            n7 = StringsKt.O((CharSequence)object, string13, 0, false, n4);
                            object2 = this.getActivity();
                            object2 = hv3_0.o(n3, (Context)object2);
                            AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, (Typeface)object2);
                            object2 = da1_12.n;
                            Intrinsics.checkNotNull(object2);
                            object2 = ((AccountCheckResponse)object2).getMaskedEmailId();
                            n8 = ((String)object2).length() + n7;
                            int n21 = 34;
                            spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan, n7, n8, n21);
                            object4.setText((CharSequence)spannableStringBuilder);
                            n7 = (int)(da1_12.w ? 1 : 0);
                            if (n7 == 0) {
                                textView.setVisibility(0);
                                object5.setVisibility(0);
                                break block61;
                            } else {
                                n7 = 8;
                                textView.setVisibility(n7);
                                object5.setVisibility(n7);
                            }
                        }
                        break block61;
                    }
                    object = da1_12.o;
                    if (object != null) {
                        object = ((QueryCustomer)object).getMobileNumber();
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (object != null) {
                        void var26_56;
                        n7 = R$string.sigup_otp_send_desc;
                        QueryCustomer queryCustomer = da1_12.o;
                        if (queryCustomer != null) {
                            String string14 = queryCustomer.getMobileNumber();
                        } else {
                            n15 = 0;
                            Object var26_57 = null;
                        }
                        n17 = 1;
                        object2 = new Object[n17];
                        object2[0] = var26_56;
                        object = hv3_0.L(n7, (Object[])object2);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                        QueryCustomer queryCustomer2 = da1_12.o;
                        Intrinsics.checkNotNull(queryCustomer2);
                        String string15 = queryCustomer2.getMobileNumber();
                        Intrinsics.checkNotNullExpressionValue(string15, "getMobileNumber(...)");
                        n7 = StringsKt.O((CharSequence)object, string15, 0, false, n4);
                        object2 = this.getActivity();
                        object2 = hv3_0.o(n3, (Context)object2);
                        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, (Typeface)object2);
                        object2 = da1_12.o;
                        Intrinsics.checkNotNull(object2);
                        object2 = ((QueryCustomer)object2).getMobileNumber();
                        n8 = ((String)object2).length() + n7;
                        int n22 = 34;
                        spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan, n7, n8, n22);
                        object4.setText((CharSequence)spannableStringBuilder);
                        n7 = 8;
                        textView.setVisibility(n7);
                        object5.setVisibility(n7);
                    }
                }
                if ((n7 = (int)(da1_12.C ? 1 : 0)) == 0) break block65;
                object = da1_12.l;
                if (object != null) {
                    n15 = R$string.new_login_detected;
                    String string16 = da1_12.getString(n15);
                    object.setText((CharSequence)string16);
                }
                n7 = 8;
                textView.setVisibility(n7);
                object5.setVisibility(n7);
                object = da1_12.A;
                if (object != null) {
                    n15 = 1;
                    object.v0(n15 != 0);
                }
                if ((object = da1_12.h) != null) {
                    n15 = R$string.verify;
                    String string17 = da1_12.getString(n15);
                    object.setText((CharSequence)string17);
                }
                if ((n7 = (int)(da1_12.H ? 1 : 0)) == 0 || (n7 = (int)(da1_12.G ? 1 : 0)) == 0) break block66;
                object = da1_12.n;
                if (object != null) {
                    object = ((AccountCheckResponse)object).getMaskedMobileNumber();
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object != null) {
                    object = da1_12.n;
                    if (object != null) {
                        object = ((AccountCheckResponse)object).getMaskedEmailId();
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    if (object != null) {
                        void var26_67;
                        n7 = R$string.unrecognised_device_desc_text;
                        AccountCheckResponse accountCheckResponse = da1_12.n;
                        if (accountCheckResponse != null) {
                            String string18 = accountCheckResponse.getMaskedMobileNumber();
                        } else {
                            n15 = 0;
                            Object var26_66 = null;
                        }
                        AccountCheckResponse accountCheckResponse7 = da1_12.n;
                        if (accountCheckResponse7 != null) {
                            object2 = accountCheckResponse7.getMaskedEmailId();
                            n17 = 2;
                        } else {
                            n17 = 2;
                            n8 = 0;
                            object2 = null;
                        }
                        Object[] objectArray = new Object[n17];
                        objectArray[0] = var26_67;
                        n15 = 1;
                        objectArray[n15] = object2;
                        object = hv3_0.L(n7, objectArray);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                        AccountCheckResponse accountCheckResponse8 = da1_12.n;
                        Intrinsics.checkNotNull(accountCheckResponse8);
                        String string19 = accountCheckResponse8.getMaskedMobileNumber();
                        Intrinsics.checkNotNullExpressionValue(string19, string3);
                        n17 = StringsKt.O((CharSequence)object, string19, 0, false, n4);
                        object5 = this.getActivity();
                        object5 = hv3_0.o(n3, (Context)object5);
                        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, (Typeface)object5);
                        object5 = da1_12.n;
                        Intrinsics.checkNotNull(object5);
                        object5 = ((AccountCheckResponse)object5).getMaskedMobileNumber();
                        n16 = ((String)object5).length() + n17;
                        n8 = 34;
                        spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan, n17, n16, n8);
                        AccountCheckResponse accountCheckResponse9 = da1_12.n;
                        Intrinsics.checkNotNull(accountCheckResponse9);
                        String string20 = accountCheckResponse9.getMaskedEmailId();
                        Intrinsics.checkNotNullExpressionValue(string20, string4);
                        n7 = StringsKt.O((CharSequence)object, string20, 0, false, n4);
                        object3 = this.getActivity();
                        object3 = hv3_0.o(n3, (Context)object3);
                        AjioCustomTypefaceSpan ajioCustomTypefaceSpan3 = new AjioCustomTypefaceSpan(string2, (Typeface)object3);
                        object3 = da1_12.n;
                        Intrinsics.checkNotNull(object3);
                        object3 = ((AccountCheckResponse)object3).getMaskedEmailId();
                        n14 = ((String)object3).length() + n7;
                        n10 = 34;
                        spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan3, n7, n14, n10);
                        object4.setText((CharSequence)spannableStringBuilder);
                    }
                }
                break block65;
            }
            object = da1_12.n;
            if (object != null) {
                object = ((AccountCheckResponse)object).getMaskedMobileNumber();
            } else {
                n7 = 0;
                object = null;
            }
            if (object != null && (n7 = (int)(da1_12.G ? 1 : 0)) != 0) {
                n7 = R$string.unrecognised_device_desc_text_mobile;
                AccountCheckResponse accountCheckResponse = da1_12.n;
                if (accountCheckResponse != null) {
                    object2 = accountCheckResponse.getMaskedMobileNumber();
                    n15 = 1;
                } else {
                    n15 = 1;
                    n8 = 0;
                    object2 = null;
                }
                Object[] objectArray = new Object[n15];
                objectArray[0] = object2;
                object = hv3_0.L(n7, objectArray);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                AccountCheckResponse accountCheckResponse10 = da1_12.n;
                Intrinsics.checkNotNull(accountCheckResponse10);
                String string21 = accountCheckResponse10.getMaskedMobileNumber();
                Intrinsics.checkNotNullExpressionValue(string21, string3);
                n7 = StringsKt.O((CharSequence)object, string21, 0, false, n4);
                object3 = this.getActivity();
                object3 = hv3_0.o(n3, (Context)object3);
                AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, (Typeface)object3);
                object3 = da1_12.n;
                Intrinsics.checkNotNull(object3);
                object3 = ((AccountCheckResponse)object3).getMaskedMobileNumber();
                n14 = ((String)object3).length() + n7;
                n10 = 34;
                spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan, n7, n14, n10);
                object4.setText((CharSequence)spannableStringBuilder);
            } else {
                object = da1_12.n;
                if (object != null) {
                    object = ((AccountCheckResponse)object).getMaskedEmailId();
                } else {
                    n7 = 0;
                    object = null;
                }
                if (object != null && (n7 = (int)(da1_12.H ? 1 : 0)) != 0) {
                    n7 = R$string.unrecognised_device_desc_text_mobile;
                    AccountCheckResponse accountCheckResponse = da1_12.n;
                    if (accountCheckResponse != null) {
                        object2 = accountCheckResponse.getMaskedEmailId();
                        n15 = 1;
                    } else {
                        n15 = 1;
                        n8 = 0;
                        object2 = null;
                    }
                    Object[] objectArray = new Object[n15];
                    objectArray[0] = object2;
                    object = hv3_0.L(n7, objectArray);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)object);
                    AccountCheckResponse accountCheckResponse11 = da1_12.n;
                    Intrinsics.checkNotNull(accountCheckResponse11);
                    String string22 = accountCheckResponse11.getMaskedEmailId();
                    Intrinsics.checkNotNullExpressionValue(string22, string4);
                    n7 = StringsKt.O((CharSequence)object, string22, 0, false, n4);
                    object3 = this.getActivity();
                    object3 = hv3_0.o(n3, (Context)object3);
                    AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, (Typeface)object3);
                    object3 = da1_12.n;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((AccountCheckResponse)object3).getMaskedEmailId();
                    n14 = ((String)object3).length() + n7;
                    n10 = 34;
                    spannableStringBuilder.setSpan((Object)ajioCustomTypefaceSpan, n7, n14, n10);
                    object4.setText((CharSequence)spannableStringBuilder);
                }
            }
        }
        if ((object = da1_12.f) != null) {
            bA1 bA12 = new bA1(da1_12);
            object.setOnFocusChangeListener((View.OnFocusChangeListener)bA12);
        }
        object = da1_12.f;
        Intrinsics.checkNotNull(object);
        ea1_0 ea1_02 = new ea1_0(da1_12);
        object.addTextChangedListener((TextWatcher)ea1_02);
        object = da1_12.f;
        Intrinsics.checkNotNull(object);
        ca1_0 ca1_02 = new ca1_0(da1_12);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)ca1_02);
    }
}

