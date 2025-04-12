/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.common.collect.ImmutableTable$Builder;
import java.util.function.Function;

/*
 * Renamed from FJ1
 */
public final class fj1_0
implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ fj1_0(int n3) {
        this.a = n3;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                return ((ImmutableTable$Builder)object).build();
            }
            case 0: 
        }
        return MaterialDynamicColors.c0((DynamicScheme)object);
    }
}

