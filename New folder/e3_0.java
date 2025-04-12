/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from E3
 */
public final class e3_0
extends x3 {
    public final Intent a(Context object, Object stringArray) {
        stringArray = stringArray;
        Intrinsics.checkNotNullParameter(object, "context");
        object = "input";
        Intrinsics.checkNotNullParameter(stringArray, (String)object);
        Intrinsics.checkNotNullParameter(stringArray, (String)object);
        object = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS");
        object = object.putExtra("androidx.activity.result.contract.extra.PERMISSIONS", stringArray);
        Intrinsics.checkNotNullExpressionValue(object, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)");
        return object;
    }

    public final x3$a b(Context object, Object object2) {
        block6: {
            object2 = object2;
            Intrinsics.checkNotNullParameter(object, "context");
            LinkedHashMap<String, Object> linkedHashMap = "input";
            Intrinsics.checkNotNullParameter(object2, (String)((Object)linkedHashMap));
            int n3 = ((String[])object2).length;
            if (n3 == 0) {
                object2 = fh1_2.f();
                object = new x3$a((Serializable)object2);
            } else {
                Object object3;
                n3 = ((String[])object2).length;
                int n4 = 0;
                String string2 = null;
                for (int i3 = 0; i3 < n3; ++i3) {
                    object3 = object2[i3];
                    int n7 = t70.checkSelfPermission(object, (String)object3);
                    if (n7 == 0) {
                        continue;
                    }
                    boolean bl2 = false;
                    object = null;
                    break block6;
                }
                int n8 = eh1_2.c(((String[])object2).length);
                if (n8 < (n3 = 16)) {
                    n8 = 16;
                }
                linkedHashMap = new LinkedHashMap<String, Object>(n8);
                n8 = ((String[])object2).length;
                while (n4 < n8) {
                    string2 = object2[n4];
                    object3 = Boolean.TRUE;
                    linkedHashMap.put(string2, object3);
                    ++n4;
                }
                object = new x3$a(linkedHashMap);
            }
        }
        return object;
    }

    public final Object c(int n3, Intent object) {
        Object object2;
        int n4 = -1;
        if (n3 != n4) {
            object2 = fh1_2.f();
        } else if (object == null) {
            object2 = fh1_2.f();
        } else {
            object2 = object.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            Object object3 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";
            if ((object = (Object)object.getIntArrayExtra((String)object3)) != null && object2 != null) {
                int n7;
                int n8 = ((Intent)object).length;
                object3 = new Object(n8);
                n8 = ((Intent)object).length;
                ArrayList<Pair> arrayList = null;
                Pair pair = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    Boolean bl2;
                    Object object4 = object[n7];
                    if (object4 == false) {
                        object4 = true;
                    } else {
                        object4 = false;
                        bl2 = null;
                    }
                    bl2 = (boolean)object4;
                    ((ArrayList)object3).add(bl2);
                }
                object2 = tp_2.y(object2);
                Intrinsics.checkNotNullParameter(object2, "<this>");
                Intrinsics.checkNotNullParameter(object3, "other");
                object = object2.iterator();
                Iterator iterator = ((ArrayList)object3).iterator();
                n7 = 10;
                n3 = yx_2.o((Iterable)object2, n7);
                n4 = yx_2.o(object3, n7);
                n3 = Math.min(n3, n4);
                arrayList = new ArrayList<Pair>(n3);
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0 && (n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = object.next();
                    object3 = iterator.next();
                    pair = new Pair(object2, object3);
                    arrayList.add(pair);
                }
                object2 = fh1_2.n(arrayList);
            } else {
                object2 = fh1_2.f();
            }
        }
        return object2;
    }
}

