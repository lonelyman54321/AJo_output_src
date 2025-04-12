/*
 * Decompiled with CFR 0.152.
 */
package com.google.errorprone.annotations;

public @interface InlineMe {
    public String[] imports();

    public String replacement();

    public String[] staticImports();
}

