/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.h$a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class h
extends jD3
implements eu1_0 {
    public static final h$a b;
    public final LinkedHashMap a;

    static {
        h$a h$a;
        b = h$a = new Object();
    }

    public h() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    public final rd3_0 a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.a;
        rd3_0 rd3_02 = (rd3_0)linkedHashMap.get(string2);
        if (rd3_02 == null) {
            rd3_02 = new rd3_0();
            linkedHashMap.put(string2, rd3_02);
        }
        return rd3_02;
    }

    public final void onCleared() {
        boolean bl2;
        LinkedHashMap linkedHashMap = this.a;
        Iterator iterator = linkedHashMap.values().iterator();
        while (bl2 = iterator.hasNext()) {
            rd3_0 rd3_02 = (rd3_0)iterator.next();
            rd3_02.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        boolean bl2;
        CharSequence charSequence = new StringBuilder("NavControllerViewModel{");
        int n3 = System.identityHashCode(this);
        Object object = Integer.toHexString(n3);
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("} ViewModelStores (");
        object = this.a.keySet().iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            ((StringBuilder)charSequence).append(string2);
            bl2 = object.hasNext();
            if (!bl2) continue;
            string2 = ", ";
            ((StringBuilder)charSequence).append(string2);
        }
        ((StringBuilder)charSequence).append(')');
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

