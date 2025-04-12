/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.TransitionDrawable
 *  android.view.View
 *  org.json.JSONObject
 */
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import com.ril.ajio.payment.view.NpsView;
import in.juspay.hypersdk.analytics.LogPusher;
import org.json.JSONObject;

/*
 * Renamed from Pw1
 */
public final class pw1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pw1_2(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    public final void run() {
        Object object = this.d;
        boolean bl2 = true;
        Object object2 = this.c;
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = NpsView.N;
                object3 = (Drawable)object3;
                object2 = (Drawable)object2;
                Drawable[] drawableArray = new Drawable[2];
                drawableArray[0] = object3;
                drawableArray[bl2] = object2;
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArray);
                transitionDrawable.setCrossFadeEnabled(bl2);
                ((View)object).setBackground((Drawable)transitionDrawable);
                transitionDrawable.startTransition(500);
                return;
            }
            case 0: 
        }
        object2 = (String)object2;
        object = (JSONObject)object;
        LogPusher.a((LogPusher)object3, (String)object2, (JSONObject)object);
    }
}

