/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.install.model;

public @interface InstallStatus {
    public static final int CANCELED = 6;
    public static final int DOWNLOADED = 11;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 5;
    public static final int INSTALLED = 4;
    public static final int INSTALLING = 3;
    public static final int PENDING = 1;
    public static final int REQUIRES_UI_INTENT = 10;
    public static final int UNKNOWN;
}

