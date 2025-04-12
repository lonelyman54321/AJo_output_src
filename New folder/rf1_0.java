/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rF1
 */
public final class rf1_0
implements View.OnClickListener {
    public final /* synthetic */ sF1 a;
    public final /* synthetic */ FacetValue b;

    public /* synthetic */ rf1_0(sF1 sF12, FacetValue facetValue) {
        this.a = sF12;
        this.b = facetValue;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        FacetValue facetValue = this.b;
        String string2 = "$facetValue";
        Intrinsics.checkNotNullParameter(facetValue, string2);
        object.k = bl2 = object.k ^ true;
        KI0 kI0 = object.g;
        kI0.Y5(facetValue, bl2);
        int n3 = object.k;
        object = object.h;
        if (n3 != 0) {
            n3 = R$color.accent_color_10;
            object.setBackgroundResource(n3);
            n3 = R$drawable.ic_done;
            object.setImageResource(n3);
        } else {
            n3 = R$drawable.rect_black_stroke_1dp;
            object.setBackgroundResource(n3);
            n3 = R$color.accent_color_11;
            object.setImageResource(n3);
        }
    }
}

