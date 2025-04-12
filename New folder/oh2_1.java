/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oh2
 */
public final class oh2_1
extends RecyclerView$B {
    public final AjioTextView a;
    public final AjioTextView b;

    public oh2_1(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        object = this.itemView;
        int n3 = R$id.bank_img;
        object = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ImageView)object;
        object = this.itemView;
        int n4 = R$id.desc_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.a = object;
        object = this.itemView;
        n4 = R$id.offer_detail_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.b = object;
    }
}

