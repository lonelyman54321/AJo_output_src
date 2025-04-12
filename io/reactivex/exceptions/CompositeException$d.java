/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.exceptions;

import io.reactivex.exceptions.CompositeException$b;
import java.io.PrintWriter;

public final class CompositeException$d
extends CompositeException$b {
    public final PrintWriter a;

    public CompositeException$d(PrintWriter printWriter) {
        this.a = printWriter;
    }

    public final void a(String string2) {
        this.a.println((Object)string2);
    }
}

