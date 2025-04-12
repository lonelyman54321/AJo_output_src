/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.MandatoryInfo;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hi2
 */
public final class hi2_2
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final Context c;
    public final View d;
    public final LinearLayout e;
    public final ConstraintLayout f;
    public final ConstraintLayout g;
    public final ImageView h;
    public boolean i;
    public final NewCustomEventsRevamp j;
    public final zi2_1 k;

    public hi2_2(View object, yi2_1 yi2_12) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        Object object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.j = object2;
        yi2_12.Aa();
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.d = object;
        yi2_12 = null;
        object2 = "parentView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        object = object.getContext();
        this.c = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        int n4 = R$id.row_more_info_layout_dynamic;
        object = (LinearLayout)object.findViewById(n4);
        this.e = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.row_pdp_imv_more_info;
        object = (ImageView)object.findViewById(n4);
        this.h = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        n4 = R$id.cl_main_more_info;
        object = (ConstraintLayout)object.findViewById(n4);
        this.f = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            yi2_12 = object;
        }
        n3 = R$id.cl_more_info;
        object = (ConstraintLayout)yi2_12.findViewById(n3);
        this.g = object;
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.row_pdp_imv_more_info;
        if (n3 == n4) {
            n3 = (int)(this.i ? 1 : 0);
            n4 = 0;
            string2 = null;
            String string3 = "mMoreInfoDynamicLayout";
            Object object2 = this.b;
            String string4 = "mMoreLessImage";
            View view = null;
            if (n3 == 0) {
                n3 = (int)(object2.c9() ? 1 : 0);
                if (n3 != 0) {
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    int n7 = R$drawable.checkout_spc_expand_up_lux;
                    Drawable drawable2 = hv3_0.r(n7);
                    object.setImageDrawable(drawable2);
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    int n8 = R$string.acc_up_arrow_icon;
                    string4 = hv3_0.K(n8);
                    object.setContentDescription((CharSequence)string4);
                } else {
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    int n10 = R$drawable.checkout_spc_expand_up;
                    Drawable drawable3 = hv3_0.r(n10);
                    object.setImageDrawable(drawable3);
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    int n14 = R$string.acc_up_arrow_icon;
                    string4 = hv3_0.K(n14);
                    object.setContentDescription((CharSequence)string4);
                }
                n3 = 1;
                this.i = n3;
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    view = object;
                }
                view.setVisibility(0);
                object2.Aa().Bb();
                object = "expand";
                this.w((String)object);
            } else {
                n3 = (int)(object2.c9() ? 1 : 0);
                if (n3 != 0) {
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    int n15 = R$drawable.checkout_spc_expand_down_lux;
                    object2 = hv3_0.r(n15);
                    object.setImageDrawable((Drawable)object2);
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    n15 = R$string.acc_down_arrow_icon;
                    object2 = hv3_0.K(n15);
                    object.setContentDescription((CharSequence)object2);
                } else {
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    int n16 = R$drawable.checkout_spc_expand_down;
                    object2 = hv3_0.r(n16);
                    object.setImageDrawable((Drawable)object2);
                    object = this.h;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n3 = 0;
                        object = null;
                    }
                    n16 = R$string.acc_down_arrow_icon;
                    object2 = hv3_0.K(n16);
                    object.setContentDescription((CharSequence)object2);
                }
                this.i = false;
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    view = object;
                }
                n3 = 8;
                view.setVisibility(n3);
                object = "collapse";
                this.w((String)object);
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
        object = this.j;
        string4 = string2;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, "product details interactions", "more info", string2, "product_details_interactions", "pdp screen", "pdp screen", string5, bundle, string6, false, null, 1536, null);
    }

    public final void x(ArrayList object) {
        int n3;
        int n4;
        LinearLayout linearLayout = this.e;
        String string2 = "mMoreInfoDynamicLayout";
        Object object2 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        n4 = 8;
        if (object != null && (n3 = object.size()) != 0) {
            n3 = object.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2;
                Object object3 = object.get(i3);
                Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
                object3 = (MandatoryInfo)object3;
                String string3 = ((MandatoryInfo)object3).getTitle();
                String string4 = ((MandatoryInfo)object3).getSubTitle();
                object3 = ((MandatoryInfo)object3).getKey();
                Context context = this.c;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                context = LayoutInflater.from((Context)context);
                int n7 = R$layout.list_item_pdp_more_info;
                context = context.inflate(n7, null);
                Intrinsics.checkNotNull(context);
                n7 = R$id.tv_key;
                Object object4 = context.findViewById(n7);
                String string5 = "findViewById(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string5);
                object4 = (AjioTextView)object4;
                int n8 = R$id.tv_value;
                Object object5 = context.findViewById(n8);
                Intrinsics.checkNotNullExpressionValue(object5, string5);
                object5 = (AjioTextView)object5;
                boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
                String string6 = "\\\n";
                String string7 = "\\\\n";
                if (!bl3) {
                    if (object3 != null) {
                        object3 = oo1_1.a(string7, (String)object3, string6);
                    } else {
                        bl2 = false;
                        object3 = null;
                    }
                    object4.setText((CharSequence)object3);
                } else {
                    object4.setVisibility(n4);
                }
                bl3 = TextUtils.isEmpty((CharSequence)string3);
                if (bl3) {
                    string3 = "";
                }
                bl3 = TextUtils.isEmpty((CharSequence)string4);
                if (!bl3) {
                    string5 = "\n";
                    string3 = n1.a(string3, string5, string4);
                }
                string3 = string3 != null ? oo1_1.a(string7, string3, string6) : null;
                boolean bl4 = TextUtils.isEmpty((CharSequence)string3);
                if (!bl4) {
                    object5.setText((CharSequence)string3);
                } else {
                    object5.setVisibility(n4);
                }
                bl2 = TextUtils.isEmpty((CharSequence)object3);
                if (bl2 || (bl2 = TextUtils.isEmpty((CharSequence)string3))) {
                    object4.setVisibility(n4);
                    object5.setVisibility(n4);
                }
                Ru1.a((AjioTextView)object5);
                object3 = this.e;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    object3 = null;
                }
                object3.addView((View)context);
            }
            object = this.h;
            if (object == null) {
                object = "mMoreLessImage";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object2 = object;
            }
            object2.setOnClickListener((View.OnClickListener)this);
            return;
        }
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clMainMoreInformation");
            object = null;
        }
        object.setVisibility(n4);
        object = this.g;
        if (object == null) {
            object = "clMoreInformation";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        object2.setVisibility(n4);
    }
}

