/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class lE$d
extends FunctionReferenceImpl
implements gx0_2 {
    public static final lE$d a;

    static {
        lE$d lE$d;
        a = lE$d = new FunctionReferenceImpl(3, le_2.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (le_2)object;
        object2 = le_2.d;
        object.getClass();
        object2 = pe_2.l;
        if (object3 == object2) {
            object = ((le_2)object).u();
            object3 = new VR$a((Throwable)object);
        }
        object = new vr_2(object3);
        return object;
    }
}

