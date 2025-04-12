/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/*
 * Renamed from NH1
 */
public final class nh1_0
implements Function {
    public final /* synthetic */ MaterialDynamicColors a;

    public /* synthetic */ nh1_0(MaterialDynamicColors materialDynamicColors) {
        this.a = materialDynamicColors;
    }

    public final Object apply(Object object) {
        MaterialDynamicColors materialDynamicColors = this.a;
        object = (DynamicScheme)object;
        return MaterialDynamicColors.A1(materialDynamicColors, (DynamicScheme)object);
    }
}

