/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.DecelerateInterpolator
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import com.ril.ajio.view.BaseActivity;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jc0
 */
public class jc0_0
extends Fragment
implements View.OnClickListener {
    public FragmentActivity a;
    public AjioButton b;
    public AjioProgressView c;
    public AjioTextView d;
    public CouponPromotion e;
    public boolean f = false;
    public h91 g;

    public final void Oa(String string2) {
        this.d.setText(string2);
        this.d.invalidate();
    }

    public final void onAttach(Context object) {
        super.onAttach((Context)object);
        object = this.getActivity();
        this.a = object;
    }

    public final void onClick(View object) {
        int n3 = object.getId();
        int n4 = R$id.fragment_coupons_btn;
        int n7 = 1;
        if (n3 == n4) {
            n3 = (int)(this.f ? 1 : 0);
            if (n3 == 0) {
                sc0_2 sc0_22 = new sc0_2();
                object = new Bundle();
                String string2 = "couponsdata";
                CouponPromotion couponPromotion = this.e;
                object.putSerializable(string2, (Serializable)couponPromotion);
                sc0_22.setArguments((Bundle)object);
                object = this.a;
                n4 = object instanceof AjioHomeActivity;
                if (n4 != 0) {
                    Object object2 = object;
                    object2 = (AjioHomeActivity)object;
                    Fragment fragment = ((AjioHomeActivity)object2).T0;
                    Boolean bl2 = Boolean.FALSE;
                    boolean bl3 = true;
                    String string3 = "COUPONSLISTCREEN";
                    ((AjioHomeActivity)object2).Q1(fragment, sc0_22, bl3, string3, bl2);
                }
            } else {
                object = this.getParentFragment().getChildFragmentManager();
                n3 = ((FragmentManager)object).J();
                if (n3 > n7) {
                    object = this.getParentFragment().getChildFragmentManager();
                    ((FragmentManager)object).V();
                }
            }
        } else {
            n4 = R$id.back_button_cb;
            if (n3 == n4 && (n3 = ((FragmentManager)(object = this.getParentFragment().getChildFragmentManager())).J()) > n7) {
                object = this.getParentFragment().getChildFragmentManager();
                ((FragmentManager)object).V();
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = kd3_2.a();
        Object object2 = this.requireActivity().getApplicationContext();
        Object object3 = new HomeRepo((Context)object2);
        object2 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object3;
        ((kd3_2)object).b = object2;
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
        object2 = h91.class;
        String string2 = "modelClass";
        object = im_1.a(rd3_02, (kd3_2)object, (Wd0)object3, (Class)object2, string2);
        object3 = ef0_0.a((Class)object2, string2, string2, "<this>");
        object2 = object3.getQualifiedName();
        if (object2 != null) {
            object2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object2);
            this.g = object = (h91)((pD3)object).a((yn1_2)object3, (String)object2);
            return;
        }
        object3 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object3);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n3 = R$layout.couponpromotion_fragment_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        ((BaseActivity)this.a).I2();
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            fragmentActivity = (BaseActivity)this.getActivity();
            AjioCustomToolbar ajioCustomToolbar = ((BaseActivity)fragmentActivity).k0;
            if (ajioCustomToolbar != null) {
                ((BaseActivity)fragmentActivity).w0 = true;
                ajioCustomToolbar.setVisibility(0);
                LinearLayout linearLayout = ((BaseActivity)fragmentActivity).p0;
                if (linearLayout != null) {
                    int n3 = el3.b((Context)fragmentActivity);
                    int n4 = -1 << -1;
                    n3 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)n4);
                    int n7 = el3.a((Context)fragmentActivity);
                    n4 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n4);
                    ajioCustomToolbar.measure(n3, n4);
                    n3 = ajioCustomToolbar.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    layoutParams.height = n3;
                    linearLayout.setLayoutParams(layoutParams);
                    ajioCustomToolbar = ajioCustomToolbar.animate();
                    n3 = 0;
                    ajioCustomToolbar = ajioCustomToolbar.translationY(0.0f);
                    n4 = 0x40000000;
                    float f5 = 2.0f;
                    DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(f5);
                    ajioCustomToolbar = ajioCustomToolbar.setInterpolator((TimeInterpolator)decelerateInterpolator);
                    ajioCustomToolbar.start();
                    ((BaseActivity)fragmentActivity).w0 = false;
                    linearLayout.setVisibility(0);
                }
            }
        }
        super.onDestroyView();
    }

    public final void onViewCreated(View object, Bundle object2) {
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.g.k;
        Object object3 = this.getViewLifecycleOwner();
        Object object4 = new Hc0(this);
        ((LiveData)object2).e((mu1_1)object3, (F62)object4);
        int n3 = R$id.fragment_coupons_btn;
        this.b = object2 = (AjioButton)object.findViewById(n3);
        object2.setOnClickListener((View.OnClickListener)this);
        n3 = R$id.coupons_promotion_progress_bar;
        object2 = (AjioProgressView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.coupon_promotion_label;
        object2 = (AjioTextView)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.back_button_cb;
        ((ImageView)object.findViewById(n3)).setOnClickListener((View.OnClickListener)this);
        object = this.getActivity();
        boolean bl2 = object instanceof BaseActivity;
        if (bl2) {
            ((BaseActivity)this.getActivity()).hideToolbarLayout();
            object = (BaseActivity)this.getActivity();
            ((BaseActivity)object).F2();
        }
        if ((object = this.getArguments()) != null) {
            object = this.getArguments();
            object2 = "HELP_REQUST";
            object3 = null;
            this.f = bl2 = object.getBoolean((String)object2, false);
        }
        if (!(bl2 = this.f)) {
            object = this.g;
            object2 = ((h91)object).b.getAjioCouponPromotions();
            int n4 = 2;
            object3 = new hc_2((Hj)object, n4);
            object4 = new ic_0(2, (Function1)object3);
            object3 = new f91(object, 0);
            int n7 = 1;
            kc_0 kc_02 = new kc_0(object3, n7);
            object2 = ((g53_0)object2).f((o60_0)object4, kc_02);
            object = ((h91)object).z;
            ((t30_0)object).b((yr0_2)object2);
        }
        AnalyticsManager.getInstance().getGtmEvents().pushOpenScreenEvent("StealManiaLandingScreen");
    }
}

