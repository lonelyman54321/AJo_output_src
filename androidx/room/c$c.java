/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public abstract class c$c {
    public final String[] a;

    public c$c(String[] stringArray) {
        Intrinsics.checkNotNullParameter(stringArray, "tables");
        this.a = stringArray;
    }

    public abstract void a(Set var1);
}

