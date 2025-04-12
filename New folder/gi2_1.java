/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gi2
 */
public final class gi2_1
implements View.OnClickListener {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ gi2_1(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final void onClick(View object) {
        boolean bl2;
        li2_2 li2_22 = this.a;
        Intrinsics.checkNotNullParameter(li2_22, "this$0");
        li2_22.G = false;
        object = li2_22.d;
        int n3 = ((ma_2)object).r;
        ExoPlayer exoPlayer = ((ow_0)object).a(n3);
        if (exoPlayer != null && (bl2 = exoPlayer.isPlaying())) {
            exoPlayer.pause();
            Object object2 = ((ow_0)object).e(n3);
            if (object2 == null || (object2 = ((lt2_1)object2).d) == null) {
                object2 = "";
            }
            li2_22.G((String)object2, exoPlayer);
            li2_22.z();
        }
        ((ma_2)object).r = n3 = li2_22.w();
        li2_22.y();
    }
}

