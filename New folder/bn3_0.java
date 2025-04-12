/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bn3
 */
public final class bn3_0 {
    public static final gh3_2 a;
    public static final ym3_0 b;
    public static final zm3_0 c;
    public static final an3_0 d;

    static {
        Object object = new gh3_2("NO_THREAD_ELEMENTS");
        a = object;
        b = object = new Object();
        c = object = new Object();
        d = object = new Object();
    }

    public static final void a(CoroutineContext object, Object object2) {
        Object object3 = a;
        if (object2 == object3) {
            return;
        }
        int n3 = object2 instanceof in3_0;
        if (n3 != 0) {
            object2 = (in3_0)object2;
            object = ((in3_0)object2).c;
            n3 = ((xm3_0[])object).length + -1;
            if (n3 >= 0) {
                while (true) {
                    int n4 = n3 + -1;
                    xm3_0 xm3_02 = object[n3];
                    Intrinsics.checkNotNull(xm3_02);
                    Object[] objectArray = ((in3_0)object2).b;
                    object3 = objectArray[n3];
                    xm3_02.P(object3);
                    if (n4 >= 0) {
                        n3 = n4;
                        continue;
                    }
                    break;
                }
            }
        } else {
            object3 = c;
            boolean bl2 = false;
            object = object.fold(null, (Function2)object3);
            object3 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>";
            Intrinsics.checkNotNull(object, (String)object3);
            object = (xm3_0)object;
            object.P(object2);
        }
    }

    public static final Object b(CoroutineContext object) {
        Integer n3 = 0;
        ym3_0 ym3_02 = b;
        object = object.fold(n3, ym3_02);
        Intrinsics.checkNotNull(object);
        return object;
    }

    public static final Object c(CoroutineContext object, Object object2) {
        if (object2 == null) {
            object2 = bn3_0.b((CoroutineContext)object);
        }
        boolean bl2 = false;
        Object object3 = 0;
        if (object2 == object3) {
            object = a;
        } else {
            bl2 = object2 instanceof Integer;
            if (bl2) {
                int n3 = ((Number)object2).intValue();
                object3 = new in3_0(n3, (CoroutineContext)object);
                object2 = d;
                object = object.fold(object3, (Function2)object2);
            } else {
                object3 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>";
                Intrinsics.checkNotNull(object2, (String)object3);
                object2 = (xm3_0)object2;
                object = object2.G0((CoroutineContext)object);
            }
        }
        return object;
    }
}

