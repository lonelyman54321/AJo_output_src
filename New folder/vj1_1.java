/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/*
 * Renamed from VJ1
 */
public final class vj1_1
implements Function {
    public final /* synthetic */ MaterialDynamicColors a;

    public /* synthetic */ vj1_1(MaterialDynamicColors materialDynamicColors) {
        this.a = materialDynamicColors;
    }

    public final Object apply(Object object) {
        MaterialDynamicColors materialDynamicColors = this.a;
        object = (DynamicScheme)object;
        return MaterialDynamicColors.h(materialDynamicColors, (DynamicScheme)object);
    }
}

