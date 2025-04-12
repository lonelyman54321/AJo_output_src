/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.os.Handler
 *  android.view.View$OnTouchListener
 */
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import com.ril.ajio.customviews.widgets.AjioVideoView;
import com.ril.ajio.home.landingpage.activity.CustomVideoPlayerActivity;

/*
 * Renamed from ng0
 */
public final class ng0_0
implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ CustomVideoPlayerActivity a;

    public /* synthetic */ ng0_0(CustomVideoPlayerActivity customVideoPlayerActivity) {
        this.a = customVideoPlayerActivity;
    }

    public final void onPrepared(MediaPlayer object) {
        object = this.a;
        AjioVideoView ajioVideoView = object.Y;
        int n3 = object.q0;
        ajioVideoView.seekTo(n3);
        object.Y.start();
        object.k0.setVisibility(8);
        object.p0.setVisibility(0);
        object.p0.show();
        ajioVideoView = new Handler();
        Object object2 = new pg0((CustomVideoPlayerActivity)object);
        ajioVideoView.postDelayed((Runnable)object2, 3000L);
        ajioVideoView = object.Y;
        object2 = new og0((CustomVideoPlayerActivity)object);
        ajioVideoView.setOnTouchListener((View.OnTouchListener)object2);
    }
}

