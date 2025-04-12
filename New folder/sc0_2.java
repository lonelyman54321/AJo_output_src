/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ajio.ril.core.network.model.DataError;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.ActivityTransitionManager;
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import com.ril.ajio.view.BaseActivity;
import com.ril.ajio.view.BaseSplitActivity;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Sc0
 */
public final class sc0_2
extends Fragment
implements m82_0,
iw0_1 {
    public static final Sc0$a Companion;
    public FragmentActivity a;
    public RecyclerView b;
    public AjioProgressView c;
    public CountDownTimer d;
    public CouponPromotion e;
    public gd0_2 f;
    public AjioButton g;
    public AjioTextView h;
    public AjioTextView i;
    public AjioAspectRatioImageView j;
    public ArrayList k;
    public h91 l;
    public hy3_0 m;
    public Dialog n;

    static {
        Sc0$a sc0$a;
        Companion = sc0$a = new Object();
    }

    public sc0_2() {
        ArrayList arrayList;
        this.k = arrayList = new ArrayList();
    }

    public final void Oa(String object, String string2, String string3) {
        if ((object = cb2_0.a((String)object, string2, string3)) != null) {
            boolean bl2 = ((fn3_0)object).a;
            string3 = "getMessage(...)";
            if (bl2) {
                string2 = ((fn3_0)object).b;
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                long l2 = ((fn3_0)object).f;
                object = new tc0_0(l2, this, string2);
                object = object.start();
                this.d = object;
            } else {
                object = ((fn3_0)object).b;
                Intrinsics.checkNotNullExpressionValue(object, string3);
                this.Sa((String)object);
            }
        }
    }

    public final Dialog Pa() {
        Dialog dialog = this.n;
        if (dialog != null) {
            return dialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    public final int Qa() {
        int n3;
        Iterator iterator = this.k.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator, "iterator(...)");
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            Object object = iterator.next();
            String string2 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (CouponEntity)object;
            n3 = ((CouponEntity)object).getEossVoucherValue();
            n4 += n3;
        }
        return n4;
    }

    public final void Ra() {
        Object object = this.requireActivity();
        Object object2 = new LinearLayoutManager((Context)object);
        Object object3 = this.e;
        Intrinsics.checkNotNull(object3);
        Intrinsics.checkNotNullParameter(object3, "data");
        Intrinsics.checkNotNullParameter(this, "listener");
        object = new RecyclerView$f();
        ((gd0_2)object).a = this;
        Object object4 = new CouponPromotion();
        ((gd0_2)object).b = object4;
        object4 = "null cannot be cast to non-null type android.view.LayoutInflater";
        Object object5 = null;
        Intrinsics.checkNotNull(null, (String)object4);
        ((gd0_2)object).b = object3;
        object3 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        this.f = object;
        object = this.b;
        if (object != null) {
            object3 = null;
            ((RecyclerView)object).setNestedScrollingEnabled(false);
        }
        if ((object = this.b) != null) {
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        if ((object2 = this.b) != null) {
            object = this.f;
            if (object != null) {
                object5 = object;
            } else {
                object = "adapter";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            }
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object5);
        }
        this.Ua();
        object2 = this.e;
        Intrinsics.checkNotNull(object2);
        object2 = ((CouponPromotion)object2).getSaleStartTime();
        Intrinsics.checkNotNullExpressionValue(object2, "getSaleStartTime(...)");
        object = this.e;
        Intrinsics.checkNotNull(object);
        object = ((CouponPromotion)object).getSaleEndTime();
        Intrinsics.checkNotNullExpressionValue(object, "getSaleEndTime(...)");
        object3 = this.e;
        Intrinsics.checkNotNull(object3);
        object3 = ((CouponPromotion)object3).getServerTime();
        Intrinsics.checkNotNullExpressionValue(object3, "getServerTime(...)");
        this.Oa((String)object2, (String)object, (String)object3);
    }

    public final void Sa(String object) {
        boolean bl2 = this.isVisible();
        if (bl2) {
            Object object2;
            WN1 wN1 = this.a;
            String string2 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
            Intrinsics.checkNotNull(wN1, string2);
            wN1 = (BaseActivity)wN1;
            AjioCustomToolbar ajioCustomToolbar = ((BaseActivity)wN1).k0;
            if (ajioCustomToolbar != null) {
                object2 = AjioCustomToolbar$DisplayMode.PRODUCTINFO;
                ajioCustomToolbar.setDisplayMode((AjioCustomToolbar$DisplayMode)((Object)object2));
            }
            if ((ajioCustomToolbar = ((BaseActivity)wN1).k0) != null) {
                object2 = "AJIO Steal Mania";
                ajioCustomToolbar.setProductListTitleText((String)object2);
            }
            if ((wN1 = ((BaseActivity)wN1).k0) != null) {
                ((AjioCustomToolbar)wN1).setProductListDetailText((String)object);
            }
            object = this.a;
            Intrinsics.checkNotNull(object, string2);
            object = ((BaseActivity)object).k0;
            if (object != null) {
                object.invalidate();
            }
        }
    }

    public final void T3(CouponEntity couponEntity) {
        Intrinsics.checkNotNullParameter(couponEntity, "entity");
        this.k.remove(couponEntity);
        couponEntity.setSelected(false);
        this.Ua();
    }

    public final void Ta(DataError object) {
        int n3;
        Object object2;
        int n4 = 1;
        if (object != null) {
            object2 = ((DataError)object).getErrorMessage();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null && (object2 = this.a) != null) {
            Intrinsics.checkNotNull(object2);
            n3 = object2.isFinishing();
            if (n3 == 0 && (n3 = (object2 = this.a) instanceof BaseActivity) != 0) {
                object2 = StringCompanionObject.INSTANCE;
                n3 = R$string.acc_error_message;
                object2 = hv3_0.K(n3);
                String string2 = ((DataError)object).getErrorMessage().getMessage();
                Object[] objectArray = new Object[n4];
                objectArray[0] = string2;
                String string3 = xh2_0.a(objectArray, n4, (String)object2, "format(...)");
                object2 = this.a;
                string2 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
                Intrinsics.checkNotNull(object2, string2);
                object2 = (BaseActivity)object2;
                object = ((DataError)object).getErrorMessage().getMessage();
                ((BaseSplitActivity)object2).showNotification((String)object, string3);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Ua() {
        AjioTextView ajioTextView = this.i;
        Intrinsics.checkNotNull(ajioTextView);
        int n3 = R$string.coupons_promotion_points_msg4;
        Object object = this.k.size();
        boolean bl2 = true;
        Object[] objectArray = new Object[bl2];
        objectArray[0] = object;
        String string2 = hv3_0.L(n3, objectArray);
        ajioTextView.setText(string2);
        AjioTextView ajioTextView2 = this.i;
        Intrinsics.checkNotNull(ajioTextView2);
        n3 = R$string.coupons_promotion_points_msg4;
        int n4 = this.k.size();
        object = n4;
        Object[] objectArray2 = new Object[bl2];
        objectArray2[0] = object;
        string2 = hv3_0.L(n3, objectArray2);
        ajioTextView2.setText(string2);
        ArrayList arrayList = this.k;
        int n7 = arrayList.size();
        n3 = 8;
        if (n7 == 0) {
            AjioAspectRatioImageView ajioAspectRatioImageView = this.j;
            Intrinsics.checkNotNull((Object)ajioAspectRatioImageView);
            ajioAspectRatioImageView.setVisibility(n3);
            AjioButton ajioButton = this.g;
            Intrinsics.checkNotNull(ajioButton);
            ajioButton.setEnabled(false);
            AjioTextView ajioTextView3 = this.h;
            Intrinsics.checkNotNull(ajioTextView3);
            string2 = hv3_0.K(R$string.coupons_promotion_points_msg3);
            ajioTextView3.setText(string2);
            AjioTextView ajioTextView4 = this.h;
            Intrinsics.checkNotNull(ajioTextView4);
            n3 = hv3_0.m(R$color.color_black_ajio);
            ajioTextView4.setTextColor(n3);
            return;
        }
        n7 = this.Qa();
        object = this.h;
        Intrinsics.checkNotNull(object);
        int n8 = R$string.coupons_promotion_points_msg5;
        Integer n10 = n7;
        Object[] objectArray3 = new Object[bl2];
        objectArray3[0] = n10;
        String string3 = hv3_0.L(n8, objectArray3);
        object.setText((CharSequence)string3);
        object = this.m;
        Intrinsics.checkNotNull(object);
        n4 = (int)(((hy3_0)object).p() ? 1 : 0);
        if (n4 != 0) {
            object = this.e;
            Intrinsics.checkNotNull(object);
            object = ((CouponPromotion)object).getBalancePoints();
            n4 = Integer.parseInt((String)object);
            if (n7 > n4) {
                AjioAspectRatioImageView ajioAspectRatioImageView = this.j;
                Intrinsics.checkNotNull((Object)ajioAspectRatioImageView);
                ajioAspectRatioImageView.setVisibility(0);
                AjioButton ajioButton = this.g;
                Intrinsics.checkNotNull(ajioButton);
                ajioButton.setEnabled(false);
                AjioTextView ajioTextView5 = this.h;
                Intrinsics.checkNotNull(ajioTextView5);
                n3 = hv3_0.m(R$color.not_applied_text_color);
                ajioTextView5.setTextColor(n3);
                return;
            }
        }
        AjioButton ajioButton = this.g;
        Intrinsics.checkNotNull(ajioButton);
        ajioButton.setEnabled(bl2);
        AjioAspectRatioImageView ajioAspectRatioImageView = this.j;
        Intrinsics.checkNotNull((Object)ajioAspectRatioImageView);
        ajioAspectRatioImageView.setVisibility(n3);
        AjioTextView ajioTextView6 = this.h;
        Intrinsics.checkNotNull(ajioTextView6);
        n3 = hv3_0.m(R$color.color_black_ajio);
        ajioTextView6.setTextColor(n3);
    }

    public final void dismissProgress() {
        FragmentActivity fragmentActivity = this.getActivity();
        boolean bl2 = fragmentActivity instanceof BaseSplitActivity;
        if (bl2 && (fragmentActivity = (BaseSplitActivity)this.getActivity()) != null) {
            ((BaseSplitActivity)fragmentActivity).dismissProgress();
        }
    }

    public final void e6(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        kj0_1 kj0_12 = kj0_1.g();
        FragmentActivity fragmentActivity = this.a;
        kj0_12.w(fragmentActivity, string2);
    }

    public final void initProgress() {
        FragmentActivity fragmentActivity = this.getActivity();
        boolean bl2 = fragmentActivity instanceof BaseSplitActivity;
        if (bl2 && (fragmentActivity = (BaseSplitActivity)this.getActivity()) != null) {
            ((BaseSplitActivity)fragmentActivity).initProgress();
        }
    }

    public final void l1(String string2) {
        String string3 = "Coupon copied";
        Intrinsics.checkNotNullParameter(string3, "message");
        Intrinsics.checkNotNullParameter(string2, "contentDescription");
        FragmentActivity fragmentActivity = this.a;
        if (fragmentActivity != null) {
            boolean bl2;
            Intrinsics.checkNotNull(fragmentActivity);
            boolean bl3 = fragmentActivity.isFinishing();
            if (!bl3 && (bl2 = (fragmentActivity = this.a) instanceof BaseActivity)) {
                String string4 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
                Intrinsics.checkNotNull(fragmentActivity, string4);
                fragmentActivity = (BaseActivity)fragmentActivity;
                ((BaseSplitActivity)fragmentActivity).showNotification(string3, string2);
            }
        }
    }

    public final void launchFeature(String string2, Bundle object) {
        Intrinsics.checkNotNullParameter(string2, "name");
        object = this.getActivity();
        Class clazz = hv3_0.l();
        string2 = new Intent((Context)object, clazz);
        object = this.m;
        Intrinsics.checkNotNull(object);
        boolean n3 = ((hy3_0)object).p();
        if (!n3) {
            int n4 = 7;
            this.startActivityForResult((Intent)string2, n4);
        } else {
            this.startActivity((Intent)string2);
        }
    }

    public final void onActivityCreated(Bundle object) {
        F62 f62;
        mu1_1 mu1_12;
        super.onActivityCreated((Bundle)object);
        object = this.l;
        if (object != null && (object = ((h91)object).i) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new lc0_0(this);
            ((LiveData)object).e(mu1_12, f62);
        }
        if ((object = this.l) != null && (object = ((h91)object).k) != null) {
            mu1_12 = this.getViewLifecycleOwner();
            f62 = new mc0_0(this);
            ((LiveData)object).e(mu1_12, f62);
        }
    }

    public final void onActivityResult(int n3, int n4, Intent intent) {
        super.onActivityResult(n3, n4, intent);
        n3 = -1;
        if (n4 == n3) {
            h91 h912 = this.l;
            if (h912 != null) {
                n4 = 0;
                h912.w = false;
            }
            if (h912 != null) {
                n4 = 1;
                h912.v = n4;
            }
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getActivity();
        this.a = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = kd3_2.a();
        Object object2 = this.requireActivity().getApplication();
        Object object3 = "getApplication(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        Object object4 = new HomeRepo((Context)object2);
        object2 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object4;
        ((kd3_2)object).b = object2;
        Intrinsics.checkNotNull(object);
        object4 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object4);
        object2 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object5 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object4);
        Object object6 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object5, string2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object6, string3);
        Object object7 = h91.class;
        String string4 = "modelClass";
        object5 = im_1.a((rd3_0)object5, (kd3_2)object, (Wd0)object6, object7, string4);
        object6 = "<this>";
        object7 = ef0_0.a(object7, string4, string4, (String)object6);
        String string5 = object7.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (string5 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            string5 = string7.concat(string5);
            this.l = object5 = (h91)((pD3)object5).a((yn1_2)object7, string5);
            object7 = this.requireActivity().getApplication();
            Intrinsics.checkNotNullExpressionValue(object7, (String)object3);
            object5 = new UserRepo((Application)object7);
            object3 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object5;
            ((kd3_2)object).b = object3;
            Intrinsics.checkNotNullParameter(this, (String)object4);
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object3 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object4);
            object4 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object3, string2);
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Intrinsics.checkNotNullParameter(object4, string3);
            object2 = hy3_0.class;
            object = im_1.a((rd3_0)object3, (kd3_2)object, (Wd0)object4, (Class)object2, string4);
            object4 = ef0_0.a((Class)object2, string4, string4, (String)object6);
            object2 = object4.getQualifiedName();
            if (object2 != null) {
                object2 = string7.concat((String)object2);
                this.m = object = (hy3_0)((pD3)object).a((yn1_2)object4, (String)object2);
                return;
            }
            object4 = string6.toString();
            object = new IllegalArgumentException((String)object4);
            throw object;
        }
        object4 = string6.toString();
        object = new IllegalArgumentException((String)object4);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.couponpromotionlist_fragment_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Object object = lw0_1.Companion;
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        object = ((Lw0$a)object).a((ContextWrapper)object2);
        object2 = ((lw0_1)object).b;
        if (object2 != null) {
            object2.unregisterListener((SplitInstallStateUpdatedListener)object);
        }
    }

    public final void onDownloadConfirmation(SplitInstallManager splitInstallManager, SplitInstallSessionState splitInstallSessionState) {
        if (splitInstallSessionState != null && splitInstallManager != null) {
            Context context = this.getContext();
            String string2 = "null cannot be cast to non-null type android.app.Activity";
            Intrinsics.checkNotNull(context, string2);
            context = (Activity)context;
            int n3 = 37;
            splitInstallManager.startConfirmationDialogForResult(splitInstallSessionState, (Activity)context, n3);
        }
    }

    public final void onPause() {
        super.onPause();
        Object object = this.d;
        if (object != null) {
            object.cancel();
        }
        object = this.a;
        String string2 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
        Intrinsics.checkNotNull(object, string2);
        object = ((BaseActivity)object).k0;
        String string3 = "";
        if (object != null) {
            ((AjioCustomToolbar)object).setProductListTitleText(string3);
        }
        object = this.a;
        Intrinsics.checkNotNull(object, string2);
        object = ((BaseActivity)object).k0;
        if (object != null) {
            ((AjioCustomToolbar)object).setProductListDetailText(string3);
        }
    }

    public final void onResume() {
        super.onResume();
        Object object = this.e;
        Intrinsics.checkNotNull(object);
        object = ((CouponPromotion)object).getSaleStartTime();
        Intrinsics.checkNotNullExpressionValue(object, "getSaleStartTime(...)");
        Object object2 = this.e;
        Intrinsics.checkNotNull(object2);
        object2 = ((CouponPromotion)object2).getSaleEndTime();
        Intrinsics.checkNotNullExpressionValue(object2, "getSaleEndTime(...)");
        Object object3 = this.e;
        Intrinsics.checkNotNull(object3);
        object3 = ((CouponPromotion)object3).getServerTime();
        Intrinsics.checkNotNullExpressionValue(object3, "getServerTime(...)");
        this.Oa((String)object, (String)object2, (String)object3);
    }

    public final void onStop() {
        super.onStop();
        Object object = this.a;
        if (object != null) {
            boolean bl2 = object.isFinishing();
            object = bl2;
            Intrinsics.checkNotNull(object);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        String string2;
        int n3;
        int n4;
        boolean bl2;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = this.e;
        if (object2 == null) {
            object2 = this.getArguments();
            bl2 = false;
            object3 = null;
            if (object2 != null) {
                n4 = Build.VERSION.SDK_INT;
                n3 = 33;
                if (n4 >= n3) {
                    object2 = kc0_0.a((Bundle)object2);
                } else {
                    string2 = "couponsdata";
                    n4 = (object2 = object2.getSerializable(string2)) instanceof CouponPromotion;
                    if (n4 != 0) {
                        object3 = object2;
                    }
                    object2 = object3;
                    object2 = (CouponPromotion)object3;
                }
                object3 = object2;
                object3 = (CouponPromotion)object2;
            }
            this.e = object3;
        }
        object2 = this.getActivity();
        int n7 = object2 instanceof BaseActivity;
        bl2 = true;
        if (n7 != 0) {
            object2 = this.getActivity();
            string2 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
            Intrinsics.checkNotNull(object2, string2);
            ((BaseActivity)object2).I2();
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, string2);
            ((BaseActivity)object2).F2();
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, string2);
            object2 = (BaseActivity)object2;
            n3 = R$drawable.nav_back;
            int n8 = 3;
            String string3 = "Coupons/Promotion";
            ((BaseActivity)object2).showUpButton(bl2, n8, n3, string3);
            object2 = this.getActivity();
            Intrinsics.checkNotNull(object2, string2);
            object2 = ((BaseActivity)object2).k0;
            if (object2 != null) {
                ((AjioCustomToolbar)object2).setTitle(string3);
            }
            object2 = this.a;
            Intrinsics.checkNotNull(object2, string2);
            object2 = (BaseActivity)object2;
            ((BaseActivity)object2).I2();
        }
        n7 = R$id.parent_recycleview;
        object2 = (RecyclerView)object.findViewById(n7);
        this.b = object2;
        n7 = R$id.fragment_coupons_btn;
        object2 = (AjioButton)object.findViewById(n7);
        this.g = object2;
        n7 = R$id.footer_selected_points;
        object2 = (AjioTextView)object.findViewById(n7);
        this.h = object2;
        n7 = R$id.footer_selected_coupons;
        object2 = (AjioTextView)object.findViewById(n7);
        this.i = object2;
        n7 = R$id.coupon_info;
        object2 = (AjioAspectRatioImageView)object.findViewById(n7);
        this.j = object2;
        n7 = R$id.coupons_promotion_progress_bar;
        object = (AjioProgressView)object.findViewById(n7);
        this.c = object;
        if (object != null) {
            n7 = R$string.coupon_promotion_warning_msg_6;
            object.setMessage(n7);
        }
        if ((object = this.j) != null) {
            n7 = 8;
            object.setVisibility(n7);
        }
        if ((object = this.g) != null) {
            object2 = new nc0_0(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.j) != null) {
            n4 = 0;
            string2 = null;
            object2 = new oc0_0(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.e) != null) {
            this.Ra();
        } else {
            object = this.l;
            if (object != null) {
                object.w = bl2;
            }
            if (object != null) {
                n7 = 0;
                object2 = null;
                object.v = false;
            }
        }
        km_1.a(AnalyticsManager.Companion, "AjioStealMania");
    }

    public final void p2(String object) {
        Intrinsics.checkNotNullParameter(object, "url");
        Object object2 = "COUPON_DISCOUNT_LOGIN_REQUEST";
        boolean n3 = ((String)object).equalsIgnoreCase((String)object2);
        if (n3) {
            object = this.a;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                boolean bl2 = object.isFinishing();
                if (!bl2) {
                    object = this.a;
                    Intrinsics.checkNotNull(object);
                    int n4 = 6;
                    String string2 = "source - coupon promotion";
                    at2_1.h((Activity)object, string2, n4);
                }
            }
        } else {
            object2 = "COUPON_DISCOUNT_TC_REQUEST";
            boolean bl3 = ((String)object).equalsIgnoreCase((String)object2);
            if (bl3) {
                object = CustomWebViewActivity.Companion;
                object2 = this.a;
                Intrinsics.checkNotNull(object2);
                boolean bl4 = false;
                Object var5_10 = null;
                int n7 = 7;
                CustomWebViewActivity$a.b((CustomWebViewActivity$a)object, (Context)object2, null, n7);
                object = ActivityTransitionManager.getInstance();
                object2 = this.a;
                Intrinsics.checkNotNull(object2);
                ((ActivityTransitionManager)object).slideUpAndStay((Activity)object2);
            } else {
                object2 = "COUPON_DISCOUNT_FAQ_REQUEST";
                boolean bl5 = ((String)object).equalsIgnoreCase((String)object2);
                if (bl5) {
                    object = this.a;
                    object2 = "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity";
                    Intrinsics.checkNotNull(object, (String)object2);
                    object = (BaseActivity)object;
                    ((BaseSplitActivity)object).openCustomerCare();
                } else {
                    object2 = "COUPON_DISCOUNT_HELP_REQUEST";
                    boolean bl6 = ((String)object).equalsIgnoreCase((String)object2);
                    if (bl6) {
                        object = new jc0_0();
                        object2 = new Bundle();
                        Object object3 = Boolean.TRUE;
                        Object object4 = "HELP_REQUST";
                        object2.putSerializable((String)object4, (Serializable)object3);
                        ((Fragment)object).setArguments((Bundle)object2);
                        object2 = this.a;
                        boolean bl7 = object2 instanceof AjioHomeActivity;
                        if (bl7) {
                            object3 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                            Intrinsics.checkNotNull(object2, (String)object3);
                            object2 = (AjioHomeActivity)object2;
                            object4 = this.a;
                            Intrinsics.checkNotNull(object4, (String)object3);
                            object4 = (AjioHomeActivity)object4;
                            object3 = ((AjioHomeActivity)object4).T0;
                            boolean bl8 = true;
                            String string3 = "coupons2";
                            j3$a.a((j3_0)object2, (Fragment)object3, (Fragment)object, bl8, string3);
                        }
                    }
                }
            }
        }
    }

    public final void showProgress(String string2) {
        FragmentActivity fragmentActivity = this.getActivity();
        boolean bl2 = fragmentActivity instanceof BaseSplitActivity;
        if (bl2 && (fragmentActivity = (BaseSplitActivity)this.getActivity()) != null) {
            ((BaseSplitActivity)fragmentActivity).showProgress(string2);
        }
    }

    public final void w3(CouponEntity couponEntity) {
        Intrinsics.checkNotNullParameter(couponEntity, "entity");
        this.k.add(couponEntity);
        couponEntity.setSelected(true);
        this.Ua();
    }
}

