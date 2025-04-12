/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 */
import android.view.LayoutInflater;
import android.view.View;
import com.skydoves.balloon.R$layout;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;

/*
 * Renamed from Zu
 */
public final class zu_2
implements BC3 {
    public final BalloonAnchorOverlayView a;

    public zu_2(BalloonAnchorOverlayView balloonAnchorOverlayView, BalloonAnchorOverlayView balloonAnchorOverlayView2) {
        this.a = balloonAnchorOverlayView;
    }

    public static zu_2 bind(View object) {
        if (object != null) {
            object = (BalloonAnchorOverlayView)((Object)object);
            zu_2 zu_22 = new zu_2((BalloonAnchorOverlayView)((Object)object), (BalloonAnchorOverlayView)((Object)object));
            return zu_22;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static zu_2 inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.balloon_layout_overlay;
        return zu_2.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}

