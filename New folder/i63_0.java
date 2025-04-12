/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I63
 */
public final class i63_0
extends RecyclerView$B {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public i63_0(View view) {
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "viewItem");
        super(view);
        int n3 = R$id.tv_count;
        this.a = textView = (TextView)view.findViewById(n3);
        n3 = R$id.tv_instruction_title;
        this.b = textView = (TextView)view.findViewById(n3);
        n3 = R$id.tv_instruction_size;
        view = (TextView)view.findViewById(n3);
        this.c = view;
    }
}

