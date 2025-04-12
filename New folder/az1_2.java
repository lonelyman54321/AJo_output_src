/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.text.method.DigitsKeyListener
 *  android.text.method.KeyListener
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.D;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.login.RemovalLoginPasswordConfig;
import com.ril.ajio.login.SignUpConfig;
import com.ril.ajio.login.activity.a;
import com.ril.ajio.services.data.referral.RefereeEarnCash;
import com.ril.ajio.services.data.user.AccountCheckResponse;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from Az1
 */
public final class az1_2
extends J51
implements View.OnClickListener {
    public static final Az1$a Companion;
    public LinearLayout A;
    public TextView B;
    public AjioTextView C;
    public AjioTextView D;
    public AjioTextView E;
    public TextInputLayout F;
    public TextInputLayout G;
    public TextInputLayout H;
    public TextInputLayout I;
    public EditText J;
    public EditText K;
    public EditText L;
    public RadioGroup M;
    public AjioTextView N;
    public AjioImageView O;
    public AjioTextView P;
    public ConstraintLayout Q;
    public AjioTextView R;
    public AjioTextView S;
    public LinearLayout T;
    public final NewEEcommerceEventsRevamp U;
    public final NewCustomEventsRevamp X;
    public final String Y;
    public final String Z;
    public boolean f;
    public String g;
    public AccountCheckResponse h;
    public boolean i;
    public a j;
    public String k;
    public String l;
    public final D m;
    public final D n;
    public final fv0_2 o;
    public final fv0_2 p;
    public final fv0_2 q;
    public final fv0_2 r;
    public final fv0_2 s;
    public final fv0_2 t;
    public Bundle u;
    public AjioTextView v;
    public AjioTextView w;
    public TextInputEditText x;
    public AjioTextView y;
    public AppCompatCheckBox z;

    static {
        Az1$a az1$a;
        Companion = az1$a = new Object();
    }

    public az1_2() {
        Object object = new Az1$f(this);
        Object object2 = et1_2.NONE;
        Object object3 = new Az1$g((Az1$f)object);
        object = yr1_2.a((et1_2)((Object)object2), (Function0)object3);
        object2 = oa1_1.class;
        object3 = Reflection.getOrCreateKotlinClass((Class)object2);
        Lambda lambda = new Az1$h((rq1_2)object);
        Az1$i az1$i = new Az1$i((rq1_2)object);
        Az1$j az1$j = new Az1$j(this, (rq1_2)object);
        this.m = object = LW0.a(this, (yn1_2)object3, lambda, az1$i, az1$j);
        object = Reflection.getOrCreateKotlinClass((Class)object2);
        super(this);
        object3 = new Az1$d(this);
        super(this);
        this.n = object = LW0.a(this, (yn1_2)object, (Function0)object2, (Function0)object3, lambda);
        object2 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
        this.o = object = new fv0_2((vz3_0)((Object)object2));
        this.p = object = new fv0_2((vz3_0)((Object)object2));
        this.q = object = new fv0_2((vz3_0)((Object)object2));
        object2 = vz3_0.BASICVALIDATOR;
        this.r = object = new fv0_2((vz3_0)((Object)object2));
        this.s = object = new fv0_2((vz3_0)((Object)object2));
        this.t = object = new fv0_2((vz3_0)((Object)object2));
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.U = object2;
        this.X = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.Y = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreen();
        this.Z = object = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
    }

    public final void Pa() {
        Object object = this.j;
        if (object != null) {
            object.startLoader();
        }
        object = new QueryCustomer();
        boolean bl2 = this.i;
        String string2 = null;
        if (bl2) {
            EditText editText = this.J;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emailId");
                bl2 = false;
                editText = null;
            }
            if ((editText = editText.getText()) != null) {
                string2 = editText.toString();
            }
            ((QueryCustomer)object).setEmail(string2);
            bl2 = false;
            editText = null;
            ((QueryCustomer)object).setMobileNumberEnterered(false);
        } else {
            EditText editText = this.K;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mobileNumber");
                bl2 = false;
                editText = null;
            }
            if ((editText = editText.getText()) != null) {
                string2 = editText.toString();
            }
            ((QueryCustomer)object).setMobileNumber(string2);
            bl2 = true;
            ((QueryCustomer)object).setMobileNumberEnterered(bl2);
        }
        this.Ra().b((QueryCustomer)object, "signup screen");
    }

    public final void Qa(boolean bl2) {
        cp$a cp$a = cp_1.Companion;
        boolean bl3 = km_1.b(cp$a);
        float f5 = 1.0f;
        boolean bl4 = true;
        AjioTextView ajioTextView = null;
        String string2 = "btnSendOTP";
        if (bl3) {
            AjioTextView ajioTextView2 = this.N;
            if (ajioTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl5 = false;
                ajioTextView2 = null;
                float f6 = 0.0f;
            }
            ajioTextView2.setClickable(bl4);
            ajioTextView2 = this.N;
            if (ajioTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                ajioTextView = ajioTextView2;
            }
            ajioTextView.setAlpha(f5);
        } else if (bl2) {
            AjioTextView ajioTextView3 = this.N;
            if (ajioTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl6 = false;
                ajioTextView3 = null;
                float f7 = 0.0f;
            }
            ajioTextView3.setClickable(bl4);
            ajioTextView3 = this.N;
            if (ajioTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                ajioTextView = ajioTextView3;
            }
            ajioTextView.setAlpha(f5);
        } else {
            float f8;
            AjioTextView ajioTextView4 = this.N;
            if (ajioTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl7 = false;
                ajioTextView4 = null;
                f8 = 0.0f;
            }
            bl3 = false;
            cp$a = null;
            ajioTextView4.setClickable(false);
            ajioTextView4 = this.N;
            if (ajioTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                ajioTextView = ajioTextView4;
            }
            int n3 = 1058642330;
            f8 = 0.6f;
            ajioTextView.setAlpha(f8);
        }
    }

    public final oa1_1 Ra() {
        return (oa1_1)this.m.getValue();
    }

    public final QueryCustomer Sa() {
        String string2;
        int n3;
        QueryCustomer queryCustomer = new QueryCustomer();
        Object object = this.L;
        String string3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userName");
            n3 = 0;
            object = null;
        }
        if ((object = object.getText()) != null) {
            object = object.toString();
        } else {
            n3 = 0;
            object = null;
        }
        queryCustomer.setFirstName((String)object);
        queryCustomer.setRequestMode("SENDOTP");
        cp_1.Companion.getClass();
        object = cp$a.e();
        object.getClass();
        n3 = cp_1.q();
        int n4 = 1;
        if (n3 == n4) {
            int n7;
            object = this.M;
            string2 = "genderOption";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((n3 = object.getCheckedRadioButtonId()) == (n7 = -1)) {
                object = "";
            } else {
                RadioGroup radioGroup;
                object = this.M;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                }
                if ((radioGroup = this.M) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    radioGroup = null;
                }
                n4 = radioGroup.getCheckedRadioButtonId();
                object = ((Object)((RadioButton)object.findViewById(n4)).getText()).toString();
            }
            object = ((Object)StringsKt.m0((CharSequence)object)).toString();
            queryCustomer.setGender((String)object);
        }
        if ((object = this.F) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginNewUserMailTil");
            n3 = 0;
            object = null;
        }
        ((TextInputLayout)((Object)object)).setError(null);
        object = this.I;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userNameTextInputLayout");
            n3 = 0;
            object = null;
        }
        ((TextInputLayout)((Object)object)).setError(null);
        object = this.K;
        string2 = "mobileNumber";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        if ((object = object.getText()) != null) {
            object = object.toString();
        } else {
            n3 = 0;
            object = null;
        }
        queryCustomer.setMobileNumber((String)object);
        n3 = (int)(this.i ? 1 : 0);
        if (n3 != 0) {
            object = this.k;
            if (object != null) {
                object = ((Object)StringsKt.m0((CharSequence)object)).toString();
            } else {
                n3 = 0;
                object = null;
            }
            object = String.valueOf(object);
            queryCustomer.setMobileNumber((String)object);
            object = this.J;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emailId");
                n3 = 0;
                object = null;
            }
            if ((object = object.getText()) != null && (object = StringsKt.m0((CharSequence)object)) != null) {
                object = object.toString();
            } else {
                n3 = 0;
                object = null;
            }
            queryCustomer.setLogin((String)object);
        } else {
            object = this.K;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((object = object.getText()) != null) {
                object = StringsKt.m0((CharSequence)object);
            } else {
                n3 = 0;
                object = null;
            }
            object = String.valueOf(object);
            queryCustomer.setMobileNumber((String)object);
            object = this.l;
            if (object != null) {
                object = ((Object)StringsKt.m0((CharSequence)object)).toString();
            } else {
                n3 = 0;
                object = null;
            }
            object = String.valueOf(object);
            queryCustomer.setLogin((String)object);
        }
        object = this.z;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralCodeCheckBox");
            n3 = 0;
            object = null;
        }
        if ((n3 = (int)(object.isChecked() ? 1 : 0)) != 0) {
            object = this.x;
            string2 = "referralCodeETV";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            if ((object = ((AppCompatEditText)object).getText()) != null) {
                object = object.toString();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (n3 = ((String)object).length()) != 0) {
                object = this.x;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                }
                if ((object = ((AppCompatEditText)object).getText()) != null) {
                    string3 = object.toString();
                }
                queryCustomer.setRilFnlRegisterReferralCode(string3);
            }
        }
        return queryCustomer;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean Ta() {
        block12: {
            var1_1 = this.i;
            var2_2 = this.q;
            var3_3 = 1;
            if (!var1_1) {
                var4_4 = this.p.a;
                var1_1 = var4_4.h();
                if (var1_1 && (var1_1 = (var4_4 = var2_2.a).h())) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 = true;
                        break block12;
                        break;
                    }
                }
                while (true) {
                    var1_1 = false;
                    var4_4 = null;
                    break block12;
                    break;
                }
            }
            var4_4 = h40_0.a;
            var1_1 = h40_0.X0();
            if (var1_1) {
                var4_4 = this.t.a;
                var1_1 = var4_4.h();
            } else {
                if (!(var1_1 = (var4_4 = this.o.a).h()) || !(var1_1 = (var4_4 = var2_2.a).h())) ** continue;
                ** continue;
            }
        }
        cp_1.Companion.getClass();
        var2_2 = cp$a.e();
        var2_2.getClass();
        var5_5 = cp_1.q();
        var6_6 = null;
        if (var5_5 != var3_3) ** GOTO lbl-1000
        var2_2 = this.M;
        if (var2_2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("genderOption");
            var5_5 = 0;
            var2_2 = null;
        }
        if ((var5_5 = var2_2.getCheckedRadioButtonId()) != (var7_7 = -1)) lbl-1000:
        // 2 sources

        {
            var5_5 = 1;
        } else {
            var5_5 = 0;
            var2_2 = null;
        }
        if (var1_1 && var5_5 != 0) {
            this.Qa((boolean)var3_3);
            return var3_3;
        }
        this.Qa(false);
        var4_4 = this.K;
        if (var4_4 == null) {
            var4_4 = "mobileNumber";
            Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
        } else {
            var6_6 = var4_4;
        }
        var4_4 = DigitsKeyListener.getInstance((String)"0123456789");
        var6_6.setKeyListener((KeyListener)var4_4);
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public final void Ua() {
        block13: {
            var1_1 = this.i;
            var2_2 = this.t;
            var3_3 = 1;
            if (!var1_1) {
                var4_4 = this.s.a;
                var1_1 = var4_4.h();
                if (var1_1 && (var1_1 = (var4_4 = var2_2.a).h())) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var1_1 = true;
                        break block13;
                        break;
                    }
                }
                while (true) {
                    var1_1 = false;
                    var4_4 = null;
                    break block13;
                    break;
                }
            }
            var4_4 = h40_0.a;
            var1_1 = h40_0.X0();
            if (var1_1) {
                var4_4 = var2_2.a;
                var1_1 = var4_4.h();
            } else {
                if (!(var1_1 = (var4_4 = this.r.a).h()) || !(var1_1 = (var4_4 = var2_2.a).h())) ** continue;
                ** continue;
            }
        }
        cp_1.Companion.getClass();
        var2_2 = cp$a.e();
        var2_2.getClass();
        var5_5 = cp_1.q();
        var6_6 = null;
        if (var5_5 != var3_3) ** GOTO lbl-1000
        var2_2 = this.M;
        if (var2_2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("genderOption");
            var5_5 = 0;
            var2_2 = null;
        }
        if ((var5_5 = var2_2.getCheckedRadioButtonId()) != (var7_7 = -1)) lbl-1000:
        // 2 sources

        {
            var5_5 = 1;
        } else {
            var5_5 = 0;
            var2_2 = null;
        }
        if (var1_1 && var5_5 != 0) {
            this.Qa((boolean)var3_3);
        } else {
            this.Qa(false);
            var4_4 = this.K;
            if (var4_4 == null) {
                var4_4 = "mobileNumber";
                Intrinsics.throwUninitializedPropertyAccessException((String)var4_4);
            } else {
                var6_6 = var4_4;
            }
            var4_4 = DigitsKeyListener.getInstance((String)"0123456789");
            var6_6.setKeyListener((KeyListener)var4_4);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onActivityCreated(Bundle object) {
        void var1_31;
        LinearLayout linearLayout;
        String string2 = null;
        int n3 = 1;
        super.onActivityCreated((Bundle)object);
        zr1_1 zr1_12 = this.Ra().l;
        Object object2 = this.getViewLifecycleOwner();
        Object object3 = new uf1_2(this, n3);
        Az1$b az1$b = new Az1$b((Function1)object3);
        zr1_12.e((mu1_1)object2, az1$b);
        zr1_1 zr1_13 = this.Ra().n;
        object2 = this.getViewLifecycleOwner();
        object3 = new vz1_1(this);
        Az1$b az1$b2 = new Az1$b((Function1)object3);
        zr1_13.e((mu1_1)object2, az1$b2);
        zr1_1 zr1_14 = this.Ra().o;
        object2 = this.getViewLifecycleOwner();
        object3 = new m5_0(this, n3);
        Az1$b az1$b3 = new Az1$b((Function1)object3);
        zr1_14.e((mu1_1)object2, az1$b3);
        zr1_1 zr1_15 = this.Ra().q;
        object2 = this.getViewLifecycleOwner();
        int n4 = 2;
        float f5 = 2.8E-45f;
        object3 = new n5_0(this, n4);
        Az1$b az1$b4 = new Az1$b((Function1)object3);
        zr1_15.e((mu1_1)object2, az1$b4);
        z40$a z40$a = z40_0.Companion;
        object2 = this.requireActivity().getApplication();
        object3 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        z40$a.getClass();
        ao0_0 ao0_02 = z40$a.a((Context)object2).a;
        int n7 = ao0_02.a("referral_feature_enable");
        object2 = "referralCodeInputLayout";
        String string3 = "referralCodeView";
        Object object4 = null;
        if (n7 != 0) {
            Application application = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, (String)object3);
            ao0_0 ao0_03 = z40$a.a((Context)application).a;
            String string4 = "referee_enable";
            n7 = (int)(ao0_03.a(string4) ? 1 : 0);
            if (n7 != 0) {
                TextInputEditText textInputEditText;
                String string5 = "format(...)";
                string4 = this.A;
                if (string4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    string4 = null;
                }
                ai0_2.B((View)string4);
                String string6 = bv1_0.a;
                string4 = "referralCodeETV";
                if (string6 != null && (n4 = string6.length()) != 0) {
                    String string7;
                    void var1_23;
                    void var1_20;
                    void var1_17;
                    AppCompatCheckBox appCompatCheckBox;
                    Object[] objectArray;
                    int n8;
                    String string8 = bv1_0.b;
                    Object object5 = "welcomeMsgTv";
                    if (string8 != null && (n4 = string8.length()) != 0) {
                        void var6_47;
                        AjioTextView ajioTextView = this.w;
                        if (ajioTextView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n4 = 0;
                            Object var6_46 = null;
                            f5 = 0.0f;
                        }
                        n8 = R$string.invited_you;
                        Object[] objectArray2 = new Object[n3];
                        objectArray = bv1_0.b;
                        objectArray2[0] = objectArray;
                        object5 = hv3_0.L(n8, objectArray2);
                        var6_47.setText((CharSequence)object5);
                    } else {
                        void var6_50;
                        AjioTextView ajioTextView = this.w;
                        if (ajioTextView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                            n4 = 0;
                            Object var6_49 = null;
                            f5 = 0.0f;
                        }
                        n8 = R$string.invited_you_friend;
                        object5 = hv3_0.K(n8);
                        var6_50.setText((CharSequence)object5);
                    }
                    RefereeEarnCash refereeEarnCash = bv1_0.c;
                    if (refereeEarnCash != null) {
                        f5 = refereeEarnCash.getAmount();
                        object5 = null;
                        float f6 = f5 - 0.0f;
                        n8 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                        if (n8 > 0) {
                            void var1_13;
                            object5 = this.y;
                            String string9 = "referralAjioCashMsgTv";
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string9);
                                n8 = 0;
                                object5 = null;
                            }
                            objectArray = StringCompanionObject.INSTANCE;
                            objectArray = this.requireActivity();
                            objectArray = objectArray.getApplication();
                            Intrinsics.checkNotNullExpressionValue(objectArray, (String)object3);
                            object3 = z40$a.a((Context)objectArray);
                            object3 = ((z40_0)object3).a;
                            objectArray = "referral_signup_msg";
                            object3 = ((ao0_0)object3).b((String)objectArray);
                            objectArray = Float.valueOf(f5);
                            objectArray = qz2_0.x((Float)objectArray);
                            Object[] objectArray3 = new Object[n3];
                            objectArray3[0] = objectArray;
                            objectArray = Arrays.copyOf(objectArray3, n3);
                            object3 = String.format((String)object3, objectArray);
                            try {
                                Intrinsics.checkNotNullExpressionValue(object3, string5);
                            }
                            catch (Exception exception) {
                                objectArray = yn3_0.a;
                                objectArray.e(exception);
                                object3 = StringCompanionObject.INSTANCE;
                                object3 = qz2_0.x(Float.valueOf(f5));
                                Object[] objectArray4 = new Object[n3];
                                objectArray4[0] = object3;
                                object3 = xh2_0.a(objectArray4, n3, "Signup to get %s AJIO Cash", string5);
                            }
                            object5.setText((CharSequence)object3);
                            AjioTextView ajioTextView = this.y;
                            if (ajioTextView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string9);
                                n7 = 0;
                                Object var1_12 = null;
                            }
                            var1_13.setVisibility(0);
                        }
                    }
                    if ((appCompatCheckBox = this.z) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("referralCodeCheckBox");
                        n7 = 0;
                        Object var1_16 = null;
                    }
                    var1_17.setChecked(n3 != 0);
                    TextInputLayout textInputLayout = this.H;
                    if (textInputLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n7 = 0;
                        Object var1_19 = null;
                    }
                    var1_20.setVisibility(0);
                    TextInputEditText textInputEditText2 = this.x;
                    if (textInputEditText2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n7 = 0;
                        Object var1_22 = null;
                    }
                    string2 = bv1_0.a;
                    var1_23.setText((CharSequence)string2);
                    bv1_0.e = string7 = "used referal - auto filled";
                }
                if ((textInputEditText = this.x) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    object4 = textInputEditText;
                }
                Bz1 bz1 = new Bz1(this);
                object4.addTextChangedListener(bz1);
                return;
            }
        }
        if ((linearLayout = this.A) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n7 = 0;
            Object var1_30 = null;
        }
        ai0_2.i((View)var1_31);
        TextInputLayout textInputLayout = this.H;
        if (textInputLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object4 = textInputLayout;
        }
        n7 = 8;
        object4.setVisibility(n7);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof a;
        if (bl2) {
            object = (a)object;
            this.j = object;
            return;
        }
        object = pn_2.b(object, " must implement LoginActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        az1_2 az1_22 = this;
        int n7 = 0;
        Object object2 = null;
        int n8 = 1;
        int n10 = 0;
        String string2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n14 = R$id.login_new_user_send_otp_tv;
        Object object3 = "";
        if (object != null && (n3 = ((Integer)object).intValue()) == n14) {
            object = cp_1.Companion;
            n4 = (int)(km_1.b((cp$a)object) ? 1 : 0);
            if (n4 != 0 && (n4 = (int)(this.Ta() ? 1 : 0)) == 0) {
                n10 = R$string.pls_enter_the_required_details;
                string2 = hv3_0.K(n10);
                object = StringCompanionObject.INSTANCE;
                n4 = R$string.acc_error_message;
                object = hv3_0.K(n4);
                Object[] objectArray = new Object[n8];
                objectArray[0] = string2;
                object3 = "format(...)";
                String string3 = xh2_0.a(objectArray, n8, (String)object, (String)object3);
                hv3_0.o0(0, string2, string3);
            } else {
                object2 = az1_22.j;
                if (object2 != null) {
                    object2.startLoader();
                }
                object2 = this.Sa();
                object = this.Ra();
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, "<set-?>");
                ((oa1_1)object).C = object2;
                object = this.Ra();
                String string4 = "signup screen";
                ((oa1_1)object).o((QueryCustomer)object2, string4, n8 != 0);
                Bundle bundle = new Bundle();
                object2 = az1_22.x;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("referralCodeETV");
                    n7 = 0;
                    object2 = null;
                }
                if ((object2 = ((AppCompatEditText)object2).getText()) != null) {
                    string2 = object2.toString();
                }
                if ((n7 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0)) != 0) {
                    string2 = "No code";
                }
                object2 = "referral_code";
                bundle.putString((String)object2, string2);
                Object object4 = string2 == null ? object3 : string2;
                int n15 = 1536;
                NewCustomEventsRevamp newCustomEventsRevamp = az1_22.X;
                String string5 = "user accounts interactions";
                String string6 = "Sign up | Continue";
                String string7 = "user_account_interactions";
                String string8 = "Sign Up screen";
                String string9 = "";
                String string10 = az1_22.Y;
                object2 = az1_22.Z;
                boolean bl2 = false;
                Object object5 = object2;
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string5, string6, (String)object4, string7, string8, string9, string10, bundle, (String)object2, false, null, n15, null);
            }
        } else {
            n7 = R$id.login_new_user_mobile_edit_tv;
            if (object != null && (n10 = ((Integer)object).intValue()) == n7) {
                object2 = az1_22.j;
                if (object2 != null) {
                    object2.A0(n8 != 0);
                }
                object2 = this.getActivity();
                hv3_0.S((Activity)object2);
                n7 = (int)(az1_22.i ? 1 : 0);
                if (n7 != 0) {
                    object2 = az1_22.j;
                    if (object2 != null) {
                        n8 = (int)(az1_22.f ? 1 : 0);
                        string2 = az1_22.g;
                        object2.T(string2, (String)object3, n8 != 0);
                    }
                } else {
                    object2 = az1_22.j;
                    if (object2 != null) {
                        n8 = (int)(az1_22.f ? 1 : 0);
                        string2 = az1_22.g;
                        object2.T((String)object3, string2, n8 != 0);
                    }
                }
            } else {
                n7 = R$id.id_restore_phone_number;
                if (object != null && (n8 = ((Integer)object).intValue()) == n7) {
                    object2 = uy1_0.a;
                    object2 = az1_22.h;
                    if (object2 != null && (object2 = ((AccountCheckResponse)object2).getEncryptedId()) != null) {
                        object3 = object2;
                    }
                    Intrinsics.checkNotNullParameter(object3, "encryptedId");
                    Bundle bundle = new Bundle();
                    object2 = uy1_0.c;
                    bundle.putString((String)object2, (String)object3);
                    bundle.putString("page_type", "login/signup");
                    NewCustomEventsRevamp newCustomEventsRevamp = uy1_0.a;
                    String string11 = newCustomEventsRevamp.getEC_USER_ACCOUNTS();
                    object2 = AnalyticsManager.Companion;
                    String string12 = bv_0.a((AnalyticsManager$Companion)object2);
                    String string13 = cv_0.a((AnalyticsManager$Companion)object2);
                    String string14 = uy1_0.e;
                    int n16 = 1024;
                    String string15 = "";
                    String string16 = "user_account_interactions";
                    String string17 = "signup screen";
                    String string18 = "signup screen";
                    boolean bl3 = true;
                    NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string11, string14, string15, string16, string17, string18, string12, bundle, string13, bl3, null, n16, null);
                    object2 = cp_1.Companion;
                    Context context = this.getContext();
                    object2.getClass();
                    object2 = "signup_screen";
                    cp$a.C(context, (String)object2);
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            Object object2 = object.getString("USER_INPUT_VALUE");
            this.g = object2;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object2 = pz1.a(object);
            } else {
                object2 = object.getSerializable("param2");
                n4 = object2 instanceof AccountCheckResponse;
                if (n4 == 0) {
                    n3 = 0;
                    object2 = null;
                }
                object2 = (AccountCheckResponse)object2;
            }
            this.h = object2 = (AccountCheckResponse)object2;
            object2 = "is_half_card_flow";
            this.f = bl2 = object.getBoolean((String)object2);
            object = (oa1_1)this.n.getValue();
            n3 = (int)(this.f ? 1 : 0);
            object.e = n3;
        }
        this.u = object = new Bundle();
        object.putInt("Step_Number", 2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_new_signup;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        int n3;
        String string2;
        super.onResume();
        Object object = this.j;
        if (object != null) {
            string2 = null;
            object.s0(false);
        }
        Bundle bundle = new Bundle();
        object = this.X;
        string2 = ((NewCustomEventsRevamp)object).getSTEP();
        Object object2 = this.u;
        String string3 = null;
        String string4 = "eventBundle";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n3 = 0;
            object2 = null;
        }
        String string5 = "Step_Number";
        n3 = object2.getInt(string5);
        bundle.putInt(string2, n3);
        object = ((NewCustomEventsRevamp)object).getLOGIN_TYPE();
        string2 = this.u;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            string2 = null;
        }
        string2 = string2.getString("login_type", "");
        bundle.putString((String)object, string2);
        object = this.U;
        String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string7 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object2 = this.X;
        string5 = "signup screen";
        String string8 = "user account screen";
        ((NewCustomEventsRevamp)object2).newPushCustomScreenView(string5, string8, string6, bundle, string7);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        string2 = this.u;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
        } else {
            string3 = string2;
        }
        ((GTMEvents)object).pushOpenScreenEvent("signup screen", (Bundle)string3);
    }

    public final void onStop() {
        super.onStop();
        this.U.setPreviousScreenData("signup screen", "user account screen");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        boolean bl2;
        Object object;
        int n4;
        int n7;
        Object object2;
        int n8;
        Object object3;
        float f5;
        int n10;
        Object object4;
        int n14;
        int n15;
        az1_2 az1_22 = this;
        Object object5 = view;
        boolean bl3 = true;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Class<SignUpConfig> clazz = this.j;
        if (clazz != null) {
            clazz.v0(false);
        }
        if ((clazz = az1_22.j) != null) {
            n15 = R$color.accent_color_11;
            clazz.F1(n15);
        }
        az1_22.i = n14 = TextUtils.isDigitsOnly((CharSequence)az1_22.g);
        n14 = R$id.tv_mobile_mail;
        az1_22.v = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.login_new_user_header_tv;
        az1_22.w = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.login_new_user_invite_code_tiet;
        az1_22.x = clazz = (TextInputEditText)object5.findViewById(n14);
        n14 = R$id.login_new_user_invalid_referral;
        clazz = (TextView)object5.findViewById(n14);
        az1_22.B = clazz;
        n14 = R$id.login_new_user_t_and_c_view;
        clazz = (LinearLayout)object5.findViewById(n14);
        az1_22.A = clazz;
        n14 = R$id.tv_referral_text;
        az1_22.y = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.referral_code_cb;
        az1_22.z = clazz = (AppCompatCheckBox)object5.findViewById(n14);
        n14 = R$id.tv_otp_verification_txt;
        az1_22.C = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.login_new_user_t_and_c_tv;
        az1_22.D = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.login_new_user_mobile_edit_tv;
        az1_22.E = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.login_new_user_email_til;
        clazz = (TextInputLayout)object5.findViewById(n14);
        az1_22.F = clazz;
        n14 = R$id.login_new_user_mobile_til;
        clazz = (TextInputLayout)object5.findViewById(n14);
        az1_22.G = clazz;
        n14 = R$id.login_new_user_invite_code_til;
        clazz = (TextInputLayout)object5.findViewById(n14);
        az1_22.H = clazz;
        n14 = R$id.login_new_user_name_til;
        clazz = (TextInputLayout)object5.findViewById(n14);
        az1_22.I = clazz;
        n14 = R$id.rg_newuser_gender_options;
        clazz = (RadioGroup)object5.findViewById(n14);
        az1_22.M = clazz;
        n14 = R$id.login_new_user_email_tiet;
        clazz = (EditText)object5.findViewById(n14);
        az1_22.J = clazz;
        n15 = 0;
        Object object6 = null;
        Object object7 = "emailId";
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n14 = 0;
            clazz = null;
        }
        int n16 = 32;
        clazz.setInputType(n16);
        n14 = R$id.id_login_removal;
        clazz = (ConstraintLayout)object5.findViewById(n14);
        az1_22.Q = clazz;
        n14 = R$id.id_restore_phone_number;
        clazz = (AjioTextView)object5.findViewById(n14);
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("idRestorePhoneNumber");
            n14 = 0;
            clazz = null;
        }
        clazz.setOnClickListener((View.OnClickListener)az1_22);
        clazz = h40_0.a;
        clazz = h40_0.R();
        n14 = (int)(((RemovalLoginPasswordConfig)((Object)clazz)).getEnable_restore_phone_number() ? 1 : 0);
        if (n14 == 0) {
            clazz = az1_22.Q;
            if (clazz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idLoginRemoval");
                n14 = 0;
                clazz = null;
            }
            ai0_2.i((View)clazz);
        } else {
            n14 = R$id.id_login_removal_text;
            clazz = (AjioTextView)object5.findViewById(n14);
            if (clazz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idLoginRemovalText");
                n14 = 0;
                clazz = null;
            }
            object4 = h40_0.R().getSignup_restore_phone_number_message();
            clazz.setText((CharSequence)object4);
        }
        n14 = R$id.login_new_user_mobile_tiet;
        clazz = (EditText)object5.findViewById(n14);
        az1_22.K = clazz;
        n14 = R$id.login_new_user_name_tiet;
        clazz = (EditText)object5.findViewById(n14);
        az1_22.L = clazz;
        n14 = R$id.login_new_user_send_otp_tv;
        clazz = (AjioTextView)object5.findViewById(n14);
        az1_22.N = clazz;
        clazz = cp_1.Companion;
        n14 = (int)(km_1.b((cp$a)((Object)clazz)) ? 1 : 0);
        object4 = "btnSendOTP";
        if (n14 == 0) {
            clazz = az1_22.N;
            if (clazz == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n14 = 0;
                clazz = null;
            }
            n10 = 1058642330;
            f5 = 0.6f;
            ((AjioTextView)((Object)clazz)).setAlpha(f5);
        }
        n14 = R$id.iv_signup_benefit;
        clazz = (AjioImageView)object5.findViewById(n14);
        az1_22.O = clazz;
        n14 = R$id.gender_title;
        az1_22.P = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.sign_up_root_view;
        clazz = (LinearLayout)object5.findViewById(n14);
        az1_22.T = clazz;
        n14 = R$id.ril_employee_email_signin_info;
        az1_22.R = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = R$id.ril_employee_email_info_text;
        az1_22.S = clazz = (AjioTextView)object5.findViewById(n14);
        n14 = (int)(az1_22.i ? 1 : 0);
        if (n14 == 0 && (n14 = (int)(cp$a.z((String)((Object)(clazz = az1_22.g))) ? 1 : 0)) != 0) {
            clazz = az1_22.R;
            if (clazz == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rilEmployeeEmailSignInInfoText");
                n14 = 0;
                clazz = null;
            }
            object3 = h40_0.u0();
            cp$a.g((AjioTextView)((Object)clazz), (String)object3);
        }
        if ((clazz = az1_22.T) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
            n14 = 0;
            clazz = null;
        }
        object3 = new kx0_0(az1_22, (int)(bl3 ? 1 : 0));
        clazz.setOnTouchListener((View.OnTouchListener)object3);
        clazz = az1_22.n;
        object3 = (oa1_1)((D)((Object)clazz)).getValue();
        ((oa1_1)object3).h = n8 = az1_22.i;
        object3 = "tvOtpVerificationTxt";
        Object object8 = "login_type";
        Object object9 = "eventBundle";
        Object object10 = "tvMobileMail";
        Object object11 = "loginNewUserMobileTil";
        Object object12 = "loginNewUserMailTil";
        if (n8 != 0) {
            object2 = az1_22.u;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n8 = 0;
                object2 = null;
            }
            object9 = "mobile number";
            object2.putString((String)object8, (String)object9);
            object2 = az1_22.F;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                n8 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = az1_22.G;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n8 = 0;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = az1_22.C;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n8 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
            n10 = (int)(h40_0.X0() ? 1 : 0);
            if (n10 != 0) {
                object3 = az1_22.F;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                    n10 = 0;
                    object3 = null;
                    f5 = 0.0f;
                }
                n8 = R$string.hint_email_id_optional;
                object2 = az1_22.getString(n8);
                ((TextInputLayout)((Object)object3)).setHint((CharSequence)object2);
            } else {
                object3 = az1_22.F;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                    n10 = 0;
                    object3 = null;
                    f5 = 0.0f;
                }
                if ((object2 = az1_22.F) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                    n8 = 0;
                    object2 = null;
                }
                object2 = ai0_2.l(String.valueOf(((TextInputLayout)((Object)object2)).getHint()));
                ((TextInputLayout)((Object)object3)).setHint((CharSequence)object2);
            }
            object3 = az1_22.v;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object10);
                n10 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            n8 = R$string.mobile_number_signup;
            object8 = az1_22.g;
            object9 = new Object[bl3];
            object9[0] = object8;
            object2 = hv3_0.L(n8, (Object[])object9);
            object3.setText((CharSequence)object2);
            object3 = az1_22.v;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object10);
                n10 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            n8 = R$string.mobile_number_signup;
            object8 = az1_22.g;
            object9 = new Object[bl3];
            object9[0] = object8;
            object2 = hv3_0.L(n8, (Object[])object9);
            object3.setContentDescription((CharSequence)object2);
            az1_22.k = object3 = az1_22.g;
            clazz = (oa1_1)((D)((Object)clazz)).getValue();
            ((oa1_1)((Object)clazz)).f = object3 = az1_22.k;
        } else {
            object2 = az1_22.u;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n8 = 0;
                object2 = null;
            }
            object9 = "email address";
            object2.putString((String)object8, (String)object9);
            object2 = az1_22.F;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                n8 = 0;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object2 = az1_22.G;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n8 = 0;
                object2 = null;
            }
            ai0_2.B((View)object2);
            object2 = az1_22.G;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n8 = 0;
                object2 = null;
            }
            if ((object8 = az1_22.G) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                object8 = null;
            }
            object8 = ai0_2.l(String.valueOf(((TextInputLayout)((Object)object8)).getHint()));
            ((TextInputLayout)((Object)object2)).setHint((CharSequence)object8);
            object2 = az1_22.C;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n8 = 0;
                object2 = null;
            }
            ai0_2.i((View)object2);
            object3 = az1_22.v;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object10);
                n10 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            n8 = R$string.email_signup;
            object8 = az1_22.g;
            object9 = new Object[bl3];
            object9[0] = object8;
            object2 = hv3_0.L(n8, (Object[])object9);
            object3.setText((CharSequence)object2);
            object3 = az1_22.v;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object10);
                n10 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            n8 = R$string.email_signup;
            object8 = az1_22.g;
            object9 = new Object[bl3];
            object9[0] = object8;
            object2 = hv3_0.L(n8, (Object[])object9);
            object3.setContentDescription((CharSequence)object2);
            az1_22.l = object3 = az1_22.g;
            clazz = (oa1_1)((D)((Object)clazz)).getValue();
            ((oa1_1)((Object)clazz)).g = object3 = az1_22.l;
        }
        clazz = az1_22.I;
        object3 = "userNameTextInputLayout";
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n14 = 0;
            clazz = null;
        }
        if ((object2 = az1_22.I) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n8 = 0;
            object2 = null;
        }
        object2 = ai0_2.l(String.valueOf(((TextInputLayout)((Object)object2)).getHint()));
        ((TextInputLayout)((Object)clazz)).setHint((CharSequence)object2);
        n14 = (int)(az1_22.i ? 1 : 0);
        object2 = "signup screen";
        object8 = "mobileNumber";
        object9 = "Registration form";
        if (n14 != 0) {
            n14 = (int)(h40_0.X0() ? 1 : 0);
            if (n14 == 0) {
                int n17;
                clazz = az1_22.J;
                if (clazz == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n14 = 0;
                    clazz = null;
                }
                if ((object10 = az1_22.F) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                    n17 = 0;
                    object10 = null;
                }
                n7 = R$string.newuser_emailid_error;
                object11 = hv3_0.K(n7);
                n4 = R$string.newuser_emailid_error;
                object = hv3_0.K(n4);
                object12 = new xx0_0((String)object, (String)object9, (String)object2);
                object = az1_22.o;
                ((fv0_2)object).d((EditText)clazz, (TextInputLayout)((Object)object10), (String)object11, (xx0_0)object12);
                clazz = az1_22.J;
                if (clazz == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n14 = 0;
                    clazz = null;
                }
                n17 = R$string.newuser_emailid_error;
                object10 = hv3_0.K(n17);
                object11 = az1_22.r;
                ((fv0_2)object11).f((EditText)clazz, (String)object10);
            }
        } else {
            int n18;
            clazz = az1_22.K;
            if (clazz == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n14 = 0;
                clazz = null;
            }
            if ((object10 = az1_22.G) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object11);
                n18 = 0;
                object10 = null;
            }
            n7 = R$string.mobile_alert_text;
            object11 = hv3_0.K(n7);
            n4 = R$string.mobile_alert_text;
            object = hv3_0.K(n4);
            object12 = new xx0_0((String)object, (String)object9, (String)object2);
            object = az1_22.p;
            ((fv0_2)object).d((EditText)clazz, (TextInputLayout)((Object)object10), (String)object11, (xx0_0)object12);
            clazz = az1_22.K;
            if (clazz == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n14 = 0;
                clazz = null;
            }
            n18 = R$string.mobile_alert_text;
            object10 = hv3_0.K(n18);
            object11 = az1_22.s;
            ((fv0_2)object11).f((EditText)clazz, (String)object10);
        }
        clazz = az1_22.L;
        object10 = "userName";
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object10);
            n14 = 0;
            clazz = null;
        }
        if ((object11 = az1_22.I) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n7 = 0;
            object11 = null;
        }
        n10 = R$string.newuser_username_error;
        object3 = hv3_0.K(n10);
        n4 = R$string.newuser_username_error;
        object = hv3_0.K(n4);
        object12 = new xx0_0((String)object, (String)object9, (String)object2);
        object9 = az1_22.q;
        ((fv0_2)object9).d((EditText)clazz, (TextInputLayout)((Object)object11), (String)object3, (xx0_0)object12);
        clazz = az1_22.L;
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object10);
            n14 = 0;
            clazz = null;
        }
        n10 = R$string.newuser_username_error;
        object3 = hv3_0.K(n10);
        object9 = az1_22.t;
        ((fv0_2)object9).f((EditText)clazz, (String)object3);
        clazz = az1_22.z;
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralCodeCheckBox");
            n14 = 0;
            clazz = null;
        }
        object3 = new uz1_0(az1_22);
        clazz.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object3);
        clazz = this.getContext();
        object3 = "termsConditionsView";
        if (clazz != null) {
            object9 = Ey1.a;
            object9 = az1_22.D;
            if (object9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object9 = null;
            }
            object11 = this.getActivity();
            clazz = (gc3_2)((Object)clazz);
            clazz = Ey1.c((View)object9, (FragmentActivity)object11, (gc3_2)((Object)clazz), (String)object2);
        } else {
            n14 = 0;
            clazz = null;
        }
        object9 = az1_22.D;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            bl2 = false;
            object9 = null;
        }
        object9.setText((CharSequence)((Object)clazz));
        clazz = az1_22.D;
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n14 = 0;
            clazz = null;
        }
        object3 = LinkMovementMethod.getInstance();
        clazz.setMovementMethod((MovementMethod)object3);
        clazz = az1_22.M;
        object3 = "genderOption";
        if (clazz == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n14 = 0;
            clazz = null;
        }
        object9 = cp$a.e();
        object9.getClass();
        bl2 = cp_1.q();
        n7 = 8;
        object12 = "genderTitle";
        if (bl2 == bl3) {
            object9 = az1_22.M;
            if (object9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object9 = null;
            }
            object9.setVisibility(0);
            object9 = az1_22.P;
            if (object9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                bl2 = false;
                object9 = null;
            }
            object9.setVisibility(0);
            object9 = new tz1_0((View)object5, (RadioGroup)clazz, az1_22);
            clazz.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)object9);
        } else {
            object5 = az1_22.P;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object12);
                n3 = 0;
                object5 = null;
            }
            object5.setVisibility(n7);
            object5 = az1_22.M;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object5 = null;
            }
            object5.setVisibility(n7);
        }
        object5 = az1_22.M;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object5 = null;
        }
        if ((n3 = object5.getVisibility()) == 0) {
            object5 = az1_22.U;
            String string2 = object5.getPrevScreen();
            String string3 = object5.getPrevScreenType();
            int n19 = 1664;
            object12 = az1_22.X;
            object = "user accounts interactions";
            String string4 = "Gender impression";
            String string5 = "";
            String string6 = "user_account_interactions";
            String string7 = "signup screen";
            String string8 = "signup screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object12, (String)object, string4, string5, string6, string7, string8, string2, null, string3, false, null, n19, null);
        }
        if ((object5 = az1_22.K) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n3 = 0;
            object5 = null;
        }
        clazz = new cz1_0(az1_22);
        object5.addTextChangedListener((TextWatcher)clazz);
        object5 = az1_22.K;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n3 = 0;
            object5 = null;
        }
        clazz = new wz1_0(az1_22);
        object5.setOnFocusChangeListener((View.OnFocusChangeListener)clazz);
        object5 = az1_22.J;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n3 = 0;
            object5 = null;
        }
        clazz = new xz1(az1_22);
        object5.setOnFocusChangeListener((View.OnFocusChangeListener)clazz);
        object5 = az1_22.L;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object10);
            n3 = 0;
            object5 = null;
        }
        clazz = new yz1(az1_22);
        object5.setOnFocusChangeListener((View.OnFocusChangeListener)clazz);
        object5 = az1_22.J;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n3 = 0;
            object5 = null;
        }
        clazz = new Dz1(az1_22);
        object5.addTextChangedListener((TextWatcher)clazz);
        object5 = az1_22.L;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object10);
            n3 = 0;
            object5 = null;
        }
        clazz = new ez1_0(az1_22);
        object5.addTextChangedListener((TextWatcher)clazz);
        object5 = az1_22.K;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
            n3 = 0;
            object5 = null;
        }
        clazz = new zz1(az1_22);
        object5.setOnEditorActionListener((TextView.OnEditorActionListener)clazz);
        object5 = az1_22.J;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            n3 = 0;
            object5 = null;
        }
        clazz = new qz1_0(az1_22);
        object5.setOnEditorActionListener((TextView.OnEditorActionListener)clazz);
        object5 = az1_22.L;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(object10);
            n3 = 0;
            object5 = null;
        }
        clazz = new rz1(az1_22);
        object5.setOnEditorActionListener((TextView.OnEditorActionListener)clazz);
        object5 = az1_22.x;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralCodeETV");
            n3 = 0;
            object5 = null;
        }
        clazz = new sz1_0(az1_22);
        object5.setOnEditorActionListener((TextView.OnEditorActionListener)clazz);
        object5 = az1_22.E;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvEditNumberOrMailId");
            n3 = 0;
            object5 = null;
        }
        object5.setOnClickListener((View.OnClickListener)az1_22);
        object5 = az1_22.N;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n3 = 0;
            object5 = null;
        }
        object5.setOnClickListener((View.OnClickListener)az1_22);
        object5 = cp$a.e();
        object5.getClass();
        n3 = (int)(cp_1.f() ? 1 : 0);
        if (n3 != 0) {
            az1_22.Qa(bl3);
        }
        object5 = z40_0.Companion;
        object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a.b("signup_page_banner_config");
        clazz = SignUpConfig.class;
        if ((object5 = (SignUpConfig)JsonUtils.fromJson((String)object5, clazz)) != null) {
            clazz = object5.b();
            object7 = Boolean.TRUE;
            n14 = (int)(Intrinsics.areEqual(clazz, object7) ? 1 : 0);
        } else {
            n14 = 0;
            clazz = null;
        }
        object7 = "signUpBenefitBannerIv";
        if (n14 != 0) {
            if (object5 != null) {
                object5 = object5.a();
            } else {
                n3 = 0;
                object5 = null;
            }
            if (object5 != null && (n14 = object5.length()) != 0) {
                object4 = clazz = Uri.parse((String)object5).getPathSegments();
                object4 = (Collection)((Object)clazz);
                if (object4 != null && (n16 = (int)(object4.isEmpty() ? 1 : 0)) == 0 && (clazz = (String)CollectionsKt.T((List)((Object)clazz))) != null) {
                    object4 = AnalyticsManager.Companion;
                    ((AnalyticsManager$Companion)object4).getInstance().getGtmEvents().setScreenName((String)object2);
                    object4 = ((AnalyticsManager$Companion)object4).getInstance().getNewEEcommerceEventsRevamp();
                    object3 = "mobile - login/signup screen";
                    ((NewEEcommerceEventsRevamp)object4).setPrevScreen((String)object3);
                    uy1_0.c((String)((Object)clazz));
                }
                if ((clazz = az1_22.O) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n14 = 0;
                    clazz = null;
                }
                clazz.setVisibility(0);
                clazz = new da$a();
                ((da$a)((Object)clazz)).k = bl3;
                ((da$a)((Object)clazz)).g = bl3;
                AjioImageView ajioImageView = az1_22.O;
                if (ajioImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                } else {
                    object6 = ajioImageView;
                }
                ((da$a)((Object)clazz)).n = object5;
                ((da$a)((Object)clazz)).u = object6;
                ((da$a)((Object)clazz)).a();
            } else {
                object5 = az1_22.O;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                } else {
                    object6 = object5;
                }
                object6.setVisibility(n7);
            }
        } else {
            object5 = az1_22.O;
            if (object5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
            } else {
                object6 = object5;
            }
            object6.setVisibility(n7);
        }
        az1_22.Qa(false);
    }
}

