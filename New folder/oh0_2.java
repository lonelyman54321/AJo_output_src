/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OH0
 */
public final class oh0_2 {
    public static final List a;

    static {
        po1_2[] po1_2Array;
        String string2;
        int n3;
        Iterator iterator;
        try {
            iterator = new Iterator();
            n3 = 1;
        }
        catch (Throwable throwable) {
            string2 = throwable.getMessage();
            po1_2Array = new ServiceConfigurationError(string2, throwable);
            throw po1_2Array;
        }
        po1_2Array = new po1_2[n3];
        string2 = null;
        po1_2Array[0] = iterator;
        iterator = Arrays.asList(po1_2Array);
        iterator = iterator.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator, "iterator(...)");
        a = kz2_1.l(ez2_1.b(iterator));
    }
}

