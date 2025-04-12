/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookRequestError$a;

public final class sI0$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        FacebookRequestError$a facebookRequestError$a;
        int n7 = FacebookRequestError$a.values().length;
        int[] nArray = new int[n7];
        try {
            facebookRequestError$a = FacebookRequestError$a.OTHER;
            n4 = facebookRequestError$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            facebookRequestError$a = FacebookRequestError$a.LOGIN_RECOVERABLE;
            n4 = facebookRequestError$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            facebookRequestError$a = FacebookRequestError$a.TRANSIENT;
            n4 = facebookRequestError$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

