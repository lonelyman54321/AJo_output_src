/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.CollapsibleActionView
 *  android.view.View
 *  android.widget.FrameLayout
 */
import android.content.Context;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

public final class dO1$b
extends FrameLayout
implements lx_0 {
    public final CollapsibleActionView a;

    public dO1$b(View view) {
        Context context = view.getContext();
        super(context);
        context = view;
        context = (CollapsibleActionView)view;
        this.a = context;
        this.addView(view);
    }

    public final void a() {
        this.a.onActionViewExpanded();
    }

    public final void c() {
        this.a.onActionViewCollapsed();
    }
}

