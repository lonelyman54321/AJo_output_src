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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CQ2
 */
public final class cq2_0
extends RecyclerView$B {
    public final View a;
    public final Function1 b;
    public final TextView c;
    public final ImageView d;

    public cq2_0(View view, WC2 wC2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(wC2, "onReasonSelected");
        super(view);
        this.a = view;
        this.b = wC2;
        int n3 = R$id.rto_reason_title;
        wC2 = (TextView)view.findViewById(n3);
        this.c = wC2;
        n3 = R$id.radio_rto;
        view = (ImageView)view.findViewById(n3);
        this.d = view;
    }
}

