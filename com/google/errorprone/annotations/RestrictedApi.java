/*
 * Decompiled with CFR 0.152.
 */
package com.google.errorprone.annotations;

public @interface RestrictedApi {
    public String allowedOnPath();

    public Class[] allowlistAnnotations();

    public Class[] allowlistWithWarningAnnotations();

    public String explanation();

    public String link();
}

