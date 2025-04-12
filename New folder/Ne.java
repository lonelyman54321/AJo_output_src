/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.gestures.g;
import kotlin.Unit;

public final class Ne
implements at0 {
    public final Ne$a a;
    public final /* synthetic */ Re b;

    public Ne(Re re) {
        Ne$a ne$a;
        this.b = re;
        this.a = ne$a = new Ne$a(re);
    }

    public final Object a(aS1 object, g object2, f80_0 f80_02) {
        me_0 me_02 = new me_0(this, (g)object2, null);
        if ((object = this.b.a((aS1)((Object)object), me_02, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

