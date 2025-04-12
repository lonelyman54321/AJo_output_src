/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from y90
 */
public final class y90_0
implements Function2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ y90_0(Ref$ObjectRef ref$ObjectRef, boolean bl2) {
        this.a = ref$ObjectRef;
        this.b = bl2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (CoroutineContext)object;
        boolean bl2 = (object2 = (CoroutineContext$Element)object2) instanceof c80_0;
        if (!bl2) {
            object = object.plus((CoroutineContext)object2);
        } else {
            Ref$ObjectRef ref$ObjectRef = this.a;
            CoroutineContext coroutineContext = (CoroutineContext)ref$ObjectRef.element;
            CoroutineContext$a coroutineContext$a = ((CoroutineContext$Element)object2).getKey();
            if ((coroutineContext = coroutineContext.get(coroutineContext$a)) == null) {
                bl2 = this.b;
                object2 = (c80_0)object2;
                if (bl2) {
                    object2 = object2.I();
                }
                object = object.plus((CoroutineContext)object2);
            } else {
                coroutineContext = (CoroutineContext)ref$ObjectRef.element;
                coroutineContext$a = ((CoroutineContext$Element)object2).getKey();
                coroutineContext = coroutineContext.minusKey(coroutineContext$a);
                ref$ObjectRef.element = coroutineContext;
                object2 = ((c80_0)object2).W();
                object = object.plus((CoroutineContext)object2);
            }
        }
        return object;
    }
}

