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
 * Renamed from bX2
 */
public final class bx2_0
extends rw_2 {
    public final TextView b;

    public bx2_0(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.view_secure_payment_tv;
        view = (TextView)view.findViewById(n3);
        this.b = view;
    }
}

