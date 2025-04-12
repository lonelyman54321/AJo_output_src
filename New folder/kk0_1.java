/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KK0
 */
public final class kk0_1
extends RecyclerView$B {
    public final qk0_1 a;
    public final AjioTextView b;

    public kk0_1(View object, qk0_1 qk0_12) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        this.a = qk0_12;
        int n3 = R$id.tv_feedback_category_footer;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        this.b = object;
    }
}

