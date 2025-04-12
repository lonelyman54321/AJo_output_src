/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 */
import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

public final class Ic
implements AbsListView.OnScrollListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public Ic(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void onScroll(AbsListView absListView, int n3, int n4, int n7) {
        View view = this.a;
        View view2 = this.b;
        AlertController.b((View)absListView, view, view2);
    }

    public final void onScrollStateChanged(AbsListView absListView, int n3) {
    }
}

