/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OV2
 */
public final class ov2_0
extends RecyclerView$B
implements View.OnClickListener {
    public SuggestionSearchModel a;

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null && (n4 = object.getId()) == (n3 = R$id.search_suggestion) && (object = this.a) != null) {
            Intrinsics.checkNotNull(object);
            this.getAdapterPosition();
            throw null;
        }
    }
}

