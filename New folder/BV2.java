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

public final class BV2
implements View.OnClickListener {
    public final /* synthetic */ cv2_0 a;
    public final /* synthetic */ AV2 b;
    public final /* synthetic */ SuggestionSearchModel c;

    public /* synthetic */ BV2(cv2_0 cv2_02, AV2 aV2, SuggestionSearchModel suggestionSearchModel) {
        this.a = cv2_02;
        this.b = aV2;
        this.c = suggestionSearchModel;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        AV2 aV2 = this.b;
        Intrinsics.checkNotNullParameter(aV2, "$listener");
        SuggestionSearchModel suggestionSearchModel = this.c;
        String string2 = "$historyItem";
        Intrinsics.checkNotNullParameter(suggestionSearchModel, string2);
        boolean bl2 = ((cv2_0)object).b;
        if (!bl2) {
            int n3 = ((RecyclerView$B)object).getAdapterPosition();
            aV2.v4(suggestionSearchModel, n3);
        }
    }
}

