/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.n$f;

/*
 * Renamed from oy2
 */
public final class oy2_0 {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        n$f n$f;
        int n7 = n$f.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            n$f = n$f.NEW_MUTABLE_INSTANCE;
            n4 = n$f.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            n$f = n$f.NEW_BUILDER;
            n4 = n$f.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            n$f = n$f.BUILD_MESSAGE_INFO;
            n4 = n$f.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            n$f = n$f.GET_DEFAULT_INSTANCE;
            n4 = n$f.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            n$f = n$f.GET_PARSER;
            n4 = n$f.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            n$f = n$f.GET_MEMOIZED_IS_INITIALIZED;
            n4 = n$f.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            n$f = n$f.SET_MEMOIZED_IS_INITIALIZED;
            n4 = n$f.ordinal();
            nArray[n4] = n3 = 7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

