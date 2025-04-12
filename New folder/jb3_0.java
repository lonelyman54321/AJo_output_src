/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Payment.Tenant;
import com.ril.ajio.services.data.Payment.TenantResponse;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.utility.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/*
 * Renamed from jB3
 */
public final class jb3_0
extends BottomSheetDialogFragment
implements View.OnClickListener,
nr2_2 {
    public static final jB3$a Companion;
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public EditText g;
    public AjioLoaderView h;
    public AppCompatImageView i;
    public TextView j;
    public jB3$b k;
    public final hh3_2 l;
    public b m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public final D r;
    public final D s;
    public boolean t;

    static {
        jB3$a jB3$a;
        Companion = jB3$a = new Object();
    }

    public jb3_0() {
        Object object = new on0_1(this, 1);
        this.l = object = yr1_2.b((Function0)object);
        object = new jB3$g(this);
        Object object2 = et1_2.NONE;
        Lambda lambda = new jB3$h((jB3$g)object);
        object = yr1_2.a(object2, lambda);
        object2 = Reflection.getOrCreateKotlinClass(mb3_0.class);
        super((rq1_2)object);
        Lambda lambda2 = new jB3$j((rq1_2)object);
        jB3$k jB3$k = new jB3$k(this, (rq1_2)object);
        this.r = object = LW0.a(this, (yn1_2)object2, lambda, lambda2, jB3$k);
        object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        super(this);
        super(this);
        super(this);
        this.s = object = LW0.a(this, (yn1_2)object, (Function0)object2, lambda, lambda2);
    }

    public static void Pa(String string2, String string3) {
        if (string2 == null) {
            string2 = "";
        }
        mq0_2.d(string2, string3);
    }

    public final void Oa(String string2, boolean bl2) {
        Object object;
        Bundle bundle = new Bundle();
        if (bl2) {
            string2 = "submit - success";
        } else if (string2 != null && (bl2 = string2.length())) {
            bundle.putString("error_msg", string2);
            object = "submit - failure - ";
            string2 = ((String)object).concat(string2);
        } else {
            string2 = "submit - failure";
        }
        bl2 = this.t;
        if (bl2) {
            object = AnalyticsManager.Companion.getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
            String string3 = "bag interactions";
            String string4 = "wallet verify";
            String string5 = "checkout_wallet_verify_submit";
            String string6 = "bag screen";
            String string7 = string2;
            gTMEvents.pushBagInteractionsEvent(string3, string4, string2, string5, string6, bundle);
        } else {
            object = AnalyticsManager.Companion.getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
            String string8 = "single page checkout";
            String string9 = "wallet verify";
            String string10 = "checkout_wallet_verify_submit";
            String string11 = string2;
            Bundle bundle2 = bundle;
            gTMEvents.pushCheckoutInteractionsEvent(string9, string2, string10, string8, bundle);
        }
    }

    public final void c8(String string2) {
        String string3 = "otp";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string3 = this.g;
            if (string3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otpEditText");
                bl2 = false;
                string3 = null;
            }
            string3.setText((CharSequence)string2);
        }
    }

    public final void onClick(View view) {
        jb3_0 jb3_02 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, object);
        int n3 = view.getId();
        int n4 = R$id.resend_otp;
        int n7 = 3;
        Object object3 = "mobile";
        Object object4 = this.s;
        Object object5 = this.r;
        String string2 = "otpEditText";
        String string3 = "validMsg";
        int n8 = 8;
        String string4 = "errorMsgTv";
        Object object6 = null;
        if (n3 == n4) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resendOtpBtn");
                n3 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = jb3_02.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resendOtpTimerTv");
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = jb3_02.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otpSendIn");
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = jb3_02.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n3 = 0;
                object = null;
            }
            object.setVisibility(n8);
            object = jb3_02.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = jb3_02.g;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object.getText().clear();
            object = new jB3$b(jb3_02);
            jb3_02.k = object;
            object.start();
            object = jb3_02.o;
            if (object != null && (n3 = object.length()) != 0 && (object = jb3_02.n) != null && (n3 = object.length()) != 0) {
                object = (mb3_0)((D)object5).getValue();
                object2 = jb3_02.n;
                Intrinsics.checkNotNull(object2);
                object4 = ((kj2_1)((D)object4).getValue()).E;
                object4 = object4 != null ? ((TenantResponse)object4).getTenant() : null;
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = md3_0.c((jD3)object);
                object5 = new kb3_0((mb3_0)object, (String)object2, (Tenant)object4, null);
                Ae3.d((i90_0)object3, null, null, (Function2)object5, n7);
            }
            object = AnalyticsManager.Companion;
            object2 = "single page checkout";
            String string5 = "spc wallet verify otp resend";
            object3 = "";
            tj2_0.e((AnalyticsManager$Companion)object, string5, (String)object3, (String)object2);
            n4 = (int)(jb3_02.t ? 1 : 0);
            if (n4 != 0) {
                object = ((AnalyticsManager$Companion)object).getInstance();
                object2 = ((AnalyticsManager)object).getGtmEvents();
                n8 = 32;
                string4 = null;
                string5 = "bag interactions";
                object3 = "wallet verify";
                object4 = "otp resend";
                object5 = "checkout_wallet_verify_resend_otp";
                string2 = "bag screen";
                boolean bl2 = false;
                string3 = null;
                GTMEvents.pushBagInteractionsEvent$default((GTMEvents)object2, string5, (String)object3, (String)object4, (String)object5, string2, null, n8, null);
            } else {
                object = ((AnalyticsManager$Companion)object).getInstance();
                object2 = ((AnalyticsManager)object).getGtmEvents();
                int n10 = 16;
                n8 = 0;
                string5 = "wallet verify";
                object3 = "otp resend";
                object4 = "checkout_wallet_verify_resend_otp";
                object5 = "single page checkout";
                string2 = null;
                GTMEvents.pushCheckoutInteractionsEvent$default((GTMEvents)object2, string5, (String)object3, (String)object4, (String)object5, null, n10, null);
            }
        } else {
            n4 = R$id.confirm_otp_btn;
            if (n3 == n4) {
                String string6;
                object = this.g;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object = null;
                }
                if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(string6 = (object = object.getText()).toString())) ? 1 : 0)) == 0) {
                    object = jb3_02.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loaderView");
                        n3 = 0;
                        object = null;
                    }
                    ((AjioLoaderView)((Object)object)).startLoader();
                    object = jb3_02.n;
                    if (object != null && (n3 = object.length()) != 0) {
                        Object object7 = object = ((D)object5).getValue();
                        object7 = (mb3_0)object;
                        object = jb3_02.n;
                        Intrinsics.checkNotNull(object);
                        object2 = ((kj2_1)((D)object4).getValue()).E;
                        object7.getClass();
                        Intrinsics.checkNotNullParameter(string6, "otp");
                        Intrinsics.checkNotNullParameter(object, (String)object3);
                        object3 = md3_0.c((jD3)object7);
                        object4 = new lb3_1((mb3_0)object7, string6, (String)object, (TenantResponse)object2, null);
                        Ae3.d((i90_0)object3, null, null, (Function2)object4, n7);
                    }
                } else {
                    object = jb3_02.j;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    }
                    object.setVisibility(n8);
                    object = jb3_02.c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    n4 = R$string.otp_err_msg3;
                    object.setText(n4);
                    object = jb3_02.c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    object.setVisibility(0);
                    object = jb3_02.c;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                    } else {
                        object6 = object;
                    }
                    ai0_2.a((View)object6);
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
        boolean bl2;
        super.onCreate((Bundle)object);
        object = kd3_2.a();
        Application application = this.requireActivity().getApplication();
        String string2 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(application, string2);
        UserRepo userRepo = new UserRepo(application);
        application = this.requireActivity().getApplication();
        ((kd3_2)object).a = userRepo;
        ((kd3_2)object).b = application;
        object = z40_0.Companion;
        userRepo = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(userRepo, string2);
        object.getClass();
        this.p = bl2 = z40$a.a((Context)userRepo).a.a("otp_popup_display_mobile");
        object = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.q = bl2 = z40$a.a((Context)object).a.a("otp_popup_display_email");
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        gb3_2 gb3_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)gb3_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.verify_otp_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.verify_otp_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        AjioLoaderView ajioLoaderView = this.h;
        if (ajioLoaderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loaderView");
            ajioLoaderView = null;
        }
        ajioLoaderView.stopLoader();
    }

    public final void onDetach() {
        Object object = this.m;
        if (object != null) {
            object.a();
        }
        if ((object = this.k) != null) {
            object.cancel();
        }
        super.onDetach();
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        Object object4;
        int n4;
        int n7 = 1;
        int n8 = 0;
        aW aW2 = null;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n10 = R$id.redemption_tv;
        object2 = (TextView)object.findViewById(n10);
        this.a = object2;
        n10 = R$id.resend_otp_in;
        object2 = (TextView)object.findViewById(n10);
        this.b = object2;
        n10 = R$id.error_msg;
        object2 = (TextView)object.findViewById(n10);
        this.c = object2;
        n10 = R$id.resend_otp;
        object2 = (TextView)object.findViewById(n10);
        this.d = object2;
        n10 = R$id.resend_otp_time;
        object2 = (TextView)object.findViewById(n10);
        this.e = object2;
        n10 = R$id.otp_edit_text;
        object2 = (EditText)object.findViewById(n10);
        this.g = object2;
        n10 = R$id.confirm_otp_btn;
        object2 = (TextView)object.findViewById(n10);
        this.f = object2;
        n10 = R$id.ajio_loader_view;
        object2 = (AjioLoaderView)object.findViewById(n10);
        this.h = object2;
        n10 = R$id.close_dialog;
        object2 = (AppCompatImageView)object.findViewById(n10);
        this.i = object2;
        n10 = R$id.valid_msg;
        object = (TextView)object.findViewById(n10);
        this.j = object;
        object = this.d;
        object2 = "resendOtpBtn";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("confirmOtpBtn");
            n4 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            n4 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorMsgTv");
            n4 = 0;
            object = null;
        }
        int n14 = 8;
        object.setVisibility(n14);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        object.setVisibility(n14);
        object = this.b;
        Object object5 = "otpSendIn";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n4 = 0;
            object = null;
        }
        object.setVisibility(0);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("validMsg");
            n4 = 0;
            object = null;
        }
        object.setVisibility(0);
        n4 = og1_1.b();
        if (n4 != 0) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((object4 = this.d) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object4 = null;
            }
            n10 = object4.getPaintFlags() | n14;
            object.setPaintFlags(n10);
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n4 = 0;
                object = null;
            }
            if ((object2 = this.b) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n10 = 0;
                object2 = null;
            }
            n10 = object2.getPaintFlags() | n14;
            object.setPaintFlags(n10);
            object = this.e;
            object2 = "resendOtpTimerTv";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object = null;
            }
            if ((object5 = this.e) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object5 = null;
            }
            n10 = object5.getPaintFlags() | n14;
            object.setPaintFlags(n10);
        }
        if ((object = this.g) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otpEditText");
            n4 = 0;
            object = null;
        }
        object2 = new hb3_0(this);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)object2);
        object = this.getActivity();
        if (object != null) {
            object2 = com.ril.ajio.utility.b.Companion;
            object = (b)((x63_0)object2).a(object);
            this.m = object;
            if (object != null) {
                object.b(this);
            }
        }
        object = this.r;
        object2 = ((mb3_0)object.getValue()).b;
        Object object6 = this.getViewLifecycleOwner();
        object5 = new ra_0(this, n7);
        object4 = new jB3$c((ra_0)object5);
        ((LiveData)object2).e((mu1_1)object6, (F62)object4);
        object2 = ((mb3_0)object.getValue()).c;
        object6 = this.getViewLifecycleOwner();
        object5 = new ib3_1(this);
        ((LiveData)object2).e((mu1_1)object6, (F62)object5);
        object2 = this.l;
        this.o = object6 = ((UserInformation)((hh3_2)object2).getValue()).getUserEmailId();
        this.n = object2 = ((UserInformation)((hh3_2)object2).getValue()).getUserPhoneNumber();
        if (object2 != null && (n10 = ((String)object2).length()) != 0) {
            n10 = R$string.rcs_redemption;
            object6 = this.n;
            object3 = new Object[n7];
            object3[0] = object6;
            object2 = hv3_0.L(n10, (Object[])object3);
            AJIOApplication.Companion.getClass();
            object6 = mz3_0.t(AJIOApplication$a.a(), 10);
            object5 = "";
            object3 = new AjioCustomTypefaceSpan((String)object5, (Typeface)object6);
            n3 = 6;
            n8 = StringsKt.R((CharSequence)object2, " ", 0, n3);
            object6 = "redemptionTv";
            if (n8 > 0 && (n3 = ((String)object2).length()) > 0 && n8 <= n3) {
                object4 = new SpannableString((CharSequence)object2);
                n10 = 33;
                object4.setSpan(object3, n8, n3, n10);
                n7 = (int)(og1_1.b() ? 1 : 0);
                if (n7 != 0) {
                    int n15 = hv3_0.m(R$color.luxe_color_121212);
                    object3 = new ForegroundColorSpan(n15);
                    object4.setSpan(object3, n8, n3, n10);
                }
                if ((object2 = this.a) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n10 = 0;
                    object2 = null;
                }
                object2.setText((CharSequence)object4);
            } else {
                object3 = this.a;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n7 = 0;
                    object3 = null;
                }
                object3.setText((CharSequence)object2);
            }
        }
        if ((object2 = this.o) != null && (n10 = ((String)object2).length()) != 0 && (object2 = this.n) != null && (n10 = ((String)object2).length()) != 0) {
            object = (mb3_0)object.getValue();
            object2 = this.n;
            Intrinsics.checkNotNull(object2);
            object3 = ((kj2_1)this.s.getValue()).E;
            if (object3 != null) {
                object3 = ((TenantResponse)object3).getTenant();
            } else {
                n7 = 0;
                object3 = null;
            }
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, "mobile");
            aW2 = md3_0.c((jD3)object);
            object6 = new kb3_0((mb3_0)object, (String)object2, (Tenant)object3, null);
            n4 = 3;
            Ae3.d(aW2, null, null, (Function2)object6, n4);
            object = new jB3$b(this);
            this.k = object;
            object.start();
        }
    }
}

