/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uj2
 */
public final class uj2_0
extends RecyclerView$B
implements View.OnClickListener {
    public final Function0 a;
    public final LinearLayout b;
    public final TextView c;

    public uj2_0(View view, Ca ca2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(ca2, "onSearchClick");
        super(view);
        this.a = ca2;
        int n3 = R$id.plpSearchHeader;
        ca2 = (LinearLayout)view.findViewById(n3);
        this.b = ca2;
        n3 = R$id.llpsTvSearch;
        view = (TextView)view.findViewById(n3);
        this.c = view;
    }

    public final void onClick(View view) {
        this.a.invoke();
    }
}

