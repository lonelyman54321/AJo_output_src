/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.ResponseStatusType;

public final class Ob0$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ResponseStatusType responseStatusType;
        int n7 = ResponseStatusType.values().length;
        int[] nArray = new int[n7];
        try {
            responseStatusType = ResponseStatusType.API_SUCCESS;
            n4 = responseStatusType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            responseStatusType = ResponseStatusType.API_FAILURE;
            n4 = responseStatusType.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            responseStatusType = ResponseStatusType.API_EXCEPTION;
            n4 = responseStatusType.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            responseStatusType = ResponseStatusType.API_LOADING;
            n4 = responseStatusType.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

