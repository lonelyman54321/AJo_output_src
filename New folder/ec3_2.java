/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.view.ViewGroup;
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eC3
 */
public final class ec3_2
implements Function1 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f d;
    public final /* synthetic */ mc3_2 e;

    public /* synthetic */ ec3_2(Context context, int n3, int n4, ExoPlayer exoPlayer, mc3_2 mc3_22) {
        this.a = context;
        this.b = n3;
        this.c = n4;
        this.d = exoPlayer;
        this.e = mc3_22;
    }

    public final Object invoke(Object object) {
        object = (Context)object;
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "$context");
        f f5 = this.d;
        Intrinsics.checkNotNullParameter(f5, "$exoPlayer");
        mc3_2 mc3_22 = this.e;
        Intrinsics.checkNotNullParameter(mc3_22, "$playerListener");
        Intrinsics.checkNotNullParameter(object, "it");
        object = new PlayerView(context);
        int n3 = this.b;
        int n4 = this.c;
        Object object2 = new ViewGroup.LayoutParams(n3, n4);
        object.setLayoutParams((ViewGroup.LayoutParams)object2);
        ((PlayerView)((Object)object)).setUseController(false);
        ((PlayerView)((Object)object)).setControllerShowTimeoutMs(0);
        ((PlayerView)((Object)object)).hideController();
        ((PlayerView)((Object)object)).setControllerAutoShow(false);
        ((PlayerView)((Object)object)).setResizeMode(4);
        ((PlayerView)((Object)object)).setPlayer(f5);
        int n7 = 2;
        ((PlayerView)((Object)object)).setShowBuffering(n7);
        object2 = ((PlayerView)((Object)object)).getPlayer();
        if (object2 != null) {
            object2.removeListener(mc3_22);
        }
        if ((object2 = ((PlayerView)((Object)object)).getPlayer()) != null) {
            object2.addListener(mc3_22);
        }
        return object;
    }
}

