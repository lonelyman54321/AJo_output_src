/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.R$id;
import androidx.recyclerview.widget.RecyclerView$B;

public final class PlayerControlView$f
extends RecyclerView$B {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final /* synthetic */ PlayerControlView d;

    public PlayerControlView$f(PlayerControlView object, View view) {
        this.d = object;
        super(view);
        int n3 = gz3.a;
        int n4 = 26;
        if (n3 < n4) {
            n3 = 1;
            view.setFocusable(n3 != 0);
        }
        n3 = R$id.exo_main_text;
        object = (TextView)view.findViewById(n3);
        this.a = object;
        n3 = R$id.exo_sub_text;
        object = (TextView)view.findViewById(n3);
        this.b = object;
        n3 = R$id.exo_icon;
        object = (ImageView)view.findViewById(n3);
        this.c = object;
        super(this);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

