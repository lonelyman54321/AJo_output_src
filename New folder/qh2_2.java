/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DatePickerDialog
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.InputFilter
 *  android.text.InputFilter$AllCaps
 *  android.text.InputFilter$LengthFilter
 *  android.text.SpannableString
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.UnderlineSpan
 *  android.view.ContextThemeWrapper
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
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
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.Pancard;
import com.ril.ajio.services.data.user.UserInformation;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/*
 * Renamed from qh2
 */
public final class qh2_2
extends Fragment
implements OnNavigationClickListener {
    public zo_0 A;
    public RelativeLayout B;
    public fo3 a;
    public CustomToolbarViewMerger b;
    public Toolbar c;
    public final NewEEcommerceEventsRevamp d;
    public AjioTextView e;
    public AjioTextView f;
    public TextInputEditText g;
    public TextInputEditText h;
    public AjioTextView i;
    public TextInputEditText j;
    public TextInputLayout k;
    public FrameLayout l;
    public AppCompatCheckBox m;
    public AjioTextView n;
    public int o;
    public int p;
    public int q;
    public DatePickerDialog r;
    public AjioTextView s;
    public FrameLayout t;
    public FrameLayout u;
    public qm2_2 v;
    public nm_1 w;
    public j3_0 x;
    public gq2_2 y;
    public final UserInformation z;

    public qh2_2() {
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.d = newEEcommerceEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.z = object = VX0.a(AJIOApplication.Companion);
    }

    public final void Oa() {
        int n3;
        qh2_2 qh2_22 = this;
        Object object = this.h;
        if (object != null) {
            object = ((AppCompatEditText)object).getText();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            int n4;
            n3 = object.length();
            if (n3 >= 0 && n3 < (n4 = 10)) {
                object = qh2_22.i;
                if (object != null) {
                    ai0_2.B((View)object);
                }
                object = rm2_0.a;
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n4 = R$string.pancard_valid_pan;
                String string2 = object.getString(n4);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Intrinsics.checkNotNullParameter(string2, "errorMessage");
                object = AnalyticsManager.Companion;
                String string3 = av_0.a((AnalyticsManager$Companion)object);
                String string4 = av_0.a((AnalyticsManager$Companion)object);
                String string5 = bv_0.a((AnalyticsManager$Companion)object);
                String string6 = cv_0.a((AnalyticsManager$Companion)object);
                NewCustomEventsRevamp newCustomEventsRevamp = rm2_0.a;
                int n7 = 1536;
                String string7 = "pan interactions";
                String string8 = "form error";
                String string9 = "pan_interactions";
                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string7, string8, string2, string9, string3, string4, string5, null, string6, false, null, n7, null);
                object = Unit.a;
            } else {
                object = qh2_22.i;
                if (object != null) {
                    ai0_2.i((View)object);
                    object = Unit.a;
                }
            }
        }
    }

    public final void Pa() {
        Object object;
        int n3;
        int n4;
        Vn3 vn3 = this.h;
        int n7 = 0;
        Object object2 = null;
        if (vn3 != null) {
            vn3 = vn3.getText();
        } else {
            n4 = 0;
            vn3 = null;
        }
        boolean bl2 = true;
        if (vn3 != null && ((n3 = (object = StringsKt.m0((CharSequence)((Object)vn3))).length()) == 0 || (n4 = vn3.length()) != (n3 = 10))) {
            n4 = 0;
            vn3 = null;
        } else {
            n4 = 1;
        }
        object = this.g;
        if (object != null) {
            object = ((AppCompatEditText)object).getText();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null && (n3 = (object = StringsKt.m0((CharSequence)object)).length()) == 0) {
            n4 = 0;
            vn3 = null;
        }
        if ((object = this.j) != null) {
            object2 = ((AppCompatEditText)object).getText();
        }
        if (object2 != null && (n7 = (object2 = StringsKt.m0((CharSequence)object2)).length()) == 0) {
            n4 = 0;
            vn3 = null;
        }
        if ((object2 = this.m) != null && (n7 = (int)(object2.isChecked() ? 1 : 0)) == 0) {
            n4 = 0;
            vn3 = null;
        }
        if (n4 == 0) {
            vn3 = this.e;
            if (vn3 != null) {
                vn3.setClickable(false);
            }
            if ((n4 = (int)(og1_1.b() ? 1 : 0)) != 0) {
                vn3 = this.e;
                if (vn3 != null) {
                    n7 = hv3_0.m(R$color.luxe_color_F5F5F5);
                    vn3.setBackgroundColor(n7);
                }
                if ((vn3 = this.e) != null) {
                    n7 = hv3_0.m(R$color.luxe_color_A5A5A5);
                    vn3.setTextColor(n7);
                }
            } else {
                vn3 = this.e;
                if (vn3 != null) {
                    n7 = R$drawable.revamp_disable_btn_bg;
                    ((AppCompatTextView)vn3).setBackgroundResource(n7);
                }
                if ((vn3 = this.e) != null) {
                    n7 = hv3_0.m(R$color.accent_color_12);
                    vn3.setTextColor(n7);
                }
            }
        } else {
            vn3 = this.i;
            if (vn3 != null) {
                ai0_2.i((View)vn3);
            }
            if ((vn3 = this.e) != null) {
                vn3.setClickable(bl2);
            }
            if ((n4 = (int)(og1_1.b() ? 1 : 0)) != 0) {
                vn3 = this.e;
                if (vn3 != null) {
                    n7 = hv3_0.m(R$color.luxe_color_121212);
                    vn3.setBackgroundColor(n7);
                }
                if ((vn3 = this.e) != null) {
                    n7 = hv3_0.m(R$color.luxe_color_E0E0E0);
                    vn3.setTextColor(n7);
                }
            } else {
                vn3 = this.e;
                if (vn3 != null) {
                    n7 = R$drawable.revamp_secondary_button_bg;
                    ((AppCompatTextView)vn3).setBackgroundResource(n7);
                }
                if ((vn3 = this.e) != null) {
                    n7 = hv3_0.m(R$color.accent_color_11);
                    vn3.setTextColor(n7);
                }
            }
        }
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof fo3;
        if (bl2) {
            object2 = object;
            this.a = object2 = (fo3)object;
            bl2 = object instanceof nm_1;
            if (bl2) {
                object2 = object;
                this.w = object2 = (nm_1)object;
                bl2 = object instanceof j3_0;
                if (bl2) {
                    object = (j3_0)object;
                    this.x = object;
                    return;
                }
                object = pn_2.b(object, " Must implement ActivityFragmentListener");
                object2 = new ClassCastException((String)object);
                throw object2;
            }
            object = pn_2.b(object, " must implement CartClosetListener");
            object2 = new ClassCastException((String)object);
            throw object2;
        }
        object = pn_2.b(object, " must implement ToolbarListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = cp_1.Companion;
        Object object2 = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
        object.getClass();
        cp$a.D((FragmentManager)object2);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object4 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object2, string2);
        String string3 = "factory";
        Intrinsics.checkNotNullParameter(object3, string3);
        String string4 = "defaultCreationExtras";
        object2 = li_2.a((Wd0)object4, string4, (rd3_0)object2, (E$b)object3, (Wd0)object4);
        object3 = qm2_2.class;
        object4 = "modelClass";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        String string5 = "<this>";
        Intrinsics.checkNotNullParameter(object3, string5);
        object3 = Reflection.getOrCreateKotlinClass((Class)object3);
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        Intrinsics.checkNotNullParameter(object3, string5);
        Object object5 = object3.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (object5 != null) {
            int n3;
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object5 = string7.concat((String)object5);
            this.v = object2 = (qm2_2)((pD3)object2).a((yn1_2)object3, (String)object5);
            object2 = this.getParentFragment();
            if (object2 != null) {
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object3 = object2.getViewModelStore();
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object5 = object2.getDefaultViewModelProviderFactory();
                object = oh2_0.a((Fragment)object2, (String)object, (rd3_0)object3, string2);
                Intrinsics.checkNotNullParameter(object5, string3);
                Intrinsics.checkNotNullParameter(object, string4);
                object2 = zo_0.class;
                object = rl3_0.b((rd3_0)object3, (E$b)object5, (Wd0)object, object2, (String)object4);
                object2 = sw0_0.a(object2, string5, object2, (String)object4, (String)object4);
                Intrinsics.checkNotNullParameter(object2, string5);
                object3 = object2.getQualifiedName();
                if (object3 != null) {
                    object3 = string7.concat((String)object3);
                    this.A = object = (zo_0)((pD3)object).a((yn1_2)object2, (String)object3);
                } else {
                    object2 = string6.toString();
                    object = new IllegalArgumentException((String)object2);
                    throw object;
                }
            }
            this.b = object = new CustomToolbarViewMerger(this);
            object = this.d;
            object2 = "PAN verification screen";
            ((NewEEcommerceEventsRevamp)object).setCurrentScreen((String)object2);
            object = AnalyticsManager.Companion;
            object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
            ((GTMEvents)object3).setScreenName((String)object2);
            ((AnalyticsManager$Companion)object).getInstance().getGtmEvents().pushOpenScreenEvent((String)object2);
            boolean bl2 = true;
            this.setHasOptionsMenu(bl2);
            object = this.getActivity();
            if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
                object = this.requireActivity();
                object.invalidateOptionsMenu();
            }
            if ((object2 = ((UserInformation)(object = this.z)).getEncryptionKey()) != null && (n3 = ((String)object2).length()) != 0) {
                if ((object = ((UserInformation)object).getEncryptionKeyVersion()) == null) {
                    object = "";
                }
                this.y = object3 = new gq2_2((String)object2, (String)object);
            }
            return;
        }
        object2 = string6.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu2, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu2, menuInflater);
        menu2.clear();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.layout_pancard_verification_luxe;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        } else {
            n3 = R$layout.layout_pancard_verification;
            layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        }
        object = new CustomToolbarViewMerger(this);
        this.b = object;
        ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        return layoutInflater;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        bundle = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(bundle, "onGetLayoutInflater(...)");
        Context context = this.requireContext();
        int n3 = R$style.PanCardTheme;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n3);
        bundle = bundle.cloneInContext((Context)contextThemeWrapper);
        Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
        return bundle;
    }

    public final void onNavigationClick() {
        boolean bl2;
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null && !(bl2 = (fragmentActivity = this.requireActivity()).isFinishing())) {
            rm2_0.b("close");
            fragmentActivity = this.getActivity();
            if (fragmentActivity != null) {
                fragmentActivity.onBackPressed();
            }
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3;
        int n4;
        InputFilter[] inputFilterArray;
        float f5;
        Object object4;
        Object object5;
        Object object6;
        int n7;
        Object object7;
        int n8;
        int n10 = 2;
        boolean bl2 = false;
        Object object8 = null;
        int n14 = 1;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.a;
        Object object9 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarListener");
            n8 = 0;
            object2 = null;
        }
        object2.hideToolbarLayout();
        object2 = this.b;
        if (object2 != null) {
            object2 = ((CustomToolbarViewMerger)object2).getToolbar();
        } else {
            n8 = 0;
            object2 = null;
        }
        this.c = object2;
        object2 = this.getActivity();
        n8 = object2 instanceof AppCompatActivity;
        if (n8 != 0) {
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            object2 = (AppCompatActivity)object2;
            object7 = this.c;
            ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object7);
        }
        if ((object2 = this.b) != null) {
            ((CustomToolbarViewMerger)object2).setNavigationClick();
        }
        n8 = og1_1.b();
        object7 = "getString(...)";
        if (n8 != 0) {
            object2 = this.b;
            if (object2 != null) {
                n7 = R$string.pancard_verification;
                object6 = this.getString(n7);
                Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
                object5 = Locale.getDefault();
                object4 = "getDefault(...)";
                Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                object6 = ((String)object6).toUpperCase((Locale)object5);
                object5 = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(object6, (String)object5);
                ((CustomToolbarViewMerger)object2).setTitleText((String)object6);
            }
        } else {
            object2 = this.b;
            if (object2 != null) {
                n7 = R$string.pancard_verification;
                object6 = this.getString(n7);
                Intrinsics.checkNotNullExpressionValue(object6, (String)object7);
                ((CustomToolbarViewMerger)object2).setTitleText((String)object6);
            }
        }
        if ((object2 = this.c) != null) {
            object6 = new yc(this, n14);
            ((Toolbar)object2).setNavigationOnClickListener((View.OnClickListener)object6);
        }
        if ((object2 = this.b) != null) {
            n7 = 1098907648;
            f5 = 16.0f;
            ((CustomToolbarViewMerger)object2).setFloatViewTitleTextSize(f5);
        }
        if ((object2 = this.b) != null && (object2 = ((CustomToolbarViewMerger)object2).getSubtitlefloatLayout()) != null) {
            object6 = object2.getLayoutParams();
            if (object6 != null) {
                object6 = (ViewGroup.MarginLayoutParams)object6;
                ((ViewGroup.MarginLayoutParams)object6).leftMargin = 0;
                object6.setMarginStart(0);
                object2.setLayoutParams((ViewGroup.LayoutParams)object6);
            } else {
                object = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                throw object;
            }
        }
        if ((object2 = this.b) != null) {
            n7 = 8;
            f5 = 1.1E-44f;
            ((CustomToolbarViewMerger)object2).setSubTitleVisibility(n7);
        }
        if ((object5 = this.b) != null) {
            int n15 = R$drawable.ic_cancel_cart_refresh;
            n8 = R$string.close;
            inputFilterArray = this.getString(n8);
            int n16 = 8;
            String string2 = "cartpage";
            n4 = 0;
            CustomToolbarViewMerger.setNavigationIcon$default((CustomToolbarViewMerger)object5, n15, (String)inputFilterArray, string2, null, n16, null);
        }
        n8 = R$id.app_bar_layout;
        ((AppBarLayout)object.findViewById(n8)).setExpanded(n14 != 0);
        n8 = R$id.pancard_root_view;
        object2 = (RelativeLayout)object.findViewById(n8);
        this.B = object2;
        n8 = R$id.pancard_description_tv;
        this.f = object2 = (AjioTextView)object.findViewById(n8);
        n8 = R$id.pancard_name_label;
        object2 = (TextInputLayout)object.findViewById(n8);
        n8 = R$id.pancard_name_field;
        object2 = (TextInputEditText)object.findViewById(n8);
        this.g = object2;
        if (object2 != null) {
            object6 = new ce_1(n14 != 0);
            object5 = new ce_1[n14];
            object5[0] = object6;
            object5 = object5;
            object2.setFilters(object5);
        }
        n8 = R$id.pancard_name_frame;
        object2 = (FrameLayout)object.findViewById(n8);
        this.t = object2;
        n8 = R$id.pancard_pan_field;
        object2 = (TextInputEditText)object.findViewById(n8);
        this.h = object2;
        if (object2 != null) {
            object6 = new InputFilter.AllCaps();
            object5 = new ce_1(false);
            object4 = new InputFilter.LengthFilter(10);
            n3 = 3;
            inputFilterArray = new InputFilter[n3];
            inputFilterArray[0] = object6;
            inputFilterArray[n14] = object5;
            inputFilterArray[n10] = object4;
            object2.setFilters(inputFilterArray);
        }
        n8 = R$id.pancard_pan_label;
        object2 = (TextInputLayout)object.findViewById(n8);
        n8 = R$id.pan_number_error;
        object2 = (AjioTextView)object.findViewById(n8);
        this.i = object2;
        n8 = R$id.pancard_pan_frame;
        object2 = (FrameLayout)object.findViewById(n8);
        this.u = object2;
        n8 = R$id.pancard_dob_frame;
        object2 = (FrameLayout)object.findViewById(n8);
        this.l = object2;
        n8 = R$id.pancard_customer_dob_field;
        object2 = (TextInputEditText)object.findViewById(n8);
        this.j = object2;
        n8 = R$id.pancard_customer_dob_label;
        object2 = (TextInputLayout)object.findViewById(n8);
        this.k = object2;
        n8 = R$id.validate_pan_btn;
        object2 = (AjioTextView)object.findViewById(n8);
        this.e = object2;
        n8 = R$id.pancard_consent_view;
        object2 = (LinearLayout)object.findViewById(n8);
        n8 = R$id.pancard_consent_cb;
        object2 = (AppCompatCheckBox)object.findViewById(n8);
        this.m = object2;
        n8 = R$id.pancard_consent_tv;
        object2 = (AjioTextView)object.findViewById(n8);
        this.n = object2;
        n8 = R$id.pancard_valid_info_view;
        object2 = (AjioTextView)object.findViewById(n8);
        this.s = object2;
        object2 = this.j;
        if (object2 != null) {
            object2 = ((AppCompatEditText)object2).getText();
        } else {
            n8 = 0;
            object2 = null;
        }
        object6 = "dd MMM yyyy";
        object2 = k7.g((CharSequence)object2, (String)object6);
        n7 = 5;
        f5 = 7.0E-45f;
        if (object2 != null) {
            int n17;
            this.q = n17 = ((Calendar)object2).get(n7);
            this.p = n17 = ((Calendar)object2).get(n10);
            this.o = n8 = ((Calendar)object2).get(n14);
        }
        if ((n8 = this.o) == 0 || (n8 = this.p) == 0 || (n8 = this.q) == 0) {
            object2 = Calendar.getInstance();
            this.o = n14 = ((Calendar)object2).get(n14);
            this.p = n14 = ((Calendar)object2).get(n10);
            this.q = n8 = ((Calendar)object2).get(n7);
        }
        if ((object2 = this.getActivity()) != null) {
            object5 = this.requireActivity();
            object4 = new mh2_0(this);
            n3 = this.o;
            int n18 = this.p;
            n4 = this.q;
            object6 = object2;
            object2 = new DatePickerDialog((Context)object5, (DatePickerDialog.OnDateSetListener)object4, n3, n18, n4);
            this.r = object2;
            if ((object2 = object2.getDatePicker()) != null) {
                long l2 = System.currentTimeMillis();
                object2.setMaxDate(l2);
            }
        }
        if ((object2 = this.B) != null) {
            object3 = new Object();
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object2 = this.l) != null) {
            object3 = new jh2_2((View)object, this);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        if ((object = this.f) != null) {
            object2 = this.A;
            if (object2 != null && (object2 = ((zo_0)object2).b) != null) {
                object2 = ((Pancard)object2).getDescription();
            } else {
                n8 = 0;
                object2 = null;
            }
            object.setText((CharSequence)object2);
        }
        this.Pa();
        object = this.e;
        if (object != null) {
            object2 = new Bc(this, n10);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        int n19 = R$string.pancard_consent;
        object = this.getString(n19);
        Intrinsics.checkNotNullExpressionValue(object, (String)object7);
        object2 = new SpannableString((CharSequence)object);
        n10 = R$string.pancard_declaration;
        Object object10 = this.getString(n10);
        Intrinsics.checkNotNullExpressionValue(object10, (String)object7);
        n19 = StringsKt.O((CharSequence)object, (String)object10, 0, false, 6);
        n10 = ((String)object10).length() + n19;
        object8 = new ph2_1(this);
        n14 = 18;
        object2.setSpan(object8, n19, n10, n14);
        bl2 = og1_1.b();
        if (bl2) {
            object8 = new UnderlineSpan();
            object2.setSpan(object8, n19, n10, n14);
        } else {
            int n20 = hv3_0.m(R$color.link_color_size_recommend);
            object8 = new ForegroundColorSpan(n20);
            object2.setSpan(object8, n19, n10, n14);
        }
        object = this.n;
        if (object != null) {
            object10 = LinkMovementMethod.getInstance();
            object.setMovementMethod((MovementMethod)object10);
        }
        if ((object = this.n) != null) {
            object.setText((CharSequence)object2);
        }
        if ((object = this.m) != null) {
            object2 = new lh2_0(this);
            object.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object2);
        }
        if ((object = this.g) != null) {
            object2 = new nh2_2(this);
            ai0_2.o((EditText)object, (hx0_2)object2);
        }
        if ((object = this.h) != null) {
            object2 = new eh2_2(this);
            ai0_2.o((EditText)object, (hx0_2)object2);
        }
        if ((object = this.g) != null) {
            object2 = new fh2_1(this);
            object.setOnFocusChangeListener((View.OnFocusChangeListener)object2);
        }
        if ((object = this.h) != null) {
            object2 = new gh2_1(this);
            object.setOnFocusChangeListener((View.OnFocusChangeListener)object2);
        }
        if ((object = this.l) != null) {
            object2 = new hh2_1(this);
            object.setOnFocusChangeListener((View.OnFocusChangeListener)object2);
        }
        if ((object = this.getActivity()) != null && (n19 = (int)((object = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
            object = this.requireActivity();
            object.invalidateOptionsMenu();
        }
        if ((object = this.getActivity()) != null && (object = object.getWindow()) != null) {
            n8 = 16;
            object.setSoftInputMode(n8);
        }
        if ((object = this.v) == null) {
            object = "panCardVerificationViewModel";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object9 = object;
        }
        object = object9.c;
        object2 = this.getViewLifecycleOwner();
        object10 = new kh2_2(this);
        object8 = new qh2$a_0((kh2_2)object10);
        ((LiveData)object).e((mu1_1)object2, (F62)object8);
    }
}

