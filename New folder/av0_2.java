/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.network.api.DressToolApi;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Av0
 */
public final class av0_2 {
    public final DressToolApi a;

    public av0_2(DressToolApi dressToolApi) {
        Intrinsics.checkNotNullParameter(dressToolApi, "dressToolApi");
        this.a = dressToolApi;
    }

    public final Object a(String string2, String string3, HashMap hashMap, f80_0 f80_02) {
        return this.a.getOptions(string2, string3, hashMap, f80_02);
    }
}

