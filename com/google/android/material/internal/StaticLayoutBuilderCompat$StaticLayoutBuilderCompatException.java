/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.internal;

class StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException
extends Exception {
    public StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException(Throwable throwable) {
        CharSequence charSequence = new StringBuilder("Error thrown initializing StaticLayout ");
        String string2 = throwable.getMessage();
        charSequence.append(string2);
        charSequence = charSequence.toString();
        super((String)charSequence, throwable);
    }
}

