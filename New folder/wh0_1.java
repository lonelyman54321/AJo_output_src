/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wh0
 */
public final class wh0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yh0_0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public wh0_1(yh0_0 yh0_02, int n3, int n4, String string2, f80_0 f80_02) {
        this.b = yh0_02;
        this.c = n3;
        this.d = n4;
        this.e = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.d;
        String string2 = this.e;
        yh0_0 yh0_02 = this.b;
        int n4 = this.c;
        object = new wh0_1(yh0_02, n4, n3, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (wh0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wh0_1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            Object object2;
            vl2_2.b(object);
            object = this.b;
            Object object3 = ((yh0_0)object).a;
            object3.getClass();
            String string2 = this.e;
            Intrinsics.checkNotNullParameter(string2, "optionCode");
            int n7 = this.d;
            int n8 = this.c;
            Object object4 = object2;
            object2 = new ko2_2((NO2)object3, string2, n7, n8, null);
            object4 = new br2_2((Function2)object2);
            object2 = ir0_2.a;
            object2 = em0_2.b;
            object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
            object4 = new jo2_0((es0_2)object2);
            object2 = ir0_2.a;
            object2 = ms0_1.m((es0_2)object4, (CoroutineContext)object2);
            object4 = new wh0$a_0((yh0_0)object, null);
            object3 = new at0_1((es0_2)object2, (gx0_2)object4);
            object2 = new wh0$b((yh0_0)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
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

