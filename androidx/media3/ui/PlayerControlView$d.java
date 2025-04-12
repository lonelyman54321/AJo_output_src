/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package androidx.media3.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$h;
import androidx.media3.ui.R$layout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;

public final class PlayerControlView$d
extends RecyclerView$f {
    public final String[] a;
    public final float[] b;
    public int c;
    public final /* synthetic */ PlayerControlView d;

    public PlayerControlView$d(PlayerControlView playerControlView, String[] stringArray, float[] fArray) {
        this.d = playerControlView;
        this.a = stringArray;
        this.b = fArray;
    }

    public final int getItemCount() {
        return this.a.length;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        TextView textView;
        recyclerView$B = (PlayerControlView$h)recyclerView$B;
        Object object = this.a;
        int n4 = ((String[])object).length;
        if (n3 < n4) {
            textView = ((PlayerControlView$h)recyclerView$B).a;
            object = object[n3];
            textView.setText((CharSequence)object);
        }
        int n7 = this.c;
        n4 = 0;
        textView = null;
        if (n3 == n7) {
            object = recyclerView$B.itemView;
            boolean bl2 = true;
            object.setSelected(bl2);
            object = ((PlayerControlView$h)recyclerView$B).b;
            object.setVisibility(0);
        } else {
            recyclerView$B.itemView.setSelected(false);
            object = ((PlayerControlView$h)recyclerView$B).b;
            n4 = 4;
            object.setVisibility(n4);
        }
        recyclerView$B = recyclerView$B.itemView;
        object = new Yt2(this, n3);
        recyclerView$B.setOnClickListener((View.OnClickListener)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = LayoutInflater.from((Context)this.d.getContext());
        int n4 = R$layout.exo_styled_sub_settings_list_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        object = new PlayerControlView$h((View)viewGroup);
        return object;
    }
}

