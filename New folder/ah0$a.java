/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class ah0$a
extends RecyclerView$B {
    public final AjioTextView a;
    public final RecyclerView b;

    public ah0$a(View object) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object);
        int n3 = R$id.exp_title;
        Object object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (AjioTextView)object2;
        this.a = object2;
        n3 = R$id.experience_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (RecyclerView)object;
        this.b = object;
    }
}

