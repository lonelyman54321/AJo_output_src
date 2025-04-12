/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from YR
 */
public final class yr_2 {
    public static final void a(fz2_1 object, Object object2) {
        Object object3 = object.j(object2);
        boolean bl2 = object3 instanceof VR$b;
        if (!bl2) {
            object3 = (Unit)object3;
            object = Unit.a;
        } else {
            bl2 = false;
            object3 = new zr_2((fz2_1)object, object2, null);
            object = ((vr_2)Ae3.e((CoroutineContext)f.a, (Function2)object3)).a;
        }
    }
}

