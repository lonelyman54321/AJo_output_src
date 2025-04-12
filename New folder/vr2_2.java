/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vr2
 */
public final class vr2_2
extends rw_2 {
    public final TextView b;

    public vr2_2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        int n3 = R$id.tryAgainTV;
        view = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.b = view;
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            n3 = view.getPaintFlags() | 8;
            view.setPaintFlags(n3);
        }
    }
}

