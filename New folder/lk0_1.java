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
 * Renamed from LK0
 */
public final class lk0_1
extends RecyclerView$B {
    public final AjioTextView a;

    public lk0_1(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.tv_feedback_category_header;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        this.a = object;
    }
}

