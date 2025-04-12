/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.ImageView$ScaleType
 */
import android.widget.ImageView;

public final class RJ2$a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        Az2 az2;
        int n4;
        Object object2;
        int n7;
        Object object3;
        int n8;
        Object object4;
        int n10 = Az2.values().length;
        int[] nArray = new int[n10];
        b = nArray;
        int n14 = 1;
        try {
            object4 = Az2.LOW;
            n8 = object4.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 2;
        try {
            object4 = b;
            object3 = Az2.NORMAL;
            n7 = object3.ordinal();
            object4[n7] = (Az2)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 3;
        try {
            object3 = b;
            object2 = Az2.HIGH;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = (Az2)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 4;
        try {
            object2 = b;
            az2 = Az2.IMMEDIATE;
            n3 = az2.ordinal();
            object2[n3] = (Az2)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = ImageView.ScaleType.values().length;
        object2 = new int[n4];
        a = (int[])object2;
        try {
            az2 = ImageView.ScaleType.CENTER_CROP;
            n3 = az2.ordinal();
            object2[n3] = (Az2)n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = ImageView.ScaleType.CENTER_INSIDE;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = ImageView.ScaleType.FIT_CENTER;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = ImageView.ScaleType.FIT_START;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = ImageView.ScaleType.FIT_END;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = ImageView.ScaleType.FIT_XY;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = ImageView.ScaleType.CENTER;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = ImageView.ScaleType.MATRIX;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

