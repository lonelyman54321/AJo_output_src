/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.InputFilter
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.text.method.DigitsKeyListener
 *  android.text.method.KeyListener
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.EditText
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
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
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from Lz1
 */
public final class lz1_2
extends K51
implements View.OnClickListener {
    public static final Lz1$a Companion;
    public TextView A;
    public fv0_2 B;
    public oa1_1 C;
    public AjioTextView D;
    public AjioTextView E;
    public TextInputEditText F;
    public TextView G;
    public TextInputLayout H;
    public Bundle I;
    public final NewEEcommerceEventsRevamp J;
    public final NewCustomEventsRevamp K;
    public final String L;
    public final String M;
    public String f;
    public AccountCheckResponse g;
    public boolean h;
    public com.ril.ajio.login.activity.a i;
    public TextView j;
    public TextView k;
    public RadioGroup l;
    public EditText m;
    public TextInputLayout n;
    public EditText o;
    public TextInputLayout p;
    public EditText q;
    public TextInputLayout r;
    public EditText s;
    public TextInputLayout t;
    public String u;
    public String v;
    public CheckBox w;
    public TextView x;
    public TextView y;
    public TextView z;

    static {
        Lz1$a lz1$a;
        Companion = lz1$a = new Object();
    }

    public lz1_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.J = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.K = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.L = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.M = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void Pa() {
        Object object;
        Object object2;
        block7: {
            boolean bl2;
            block4: {
                block6: {
                    block5: {
                        object2 = this.i;
                        if (object2 != null) {
                            object2.startLoader();
                        }
                        object2 = new QueryCustomer();
                        bl2 = this.h;
                        if (!bl2) break block4;
                        object = this.v;
                        if (object == null) break block5;
                        object = ((String)object).toLowerCase();
                        String string2 = "toLowerCase(...)";
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        if (object != null) break block6;
                    }
                    object = "";
                }
                ((QueryCustomer)object2).setEmail((String)object);
                bl2 = false;
                object = null;
                ((QueryCustomer)object2).setMobileNumberEnterered(false);
                break block7;
            }
            object = this.u;
            ((QueryCustomer)object2).setMobileNumber((String)object);
            bl2 = true;
            ((QueryCustomer)object2).setMobileNumberEnterered(bl2);
        }
        object = this.C;
        Intrinsics.checkNotNull(object);
        ((oa1_1)object).b((QueryCustomer)object2, "signup screen");
    }

    public final QueryCustomer Qa() {
        Object object;
        int n3;
        QueryCustomer queryCustomer = new QueryCustomer();
        Object object2 = this.m;
        Intrinsics.checkNotNull(object2);
        object2 = object2.getText();
        String string2 = null;
        if (object2 != null) {
            object2 = object2.toString();
        } else {
            n3 = 0;
            object2 = null;
        }
        queryCustomer.setFirstName((String)object2);
        object2 = this.s;
        Intrinsics.checkNotNull(object2);
        object2 = object2.getText();
        if (object2 != null) {
            object2 = object2.toString();
        } else {
            n3 = 0;
            object2 = null;
        }
        queryCustomer.setPassword((String)object2);
        queryCustomer.setRequestMode("SENDOTP");
        object2 = this.l;
        Intrinsics.checkNotNull(object2);
        n3 = object2.getCheckedRadioButtonId();
        int n4 = -1;
        if (n3 == n4) {
            object2 = "";
        } else {
            object2 = this.l;
            Intrinsics.checkNotNull(object2);
            object = this.l;
            Intrinsics.checkNotNull(object);
            n4 = object.getCheckedRadioButtonId();
            object2 = ((Object)((RadioButton)object2.findViewById(n4)).getText()).toString();
        }
        queryCustomer.setGender((String)object2);
        object2 = this.p;
        if (object2 != null) {
            ((TextInputLayout)((Object)object2)).setError(null);
        }
        if ((object2 = this.t) != null) {
            ((TextInputLayout)((Object)object2)).setError(null);
        }
        if ((object2 = this.n) != null) {
            ((TextInputLayout)((Object)object2)).setError(null);
        }
        object2 = this.q;
        Intrinsics.checkNotNull(object2);
        object2 = object2.getText();
        if (object2 != null) {
            object2 = object2.toString();
        } else {
            n3 = 0;
            object2 = null;
        }
        queryCustomer.setMobileNumber((String)object2);
        n3 = (int)(this.h ? 1 : 0);
        if (n3 != 0) {
            object2 = this.j;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getText();
            if (object2 != null) {
                object2 = object2.toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            queryCustomer.setMobileNumber((String)object2);
            object2 = this.o;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getText();
            if (object2 != null) {
                object2 = object2.toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            queryCustomer.setLogin((String)object2);
        } else {
            object2 = this.q;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getText();
            if (object2 != null) {
                object2 = object2.toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            queryCustomer.setMobileNumber((String)object2);
            object2 = this.k;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getText();
            if (object2 != null) {
                object2 = object2.toString();
            } else {
                n3 = 0;
                object2 = null;
            }
            queryCustomer.setLogin((String)object2);
        }
        object2 = this.F;
        object = "referralCodeETV";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            n3 = 0;
            object2 = null;
        }
        if ((object2 = ((AppCompatEditText)object2).getText()) != null) {
            object2 = object2.toString();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (n3 = object2.length()) != 0) {
            object2 = this.F;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                n3 = 0;
                object2 = null;
            }
            if ((object2 = ((AppCompatEditText)object2).getText()) != null) {
                string2 = object2.toString();
            }
            queryCustomer.setRilFnlRegisterReferralCode(string2);
        }
        return queryCustomer;
    }

    public final void Ra() {
        int n3;
        int n4 = 0;
        Object object = null;
        int n7 = 1;
        Object object2 = this.q;
        Intrinsics.checkNotNull(object2);
        object2.setInputType(3);
        object2 = this.B;
        int n8 = 0;
        String string2 = null;
        if (object2 != null) {
            n3 = ((fv0_2)object2).a.h();
            object2 = n3 != 0;
        } else {
            n3 = 0;
            object2 = null;
        }
        Object[] objectArray = Boolean.TRUE;
        n3 = Intrinsics.areEqual(object2, objectArray);
        if (n3 != 0) {
            object2 = this.w;
            Intrinsics.checkNotNull(object2);
            n3 = object2.isChecked();
            if (n3 == 0) {
                object2 = StringCompanionObject.INSTANCE;
                n3 = R$string.acc_error_message;
                object2 = hv3_0.K(n3);
                string2 = "You must agree to Terms and Conditions";
                objectArray = new Object[n7];
                objectArray[0] = string2;
                String string3 = "format(...)";
                String string4 = xh2_0.a(objectArray, n7, (String)object2, string3);
                hv3_0.o0(0, string2, string4);
            } else {
                Object object3 = this.i;
                if (object3 != null) {
                    object3.startLoader();
                }
                object3 = this.Qa();
                object2 = this.C;
                Intrinsics.checkNotNull(object2);
                object2.getClass();
                Intrinsics.checkNotNullParameter(object3, "<set-?>");
                ((oa1_1)object2).C = object3;
                object2 = this.C;
                Intrinsics.checkNotNull(object2);
                string2 = "signup screen";
                ((oa1_1)object2).o((QueryCustomer)object3, string2, false);
            }
        } else {
            object2 = this.q;
            Intrinsics.checkNotNull(object2);
            objectArray = DigitsKeyListener.getInstance((String)"0123456789");
            object2.setKeyListener((KeyListener)objectArray);
            object2 = this.s;
            Intrinsics.checkNotNull(object2);
            object2 = object2.getText();
            if (object2 != null && (object2 = object2.toString()) != null) {
                n8 = ((String)object2).length() - n7;
                int n10 = 0;
                objectArray = null;
                boolean bl2 = false;
                Object var9_10 = null;
                while (n10 <= n8) {
                    int n14 = !bl2 ? n10 : n8;
                    n14 = ((String)object2).charAt(n14);
                    int n15 = 32;
                    n14 = Intrinsics.compare(n14, n15);
                    n14 = n14 <= 0 ? 1 : 0;
                    if (!bl2) {
                        if (n14 == 0) {
                            bl2 = true;
                            continue;
                        }
                        n10 += n7;
                        continue;
                    }
                    if (n14 == 0) break;
                    n8 += -1;
                }
                string2 = com.jio.jioads.adinterfaces.a.a(n8, n7, n10, (String)object2);
            }
            if (string2 != null && (n4 = string2.length()) >= (n7 = 8)) {
                object = this.x;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.x) != null) {
                    n7 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n7);
                }
            } else {
                object = this.x;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.x) != null) {
                    n7 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n7);
                }
            }
            if ((n4 = (int)(((Matcher)(object = Pattern.compile("[!@#$%^*()_\\-+]").matcher(string2))).find() ? 1 : 0)) != 0) {
                object = this.y;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.y) != null) {
                    n7 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n7);
                }
            } else {
                object = this.y;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.y) != null) {
                    n7 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n7);
                }
            }
            if ((n4 = (int)(((Matcher)(object = Pattern.compile("[a-zA-Z]").matcher(string2))).find() ? 1 : 0)) != 0) {
                object = this.z;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.z) != null) {
                    n7 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n7);
                }
            } else {
                object = this.z;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.z) != null) {
                    n7 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n7);
                }
            }
            if ((n4 = (int)(((Matcher)(object = Pattern.compile("[0-9]").matcher(string2))).find() ? 1 : 0)) != 0) {
                object = this.A;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.A) != null) {
                    n7 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n7);
                }
            } else {
                object = this.A;
                if (object != null) {
                    n7 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n7);
                }
                if ((object = this.A) != null) {
                    n7 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n7);
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onActivityCreated(Bundle object) {
        String string2 = null;
        int n3 = 1;
        super.onActivityCreated((Bundle)object);
        String string3 = "owner";
        Intrinsics.checkNotNullParameter(this, string3);
        rd3_0 rd3_02 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, string3);
        Object object2 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, string3);
        Wd0 wd0 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object2, "factory");
        Intrinsics.checkNotNullParameter(wd0, "defaultCreationExtras");
        Object object3 = oa1_1.class;
        Object object4 = "modelClass";
        pD3 pD32 = rl3_0.b(rd3_02, (E$b)object2, wd0, object3, object4);
        String string4 = "<this>";
        object2 = sw0_0.a(object3, string4, object3, object4, object4);
        Intrinsics.checkNotNullParameter(object2, string4);
        String string5 = object2.getQualifiedName();
        if (string5 != null) {
            TextInputLayout textInputLayout;
            oa1_1 oa1_12;
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(string5);
            this.C = oa1_12 = (oa1_1)pD32.a((yn1_2)object2, string6);
            Intrinsics.checkNotNull(oa1_12);
            zr1_1 zr1_12 = oa1_12.l;
            mu1_1 mu1_12 = this.getViewLifecycleOwner();
            object2 = new gz1_2(this);
            zr1_12.e(mu1_12, (F62)object2);
            oa1_1 oa1_13 = this.C;
            Intrinsics.checkNotNull(oa1_13);
            zr1_1 zr1_13 = oa1_13.n;
            mu1_1 mu1_13 = this.getViewLifecycleOwner();
            object2 = new rx0_0(this, n3);
            zr1_13.e(mu1_13, (F62)object2);
            oa1_1 oa1_14 = this.C;
            Intrinsics.checkNotNull(oa1_14);
            zr1_1 zr1_14 = oa1_14.o;
            mu1_1 mu1_14 = this.getViewLifecycleOwner();
            object2 = new hz1_2(this);
            zr1_14.e(mu1_14, (F62)object2);
            String string7 = "format(...)";
            z40$a z40$a = z40_0.Companion;
            object2 = this.requireActivity().getApplication();
            object3 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            z40$a.getClass();
            ao0_0 ao0_02 = z40$a.a((Context)object2).a;
            int n4 = ao0_02.a("referral_feature_enable");
            object2 = "referralCodeInputLayout";
            object4 = null;
            if (n4 != 0) {
                Application application = this.requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(application, (String)object3);
                ao0_0 ao0_03 = z40$a.a((Context)application).a;
                Object object5 = "referee_enable";
                n4 = ao0_03.a((String)object5);
                if (n4 != 0) {
                    TextInputEditText textInputEditText;
                    void var4_40;
                    float f5;
                    TextInputLayout textInputLayout2 = this.H;
                    if (textInputLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n4 = 0;
                        Object var4_39 = null;
                        f5 = 0.0f;
                    }
                    var4_40.setVisibility(0);
                    String string8 = bv1_0.a;
                    object2 = "referralCodeETV";
                    if (string8 != null && (n4 = string8.length()) != 0) {
                        String string9;
                        void var1_18;
                        TextInputEditText textInputEditText2;
                        boolean bl2;
                        Object[] objectArray;
                        int n7;
                        String string10 = bv1_0.b;
                        object5 = "welcomeMsgTv";
                        if (string10 != null && (n4 = string10.length()) != 0) {
                            void var4_45;
                            AjioTextView ajioTextView = this.D;
                            if (ajioTextView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                n4 = 0;
                                Object var4_44 = null;
                                f5 = 0.0f;
                            }
                            n7 = R$string.invited_you;
                            Object[] objectArray2 = new Object[n3];
                            objectArray = bv1_0.b;
                            objectArray2[0] = objectArray;
                            object5 = hv3_0.L(n7, objectArray2);
                            var4_45.setText((CharSequence)object5);
                        } else {
                            void var4_48;
                            AjioTextView ajioTextView = this.D;
                            if (ajioTextView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                                n4 = 0;
                                Object var4_47 = null;
                                f5 = 0.0f;
                            }
                            n7 = R$string.invited_you_friend;
                            object5 = hv3_0.K(n7);
                            var4_48.setText((CharSequence)object5);
                        }
                        RefereeEarnCash refereeEarnCash = bv1_0.c;
                        if (refereeEarnCash != null) {
                            f5 = refereeEarnCash.getAmount();
                            object5 = null;
                            float f6 = f5 - 0.0f;
                            n7 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                            if (n7 > 0) {
                                void var1_14;
                                object5 = this.E;
                                String string11 = "referralAjioCashMsgTv";
                                if (object5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string11);
                                    n7 = 0;
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
                                    Intrinsics.checkNotNullExpressionValue(object3, string7);
                                }
                                catch (Exception exception) {
                                    objectArray = yn3_0.a;
                                    objectArray.e(exception);
                                    object3 = StringCompanionObject.INSTANCE;
                                    String string12 = qz2_0.x(Float.valueOf(f5));
                                    object3 = new Object[n3];
                                    object3[0] = string12;
                                    String string13 = "Signup to get %s AJIO Cash";
                                    object3 = xh2_0.a((Object[])object3, n3, string13, string7);
                                }
                                object5.setText((CharSequence)object3);
                                AjioTextView ajioTextView = this.E;
                                if (ajioTextView == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string11);
                                    bl2 = false;
                                    Object var1_13 = null;
                                }
                                var1_14.setVisibility(0);
                            }
                        }
                        if ((textInputEditText2 = this.F) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                            bl2 = false;
                            Object var1_17 = null;
                        }
                        string2 = bv1_0.a;
                        var1_18.setText((CharSequence)string2);
                        bv1_0.e = string9 = "used referal - auto filled";
                    }
                    if ((textInputEditText = this.F) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    } else {
                        object4 = textInputEditText;
                    }
                    mz1_0 mz1_02 = new mz1_0(this);
                    object4.addTextChangedListener((TextWatcher)mz1_02);
                    return;
                }
            }
            if ((textInputLayout = this.H) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object4 = textInputLayout;
            }
            int n8 = 8;
            object4.setVisibility(n8);
            return;
        }
        string2 = "Local and anonymous classes can not be ViewModels".toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof com.ril.ajio.login.activity.a;
        if (bl2) {
            object = (com.ril.ajio.login.activity.a)object;
            this.i = object;
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
        int n4 = R$id.login_new_user_fb_view;
        String string3 = "Social_login_used";
        String string4 = "signup screen";
        if (n3 == n4) {
            object = this.i;
            Intrinsics.checkNotNull(object);
            object.l1(string4);
            object = AnalyticsManager.Companion;
            string2 = "FB_login";
            tj2_0.e((AnalyticsManager$Companion)object, string3, string2, string4);
        } else {
            n4 = R$id.login_new_user_google_view;
            if (n3 == n4) {
                object = this.i;
                Intrinsics.checkNotNull(object);
                object.w0(string4);
                object = AnalyticsManager.Companion;
                string2 = "Gmail_login";
                tj2_0.e((AnalyticsManager$Companion)object, string3, string2, string4);
            } else {
                n4 = R$id.login_new_user_send_otp_tv;
                if (n3 == n4) {
                    this.Ra();
                } else {
                    n4 = R$id.login_new_user_mobile_edit_tv;
                    if (n3 == n4 || n3 == (n4 = R$id.login_new_user_email_edit_tv)) {
                        hv3_0.S(this.getActivity());
                        object = this.i;
                        Intrinsics.checkNotNull(object);
                        n4 = 0;
                        string2 = null;
                        string3 = null;
                        object.T(null, null, false);
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            String string2;
            this.f = string2 = object.getString("USER_INPUT_VALUE");
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object = pz1.a(object);
            } else {
                string2 = "param2";
                n3 = (object = object.getSerializable(string2)) instanceof AccountCheckResponse;
                if (n3 == 0) {
                    object = null;
                }
                object = (AccountCheckResponse)object;
            }
            object = (AccountCheckResponse)object;
            this.g = object;
        }
        this.I = object = new Bundle();
        object.putInt("Step_Number", 2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_login_new_user_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.K;
        String string2 = ((NewCustomEventsRevamp)object).getSTEP();
        Object object2 = this.I;
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
        string2 = this.I;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            string2 = null;
        }
        string2 = string2.getString("login_type", "");
        bundle.putString((String)object, string2);
        object = this.J;
        string5 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        String string6 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        object = this.K;
        object2 = "user account screen";
        ((NewCustomEventsRevamp)object).newPushCustomScreenView("signup screen", (String)object2, string5, bundle, string6);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        string2 = this.I;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
        } else {
            string3 = string2;
        }
        ((GTMEvents)object).pushOpenScreenEvent("signup screen", (Bundle)string3);
    }

    public final void onStop() {
        super.onStop();
        this.J.setPreviousScreenData("signup screen", "user account screen");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        int n3;
        lz1_2 lz1_22 = this;
        View view2 = view;
        int n4 = 0;
        Object object = null;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object object2 = this.i;
        if (object2 != null) {
            object2.s0(n7 != 0);
        }
        if ((object2 = lz1_22.i) != null) {
            object2.v0(false);
        }
        if ((object2 = lz1_22.i) != null) {
            n3 = R$color.accent_color_11;
            object2.F1(n3);
        }
        vz3_0 vz3_02 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
        lz1_22.B = object2 = new fv0_2(vz3_02);
        int n8 = R$id.login_new_user_mobile_view;
        object2 = view2.findViewById(n8);
        n3 = R$id.login_new_user_mobile_entry_tv;
        vz3_02 = (TextView)view2.findViewById(n3);
        lz1_22.j = vz3_02;
        n3 = R$id.login_new_user_mobile_edit_tv;
        vz3_02 = (TextView)view2.findViewById(n3);
        int n10 = R$id.login_new_user_email_view;
        Object object3 = view2.findViewById(n10);
        int n14 = R$id.login_new_user_email_entry_tv;
        lz1_22.k = textView = (TextView)view2.findViewById(n14);
        n14 = R$id.login_new_user_email_edit_tv;
        textView = (TextView)view2.findViewById(n14);
        int n15 = R$id.rg_newuser_gender_options;
        Object object4 = (RadioGroup)view2.findViewById(n15);
        lz1_22.l = object4;
        n15 = R$id.login_new_user_name_tiet;
        object4 = (EditText)view2.findViewById(n15);
        lz1_22.m = object4;
        n15 = R$id.login_new_user_name_til;
        object4 = (TextInputLayout)view2.findViewById(n15);
        lz1_22.n = object4;
        n15 = R$id.login_new_user_email_tiet;
        object4 = (EditText)view2.findViewById(n15);
        lz1_22.o = object4;
        n15 = R$id.login_new_user_email_til;
        object4 = (TextInputLayout)view2.findViewById(n15);
        lz1_22.p = object4;
        n15 = R$id.login_new_user_mobile_tiet;
        object4 = (EditText)view2.findViewById(n15);
        lz1_22.q = object4;
        n15 = R$id.login_new_user_mobile_til;
        object4 = (TextInputLayout)view2.findViewById(n15);
        lz1_22.r = object4;
        n15 = R$id.login_new_user_password_tiet;
        object4 = (EditText)view2.findViewById(n15);
        lz1_22.s = object4;
        n15 = R$id.login_new_user_password_til;
        object4 = (TextInputLayout)view2.findViewById(n15);
        lz1_22.t = object4;
        n15 = R$id.login_new_user_send_otp_tv;
        object4 = (TextView)view2.findViewById(n15);
        int n16 = R$id.login_new_user_t_and_c_cb;
        Object object5 = (CheckBox)view2.findViewById(n16);
        lz1_22.w = object5;
        n16 = R$id.login_new_user_password_character_limit_view;
        object5 = (TextView)view2.findViewById(n16);
        lz1_22.x = object5;
        n16 = R$id.login_new_user_password_numeric_limit_view;
        object5 = (TextView)view2.findViewById(n16);
        lz1_22.A = object5;
        n16 = R$id.login_new_user_password_special_limit_view;
        object5 = (TextView)view2.findViewById(n16);
        lz1_22.y = object5;
        n16 = R$id.login_new_user_password_alphabet_limit_view;
        object5 = (TextView)view2.findViewById(n16);
        lz1_22.z = object5;
        n16 = R$id.login_new_user_invalid_referral;
        object5 = (TextView)view2.findViewById(n16);
        lz1_22.G = object5;
        n16 = R$id.login_new_user_invite_code_til;
        object5 = (TextInputLayout)view2.findViewById(n16);
        lz1_22.H = object5;
        n16 = R$id.login_new_user_header_tv;
        object5 = (AjioTextView)view2.findViewById(n16);
        lz1_22.D = object5;
        n16 = R$id.login_ajio_cash_info;
        object5 = (AjioTextView)view2.findViewById(n16);
        lz1_22.E = object5;
        n16 = R$id.login_new_user_invite_code_tiet;
        object5 = (TextInputEditText)view2.findViewById(n16);
        lz1_22.F = object5;
        object5 = lz1_22.x;
        if (object5 != null) {
            object5 = object5.getText();
        } else {
            n16 = 0;
            object5 = null;
        }
        object5 = String.valueOf(object5);
        Object object6 = new SpannableStringBuilder((CharSequence)object5);
        Object object7 = this.getActivity();
        int n17 = 9;
        object7 = hv3_0.o(n17, (Context)object7);
        String string2 = "";
        Object object8 = new AjioCustomTypefaceSpan(string2, (Typeface)object7);
        object7 = " ";
        int n18 = 6;
        int n19 = StringsKt.O((CharSequence)object5, (String)object7, 0, false, n18);
        n4 = n19 + 1;
        n16 = ((String)object5).length();
        n7 = 34;
        object6.setSpan(object8, n4, n16, n7);
        object = lz1_22.x;
        if (object != null) {
            object.setText((CharSequence)object6);
        }
        if ((object = lz1_22.A) != null) {
            object = object.getText();
        } else {
            n4 = 0;
            object = null;
        }
        object = String.valueOf(object);
        object5 = new SpannableStringBuilder((CharSequence)object);
        object8 = this.getActivity();
        object8 = hv3_0.o(n17, (Context)object8);
        object6 = new AjioCustomTypefaceSpan(string2, (Typeface)object8);
        object8 = null;
        int n20 = StringsKt.O((CharSequence)object, (String)object7, 0, false, n18);
        int n21 = 1;
        n18 = n20 + 1;
        n4 = ((String)object).length();
        object5.setSpan(object6, n18, n4, n7);
        object = lz1_22.A;
        if (object != null) {
            object.setText((CharSequence)object5);
        }
        if ((object = lz1_22.y) != null) {
            object = object.getText();
        } else {
            n4 = 0;
            object = null;
        }
        object = String.valueOf(object);
        object5 = new SpannableStringBuilder((CharSequence)object);
        object6 = this.getActivity();
        object6 = hv3_0.o(n17, (Context)object6);
        Object object9 = new AjioCustomTypefaceSpan(string2, (Typeface)object6);
        object8 = null;
        n20 = StringsKt.O((CharSequence)object, (String)object7, 0, false, 6);
        int n22 = 1;
        n21 = n20 + 1;
        n4 = ((String)object).length();
        object5.setSpan(object9, n21, n4, n7);
        object = lz1_22.y;
        if (object != null) {
            object.setText((CharSequence)object5);
        }
        if ((object = lz1_22.z) != null) {
            object = object.getText();
        } else {
            n4 = 0;
            object = null;
        }
        object = String.valueOf(object);
        object5 = new SpannableStringBuilder((CharSequence)object);
        object6 = this.getActivity();
        object6 = hv3_0.o(n17, (Context)object6);
        object9 = new AjioCustomTypefaceSpan(string2, (Typeface)object6);
        object8 = null;
        n22 = StringsKt.O((CharSequence)object, (String)object7, 0, false, 6);
        n21 = 1;
        n4 = ((String)object).length();
        object5.setSpan(object9, n22 += n21, n4, n7);
        object = lz1_22.z;
        if (object != null) {
            object.setText((CharSequence)object5);
        }
        n4 = R$id.login_new_user_t_and_c_tv;
        object = (TextView)view2.findViewById(n4);
        Object object10 = this.getContext();
        object5 = "signup screen";
        if (object10 != null) {
            object9 = Ey1.a;
            Intrinsics.checkNotNull(object);
            object9 = this.getActivity();
            object10 = (gc3_2)((Object)object10);
            object10 = Ey1.c((View)object, (FragmentActivity)object9, (gc3_2)((Object)object10), (String)object5);
        } else {
            n7 = 0;
            object10 = null;
        }
        object.setText((CharSequence)object10);
        object10 = LinkMovementMethod.getInstance();
        object.setMovementMethod((MovementMethod)object10);
        object4.setOnClickListener((View.OnClickListener)lz1_22);
        object = lz1_22.o;
        Intrinsics.checkNotNull(object);
        object.setInputType(32);
        object = lz1_22.m;
        Intrinsics.checkNotNull(object);
        object10 = new Object();
        object4 = new InputFilter[1];
        object9 = null;
        object4[0] = object10;
        object.setFilters(object4);
        object = lz1_22.q;
        Intrinsics.checkNotNull(object);
        object.setInputType(3);
        object = lz1_22.q;
        Intrinsics.checkNotNull(object);
        object10 = DigitsKeyListener.getInstance((String)"0123456789");
        object.setKeyListener((KeyListener)object10);
        object = lz1_22.s;
        Intrinsics.checkNotNull(object);
        object10 = new iz1_0(lz1_22);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)object10);
        n4 = R$id.login_new_user_google_view;
        object = view2.findViewById(n4);
        object.setOnClickListener((View.OnClickListener)lz1_22);
        n7 = R$id.login_new_user_fb_view;
        object10 = view2.findViewById(n7);
        object10.setOnClickListener((View.OnClickListener)lz1_22);
        object4 = h40_0.a;
        n15 = (int)(h40_0.a1() ? 1 : 0);
        n18 = 8;
        if (n15 == 0) {
            object10.setVisibility(n18);
            n15 = 0;
            object4 = null;
        } else {
            n15 = 0;
            object4 = null;
            object10.setVisibility(0);
        }
        n7 = (int)(h40_0.g1() ? 1 : 0);
        if (n7 == 0) {
            object.setVisibility(n18);
        } else {
            object.setVisibility(0);
        }
        object = lz1_22.f;
        n4 = (int)(TextUtils.isDigitsOnly((CharSequence)object) ? 1 : 0);
        lz1_22.h = n4;
        object10 = "login_type";
        object4 = "eventBundle";
        if (n4 != 0) {
            object = lz1_22.I;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n4 = 0;
                object = null;
            }
            object4 = "mobile number";
            object.putString((String)object10, (String)object4);
            n4 = 0;
            object = null;
            object2.setVisibility(0);
            object10 = lz1_22.r;
            if (object10 != null) {
                object10.setVisibility(n18);
            }
            object3.setVisibility(n18);
            object10 = lz1_22.p;
            if (object10 != null) {
                object10.setVisibility(0);
            }
            object = lz1_22.j;
            Intrinsics.checkNotNull(object);
            object10 = lz1_22.f;
            object.setText((CharSequence)object10);
            object = lz1_22.f;
            lz1_22.u = object;
        } else {
            object = lz1_22.I;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n4 = 0;
                object = null;
            }
            object4 = "email address";
            object.putString((String)object10, (String)object4);
            object2.setVisibility(n18);
            object = lz1_22.r;
            n7 = 0;
            object10 = null;
            if (object != null) {
                object.setVisibility(0);
            }
            object3.setVisibility(0);
            object = lz1_22.p;
            if (object != null) {
                object.setVisibility(n18);
            }
            object = lz1_22.k;
            Intrinsics.checkNotNull(object);
            object10 = lz1_22.f;
            object.setText((CharSequence)object10);
            object = lz1_22.f;
            lz1_22.v = object;
        }
        object = lz1_22.B;
        object10 = "Registration form";
        if (object != null) {
            object2 = lz1_22.m;
            object3 = lz1_22.n;
            n15 = R$string.newuser_username_error;
            object4 = hv3_0.K(n15);
            n22 = R$string.newuser_username_error;
            object6 = hv3_0.K(n22);
            object9 = new xx0_0((String)object6, (String)object10, (String)object5);
            ((fv0_2)object).d((EditText)object2, (TextInputLayout)((Object)object3), (String)object4, (xx0_0)object9);
        }
        if ((n4 = (int)(lz1_22.h ? 1 : 0)) != 0) {
            object = lz1_22.B;
            if (object != null) {
                object2 = lz1_22.o;
                object3 = lz1_22.p;
                n15 = R$string.newuser_emailid_error;
                object4 = hv3_0.K(n15);
                n22 = R$string.newuser_emailid_error;
                object6 = hv3_0.K(n22);
                object9 = new xx0_0((String)object6, (String)object10, (String)object5);
                ((fv0_2)object).d((EditText)object2, (TextInputLayout)((Object)object3), (String)object4, (xx0_0)object9);
            }
        } else {
            object = lz1_22.B;
            if (object != null) {
                object2 = lz1_22.q;
                object3 = lz1_22.r;
                n15 = R$string.mobile_alert_text;
                object4 = hv3_0.K(n15);
                n22 = R$string.mobile_alert_text;
                object6 = hv3_0.K(n22);
                object9 = new xx0_0((String)object6, (String)object10, (String)object5);
                ((fv0_2)object).d((EditText)object2, (TextInputLayout)((Object)object3), (String)object4, (xx0_0)object9);
            }
        }
        if ((object = lz1_22.B) != null) {
            object2 = lz1_22.s;
            object3 = lz1_22.t;
            n15 = R$string.password_alert_text;
            object4 = hv3_0.K(n15);
            n22 = R$string.password_alert_text;
            object6 = hv3_0.K(n22);
            object9 = new xx0_0((String)object6, (String)object10, (String)object5);
            ((fv0_2)object).d((EditText)object2, (TextInputLayout)((Object)object3), (String)object4, (xx0_0)object9);
        }
        object = lz1_22.l;
        Intrinsics.checkNotNull(object);
        object10 = new jz1_0(view2, lz1_22);
        object.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener)object10);
        view2 = lz1_22.q;
        Intrinsics.checkNotNull(view2);
        object10 = lz1_22.q;
        Intrinsics.checkNotNull(object10);
        object = new Lz1$b(lz1_22, (EditText)object10);
        view2.addTextChangedListener((TextWatcher)object);
        view2 = lz1_22.m;
        Intrinsics.checkNotNull(view2);
        object10 = lz1_22.m;
        Intrinsics.checkNotNull(object10);
        object = new Lz1$b(lz1_22, (EditText)object10);
        view2.addTextChangedListener((TextWatcher)object);
        view2 = lz1_22.o;
        Intrinsics.checkNotNull(view2);
        object10 = lz1_22.o;
        Intrinsics.checkNotNull(object10);
        object = new Lz1$b(lz1_22, (EditText)object10);
        view2.addTextChangedListener((TextWatcher)object);
        view2 = lz1_22.s;
        Intrinsics.checkNotNull(view2);
        object10 = lz1_22.s;
        Intrinsics.checkNotNull(object10);
        object = new Lz1$b(lz1_22, (EditText)object10);
        view2.addTextChangedListener((TextWatcher)object);
        vz3_02.setOnClickListener(lz1_22);
        textView.setOnClickListener((View.OnClickListener)lz1_22);
    }
}

