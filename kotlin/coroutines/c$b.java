/*
 * Decompiled with CFR 0.152.
 */
package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext$Element;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c$b
extends Lambda
implements Function2 {
    public static final c$b c;

    static {
        c$b c$b;
        c = c$b = new Lambda(2);
    }

    public c$b() {
        super(2);
    }

    public final String a(String string2, CoroutineContext$Element coroutineContext$Element) {
        Intrinsics.checkNotNullParameter(string2, "acc");
        CharSequence charSequence = "element";
        Intrinsics.checkNotNullParameter(coroutineContext$Element, (String)charSequence);
        int n3 = string2.length();
        if (n3 == 0) {
            string2 = coroutineContext$Element.toString();
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(", ");
            ((StringBuilder)charSequence).append(coroutineContext$Element);
            string2 = ((StringBuilder)charSequence).toString();
        }
        return string2;
    }
}

