/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.TemperatureCache;
import java.util.function.Function;

/*
 * Renamed from pj3
 */
public final class pj3_0
implements Function {
    public final /* synthetic */ TemperatureCache a;

    public /* synthetic */ pj3_0(TemperatureCache temperatureCache) {
        this.a = temperatureCache;
    }

    public final Object apply(Object object) {
        TemperatureCache temperatureCache = this.a;
        object = (Hct)object;
        return TemperatureCache.a(temperatureCache, (Hct)object);
    }
}

