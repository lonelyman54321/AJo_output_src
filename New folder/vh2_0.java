/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.interstitial.InterstitialActivity;

/*
 * Renamed from vH2
 */
public final class vh2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vh2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                InterstitialActivity.g((InterstitialActivity)this.b, (View)object);
                return;
            }
            case 0: 
        }
        object = (wg2_1)this.b;
        if (object != null) {
            object.R3();
        }
    }
}

