/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 *  android.widget.TextView
 *  android.widget.Toast
 */
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.D;
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
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.query.QueryProfile;
import com.ril.ajio.utility.validators.Validator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Sx0
 */
public final class sx0_1
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public hy3_0 a;
    public AjioAspectRatioImageView b;
    public fv0_2 c;
    public AjioEditText d;
    public TextView e;
    public TextView f;
    public final hh3_2 g;
    public final D h;
    public final D i;
    public A71 j;
    public j3_0 k;
    public lz1_1 l;
    public OnFragmentInteractionListener m;

    public sx0_1() {
        Object object = new in_2(this, 1);
        this.g = object = yr1_2.b((Function0)object);
        object = new Sx0$b(this);
        Object object2 = et1_2.NONE;
        Object object3 = new Sx0$c((Sx0$b)object);
        object = yr1_2.a(object2, (Function0)object3);
        object3 = Reflection.getOrCreateKotlinClass(hy3_0.class);
        Lambda lambda = new Sx0$d((rq1_2)object);
        Lambda lambda2 = new Sx0$e((rq1_2)object);
        Sx0$f sx0$f = new Sx0$f(this, (rq1_2)object);
        this.h = object = LW0.a(this, (yn1_2)object3, lambda, lambda2, sx0$f);
        object = new Sx0$g(this);
        object3 = new Sx0$h((Sx0$g)object);
        object = yr1_2.a(object2, (Function0)object3);
        object2 = Reflection.getOrCreateKotlinClass(b52_0.class);
        object3 = new Sx0$i((rq1_2)object);
        super((rq1_2)object);
        super(this, (rq1_2)object);
        this.i = object = LW0.a(this, (yn1_2)object2, (Function0)object3, lambda, lambda2);
    }

    public static void Oa(int n3, String object) {
        Object object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        if (bl2) {
            ig0_0.Companion.getClass();
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            String string2 = hv3_0.K(n3);
            ig0_0.c((AJIOApplication)object2, string2, (String)object);
        } else {
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            bl2 = false;
            object2 = null;
            Toast toast = Toast.makeText((Context)object, (int)n3, (int)0);
            int n4 = 17;
            toast.setGravity(n4, 0, 0);
            toast.show();
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof A71;
        Object object3 = null;
        if (bl2) {
            object2 = object;
            this.j = object2 = (A71)object;
        } else {
            object2 = yn3_0.a;
            String string2 = "must implement HomeListener";
            Object[] objectArray = new Object[]{};
            ((yn3$a)object2).d(string2, objectArray);
        }
        bl2 = object instanceof j3_0;
        if (bl2) {
            object2 = object;
            this.k = object2 = (j3_0)object;
        }
        if (bl2 = object instanceof lz1_1) {
            object = (lz1_1)object;
            this.l = object;
        } else {
            object = yn3_0.a;
            object2 = "must implement LoginListener";
            object3 = new Object[]{};
            object.d((String)object2, (Object[])object3);
        }
        try {
            object = this.getActivity();
            object2 = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.OnFragmentInteractionListener";
        }
        catch (ClassCastException classCastException) {
            yn3_0.a.e(classCastException);
            object2 = this.getActivity();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(object2);
            ((StringBuilder)object3).append(" must implement OnFragmentInteractionListener");
            object2 = ((StringBuilder)object3).toString();
            ClassCastException classCastException2 = new ClassCastException((String)object2);
            throw classCastException2;
        }
        Intrinsics.checkNotNull(object, (String)object2);
        object = (OnFragmentInteractionListener)object;
        this.m = object;
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        Object object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.close;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            this.dismiss();
        } else {
            n7 = R$id.submit_btn;
            if (object != null && (n4 = ((Integer)object).intValue()) == n7 && (object = this.c) != null) {
                Intrinsics.checkNotNull(object);
                object = ((fv0_2)object).a;
                n4 = (int)(((Validator)object).h() ? 1 : 0);
                if (n4 != 0) {
                    object = AnalyticsManager.Companion;
                    Object object3 = "Save New Password";
                    Object object4 = "ChangePersonalInfo";
                    Object object5 = "EditPassword Screen";
                    tj2_0.e((AnalyticsManager$Companion)object, (String)object3, (String)object4, (String)object5);
                    object = this.d;
                    if (object != null) {
                        object = ((AppCompatEditText)object).getText();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    object = String.valueOf(object);
                    object3 = this.a;
                    if (object3 != null) {
                        Intrinsics.checkNotNullParameter(object, "password");
                        object4 = new QueryProfile();
                        ((QueryProfile)object4).setFirstName(null);
                        ((QueryProfile)object4).setLastName(null);
                        ((QueryProfile)object4).setScreenName(null);
                        ((QueryProfile)object4).setGender(null);
                        ((QueryProfile)object4).setDateOfBirth(null);
                        ((QueryProfile)object4).setMobileNumber(null);
                        ((QueryProfile)object4).setOtp(null);
                        ((QueryProfile)object4).setNewPassword((String)object);
                        ((QueryProfile)object4).setConfirmPassword((String)object);
                        object = ((hy3_0)object3).g.updateUserProfile((QueryProfile)object4);
                        n3 = 1;
                        object2 = new xn2_2(object3, n3);
                        object4 = new cy3_0((xn2_2)object2);
                        int n8 = 2;
                        object2 = new vn2_2(object3, n8);
                        object5 = new wn2_1((Function1)object2);
                        object = ((g53_0)object).f((o60_0)object4, (o60_0)object5);
                        object2 = ((hy3_0)object3).x;
                        ((t30_0)object2).b((yr0_2)object);
                    }
                }
            }
        }
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
                this.a = object = (hy3_0)((pD3)object).a((yn1_2)object3, (String)object2);
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
        qx0_0 qx0_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)qx0_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_view_edit_pwd;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDismiss(DialogInterface object) {
        Object object2 = "dialog";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onDismiss((DialogInterface)object);
        object = this.getActivity();
        if (object != null) {
            object2 = object.getSystemService("input_method");
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            object2 = (InputMethodManager)object2;
            View view = object.getCurrentFocus();
            if (view == null) {
                view = new View((Context)object);
            }
            object = view.getWindowToken();
            view = null;
            object2.hideSoftInputFromWindow((IBinder)object, 0);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.close;
        object2 = (AjioAspectRatioImageView)object.findViewById(n3);
        this.b = object2;
        n3 = R$id.pwd_txt;
        object2 = (AjioEditText)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.error_msg;
        object2 = (TextView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.submit_btn;
        object = (TextView)object.findViewById(n3);
        this.f = object;
        object = this.b;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.f) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.e) != null) {
            n3 = 8;
            object.setVisibility(n3);
        }
        object2 = vz3_0.TEXTVIEWVALIDATOR;
        object = new fv0_2((vz3_0)((Object)object2));
        this.c = object;
        object2 = this.d;
        object3 = this.e;
        int n4 = R$string.password_alert_text;
        String string2 = hv3_0.K(n4);
        ((fv0_2)object).b((EditText)object2, (TextView)object3, string2);
        object = this.a;
        if (object != null && (object = ((hy3_0)object).s) != null) {
            object2 = this.getViewLifecycleOwner();
            n4 = 0;
            string2 = null;
            object3 = new rx0_0(this, 0);
            ((LiveData)object).e((mu1_1)object2, (F62)object3);
        }
    }
}

