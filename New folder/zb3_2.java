/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZB3
 */
public final class zb3_2
implements Function1 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ tr1_0 e;

    public /* synthetic */ zb3_2(tr1_0 tr1_02, ft1_2 ft1_22, ExoPlayer exoPlayer, tr1_0 tr1_03, tr1_0 tr1_04) {
        this.a = tr1_02;
        this.b = ft1_22;
        this.c = exoPlayer;
        this.d = tr1_03;
        this.e = tr1_04;
    }

    public final Object invoke(Object object) {
        object = (PlayerView)((Object)object);
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$lifecycle$delegate");
        ft1_2 ft1_22 = this.b;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        ExoPlayer exoPlayer = this.c;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$isAppInForeground$delegate");
        tr1_0 tr1_03 = this.e;
        Intrinsics.checkNotNullParameter(tr1_03, "$isItemVisible$delegate");
        Intrinsics.checkNotNullParameter(object, "it");
        Object object3 = (i$a)((Object)object2.getValue());
        object2 = cC3$d.$EnumSwitchMapping$0;
        Object object4 = ((Enum)object3).ordinal();
        object4 = object2[object4];
        Object object5 = 1;
        if (object4 != object5) {
            object5 = 2;
            if (object4 == object5) {
                ((PlayerView)((Object)object)).onPause();
                object3 = ((PlayerView)((Object)object)).getPlayer();
                if (object3 != null) {
                    object3.pause();
                }
            }
        } else {
            ((PlayerView)((Object)object)).onResume();
        }
        object = ((PlayerView)((Object)object)).getPlayer();
        if (object != null) {
            object3 = new cC3$b(ft1_22, exoPlayer, tr1_02, tr1_03);
            object.addListener((f$c)object3);
        }
        return Unit.a;
    }
}

