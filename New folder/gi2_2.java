/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gi2
 */
public final class gi2_2
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final View c;
    public final zi2_1 d;

    public gi2_2(View object, yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = yi2_12;
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.c = object;
        object = yi2_12.Aa();
        this.d = object;
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null && (n4 = object.getId()) == (n3 = R$id.size_view_click_container)) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pdpInfoSetter");
                n4 = 0;
                object = null;
            }
            object.b7();
        }
    }

    public final void w() {
        float f5;
        int n3;
        int n4;
        Object object = this.c;
        Object object2 = "parentView";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        ai0_2.a((View)object);
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        int n7 = R$id.select_size_triangle;
        object = object.findViewById(n7);
        Object object4 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, object4);
        object = (ImageView)object;
        Object object5 = this.c;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object5 = null;
        }
        int n8 = R$id.size_info_tv;
        object5 = object5.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object5, object4);
        hv3_0.h0((AjioTextView)object5);
        object5 = this.c;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object5 = null;
        }
        n8 = R$id.size_info_layout;
        object5 = object5.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object5, object4);
        object5 = (LinearLayout)object5;
        object4 = this.c;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n7 = 0;
            object4 = null;
            f5 = 0.0f;
        }
        n8 = R$id.pdp_size_container;
        object4 = (ConstraintLayout)object4.findViewById(n8);
        View view = this.c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n8 = 0;
            view = null;
        }
        int n10 = R$id.size_view_click_container;
        view = view.findViewById(n10);
        Object object6 = this.c;
        if (object6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n10 = 0;
            object6 = null;
        }
        int n14 = R$id.choose_size_title;
        object6 = (AjioTextView)object6.findViewById(n14);
        Object object7 = this.c;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n14 = 0;
            object7 = null;
        }
        int n15 = R$id.choose_size_title_single_size;
        object7 = (AjioTextView)object7.findViewById(n15);
        Object object8 = this.c;
        if (object8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n15 = 0;
            object8 = null;
        }
        int n16 = R$id.size_measurements_info;
        object8 = (AjioTextView)object8.findViewById(n16);
        Object object9 = this.c;
        if (object9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n16 = 0;
            object9 = null;
        }
        int n17 = R$id.size_pdp_drop_down_arrow;
        object2 = (ImageView)object9.findViewById(n17);
        object9 = this.b;
        boolean bl2 = object9.j9();
        int n18 = 8;
        if (bl2) {
            object4.setVisibility(0);
            view.setVisibility(0);
        } else {
            object4.setVisibility(n18);
            view.setVisibility(n18);
        }
        bl2 = object9.S5();
        if (!bl2) {
            n7 = 1050253722;
            f5 = 0.3f;
            object2.setAlpha(f5);
            view.setOnClickListener(null);
            object.setVisibility(n18);
            object5.setVisibility(n18);
        } else {
            object2 = object9.G1();
            if (object2 == null) {
                if (view != null) {
                    view.setOnClickListener((View.OnClickListener)this);
                }
                if ((n17 = (int)(object9.H7() ? 1 : 0)) != 0) {
                    object.setVisibility(0);
                    object5.setVisibility(0);
                }
            } else {
                object.setVisibility(n18);
                object5.setVisibility(n18);
                object = object9.s6();
                n4 = TextUtils.isEmpty((CharSequence)object);
                if (n4 == 0) {
                    if (object8 != null) {
                        object = object9.s6();
                        object8.setText((CharSequence)object);
                    }
                    if (object8 != null) {
                        object8.setVisibility(0);
                    }
                } else if (object8 != null) {
                    object8.setVisibility(n18);
                }
                if ((object = object9.G1()) != null) {
                    object = ((ProductOptionVariant)object).getValue();
                } else {
                    n4 = 0;
                    object = null;
                }
                object5 = "Size ";
                object = kp1_0.c((String)object5, (String)object);
                object2 = new SpannableString((CharSequence)object);
                object = FontsManager.getInstance();
                if (object4 != null) {
                    object3 = object4.getContext();
                }
                object = ((FontsManager)object).getTypefaceWithFont((Context)object3, 10);
                object4 = "";
                object3 = new AjioCustomTypefaceSpan((String)object4, (Typeface)object);
                n4 = object2.length();
                n7 = 34;
                f5 = 4.8E-44f;
                n3 = 5;
                object2.setSpan(object3, n3, n4, n7);
                object = object9.i2();
                if (object != null && (n4 = (int)(TextUtils.isEmpty((CharSequence)(object = object9.s6())) ? 1 : 0)) == 0) {
                    if (object6 != null) {
                        object6.setText((CharSequence)object2);
                    }
                    if (object7 != null) {
                        object7.setVisibility(n18);
                    }
                } else {
                    if (object6 != null) {
                        object6.setVisibility(n18);
                    }
                    if (object7 != null) {
                        object7.setVisibility(0);
                    }
                    if (object7 != null) {
                        object7.setText((CharSequence)object2);
                    }
                }
            }
        }
    }
}

