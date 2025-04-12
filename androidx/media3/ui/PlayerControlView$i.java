/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View$OnClickListener
 */
package androidx.media3.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$h;
import androidx.media3.ui.PlayerControlView$j;
import androidx.media3.ui.PlayerControlView$k;
import androidx.media3.ui.R$string;
import java.util.List;

public final class PlayerControlView$i
extends PlayerControlView$k {
    public final /* synthetic */ PlayerControlView c;

    public PlayerControlView$i(PlayerControlView playerControlView) {
        this.c = playerControlView;
        super(playerControlView);
    }

    public final void g(PlayerControlView$h playerControlView$h, int object) {
        super.g(playerControlView$h, (int)object);
        if (object > 0) {
            Object object2 = this.a;
            PlayerControlView$j playerControlView$j = (PlayerControlView$j)object2.get((int)(object += -1));
            playerControlView$h = playerControlView$h.b;
            object2 = playerControlView$j.a.e;
            object = playerControlView$j.b;
            if ((object = (Object)object2[object]) != 0) {
                object = 0;
                playerControlView$j = null;
            } else {
                object = 4;
            }
            playerControlView$h.setVisibility((int)object);
        }
    }

    public final void h(PlayerControlView$h playerControlView$h) {
        Object object;
        int n3;
        Object object2 = playerControlView$h.a;
        int n4 = R$string.exo_track_selection_none;
        object2.setText(n4);
        int n7 = 0;
        object2 = null;
        for (n4 = 0; n4 < (n3 = (object = this.a).size()); ++n4) {
            object = (PlayerControlView$j)this.a.get(n4);
            boolean[] blArray = ((PlayerControlView$j)object).a.e;
            n3 = ((PlayerControlView$j)object).b;
            if ((n3 = blArray[n3]) == 0) continue;
            n7 = 4;
            break;
        }
        playerControlView$h.b.setVisibility(n7);
        playerControlView$h = playerControlView$h.itemView;
        object2 = new bv1_2(this, 1);
        playerControlView$h.setOnClickListener((View.OnClickListener)object2);
    }

    public final void i(String string2) {
    }

    public final void j(List list) {
        Object object;
        PlayerControlView$j playerControlView$j;
        int n3;
        boolean bl2 = false;
        String string2 = null;
        PlayerControlView playerControlView = null;
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            playerControlView$j = (PlayerControlView$j)list.get(i3);
            object = playerControlView$j.a.e;
            n3 = playerControlView$j.b;
            if ((n3 = object[n3]) == 0) continue;
            bl2 = true;
            break;
        }
        playerControlView = this.c;
        playerControlView$j = playerControlView.w;
        if (playerControlView$j != null) {
            object = bl2 ? (Object)playerControlView.r0 : (Object)playerControlView.s0;
            playerControlView$j.setImageDrawable((Drawable)object);
            string2 = bl2 ? playerControlView.t0 : playerControlView.u0;
            playerControlView = playerControlView.w;
            playerControlView.setContentDescription(string2);
        }
        this.a = list;
    }
}

