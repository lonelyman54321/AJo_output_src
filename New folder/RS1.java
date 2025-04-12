/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class RS1 {
    public static final ArrayList a(Map iterator, Function1 function1) {
        boolean bl2;
        Object object;
        Map.Entry entry;
        boolean bl3;
        Intrinsics.checkNotNullParameter(iterator, "<this>");
        Intrinsics.checkNotNullParameter(function1, "isArgumentMissing");
        Cloneable cloneable = new LinkedHashMap();
        iterator = iterator.entrySet().iterator();
        while (bl3 = iterator.hasNext()) {
            Boolean bl4;
            boolean bl5;
            entry = (Map.Entry)iterator.next();
            object = (b)entry.getValue();
            if (object != null) {
                bl5 = ((b)object).b;
                bl4 = bl5;
            } else {
                bl5 = false;
                bl4 = null;
            }
            Intrinsics.checkNotNull(bl4);
            bl5 = bl4;
            if (bl5 || (bl2 = ((b)object).c)) continue;
            object = entry.getKey();
            entry = entry.getValue();
            ((AbstractMap)((Object)cloneable)).put(object, entry);
        }
        iterator = ((LinkedHashMap)cloneable).keySet();
        cloneable = new ArrayList();
        iterator = iterator.iterator();
        while (bl3 = iterator.hasNext()) {
            entry = iterator.next();
            object = entry;
            object = (String)((Object)entry);
            bl2 = (Boolean)(object = (Boolean)function1.invoke(object));
            if (!bl2) continue;
            ((ArrayList)cloneable).add(entry);
        }
        return cloneable;
    }
}

