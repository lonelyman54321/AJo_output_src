/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Xy
 */
public final class xy_2 {
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
        Object object2 = qb2_2.class;
        Object object3 = Reflection.getOrCreateKotlinClass(object2);
        Object object4 = null;
        try {
            object = Reflection.typeOf(object2);
        }
        catch (Throwable throwable) {
            object = null;
        }
        at3_0 at3_02 = new at3_0((yn1_2)object3, (kn1_1)object);
        object = "UploadProgressListenerAttributeKey";
        a = object3 = new xq_2((String)object, at3_02);
        object3 = Reflection.getOrCreateKotlinClass(object2);
        try {
            object4 = Reflection.typeOf(object2);
        }
        catch (Throwable throwable) {}
        object2 = new at3_0((yn1_2)object3, (kn1_1)object4);
        b = object3 = new xq_2("DownloadProgressListenerAttributeKey", (at3_0)object2);
        object2 = new Object();
        object4 = "BodyProgress";
        Intrinsics.checkNotNullParameter(object4, "name");
        Intrinsics.checkNotNullParameter(object2, "body");
        object3 = new Object();
        c = td0_2.a((String)object4, (Function0)object3, (Function1)object2);
    }
}

