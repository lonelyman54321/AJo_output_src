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

/*
 * Renamed from JK0
 */
public final class jk0_1
extends ClickableSpan {
    public final /* synthetic */ kk0_1 a;

    public jk0_1(kk0_1 kk0_12) {
        this.a = kk0_12;
    }

    public final void onClick(View object) {
        String string2 = "textView";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.a;
        if (object != null) {
            object.E6();
        }
    }
}

