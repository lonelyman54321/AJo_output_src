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

public final class kR2
extends RecyclerView$B {
    public final MV2 a;
    public final AjioTextView b;

    public kR2(View object, MV2 mV2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(mV2, "searchSuggestionListener");
        super((View)object);
        this.a = mV2;
        int n3 = R$id.lssi_tv_search_ajio;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        this.b = object;
    }
}

