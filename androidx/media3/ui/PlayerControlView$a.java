/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$OnClickListener
 */
package androidx.media3.ui;

import android.view.View;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$h;
import androidx.media3.ui.PlayerControlView$j;
import androidx.media3.ui.PlayerControlView$k;
import androidx.media3.ui.R$string;
import com.google.common.collect.ImmutableMap;

public final class PlayerControlView$a
extends PlayerControlView$k {
    public final /* synthetic */ PlayerControlView c;

    public PlayerControlView$a(PlayerControlView playerControlView) {
        this.c = playerControlView;
        super(playerControlView);
    }

    public final void h(PlayerControlView$h playerControlView$h) {
        Object object = playerControlView$h.a;
        int n3 = R$string.exo_track_selection_auto;
        object.setText(n3);
        object = this.c.z0;
        object.getClass();
        object = object.getTrackSelectionParameters();
        int n4 = this.j((Fp3)object);
        if (n4 != 0) {
            n4 = 4;
        } else {
            n4 = 0;
            object = null;
        }
        playerControlView$h.b.setVisibility(n4);
        playerControlView$h = playerControlView$h.itemView;
        object = new Xt2(this, 0);
        playerControlView$h.setOnClickListener((View.OnClickListener)object);
    }

    public final void i(String string2) {
        this.c.f.b[1] = string2;
    }

    public final boolean j(Fp3 fp3) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object = this.a).size()); ++i3) {
            ImmutableMap immutableMap = fp3.A;
            object = ((PlayerControlView$j)this.a.get((int)i3)).a.b;
            n3 = (int)(immutableMap.containsKey(object) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }
}

