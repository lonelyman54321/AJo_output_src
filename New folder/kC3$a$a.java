/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;

public final class kC3$a$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ Ref$LongRef a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Ref$LongRef c;

    public kC3$a$a(Ref$LongRef ref$LongRef, ExoPlayer exoPlayer, Ref$LongRef ref$LongRef2, f80_0 f80_02) {
        this.a = ref$LongRef;
        this.b = exoPlayer;
        this.c = ref$LongRef2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$LongRef ref$LongRef = this.a;
        ExoPlayer exoPlayer = (ExoPlayer)this.b;
        Ref$LongRef ref$LongRef2 = this.c;
        object = new kC3$a$a(ref$LongRef, exoPlayer, ref$LongRef2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kC3$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kC3$a$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        long l2;
        long l3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        ((Ref$LongRef)object).element = l3 = object2.getDuration();
        object = this.c;
        ((Ref$LongRef)object).element = l2 = object2.getCurrentPosition();
        return Unit.a;
    }
}

