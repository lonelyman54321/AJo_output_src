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
 * Renamed from Uy
 */
public final class uy_2
extends RecyclerView$B {
    public final AjioTextView a;

    public uy_2(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        int n3 = R$id.tvDescription;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        this.a = object;
    }
}

