/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from ms0
 */
public final class ms0_2 {
    public static final xq_2 a;
    public static final xq_2 b;
    public static final nv_2 c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Object object2 = Unit.class;
        Object object3 = Reflection.getOrCreateKotlinClass(object2);
        kn1_1 kn1_12 = null;
        try {
            object = Reflection.typeOf(object2);
        }
        catch (Throwable throwable) {
            object = null;
        }
        at3_0 at3_02 = new at3_0((yn1_2)object3, (kn1_1)object);
        object = "SkipSaveBody";
        a = object3 = new xq_2((String)object, at3_02);
        object3 = Reflection.getOrCreateKotlinClass(object2);
        try {
            kn1_12 = Reflection.typeOf(object2);
        }
        catch (Throwable throwable) {}
        object2 = new at3_0((yn1_2)object3, kn1_12);
        b = object3 = new xq_2("ResponseBodySaved", (at3_0)object2);
        object2 = ms0$a.a;
        object3 = new Object();
        c = td0_2.a("DoubleReceivePlugin", (Function0)object2, (Function1)object3);
    }
}

