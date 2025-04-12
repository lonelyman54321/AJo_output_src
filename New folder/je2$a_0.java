/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;

/*
 * Renamed from JE2$a
 */
public final class je2$a_0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Proxy.Type type2;
        int n7 = Proxy.Type.values().length;
        int[] nArray = new int[n7];
        try {
            type2 = Proxy.Type.DIRECT;
            n4 = type2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            type2 = Proxy.Type.HTTP;
            n4 = type2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

