/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Rm0
 */
public final class rm0_2 {
    public static final xq_2 a;
    public static final ux1_2 b;

    static {
        Object object = Unit.class;
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(object);
        try {
            object = Reflection.typeOf(object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        at3_0 at3_02 = new at3_0(yn1_22, (kn1_1)object);
        a = object = new xq_2("ValidateMark", at3_02);
        b = Q93.a("io.ktor.client.plugins.DefaultResponseValidation");
    }
}

