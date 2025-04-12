/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

public final class wX1$a$b
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ wx1_1 c;

    public wX1$a$b(f80_0 f80_02, wx1_1 wx1_12, boolean bl2) {
        this.b = bl2;
        this.c = wx1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        boolean bl2 = this.b;
        wx1_1 wx1_12 = this.c;
        object = new wX1$a$b((f80_0)object3, wx1_12, bl2);
        ((wX1$a$b)object).a = object2;
        object2 = Unit.a;
        return ((wX1$a$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = yn3_0.a;
        ((yn3$a)object2).e((Throwable)object);
        boolean bl2 = this.b;
        if (bl2) {
            object = this.c.D0;
            object2 = DataCallback.Companion;
            Boolean bl3 = Boolean.FALSE;
            object2 = ((DataCallback$Companion)object2).onSuccess(bl3);
            ((LiveData)object).k(object2);
        }
        return Unit.a;
    }
}

