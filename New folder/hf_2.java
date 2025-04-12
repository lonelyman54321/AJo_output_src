/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HF
 */
public final class hf_2 {
    public static final Object a(gf_2 object, f80_0 object2) {
        Object object3;
        block6: {
            block8: {
                block7: {
                    int n3;
                    String string2 = "<this>";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object3 = object.f();
                    if (object3 != null) break block6;
                    int n4 = object instanceof if_1;
                    if (n4 != 0) {
                        object3 = object;
                        object3 = (if_1)object;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    if (object3 != null && (n4 = ((if_1)object3).b) == (n3 = 1)) break block7;
                    object3 = object.b();
                    Intrinsics.checkNotNullParameter(object3, string2);
                    object3.getClass();
                    long l2 = ((ee_2)object3).c;
                    n4 = (int)l2;
                    int n7 = 0x100000;
                    if (n4 < n7) break block8;
                }
                object = object.d((f80_0)object2);
                object2 = j90_0.COROUTINE_SUSPENDED;
                if (object == object2) {
                    return object;
                }
                return Unit.a;
            }
            return Unit.a;
        }
        throw object3;
    }
}

