/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.ril.ajio.home.landingpage.activity.CustomVideoPlayerActivity;

public final class og0
implements View.OnTouchListener {
    public final /* synthetic */ CustomVideoPlayerActivity a;

    public /* synthetic */ og0(CustomVideoPlayerActivity customVideoPlayerActivity) {
        this.a = customVideoPlayerActivity;
    }

    public final boolean onTouch(View object, MotionEvent motionEvent) {
        object = this.a;
        object.getClass();
        int n3 = motionEvent.getAction();
        if (n3 == 0) {
            ((CustomVideoPlayerActivity)object).p0.setVisibility(0);
            ((CustomVideoPlayerActivity)object).p0.show();
            motionEvent = new Handler();
            pg0 pg02 = new pg0((CustomVideoPlayerActivity)object);
            long l2 = 3000L;
            motionEvent.postDelayed((Runnable)pg02, l2);
        }
        return true;
    }
}

