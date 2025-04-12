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
 * Renamed from fi2
 */
public final class fi2_1
implements View.OnClickListener {
    public final /* synthetic */ li2_2 a;

    public /* synthetic */ fi2_1(li2_2 li2_22) {
        this.a = li2_22;
    }

    public final void onClick(View object) {
        boolean bl2;
        boolean bl3;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((li2_2)object).K = bl3 = true;
        ma_2 ma_22 = ((li2_2)object).d;
        int n3 = ma_22.r;
        ExoPlayer exoPlayer = ma_22.a(n3);
        if (exoPlayer != null && (bl2 = exoPlayer.isPlaying())) {
            exoPlayer.pause();
        }
        ma_22.r = n3 = ((li2_2)object).w();
        ma_22 = ((li2_2)object).m;
        if (ma_22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            bl3 = false;
            ma_22 = null;
        }
        ai0_2.i((View)ma_22);
        ((li2_2)object).D();
    }
}

