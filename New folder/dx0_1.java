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
 *  android.content.Intent
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.text.Spannable
 *  android.text.TextUtils
 *  android.text.style.ForegroundColorSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 *  android.widget.TextView$OnEditorActionListener
 */
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.EditProfileData;
import com.ril.ajio.services.query.QueryProfile;
import com.ril.ajio.utility.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from Dx0
 */
public final class dx0_1
extends BottomSheetDialogFragment
implements View.OnClickListener,
nr2_2 {
    public static final Dx0$a Companion;
    public Activity a;
    public TextView b;
    public EditText c;
    public TextView d;
    public LinearLayout e;
    public LinearLayout f;
    public TextView g;
    public EditText h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public hy3_0 p;
    public String q;
    public String r;
    public b s;
    public Dx0$b t;
    public EditProfileData u;
    public String v;

    static {
        Dx0$a dx0$a;
        Companion = dx0$a = new Object();
    }

    public dx0_1() {
        String string2;
        this.q = string2 = "";
        this.r = string2;
    }

    public final void Oa() {
        Object object = this.getContext();
        Class<dx0_1> clazz = dx0_1.class;
        Intent intent = new Intent((Context)object, clazz);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMobileEt");
            object = null;
        }
        object = object.getText().toString();
        intent.putExtra("EDIT_UPDATED_INFO", (String)object);
        object = this.getTargetFragment();
        Intrinsics.checkNotNull(object);
        int n3 = this.getTargetRequestCode();
        ((Fragment)object).onActivityResult(n3, -1, intent);
        this.dismiss();
    }

    public final void Pa(TextView object) {
        int n3;
        int n4 = 0;
        int n7 = 1;
        Object object2 = this.v;
        if (object2 == null || (n3 = ((String)object2).length()) == 0) {
            object2 = "24 hours";
            this.v = object2;
        }
        object2 = StringCompanionObject.INSTANCE;
        object2 = h40_0.a;
        object2 = h40_0.R().getProfile_change_new_number_note();
        Object object3 = this.v;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object3;
        Object object4 = xh2_0.a(objectArray, n7, (String)object2, "format(...)");
        object2 = h40_0.R().getProfile_change_text_highlight();
        object3 = TextView.BufferType.SPANNABLE;
        object.setText((CharSequence)object4, (TextView.BufferType)object3);
        object = object.getText();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.text.Spannable");
        object = (Spannable)object;
        n4 = StringsKt.O((CharSequence)object4, (String)object2, 0, false, 6);
        int n8 = hv3_0.m(R$color.black);
        object4 = new ForegroundColorSpan(n8);
        n8 = ((String)object2).length() + n4;
        object.setSpan(object4, n4, n8, 33);
        object4 = FontsManager.getInstance();
        AJIOApplication.Companion.getClass();
        object3 = AJIOApplication$a.a();
        object4 = ((FontsManager)object4).getTypefaceWithFont((Context)object3, 10);
        object3 = new AjioCustomTypefaceSpan("", (Typeface)object4);
        n7 = ((String)object2).length() + n4;
        object.setSpan(object3, n4, n7, 34);
    }

    public final void c8(String string2) {
        String string3 = "otp";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            string3 = this.h;
            if (string3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOtpEt");
                bl2 = false;
                string3 = null;
            }
            string3.setText((CharSequence)string2);
        }
    }

    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        context = (Activity)context;
        this.a = context;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.send_otp_btn;
        Object object3 = null;
        Object object4 = "mMobileEt";
        int n7 = 0;
        Object var8_8 = null;
        if (n3 == n4) {
            void var8_12;
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            if ((object = object.getText()) != null) {
                object = this.c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n3 = 0;
                    object = null;
                }
                if ((object = object.getText()) != null && (object = StringsKt.m0((CharSequence)object)) != null && (n3 = object.length()) == (n4 = 10)) {
                    void var8_10;
                    object = this.p;
                    Intrinsics.checkNotNull(object);
                    object2 = this.q;
                    String string2 = this.r;
                    EditText editText = this.c;
                    if (editText == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        editText = null;
                    }
                    if ((object4 = editText.getText()) != null) {
                        CharSequence charSequence = StringsKt.m0((CharSequence)object4);
                    }
                    object4 = String.valueOf(var8_10);
                    ((hy3_0)object).r((String)object2, string2, (String)object4, false);
                    return;
                }
            }
            object = this.b;
            object2 = "mMobileErrorTv";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            int n8 = R$string.phone_error_msg;
            object4 = hv3_0.K(n8);
            object.setText((CharSequence)object4);
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.b;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                Object object5 = object;
            }
            ai0_2.a((View)var8_12);
            return;
        }
        n4 = R$id.confirm_otp_btn;
        if (n3 == n4) {
            void var8_18;
            object = this.u;
            if (object != null) {
                object = this.h;
                object2 = "mOtpEt";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n3 = 0;
                    object = null;
                }
                if ((object = object.getText()) != null) {
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        object = null;
                    }
                    object = object.getText();
                    String string3 = "getText(...)";
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    n3 = object.length();
                    if (n3 > 0) {
                        void var8_14;
                        int n10;
                        int n14;
                        object = this.p;
                        Intrinsics.checkNotNull(object);
                        object3 = this.u;
                        Intrinsics.checkNotNull(object3);
                        string3 = this.c;
                        if (string3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            n14 = 0;
                            string3 = null;
                        }
                        if ((object4 = string3.getText()) != null) {
                            object4 = StringsKt.m0((CharSequence)object4);
                        } else {
                            n10 = 0;
                            object4 = null;
                        }
                        object4 = String.valueOf(object4);
                        string3 = this.h;
                        if (string3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            String string4 = string3;
                        }
                        object2 = var8_14.getText().toString();
                        object.getClass();
                        Intrinsics.checkNotNullParameter(object3, "userProfileData");
                        Intrinsics.checkNotNullParameter(object4, "mobileNumber");
                        Intrinsics.checkNotNullParameter(object2, "otp");
                        object3 = new QueryProfile();
                        String string5 = String.valueOf(((hy3_0)object).m().getUserPhoneNumber());
                        ((QueryProfile)object3).setOldMobileNumber(string5);
                        ((QueryProfile)object3).setNewMobileNumber((String)object4);
                        ((QueryProfile)object3).setOtp((String)object2);
                        object2 = ((hy3_0)object).g.updateUserMobileNumberProfile((QueryProfile)object3);
                        n10 = 3;
                        object3 = new sf1_2(object, n10);
                        object4 = new tf1_2(1, (Function1)object3);
                        n7 = 4;
                        object3 = new uf1_2(object, n7);
                        n14 = 1;
                        vf1_2 vf1_22 = new vf1_2(n14, (Function1)object3);
                        object2 = ((g53_0)object2).f((o60_0)object4, vf1_22);
                        object = ((hy3_0)object).x;
                        ((t30_0)object).b((yr0_2)object2);
                        return;
                    }
                }
            }
            if ((object = this.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mValidTimeTv");
                n3 = 0;
                object = null;
            }
            n4 = 8;
            object.setVisibility(n4);
            object = this.j;
            object2 = "mErrorOtpTv";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            int n15 = R$string.otp_err_msg3;
            object.setText(n15);
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.j;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                Object object6 = object;
            }
            ai0_2.a((View)var8_18);
            return;
        }
        n4 = R$id.resend_otp;
        if (n3 == n4) {
            void var8_20;
            object = this.p;
            Intrinsics.checkNotNull(object);
            object2 = this.q;
            String string6 = this.r;
            EditText editText = this.c;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            } else {
                EditText editText2 = editText;
            }
            object4 = var8_20.getText().toString();
            ((hy3_0)object).r((String)object2, string6, (String)object4, false);
            return;
        }
        n4 = R$id.close_mobile;
        if (n3 == n4) {
            this.dismiss();
            return;
        }
        n4 = R$id.close_otp;
        if (n3 != n4) return;
        this.dismiss();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
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
        rd3_0 rd3_02 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object3);
        object3 = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(rd3_02, "store");
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object3, "defaultCreationExtras");
        object2 = hy3_0.class;
        String string2 = "modelClass";
        object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object3, (Class)object2, string2);
        object3 = ef0_0.a((Class)object2, string2, string2, "<this>");
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.p = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)object2);
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
        ax0_0 ax0_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)ax0_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_view_edit_mobile_otp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        Object object = this.s;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object.a();
        }
        if ((object = this.t) != null) {
            Intrinsics.checkNotNull(object);
            object.cancel();
        }
    }

    public final void onDismiss(DialogInterface object) {
        Intrinsics.checkNotNullParameter(object, "dialog");
        super.onDismiss((DialogInterface)object);
        object = Companion;
        FragmentActivity fragmentActivity = this.getActivity();
        object.getClass();
        if (fragmentActivity != null) {
            object = fragmentActivity.getSystemService("input_method");
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

    public final void onViewCreated(View object, Bundle object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.parent_layout;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (LinearLayout)object2;
        Object object3 = Looper.getMainLooper();
        Object object4 = new Handler(object3);
        object3 = new xx0_1((LinearLayout)object2);
        long l2 = 100;
        object4.postDelayed((Runnable)object3, l2);
        n3 = R$id.mobile_error_msg;
        object2 = (TextView)object.findViewById(n3);
        this.b = object2;
        n3 = R$id.mobile_edit_text;
        object2 = (EditText)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.send_otp_btn;
        object2 = (TextView)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.close_mobile;
        object2 = (ImageView)object.findViewById(n3);
        int n4 = R$id.edit_mobile_view;
        object4 = (LinearLayout)object.findViewById(n4);
        this.e = object4;
        n4 = R$id.close_otp;
        object4 = (ImageView)object.findViewById(n4);
        int n7 = R$id.otp_view;
        object3 = (LinearLayout)object.findViewById(n7);
        this.f = object3;
        n7 = R$id.user_info_textview;
        object3 = (TextView)object.findViewById(n7);
        this.g = object3;
        n7 = R$id.otp_edit_text;
        object3 = (EditText)object.findViewById(n7);
        this.h = object3;
        n7 = R$id.otp_valid_time;
        object3 = (TextView)object.findViewById(n7);
        this.i = object3;
        n7 = R$id.error_msg;
        object3 = (TextView)object.findViewById(n7);
        this.j = object3;
        n7 = R$id.resend_otp;
        object3 = (TextView)object.findViewById(n7);
        this.k = object3;
        n7 = R$id.resend_otp_time;
        object3 = (TextView)object.findViewById(n7);
        this.l = object3;
        n7 = R$id.confirm_otp_btn;
        object3 = (TextView)object.findViewById(n7);
        this.o = object3;
        n7 = R$id.id_new_number_note_message;
        object3 = (TextView)object.findViewById(n7);
        this.m = object3;
        n7 = R$id.id_new_number_note_message_edit;
        object = (TextView)object.findViewById(n7);
        this.n = object;
        object = this.f;
        n7 = 0;
        object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEnterOtpView");
            bl2 = false;
            object = null;
        }
        int n8 = 8;
        object.setVisibility(n8);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditMobileView");
            bl2 = false;
            object = null;
        }
        n8 = 0;
        Dx0$c dx0$c = null;
        object.setVisibility(0);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMobileErrorTv");
            bl2 = false;
            object = null;
        }
        n8 = 4;
        object.setVisibility(n8);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendOtpTv");
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object2.setOnClickListener((View.OnClickListener)this);
        object4.setOnClickListener((View.OnClickListener)this);
        object = this.o;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConfirmOtpTv");
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mResendOtpTv");
            bl2 = false;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMobileEt");
            bl2 = false;
            object = null;
        }
        object2 = new yx0_1(this);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)object2);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOtpEt");
            bl2 = false;
            object = null;
        }
        object2 = new zx0_1(this);
        object.setOnEditorActionListener((TextView.OnEditorActionListener)object2);
        object = this.getArguments();
        if (object != null) {
            object4 = "";
            object2 = object.getString("Intent_User_FirstName", (String)object4);
            this.q = object2;
            object2 = "Intent_User_LastName";
            object = object.getString((String)object2, (String)object4);
            this.r = object;
            object = this.getArguments();
            if (object != null && (bl2 = (object = this.requireArguments()).containsKey((String)(object2 = "INTENT_UPDATE_MOBILE_NUMBER_WINDOW")))) {
                this.v = object = this.requireArguments().getString((String)object2);
            }
            if ((object = this.getArguments()) != null && (bl2 = (object = this.requireArguments()).containsKey((String)(object2 = "Intent_User_profile_data")))) {
                object = this.requireArguments();
                object4 = "requireArguments(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object4);
                n4 = Build.VERSION.SDK_INT;
                n8 = 33;
                if (n4 >= n8) {
                    object = (Parcelable)nx0_2.a((Bundle)object);
                } else {
                    n3 = (object = object.getParcelable((String)object2)) instanceof Parcelable;
                    if (n3 == 0) {
                        bl2 = false;
                        object = null;
                    }
                }
                this.u = object = (EditProfileData)object;
            }
        }
        object = this.p;
        Intrinsics.checkNotNull(object);
        object = ((hy3_0)object).k;
        object2 = this.getViewLifecycleOwner();
        object4 = new bx0_1(this);
        ((LiveData)object).e((mu1_1)object2, (F62)object4);
        object = this.p;
        Intrinsics.checkNotNull(object);
        object = ((hy3_0)object).j;
        object2 = this.getViewLifecycleOwner();
        n8 = 0;
        object4 = new cx0_1(this, 0);
        dx0$c = new Dx0$c((cx0_1)object4);
        ((LiveData)object).e((mu1_1)object2, dx0$c);
        object = this.m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNewMobileNumberNote");
            bl2 = false;
            object = null;
        }
        this.Pa((TextView)object);
        object = this.n;
        if (object == null) {
            object = "mNewMobileNumberNoteEdit";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        this.Pa((TextView)object3);
    }
}

