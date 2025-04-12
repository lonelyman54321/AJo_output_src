/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XB3
 */
public final class xb3_1
implements Function1 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ tr1_0 c;

    public /* synthetic */ xb3_1(Configuration configuration, ExoPlayer exoPlayer, tr1_0 tr1_02) {
        this.a = configuration;
        this.b = exoPlayer;
        this.c = tr1_02;
    }

    public final Object invoke(Object object) {
        object = (zp1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$configuration");
        ExoPlayer exoPlayer = this.b;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        tr1_0 tr1_02 = this.c;
        Intrinsics.checkNotNullParameter(tr1_02, "$isItemVisible$delegate");
        String string2 = "layoutCoordinates";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = az3_0.a((zp1)object, object2);
        object2 = bl2;
        tr1_02.setValue(object2);
        if (!bl2) {
            exoPlayer.pause();
            bl2 = false;
            object = null;
            exoPlayer.setPlayWhenReady(false);
        }
        return Unit.a;
    }
}

