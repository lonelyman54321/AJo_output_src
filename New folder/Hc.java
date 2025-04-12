/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView$d;

public final class Hc
implements NestedScrollView$d {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public Hc(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void a(NestedScrollView nestedScrollView) {
        View view = this.a;
        View view2 = this.b;
        AlertController.b((View)nestedScrollView, view, view2);
    }
}

