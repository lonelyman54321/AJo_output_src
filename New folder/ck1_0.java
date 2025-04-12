/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/*
 * Renamed from CK1
 */
public final class ck1_0
implements Function {
    public final /* synthetic */ MaterialDynamicColors a;

    public /* synthetic */ ck1_0(MaterialDynamicColors materialDynamicColors) {
        this.a = materialDynamicColors;
    }

    public final Object apply(Object object) {
        MaterialDynamicColors materialDynamicColors = this.a;
        object = (DynamicScheme)object;
        return materialDynamicColors.highestSurface((DynamicScheme)object);
    }
}

