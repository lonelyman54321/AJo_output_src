/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.Color
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.utility.b;
import com.ril.ajio.web.CustomWebViewActivity;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Hw3
 */
public final class hw3_0
extends BottomSheetDialogFragment
implements View.OnClickListener,
nr2_2 {
    public static final Hw3$a Companion;
    public Activity a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public EditText g;
    public AjioLoaderView h;
    public AjioTextView i;
    public String j;
    public String k;
    public String l;
    public hy3_0 m;
    public b n;
    public OnFragmentInteractionListener o;
    public Hw3$b p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final String t;
    public final String u;
    public final NewCustomEventsRevamp v;
    public boolean w;
    public boolean x;
    public boolean y;
    public DeleteAccountInteractionListener z;

    static {
        Hw3$a hw3$a;
        Companion = hw3$a = new Object();
    }

    public hw3_0() {
        String string2;
        Object object = AnalyticsManager.Companion;
        this.t = string2 = bv_0.a((AnalyticsManager$Companion)object);
        this.u = string2 = cv_0.a((AnalyticsManager$Companion)object);
        this.v = object = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.y = true;
    }

    public static void Pa(String string2, String string3) {
        if (string2 == null) {
            string2 = "";
        }
        mq0_2.d(string2, string3);
    }

    public final void Oa() {
        boolean bl2;
        Object object = this.a;
        boolean bl3 = object instanceof AjioHomeActivity;
        if ((bl3 || (bl3 = object instanceof CustomWebViewActivity) || (bl2 = object instanceof ReturnImpsActivity)) && (object = this.h) != null) {
            ((AjioLoaderView)((Object)object)).stopLoader();
        }
    }

    public final void c8(String string2) {
        String string3 = "otp";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string3 = this.g;
            Intrinsics.checkNotNull(string3);
            string3.setText((CharSequence)string2);
        }
    }

    public final void onAttach(Context object) {
        ClassCastException classCastException2;
        Object object2;
        block5: {
            boolean bl2;
            block4: {
                object2 = "context";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                super.onAttach((Context)object);
                object = (Activity)object;
                this.a = object;
                bl2 = object instanceof OnFragmentInteractionListener;
                if (bl2) {
                    object2 = object;
                    try {
                        object2 = (OnFragmentInteractionListener)object;
                        break block4;
                    }
                    catch (ClassCastException classCastException2) {
                        break block5;
                    }
                }
                bl2 = false;
                object2 = null;
            }
            this.o = object2;
            bl2 = object instanceof CustomWebViewActivity;
            if (bl2) {
                object2 = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (DeleteAccountInteractionListener)object;
                this.z = object;
            }
            return;
        }
        yn3_0.a.e(classCastException2);
        object2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object2);
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        object2 = stringBuilder.toString();
        ClassCastException classCastException3 = new ClassCastException((String)object2);
        throw classCastException3;
    }

    public final void onClick(View view) {
        hw3_0 hw3_02 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.resend_otp;
        boolean bl2 = false;
        Object object3 = null;
        int n7 = 8;
        if (n3 == n4) {
            object = this.d;
            Intrinsics.checkNotNull(object);
            object.setVisibility(n7);
            object = this.e;
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
            object = this.n;
            if (object != null) {
                ((b)object).b(this);
            }
            object = hw3_02.c;
            Intrinsics.checkNotNull(object);
            object.setVisibility(n7);
            object = hw3_02.b;
            Intrinsics.checkNotNull(object);
            object.setVisibility(0);
            object = hw3_02.g;
            Intrinsics.checkNotNull(object);
            object.getText().clear();
            object = new Hw3$b(hw3_02);
            hw3_02.p = object;
            Intrinsics.checkNotNull(object);
            object.start();
            n3 = (int)(hw3_02.w ? 1 : 0);
            if (n3 != 0) {
                object = hw3_02.k;
                object2 = hw3_02.j;
                object3 = new vw3_0(hw3_02);
                object = (Unit)ai0_2.r((Function2)object3, object, object2);
            } else {
                object = hw3_02.k;
                object2 = hw3_02.j;
                object3 = new yw3_0(hw3_02);
                object = (Unit)ai0_2.r((Function2)object3, object, object2);
            }
        } else {
            n4 = R$id.confirm_otp_btn;
            if (n3 == n4) {
                object = this.g;
                Intrinsics.checkNotNull(object);
                object = object.getText().toString();
                n4 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
                if (n4 == 0) {
                    object2 = this.a;
                    bl2 = object2 instanceof AjioHomeActivity;
                    if ((bl2 || (bl2 = object2 instanceof CustomWebViewActivity) || (n4 = object2 instanceof ReturnImpsActivity) != 0) && (object2 = hw3_02.h) != null) {
                        ((AjioLoaderView)((Object)object2)).startLoader();
                    }
                    if ((n4 = (int)(hw3_02.w ? 1 : 0)) == 0 && (n4 = (int)(hw3_02.x ? 1 : 0)) == 0) {
                        object2 = hw3_02.m;
                        Intrinsics.checkNotNull(object2);
                        object3 = hw3_02.j;
                        Intrinsics.checkNotNull(object3);
                        object2.getClass();
                        Intrinsics.checkNotNullParameter(object, "otp");
                        Intrinsics.checkNotNullParameter(object3, "userPhoneNo");
                        Object object4 = new QueryCustomer();
                        ((QueryCustomer)object4).setMobileNumber((String)object3);
                        ((QueryCustomer)object4).setOtp((String)object);
                        object = ((hy3_0)object2).e.a();
                        ((QueryCustomer)object4).setAdId((String)object);
                        object = ((hy3_0)object2).g.verifyOtpAccessProfile((QueryCustomer)object4);
                        n7 = 2;
                        object3 = new pf1_2(object2, n7);
                        object4 = new qf1_2(1, (Function1)object3);
                        int n8 = 2;
                        object3 = new cx0_1(object2, n8);
                        int n10 = 1;
                        Object object5 = new rf1_2(n10, (Function1)object3);
                        object = ((g53_0)object).f((o60_0)object4, (o60_0)object5);
                        object2 = ((hy3_0)object2).x;
                        ((t30_0)object2).b((yr0_2)object);
                        object3 = hw3_02.v;
                        object4 = ((NewCustomEventsRevamp)object3).getEC_MY_ACC_INTERACTION();
                        String string2 = hw3_02.t;
                        String string3 = hw3_02.u;
                        object5 = "edit profile confirm otp";
                        String string4 = "";
                        String string5 = "edit_profile_confirm_otp";
                        String string6 = "my account screen";
                        String string7 = "my account screen";
                        int n14 = 1536;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, (String)object5, string4, string5, string6, string7, string2, null, string3, false, null, n14, null);
                    } else {
                        object2 = hw3_02.k;
                        object3 = hw3_02.j;
                        Object object6 = new zw3_0(hw3_02, (String)object);
                        ai0_2.r((Function2)object6, object2, object3);
                        n3 = (int)(hw3_02.w ? 1 : 0);
                        object2 = "Employee verify email screen";
                        if (n3 != 0) {
                            object = AnalyticsManager.Companion;
                            object3 = "verify email click";
                            object6 = "verification bottom screen";
                            tj2_0.e((AnalyticsManager$Companion)object, (String)object3, (String)object6, (String)object2);
                        } else {
                            n3 = (int)(hw3_02.x ? 1 : 0);
                            if (n3 != 0) {
                                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                                object3 = "verify and apply click";
                                object6 = hw3_02.l;
                                ((GTMEvents)object).pushButtonTapEvent((String)object3, object6, (String)object2);
                            }
                        }
                    }
                } else {
                    object = this.b;
                    if (object != null) {
                        object.setVisibility(n7);
                    }
                    if ((n3 = (int)(hw3_02.w ? 1 : 0)) == 0 && (n3 = (int)(hw3_02.x ? 1 : 0)) == 0) {
                        object = hw3_02.c;
                        if (object != null) {
                            n4 = R$string.otp_err_msg3;
                            object.setText(n4);
                        }
                    } else {
                        object = hw3_02.c;
                        if (object != null) {
                            n4 = R$string.otp_err_msg;
                            object.setText(n4);
                        }
                    }
                    if ((object = hw3_02.c) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = hw3_02.c) != null) {
                        ai0_2.a((View)object);
                    }
                }
            } else {
                n4 = R$id.close_dialog;
                if (n3 == n4 || n3 == (n4 = R$id.close_otp)) {
                    this.dismiss();
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        boolean bl2 = false;
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
        object = kd3_2.a();
        Object object2 = this.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        Object object3 = new UserRepo((Application)object2);
        object2 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object3;
        ((kd3_2)object).b = object2;
        Intrinsics.checkNotNull(object);
        object3 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object2 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        rd3_0 rd3_02 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object3 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
        object2 = hy3_0.class;
        String string3 = "modelClass";
        object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object3, (Class)object2, string3);
        object3 = "<this>";
        object2 = sw0_0.a((Class)object2, (String)object3, (Class)object2, string3, string3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.m = object = (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
            object = z40_0.Companion;
            object3 = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            object.getClass();
            this.r = bl2 = z40$a.a((Context)object3).a.a("otp_popup_display_mobile");
            object = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            this.s = bl2 = z40$a.a((Context)object).a.a("otp_popup_display_email");
            return;
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        Ew3 ew3 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)ew3);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_view_update_profile_otp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        Object object = this.n;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.a();
        }
        if ((object = this.p) != null) {
            Intrinsics.checkNotNull(object);
            object.cancel();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean bl2;
        Object object;
        int n3;
        Object object2;
        hw3_0 hw3_02;
        block49: {
            Object object3;
            block48: {
                String string2;
                int n4;
                block44: {
                    int n7;
                    int n8;
                    int n10;
                    Object object4;
                    String string3;
                    int n14;
                    int n15;
                    Bundle bundle2;
                    View view2;
                    block43: {
                        String string4;
                        block47: {
                            block46: {
                                String string5;
                                block45: {
                                    TextView textView;
                                    AjioTextView ajioTextView;
                                    AjioLoaderView ajioLoaderView;
                                    TextView textView2;
                                    EditText editText;
                                    TextView textView3;
                                    TextView textView4;
                                    TextView textView5;
                                    TextView textView6;
                                    hw3_02 = this;
                                    object2 = view;
                                    n3 = 1;
                                    n4 = 0;
                                    object3 = null;
                                    Intrinsics.checkNotNullParameter(view, "view");
                                    super.onViewCreated(view, bundle);
                                    int n16 = R$id.parent_layout;
                                    view2 = view.findViewById(n16);
                                    string2 = "findViewById(...)";
                                    Intrinsics.checkNotNullExpressionValue(view2, string2);
                                    view2 = (LinearLayout)view2;
                                    Looper looper = Looper.getMainLooper();
                                    Handler handler = new Handler(looper);
                                    Aw3 aw3 = new Aw3((LinearLayout)view2);
                                    long l2 = 100;
                                    handler.postDelayed((Runnable)aw3, l2);
                                    n16 = R$id.user_info_textview;
                                    view2 = (TextView)view.findViewById(n16);
                                    int n17 = R$id.otp_valid_time;
                                    this.b = textView6 = (TextView)view.findViewById(n17);
                                    n17 = R$id.error_msg;
                                    this.c = textView5 = (TextView)view.findViewById(n17);
                                    n17 = R$id.resend_otp;
                                    this.d = textView4 = (TextView)view.findViewById(n17);
                                    n17 = R$id.resend_otp_time;
                                    this.e = textView3 = (TextView)view.findViewById(n17);
                                    n17 = R$id.otp_edit_text;
                                    this.g = editText = (EditText)view.findViewById(n17);
                                    n17 = R$id.confirm_otp_btn;
                                    this.f = textView2 = (TextView)view.findViewById(n17);
                                    n17 = R$id.progress_bar;
                                    AjioProgressView ajioProgressView = (AjioProgressView)view.findViewById(n17);
                                    n17 = R$id.ajio_loader_view;
                                    this.h = ajioLoaderView = (AjioLoaderView)view.findViewById(n17);
                                    n17 = R$id.tvOtpHeading;
                                    this.i = ajioTextView = (AjioTextView)view.findViewById(n17);
                                    TextView textView7 = this.d;
                                    if (textView7 != null) {
                                        textView7.setOnClickListener((View.OnClickListener)this);
                                    }
                                    if ((textView = hw3_02.f) != null) {
                                        textView.setOnClickListener((View.OnClickListener)hw3_02);
                                    }
                                    bundle2 = this.getArguments();
                                    n15 = 8;
                                    if (bundle2 == null) break block44;
                                    hw3_02.q = n14 = bundle2.getBoolean("IS_IMPS");
                                    string5 = "INTENT_USER_EMAIL_ID";
                                    string3 = "";
                                    object4 = bundle2.getString(string5, string3);
                                    hw3_02.k = object4;
                                    object4 = Pattern.compile("(?<=.).(?=[^@]*?.@)", n15);
                                    string4 = hw3_02.k;
                                    object4 = ((Pattern)object4).matcher(string4);
                                    string4 = "*";
                                    hw3_02.k = object4 = ((Matcher)object4).replaceAll(string4);
                                    hw3_02.j = object4 = bundle2.getString("INTENT_USER_PHONE_NUMBER", string3);
                                    hw3_02.w = n10 = bundle2.getBoolean("INTENT_FRAUD_REDUCTION_FLOW", false);
                                    hw3_02.x = n10 = bundle2.getBoolean("INTENT_COUPON_FRAUD_REDUCTION_FLOW", false);
                                    hw3_02.l = object4 = bundle2.getString("INTENT_COUPON_CODE", string3);
                                    hw3_02.y = false;
                                    object4 = hw3_02.j;
                                    if (object4 != null && (n10 = ((String)object4).length()) != 0) {
                                        object4 = hw3_02.j;
                                        string4 = "+91";
                                        object4 = kp1_0.c(string4, (String)object4);
                                    } else {
                                        object4 = string3;
                                    }
                                    n8 = hw3_02.w;
                                    if (n8 == 0) break block45;
                                    n8 = R$string.otp_verify_official_email;
                                    String string6 = bundle2.getString(string5, string3);
                                    object = new Object[n3];
                                    object[0] = string6;
                                    object = hv3_0.L(n8, (Object[])object);
                                    break block43;
                                }
                                n8 = (int)(hw3_02.x ? 1 : 0);
                                if (n8 == 0) break block46;
                                n8 = R$string.verify_email_text;
                                String string7 = bundle2.getString(string5, string3);
                                object = new Object[n3];
                                object[0] = string7;
                                object = hv3_0.L(n8, (Object[])object);
                                break block43;
                            }
                            n14 = hw3_02.q;
                            if (n14 == 0) break block47;
                            n14 = hw3_02.s;
                            if (n14 != 0 && (n14 = hw3_02.r) != 0) {
                                String string8;
                                n14 = (int)(hw3_02.y ? 1 : 0);
                                if (n14 != 0 && (string8 = hw3_02.k) != null && (n14 = string8.length()) != 0) {
                                    n14 = R$string.imps_otp;
                                    string4 = hw3_02.k;
                                    n7 = 2;
                                    Object[] objectArray = new Object[n7];
                                    objectArray[0] = object4;
                                    objectArray[n3] = string4;
                                    object = hv3_0.L(n14, objectArray);
                                    break block43;
                                } else {
                                    n14 = R$string.imps_otp_phone;
                                    object = new Object[n3];
                                    object[0] = object4;
                                    object = hv3_0.L(n14, (Object[])object);
                                }
                                break block43;
                            } else {
                                n14 = hw3_02.r;
                                if (n14 != 0) {
                                    n14 = R$string.imps_otp_phone;
                                    object = new Object[n3];
                                    object[0] = object4;
                                    object = hv3_0.L(n14, (Object[])object);
                                    break block43;
                                } else {
                                    n14 = R$string.imps_otp_email;
                                    string4 = hw3_02.k;
                                    object = new Object[n3];
                                    object[0] = string4;
                                    object = hv3_0.L(n14, (Object[])object);
                                }
                            }
                            break block43;
                        }
                        n14 = hw3_02.s;
                        if (n14 != 0 && (n14 = hw3_02.r) != 0) {
                            String string9;
                            n14 = (int)(hw3_02.y ? 1 : 0);
                            if (n14 != 0 && (string9 = hw3_02.k) != null && (n14 = string9.length()) != 0) {
                                n14 = R$string.otp_user_info_single_text;
                                object = new Object[n3];
                                object[0] = object4;
                                object = hv3_0.L(n14, (Object[])object);
                            } else {
                                n14 = R$string.otp_user_info_single_text;
                                object = new Object[n3];
                                object[0] = object4;
                                object = hv3_0.L(n14, (Object[])object);
                            }
                        } else {
                            n14 = hw3_02.r;
                            if (n14 != 0) {
                                n14 = R$string.otp_user_info_single_text;
                                object = new Object[n3];
                                object[0] = object4;
                                object = hv3_0.L(n14, (Object[])object);
                            } else {
                                n14 = R$string.otp_user_info_single_text;
                                string4 = hw3_02.k;
                                object = new Object[n3];
                                object[0] = string4;
                                object = hv3_0.L(n14, (Object[])object);
                            }
                        }
                    }
                    n14 = hw3_02.w;
                    n8 = 6;
                    n7 = 18;
                    if (n14 == 0 && (n14 = (int)(hw3_02.x ? 1 : 0)) == 0) {
                        n14 = (int)(hw3_02.s ? 1 : 0);
                        String string10 = "#666666";
                        if (n14 != 0 && (n14 = (int)(hw3_02.r ? 1 : 0)) != 0) {
                            SpannableString spannableString = new SpannableString((CharSequence)object);
                            int n18 = StringsKt.O((CharSequence)object, (String)object4, 0, false, n8);
                            n10 = ((String)object4).length() + n18;
                            AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                            aJIOApplication$a.getClass();
                            object3 = mz3_0.t(AJIOApplication$a.a(), n15);
                            AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, (Typeface)object3);
                            n15 = Color.parseColor((String)string10);
                            object3 = new ForegroundColorSpan(n15);
                            spannableString.setSpan(object3, n18, n10, n7);
                            spannableString.setSpan((Object)ajioCustomTypefaceSpan, n18, n10, n7);
                            n4 = (int)(hw3_02.y ? 1 : 0);
                            if (n4 != 0 && (object3 = hw3_02.k) != null && (n4 = ((String)object3).length()) != 0) {
                                void var29_64;
                                object3 = hw3_02.k;
                                Intrinsics.checkNotNull(object3);
                                n15 = 0;
                                Object var12_26 = null;
                                n3 = StringsKt.O((CharSequence)object, (String)object3, 0, false, n8);
                                object3 = hw3_02.k;
                                if (object3 != null) {
                                    n4 = ((String)object3).length();
                                    Integer n19 = n4;
                                } else {
                                    Object var29_63 = null;
                                }
                                Intrinsics.checkNotNull(var29_64);
                                n4 = var29_64.intValue() + n3;
                                object4 = AJIOApplication$a.a();
                                n8 = 8;
                                object4 = mz3_0.t((AJIOApplication)object4, n8);
                                AjioCustomTypefaceSpan ajioCustomTypefaceSpan2 = new AjioCustomTypefaceSpan(string3, (Typeface)object4);
                                n10 = Color.parseColor((String)string10);
                                string3 = new ForegroundColorSpan(n10);
                                spannableString.setSpan((Object)string3, n3, n4, n7);
                                spannableString.setSpan((Object)ajioCustomTypefaceSpan2, n3, n4, n7);
                            }
                            view2.setText((CharSequence)spannableString);
                        } else {
                            n4 = (int)(hw3_02.r ? 1 : 0);
                            if (n4 != 0) {
                                object3 = new SpannableString((CharSequence)object);
                                Object var12_28 = null;
                                n3 = StringsKt.O((CharSequence)object, (String)object4, 0, false, n8);
                                n15 = ((String)object4).length() + n3;
                                AJIOApplication.Companion.getClass();
                                object4 = AJIOApplication$a.a();
                                n8 = 8;
                                object4 = mz3_0.t((AJIOApplication)object4, n8);
                                AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, (Typeface)object4);
                                n10 = Color.parseColor((String)string10);
                                string3 = new ForegroundColorSpan(n10);
                                object3.setSpan((Object)string3, n3, n15, n7);
                                object3.setSpan((Object)ajioCustomTypefaceSpan, n3, n15, n7);
                                view2.setText((CharSequence)object3);
                            } else {
                                object3 = hw3_02.k;
                                if (object3 != null && (n4 = ((String)object3).length()) != 0) {
                                    void var29_67;
                                    object3 = new SpannableString((CharSequence)object);
                                    String string11 = hw3_02.k;
                                    Intrinsics.checkNotNull(string11);
                                    n14 = 0;
                                    Object var18_46 = null;
                                    n3 = StringsKt.O((CharSequence)object, string11, 0, false, n8);
                                    String string12 = hw3_02.k;
                                    if (string12 != null) {
                                        n15 = string12.length();
                                        Integer n20 = n15;
                                    } else {
                                        Object var29_66 = null;
                                    }
                                    Intrinsics.checkNotNull(var29_67);
                                    n15 = var29_67.intValue() + n3;
                                    AJIOApplication.Companion.getClass();
                                    object4 = AJIOApplication$a.a();
                                    n8 = 8;
                                    object4 = mz3_0.t((AJIOApplication)object4, n8);
                                    AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, (Typeface)object4);
                                    n10 = Color.parseColor((String)string10);
                                    string3 = new ForegroundColorSpan(n10);
                                    object3.setSpan((Object)string3, n3, n15, n7);
                                    object3.setSpan((Object)ajioCustomTypefaceSpan, n3, n15, n7);
                                    view2.setText((CharSequence)object3);
                                }
                            }
                        }
                        string3 = null;
                    } else {
                        object3 = new SpannableString((CharSequence)object);
                        AJIOApplication.Companion.getClass();
                        AJIOApplication aJIOApplication = AJIOApplication$a.a();
                        n10 = 10;
                        Typeface typeface = mz3_0.t(aJIOApplication, n10);
                        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string3, typeface);
                        String string13 = "OTP";
                        string3 = null;
                        n14 = StringsKt.O((CharSequence)object, string13, 0, false, n8);
                        n3 = ((String)object).length();
                        object3.setSpan((Object)ajioCustomTypefaceSpan, n14, n3, n7);
                        view2.setText((CharSequence)object3);
                    }
                    object = "INTENT_IS_FROM_DELETE_ACCOUNT_JOURNEY";
                    n3 = (int)(bundle2.getBoolean((String)object, false) ? 1 : 0);
                    if (n3 != 0) {
                        object = AnalyticsManager.Companion;
                        String string14 = bv_0.a((AnalyticsManager$Companion)object);
                        String string15 = cv_0.a((AnalyticsManager$Companion)object);
                        object = hw3_02.v;
                        String string16 = "";
                        String string17 = "";
                        String string18 = "screen_view";
                        String string19 = "delete account opt half card";
                        String string20 = "delete account opt half card";
                        int n21 = 1668;
                        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string16, string17, null, string18, string19, string20, string14, null, string15, false, null, n21, null);
                    }
                }
                object = hw3_02.c;
                n4 = 8;
                if (object != null) {
                    object.setVisibility(n4);
                }
                if ((object = hw3_02.d) != null) {
                    object.setVisibility(n4);
                }
                if ((object = hw3_02.b) != null) {
                    n4 = 0;
                    object3 = null;
                    object.setVisibility(0);
                }
                if ((object = hw3_02.g) != null) {
                    object3 = new bw3_0(hw3_02);
                    object.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
                }
                object = com.ril.ajio.utility.b.Companion;
                object3 = hw3_02.a;
                Intrinsics.checkNotNull(object3);
                hw3_02.n = object = (b)((x63_0)object).a(object3);
                Intrinsics.checkNotNull(object);
                ((b)object).b(hw3_02);
                object = new Hw3$b(hw3_02);
                hw3_02.p = object;
                Intrinsics.checkNotNull(object);
                object.start();
                n3 = R$id.close_dialog;
                object2 = object2.findViewById(n3);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                object2 = (AppCompatImageButton)((Object)object2);
                object2.setOnClickListener((View.OnClickListener)hw3_02);
                bl2 = hw3_02.w;
                if (bl2 || (bl2 = hw3_02.x)) break block48;
                object2 = hw3_02.m;
                Intrinsics.checkNotNull(object2);
                object2 = ((hy3_0)object2).o;
                object = this.getViewLifecycleOwner();
                object3 = new fw3_0(hw3_02);
                ((LiveData)object2).e((mu1_1)object, (F62)object3);
                object2 = hw3_02.m;
                Intrinsics.checkNotNull(object2);
                object2 = ((hy3_0)object2).q;
                object = this.getViewLifecycleOwner();
                object3 = new gw3_0(hw3_02);
                ((LiveData)object2).e((mu1_1)object, (F62)object3);
                object2 = hw3_02.a;
                n3 = object2 instanceof AjioHomeActivity;
                if ((n3 != 0 || (n3 = object2 instanceof CustomWebViewActivity) != 0 || (bl2 = object2 instanceof ReturnImpsActivity)) && (object2 = hw3_02.h) != null) {
                    ((AjioLoaderView)((Object)object2)).startLoader();
                }
                object2 = hw3_02.k;
                object = hw3_02.j;
                object3 = new dw3_0(hw3_02);
                ai0_2.r((Function2)object3, object2, object);
                bl2 = hw3_02.q;
                if (bl2) {
                    object2 = hw3_02.i;
                    if (object2 != null) {
                        n3 = R$string.bank_transfer_otp;
                        object = hw3_02.getString(n3);
                        object2.setText((CharSequence)object);
                    }
                    break block49;
                } else {
                    object2 = hw3_02.i;
                    if (object2 != null) {
                        n3 = R$string.enter_otp_to_access_profile;
                        object = hw3_02.getString(n3);
                        object2.setText((CharSequence)object);
                    }
                }
                break block49;
            }
            object2 = hw3_02.m;
            if (object2 != null && (object2 = ((hy3_0)object2).p) != null) {
                object = this.getViewLifecycleOwner();
                object3 = new ww3_0(hw3_02);
                ((LiveData)object2).e((mu1_1)object, (F62)object3);
            }
            if ((object2 = hw3_02.m) != null && (object2 = ((hy3_0)object2).r) != null) {
                object = this.getViewLifecycleOwner();
                object3 = new xw3_0(hw3_02);
                ((LiveData)object2).e((mu1_1)object, (F62)object3);
            }
            object2 = hw3_02.k;
            object = hw3_02.j;
            object3 = new cw3_0(hw3_02);
            ai0_2.r((Function2)object3, object2, object);
            object2 = hw3_02.i;
            if (object2 != null) {
                n3 = R$string.verify_email_id;
                object = hw3_02.getString(n3);
                object2.setText((CharSequence)object);
            }
            object2 = AnalyticsManager.Companion;
            object = "Employee verify email screen";
            km_1.a((AnalyticsManager$Companion)object2, (String)object);
        }
        if (bl2 = hw3_02.w) {
            object2 = hw3_02.f;
            Intrinsics.checkNotNull(object2);
            n3 = R$string.verify;
            object = hw3_02.getString(n3);
            object2.setText((CharSequence)object);
            return;
        }
        bl2 = hw3_02.x;
        if (bl2) {
            object2 = hw3_02.f;
            Intrinsics.checkNotNull(object2);
            n3 = R$string.cta_verify_apply;
            object = hw3_02.getString(n3);
            object2.setText((CharSequence)object);
            return;
        }
        object2 = hw3_02.f;
        Intrinsics.checkNotNull(object2);
        n3 = R$string.confirm_otp_refresh;
        object = hw3_02.getString(n3);
        object2.setText((CharSequence)object);
    }
}

