/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.view.View;
import android.widget.TextView;
import androidx.media3.ui.R$id;
import androidx.recyclerview.widget.RecyclerView$B;

public final class PlayerControlView$h
extends RecyclerView$B {
    public final TextView a;
    public final View b;

    public PlayerControlView$h(View view) {
        super(view);
        TextView textView;
        int n3 = gz3.a;
        int n4 = 26;
        if (n3 < n4) {
            n3 = 1;
            view.setFocusable(n3 != 0);
        }
        n3 = R$id.exo_text;
        this.a = textView = (TextView)view.findViewById(n3);
        n3 = R$id.exo_check;
        this.b = view = view.findViewById(n3);
    }
}

