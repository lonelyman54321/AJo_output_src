/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.media3.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.f;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$h;
import androidx.media3.ui.PlayerControlView$j;
import androidx.media3.ui.R$layout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import java.util.List;

public abstract class PlayerControlView$k
extends RecyclerView$f {
    public List a;
    public final /* synthetic */ PlayerControlView b;

    public PlayerControlView$k(PlayerControlView object) {
        this.b = object;
        this.a = object;
    }

    public void g(PlayerControlView$h playerControlView$h, int n3) {
        f f5 = this.b.z0;
        if (f5 == null) {
            return;
        }
        if (n3 == 0) {
            this.h(playerControlView$h);
        } else {
            au2 au22;
            int n4;
            Object object;
            Object object2 = this.a;
            int n7 = 1;
            PlayerControlView$j playerControlView$j = (PlayerControlView$j)object2.get(n3 -= n7);
            object2 = playerControlView$j.a.b;
            Object object3 = f5.getTrackSelectionParameters().A.get(object2);
            int n8 = 0;
            if (object3 == null || (object = (object3 = (Object)playerControlView$j.a.e)[n4 = playerControlView$j.b]) == false) {
                n7 = 0;
                au22 = null;
            }
            object3 = playerControlView$h.a;
            String string2 = playerControlView$j.c;
            object3.setText((CharSequence)string2);
            if (n7 == 0) {
                n8 = 4;
            }
            playerControlView$h.b.setVisibility(n8);
            playerControlView$h = playerControlView$h.itemView;
            au22 = new au2(this, f5, (qp3)object2, playerControlView$j);
            playerControlView$h.setOnClickListener(au22);
        }
    }

    public final int getItemCount() {
        List list = this.a;
        int n3 = (int)(list.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            list = null;
        } else {
            list = this.a;
            n3 = list.size() + 1;
        }
        return n3;
    }

    public abstract void h(PlayerControlView$h var1);

    public abstract void i(String var1);

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = LayoutInflater.from((Context)this.b.getContext());
        int n4 = R$layout.exo_styled_sub_settings_list_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        object = new PlayerControlView$h((View)viewGroup);
        return object;
    }
}

