/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jh2
 */
public final class jh2_2
implements View.OnClickListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ qh2_2 b;

    public /* synthetic */ jh2_2(View view, qh2_2 qh2_22) {
        this.a = view;
        this.b = qh2_22;
    }

    public final void onClick(View object) {
        boolean bl2;
        View view = this.a;
        Intrinsics.checkNotNullParameter(view, "$view");
        qh2_2 qh2_22 = this.b;
        Intrinsics.checkNotNullParameter(qh2_22, "this$0");
        ai0_2.j(view);
        object = qh2_22.r;
        if (object != null) {
            object.show();
        }
        if ((bl2 = og1_1.b()) && (object = qh2_22.l) != null) {
            int n3 = R$drawable.rect_stroke_transparent_pan_1dp;
            object.setBackgroundResource(n3);
        }
        if ((object = qh2_22.g) != null) {
            object.clearFocus();
        }
        if ((object = qh2_22.h) != null) {
            object.clearFocus();
        }
    }
}

