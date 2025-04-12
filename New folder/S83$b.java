/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class S83$b
extends Lambda
implements Function2 {
    public final /* synthetic */ S83 c;

    public S83$b(S83 s83) {
        this.c = s83;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (Set)object;
        object2 = (v83_0)object2;
        while (true) {
            int n3;
            Iterable iterable;
            Object object3;
            object2 = this.c;
            AtomicReference atomicReference = ((S83)object2).b;
            Object v4 = atomicReference.get();
            if (v4 == null) {
                object3 = object;
                object3 = (Collection)object;
            } else {
                int n4 = v4 instanceof Set;
                if (n4 != 0) {
                    n4 = 2;
                    object3 = new Set[n4];
                    iterable = null;
                    object3[0] = v4;
                    n3 = 1;
                    object3[n3] = object;
                    object3 = xx_2.i(object3);
                } else {
                    n4 = v4 instanceof List;
                    if (n4 == 0) break;
                    object3 = v4;
                    object3 = (Collection)v4;
                    iterable = a.b(object);
                    object3 = CollectionsKt.W(iterable, (Collection)object3);
                }
            }
            do {
                if ((n3 = atomicReference.compareAndSet(v4, object3)) == 0) continue;
                boolean bl2 = S83.a((S83)object2);
                if (bl2) {
                    object = new t83_0((S83)object2);
                    object2 = ((S83)object2).a;
                    object2.invoke(object);
                }
                return Unit.a;
            } while ((iterable = (Iterable)atomicReference.get()) == v4);
        }
        p30_0.d("Unexpected notification");
        throw null;
    }
}

