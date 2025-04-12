/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/*
 * Renamed from cK1
 */
public final class ck1_1
implements Function {
    public final /* synthetic */ MaterialDynamicColors a;

    public /* synthetic */ ck1_1(MaterialDynamicColors materialDynamicColors) {
        this.a = materialDynamicColors;
    }

    public final Object apply(Object object) {
        MaterialDynamicColors materialDynamicColors = this.a;
        object = (DynamicScheme)object;
        return MaterialDynamicColors.A0(materialDynamicColors, (DynamicScheme)object);
    }
}

