/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from kC3
 */
public final class kc3_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ f c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ tr1_0 e;

    public kc3_2(c80 c802, tr1_0 tr1_02, ExoPlayer exoPlayer, tr1_0 tr1_03, tr1_0 tr1_04, f80_0 f80_02) {
        this.a = c802;
        this.b = tr1_02;
        this.c = exoPlayer;
        this.d = tr1_03;
        this.e = tr1_04;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.a;
        i90_0 i90_02 = object2;
        i90_02 = (c80)object2;
        Object object3 = object2 = this.c;
        object3 = (ExoPlayer)object2;
        tr1_0 tr1_02 = this.b;
        tr1_0 tr1_03 = this.d;
        tr1_0 tr1_04 = this.e;
        object2 = object;
        object = new kc3_2((c80)i90_02, tr1_02, (ExoPlayer)object3, tr1_03, tr1_04, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kc3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kc3_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        kc3$a_0 kc3$a_0;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = ir0_2.a;
        object = em0_2.b;
        tr1_0 tr1_02 = this.d;
        Object object3 = object2 = this.c;
        object3 = (ExoPlayer)object2;
        tr1_0 tr1_03 = this.b;
        tr1_0 tr1_04 = this.e;
        object2 = kc3$a_0;
        kc3$a_0 = new kc3$a_0(null, tr1_03, tr1_02, tr1_04, (ExoPlayer)object3);
        Ae3.d(this.a, (CoroutineContext)object, null, kc3$a_0, 2);
        return Unit.a;
    }
}

