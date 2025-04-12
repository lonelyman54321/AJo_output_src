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

public final class vk1$b
extends RecyclerView$B {
    public final View a;
    public final AjioTextView b;
    public final AjioTextView c;

    public vk1$b(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = object;
        int n3 = R$id.delivery_fee_title;
        Object object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (AjioTextView)object2;
        this.b = object2;
        n3 = R$id.delivery_fee_value;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.c = object;
    }
}

