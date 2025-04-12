/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import kotlin.jvm.internal.Intrinsics;

public final class B23$c
extends Handler {
    public final /* synthetic */ B23 a;

    public B23$c(B23 b23) {
        this.a = b23;
    }

    public final void handleMessage(Message object) {
        Object object2 = "msg";
        Intrinsics.checkNotNullParameter(object, object2);
        super.handleMessage((Message)object);
        int n3 = ((Message)object).what;
        int n4 = 3827;
        if (n3 == n4) {
            object = this.a;
            object2 = ((B23)object).Ra().fswmdProgressView;
            if (object2 != null) {
                object = ((B23)object).Ra().fswmdProgressView;
                ((AjioProgressView)((Object)object)).dismiss();
            }
        }
    }
}

