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

public final class Gq3$b
extends Gq3 {
    public final eu_0 a;

    public Gq3$b(eu_0 eu_02) {
        Intrinsics.checkNotNullParameter(eu_02, "headerBinding");
        TextView textView = eu_02.a;
        Intrinsics.checkNotNullExpressionValue(textView, "headerBinding.root");
        super((View)textView);
        this.a = eu_02;
    }

    public final void w(Fq3 fq3) {
        String string2 = "item";
        Intrinsics.checkNotNullParameter(fq3, string2);
        boolean bl2 = fq3 instanceof Fq3$b;
        if (bl2) {
            string2 = this.a.b;
            fq3 = ((Fq3$b)fq3).a;
            string2.setText((CharSequence)((Object)fq3));
        }
    }
}

