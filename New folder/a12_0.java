/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.NewPDPRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from a12
 */
public final class a12_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e12_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public a12_0(e12_0 e12_02, String string2, String string3, f80_0 f80_02) {
        this.b = e12_02;
        this.c = string2;
        this.d = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        e12_0 e12_02 = this.b;
        object = new a12_0(e12_02, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a12_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a12_0)object).invokeSuspend(object2);
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
            Object object2 = ((e12_0)object).f;
            Object object3 = String.valueOf(this.c);
            Object object4 = this.d;
            object2 = ((NewPDPRepo)object2).getCrossWidget((String)object3, (String)object4);
            object3 = new a12$a((e12_0)object, null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new a12$b((e12_0)object);
            this.a = n4;
            object = ((at0_1)object4).collect((fs0_2)object2, this);
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

