/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.D;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.EditProfileData;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.query.QueryProfile;
import com.ril.ajio.utility.b;
import com.ril.ajio.utility.validators.Validator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/*
 * Renamed from ux0
 */
public final class ux0_0
extends m51_0
implements View.OnClickListener,
nr2_2 {
    public hy3_0 f;
    public fv0_2 g;
    public LinearLayout h;
    public LinearLayout i;
    public EditText j;
    public EditText k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public AjioTextView t;
    public ux0$a u;
    public b v;
    public Activity w;
    public EditProfileData x;
    public final D y;
    public AjioLoaderView z;

    public ux0_0() {
        Object object = new ux0$d(this);
        Object object2 = et1_2.NONE;
        Lambda lambda = new ux0$e((ux0$d)object);
        object = yr1_2.a(object2, lambda);
        object2 = Reflection.getOrCreateKotlinClass(oa1_1.class);
        super((rq1_2)object);
        ux0$g ux0$g = new ux0$g((rq1_2)object);
        ux0$h ux0$h = new ux0$h(this, (rq1_2)object);
        this.y = object = LW0.a(this, (yn1_2)object2, lambda, ux0$g, ux0$h);
    }

    public static void Pa(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            Object object = fragmentActivity.getSystemService("input_method");
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            object = (InputMethodManager)object;
            View view = fragmentActivity.getCurrentFocus();
            if (view == null) {
                view = new View((Context)fragmentActivity);
            }
            fragmentActivity = view.getWindowToken();
            view = null;
            object.hideSoftInputFromWindow((IBinder)fragmentActivity, 0);
        }
    }

    public final void Qa(boolean bl2) {
        if (bl2) {
            AjioLoaderView ajioLoaderView = this.z;
            if (ajioLoaderView != null) {
                boolean bl3 = false;
                ajioLoaderView.setVisibility(0);
            }
            if ((ajioLoaderView = this.z) != null) {
                ajioLoaderView.startLoader();
            }
        } else {
            AjioLoaderView ajioLoaderView = this.z;
            if (ajioLoaderView != null) {
                int n3 = 8;
                ajioLoaderView.setVisibility(n3);
            }
            if ((ajioLoaderView = this.z) != null) {
                ajioLoaderView.stopLoader();
            }
        }
    }

    public final void c8(String string2) {
        String string3 = "otp";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string3 = this.k;
            if (string3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOtpEt");
                bl2 = false;
                string3 = null;
            }
            string3.setText((CharSequence)string2);
        }
    }

    public final void onAttach(Context context) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        super.onAttach(context);
        boolean bl2 = context instanceof Activity;
        if (bl2) {
            context = (Activity)context;
            this.w = context;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        void var11_26;
        Editable editable;
        int n3;
        int n4;
        int n7 = 0;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.send_otp_btn;
        Object object3 = "mEmailEt";
        int n10 = 1;
        int n14 = 0;
        Object var9_9 = null;
        if (object == null || (n3 = ((Integer)object).intValue()) != n8) {
            n8 = R$id.resend_otp;
            if (object == null || (n3 = ((Integer)object).intValue()) != n8) {
                n8 = R$id.confirm_otp_btn;
                if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
                    object = this.x;
                    if (object != null) {
                        object = this.k;
                        String string2 = "mOtpEt";
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n4 = 0;
                            object = null;
                        }
                        if ((object = object.getText()) != null) {
                            object = this.k;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n4 = 0;
                                object = null;
                            }
                            object = object.getText();
                            String string3 = "getText(...)";
                            Intrinsics.checkNotNullExpressionValue(object, string3);
                            n4 = object.length();
                            if (n4 > 0) {
                                void var9_12;
                                this.Qa(n10 != 0);
                                object = this.f;
                                if (object == null) return;
                                Object object4 = this.x;
                                Intrinsics.checkNotNull(object4);
                                EditText editText = this.j;
                                if (editText == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                    n14 = 0;
                                    Object var9_11 = null;
                                }
                                if ((object3 = var9_12.getText()) != null) {
                                    object3 = StringsKt.m0((CharSequence)object3);
                                } else {
                                    boolean bl2 = false;
                                    object3 = null;
                                }
                                object3 = String.valueOf(object3);
                                EditText editText2 = this.k;
                                if (editText2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                                } else {
                                    object2 = editText2;
                                }
                                object2 = object2.getText().toString();
                                Intrinsics.checkNotNullParameter(object4, "userProfileData");
                                Intrinsics.checkNotNullParameter(object3, "email");
                                Intrinsics.checkNotNullParameter(object2, "otp");
                                QueryProfile queryProfile = new QueryProfile();
                                String string4 = ((EditProfileData)object4).getFirstName();
                                queryProfile.setFirstName(string4);
                                String string5 = ((EditProfileData)object4).getLastName();
                                queryProfile.setLastName(string5);
                                String string6 = ((EditProfileData)object4).getScreenName();
                                queryProfile.setScreenName(string6);
                                String string7 = ((EditProfileData)object4).getGenderType();
                                queryProfile.setGender(string7);
                                object4 = ((EditProfileData)object4).getDateOfBirth();
                                queryProfile.setDateOfBirth((String)object4);
                                queryProfile.setEmailId((String)object3);
                                queryProfile.setOtp((String)object2);
                                object2 = ((hy3_0)object).g.updateUserProfile(queryProfile);
                                wy3_0 wy3_02 = new wy3_0((hy3_0)object);
                                object3 = new va2_0(2, wy3_02);
                                n10 = 3;
                                oj0_2 oj0_22 = new oj0_2(object, n10);
                                n14 = 2;
                                object4 = new xa2_1(n14, oj0_22);
                                object2 = ((g53_0)object2).f((o60_0)object3, (o60_0)object4);
                                object = ((hy3_0)object).x;
                                ((t30_0)object).b((yr0_2)object2);
                                return;
                            }
                        }
                    }
                    this.Qa(false);
                    object = this.p;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mValidTimeTv");
                        n4 = 0;
                        object = null;
                    }
                    n8 = 8;
                    object.setVisibility(n8);
                    object = this.q;
                    String string8 = "mErrorOtpTv";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n4 = 0;
                        object = null;
                    }
                    int n15 = R$string.otp_err_msg3;
                    object.setText(n15);
                    object = this.q;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                        n4 = 0;
                        object = null;
                    }
                    object.setVisibility(0);
                    object = this.q;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string8);
                    } else {
                        object2 = object;
                    }
                    ai0_2.a((View)object2);
                    return;
                }
                n7 = R$id.close;
                if (object == null) {
                    return;
                }
                n4 = (Integer)object;
                if (n4 != n7) return;
                this.dismiss();
                return;
            }
        }
        if ((object = this.g) == null) return;
        Intrinsics.checkNotNull(object);
        object = ((fv0_2)object).a;
        n4 = (int)(((Validator)object).h() ? 1 : 0);
        if (n4 == 0) return;
        this.Qa(n10 != 0);
        this.setCancelable(false);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string9 = "Save New Email Address";
        String string10 = "ChangePersonalInfo";
        ((GTMEvents)object).pushButtonTapEvent(string9, string10, "EditEmail Screen");
        object = new QueryCustomer();
        EditText editText = this.j;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n8 = 0;
            Object var11_25 = null;
        }
        if ((editable = var11_26.getText()) != null) {
            object2 = editable.toString();
        }
        ((QueryCustomer)object).setEmail((String)object2);
        ((QueryCustomer)object).setMobileNumberEnterered(false);
        object2 = (oa1_1)this.y.getValue();
        String string11 = "signup screen";
        ((oa1_1)object2).b((QueryCustomer)object, string11);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
        object = this.getActivity();
        if (object != null) {
            object = kd3_2.a();
            Object object2 = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
            Object object3 = new UserRepo((Application)object2);
            object2 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object3;
            ((kd3_2)object).b = object2;
            Intrinsics.checkNotNull(object);
            object3 = "owner";
            Intrinsics.checkNotNullParameter(this, (String)object3);
            object2 = "factory";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object3);
            object3 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, "store");
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
            object2 = hy3_0.class;
            String string2 = "modelClass";
            object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object3, (Class)object2, string2);
            object3 = ef0_0.a((Class)object2, string2, string2, "<this>");
            object2 = object3.getQualifiedName();
            if (object2 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object2 = ((String)object4).concat((String)object2);
                this.f = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)object2);
            } else {
                object3 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object3);
                throw object;
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        rx0 rx02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)rx02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_view_edit_email;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        Object object = this.v;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.a();
        }
        if ((object = this.u) != null) {
            Intrinsics.checkNotNull(object);
            object.cancel();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        this.Qa(false);
        ux0_0.Pa(this.getActivity());
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        int n4;
        int n7;
        Object object3;
        Object object4;
        int n8;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.getArguments();
        Object object5 = null;
        if (object2 != null && (object2 = this.getArguments()) != null && (n8 = (int)((object2 = this.requireArguments()).containsKey((String)(object4 = "Intent_User_profile_data")) ? 1 : 0)) != 0) {
            object2 = this.requireArguments();
            object3 = "requireArguments(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            n7 = Build.VERSION.SDK_INT;
            n4 = 33;
            if (n7 >= n4) {
                object2 = (Parcelable)nx0_2.a((Bundle)object2);
            } else {
                n3 = (object2 = object2.getParcelable((String)object4)) instanceof Parcelable;
                if (n3 == 0) {
                    n8 = 0;
                    object2 = null;
                }
            }
            object2 = (EditProfileData)object2;
            this.x = object2;
        }
        n8 = R$id.parent_layout;
        object2 = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (LinearLayout)object2;
        object3 = Looper.getMainLooper();
        object4 = new Handler(object3);
        object3 = new ox0_1((LinearLayout)object2);
        long l2 = 100;
        object4.postDelayed((Runnable)object3, l2);
        n8 = R$id.edit_email_view;
        object2 = (LinearLayout)object.findViewById(n8);
        this.h = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditEmailView");
            n8 = 0;
            object2 = null;
        }
        n3 = 0;
        object4 = null;
        object2.setVisibility(0);
        n8 = R$id.otp_view;
        object2 = (LinearLayout)object.findViewById(n8);
        this.i = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEnterOtpView");
            n8 = 0;
            object2 = null;
        }
        n3 = 8;
        object2.setVisibility(n3);
        n8 = R$id.ril_employee_new_email_signin_info;
        object2 = (AjioTextView)object.findViewById(n8);
        this.t = object2;
        n8 = R$id.close;
        object2 = (ImageView)object.findViewById(n8);
        if (object2 != null) {
            object2.setOnClickListener((View.OnClickListener)this);
        }
        n8 = R$id.send_otp_btn;
        object2 = (TextView)object.findViewById(n8);
        this.l = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendOtpTv");
            n8 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n8 = R$id.confirm_otp_btn;
        object2 = (TextView)object.findViewById(n8);
        this.m = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirmOtpTv");
            n8 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n8 = R$id.email_edit_txt;
        object2 = (EditText)object.findViewById(n8);
        this.j = object2;
        object4 = "mEmailEt";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n8 = 0;
            object2 = null;
        }
        object3 = new px0_0(this);
        object2.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        n8 = R$id.otp_edit_text;
        object2 = (EditText)object.findViewById(n8);
        this.k = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOtpEt");
            n8 = 0;
            object2 = null;
        }
        object3 = new qx0_1(this);
        object2.setOnEditorActionListener((TextView.OnEditorActionListener)object3);
        n8 = R$id.sub_header_otp_tv;
        object2 = (TextView)object.findViewById(n8);
        this.n = object2;
        n8 = R$id.email_error_msg;
        object2 = (TextView)object.findViewById(n8);
        this.o = object2;
        object3 = "mEmailErrorTv";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n8 = 0;
            object2 = null;
        }
        n4 = 4;
        object2.setVisibility(n4);
        n8 = R$id.otp_valid_time;
        object2 = (TextView)object.findViewById(n8);
        this.p = object2;
        n8 = R$id.error_msg;
        object2 = (TextView)object.findViewById(n8);
        this.q = object2;
        n8 = R$id.resend_otp;
        object2 = (TextView)object.findViewById(n8);
        this.r = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTv");
            n8 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        n8 = R$id.resend_otp_time;
        object2 = (TextView)object.findViewById(n8);
        this.s = object2;
        vz3_0 vz3_02 = vz3_0.TEXTVIEWVALIDATOR;
        object2 = new fv0_2(vz3_02);
        this.g = object2;
        object2 = this.j;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n8 = 0;
            object2 = null;
        }
        n4 = 32;
        object2.setInputType(n4);
        object2 = this.g;
        if (object2 != null) {
            TextView textView;
            vz3_02 = this.j;
            if (vz3_02 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n4 = 0;
                vz3_02 = null;
            }
            if ((textView = this.o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                textView = null;
            }
            n7 = R$string.newuser_emailaddr_error;
            object3 = hv3_0.K(n7);
            ((fv0_2)object2).b((EditText)vz3_02, textView, (String)object3);
        }
        if ((object2 = this.j) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object5 = object2;
        }
        object2 = new ux0$b(this);
        object5.addTextChangedListener((TextWatcher)object2);
        n8 = R$id.loader_view;
        object = (AjioLoaderView)object.findViewById(n8);
        this.z = object;
        object = this.f;
        if (object != null && (object = ((hy3_0)object).k) != null) {
            object2 = this.getViewLifecycleOwner();
            object5 = new sx0(this);
            ((LiveData)object).e((mu1_1)object2, (F62)object5);
        }
        object = this.f;
        Intrinsics.checkNotNull(object);
        object = ((hy3_0)object).j;
        object2 = this.getViewLifecycleOwner();
        object5 = new ym_2(this, 1);
        object4 = new ux0$c((Function1)object5);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = ((oa1_1)this.y.getValue()).n;
        object2 = this.getViewLifecycleOwner();
        object5 = new tx0_1(this, 0);
        object4 = new ux0$c((Function1)object5);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
    }
}

