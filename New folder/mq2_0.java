/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import kotlin.ranges.f;

/*
 * Renamed from mQ2
 */
public final class mq2_0
implements lQ2 {
    public static final mq2_0 a;

    static {
        mq2_0 mq2_02;
        a = mq2_02 = new Object();
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

    public final LP1 b(LP1 lP1, Gx$b gx$b) {
        VerticalAlignElement verticalAlignElement = new VerticalAlignElement(gx$b);
        return lP1.then(verticalAlignElement);
    }
}

