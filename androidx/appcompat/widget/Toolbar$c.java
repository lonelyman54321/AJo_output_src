/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

public final class Toolbar$c
implements View.OnClickListener {
    public final /* synthetic */ Toolbar a;

    public Toolbar$c(Toolbar toolbar) {
        this.a = toolbar;
    }

    public final void onClick(View view) {
        this.a.collapseActionView();
    }
}

