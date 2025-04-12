/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.UserRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Iy3
 */
public final class iy3_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ hy3_0 b;
    public final /* synthetic */ String c;

    public iy3_0(hy3_0 hy3_02, String string2, f80_0 f80_02) {
        this.b = hy3_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hy3_0 hy3_02 = this.b;
        String string2 = this.c;
        object = new iy3_0(hy3_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (iy3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((iy3_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((hy3_0)object).g;
            Object object3 = this.c;
            object2 = ((UserRepo)object2).deleteAccount((String)object3);
            object3 = new Iy3$a((hy3_0)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new Iy3$b((hy3_0)object);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

