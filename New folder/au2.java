/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.common.f;
import androidx.media3.ui.PlayerControlView$j;
import androidx.media3.ui.PlayerControlView$k;
import com.google.common.collect.ImmutableList;

public final class au2
implements View.OnClickListener {
    public final /* synthetic */ PlayerControlView$k a;
    public final /* synthetic */ f b;
    public final /* synthetic */ qp3 c;
    public final /* synthetic */ PlayerControlView$j d;

    public /* synthetic */ au2(PlayerControlView$k playerControlView$k, f f5, qp3 qp32, PlayerControlView$j playerControlView$j) {
        this.a = playerControlView$k;
        this.b = f5;
        this.c = qp32;
        this.d = playerControlView$j;
    }

    public final void onClick(View object) {
        object = this.a;
        object.getClass();
        Object object2 = this.b;
        boolean bl2 = object2.isCommandAvailable(29);
        if (bl2) {
            Object object3 = object2.getTrackSelectionParameters().a();
            PlayerControlView$j playerControlView$j = this.d;
            int n3 = playerControlView$j.b;
            ImmutableList immutableList = ImmutableList.of((Object)n3);
            qp3 qp32 = this.c;
            Object object4 = new Ep3(qp32, immutableList);
            object3 = ((Fp3$b)object3).e((Ep3)object4);
            object4 = playerControlView$j.a.b;
            int n4 = ((qp3)object4).c;
            object3 = ((Fp3$b)object3).i(n4).a();
            object2.setTrackSelectionParameters((Fp3)object3);
            object2 = playerControlView$j.c;
            ((PlayerControlView$k)object).i((String)object2);
            object = ((PlayerControlView$k)object).b.k;
            object.dismiss();
        }
    }
}

