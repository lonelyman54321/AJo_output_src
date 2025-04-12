/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$a;
import androidx.media3.ui.PlayerControlView$d;
import androidx.media3.ui.PlayerControlView$f;
import androidx.recyclerview.widget.RecyclerView$B;

public final class Zt2
implements View.OnClickListener {
    public final /* synthetic */ PlayerControlView$f a;

    public /* synthetic */ Zt2(PlayerControlView$f f5) {
        this.a = f5;
    }

    public final void onClick(View object) {
        object = this.a;
        int n3 = ((RecyclerView$B)object).getBindingAdapterPosition();
        object = ((PlayerControlView$f)object).d;
        View view = ((PlayerControlView)((Object)object)).z;
        if (n3 == 0) {
            view.getClass();
            PlayerControlView$d playerControlView$d = ((PlayerControlView)((Object)object)).g;
            ((PlayerControlView)((Object)object)).d(playerControlView$d, view);
        } else {
            int n4 = 1;
            if (n3 == n4) {
                view.getClass();
                PlayerControlView$a playerControlView$a = ((PlayerControlView)((Object)object)).i;
                ((PlayerControlView)((Object)object)).d(playerControlView$a, view);
            } else {
                object = ((PlayerControlView)((Object)object)).k;
                object.dismiss();
            }
        }
    }
}

