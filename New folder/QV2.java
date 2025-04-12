/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import kotlin.jvm.internal.Intrinsics;

public final class QV2
implements View.OnClickListener {
    public final /* synthetic */ RV2 a;
    public final /* synthetic */ SuggestionSearchModel b;

    public /* synthetic */ QV2(RV2 rV2, SuggestionSearchModel suggestionSearchModel) {
        this.a = rV2;
        this.b = suggestionSearchModel;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((RV2)object).a;
        SuggestionSearchModel suggestionSearchModel = this.b;
        if (suggestionSearchModel != null) {
            suggestionSearchModel.getText();
        }
        object.wa();
    }
}

