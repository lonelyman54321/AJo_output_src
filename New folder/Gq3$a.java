/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

public final class Gq3$a
extends Gq3 {
    public final DU a;

    public Gq3$a(DU dU) {
        Intrinsics.checkNotNullParameter(dU, "bodyBinding");
        TextView textView = dU.a;
        Intrinsics.checkNotNullExpressionValue(textView, "bodyBinding.root");
        super((View)textView);
        this.a = dU;
    }

    public final void w(Fq3 fq3) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(fq3, string2);
        boolean bl2 = fq3 instanceof Fq3$a;
        if (bl2) {
            string2 = this.a.b;
            fq3 = ((Fq3$a)fq3).a;
            string2.setText((CharSequence)((Object)fq3));
        }
    }
}

