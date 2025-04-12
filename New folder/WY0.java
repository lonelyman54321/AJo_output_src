/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.StringCompanionObject;

public final class WY0
implements View.OnClickListener {
    public final /* synthetic */ YY0 a;
    public final /* synthetic */ FacetValue b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ int d;

    public /* synthetic */ WY0(YY0 yY0, FacetValue facetValue, Ref$ObjectRef ref$ObjectRef, int n3) {
        this.a = yY0;
        this.b = facetValue;
        this.c = ref$ObjectRef;
        this.d = n3;
    }

    public final void onClick(View object) {
        int n3;
        int n4 = 0;
        object = null;
        int n7 = 1;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$facetValue");
        Object[] objectArray = this.c;
        String string2 = "$productDetails";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        ((YY0)object2).f = n3 = ((YY0)object2).f ^ n7;
        ((YY0)object2).a.Y5((FacetValue)object3, n3 != 0);
        int n8 = ((YY0)object2).f;
        n3 = this.d;
        String string3 = " index ";
        String string4 = "format(...)";
        Object[] objectArray2 = "getString(...)";
        LinearLayout linearLayout = ((YY0)object2).b;
        ImageView imageView = ((YY0)object2).c;
        if (n8 != 0) {
            object3 = StringCompanionObject.INSTANCE;
            object3 = linearLayout.getContext();
            int n10 = R$string.acc_plp_filter_checkbox_selected;
            object3 = object3.getString(n10);
            Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray2);
            objectArray = objectArray.element;
            objectArray2 = new Object[n7];
            objectArray2[0] = objectArray;
            object = xh2_0.a(objectArray2, n7, (String)object3, string4);
            CharSequence charSequence = new StringBuilder();
            charSequence.append((String)object);
            charSequence.append(string3);
            charSequence.append(n3);
            object = charSequence.toString();
            linearLayout.setContentDescription((CharSequence)object);
            n4 = R$drawable.facet_rounded_rect_black;
            imageView.setBackgroundResource(n4);
            object = ((RecyclerView$B)object2).itemView.getContext();
            charSequence = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
            n7 = R$attr.ic_facet_done;
            n4 = tm3_0.b(n7, (Context)object);
            imageView.setImageResource(n4);
        } else {
            object2 = StringCompanionObject.INSTANCE;
            object2 = linearLayout.getContext();
            n8 = R$string.acc_plp_filter_checkbox_unselected;
            object2 = object2.getString(n8);
            Intrinsics.checkNotNullExpressionValue(object2, (String)objectArray2);
            object3 = objectArray.element;
            objectArray = new Object[n7];
            objectArray[0] = object3;
            object = xh2_0.a(objectArray, n7, (String)object2, string4);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(string3);
            stringBuilder.append(n3);
            object = stringBuilder.toString();
            linearLayout.setContentDescription((CharSequence)object);
            n4 = R$drawable.rounded_rect_4_black_stroke;
            imageView.setBackgroundResource(n4);
            n4 = R$drawable.facet_checkbox_unselected;
            imageView.setImageResource(n4);
        }
    }
}

