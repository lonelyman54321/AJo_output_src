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
 * Renamed from xz
 */
public final class xz_2
extends rw_2 {
    public final TextView b;

    public xz_2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        int n3 = R$id.plbmTvMsg;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.b = view;
    }
}

