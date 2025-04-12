/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/*
 * Renamed from KJ1
 */
public final class kj1_0
implements Function {
    public final /* synthetic */ MaterialDynamicColors a;

    public /* synthetic */ kj1_0(MaterialDynamicColors materialDynamicColors) {
        this.a = materialDynamicColors;
    }

    public final Object apply(Object object) {
        MaterialDynamicColors materialDynamicColors = this.a;
        object = (DynamicScheme)object;
        return MaterialDynamicColors.x(materialDynamicColors, (DynamicScheme)object);
    }
}

