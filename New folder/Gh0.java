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

public final class Gh0
extends RecyclerView$B {
    public final AjioTextView a;
    public final AjioTextView b;

    public Gh0(View object) {
        Intrinsics.checkNotNullParameter(object, "itemview");
        super((View)object);
        int n3 = R$id.subrating_title;
        Object object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (AjioTextView)object2;
        this.a = object2;
        n3 = R$id.subrating_value;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.b = object;
    }
}

