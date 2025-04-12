/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EV2
 */
public final class ev2_0
extends RecyclerView$B {
    public final AV2 a;
    public final TextView b;
    public final ImageView c;

    public ev2_0(View view, AV2 aV2) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = aV2;
        int n3 = R$id.history_text;
        aV2 = (TextView)view.findViewById(n3);
        this.b = aV2;
        n3 = R$id.delete_button;
        view = (ImageView)view.findViewById(n3);
        this.c = view;
    }
}

