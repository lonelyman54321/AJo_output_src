/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from uE3
 */
public abstract class ue3_0
extends Kr3 {
    public static final String[] a = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int b(Or3 object, int n3) {
        int n4 = -1;
        if (object == null) {
            return n4;
        }
        object = ((Or3)object).a;
        String string2 = "android:visibilityPropagation:center";
        if ((object = (Object)((int[])((HashMap)object).get(string2))) == null) {
            return n4;
        }
        return (int)object[n3];
    }
}

