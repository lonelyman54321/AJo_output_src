/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.SimilarToRepo;
import kotlin.Unit;

public final class Q43$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ r43_0 b;
    public final /* synthetic */ zr1_1 c;

    public Q43$a(r43_0 r43_02, zr1_1 zr1_12, f80_0 f80_02) {
        this.b = r43_02;
        this.c = zr1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        r43_0 r43_02 = this.b;
        zr1_1 zr1_12 = this.c;
        object = new Q43$a(r43_02, zr1_12, (f80_0)object3);
        ((Q43$a)object).a = object2;
        object2 = Unit.a;
        return ((Q43$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = this.b;
        zr1_1 zr1_12 = ((r43_0)object2).c;
        String string2 = "BackGround_SimilarProductList";
        object2 = ((r43_0)object2).a;
        object = ((SimilarToRepo)object2).handleApiException(string2, (Throwable)object, null, false);
        zr1_12.k(object);
        object = this.c;
        if (object != null) {
            object2 = Boolean.FALSE;
            ((LiveData)object).i(object2);
        }
        return Unit.a;
    }
}

