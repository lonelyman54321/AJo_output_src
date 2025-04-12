/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

public final class yW2$a$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ zr1_1 b;

    public yW2$a$a(zr1_1 zr1_12, f80_0 f80_02) {
        this.b = zr1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        zr1_1 zr1_12 = this.b;
        object = new yW2$a$a(zr1_12, (f80_0)object3);
        ((yW2$a$a)object).a = object2;
        object2 = Unit.a;
        return ((yW2$a$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "PLPSearchProducts", true, "search screen", null, 16, null);
        this.b.k(object);
        return Unit.a;
    }
}

