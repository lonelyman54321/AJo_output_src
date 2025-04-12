/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnLongClickListener
 */
import android.content.Context;
import android.view.View;
import androidx.media3.common.f;
import com.ril.ajio.videoPlayer.ui.ExoplayerRecyclerView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IF0
 */
public final class if0_2
implements View.OnLongClickListener {
    public final /* synthetic */ ExoplayerRecyclerView a;

    public /* synthetic */ if0_2(ExoplayerRecyclerView exoplayerRecyclerView) {
        this.a = exoplayerRecyclerView;
    }

    public final boolean onLongClick(View object) {
        HashMap hashMap = this.a;
        Intrinsics.checkNotNullParameter(hashMap, "this$0");
        Intrinsics.checkNotNull(object);
        hashMap.getClass();
        Intrinsics.checkNotNullParameter(object, "view");
        Object object2 = ((ExoplayerRecyclerView)((Object)hashMap)).a;
        if (object2 != null && (object = (b33_0)object.getTag()) != null) {
            object = ((ExoplayerRecyclerView)((Object)hashMap)).a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("videoSurfaceView");
                object = null;
            }
            object2 = ((ExoplayerRecyclerView)((Object)hashMap)).b;
            object.setPlayer((f)object2);
            object = hashMap.getContext();
            hashMap = hashMap.getContext();
            object2 = "RecyclerView VideoPlayer";
            gz3.y((Context)hashMap, (String)object2);
            hashMap = new HashMap();
            object.getApplicationContext();
        }
        return true;
    }
}

