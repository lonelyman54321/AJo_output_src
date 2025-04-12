/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from zX1
 */
public final class zx1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ wx1_1 b;
    public final /* synthetic */ boolean c;

    public zx1_1(f80_0 f80_02, wx1_1 wx1_12, boolean bl2) {
        this.b = wx1_12;
        this.c = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wx1_1 wx1_12 = this.b;
        boolean bl2 = this.c;
        object = new zx1_1(f80_02, wx1_12, bl2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zx1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zx1_1)object).invokeSuspend(object2);
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
            wx1_1 wx1_12 = this.b;
            boolean bl2 = this.c;
            object = new zX1$a(null, wx1_12, bl2);
            Object object2 = new br2_2((Function2)object);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
            object2 = new zX1$b(wx1_12, null);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object = new zX1$c(wx1_12);
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
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

