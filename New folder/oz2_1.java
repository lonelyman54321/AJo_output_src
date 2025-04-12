/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from OZ2
 */
public final class oz2_1
implements Function1 {
    public final /* synthetic */ pz2_1 a;

    public /* synthetic */ oz2_1(pz2_1 pz2_12) {
        this.a = pz2_12;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        StringBuilder stringBuilder = new StringBuilder();
        pz2_1 pz2_12 = this.a;
        String string2 = pz2_12.f[n3];
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        object = pz2_12.g[n3].h();
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

