/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from b43
 */
public final class b43_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e43_0 b;
    public final /* synthetic */ String c;

    public b43_0(e43_0 e43_02, String string2, f80_0 f80_02) {
        this.b = e43_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e43_0 e43_02 = this.b;
        String string2 = this.c;
        object = new b43_0(e43_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (b43_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((b43_0)object).invokeSuspend(object2);
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
            object = this.b.h;
            this.a = n4;
            n3 = 0;
            String string2 = this.c;
            String string3 = "plp screen";
            object = ((BH3)object).c(string2, string3, null, this);
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

