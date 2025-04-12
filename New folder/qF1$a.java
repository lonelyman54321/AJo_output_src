/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class qF1$a
extends ClickableSpan {
    public final /* synthetic */ qf1_0 a;

    public qF1$a(qf1_0 qf1_02) {
        this.a = qf1_02;
    }

    public final void onClick(View object) {
        String string2 = "textView";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.g;
        if (object != null) {
            object.q5();
        }
    }
}

