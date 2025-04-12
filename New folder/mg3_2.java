/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Product.SuggestedSearchTerms;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mg3
 */
public final class mg3_2
extends RecyclerView$B
implements View.OnClickListener {
    public final ng3_1 a;
    public final TextView b;
    public SuggestedSearchTerms c;

    public mg3_2(View view, ng3_1 ng3_12) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(ng3_12, "suggestionOnItemClickListener");
        super(view);
        this.a = ng3_12;
        int n3 = R$id.suggest_text;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.b = view;
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "v");
        object = this.a;
        SuggestedSearchTerms suggestedSearchTerms = this.c;
        object.a(suggestedSearchTerms);
    }
}

