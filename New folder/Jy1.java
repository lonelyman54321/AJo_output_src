/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;

public final class Jy1
implements Runnable {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ ScrollView b;
    public final /* synthetic */ ConstraintLayout c;

    public /* synthetic */ Jy1(TextView textView, ScrollView scrollView, ConstraintLayout constraintLayout) {
        this.a = textView;
        this.b = scrollView;
        this.c = constraintLayout;
    }

    public final void run() {
        TextView textView = this.a;
        Intrinsics.checkNotNullParameter(textView, "$view");
        ScrollView scrollView = this.b;
        Intrinsics.checkNotNullParameter(scrollView, "$scrollView");
        ConstraintLayout constraintLayout = this.c;
        Intrinsics.checkNotNullParameter((Object)constraintLayout, "$layout");
        Rect rect = new Rect();
        textView.getHitRect(rect);
        scrollView.requestChildRectangleOnScreen((View)constraintLayout, rect, false);
    }
}

