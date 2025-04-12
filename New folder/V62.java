/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductPromotion;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class V62
extends rm3_0
implements o62_0 {
    public static final V62$a Companion;
    public ConstraintLayout b;
    public RecyclerView c;
    public AjioTextView d;
    public AjioButton e;
    public ArrayList f;
    public zi2_1 g;
    public NewProductDetailsFragment h;
    public final NewCustomEventsRevamp i;
    public final String j;
    public final String k;
    public String l;

    static {
        V62$a v62$a;
        Companion = v62$a = new Object();
    }

    public V62() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.i = object2;
        this.j = object2 = bv_0.a((AnalyticsManager$Companion)object);
        this.k = object = cv_0.a((AnalyticsManager$Companion)object);
        this.l = object = ld3_2.STORE_AJIO.getStoreId();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Oa() {
        Object object;
        Object object2;
        Object object3;
        V62 v62;
        block30: {
            double d2;
            Object object4;
            Object object5;
            float f5;
            int n3;
            Object object6;
            int n4;
            Object object7;
            boolean bl2;
            String string2;
            Object object8;
            block29: {
                v62 = this;
                object3 = this.f;
                object2 = this.getTargetFragment();
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment");
                object8 = object2;
                object8 = (NewProductDetailsFragment)object2;
                object2 = "promotionRv";
                string2 = "pdpInfoProvider";
                object = null;
                if (object3 != null && (bl2 = ((ArrayList)object3).size()) > false) break block29;
                object7 = v62.h;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object7 = null;
                }
                if (!(bl2 = (boolean)((NewProductDetailsFragment)object7).m2())) break block30;
            }
            if ((object7 = v62.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object7 = null;
            }
            object7 = ((NewProductDetailsFragment)object7).cb().q;
            boolean bl3 = true;
            if (object7 != null && (bl2 = (boolean)((Product)object7).isBundleOfferAvailable()) == bl3) {
                if (object3 == null) {
                    object3 = new ArrayList();
                }
                n4 = 0;
                int n7 = 1023;
                object7 = new ProductPromotion(null, null, null, null, null, 0.0f, null, null, null, null, n7, null);
                ((ProductPromotion)object7).setTitle("Shop<br>the Look");
                int n8 = R$string.pdp_bundleoffer_description;
                object6 = hv3_0.K(n8);
                ((ProductPromotion)object7).setDescription((String)object6);
                ((ArrayList)object3).add(object7);
            }
            object6 = object3;
            object3 = v62.c;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            object3.setVisibility(0);
            object3 = v62.c;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n3 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            if ((object5 = v62.c) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object5 = null;
            }
            object5 = object5.getContext();
            object7 = new LinearLayoutManager((Context)object5, (int)(bl3 ? 1 : 0), false);
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object7);
            object7 = v62.g;
            if (object7 == null) {
                object7 = "pdpInfoSetter";
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                object5 = null;
            } else {
                object5 = object7;
            }
            object7 = v62.h;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object7 = null;
            }
            boolean bl4 = ((NewProductDetailsFragment)object7).f1;
            object7 = v62.h;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object4 = null;
            } else {
                object4 = object7;
            }
            object7 = object3;
            object3 = new h32((t82_0)object8, (ArrayList)object6, (zi2_1)object5, bl4, (yi2_1)object4, null);
            object7 = v62.h;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object7 = null;
            }
            object7 = ((NewProductDetailsFragment)object7).la();
            Intrinsics.checkNotNull(object7);
            ((h32)object3).j = d2 = ((Double)object7).doubleValue();
            object7 = v62.h;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                object7 = null;
            }
            if ((object7 = ((NewProductDetailsFragment)object7).cb().q) != null) {
                ((Product)object7).getCode();
            }
            ((h32)object3).G(bl3);
            object7 = z40_0.Companion;
            object8 = this.requireActivity().getApplication();
            object6 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object8, (String)object6);
            object7.getClass();
            object7 = z40$a.a((Context)object8).a;
            object8 = "android_plp_offer";
            ((h32)object3).k = bl2 = ((ao0_0)object7).a((String)object8);
            Intrinsics.checkNotNullParameter(v62, "dismissCallBack");
            ((h32)object3).l = v62;
            object7 = v62.c;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                object7 = null;
            }
            ((RecyclerView)object7).setAdapter((RecyclerView$f)object3);
            object3 = v62.h;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            if ((object3 = ((NewProductDetailsFragment)object3).cb().q) != null) {
                object3 = ((Product)object3).getCode();
            } else {
                n3 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            n3 = TextUtils.isEmpty((CharSequence)object3);
            if (n3 != 0) return;
            object3 = v62.h;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object3 = null;
                f5 = 0.0f;
            }
            object3 = ((NewProductDetailsFragment)object3).cb().q;
            object2 = null;
            if (object3 != null && (object3 = ((Product)object3).getPotentialPromotions()) != null && (object3 = (ProductPromotion)object3.get(0)) != null) {
                f5 = ((ProductPromotion)object3).getMaxSavingPrice();
            } else {
                n3 = 0;
                f5 = 0.0f;
                object3 = null;
            }
            n3 = Float.compare(f5, 0.0f);
            if (n3 <= 0) return;
            object3 = v62.h;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object = object3;
            }
            object3 = ((NewProductDetailsFragment)object).cb().q;
            if (object3 == null) return;
            object2 = v62.i;
            string2 = ((NewCustomEventsRevamp)object2).getEC_PRODUCT_DETAILS_INTERACTIONS();
            bl3 = false;
            object7 = "view more coupon click";
            object8 = "";
            object6 = "pdp_view_more_click";
            object5 = "pdp screen";
            String string3 = "pdp screen";
            object4 = v62.j;
            object = v62.k;
            n4 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string2, (String)object7, (String)object8, (String)object6, (String)object5, string3, (String)object4, null, (String)object, false, null, n4, null);
            return;
        }
        object3 = v62.c;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object = object3;
        }
        int n10 = 8;
        float f6 = 1.1E-44f;
        object.setVisibility(n10);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.Oa();
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getTargetFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.PDPInfoSetter");
        object = (zi2_1)object;
        this.g = object;
        object = this.getTargetFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment");
        object = (NewProductDetailsFragment)object;
        this.h = object;
    }

    public final void onCreate(Bundle object) {
        boolean bl2;
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            object2 = n3 >= n4 ? jf0_0.b(object) : object.getParcelableArrayList("PDP_OFFER");
            this.f = object2;
            object2 = ld3_2.STORE_AJIO.getStoreId();
            String string2 = "PDP_PRODUCT_STORE_TYPE";
            object = object.getString(string2, (String)object2);
            this.l = object;
        }
        object = this.l;
        Intrinsics.checkNotNullParameter(object, "storeId");
        object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
        this.a = bl2 = Intrinsics.areEqual(object, object2);
    }

    public final Dialog onCreateDialog(Bundle object) {
        boolean bl2;
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        Object object2 = this.h;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpInfoProvider");
            bl2 = false;
            object2 = null;
        }
        if (!(bl2 = ((NewProductDetailsFragment)object2).f1)) {
            object2 = new Object();
            object.setOnShowListener((DialogInterface.OnShowListener)object2);
        }
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pdpInfoProvider");
            n3 = 0;
            object = null;
        }
        if ((n3 = object.f1) != 0) {
            n3 = R$layout.new_pdp_offer_rv_layout;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pdp_offer_rv_layout;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onStart() {
        super.onStart();
        Object object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promotionRv");
            object = null;
        }
        if ((object = ((RecyclerView)object).getAdapter()) == null) {
            this.Oa();
        }
    }

    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.c;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promotionRv");
            recyclerView = null;
        }
        recyclerView.setAdapter(null);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.parent_layout;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.b = object2;
        n3 = R$id.promo_offer_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.c = object2;
        object2 = this.getResources();
        int n4 = R$dimen.dp1;
        n3 = object2.getDimensionPixelSize(n4);
        RecyclerView recyclerView = this.c;
        Object object3 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promotionRv");
            n4 = 0;
            recyclerView = null;
        }
        ai2_0 ai2_02 = new ai2_0(n3);
        recyclerView.addItemDecoration(ai2_02);
        n3 = R$id.offer_title;
        object2 = (AjioTextView)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.close_button;
        object = (AjioButton)object.findViewById(n3);
        this.e = object;
        object2 = "closeButton";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        n4 = 0;
        recyclerView = null;
        object.setVisibility(0);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allOffersTv");
            object = null;
        }
        object.setVisibility(0);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object3 = object;
        }
        object = new S62(this, 0);
        object3.setOnClickListener((View.OnClickListener)object);
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new T62(this);
        object.postDelayed((Runnable)object2, (long)100);
    }
}

