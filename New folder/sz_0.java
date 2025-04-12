/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.LayoutWeightElement;
import kotlin.ranges.f;

/*
 * Renamed from sZ
 */
public final class sz_0
implements rZ {
    public static final sz_0 a;

    static {
        sz_0 sz_02;
        a = sz_02 = new Object();
    }

    public final LP1 a(LP1 object, float f5, boolean bl2) {
        double d2 = f5;
        double d5 = 0.0;
        double d7 = d2 - d5;
        Object object2 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object2 > 0) {
            f5 = f.c(f5, Float.MAX_VALUE);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f5, bl2);
            return object.then(layoutWeightElement);
        }
        object = g9_0.a(f5, "invalid weight ", "; must be greater than zero");
        object = object.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        throw illegalArgumentException;
    }
}

