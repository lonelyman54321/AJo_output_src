/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MR2
 */
public final class mr2_1
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public yi2_1 a;
    public sj2_0 b;
    public TextView c;
    public TextView d;
    public TextView e;
    public ImageView f;

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.PDPInfoProvider");
        object = (yi2_1)object;
        this.a = object;
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdp.PDPUIDelegateListener");
        object = (sj2_0)object;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        mr2_1 mr2_12 = this;
        int n7 = 0;
        Object object2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.close_sale_popup;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            this.dismiss();
        } else {
            n8 = R$id.show_price_anim;
            if (object != null && (n4 = ((Integer)object).intValue()) == n8) {
                Bundle bundle = new Bundle();
                object = mr2_12.a;
                String string2 = "pdpInfoProvider";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n4 = 0;
                    object = null;
                }
                if ((n4 = ((String)(object = object.l6())).length()) == 0) {
                    object = "";
                } else {
                    object = mr2_12.a;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n4 = 0;
                        object = null;
                    }
                    object = object.l6();
                }
                bundle.putString("product_id", (String)object);
                object = AnalyticsManager.Companion;
                Object object3 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
                String string3 = bv_0.a((AnalyticsManager$Companion)object);
                String string4 = cv_0.a((AnalyticsManager$Companion)object);
                String string5 = "widget interaction";
                String string6 = "bbs widget";
                String string7 = "reveal price - half card";
                String string8 = "widget_interaction";
                String string9 = "pdp screen";
                String string10 = "pdp screen";
                int n10 = 1536;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string5, string6, string7, string8, string9, string10, string3, bundle, string4, false, null, n10, null);
                object = mr2_12.b;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pdpuiDelegateListener");
                    n4 = 0;
                    object = null;
                }
                if ((object3 = mr2_12.a) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object3;
                }
                n7 = object2.I6();
                string2 = this.getView();
                object.N5(n7, (View)string2);
                this.dismiss();
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        lr2_0 lr2_02 = new lr2_0((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)lr2_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpInfoProvider");
            n3 = 0;
            object = null;
        }
        if ((n3 = object.c9()) != 0) {
            n3 = R$layout.luxe_sale_info_popup;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.sale_info_popup;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(view, "view");
        int n4 = R$id.top_info_tv;
        Object object2 = (TextView)view.findViewById(n4);
        this.c = object2;
        n4 = R$id.wishlist_your_product;
        object2 = (TextView)view.findViewById(n4);
        this.d = object2;
        n4 = R$id.sale_start_tv;
        object2 = (TextView)view.findViewById(n4);
        this.e = object2;
        n4 = R$id.sale_star_img;
        object2 = (ImageView)view.findViewById(n4);
        this.f = object2;
        object2 = this.c;
        ImageView imageView = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topInfoView");
            n4 = 0;
            object2 = null;
        }
        Object object3 = tr2_2.a;
        object3 = tr2_2.g();
        object2.setText((CharSequence)object3);
        object2 = this.d;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("wishlistYourProduct");
            n4 = 0;
            object2 = null;
        }
        object3 = tr2_2.d().n;
        object2.setText((CharSequence)object3);
        object2 = this.e;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saleStartTv");
            n4 = 0;
            object2 = null;
        }
        object3 = tr2_2.e();
        object2.setText((CharSequence)object3);
        object2 = new da$a();
        ((da$a)object2).k = true;
        ((da$a)object2).b = n3 = R$drawable.ic_sale_default;
        ((da$a)object2).c = n3;
        object3 = tr2_2.d().q;
        Object object4 = this.f;
        if (object4 == null) {
            object4 = "saleStarImv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            imageView = object4;
        }
        ((da$a)object2).n = object3;
        ((da$a)object2).u = imageView;
        ((da$a)object2).a();
        super.onViewCreated(view, (Bundle)object);
        int n7 = R$id.show_price_anim;
        object = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (LottieAnimationView)((Object)object);
        object.setOnClickListener((View.OnClickListener)this);
        tr2_2.h((LottieAnimationView)((Object)object));
        n7 = R$id.close_sale_popup;
        ((AjioAspectRatioImageView)view.findViewById(n7)).setOnClickListener(this);
    }
}

