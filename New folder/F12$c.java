/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class F12$c
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ F12 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public F12$c(F12 f12, String string2, String string3, f80_0 f80_02) {
        this.b = f12;
        this.c = string2;
        this.d = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        F12 f12 = this.b;
        object = new F12$c(f12, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (F12$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((F12$c)object).invokeSuspend(object2);
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
            this.b.f.getClass();
            object = this.c;
            Intrinsics.checkNotNullParameter(object, "url");
            Object object2 = this.d;
            Intrinsics.checkNotNullParameter(object2, "searchText");
            es0_2 es0_22 = DatabaseCreator.INSTANCE.getDBInstance();
            ru2_0 ru2_02 = new ru2_0(es0_22, (String)object, (String)object2);
            object = ir0_2.a;
            object = ms0_1.m(ru2_02, (CoroutineContext)object);
            int n7 = 3;
            ru2_02 = null;
            object2 = new qg3_2(n7, null);
            es0_22 = new at0_1((es0_2)object, (gx0_2)object2);
            object = F12$c$b.a;
            this.a = n4;
            object = ((at0_1)es0_22).collect((fs0_2)object, this);
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

