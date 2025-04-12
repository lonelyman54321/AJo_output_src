/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.services.data.freebies.FreebieGift;
import com.ril.ajio.services.data.freebies.GiftPromotion;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pX0
 */
public final class px0_2
extends BottomSheetDialogFragment
implements wc1_2 {
    public static final px0$a_0 Companion;
    public GiftPromotion a;
    public AppCompatImageView b;
    public RecyclerView c;

    static {
        px0$a_0 px0$a_0;
        Companion = px0$a_0 = new Object();
    }

    public final int Oa() {
        Iterator iterator = this.a;
        int n3 = 0;
        if (iterator != null && (iterator = ((GiftPromotion)((Object)iterator)).getGifts()) != null) {
            int n4;
            iterator = ((Iterable)((Object)iterator)).iterator();
            int n7 = 0;
            while ((n4 = iterator.hasNext()) != 0) {
                List list = ((FreebieGift)iterator.next()).getProductDetails();
                if (list != null) {
                    n4 = list.size();
                } else {
                    n4 = 0;
                    list = null;
                }
                n7 += n4;
            }
            n3 = n7;
        }
        return n3;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object = (Parcelable)nx0_1.a(object);
            } else {
                String string2 = "freeBies";
                n3 = (object = object.getParcelable(string2)) instanceof GiftPromotion;
                if (n3 == 0) {
                    object = null;
                }
                object = (GiftPromotion)object;
            }
            object = (GiftPromotion)object;
            this.a = object;
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        ox0_0 ox0_02 = new ox0_0(this);
        object.setOnShowListener((DialogInterface.OnShowListener)ox0_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_freebies_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        GiftPromotion giftPromotion;
        int n3;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.freebiesRecyclerView;
        object2 = (RecyclerView)object.findViewById(n4);
        this.c = object2;
        n4 = R$id.close_dialog;
        object2 = (AppCompatImageView)object.findViewById(n4);
        this.b = object2;
        n4 = R$id.parent_summary_layout;
        object2 = (LinearLayout)object.findViewById(n4);
        object2 = this.a;
        if (object2 != null && (object2 = ((GiftPromotion)object2).getGifts()) != null) {
            n4 = object2.size();
        } else {
            n4 = 0;
            object2 = null;
        }
        int n7 = 1;
        if (n4 > n7 && (n3 = this.Oa()) > n7 || n4 == n7 && (n4 = this.Oa()) > (n7 = 4)) {
            object2 = object.getLayoutParams();
            object3 = this.getResources().getDisplayMetrics();
            double d2 = ((DisplayMetrics)object3).heightPixels;
            double d5 = 0.75;
            ((ViewGroup.LayoutParams)object2).height = n7 = (int)(d2 *= d5);
            object.setLayoutParams((ViewGroup.LayoutParams)object2);
        }
        object = this.b;
        n4 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeDialog");
            object = null;
        }
        n3 = 1;
        object3 = new ok_1(this, n3);
        object.setOnClickListener((View.OnClickListener)object3);
        object = AnalyticsManager.Companion;
        object3 = "Promotion offer screen";
        km_1.a((AnalyticsManager$Companion)object, (String)object3);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            object = null;
        }
        if ((giftPromotion = this.a) != null) {
            object2 = giftPromotion.getGifts();
        }
        object3 = new kg2_1((List)object2, 2, this);
        ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
    }

    public final void v3(String string2) {
        Object object = this.getDialog();
        if (object != null) {
            object.cancel();
        }
        object = kj0_1.g();
        FragmentActivity fragmentActivity = this.getActivity();
        ((kj0_1)object).p(fragmentActivity, string2);
    }

    public final void v6(String string2) {
        boolean bl2;
        Object object = this.getActivity();
        if (object != null && !(bl2 = object.isFinishing())) {
            object = CustomWebViewActivity.Companion;
            Context context = this.requireContext();
            String string3 = "requireContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string3);
            int n3 = 14;
            CustomWebViewActivity$a.b((CustomWebViewActivity$a)object, context, string2, n3);
        }
    }
}

