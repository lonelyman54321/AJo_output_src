/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

public final class zX1$b
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ wx1_1 b;

    public zX1$b(wx1_1 wx1_12, f80_0 f80_02) {
        this.b = wx1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        wx1_1 wx1_12 = this.b;
        object = new zX1$b(wx1_12, (f80_0)object3);
        ((zX1$b)object).a = object2;
        object2 = Unit.a;
        return ((zX1$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        yn3_0.a.e((Throwable)object);
        object = this.b.x0;
        object2 = DataCallback.Companion;
        Boolean bl2 = Boolean.FALSE;
        object2 = ((DataCallback$Companion)object2).onSuccess(bl2);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

