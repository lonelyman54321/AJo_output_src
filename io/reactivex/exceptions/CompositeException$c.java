/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.exceptions;

import io.reactivex.exceptions.CompositeException$b;
import java.io.PrintStream;

public final class CompositeException$c
extends CompositeException$b {
    public final PrintStream a;

    public CompositeException$c(PrintStream printStream) {
        this.a = printStream;
    }

    public final void a(String string2) {
        this.a.println((Object)string2);
    }
}

