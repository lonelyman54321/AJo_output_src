/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AE3
 */
public final class ae3_1
extends RecyclerView$B {
    public final xE3 a;

    public ae3_1(View view, xE3 xE32) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = xE32;
        int n3 = R$id.nudge_button_click;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (Button)view;
        zE3 zE32 = new zE3(this);
        view.setOnClickListener((View.OnClickListener)zE32);
        if (xE32 != null) {
            xE32.C6();
        }
    }
}

