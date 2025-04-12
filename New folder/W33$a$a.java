/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class W33$a$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e43_0 b;
    public final /* synthetic */ String c;

    public W33$a$a(e43_0 e43_02, String string2, f80_0 f80_02) {
        this.b = e43_02;
        this.c = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e43_0 e43_02 = this.b;
        String string2 = this.c;
        object = new W33$a$a(e43_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (W33$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((W33$a$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.a;
        boolean bl3 = true;
        if (!bl2) {
            vl2_2.b(object);
            this.a = bl3;
            object = this.b;
            String string2 = this.c;
            object = ((e43_0)object).e(string2, bl3, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (bl2 == bl3) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

