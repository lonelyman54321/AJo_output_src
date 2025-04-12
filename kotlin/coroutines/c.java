/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.c$a;
import kotlin.coroutines.c$b;
import kotlin.coroutines.c$c;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class c
implements CoroutineContext,
Serializable {
    public final CoroutineContext a;
    public final CoroutineContext$Element b;

    public c(CoroutineContext coroutineContext, CoroutineContext$Element coroutineContext$Element) {
        Intrinsics.checkNotNullParameter(coroutineContext, "left");
        Intrinsics.checkNotNullParameter(coroutineContext$Element, "element");
        this.a = coroutineContext;
        this.b = coroutineContext$Element;
    }

    private final Object writeReplace() {
        int n3 = this.e();
        Object object = new CoroutineContext[n3];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Unit unit = Unit.a;
        c$c c$c = new c$c((CoroutineContext[])object, ref$IntRef);
        this.fold(unit, c$c);
        int n4 = ref$IntRef.element;
        if (n4 == n3) {
            c$a c$a = new c$a((CoroutineContext[])object);
            return c$a;
        }
        object = "Check failed.".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final int e() {
        int n3 = 2;
        CoroutineContext coroutineContext = this;
        while (true) {
            boolean bl2;
            if (!(bl2 = (coroutineContext = coroutineContext.a) instanceof c)) {
                coroutineContext = null;
            }
            if (coroutineContext == null) {
                return n3;
            }
            ++n3;
        }
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                block3: {
                    Object object2;
                    int n3;
                    if (this == object) break block4;
                    int n4 = object instanceof c;
                    bl2 = false;
                    if (n4 == 0 || (n4 = ((c)(object = (c)object)).e()) != (n3 = this.e())) break block5;
                    CoroutineContext coroutineContext = this;
                    do {
                        object2 = ((c)coroutineContext).b;
                        Object object3 = object2.getKey();
                        n3 = (int)(Intrinsics.areEqual(object3 = ((c)object).get((CoroutineContext$a)object3), object2) ? 1 : 0);
                        if (n3 != 0) continue;
                        bl3 = false;
                        object = null;
                        break block3;
                    } while ((n3 = (coroutineContext = ((c)coroutineContext).a) instanceof c) != 0);
                    Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    coroutineContext = (CoroutineContext$Element)coroutineContext;
                    object2 = coroutineContext.getKey();
                    object = ((c)object).get((CoroutineContext$a)object2);
                    bl3 = Intrinsics.areEqual(object, coroutineContext);
                }
                if (!bl3) break block5;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final Object fold(Object object, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "operation");
        object = this.a.fold(object, function2);
        CoroutineContext$Element coroutineContext$Element = this.b;
        return function2.invoke(object, coroutineContext$Element);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(coroutineContext$a, "key");
        CoroutineContext coroutineContext = this;
        do {
            CoroutineContext$Element coroutineContext$Element;
            if ((coroutineContext$Element = ((c)coroutineContext).b.get(coroutineContext$a)) == null) continue;
            return coroutineContext$Element;
        } while (bl2 = (coroutineContext = ((c)coroutineContext).a) instanceof c);
        return coroutineContext.get(coroutineContext$a);
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        return this.b.hashCode() + n3;
    }

    public final CoroutineContext minusKey(CoroutineContext$a object) {
        Intrinsics.checkNotNullParameter(object, "key");
        CoroutineContext coroutineContext = this.b;
        CoroutineContext coroutineContext2 = coroutineContext.get((CoroutineContext$a)object);
        CoroutineContext coroutineContext3 = this.a;
        if (coroutineContext2 != null) {
            return coroutineContext3;
        }
        if ((object = coroutineContext3.minusKey((CoroutineContext$a)object)) == coroutineContext3) {
            coroutineContext = this;
        } else {
            coroutineContext2 = f.a;
            if (object != coroutineContext2) {
                coroutineContext = coroutineContext2 = new c((CoroutineContext)object, (CoroutineContext$Element)coroutineContext);
            }
        }
        return coroutineContext;
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        Serializable serializable = f.a;
        if (coroutineContext == serializable) {
            coroutineContext = this;
        } else {
            serializable = e.c;
            coroutineContext = (CoroutineContext)coroutineContext.fold(this, (Function2)((Object)serializable));
        }
        return coroutineContext;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        c$b c$b = c$b.c;
        String string2 = (String)this.fold("", c$b);
        return ui0_1.a(stringBuilder, string2, ']');
    }
}

