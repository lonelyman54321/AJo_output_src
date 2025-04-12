/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from bC3
 */
public final class bc3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ tr1_0 e;

    public bc3_2(f80_0 f80_02, tr1_0 tr1_02, tr1_0 tr1_03, tr1_0 tr1_04, ExoPlayer exoPlayer) {
        this.b = exoPlayer;
        this.c = tr1_02;
        this.d = tr1_03;
        this.e = tr1_04;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.c;
        Object object2 = this.b;
        f f5 = object2;
        f5 = (ExoPlayer)object2;
        tr1_0 tr1_03 = this.d;
        tr1_0 tr1_04 = this.e;
        object2 = object;
        object = new bc3_2(f80_02, tr1_02, tr1_03, tr1_04, (ExoPlayer)f5);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bc3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bc3_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        bC3$a bC3$a;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0 && n3 != n4) {
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        do {
            object = this.b;
            long l2 = object.getDuration();
            long l3 = object.getCurrentPosition();
            object = ir0_2.a;
            object = em0_2.b;
            tr1_0 tr1_02 = this.e;
            tr1_0 tr1_03 = this.c;
            tr1_0 tr1_04 = this.d;
            bC3$a = new bC3$a(tr1_03, l2, l3, tr1_04, tr1_02, null);
            this.a = n4;
        } while ((object = Ae3.g(this, (CoroutineContext)object, bC3$a)) != j90_02);
        return j90_02;
    }
}

