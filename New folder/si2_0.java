/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.GridSpaceItemDecoration;
import com.ril.ajio.customviews.widgets.AjioCustomGridLayoutManager;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.FeatureData;
import com.ril.ajio.services.data.Product.FeatureValue;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/*
 * Renamed from Si2
 */
public final class si2_0
extends RecyclerView$B
implements View.OnClickListener {
    public static final Si2$a Companion;
    public final View a;
    public final yi2_1 b;
    public final View c;
    public final ConstraintLayout d;
    public final AjioTextView e;
    public final ImageView f;
    public n02 g;
    public final RecyclerView h;
    public final ConstraintLayout i;
    public final ConstraintLayout j;
    public ArrayList k;
    public final NewCustomEventsRevamp l;

    static {
        Si2$a si2$a;
        Companion = si2$a = new Object();
    }

    public si2_0(View object, yi2_1 yi2_12) {
        int n3;
        NewCustomEventsRevamp newCustomEventsRevamp;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        this.l = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.c = object;
        newCustomEventsRevamp = null;
        String string2 = "parentView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        object.getContext();
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        int n4 = R$id.parent_product_details;
        object = (ConstraintLayout)object.findViewById(n4);
        this.i = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.cl_product_details;
        object = (ConstraintLayout)object.findViewById(n4);
        this.j = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.cl_more_less_details;
        object = (ConstraintLayout)object.findViewById(n4);
        this.d = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.row_pdp_details_tv_more_less;
        object = (AjioTextView)object.findViewById(n4);
        this.e = object;
        n3 = yi2_12.c9();
        if (n3 == 0) {
            object = this.c;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            int n7 = R$id.row_pdp_details_imv_more_detail;
            object = (ImageView)object.findViewById(n7);
            this.f = object;
        }
        if ((object = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            newCustomEventsRevamp = object;
        }
        n3 = R$id.recycler_view;
        object = (RecyclerView)newCustomEventsRevamp.findViewById(n3);
        this.h = object;
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.cl_more_less_details;
        if (n3 == n4) {
            object = this.b;
            n3 = (int)(object.c9() ? 1 : 0);
            n4 = 0;
            object2 = null;
            String string2 = "view less";
            int n7 = 1;
            int n8 = 7;
            ArrayList arrayList = "view more";
            Object object3 = "filteredFeatureDataList";
            Object object4 = "detailsAdapter";
            String string3 = "mMoreLessButton";
            Object object5 = null;
            if (n3 != 0) {
                int n10;
                String string4;
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                if ((n3 = (int)(StringsKt.F((CharSequence)(object = ((Object)((AppCompatTextView)object).getText()).toString()), string4 = hv3_0.K(n10 = R$string.plus_more_details), false) ? 1 : 0)) != 0) {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    }
                    n4 = R$string.minus_less_details;
                    object2 = hv3_0.K(n4);
                    object.setText((CharSequence)object2);
                    object = this.g;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n3 = 0;
                        object = null;
                    }
                    if ((object2 = ((n02)object).a) != null) {
                        object2.clear();
                    }
                    ((RecyclerView$f)object).notifyDataSetChanged();
                    object2 = this.k;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object5 = object2;
                    }
                    ((n02)object).g((ArrayList)object5);
                    this.w((String)((Object)arrayList));
                } else {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    }
                    int n14 = R$string.plus_more_details;
                    arrayList = hv3_0.K(n14);
                    object.setText((CharSequence)((Object)arrayList));
                    object = this.g;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n3 = 0;
                        object = null;
                    }
                    if ((arrayList = ((n02)object).a) != null) {
                        arrayList.clear();
                    }
                    ((RecyclerView$f)object).notifyDataSetChanged();
                    object4 = this.k;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object5 = object4;
                    }
                    object3 = new c(0, n8, n7);
                    object2 = CollectionsKt.c0((List)object5, (IntRange)object3);
                    arrayList = new ArrayList(object2);
                    ((n02)object).g(arrayList);
                    this.w(string2);
                }
            } else {
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object = null;
                }
                object = ((Object)((AppCompatTextView)object).getText()).toString();
                n3 = (int)(StringsKt.F((CharSequence)object, "More details", false) ? 1 : 0);
                String string5 = "mMoreLessImage";
                if (n3 != 0) {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    }
                    n4 = R$string.less_details;
                    object2 = hv3_0.K(n4);
                    object.setText((CharSequence)object2);
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n3 = 0;
                        object = null;
                    }
                    n4 = R$drawable.ic_up_arrow_sneaker_hood;
                    object2 = hv3_0.r(n4);
                    object.setImageDrawable((Drawable)object2);
                    object = this.g;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n3 = 0;
                        object = null;
                    }
                    if ((object2 = ((n02)object).a) != null) {
                        object2.clear();
                    }
                    ((RecyclerView$f)object).notifyDataSetChanged();
                    object2 = this.k;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object5 = object2;
                    }
                    ((n02)object).g((ArrayList)object5);
                    this.w((String)((Object)arrayList));
                } else {
                    object = this.e;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object = null;
                    }
                    int n15 = R$string.more_details;
                    arrayList = hv3_0.K(n15);
                    object.setText((CharSequence)((Object)arrayList));
                    object = this.f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n3 = 0;
                        object = null;
                    }
                    n15 = R$drawable.ic_down_arrow_sneaker_hood;
                    arrayList = hv3_0.r(n15);
                    object.setImageDrawable((Drawable)arrayList);
                    object = this.g;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n3 = 0;
                        object = null;
                    }
                    if ((arrayList = ((n02)object).a) != null) {
                        arrayList.clear();
                    }
                    ((RecyclerView$f)object).notifyDataSetChanged();
                    object4 = this.k;
                    if (object4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    } else {
                        object5 = object4;
                    }
                    object3 = new c(0, n8, n7);
                    object2 = CollectionsKt.c0((List)object5, (IntRange)object3);
                    arrayList = new ArrayList(object2);
                    ((n02)object).g(arrayList);
                    this.w(string2);
                }
            }
        }
    }

    public final void w(String string2) {
        Bundle bundle = new Bundle();
        Object object = this.b;
        Object object2 = object.l6();
        bundle.putString("product_id", (String)object2);
        object2 = object.x5();
        String string3 = null;
        object2 = object2 != null ? ((Product)object2).getName() : null;
        String string4 = "product_name";
        bundle.putString(string4, (String)object2);
        object = object.x5();
        if (object != null) {
            string3 = ((Product)object).getBrandName();
        }
        bundle.putString("product_brand", string3);
        object = AnalyticsManager.Companion;
        String string5 = bv_0.a((AnalyticsManager$Companion)object);
        String string6 = cv_0.a((AnalyticsManager$Companion)object);
        object = this.l;
        string4 = string2;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "product details interactions", "product detail", string2, "product_details_interactions", "pdp screen", "pdp screen", string5, bundle, string6, false, null, 1536, null);
    }

    public final void x(ArrayList object) {
        int n3;
        Collection collection;
        int n4;
        Object object2;
        Object object3;
        Object object4;
        if (object == null) {
            return;
        }
        Object object5 = new ArrayList();
        object = object.iterator();
        while (true) {
            boolean bl2;
            boolean n7 = object.hasNext();
            boolean bl3 = false;
            FeatureValue featureValue = null;
            object4 = null;
            if (!n7) break;
            Object e2 = object.next();
            Object object6 = e2;
            object6 = (FeatureData)e2;
            object3 = ((FeatureData)object6).getName();
            if (object3 == null) continue;
            object3 = ((FeatureData)object6).getFeatureValues();
            if (object3 != null && (object3 = (FeatureValue)object3.get(0)) != null) {
                object3 = ((FeatureValue)object3).getValue();
            } else {
                bl2 = false;
                object3 = null;
            }
            if (object3 == null || (bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((FeatureData)object6).getName())))) continue;
            if ((object6 = ((FeatureData)object6).getFeatureValues()) != null && (featureValue = (FeatureValue)object6.get(0)) != null) {
                object4 = featureValue.getValue();
            }
            if (bl3 = TextUtils.isEmpty(object4)) continue;
            ((ArrayList)object5).add(e2);
        }
        this.k = object5;
        int n7 = ((ArrayList)object5).size();
        object5 = "mMoreLessLayout";
        int n8 = 1;
        int n10 = 8;
        object3 = "filteredFeatureDataList";
        if (n7 <= n10) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            object.setVisibility(n10);
            object2 = this.k;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n4 = 0;
                object2 = null;
            }
            this.g = object = new n02((ArrayList)object2);
        } else {
            object = this.k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n7 = 0;
                object = null;
            }
            if ((n7 = ((ArrayList)object).size()) > (n4 = 20)) {
                object = this.k;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n7 = 0;
                    object = null;
                }
                object2 = kotlin.ranges.f.m(0, n4);
                object = CollectionsKt.c0((List)object, (IntRange)object2);
                object2 = "null cannot be cast to non-null type java.util.ArrayList<com.ril.ajio.services.data.Product.FeatureData>";
                Intrinsics.checkNotNull(object, (String)object2);
                this.k = object = (ArrayList)object;
            }
            if ((collection = this.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                collection = null;
            }
            int n14 = 7;
            IntRange intRange = new c(0, n14, n8);
            collection = CollectionsKt.c0(collection, intRange);
            object2 = new ArrayList(collection);
            this.g = object = new n02((ArrayList)object2);
        }
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerview");
            n7 = 0;
            object = null;
        }
        ((RecyclerView)object).setHasFixedSize(n8 != 0);
        collection = object.getContext();
        int n15 = 2;
        object2 = new AjioCustomGridLayoutManager((Context)collection, n15);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        collection = object.getContext().getResources().getDisplayMetrics();
        n3 = ((DisplayMetrics)collection).densityDpi / 160;
        double d2 = n3;
        double d5 = 5.5;
        object2 = new GridSpaceItemDecoration(d2 *= d5);
        ((RecyclerView)object).addItemDecoration((RecyclerView$n)object2);
        object2 = this.g;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailsAdapter");
            n4 = 0;
            object2 = null;
        }
        ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n7 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.e;
        object5 = "mMoreLessButton";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            n7 = 0;
            object = null;
        }
        object.setVisibility(0);
        object = this.b;
        n7 = (int)(object.c9() ? 1 : 0);
        if (n7 != 0) {
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            object.getPaint().setUnderlineText(n8 != 0);
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            int n17 = R$string.plus_more_details;
            object5 = hv3_0.K(n17);
            object.setText((CharSequence)object5);
        } else {
            object = this.e;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            int n16 = R$string.more_details;
            object5 = hv3_0.K(n16);
            object.setText((CharSequence)object5);
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMoreLessImage");
                n7 = 0;
                object = null;
            }
            n16 = R$drawable.ic_down_arrow_sneaker_hood;
            object5 = hv3_0.r(n16);
            object.setImageDrawable((Drawable)object5);
        }
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n7 = 0;
            object = null;
        }
        n7 = object.isEmpty() ^ n8;
        object5 = "parentLayout";
        if (n7 != 0) {
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            } else {
                object4 = object;
            }
            object4.setVisibility(0);
        } else {
            object = this.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n7 = 0;
                object = null;
            }
            object.setVisibility(n10);
            object = this.j;
            if (object == null) {
                object = "clProductDetails";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object4 = object;
            }
            object4.setVisibility(n10);
        }
    }
}

