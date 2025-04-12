/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from PS0
 */
public final class ps0_2
implements es0_2 {
    public final /* synthetic */ Object a;

    public ps0_2(Object object) {
        this.a = object;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Object object3 = this.a;
        if ((object = object.emit(object3, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

