/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.view.BaseSplitActivity;

/*
 * Renamed from zw
 */
public final class zw_1
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;

    public /* synthetic */ zw_1(View view, String string2) {
        this.a = view;
        this.b = string2;
    }

    public final void run() {
        View view = this.a;
        String string2 = this.b;
        BaseSplitActivity.u2(view, string2);
    }
}

