/*
 * Decompiled with CFR 0.152.
 */
import androidx.constraintlayout.widget.a$a;

public final class Qf0$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        a$a a$a;
        int n7 = a$a.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            a$a = a$a.INT_TYPE;
            n4 = a$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            a$a = a$a.FLOAT_TYPE;
            n4 = a$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            a$a = a$a.COLOR_DRAWABLE_TYPE;
            n4 = a$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            a$a = a$a.COLOR_TYPE;
            n4 = a$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            a$a = a$a.STRING_TYPE;
            n4 = a$a.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            a$a = a$a.BOOLEAN_TYPE;
            n4 = a$a.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            a$a = a$a.DIMENSION_TYPE;
            n4 = a$a.ordinal();
            nArray[n4] = n3 = 7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

