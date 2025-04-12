/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class RV2
extends RecyclerView$B {
    public final MV2 a;
    public final TextView b;

    public RV2(View view, MV2 mV2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(mV2, "searchSuggestionListener");
        super(view);
        this.a = mV2;
        int n3 = R$id.search_suggestion;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.b = view;
    }
}

