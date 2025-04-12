/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from os
 */
public final class os_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ tr1_0 d;

    public os_1(String string2, ExoPlayer exoPlayer, tr1_0 tr1_02, tr1_0 tr1_03, f80_0 f80_02) {
        this.a = string2;
        this.b = exoPlayer;
        this.c = tr1_02;
        this.d = tr1_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.c;
        tr1_0 tr1_03 = this.d;
        String string2 = this.a;
        ExoPlayer exoPlayer = this.b;
        object = new os_1(string2, exoPlayer, tr1_02, tr1_03, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (os_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((os_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (Boolean)this.c.getValue();
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = (Component)this.d.getValue();
            if (object != null) {
                object = ((Component)object).getUuid();
            } else {
                bl2 = false;
                object = null;
            }
            object2 = this.a;
            bl2 = Intrinsics.areEqual(object, object2);
            if (!bl2) {
                object = this.b;
                object.pause();
            }
        }
        return Unit.a;
    }
}

