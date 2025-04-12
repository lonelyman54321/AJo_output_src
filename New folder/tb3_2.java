/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TB3
 */
public final class tb3_2
implements n {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ tr1_0 d;

    public /* synthetic */ tb3_2(ExoPlayer exoPlayer, tr1_0 tr1_02, tr1_0 tr1_03, tr1_0 tr1_04) {
        this.a = exoPlayer;
        this.b = tr1_02;
        this.c = tr1_03;
        this.d = tr1_04;
    }

    public final void k(mu1_1 object, i$a i$a) {
        ExoPlayer exoPlayer = this.a;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        tr1_0 tr1_02 = this.b;
        Intrinsics.checkNotNullParameter(tr1_02, "$lifecycle$delegate");
        tr1_0 tr1_03 = this.c;
        Intrinsics.checkNotNullParameter(tr1_03, "$isAppInForeground$delegate");
        tr1_0 tr1_04 = this.d;
        Intrinsics.checkNotNullParameter(tr1_04, "$isItemVisible$delegate");
        String string2 = "<unused var>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        tr1_02.setValue((Object)i$a);
        object = cC3$d.$EnumSwitchMapping$0;
        int bl2 = i$a.ordinal();
        Object object2 = object[bl2];
        boolean bl3 = true;
        if (object2 != bl3) {
            int n3 = 2;
            if (object2 == n3) {
                object = (Boolean)tr1_04.getValue();
                object2 = (Boolean)object;
                if (object2 != false) {
                    exoPlayer.setPlayWhenReady(bl3);
                }
                object = Boolean.FALSE;
                tr1_03.setValue(object);
            }
        } else {
            object2 = false;
            exoPlayer.setPlayWhenReady(false);
            object = Boolean.TRUE;
            tr1_03.setValue(object);
        }
    }
}

