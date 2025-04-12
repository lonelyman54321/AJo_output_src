/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class x$a {
    public static x a(Bundle object, Bundle object2) {
        int n3;
        int n4;
        if (object == null) {
            if (object2 == null) {
                object = new x();
            } else {
                boolean bl2;
                object = new HashMap();
                Iterator iterator = object2.keySet().iterator();
                while (bl2 = iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    Intrinsics.checkNotNullExpressionValue(string2, "key");
                    Object object3 = object2.get(string2);
                    ((HashMap)object).put(string2, object3);
                }
                object = object2 = new x((HashMap)object);
            }
            return object;
        }
        object2 = x.class.getClassLoader();
        Intrinsics.checkNotNull(object2);
        object.setClassLoader((ClassLoader)object2);
        object2 = object.getParcelableArrayList("keys");
        LinkedHashMap linkedHashMap = "values";
        object = object.getParcelableArrayList((String)((Object)linkedHashMap));
        if (object2 != null && object != null && (n4 = ((ArrayList)object2).size()) == (n3 = ((ArrayList)object).size())) {
            linkedHashMap = new LinkedHashMap();
            n3 = ((ArrayList)object2).size();
            Object var5_8 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object4 = ((ArrayList)object2).get(i3);
                Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.String");
                object4 = (String)object4;
                Object e2 = ((ArrayList)object).get(i3);
                linkedHashMap.put(object4, e2);
            }
            object = new x(linkedHashMap);
            return object;
        }
        object2 = "Invalid bundle passed as restored state".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

