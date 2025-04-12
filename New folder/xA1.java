/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
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
import com.ril.ajio.R$color;
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
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Login.QueryValidateOTP;
import com.ril.ajio.utility.validators.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class xA1
extends o51_0
implements View.OnClickListener {
    public static final xA1$a Companion;
    public final String A;
    public final String B;
    public String f;
    public String g;
    public EditText h;
    public TextView i;
    public TextInputLayout j;
    public fv0_2 k;
    public oa1_1 l;
    public hy3_0 m;
    public b52_0 n;
    public final hh3_2 o;
    public com.ril.ajio.login.activity.a p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public boolean u;
    public String v;
    public TextInputLayout w;
    public EditText x;
    public final NewEEcommerceEventsRevamp y;
    public final NewCustomEventsRevamp z;

    static {
        xA1$a xA1$a;
        Companion = xA1$a = new Object();
    }

    public xA1() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = new ao_2(this, 1);
        this.o = object = yr1_2.b((Function0)object);
        object = AnalyticsManager.Companion;
        this.y = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.z = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.A = object = newEEcommerceEventsRevamp.getPrevScreen();
        this.B = object = newEEcommerceEventsRevamp.getPrevScreenType();
    }

    public final void Pa() {
        int n3;
        Object object = this.k;
        Object object2 = "";
        int n4 = 32;
        ua1_2 ua1_22 = null;
        int n7 = 1;
        if (object != null && (n3 = ((Validator)(object = ((fv0_2)object).a)).h()) == n7) {
            object = this.x;
            boolean bl2 = false;
            if (object != null) {
                object = object.getText();
            } else {
                n3 = 0;
                object = null;
            }
            if (object != null && (n3 = object.length()) != 0) {
                int n8;
                object = this.x;
                if (object != null && (object = object.getText()) != null) {
                    object = object.toString();
                } else {
                    n3 = 0;
                    object = null;
                }
                Object object3 = this.h;
                Intrinsics.checkNotNull(object3);
                object3 = object3.getText();
                if (object3 != null) {
                    object3 = object3.toString();
                } else {
                    n8 = 0;
                    object3 = null;
                }
                n3 = (int)(kotlin.text.b.i((String)object, (String)object3, false) ? 1 : 0);
                if (n3 == 0) {
                    object = this.w;
                    if (object != null) {
                        int n10 = R$string.not_match_confirm_pass;
                        object2 = hv3_0.K(n10);
                        ((TextInputLayout)((Object)object)).setError((CharSequence)object2);
                    }
                } else {
                    int n14;
                    int n15;
                    Object object4;
                    object = this.h;
                    Intrinsics.checkNotNull(object);
                    object = object.getText();
                    if (object != null && (object = object.toString()) != null) {
                        n8 = ((String)object).length() - n7;
                        int n16 = 0;
                        object4 = null;
                        n15 = 0;
                        while (n16 <= n8) {
                            n14 = n15 == 0 ? n16 : n8;
                            n14 = Intrinsics.compare(((String)object).charAt(n14), n4);
                            n14 = n14 <= 0 ? 1 : 0;
                            if (n15 == 0) {
                                if (n14 == 0) {
                                    n15 = 1;
                                    continue;
                                }
                                ++n16;
                                continue;
                            }
                            if (n14 == 0) break;
                            n8 += -1;
                        }
                        object = com.jio.jioads.adinterfaces.a.a(n8, n7, n16, (String)object);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                    if (n3 == 0) {
                        hv3_0.S(this.getActivity());
                        object = this.f;
                        if (object != null) {
                            Object object5;
                            object3 = this.g;
                            Intrinsics.checkNotNull(object);
                            object4 = this.h;
                            Intrinsics.checkNotNull(object4);
                            object4 = object4.getText();
                            if (object4 != null && (object4 = object4.toString()) != null) {
                                n15 = ((String)object4).length() - n7;
                                n14 = 0;
                                boolean bl3 = false;
                                while (n14 <= n15) {
                                    int n17 = !bl3 ? n14 : n15;
                                    n17 = Intrinsics.compare(((String)object4).charAt(n17), n4);
                                    n17 = n17 <= 0 ? 1 : 0;
                                    if (!bl3) {
                                        if (n17 == 0) {
                                            bl3 = true;
                                            continue;
                                        }
                                        ++n14;
                                        continue;
                                    }
                                    if (n17 == 0) break;
                                    n15 += -1;
                                }
                                if ((object5 = com.jio.jioads.adinterfaces.a.a(n15, n7, n14, (String)object4)) != null) {
                                    object2 = object5;
                                }
                            }
                            if ((object5 = this.p) != null) {
                                object5.startLoader();
                            }
                            object5 = new QueryValidateOTP();
                            ((QueryValidateOTP)object5).setOtpReceived((String)object3);
                            object = ((String)object).toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(object, "toLowerCase(...)");
                            ((QueryValidateOTP)object5).setEmailId((String)object);
                            ((QueryValidateOTP)object5).setNewPass((String)object2);
                            object = this.l;
                            Intrinsics.checkNotNull(object);
                            object.getClass();
                            Intrinsics.checkNotNullParameter(object5, "queryValidateOTP");
                            Intrinsics.checkNotNullParameter("login - set password screen", "screenName");
                            object2 = md3_0.c((jD3)object);
                            ua1_22 = new ua1_2((oa1_1)object, (QueryValidateOTP)object5, null);
                            n3 = 3;
                            Ae3.d((i90_0)object2, null, null, ua1_22, n3);
                        }
                    }
                }
            } else {
                object = this.w;
                if (object != null) {
                    int n18 = R$string.please_confirm_pass;
                    object2 = hv3_0.K(n18);
                    ((TextInputLayout)((Object)object)).setError((CharSequence)object2);
                }
            }
        } else {
            object = this.h;
            Intrinsics.checkNotNull(object);
            object = object.getText();
            if (object != null && (object = object.toString()) != null) {
                int n19 = ((String)object).length() - n7;
                int n20 = 0;
                Object var8_10 = null;
                boolean bl4 = false;
                Object var12_20 = null;
                while (n20 <= n19) {
                    int n21 = !bl4 ? n20 : n19;
                    n21 = Intrinsics.compare(((String)object).charAt(n21), n4);
                    n21 = n21 <= 0 ? 1 : 0;
                    if (!bl4) {
                        if (n21 == 0) {
                            bl4 = true;
                            continue;
                        }
                        ++n20;
                        continue;
                    }
                    if (n21 == 0) break;
                    n19 += -1;
                }
                if ((object = com.jio.jioads.adinterfaces.a.a(n19, n7, n20, (String)object)) != null) {
                    object2 = object;
                }
            }
            if ((n3 = ((String)object2).length()) >= (n4 = 8)) {
                object = this.q;
                if (object != null) {
                    n4 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n4);
                }
                if ((object = this.q) != null) {
                    n4 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n4);
                }
            } else {
                object = this.q;
                if (object != null) {
                    n4 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n4);
                }
                if ((object = this.q) != null) {
                    n4 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n4);
                }
            }
            if ((n3 = (int)(((Matcher)(object = Pattern.compile("[!@#$%^*()_\\-+]").matcher((CharSequence)object2))).find() ? 1 : 0)) != 0) {
                object = this.r;
                if (object != null) {
                    n4 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n4);
                }
                if ((object = this.r) != null) {
                    n4 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n4);
                }
            } else {
                object = this.r;
                if (object != null) {
                    n4 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n4);
                }
                if ((object = this.r) != null) {
                    n4 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n4);
                }
            }
            if ((n3 = (int)(((Matcher)(object = Pattern.compile("[a-zA-Z]").matcher((CharSequence)object2))).find() ? 1 : 0)) != 0) {
                object = this.s;
                if (object != null) {
                    n4 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n4);
                }
                if ((object = this.s) != null) {
                    n4 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n4);
                }
            } else {
                object = this.s;
                if (object != null) {
                    n4 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n4);
                }
                if ((object = this.s) != null) {
                    n4 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n4);
                }
            }
            if ((n3 = (int)(((Matcher)(object = Pattern.compile("[0-9]").matcher((CharSequence)object2))).find() ? 1 : 0)) != 0) {
                int n22;
                object = this.t;
                if (object != null) {
                    n22 = R$drawable.rounded_rect_1a00bf76;
                    object.setBackgroundResource(n22);
                }
                if ((object = this.t) != null) {
                    n22 = hv3_0.m(R$color.accent_color_2);
                    object.setTextColor(n22);
                }
            } else {
                int n24;
                object = this.t;
                if (object != null) {
                    n24 = R$drawable.rounded_rect_1aff7676;
                    object.setBackgroundResource(n24);
                }
                if ((object = this.t) != null) {
                    n24 = hv3_0.m(R$color.accent_color_20);
                    object.setTextColor(n24);
                }
            }
        }
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.l;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).p;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        F62 f62 = new uA1(this);
        ((LiveData)object).e(mu1_12, f62);
        object = this.l;
        Intrinsics.checkNotNull(object);
        object = ((oa1_1)object).n;
        mu1_12 = this.getViewLifecycleOwner();
        f62 = new vA1(this);
        ((LiveData)object).e(mu1_12, f62);
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof com.ril.ajio.login.activity.a;
        if (bl2) {
            object = (com.ril.ajio.login.activity.a)object;
            this.p = object;
        }
    }

    public final void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.login_set_password_continue_tv;
        if (n3 == n4) {
            this.Pa();
        } else {
            n4 = R$id.login_set_password_do_later_tv;
            if (n3 == n4 && (object = this.p) != null) {
                n4 = 0;
                string2 = null;
                boolean bl2 = true;
                object.m0(null, null, bl2, false);
            }
        }
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            object = this.requireArguments().getString("param1");
            this.f = object;
            object = this.requireArguments().getString("param2");
            this.g = object;
            this.requireArguments().getString("param3");
            this.u = bl2 = this.requireArguments().getBoolean("ISINPUTMOBILENUMBER");
            object = this.requireArguments();
            object2 = "INPUT_MOBILE_EMAILID";
            object = object.getString((String)object2);
            this.v = object;
        }
        object = kd3_2.a();
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object3 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object4 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Class<b52_0> clazz = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object4, string3);
        String string4 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(clazz, string4);
        Class<hy3_0> clazz2 = oa1_1.class;
        String string5 = "modelClass";
        object3 = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)((Object)clazz), clazz2, string5);
        object4 = "<this>";
        clazz = ef0_0.a(clazz2, string5, string5, (String)object4);
        clazz2 = clazz.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (clazz2 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            clazz2 = string7.concat((String)((Object)clazz2));
            this.l = object3 = (oa1_1)((pD3)object3).a((yn1_2)((Object)clazz), (String)((Object)clazz2));
            clazz = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(clazz, "getApplication(...)");
            object3 = new UserRepo((Application)clazz);
            clazz = this.requireActivity().getApplication();
            ((kd3_2)object).a = object3;
            ((kd3_2)object).b = clazz;
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object, string3);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            clazz = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, string2);
            Intrinsics.checkNotNullParameter(object, string3);
            Intrinsics.checkNotNullParameter(clazz, string4);
            clazz2 = hy3_0.class;
            object = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)((Object)clazz), clazz2, string5);
            object3 = ef0_0.a(clazz2, string5, string5, (String)object4);
            clazz = object3.getQualifiedName();
            if (clazz != null) {
                clazz = string7.concat((String)((Object)clazz));
                this.m = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)((Object)clazz));
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object = this.getViewModelStore();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object3 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(this, (String)object2);
                object2 = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(object, string2);
                Intrinsics.checkNotNullParameter(object3, string3);
                Intrinsics.checkNotNullParameter(object2, string4);
                clazz = b52_0.class;
                object = rl3_0.b((rd3_0)object, (E$b)object3, (Wd0)object2, clazz, string5);
                object2 = ef0_0.a(clazz, string5, string5, (String)object4);
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = string7.concat((String)object3);
                    this.n = object = (b52_0)((pD3)object).a((yn1_2)object2, (String)object3);
                    return;
                }
                object2 = string6.toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object2 = string6.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string6.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_login_set_password_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        int n3 = 4;
        Object object = dk0.a(n3, "Step_Number");
        AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("login - set password screen", (Bundle)object);
        Bundle bundle = new Bundle();
        object = this.z.getSTEP();
        bundle.putInt((String)object, n3);
        String string2 = this.A;
        String string3 = this.B;
        this.z.newPushCustomScreenView("set new password", "user account screen", string2, bundle, string3);
    }

    public final void onStop() {
        super.onStop();
        this.y.setPreviousScreenData("set new password", "user account screen");
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.p;
        int n3 = 1;
        if (object2 != null) {
            object2.s0(n3 != 0);
        }
        object2 = this.p;
        int n4 = 0;
        TextInputLayout textInputLayout = null;
        if (object2 != null) {
            object2.v0(false);
        }
        km_1.a(AnalyticsManager.Companion, "Confirm your password/Login");
        int n7 = R$id.login_set_password_header_tv;
        object2 = (AjioTextView)object.findViewById(n7);
        n7 = R$id.login_set_password_tiet;
        object2 = (EditText)object.findViewById(n7);
        this.h = object2;
        n7 = R$id.login_set_password_til;
        object2 = (TextInputLayout)object.findViewById(n7);
        this.j = object2;
        n7 = R$id.login_set_password_continue_tv;
        object2 = (TextView)object.findViewById(n7);
        this.i = object2;
        n7 = R$id.login_set_password_character_limit_view;
        object2 = (TextView)object.findViewById(n7);
        this.q = object2;
        n7 = R$id.login_set_password_numeric_limit_view;
        object2 = (TextView)object.findViewById(n7);
        this.t = object2;
        n7 = R$id.login_set_password_special_limit_view;
        object2 = (TextView)object.findViewById(n7);
        this.r = object2;
        n7 = R$id.login_set_password_alphabet_limit_view;
        object2 = (TextView)object.findViewById(n7);
        this.s = object2;
        n7 = R$id.login_set_password_confirm_til;
        object2 = (TextInputLayout)object.findViewById(n7);
        this.w = object2;
        n7 = R$id.login_set_password_confirm_tiet;
        object2 = (EditText)object.findViewById(n7);
        this.x = object2;
        object2 = this.q;
        int n8 = 0;
        CharSequence charSequence = null;
        if (object2 != null) {
            object2 = object2.getText();
        } else {
            n7 = 0;
            object2 = null;
        }
        object2 = String.valueOf(object2);
        Object object4 = new SpannableStringBuilder((CharSequence)object2);
        Object object5 = this.getActivity();
        int n10 = 9;
        object5 = hv3_0.o(n10, (Context)object5);
        String string2 = "";
        Object object6 = new AjioCustomTypefaceSpan(string2, (Typeface)object5);
        object5 = " ";
        int n14 = 6;
        int n15 = StringsKt.O((CharSequence)object2, (String)object5, 0, false, n14) + n3;
        n7 = ((String)object2).length();
        int n16 = 34;
        object4.setSpan(object6, n15, n7, n16);
        object2 = this.q;
        if (object2 != null) {
            object2.setText((CharSequence)object4);
        }
        if ((object2 = this.t) != null) {
            object2 = object2.getText();
        } else {
            n7 = 0;
            object2 = null;
        }
        object2 = String.valueOf(object2);
        object4 = new SpannableStringBuilder((CharSequence)object2);
        FragmentActivity fragmentActivity = this.getActivity();
        fragmentActivity = hv3_0.o(n10, (Context)fragmentActivity);
        object6 = new AjioCustomTypefaceSpan(string2, (Typeface)fragmentActivity);
        n15 = StringsKt.O((CharSequence)object2, (String)object5, 0, false, n14) + n3;
        n7 = ((String)object2).length();
        object4.setSpan(object6, n15, n7, n16);
        object2 = this.t;
        if (object2 != null) {
            object2.setText((CharSequence)object4);
        }
        if ((object2 = this.r) != null) {
            object2 = object2.getText();
        } else {
            n7 = 0;
            object2 = null;
        }
        object2 = String.valueOf(object2);
        object4 = new SpannableStringBuilder((CharSequence)object2);
        fragmentActivity = this.getActivity();
        fragmentActivity = hv3_0.o(n10, (Context)fragmentActivity);
        object6 = new AjioCustomTypefaceSpan(string2, (Typeface)fragmentActivity);
        n15 = StringsKt.O((CharSequence)object2, (String)object5, 0, false, n14) + n3;
        n7 = ((String)object2).length();
        object4.setSpan(object6, n15, n7, n16);
        object2 = this.r;
        if (object2 != null) {
            object2.setText((CharSequence)object4);
        }
        if ((object2 = this.s) != null) {
            charSequence = object2.getText();
        }
        object2 = String.valueOf(charSequence);
        charSequence = new SpannableStringBuilder((CharSequence)object2);
        object6 = this.getActivity();
        object6 = hv3_0.o(n10, (Context)object6);
        object4 = new AjioCustomTypefaceSpan(string2, (Typeface)object6);
        n4 = StringsKt.O((CharSequence)object2, (String)object5, 0, false, n14) + n3;
        n7 = ((String)object2).length();
        charSequence.setSpan(object4, n4, n7, n16);
        object2 = this.s;
        if (object2 != null) {
            object2.setText(charSequence);
        }
        n7 = R$id.login_set_password_do_later_tv;
        object = (AjioTextView)object.findViewById(n7);
        object3 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
        this.k = object2 = new fv0_2((vz3_0)((Object)object3));
        object3 = this.h;
        textInputLayout = this.j;
        n8 = R$string.password_alert_text;
        charSequence = this.getString(n8);
        int n17 = R$string.password_alert_text;
        object6 = hv3_0.K(n17);
        object5 = "login - set password screen";
        String string3 = "Login Form";
        object4 = new xx0_0((String)object6, string3, (String)object5);
        ((fv0_2)object2).d((EditText)object3, textInputLayout, (String)charSequence, (xx0_0)object4);
        object2 = this.h;
        Intrinsics.checkNotNull(object2);
        object3 = new wA1(this);
        object2.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        object2 = this.i;
        Intrinsics.checkNotNull(object2);
        object2.setOnClickListener((View.OnClickListener)this);
        object.setOnClickListener((View.OnClickListener)this);
        object = this.h;
        Intrinsics.checkNotNull(object);
        object2 = new xA1$b(this);
        object.addTextChangedListener((TextWatcher)object2);
        object = this.x;
        if (object != null) {
            object2 = new xA1$c(this);
            object.addTextChangedListener((TextWatcher)object2);
        }
    }
}

