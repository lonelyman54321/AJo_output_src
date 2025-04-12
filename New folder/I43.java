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

public final class I43
extends RecyclerView$B {
    public final View a;
    public final J43 b;
    public final AjioTextView c;

    public I43(View object, J43 j43) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = object;
        this.b = j43;
        int n3 = R$id.link_text;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        this.c = object;
    }
}

