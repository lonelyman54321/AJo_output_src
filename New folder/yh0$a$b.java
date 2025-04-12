/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class yh0$a$b
implements fs0_2 {
    public final /* synthetic */ yh0_0 a;

    public yh0$a$b(yh0_0 yh0_02) {
        this.a = yh0_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        i23_0 i23_02 = this.a.d;
        if ((object = i23_02.emit(object, (f80_0)object2)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }
}

