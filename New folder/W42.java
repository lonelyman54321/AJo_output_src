/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class W42 {
    public static GI2[] a(Bundle[] bundleArray) {
        int n3;
        if (bundleArray == null) {
            return null;
        }
        int n4 = bundleArray.length;
        GI2[] gI2Array = new GI2[n4];
        for (int i3 = 0; i3 < (n3 = bundleArray.length); ++i3) {
            Object object;
            Bundle bundle = bundleArray[i3];
            Iterator iterator = bundle.getStringArrayList("allowedDataTypes");
            HashSet<String> hashSet = new HashSet<String>();
            if (iterator != null) {
                boolean bl2;
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while (bl2 = iterator.hasNext()) {
                    object = (String)iterator.next();
                    hashSet.add((String)object);
                }
            }
            String string2 = bundle.getString("resultKey");
            CharSequence charSequence = bundle.getCharSequence("label");
            CharSequence[] charSequenceArray = bundle.getCharSequenceArray("choices");
            boolean bl3 = bundle.getBoolean("allowFreeFormInput");
            Bundle bundle2 = bundle.getBundle("extras");
            object = iterator;
            iterator = new Iterator(string2, charSequence, charSequenceArray, bl3, 0, bundle2, hashSet);
            gI2Array[i3] = iterator;
        }
        return gI2Array;
    }
}

