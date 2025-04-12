/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.view.animation.LayoutAnimationController
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$s;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.analytics.utils.GAUtils$Companion;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class N43
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public yi2_1 a;
    public s82_0 b;
    public ArrayList c;
    public ArrayList d;
    public RecyclerView e;
    public LinearLayoutManager f;
    public LinearLayout g;
    public ImageView h;
    public TextView i;
    public LinearLayout j;
    public TextView k;
    public TextView l;
    public int m;
    public final NewCustomEventsRevamp n;
    public final String o;
    public final N43$a p;
    public final N43$b q;

    public N43() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        Object object = AnalyticsManager.Companion;
        this.n = newCustomEventsRevamp = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.o = object = cv_0.a((AnalyticsManager$Companion)object);
        this.p = object = new N43$a(this);
        this.q = object = new Object();
    }

    public final void onClick(View view) {
        block8: {
            Object object;
            Object object2;
            N43 n43;
            block7: {
                int n3;
                int n4;
                n43 = this;
                object2 = null;
                if (view != null) {
                    n4 = view.getId();
                    object = n4;
                } else {
                    n4 = 0;
                    object = null;
                }
                int n7 = R$id.img_back_button;
                if (object != null && (n3 = ((Integer)object).intValue()) == n7) break block7;
                n7 = R$id.tv_continue_to_home;
                if (object == null || (n4 = ((Integer)object).intValue()) != n7) break block8;
            }
            object = GAUtils.Companion;
            Object object3 = n43.a;
            if (object3 != null) {
                object2 = object3.x5();
            }
            Bundle bundle = ((GAUtils$Companion)object).getPDPBundleData((Product)object2);
            int n8 = 1600;
            object3 = n43.n;
            String string2 = "product details interactions";
            String string3 = "continue to home";
            String string4 = "click";
            String string5 = "product_details_interactions";
            String string6 = "pdp screen";
            String string7 = "pdp screen";
            String string8 = n43.o;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string2, string3, string4, string5, string6, string7, null, bundle, string8, false, null, n8, null);
            this.dismissAllowingStateLoss();
            object2 = this.getActivity();
            if (object2 != null) {
                ((ComponentActivity)object2).onBackPressed();
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        L43 l43 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)l43);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.similar_products_back_click;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        int n4;
        boolean bl2;
        int n7;
        N43 n43 = this;
        View view2 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n8 = R$id.dlprLayoutContent;
        Object object = (ConstraintLayout)view.findViewById(n8);
        Object object2 = Looper.getMainLooper();
        Object object3 = new Handler((Looper)object2);
        object2 = new M43((ConstraintLayout)((Object)object));
        long l2 = 100;
        object3.postDelayed((Runnable)object2, l2);
        object = GAUtils.Companion;
        object3 = this.a;
        int n10 = 0;
        object2 = null;
        if (object3 != null) {
            object3 = object3.x5();
        } else {
            n7 = 0;
            object3 = null;
        }
        Bundle bundle2 = ((GAUtils$Companion)object).getPDPBundleData((Product)object3);
        String string2 = n43.o;
        Object object4 = n43.n;
        Object object5 = "product details interactions";
        Object object6 = "pdp exit overlay";
        Object object7 = "Impression";
        Object object8 = "product_details_interactions";
        String string3 = "pdp screen";
        String string4 = "pdp screen";
        int n14 = 1600;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object4, (String)object5, (String)object6, (String)object7, (String)object8, string3, string4, null, bundle2, string2, false, null, n14, null);
        n8 = R$id.similar_products_list_item;
        n43.e = object = (RecyclerView)view2.findViewById(n8);
        n8 = R$id.li_back_product;
        object = (LinearLayout)view2.findViewById(n8);
        n43.g = object;
        n8 = R$id.tv_go_back_to_product;
        object = (TextView)view2.findViewById(n8);
        object3 = "getString(...)";
        object4 = "pdp_to_bag_conversation_json";
        if (object != null) {
            object5 = h40_0.a;
            object5 = z40_0.Companion;
            object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a.d((String)object4);
            bl2 = object5.has((String)(object6 = "pdp_exit_go_back_to_product"));
            if (bl2) {
                object5 = object5.getString((String)object6);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
            } else {
                n4 = R$string.pdp_exit_intent_go_back_to_product;
                object5 = hv3_0.K(n4);
            }
            object.setText((CharSequence)object5);
        }
        n8 = R$id.rl_parent_layout;
        object = (RelativeLayout)view2.findViewById(n8);
        object = n43.g;
        if (object != null) {
            n3 = 2;
            object5 = new oo_1(n43, n3);
            object.setOnClickListener((View.OnClickListener)object5);
        }
        n8 = R$id.img_back_button;
        object = (ImageView)view2.findViewById(n8);
        n43.h = object;
        n8 = R$id.tv_continue_to_home;
        object = (TextView)view2.findViewById(n8);
        n43.i = object;
        if (object != null) {
            object5 = h40_0.a;
            object5 = z40_0.Companion;
            object5 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object5).a.d((String)object4);
            bl2 = object5.has((String)(object6 = "pdp_exit_back_title"));
            if (bl2) {
                object5 = object5.getString((String)object6);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
            } else {
                n4 = R$string.exit_intent_continue_to_home;
                object5 = hv3_0.K(n4);
            }
            object.setText((CharSequence)object5);
        }
        n8 = R$id.similar_products_layout;
        object = (LinearLayout)view2.findViewById(n8);
        n43.j = object;
        object = n43.i;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)n43);
        }
        if ((object = n43.h) != null) {
            object.setOnClickListener((View.OnClickListener)n43);
        }
        n8 = R$id.txt_similar_popup_title;
        object = (TextView)view2.findViewById(n8);
        n43.k = object;
        n8 = R$id.txt_similar_popup_sub_title;
        object = (TextView)view2.findViewById(n8);
        n43.l = object;
        object = n43.a;
        if (object != null) {
            object = object.A5();
        } else {
            n8 = 0;
            object = null;
        }
        n43.c = object;
        object = n43.a;
        if (object != null) {
            object2 = object.g3();
        }
        n43.d = object2;
        if (object2 != null && (n8 = ((ArrayList)object2).size()) > (n10 = 15)) {
            object5 = n43.c;
            if (object5 != null && (object5 = ((ArrayList)object5).subList(n10, n8)) != null) {
                object5.clear();
            }
            if ((object5 = n43.d) != null && (object = ((ArrayList)object5).subList(n10, n8)) != null) {
                object.clear();
            }
        }
        object2 = view.getContext();
        n4 = 0;
        object5 = null;
        n43.f = object = new LinearLayoutManager((Context)object2, 0, false);
        object = n43.e;
        if (object != null) {
            ((RecyclerView)object).setNestedScrollingEnabled(false);
        }
        if ((object = n43.e) != null) {
            object2 = n43.f;
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        }
        if ((object = n43.e) != null) {
            ((RecyclerView)object).clearOnScrollListeners();
        }
        if ((object = n43.e) != null) {
            object2 = n43.p;
            ((RecyclerView)object).addOnScrollListener((RecyclerView$s)object2);
        }
        object6 = n43.b;
        object7 = n43.c;
        object8 = n43.d;
        boolean bl3 = og1_1.c();
        boolean bl4 = true;
        object5 = object;
        object = new q32_0((s82_0)object6, (List)object7, (List)object8, bl3, bl4);
        object2 = n43.e;
        if (object2 != null) {
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
        if ((object = n43.g) != null) {
            object2 = view.getContext();
            n4 = R$anim.fade_in;
            object2 = AnimationUtils.loadAnimation((Context)object2, (int)n4);
            object.startAnimation((Animation)object2);
        }
        n8 = R$anim.layout_similar_animation_slide_down;
        object = AnimationUtils.loadLayoutAnimation((Context)view.getContext(), (int)n8);
        object2 = n43.j;
        if (object2 != null) {
            object2.setLayoutAnimation((LayoutAnimationController)object);
        }
        if ((object = n43.k) != null) {
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.d((String)object4);
            n3 = (int)(object2.has((String)(object5 = "pdp_exit_intent_title")) ? 1 : 0);
            if (n3 != 0) {
                object2 = object2.getString((String)object5);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            } else {
                n10 = R$string.similar_wait_before_you_leave;
                object2 = hv3_0.K(n10);
            }
            object.setText((CharSequence)object2);
        }
        if ((object = n43.l) != null) {
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object5 = AJIOApplication.Companion;
            object2 = Q.a((AJIOApplication$a)object5, (z40$a)object2).a.d((String)object4);
            n4 = (int)(object2.has((String)(object4 = "pdp_exit_intent_sub_title")) ? 1 : 0);
            if (n4 != 0) {
                object2 = object2.getString((String)object4);
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            } else {
                n7 = R$string.similar_explore_these_similar_products;
                object2 = hv3_0.K(n7);
            }
            object.setText((CharSequence)object2);
        }
        if ((object = n43.k) != null) {
            object3 = view.getContext();
            n10 = R$anim.anim_similar_slide_down;
            object3 = AnimationUtils.loadAnimation((Context)object3, (int)n10);
            object.startAnimation((Animation)object3);
        }
        if ((object = n43.l) != null) {
            view2 = view.getContext();
            n7 = R$anim.anim_similar_slide_down;
            view2 = AnimationUtils.loadAnimation((Context)view2, (int)n7);
            object.startAnimation((Animation)view2);
        }
    }
}

