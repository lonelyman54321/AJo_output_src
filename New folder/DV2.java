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

public final class DV2
implements View.OnClickListener {
    public final /* synthetic */ AV2 a;
    public final /* synthetic */ SuggestionSearchModel b;
    public final /* synthetic */ ev2_0 c;

    public /* synthetic */ DV2(AV2 aV2, SuggestionSearchModel suggestionSearchModel, ev2_0 ev2_02) {
        this.a = aV2;
        this.b = suggestionSearchModel;
        this.c = ev2_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$listener");
        SuggestionSearchModel suggestionSearchModel = this.b;
        Intrinsics.checkNotNullParameter(suggestionSearchModel, "$historyItem");
        ev2_0 ev2_02 = this.c;
        Intrinsics.checkNotNullParameter(ev2_02, "this$0");
        int n3 = ev2_02.getAdapterPosition();
        object.v4(suggestionSearchModel, n3);
    }
}

