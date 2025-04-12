/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.DatePickerDialog
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.RadioGroup
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
import android.app.Activity;
import android.app.Application;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.clevertap.android.sdk.a;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioRadioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.FragmentTitlesInterface;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.EditProfileData;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseSplitActivity;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Px0
 */
public final class px0_1
extends Fragment
implements FragmentTitlesInterface,
View.OnClickListener {
    public static final Px0$a Companion;
    public final String A;
    public vh3_2 B;
    public fo3 C;
    public AjioTextView D;
    public LinearLayout E;
    public String F;
    public Boolean G;
    public fv0_2 a;
    public DatePickerDialog b;
    public AjioEditText c;
    public AjioEditText d;
    public AjioEditText e;
    public AjioEditText f;
    public AjioEditText g;
    public TextInputLayout h;
    public AjioTextView i;
    public AjioTextView j;
    public RadioGroup k;
    public AjioRadioButton l;
    public AjioRadioButton m;
    public EditProfileData n;
    public FragmentActivity o;
    public OnFragmentInteractionListener p;
    public ps1_2 q;
    public ScrollView r;
    public View s;
    public final boolean[] t;
    public hy3_0 u;
    public int v;
    public int w;
    public int x;
    public final NewCustomEventsRevamp y;
    public final String z;

    static {
        Px0$a px0$a;
        Companion = px0$a = new Object();
    }

    public px0_1() {
        Object object = new boolean[5];
        this.t = object;
        object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.y = object2;
        this.z = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.A = object = cv_0.a((AnalyticsManager$Companion)object);
        this.G = object = Boolean.FALSE;
    }

    public final void Oa() {
        Object object = this.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        Object object2 = new jo_2((Context)object);
        String string2 = "";
        ((sw_0)object2).putPreference("LOCATION_DATA", string2);
        ((jo_2)object2).B();
        v31.a();
        tj2_2.Companion.getClass();
        object2 = tj2$a_0.a();
        object2.getClass();
        object = "pincode";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        ((tj2_2)object2).a = string2;
        object2 = this.u;
        if (object2 != null) {
            ((hy3_0)object2).h();
        }
        if ((object2 = this.u) != null) {
            ((hy3_0)object2).f();
        }
        if ((object2 = this.u) != null) {
            ((hy3_0)object2).d();
        }
        if ((object2 = this.u) != null) {
            ((hy3_0)object2).q();
        }
    }

    public final void Pa(EditProfileData object) {
        if (object != null) {
            boolean bl2;
            boolean bl3;
            Object object2 = this.c;
            Object object3 = "firstName";
            Object object4 = null;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl3 = false;
                object2 = null;
            }
            Object object5 = ((EditProfileData)object).getFirstName();
            object2.setText((CharSequence)object5);
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl3 = false;
                object2 = null;
            }
            if ((object5 = this.c) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                bl2 = false;
                object5 = null;
            }
            object3 = String.valueOf(((AppCompatEditText)object5).getText());
            int n3 = ((String)object3).length();
            object2.setSelection(n3);
            object2 = this.d;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lastName");
                bl3 = false;
                object2 = null;
            }
            object3 = ((EditProfileData)object).getLastName();
            object2.setText((CharSequence)object3);
            object2 = ((EditProfileData)object).getScreenName();
            bl3 = TextUtils.isEmpty((CharSequence)object2);
            object3 = "";
            object5 = "screenName";
            if (!bl3) {
                object2 = this.e;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl3 = false;
                    object2 = null;
                }
                object5 = ((EditProfileData)object).getScreenName();
                object2.setText((CharSequence)object5);
            } else {
                object2 = this.e;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl3 = false;
                    object2 = null;
                }
                object2.setText((CharSequence)object3);
            }
            object2 = ((EditProfileData)object).getDisplayEmail();
            object5 = Boolean.TRUE;
            bl3 = Intrinsics.areEqual(object2, object5);
            if (bl3) {
                object2 = this.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emailAddress");
                    bl3 = false;
                    object2 = null;
                }
                object5 = ((EditProfileData)object).getDisplayUid();
                object2.setText((CharSequence)object5);
            }
            object2 = ((EditProfileData)object).getDateOfBirth();
            object5 = "dateOfBirthFieldLabelTv";
            String string2 = "dateOfBirthField";
            int n4 = 8;
            if (object2 != null) {
                object2 = this.i;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object2 = null;
                }
                object3 = ((EditProfileData)object).getDateOfBirth();
                object2.setText((CharSequence)object3);
                object2 = this.j;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl3 = false;
                    object2 = null;
                }
                object2.setVisibility(0);
            } else {
                object2 = this.i;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    object2 = null;
                }
                object2.setText((CharSequence)object3);
                object2 = this.j;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    bl3 = false;
                    object2 = null;
                }
                object2.setVisibility(n4);
            }
            cp_1.Companion.getClass();
            object2 = cp$a.e();
            object2.getClass();
            bl3 = cp_1.q();
            if (bl3) {
                object2 = this.D;
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                if ((object2 = this.E) != null) {
                    object2.setVisibility(0);
                }
                if ((object2 = ((EditProfileData)object).getGenderType()) != null) {
                    object2 = ((EditProfileData)object).getGenderType();
                    bl3 = kotlin.text.b.i((String)object2, (String)(object3 = "Male"), bl2 = true);
                    if (bl3) {
                        object2 = this.m;
                        if (object2 != null) {
                            object2.setChecked(bl2);
                        }
                    } else {
                        object2 = ((EditProfileData)object).getGenderType();
                        bl3 = kotlin.text.b.i((String)object2, (String)(object3 = "Female"), bl2);
                        if (bl3 && (object2 = this.l) != null) {
                            object2.setChecked(bl2);
                        }
                    }
                }
            } else {
                object2 = this.D;
                if (object2 != null) {
                    object2.setVisibility(n4);
                }
                if ((object2 = this.E) != null) {
                    object2.setVisibility(n4);
                }
            }
            if ((object2 = this.g) == null) {
                object2 = "telephoneField";
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object4 = object2;
            }
            object2 = ((EditProfileData)object).getMobileNumber();
            object4.setText((CharSequence)object2);
            object2 = this.h;
            if (object2 != null) {
                object = ((EditProfileData)object).getMobileNumber();
                object3 = new Px0$b((TextInputLayout)((Object)object2), (String)object);
                ((TextInputLayout)((Object)object2)).setTextInputAccessibilityDelegate((TextInputLayout$AccessibilityDelegate)object3);
            }
        }
    }

    public final String getAjioTitle() {
        return "Edit Profile";
    }

    public final AjioCustomToolbar$DisplayMode getDisplayMode() {
        return AjioCustomToolbar$DisplayMode.TITLE;
    }

    public final String getProductListDetail() {
        return null;
    }

    public final String getProductListTitle() {
        return null;
    }

    public final String getToolbarTitle() {
        return "Update Profile";
    }

    public final Boolean hasBackButton() {
        return Boolean.FALSE;
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.u;
        if (object != null && (object = ((hy3_0)object).i) != null) {
            mu1_1 mu1_12 = this.getViewLifecycleOwner();
            int n3 = 1;
            n5_0 n5_02 = new n5_0(this, n3);
            Px0$c px0$c = new Px0$c(n5_02);
            ((LiveData)object).e(mu1_12, px0$c);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        block20: {
            super.onActivityResult(n3, n4, (Intent)object);
            int n7 = 1;
            Object object2 = null;
            int n8 = 101;
            int n10 = -1;
            if (n3 != n8) {
                n8 = 102;
                if (n3 == n8 && n4 == n10) {
                    Object object3;
                    if (object != null) {
                        object3 = object.getStringExtra("EDIT_UPDATED_INFO");
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                    Object object4 = this.f;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("emailAddress");
                        n4 = 0;
                        object4 = null;
                    }
                    object4.setText((CharSequence)object3);
                    this.Oa();
                    object3 = this.getActivity();
                    if (object3 == null) break block20;
                    n3 = R$string.email_address_updated;
                    object3 = hv3_0.K(n3);
                    hv3_0.o0(n7, (String)object3, null);
                    object3 = this.u;
                    if (object3 == null) break block20;
                    n3 = (int)(((hy3_0)object3).p() ? 1 : 0);
                    if (n3 != 0) break block20;
                    object3 = this.getActivity();
                    if (object3 == null) break block20;
                    n4 = (int)(object3.isFinishing() ? 1 : 0);
                    if (n4 != 0) break block20;
                    ((ComponentActivity)object3).onBackPressed();
                    object4 = "from_edit";
                    int n14 = 1008;
                    try {
                        at2_1.h((Activity)object3, (String)object4, n14);
                    }
                    catch (Exception exception) {
                        object3 = yn3_0.a;
                        n4 = 0;
                        object4 = new Object[]{};
                        object = "Unable to open logout user and launch login activity";
                        ((yn3$a)object3).d((String)object, object4);
                    }
                }
            } else if (n4 == n10) {
                Object object5 = this.n;
                if (object5 != null && (object5 = ((EditProfileData)object5).getMobileNumber()) != null) {
                    object5 = StringsKt.m0((CharSequence)object5);
                    object2 = object5.toString();
                }
                if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                    object5 = new Object();
                    cp_1.Companion.getClass();
                    cp$a.e().getClass();
                    Object object6 = "+91".concat((String)object2);
                    ((HashMap)object5).put("Phone", object6);
                    object6 = AJIOApplication.Companion;
                    object6.getClass();
                    object = AJIOApplication$a.a();
                    object2 = object.f;
                    if (object2 == null) {
                        object6.getClass();
                        object.f = object6 = com.clevertap.android.sdk.a.g((Context)AJIOApplication$a.a());
                    }
                    object6 = object.f;
                    Intrinsics.checkNotNull(object6, "null cannot be cast to non-null type com.clevertap.android.sdk.CleverTapAPI");
                    object = ((a)object6).b.a;
                    object.s = n7;
                    ((a)object6).q((HashMap)object5);
                }
            }
        }
    }

    public final void onAttach(Context object) {
        ClassCastException classCastException2;
        Object object2;
        Object object3;
        block7: {
            boolean bl2;
            block8: {
                Intrinsics.checkNotNullParameter(object, "context");
                super.onAttach((Context)object);
                object3 = this.getActivity();
                this.o = object3;
                object2 = object3;
                try {
                    object2 = (OnFragmentInteractionListener)object3;
                }
                catch (ClassCastException classCastException2) {
                    break block7;
                }
                this.p = object2;
                boolean bl3 = object3 instanceof ps1_2;
                if (!bl3) break block8;
                object3 = (ps1_2)object3;
                this.q = object3;
            }
            if (bl2 = object instanceof fo3) {
                object3 = object;
                this.C = object3 = (fo3)object;
            }
            if (bl2 = object instanceof vh3_2) {
                object = (vh3_2)object;
                this.B = object;
            }
            return;
        }
        yn3_0.a.e(classCastException2);
        object3 = this.o;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(object3);
        ((StringBuilder)object2).append(" must implement OnFragmentInteractionListener");
        object3 = ((StringBuilder)object2).toString();
        ClassCastException classCastException3 = new ClassCastException((String)object3);
        throw classCastException3;
    }

    public final void onClick(View view) {
        px0_1 px0_12 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.phone_change;
        String string2 = "Intent_User_profile_data";
        Object object3 = "my account screen";
        String string3 = "page_type";
        if (n3 == n4) {
            object = this.getActivity();
            if (object != null) {
                object = uy1_0.a;
                Bundle bundle = new Bundle();
                object = uy1_0.c;
                object2 = uy1_0.a();
                bundle.putString((String)object, (String)object2);
                bundle.putString(string3, (String)object3);
                Object object4 = uy1_0.a;
                String string4 = ((NewCustomEventsRevamp)object4).getEC_USER_ACCOUNTS();
                object = AnalyticsManager.Companion;
                String string5 = bv_0.a((AnalyticsManager$Companion)object);
                String string6 = cv_0.a((AnalyticsManager$Companion)object);
                String string7 = uy1_0.k;
                Object var16_22 = null;
                String string8 = "";
                String string9 = "user_account_interactions";
                String string10 = "update mobile number";
                String string11 = "update mobile number";
                int n7 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, string4, string7, string8, string9, string10, string11, string5, bundle, string6, false, null, n7, null);
                object = new dx0_1();
                object2 = new Bundle();
                object3 = this.c;
                string3 = "firstName";
                object4 = null;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object3 = null;
                }
                object3 = ((AppCompatEditText)object3).getText();
                string4 = "";
                if (object3 != null) {
                    object3 = px0_12.c;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        object3 = null;
                    }
                    object3 = String.valueOf(((AppCompatEditText)object3).getText());
                } else {
                    object3 = string4;
                }
                object2.putString("Intent_User_FirstName", (String)object3);
                string3 = px0_12.F;
                object2.putString("INTENT_UPDATE_MOBILE_NUMBER_WINDOW", string3);
                object3 = px0_12.d;
                string3 = "lastName";
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    object3 = null;
                }
                if ((object3 = ((AppCompatEditText)object3).getText()) != null) {
                    object3 = px0_12.d;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object4 = object3;
                    }
                    object3 = ((AppCompatEditText)object4).getText();
                    string4 = String.valueOf(object3);
                }
                object2.putString("Intent_User_LastName", string4);
                object3 = px0_12.n;
                object2.putParcelable(string2, (Parcelable)object3);
                ((Fragment)object).setArguments((Bundle)object2);
                n4 = 101;
                ((Fragment)object).setTargetFragment(px0_12, n4);
                object2 = this.requireParentFragment().getChildFragmentManager();
                string2 = "editMobileBottomSheetFragment";
                ((DialogFragment)object).show((FragmentManager)object2, string2);
            }
        } else {
            n4 = R$id.email_change;
            String string12 = "EditProfile Screen";
            String string13 = "ChangePersonalInfo";
            if (n3 == n4) {
                object = this.getActivity();
                if (object != null) {
                    object = uy1_0.a;
                    object = new Bundle();
                    object2 = uy1_0.c;
                    Object object5 = uy1_0.a();
                    object.putString((String)object2, (String)object5);
                    object.putString(string3, (String)object3);
                    object5 = uy1_0.a;
                    String string14 = ((NewCustomEventsRevamp)object5).getEC_USER_ACCOUNTS();
                    object2 = AnalyticsManager.Companion;
                    String string15 = bv_0.a((AnalyticsManager$Companion)object2);
                    String string16 = cv_0.a((AnalyticsManager$Companion)object2);
                    String string17 = uy1_0.j;
                    boolean bl2 = false;
                    String string18 = "";
                    String string19 = "user_account_interactions";
                    String string20 = "update email address";
                    String string21 = "update email address";
                    int n8 = 1536;
                    NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object5, string14, string17, string18, string19, string20, string21, string15, (Bundle)object, string16, false, null, n8, null);
                    ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().pushButtonTapEvent("Change Email Address", string13, string12);
                    object = new Bundle();
                    object2 = this.n;
                    if (object2 != null) {
                        object.putParcelable(string2, (Parcelable)object2);
                    }
                    object2 = new ux0_0();
                    ((Fragment)object2).setArguments((Bundle)object);
                    n3 = 102;
                    ((Fragment)object2).setTargetFragment(px0_12, n3);
                    object = this.requireParentFragment().getChildFragmentManager();
                    string2 = "editEmailBottomSheetFragment";
                    ((DialogFragment)object2).show((FragmentManager)object, string2);
                }
            } else {
                n4 = R$id.password_change;
                if (n3 == n4 && (object = this.getActivity()) != null) {
                    AnalyticsManager.Companion.getInstance().getGtmEvents().pushButtonTapEvent("Change Password", string13, string12);
                    object = new sx0_1();
                    n4 = 103;
                    ((Fragment)object).setTargetFragment(this, n4);
                    object2 = this.requireParentFragment().getChildFragmentManager();
                    string2 = "editPwdBottomSheetFragment";
                    ((DialogFragment)object).show((FragmentManager)object2, string2);
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        int n3 = 1;
        super.onCreate((Bundle)object);
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
        object3 = "<this>";
        object2 = sw0_0.a((Class)object2, (String)object3, (Class)object2, string2, string2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            int n4;
            int n7;
            int n8;
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object4).concat((String)object3);
            this.u = object = (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
            object = this.getArguments();
            if (object != null && (n8 = (object = this.requireArguments()).containsKey((String)(object3 = "USER_EDIT_PROFILE_DATA"))) != 0) {
                object = this.requireArguments();
                object2 = "requireArguments(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                int n10 = Build.VERSION.SDK_INT;
                n7 = 33;
                if (n10 >= n7) {
                    object = (Parcelable)hx0_0.a((Bundle)object);
                } else {
                    n4 = (object = object.getParcelable((String)object3)) instanceof Parcelable;
                    if (n4 == 0) {
                        n8 = 0;
                        object = null;
                    }
                }
                this.n = object = (EditProfileData)object;
            }
            if ((object = this.getArguments()) != null && (n8 = (object = this.requireArguments()).containsKey((String)(object3 = "INTENT_UPDATE_MOBILE_NUMBER_WINDOW"))) != 0) {
                this.F = object = this.requireArguments().getString((String)object3);
            }
            if ((object = this.getArguments()) != null && (n8 = (object = this.requireArguments()).containsKey((String)(object3 = "INTENT_UPDATE_PENDING_REQUEST"))) != 0) {
                n8 = this.requireArguments().getBoolean((String)object3);
                this.G = object = Boolean.valueOf(n8 != 0);
            }
            if ((object = this.n) == null && (n8 = (object = this.o) instanceof BaseActivity) != 0) {
                object = StringCompanionObject.INSTANCE;
                n8 = R$string.acc_error_message_page_load_fail;
                object = hv3_0.K(n8);
                object3 = hv3_0.K(R$string.server_alert_msg2);
                object2 = new Object[n3];
                n7 = 0;
                object4 = null;
                object2[0] = object3;
                object = xh2_0.a((Object[])object2, n3, (String)object, "format(...)");
                FragmentActivity fragmentActivity = this.o;
                Intrinsics.checkNotNull(fragmentActivity, "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity");
                fragmentActivity = (BaseActivity)fragmentActivity;
                n4 = R$string.server_alert_msg2;
                object3 = hv3_0.K(n4);
                ((BaseSplitActivity)fragmentActivity).showNotification((String)object3, (String)object);
            }
            return;
        }
        String string3 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException(string3);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_myprofile_editprofile_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        this.p = null;
    }

    public final void onResume() {
        super.onResume();
        Object object = AnalyticsManager.Companion;
        ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().pushOpenScreenEvent("EditProfile Screen");
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        String string2 = newEEcommerceEventsRevamp.getPrevScreen();
        String string3 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp newCustomEventsRevamp = this.y;
        String string4 = "user account screen";
        newCustomEventsRevamp.newPushCustomScreenView("profile management screen", string4, string2, null, string3);
        object = this.t;
        int n3 = ((Object)object).length;
        newCustomEventsRevamp = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object[i3] = false;
        }
    }

    public final void onStop() {
        super.onStop();
        AnalyticsManager.Companion.getInstance().getNewEEcommerceEventsRevamp().setPreviousScreenData("profile management screen", "user account screen");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object object;
        px0_1 px0_12 = this;
        Object object2 = view;
        int n3 = 0;
        Object object3 = null;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object object4 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
        Object object5 = new fv0_2((vz3_0)((Object)object4));
        this.a = object5;
        int n4 = R$id.scroll_view;
        object5 = (ScrollView)view.findViewById(n4);
        this.r = object5;
        object4 = "mScrollviewEditProfile";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            n4 = 0;
            object5 = null;
        }
        object5 = object5.getChildAt(0);
        px0_12.s = object5;
        n4 = R$id.first_name;
        px0_12.c = object5 = (AjioEditText)object2.findViewById(n4);
        n4 = R$id.last_name;
        px0_12.d = object5 = (AjioEditText)object2.findViewById(n4);
        n4 = R$id.screen_name;
        px0_12.e = object5 = (AjioEditText)object2.findViewById(n4);
        n4 = R$id.email_address;
        px0_12.f = object5 = (AjioEditText)object2.findViewById(n4);
        n4 = R$id.date_of_birth_field;
        px0_12.i = object5 = (AjioTextView)object2.findViewById(n4);
        n4 = R$id.date_of_birth_field_label_tv;
        px0_12.j = object5 = (AjioTextView)object2.findViewById(n4);
        n4 = R$id.gender_radio_group;
        object5 = (RadioGroup)object2.findViewById(n4);
        px0_12.k = object5;
        n4 = R$id.radio_female;
        px0_12.l = object5 = (AjioRadioButton)object2.findViewById(n4);
        n4 = R$id.radio_male;
        px0_12.m = object5 = (AjioRadioButton)object2.findViewById(n4);
        n4 = R$id.telephone_field;
        px0_12.g = object5 = (AjioEditText)object2.findViewById(n4);
        n4 = R$id.phone_change;
        object5 = (TextView)object2.findViewById(n4);
        int n7 = R$id.email_change;
        TextView textView = (TextView)object2.findViewById(n7);
        int n8 = R$id.password_change;
        TextView textView2 = (TextView)object2.findViewById(n8);
        int n10 = R$id.reset;
        Object object6 = object2.findViewById(n10);
        Object object7 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object6, object7);
        object6 = (AjioButton)object6;
        int n14 = R$id.update;
        Object object8 = object2.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(object8, object7);
        object8 = (AjioButton)object8;
        int n15 = R$id.first_name_text_input;
        Object object9 = object2.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(object9, object7);
        object9 = (TextInputLayout)((Object)object9);
        int n16 = R$id.last_name_text_input;
        Object object10 = object2.findViewById(n16);
        Intrinsics.checkNotNullExpressionValue(object10, object7);
        Object object11 = object10;
        object11 = (TextInputLayout)((Object)object10);
        n16 = R$id.email_address_text_input;
        object10 = object2.findViewById(n16);
        Intrinsics.checkNotNullExpressionValue(object10, object7);
        Object object12 = object10;
        object12 = (TextInputLayout)((Object)object10);
        n16 = R$id.screen_name_text_input;
        object10 = object2.findViewById(n16);
        Intrinsics.checkNotNullExpressionValue(object10, object7);
        object7 = object10;
        object7 = (TextInputLayout)((Object)object10);
        n16 = R$id.telephone_field_text_input;
        object10 = (TextInputLayout)object2.findViewById(n16);
        px0_12.h = object10;
        n16 = R$id.edit_profile_gender_title;
        object10 = (AjioTextView)object2.findViewById(n16);
        px0_12.D = object10;
        n16 = R$id.edit_profile_gender_view;
        object10 = (LinearLayout)object2.findViewById(n16);
        px0_12.E = object10;
        n16 = R$id.edit_profile_root_view;
        object10 = (RelativeLayout)object2.findViewById(n16);
        if (object10 != null) {
            object = new kx0_0(object2, 0);
            object10.setOnTouchListener((View.OnTouchListener)object);
        }
        object = h40_0.a;
        int n17 = h40_0.X0();
        if (n17 != 0) {
            n17 = R$string.email_address_without_asterisk_hint;
            object = px0_12.getString(n17);
            ((TextInputLayout)((Object)object12)).setHint((CharSequence)object);
        } else {
            n17 = R$string.email_address_hint;
            object = px0_12.getString(n17);
            ((TextInputLayout)((Object)object12)).setHint((CharSequence)object);
        }
        object = px0_12.n;
        px0_12.Pa((EditProfileData)object);
        object = px0_12.a;
        Intrinsics.checkNotNull(object);
        object10 = px0_12.c;
        Object object13 = "firstName";
        if (object10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object13);
            n16 = 0;
            object10 = null;
        }
        Object object14 = "This field is mandatory";
        ((fv0_2)object).c((EditText)object10, (TextInputLayout)((Object)object9), (String)object14);
        object10 = px0_12.a;
        Intrinsics.checkNotNull(object10);
        object = fa3_2.REGEX;
        object3 = px0_12.c;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object13);
            n3 = 0;
            object3 = null;
        }
        int n18 = R$string.add_address_name_valid_msg;
        String string2 = hv3_0.K(n18);
        String string3 = "^[ A-Za-z]+$";
        Object object15 = object4;
        object4 = object12;
        object12 = object;
        Object object16 = object8;
        object8 = object11;
        object11 = object3;
        object13 = object9;
        ((fv0_2)object10).a((fa3_2)((Object)object), (EditText)object3, (TextInputLayout)((Object)object9), string3, string2);
        object3 = px0_12.a;
        object9 = "lastName";
        if (object3 != null) {
            object10 = px0_12.d;
            if (object10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n16 = 0;
                object10 = null;
            }
            ((fv0_2)object3).c((EditText)object10, (TextInputLayout)((Object)object8), (String)object14);
        }
        if ((object12 = px0_12.a) != null) {
            object3 = px0_12.d;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                n18 = 0;
                object13 = null;
            } else {
                object13 = object3;
            }
            n3 = R$string.add_address_name_valid_msg;
            String string4 = hv3_0.K(n3);
            string2 = "^[ A-Za-z]+$";
            object11 = object;
            string3 = object8;
            ((fv0_2)object12).a((fa3_2)((Object)object), (EditText)object13, (TextInputLayout)((Object)object8), string2, string4);
        }
        if ((object3 = px0_12.a) != null) {
            object = px0_12.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("screenName");
                n17 = 0;
                object = null;
            }
            ((fv0_2)object3).c((EditText)object, (TextInputLayout)((Object)object7), (String)object14);
        }
        if ((n3 = h40_0.X0()) == 0 && (object3 = px0_12.a) != null) {
            object = px0_12.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emailAddress");
                n17 = 0;
                object = null;
            }
            ((fv0_2)object3).c((EditText)object, (TextInputLayout)((Object)object4), (String)object14);
        }
        if ((object14 = px0_12.a) != null) {
            object3 = px0_12.g;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("telephoneField");
                n3 = 0;
                object3 = null;
            }
            object4 = px0_12.h;
            object = "Number should be 10 digits long and must not start with zero";
            ((fv0_2)object14).c((EditText)object3, (TextInputLayout)((Object)object4), (String)object);
        }
        object5.setOnClickListener((View.OnClickListener)px0_12);
        textView.setOnClickListener((View.OnClickListener)px0_12);
        textView2.setOnClickListener((View.OnClickListener)px0_12);
        object14 = px0_12.G;
        object3 = Boolean.TRUE;
        int n19 = Intrinsics.areEqual(object14, object3);
        if (n19 != 0) {
            object5.setAlpha(0.6f);
            n19 = 0;
            object14 = null;
            object5.setClickable(false);
        } else {
            object5.setAlpha(1.0f);
            n19 = 1;
            object5.setClickable(n19 != 0);
        }
        object14 = px0_12.i;
        object3 = "dateOfBirthField";
        if (object14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n19 = 0;
            object14 = null;
        }
        object14 = ((AppCompatTextView)object14).getText();
        object5 = "dd MMMM yyyy";
        object14 = k7.g((CharSequence)object14, (String)object5);
        n4 = 2;
        int n20 = 5;
        if (object14 != null) {
            px0_12.x = n17 = ((Calendar)object14).get(n20);
            px0_12.w = n17 = ((Calendar)object14).get(n4);
            n17 = 1;
            px0_12.v = n19 = ((Calendar)object14).get(n17);
        }
        if ((n19 = px0_12.v) == 0 || (n19 = px0_12.w) == 0 || (n19 = px0_12.x) == 0) {
            object14 = Calendar.getInstance();
            n17 = 1;
            px0_12.v = n7 = ((Calendar)object14).get(n17);
            px0_12.w = n4 = ((Calendar)object14).get(n4);
            px0_12.x = n19 = ((Calendar)object14).get(n20);
        }
        if ((object14 = this.getActivity()) != null) {
            object8 = this.requireActivity();
            object9 = new ix0_0(px0_12);
            n16 = px0_12.v;
            int n21 = px0_12.w;
            int n22 = px0_12.x;
            object7 = object14;
            object14 = new DatePickerDialog((Context)object8, (DatePickerDialog.OnDateSetListener)object9, n16, n21, n22);
            px0_12.b = object14;
            if ((object14 = object14.getDatePicker()) != null) {
                object5 = new Date();
                long l2 = ((Date)object5).getTime();
                object14.setMaxDate(l2);
            }
            if ((object14 = px0_12.i) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n19 = 0;
                object14 = null;
            }
            n4 = 0;
            object5 = null;
            object3 = new jx0_0(px0_12, 0);
            object14.setOnClickListener((View.OnClickListener)object3);
        }
        n3 = 1;
        object14 = new zm_1(px0_12, n3);
        object6.setOnClickListener((View.OnClickListener)object14);
        object14 = new lx0_0(px0_12, (View)object2);
        object8 = object16;
        object16.setOnClickListener((View.OnClickListener)object14);
        int n24 = Build.VERSION.SDK_INT;
        n19 = 23;
        if (n24 >= n19) {
            object2 = px0_12.r;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object15);
                n17 = 0;
                object = null;
            } else {
                object = object2;
            }
            object2 = new mx0_0(px0_12);
            lw_1.b((ScrollView)object, (mx0_0)object2);
        } else {
            object2 = px0_12.r;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object15);
                n17 = 0;
                object = null;
            } else {
                object = object2;
            }
            object2 = object.getViewTreeObserver();
            object14 = new nx0_0(px0_12);
            object2.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)object14);
        }
        object2 = px0_12.B;
        if (object2 != null) {
            n19 = 0;
            object14 = null;
            object2.showTabLayout(false);
        }
        if ((object2 = px0_12.C) != null) {
            object2.T1();
        }
        if ((object2 = px0_12.q) != null) {
            object14 = object2.getToolbar().getTitleTextView();
            if (object14 != null) {
                n3 = R$style.header_large;
                Hm3.f((TextView)object14, n3);
            }
            if ((object14 = object2.getToolbar().getTitleTextView()) != null) {
                n3 = hv3_0.m(R$color.new_accent_color_21);
                object14.setTextColor(n3);
            }
            object14 = object2.getToolbar();
            n3 = R$drawable.nav_back;
            ((Toolbar)object14).setNavigationIcon(n3);
            object2 = object2.getToolbar();
            if (object2 != null) {
                n19 = R$string.back_button_text;
                ((Toolbar)object2).setNavigationContentDescription(n19);
            }
            if ((object2 = px0_12.C) != null && (object2 = object2.getToolbar()) != null) {
                n19 = R$string.acc_page_header_edit_profile;
                object14 = hv3_0.K(n19);
                object2.setContentDescription((CharSequence)object14);
            }
            object14 = Looper.getMainLooper();
            object2 = new Handler((Looper)object14);
            n3 = 0;
            object3 = null;
            object14 = new Ox0(px0_12, 0);
            long l3 = 500L;
            object2.postDelayed((Runnable)object14, l3);
            object2 = px0_12.C;
            if (object2 != null && (object2 = object2.getToolbar()) != null) {
                n3 = 1;
                object14 = new Y5(px0_12, n3);
                ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object14);
            }
        }
    }
}

