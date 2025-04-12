/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from da1
 */
public final class da1_2
implements i90_0,
Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m;
    public final ma1_1 a;
    public final la1_2 b;
    public final boolean c;
    private volatile /* synthetic */ int closed;
    public final xl1_2 d;
    public final CoroutineContext e;
    public final ib1_2 f;
    public final nb1_2 g;
    public final rb1_2 h;
    public final xa1_2 i;
    public final e40_0 j;
    public final rb0_2 k;
    public final la1_2 l;

    static {
        m = AtomicIntegerFieldUpdater.newUpdater(da1_2.class, "closed");
    }

    public da1_2() {
        throw null;
    }

    public da1_2(ma1_1 object, la1_2 object2, boolean bl2) {
        Object object3;
        int n3;
        L l2;
        ca1_2 ca1_22 = null;
        Object object4 = "engine";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Object object5 = "userConfig";
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object2, (String)object5);
        this.a = object;
        this.b = object2;
        this.closed = 0;
        object4 = object.getCoroutineContext();
        object5 = i$a.a;
        object4 = (i)object4.get((CoroutineContext$a)object5);
        this.d = object5 = new xl1_2((i)object4);
        this.e = object4 = object.getCoroutineContext().plus((CoroutineContext)object5);
        this.f = object4 = new ib1_2();
        this.g = object4 = new nb1_2();
        this.h = object4 = new rb1_2();
        Object object6 = new xa1_2();
        this.i = object6;
        this.j = object6 = new e40_0();
        this.k = object6 = new rb0_2();
        this.l = object6 = new la1_2();
        boolean bl3 = this.c;
        if (bl3) {
            int n4 = 2;
            l2 = new L(this, n4);
            ((JobSupport)object5).G(l2);
        }
        object.N(this);
        object = rb1_2.j;
        bl3 = false;
        l2 = null;
        object5 = new ba1_2(this, null);
        ((hs2_2)object4).g((ks2_2)object, (gx0_2)object5);
        object = hb1_2.b;
        object4 = new ja1_2(0);
        ((la1_2)object6).a((za1_2)object, (Function1)object4);
        object = xy_2.c;
        object4 = new ja1_2(0);
        ((la1_2)object6).a((za1_2)object, (Function1)object4);
        object = ms0_2.c;
        object4 = new ja1_2(0);
        ((la1_2)object6).a((za1_2)object, (Function1)object4);
        boolean bl4 = ((la1_2)object2).f;
        object4 = "block";
        if (bl4) {
            n3 = 1;
            object = new sc_2(n3);
            object3 = "DefaultTransformers";
            Intrinsics.checkNotNullParameter(object3, "key");
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object5 = ((la1_2)object6).c;
            object5.put(object3, object);
        }
        object = pb1_2.c;
        object5 = new ja1_2(0);
        ((la1_2)object6).a((za1_2)object, (Function1)object5);
        object = W91.b;
        object5 = new ja1_2(0);
        ((la1_2)object6).a((za1_2)object, (Function1)object5);
        n3 = (int)(((la1_2)object2).e ? 1 : 0);
        if (n3 != 0) {
            object5 = za1_1.d;
            object3 = new ja1_2(0);
            ((la1_2)object6).a((za1_2)object5, (Function1)object3);
        }
        ((la1_2)object6).b((la1_2)object2);
        boolean bl5 = ((la1_2)object2).f;
        if (bl5) {
            object2 = va1_0.b;
            object5 = new ja1_2(0);
            ((la1_2)object6).a((za1_2)object2, (Function1)object5);
        }
        object2 = rm0_2.a;
        object2 = "<this>";
        Intrinsics.checkNotNullParameter(object6, (String)object2);
        object5 = new pm0_1(object6, 0);
        Intrinsics.checkNotNullParameter(object6, (String)object2);
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        ((la1_2)object6).a((za1_2)object, (Function1)object5);
        Intrinsics.checkNotNullParameter(this, "client");
        object = ((Iterable)((la1_2)object6).a.values()).iterator();
        while (bl5 = object.hasNext()) {
            object2 = (Function1)object.next();
            object2.invoke(this);
        }
        object = ((Iterable)((la1_2)object6).c.values()).iterator();
        while (bl5 = object.hasNext()) {
            object2 = (Function1)object.next();
            object2.invoke(this);
        }
        object = this.g;
        object2 = nb1_2.f;
        ca1_22 = new ca1_2(this, null);
        ((hs2_2)object).g((ks2_2)object2, ca1_22);
        this.c = bl2;
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(db1_2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof da1$a_1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (da1$a_1)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new da1$a_1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = ch3_0.a;
            this.k.a((eb0_2)var2_2, var1_1);
            var2_2 = var1_1.d;
            var4_4.c = var7_7;
            var9_9 = this.f;
            var2_2 = var9_9.a(var1_1, var2_2, var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        Intrinsics.checkNotNull(var2_2, "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall");
        return (ea1_2)var2_2;
    }

    public final void close() {
        Object object = m;
        boolean bl2 = false;
        Object object2 = null;
        boolean bl3 = ((AtomicIntegerFieldUpdater)object).compareAndSet(this, 0, 1);
        if (!bl3) {
            return;
        }
        Object object3 = aa1_1.a;
        object3 = (yq_1)this.j.g((xq_2)object3);
        object = ((Iterable)object3.e()).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (xq_2)object.next();
            String string2 = "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>";
            Intrinsics.checkNotNull(object2, string2);
            boolean bl4 = (object2 = object3.g((xq_2)object2)) instanceof AutoCloseable;
            if (!bl4) continue;
            object2 = (AutoCloseable)object2;
            object2.close();
        }
        object3 = this.d;
        ((xl1_2)object3).a();
        bl3 = this.c;
        if (bl3) {
            object3 = this.a;
            object3.close();
        }
    }

    public final CoroutineContext getCoroutineContext() {
        return this.e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpClient[");
        ma1_1 ma1_12 = this.a;
        stringBuilder.append(ma1_12);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

