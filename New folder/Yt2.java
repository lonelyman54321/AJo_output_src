/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$d;

public final class Yt2
implements View.OnClickListener {
    public final /* synthetic */ PlayerControlView$d a;
    public final /* synthetic */ int b;

    public /* synthetic */ Yt2(PlayerControlView$d d2, int n3) {
        this.a = d2;
        this.b = n3;
    }

    public final void onClick(View object) {
        object = this.a;
        int n3 = object.c;
        int n4 = this.b;
        PlayerControlView playerControlView = object.d;
        if (n4 != n3) {
            object = object.b;
            View view = object[n4];
            PlayerControlView.a(playerControlView, (float)view);
        }
        playerControlView.k.dismiss();
    }
}

