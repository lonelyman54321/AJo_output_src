/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
import android.view.MotionEvent;
import android.view.View;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCAttachmentViewHolderRefresh;

/*
 * Renamed from VF
 */
public final class vf_2
implements View.OnTouchListener {
    public final /* synthetic */ CCAttachmentViewHolderRefresh a;

    public /* synthetic */ vf_2(CCAttachmentViewHolderRefresh cCAttachmentViewHolderRefresh) {
        this.a = cCAttachmentViewHolderRefresh;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return CCAttachmentViewHolderRefresh.x(this.a, view, motionEvent);
    }
}

