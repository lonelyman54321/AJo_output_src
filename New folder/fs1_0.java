/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from fS1
 */
public final class fs1_0
extends qg3_2
implements Function2 {
    public hs1_2 a;
    public Object b;
    public Object c;
    public gS1 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ aS1 g;
    public final /* synthetic */ gS1 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Object j;

    public fs1_0(aS1 aS12, gS1 gS12, Xm0$a$a xm0$a$a, Object object, f80_0 f80_02) {
        this.g = aS12;
        this.h = gS12;
        this.i = xm0$a$a;
        this.j = object;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        fs1_0 fs1_02;
        Function2 function2;
        gS1 gS12 = this.h;
        Function2 function22 = function2 = this.i;
        function22 = (Xm0$a$a)function2;
        aS1 aS12 = this.g;
        Object object2 = this.j;
        function2 = fs1_02;
        fs1_02 = new fs1_0(aS12, gS12, (Xm0$a$a)function22, object2, f80_02);
        fs1_02.f = object;
        return fs1_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fs1_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fs1_0)object).invokeSuspend(object2);
    }

    /*
     * Loose catch block
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3;
        Object object4;
        int n3;
        Object object5;
        block27: {
            Object object6;
            block26: {
                Object object7;
                Object object8;
                object5 = j90_0.COROUTINE_SUSPENDED;
                int n4 = this.e;
                int n7 = 2;
                n3 = 1;
                if (n4 != 0) {
                    if (n4 != n3) {
                        if (n4 == n7) {
                            object5 = (gS1)this.b;
                            object4 = this.a;
                            object3 = (gS1$a)this.f;
                            try {
                                vl2_2.b(object);
                                break block26;
                            }
                            catch (Throwable throwable) {
                                break block27;
                            }
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object4 = this.d;
                    object2 = this.c;
                    object8 = (Function2)this.b;
                    object7 = this.a;
                    object6 = (gS1$a)this.f;
                    vl2_2.b(object);
                    object = object4;
                    object4 = object7;
                } else {
                    vl2_2.b(object);
                    object = (i90_0)this.f;
                    object = object.getCoroutineContext();
                    object8 = i$a.a;
                    object = object.get((CoroutineContext$a)object8);
                    Intrinsics.checkNotNull(object);
                    object = (i)object;
                    object8 = this.g;
                    object4 = new gS1$a((aS1)((Object)object8), (i)object);
                    object = this.h;
                    gS1.a((gS1)object, (gS1$a)object4);
                    this.f = object4;
                    object8 = ((gS1)object).b;
                    this.a = object8;
                    this.b = object7 = this.i;
                    this.c = object6 = this.j;
                    this.d = object;
                    this.e = n3;
                    object2 = ((ks1_1)object8).d(this, null);
                    if (object2 == object5) {
                        return object5;
                    }
                    object2 = object6;
                    object6 = object4;
                    object4 = object8;
                    object8 = object7;
                }
                this.f = object6;
                this.a = object4;
                this.b = object;
                this.c = null;
                this.d = null;
                this.e = n7;
                object3 = object8.invoke(object2, this);
                if (object3 == object5) {
                    return object5;
                }
                object5 = object;
                object = object3;
                object3 = object6;
            }
            object5 = ((gS1)object5).a;
            while (true) {
                n3 = (int)(((AtomicReference)object5).compareAndSet(object3, null) ? 1 : 0);
                if (n3 != 0) break;
                if ((object2 = ((AtomicReference)object5).get()) == object3) continue;
                break;
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
        object5 = ((gS1)object5).a;
        while (true) {
            n3 = (int)(((AtomicReference)object5).compareAndSet(object3, null) ? 1 : 0);
            if (n3 != 0) break;
            object2 = ((AtomicReference)object5).get();
            if (object2 == object3) continue;
            break;
        }
        try {
            throw object;
        }
        catch (Throwable throwable) {
            object4.b(null);
            throw throwable;
        }
    }
}

