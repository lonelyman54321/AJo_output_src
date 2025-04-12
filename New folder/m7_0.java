/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from m7
 */
public final class m7_0
implements F62 {
    public final /* synthetic */ AjioExoPlayerFragment a;

    public /* synthetic */ m7_0(AjioExoPlayerFragment ajioExoPlayerFragment) {
        this.a = ajioExoPlayerFragment;
    }

    public final void onChanged(Object object) {
        object = (Long)object;
        AjioExoPlayerFragment ajioExoPlayerFragment = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(ajioExoPlayerFragment, (String)object2);
        ajioExoPlayerFragment = ajioExoPlayerFragment.i;
        if (ajioExoPlayerFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            ajioExoPlayerFragment = null;
        }
        object2 = eb_2.a;
        Intrinsics.checkNotNull(object);
        object = eb_2.a((Long)object);
        ajioExoPlayerFragment.setText((CharSequence)object);
    }
}

