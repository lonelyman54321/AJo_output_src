/*
 * Decompiled with CFR 0.152.
 */
package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

class CollectionsKt___CollectionsKt
extends ex_2 {
    public static final void C(Iterable object, StringBuilder stringBuilder, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n3, CharSequence charSequence4, Function1 function1) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(stringBuilder, "buffer");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        String string2 = "truncated";
        Intrinsics.checkNotNullParameter(charSequence4, string2);
        stringBuilder.append(charSequence2);
        object = object.iterator();
        int n4 = 0;
        charSequence2 = null;
        while (bl2 = object.hasNext()) {
            string2 = object.next();
            int n7 = 1;
            if (++n4 > n7) {
                stringBuilder.append(charSequence);
            }
            if (n3 >= 0 && n4 > n3) break;
            ce3_1.a(stringBuilder, string2, function1);
        }
        if (n3 >= 0 && n4 > n3) {
            stringBuilder.append(charSequence4);
        }
        stringBuilder.append(charSequence3);
    }

    public static final List D(Iterable iterable) {
        ArrayList arrayList = "<this>";
        Intrinsics.checkNotNullParameter(iterable, (String)((Object)arrayList));
        boolean bl2 = iterable instanceof Collection;
        if (bl2) {
            return CollectionsKt.m0((Collection)iterable);
        }
        arrayList = new ArrayList();
        CollectionsKt.h0(iterable, arrayList);
        return arrayList;
    }

    public static Object firstOrNull(List list) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(list, string2);
        boolean bl2 = list.isEmpty();
        if (bl2) {
            list = null;
        } else {
            bl2 = false;
            string2 = null;
            list = list.get(0);
        }
        return list;
    }
}

