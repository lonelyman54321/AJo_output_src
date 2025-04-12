/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from ly0
 */
public final class ly0_0 {
    public static final Dr0 a;

    static {
        Dr0 dr0;
        a = dr0 = new Dr0();
    }

    public static final void a(Object object, Object object2, Function1 function1, b30_0 b30_02) {
        boolean bl2 = b30_02.J(object);
        boolean bl3 = b30_02.J(object2);
        object2 = b30_02.v();
        if ((bl2 |= bl3) || object2 == (object = b30$a.a)) {
            object2 = new br0_0(function1);
            b30_02.o(object2);
        }
        object2 = (br0_0)object2;
    }

    public static final void b(Object object, Function1 function1, b30_0 b30_02) {
        boolean bl2 = b30_02.J(object);
        Object object2 = b30_02.v();
        if (bl2 || object2 == (object = b30$a.a)) {
            object2 = new br0_0(function1);
            b30_02.o(object2);
        }
        object2 = (br0_0)object2;
    }

    public static final void c(Object[] object, Function1 function1, b30_0 b30_02) {
        b30$a$a b30$a$a;
        int n3 = ((Object[])object).length;
        object = Arrays.copyOf(object, n3);
        n3 = ((Object[])object).length;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            boolean bl3 = b30_02.J(object2);
            bl2 |= bl3;
        }
        object = b30_02.v();
        if (bl2 || object == (b30$a$a = b30$a.a)) {
            object = new br0_0(function1);
            b30_02.o(object);
        }
    }

    public static final void d(b30_0 b30_02, Object object, Function2 function2) {
        CoroutineContext coroutineContext = b30_02.l();
        boolean bl2 = b30_02.J(object);
        Object object2 = b30_02.v();
        if (bl2 || object2 == (object = b30$a.a)) {
            object2 = new op1_0(coroutineContext, function2);
            b30_02.o(object2);
        }
        object2 = (op1_0)object2;
    }

    public static final void e(Object object, Object object2, Function2 function2, b30_0 b30_02) {
        CoroutineContext coroutineContext = b30_02.l();
        boolean bl2 = b30_02.J(object);
        boolean bl3 = b30_02.J(object2);
        object2 = b30_02.v();
        if ((bl2 |= bl3) || object2 == (object = b30$a.a)) {
            object2 = new op1_0(coroutineContext, function2);
            b30_02.o(object2);
        }
        object2 = (op1_0)object2;
    }

    public static final c80 f(CoroutineContext object, b30_0 object2) {
        Object object3 = i$a.a;
        CoroutineContext$Element coroutineContext$Element = object.get((CoroutineContext$a)object3);
        if (coroutineContext$Element != null) {
            object = mm0.a();
            object3 = "CoroutineContext supplied to rememberCoroutineScope may not include a parent job";
            object2 = new IllegalArgumentException((String)object3);
            ((xl1_2)object).c((Throwable)object2);
            object = d.a((CoroutineContext)object);
        } else {
            object2 = object2.l();
            object3 = (i)object2.get((CoroutineContext$a)object3);
            coroutineContext$Element = new xl1_2((i)object3);
            object2 = object2.plus(coroutineContext$Element);
            object = d.a(object2.plus((CoroutineContext)object));
        }
        return object;
    }
}

