/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

/*
 * Renamed from CH3
 */
public final class ch3_2
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ BH3 b;
    public final /* synthetic */ DataCallback c;

    public ch3_2(BH3 bH3, DataCallback dataCallback, f80_0 f80_02) {
        this.b = bH3;
        this.c = dataCallback;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        BH3 bH3 = this.b;
        DataCallback dataCallback = this.c;
        object = new ch3_2(bH3, dataCallback, (f80_0)object3);
        ((ch3_2)object).a = object2;
        object2 = Unit.a;
        return ((ch3_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        yn3_0.a.e((Throwable)object);
        object = this.b.e;
        object2 = this.c;
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

