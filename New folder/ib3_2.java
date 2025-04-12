/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ib3
 */
public final class ib3_2 {
    public static final /* synthetic */ int a;

    static {
        Object object = new Exception();
        Object object2 = VJ3.class.getSimpleName();
        object = ((Throwable)object).getStackTrace()[0];
        object2 = "_COROUTINE.".concat((String)object2);
        String string2 = ((StackTraceElement)object).getFileName();
        int n3 = ((StackTraceElement)object).getLineNumber();
        String string3 = "_";
        StackTraceElement stackTraceElement = new StackTraceElement((String)object2, string3, string2, n3);
        object = tl2_2.b;
        object = xv_1.class;
        try {
            object = ((Class)object).getCanonicalName();
        }
        catch (Throwable throwable) {
            object2 = tl2_2.b;
            object = vl2_2.a(throwable);
        }
        object2 = tl2_2.a(object);
        if (object2 != null) {
            object = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        object = (String)object;
        object = ib3_2.class;
        try {
            object = ((Class)object).getCanonicalName();
        }
        catch (Throwable throwable) {
            object2 = tl2_2.b;
            object = vl2_2.a(throwable);
        }
        object2 = tl2_2.a(object);
        if (object2 != null) {
            object = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        object = (String)object;
    }
}

