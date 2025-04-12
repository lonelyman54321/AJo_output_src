/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MR0
 */
public final class mr0_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public mr0_0(dr0_0 dr0_02, String string2, f80_0 f80_02) {
        this.b = dr0_02;
        this.c = string2;
        this.d = "Fleek Home Screen";
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        dr0_0 dr0_02 = this.b;
        object = new mr0_0(dr0_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mr0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mr0_0)object).invokeSuspend(object2);
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
            Object object2 = ((dr0_0)object).a;
            object2.getClass();
            Object object3 = this.c;
            Intrinsics.checkNotNullParameter(object3, "storeId");
            Intrinsics.checkNotNullParameter(this.d, "screenName");
            lr2_2.Companion.getClass();
            Object object4 = lR2$a.a(n4 != 0);
            or0_1 or0_12 = new or0_1((xr0_2)object2, (String)object4, (String)object3, null);
            object2 = new br2_2(or0_12);
            object3 = ir0_2.a;
            object3 = em0_2.b;
            object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
            object3 = new nr0_0((es0_2)object2);
            object2 = bg1_1.a;
            object2 = ms0_1.m((es0_2)object3, (CoroutineContext)object2);
            object3 = new MR0$a(null, (dr0_0)object);
            object4 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new MR0$b((dr0_0)object);
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

