/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jR2
 */
public final class jr2_0
implements View.OnClickListener {
    public final /* synthetic */ SuggestionSearchModel a;
    public final /* synthetic */ kR2 b;

    public /* synthetic */ jr2_0(SuggestionSearchModel suggestionSearchModel, kR2 kR22) {
        this.a = suggestionSearchModel;
        this.b = kR22;
    }

    public final void onClick(View object) {
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        SuggestionSearchModel suggestionSearchModel = this.a;
        if (suggestionSearchModel != null) {
            MV2 mV2 = ((kR2)object).a;
            int n3 = ((RecyclerView$B)object).getAdapterPosition();
            mV2.L8(suggestionSearchModel, n3, false);
        }
    }
}

