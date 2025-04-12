/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from RB0
 */
public final class rb0_2 {
    public final a80_0 a;

    public rb0_2() {
        a80_0 a80_02;
        this.a = a80_02 = new a80_0();
    }

    public final void a(eb0_2 object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "definition");
        object = (ww1_2)this.a.a(object);
        Throwable throwable = null;
        if (object != null) {
            int n3;
            Object object3 = ((zw1_2)object).b();
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            object3 = (zw1_2)object3;
            Throwable throwable2 = null;
            while ((n3 = Intrinsics.areEqual(object3, object)) == 0) {
                block11: {
                    n3 = object3 instanceof rb0$a_1;
                    if (n3 != 0) {
                        Object object4 = object3;
                        object4 = (rb0$a_1)object3;
                        object4.getClass();
                        object4 = "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise, kotlin.Unit>";
                        Intrinsics.checkNotNull(null, (String)object4);
                        n3 = 1;
                        object4 = TypeIntrinsics.beforeCheckcastToFunctionOfArity(null, n3);
                        object4 = (Function1)object4;
                        try {
                            object4.invoke(object2);
                        }
                        catch (Throwable throwable3) {
                            if (throwable2 != null) {
                                yc0_2.a(throwable2, throwable3);
                                break block11;
                            }
                            throwable2 = throwable3;
                        }
                    }
                }
                object3 = xw1_2.a(((zw1_2)object3).b());
            }
            throwable = throwable2;
        }
        if (throwable == null) {
            return;
        }
        throw throwable;
    }
}

