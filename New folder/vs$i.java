/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class vs$i
extends qg3_2
implements Function2 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ExoPlayer d;
    public final /* synthetic */ tr1_0 e;

    public vs$i(tr1_0 tr1_02, tr1_0 tr1_03, String string2, ExoPlayer exoPlayer, tr1_0 tr1_04, f80_0 f80_02) {
        this.a = tr1_02;
        this.b = tr1_03;
        this.c = string2;
        this.d = exoPlayer;
        this.e = tr1_04;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ExoPlayer exoPlayer = this.d;
        tr1_0 tr1_02 = this.e;
        tr1_0 tr1_03 = this.a;
        tr1_0 tr1_04 = this.b;
        String string2 = this.c;
        object = new vs$i(tr1_03, tr1_04, string2, exoPlayer, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vs$i)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vs$i)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (Subcomponent)this.a.getValue();
        if (object != null) {
            boolean bl2;
            object = (Subcomponent)this.b.getValue();
            if (object != null) {
                object = ((Subcomponent)object).getUuid();
            } else {
                bl2 = false;
                object = null;
            }
            object2 = this.c;
            bl2 = Intrinsics.areEqual(object, object2);
            if (!bl2 && (bl2 = ((Boolean)(object = (Boolean)this.e.getValue())).booleanValue())) {
                object = this.d;
                object.pause();
            }
        }
        return Unit.a;
    }
}

