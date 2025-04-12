/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.LinearLayout
 */
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

public final class Y22
implements Runnable {
    public final /* synthetic */ b32 a;

    public /* synthetic */ Y22(b32 b322) {
        this.a = b322;
    }

    public final void run() {
        b32 b322 = this.a;
        Intrinsics.checkNotNullParameter(b322, "this$0");
        Object object = b322.R;
        object = object != null ? object.getLayoutParams() : null;
        boolean bl2 = object instanceof ViewGroup.MarginLayoutParams;
        if (bl2) {
            LinearLayout linearLayout = object;
            linearLayout = (ViewGroup.MarginLayoutParams)object;
            linearLayout.setMarginEnd(6);
            int n3 = linearLayout.getMarginStart() + 18;
            linearLayout.setMarginStart(n3);
            b322 = b322.R;
            if (b322 != null) {
                b322.setLayoutParams((ViewGroup.LayoutParams)object);
            }
            if (b322 != null) {
                b322.requestLayout();
            }
        }
    }
}

