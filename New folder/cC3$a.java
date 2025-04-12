/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class cC3$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ tr1_0 c;

    public cC3$a(ExoPlayer exoPlayer, ft1_2 ft1_22, tr1_0 tr1_02, f80_0 f80_02) {
        this.a = exoPlayer;
        this.b = ft1_22;
        this.c = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ft1_2 ft1_22 = this.b;
        tr1_0 tr1_02 = this.c;
        ExoPlayer exoPlayer = this.a;
        object = new cC3$a(exoPlayer, ft1_22, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cC3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cC3$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        int bl22 = object.getPlaybackState();
        int n3 = 4;
        if (bl22 == n3) {
            long l2 = 0L;
            object.seekTo(l2);
        }
        if (bl2 = ((xm0_0)(object2 = this.b.i)).b()) {
            object.pause();
            boolean bl3 = false;
            object2 = null;
            object.setPlayWhenReady(false);
        } else {
            object2 = (Boolean)this.c.getValue();
            boolean bl4 = (Boolean)object2;
            if (bl4) {
                boolean bl5 = true;
                object.setPlayWhenReady(bl5);
            }
        }
        return Unit.a;
    }
}

