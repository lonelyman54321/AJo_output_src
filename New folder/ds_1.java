/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ds
 */
public final class ds_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ExoPlayer a;

    public ds_1(ExoPlayer exoPlayer, f80_0 f80_02) {
        this.a = exoPlayer;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ExoPlayer exoPlayer = this.a;
        object = new ds_1(exoPlayer, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ds_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ds_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.a.pause();
        return Unit.a;
    }
}

