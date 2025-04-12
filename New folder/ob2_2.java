/*
 * Decompiled with CFR 0.152.
 */
import javax.inject.Provider;

/*
 * Renamed from OB2
 */
public final class ob2_2 {
    public static nb2_2 a(Provider provider) {
        provider.getClass();
        boolean bl2 = provider instanceof nb2_2;
        if (bl2) {
            return (nb2_2)provider;
        }
        OB2$a oB2$a = new OB2$a(provider);
        return oB2$a;
    }
}

