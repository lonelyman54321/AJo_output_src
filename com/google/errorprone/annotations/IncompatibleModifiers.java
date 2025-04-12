/*
 * Decompiled with CFR 0.152.
 */
package com.google.errorprone.annotations;

import com.google.errorprone.annotations.Modifier;

public @interface IncompatibleModifiers {
    public Modifier[] modifier();

    public javax.lang.model.element.Modifier[] value();
}

