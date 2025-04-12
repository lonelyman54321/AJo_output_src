/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zr2
 */
public final class zr2_1
extends rw_2 {
    public final dv_0 b;

    public zr2_1(View view, dv_0 object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        super(view);
        this.b = object;
        int n3 = R$id.verify_otp_Tv;
        view = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (TextView)view;
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            n3 = view.getPaintFlags() | 8;
            view.setPaintFlags(n3);
        }
        object = new L81(this, 1);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

