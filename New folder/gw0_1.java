/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/*
 * Renamed from Gw0
 */
public final class gw0_1
implements Function {
    public final /* synthetic */ TonalPalette a;

    public /* synthetic */ gw0_1(TonalPalette tonalPalette) {
        this.a = tonalPalette;
    }

    public final Object apply(Object object) {
        TonalPalette tonalPalette = this.a;
        object = (DynamicScheme)object;
        return DynamicColor.b(tonalPalette, (DynamicScheme)object);
    }
}

