/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/*
 * Renamed from Hw0
 */
public final class hw0_1
implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                MaterialDynamicColors materialDynamicColors = (MaterialDynamicColors)this.b;
                object = (DynamicScheme)object;
                return MaterialDynamicColors.J(materialDynamicColors, (DynamicScheme)object);
            }
            case 0: 
        }
        Hct hct = (Hct)this.b;
        object = (DynamicScheme)object;
        return DynamicColor.a(hct, (DynamicScheme)object);
    }
}

