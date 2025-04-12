/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.Spanned
 */
import android.os.Bundle;
import android.text.Spanned;

public final class Pf0 {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
        int n3 = 36;
        a = Integer.toString(0, n3);
        b = Integer.toString(1, n3);
        c = Integer.toString(2, n3);
        d = Integer.toString(3, n3);
        e = Integer.toString(4, n3);
    }

    public static Bundle a(Spanned object, Object object2, int n3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        int n4 = object.getSpanStart(object2);
        String string2 = a;
        bundle2.putInt(string2, n4);
        String string3 = b;
        int n7 = object.getSpanEnd(object2);
        bundle2.putInt(string3, n7);
        string3 = c;
        int n8 = object.getSpanFlags(object2);
        bundle2.putInt(string3, n8);
        object = d;
        bundle2.putInt((String)object, n3);
        if (bundle != null) {
            object = e;
            bundle2.putBundle((String)object, bundle);
        }
        return bundle2;
    }
}

