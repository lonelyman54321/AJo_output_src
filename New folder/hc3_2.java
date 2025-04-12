/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hC3
 */
public final class hc3_2
implements n {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ f c;
    public final /* synthetic */ tr1_0 d;

    public /* synthetic */ hc3_2(Boolean bl2, Boolean bl3, ExoPlayer exoPlayer, tr1_0 tr1_02) {
        this.a = bl2;
        this.b = bl3;
        this.c = exoPlayer;
        this.d = tr1_02;
    }

    public final void k(mu1_1 object, i$a i$a) {
        f f5 = this.c;
        Intrinsics.checkNotNullParameter(f5, "$exoPlayer");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$isAppInForeground$delegate");
        String string2 = "<unused var>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        object = nc3$a_0.$EnumSwitchMapping$0;
        int bl2 = i$a.ordinal();
        Object object2 = object[bl2];
        boolean bl3 = false;
        i$a = null;
        int n3 = 1;
        if (object2 != n3) {
            n3 = 2;
            if (object2 == n3) {
                f5.setPlayWhenReady(false);
                object = Boolean.FALSE;
                tr1_02.setValue(object);
            }
        } else {
            boolean bl4;
            Boolean bl5 = this.a;
            object = Boolean.FALSE;
            boolean bl6 = Intrinsics.areEqual(bl5, object);
            if (!bl6 || (object2 = (Object)Intrinsics.areEqual(bl5 = this.b, object)) == false) {
                bl4 = true;
            }
            f5.setPlayWhenReady(bl4);
            object = Boolean.TRUE;
            tr1_02.setValue(object);
        }
    }
}

