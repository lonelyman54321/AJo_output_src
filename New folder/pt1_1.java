/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pt1
 */
public final class pt1_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ CoroutineContext b;
    public final /* synthetic */ lt1 c;

    public pt1_1(CoroutineContext coroutineContext, lt1 lt12, f80_0 f80_02) {
        this.b = coroutineContext;
        this.c = lt12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CoroutineContext coroutineContext = this.b;
        lt1 lt12 = this.c;
        object = new pt1_1(coroutineContext, lt12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pt1_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pt1_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7 && n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = f.a;
            CoroutineContext coroutineContext = this.b;
            boolean bl2 = Intrinsics.areEqual(coroutineContext, object);
            lt1 lt12 = this.c;
            if (bl2) {
                this.a = n7;
                object = lt12.a(this);
                if (object == j90_02) {
                    return j90_02;
                }
            } else {
                n7 = 0;
                object = new pt1$a(lt12, null);
                this.a = n4;
                if ((object = Ae3.g(this, coroutineContext, (Function2)object)) == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

