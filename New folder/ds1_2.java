/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from dS1
 */
public final class ds1_2
extends qg3_2
implements Function2 {
    public hs1_2 a;
    public Object b;
    public gS1 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ aS1 f;
    public final /* synthetic */ gS1 g;
    public final /* synthetic */ Function1 h;

    public ds1_2(aS1 aS12, gS1 gS12, Function1 function1, f80_0 f80_02) {
        this.f = aS12;
        this.g = gS12;
        this.h = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        gS1 gS12 = this.g;
        Function1 function1 = this.h;
        aS1 aS12 = this.f;
        ds1_2 ds1_22 = new ds1_2(aS12, gS12, function1, f80_02);
        ds1_22.e = object;
        return ds1_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ds1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ds1_2)object).invokeSuspend(object2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        Object object4;
        int n3;
        Object object5;
        block17: {
            Object object6;
            block16: {
                Object object7;
                object5 = j90_0.COROUTINE_SUSPENDED;
                int n4 = this.d;
                int n7 = 2;
                n3 = 1;
                if (n4 != 0) {
                    if (n4 != n3) {
                        if (n4 != n7) {
                            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw object;
                        }
                        object5 = (gS1)this.b;
                        object4 = this.a;
                        object3 = (gS1$a)this.e;
                        try {
                            vl2_2.b(object);
                            break block16;
                        }
                        catch (Throwable throwable) {
                            break block17;
                        }
                    }
                    object4 = this.c;
                    object2 = (Function1)this.b;
                    object7 = this.a;
                    object6 = (gS1$a)this.e;
                    vl2_2.b(object);
                    object = object4;
                } else {
                    vl2_2.b(object);
                    object = (i90_0)this.e;
                    object = object.getCoroutineContext();
                    object7 = i$a.a;
                    object = object.get((CoroutineContext$a)object7);
                    Intrinsics.checkNotNull(object);
                    object = (i)object;
                    object7 = this.f;
                    object4 = new gS1$a((aS1)((Object)object7), (i)object);
                    object = this.g;
                    gS1.a((gS1)object, (gS1$a)object4);
                    this.e = object4;
                    object7 = ((gS1)object).b;
                    this.a = object7;
                    this.b = object6 = this.h;
                    this.c = object;
                    this.d = n3;
                    object2 = ((ks1_1)object7).d(this, null);
                    if (object2 == object5) {
                        return object5;
                    }
                    object2 = object6;
                    object6 = object4;
                }
                object4 = object7;
                this.e = object6;
                this.a = object7;
                this.b = object;
                this.c = null;
                this.d = n7;
                object3 = object2.invoke(this);
                if (object3 == object5) {
                    return object5;
                }
                object5 = object;
                object = object3;
                object3 = object6;
            }
            object5 = ((gS1)object5).a;
            while ((n3 = (int)(((AtomicReference)object5).compareAndSet(object3, null) ? 1 : 0)) == 0 && (object2 = ((AtomicReference)object5).get()) == object3) {
            }
            object4.b(null);
            return object;
            catch (Throwable throwable) {
                object3 = object6;
                Throwable throwable2 = throwable;
                object5 = object;
                object = throwable2;
            }
        }
        try {
            object5 = ((gS1)object5).a;
            while ((n3 = (int)(((AtomicReference)object5).compareAndSet(object3, null) ? 1 : 0)) == 0 && (object2 = ((AtomicReference)object5).get()) == object3) {
            }
        }
        catch (Throwable throwable) {
            object4.b(null);
            throw throwable;
        }
        throw object;
    }
}

