/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.e;

/*
 * Renamed from A90
 */
public final class a90_0 {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext object, boolean bl2) {
        Object object2 = Boolean.FALSE;
        Object object3 = new Object();
        object3 = (Boolean)coroutineContext.fold(object2, (Function2)object3);
        boolean bl3 = (Boolean)object3;
        Function2 function2 = new Object();
        object2 = (Boolean)object.fold(object2, function2);
        boolean bl4 = (Boolean)object2;
        if (!bl3 && !bl4) {
            return coroutineContext.plus((CoroutineContext)object);
        }
        object3 = new Ref$ObjectRef();
        ((Ref$ObjectRef)object3).element = object;
        object = f.a;
        function2 = new y90_0((Ref$ObjectRef)object3, bl2);
        coroutineContext = (CoroutineContext)coroutineContext.fold(object, function2);
        if (bl4) {
            CoroutineContext coroutineContext2 = (CoroutineContext)((Ref$ObjectRef)object3).element;
            object2 = new Object();
            ((Ref$ObjectRef)object3).element = object = coroutineContext2.fold(object, (Function2)object2);
        }
        object = (CoroutineContext)((Ref$ObjectRef)object3).element;
        return coroutineContext.plus((CoroutineContext)object);
    }

    public static final CoroutineContext b(i90_0 object, CoroutineContext coroutineContext) {
        object = object.getCoroutineContext();
        boolean bl2 = true;
        if ((object = a90_0.a((CoroutineContext)object, coroutineContext, bl2)) != (coroutineContext = ir0_2.a)) {
            Object object2 = d.n0;
            if ((object2 = object.get((CoroutineContext$a)object2)) == null) {
                object = object.plus(coroutineContext);
            }
        }
        return object;
    }

    public static final mv3_0 c(f80_0 object, CoroutineContext coroutineContext, Object object2) {
        boolean bl2 = object instanceof k90_0;
        Object object3 = null;
        if (!bl2) {
            return null;
        }
        CoroutineContext$Element coroutineContext$Element = ov3_0.a;
        if ((coroutineContext$Element = coroutineContext.get((CoroutineContext$a)((Object)coroutineContext$Element))) != null) {
            object = (k90_0)object;
            while (!(bl2 = object instanceof e) && (object = object.getCallerFrame()) != null) {
                bl2 = object instanceof mv3_0;
                if (!bl2) continue;
                object3 = object;
                object3 = (mv3_0)object;
                break;
            }
            if (object3 != null) {
                ((mv3_0)object3).J0(coroutineContext, object2);
            }
        }
        return object3;
    }
}

