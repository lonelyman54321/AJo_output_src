/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PV2
 */
public final class pv2_0
extends RecyclerView$B
implements View.OnClickListener {
    public final MV2 a;
    public final TextView b;
    public SuggestionSearchModel c;
    public final TextView d;
    public final ImageView e;
    public final ConstraintLayout f;

    public pv2_0(View object, MV2 mV2) {
        TextView textView;
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(mV2, "searchSuggestionListener");
        super((View)object);
        this.a = mV2;
        int n3 = R$id.search_suggestion;
        mV2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(mV2, string2);
        mV2 = (TextView)mV2;
        this.b = mV2;
        int n4 = R$id.productCountTv;
        this.d = textView = (TextView)object.findViewById(n4);
        n4 = R$id.auto_populate_arrow;
        textView = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(textView, string2);
        textView = (ImageView)textView;
        int n7 = R$id.deleteHistoryIcon;
        View view = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (ImageView)view;
        this.e = view;
        int n8 = R$id.constraint_search_view;
        object = object.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ConstraintLayout)((Object)object);
        this.f = object;
        mV2.setOnClickListener(this);
        textView.setOnClickListener((View.OnClickListener)this);
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.search_suggestion;
        MV2 mV2 = this.a;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            object = this.c;
            if (object != null) {
                n4 = (int)(((SuggestionSearchModel)object).isFromPreviousSearch() ? 1 : 0);
                if (n4 == (n7 = 1)) {
                    object = this.c;
                    Intrinsics.checkNotNull(object);
                    n7 = this.getAdapterPosition();
                    mV2.n3((SuggestionSearchModel)object, n7);
                } else {
                    object = this.c;
                    Intrinsics.checkNotNull(object);
                    n7 = this.getAdapterPosition();
                    n3 = 0;
                    mV2.L8((SuggestionSearchModel)object, n7, false);
                }
            }
        } else {
            n7 = R$id.auto_populate_arrow;
            if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                object = this.c;
                if (object != null) {
                    Intrinsics.checkNotNull(object);
                    this.getAdapterPosition();
                    mV2.n7((SuggestionSearchModel)object);
                }
            } else {
                n7 = R$id.deleteHistoryIcon;
                if (object != null && (n4 = ((Integer)object).intValue()) == n7 && (object = this.c) != null) {
                    Intrinsics.checkNotNull(object);
                    n7 = this.getAdapterPosition();
                    mV2.K1((SuggestionSearchModel)object, n7);
                }
            }
        }
    }
}

