/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.H;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FP0
 */
public final class fp0_1
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ Function0 c;

    public fp0_1(Fragment fragment, Function0 function0, f80_0 f80_02) {
        this.b = fragment;
        this.c = function0;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Fragment fragment = this.b;
        Function0 function0 = this.c;
        object = new fp0_1(fragment, function0, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fp0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fp0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block3: {
            Object object2;
            boolean bl2;
            d21_0 d21_02;
            i$b i$b;
            i i3;
            int n3;
            j90_0 j90_02;
            block4: {
                block5: {
                    int n4;
                    block1: {
                        block2: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            n4 = this.a;
                            n3 = 1;
                            if (n4 == 0) break block1;
                            if (n4 != n3) break block2;
                            vl2_2.b(object);
                            break block3;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    i3 = this.b.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(i3, "<get-lifecycle>(...)");
                    i$b = i$b.STARTED;
                    object = ir0_2.a;
                    d21_02 = bg1_1.a.N0();
                    object = this.getContext();
                    bl2 = d21_02.L0((CoroutineContext)object);
                    object = this.c;
                    if (bl2) break block4;
                    i$b i$b2 = i3.b();
                    if (i$b2 == (object2 = i$b.DESTROYED)) break block5;
                    i$b2 = i3.b();
                    n4 = i$b2.compareTo(i$b);
                    if (n4 < 0) break block4;
                    object.invoke();
                    break block3;
                }
                object = new LifecycleDestroyedException();
                throw object;
            }
            object2 = new FP0$a((Function0)object);
            this.a = n3;
            object = H.a(i3, i$b, bl2, d21_02, object2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

