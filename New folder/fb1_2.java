/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;

/*
 * Renamed from fb1
 */
public final class fb1_2 {
    public static final /* synthetic */ int a;

    static {
        boolean bl2;
        Object object = fl2_2.class;
        Object object2 = Reflection.getOrCreateKotlinClass(object);
        try {
            object = Reflection.typeOf(object);
        }
        catch (Throwable throwable) {
            bl2 = false;
            object = null;
        }
        at3_0 at3_02 = new at3_0((yn1_2)object2, (kn1_1)object);
        object2 = "ResponseAdapterAttributeKey";
        Intrinsics.checkNotNullParameter(object2, "name");
        object = "type";
        Intrinsics.checkNotNullParameter(at3_02, (String)object);
        bl2 = b.k((CharSequence)object2) ^ true;
        if (bl2) {
            return;
        }
        object2 = "Name can't be blank".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

