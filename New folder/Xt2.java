/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.ui.PlayerControlView$a;
import androidx.media3.ui.R$string;
import com.jio.jioads.interstitial.InterstitialActivity;

public final class Xt2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Xt2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        boolean bl2;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                InterstitialActivity.h((InterstitialActivity)object2, object);
                return;
            }
            case 0: 
        }
        object = ((PlayerControlView$a)object2).c;
        object2 = object.z0;
        if (object2 != null && (bl2 = object2.isCommandAvailable(n3 = 29))) {
            object2 = object.z0.getTrackSelectionParameters();
            String[] stringArray = object.z0;
            int n4 = gz3.a;
            object2 = ((Fp3)object2).a();
            n4 = 1;
            object2 = ((Fp3$b)object2).b(n4).i(n4).a();
            stringArray.setTrackSelectionParameters((Fp3)object2);
            object2 = object.getResources();
            n3 = R$string.exo_track_selection_auto;
            object2 = object2.getString(n3);
            stringArray = object.f.b;
            stringArray[n4] = object2;
            object = object.k;
            object.dismiss();
        }
    }
}

