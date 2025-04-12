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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NV2
 */
public final class nv2_0
extends RecyclerView$B
implements View.OnClickListener {
    public final MV2 a;
    public final TextView b;
    public final AjioImageView c;
    public SuggestionSearchModel d;

    public nv2_0(View object, MV2 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object2, "searchSuggestionListener");
        super((View)object);
        this.a = object2;
        int n3 = R$id.clStore;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (ConstraintLayout)((Object)object2);
        int n4 = R$id.searchSuggestion;
        View view = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.b = view;
        n4 = R$id.imvStore;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioImageView)((Object)object);
        this.c = object;
        object2.setOnClickListener(this);
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        int n7;
        if ((object != null && (n7 = object.getId()) == (n4 = R$id.clStore) || object != null && (n3 = object.getId()) == (n7 = R$id.imvArrow)) && (object = this.d) != null) {
            Intrinsics.checkNotNull(object);
            n7 = this.getAdapterPosition();
            n4 = 1;
            MV2 mV2 = this.a;
            mV2.L8((SuggestionSearchModel)object, n7, n4 != 0);
        }
    }
}

