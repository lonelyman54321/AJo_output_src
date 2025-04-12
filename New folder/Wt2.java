/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.widget.PopupWindow
 */
import android.view.View;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;

public final class Wt2
implements View.OnLayoutChangeListener {
    public final /* synthetic */ PlayerControlView a;

    public /* synthetic */ Wt2(PlayerControlView playerControlView) {
        this.a = playerControlView;
    }

    public final void onLayoutChange(View view, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        PopupWindow popupWindow;
        PlayerControlView playerControlView = this.a;
        ((Object)((Object)playerControlView)).getClass();
        int n17 = n7 - n3;
        int n18 = n8 - n4;
        int n19 = n15 - n10;
        int n20 = n16 - n14;
        if ((n17 != n19 || n18 != n20) && (n18 = (int)((popupWindow = playerControlView.k).isShowing() ? 1 : 0)) != 0) {
            playerControlView.q();
            n18 = playerControlView.getWidth();
            n19 = popupWindow.getWidth();
            n18 -= n19;
            int n21 = playerControlView.l;
            n18 -= n21;
            n21 = -popupWindow.getHeight() - n21;
            n19 = -1;
            n20 = -1;
            n7 = n18;
            n8 = n21;
            n10 = n19;
            n14 = n20;
            popupWindow.update(view, n18, n21, n19, n20);
        }
    }
}

