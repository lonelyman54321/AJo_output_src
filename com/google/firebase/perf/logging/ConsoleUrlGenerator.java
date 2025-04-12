/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.logging;

public final class ConsoleUrlGenerator {
    private static final String URL_BASE_PATH = "https://console.firebase.google.com";
    private static final String UTM_MEDIUM = "android-ide";
    private static final String UTM_SOURCE = "perf-android-sdk";

    public static String generateCustomTraceUrl(String string2, String string3, String string4) {
        return y02.a(ConsoleUrlGenerator.getRootUrl(string2, string3), "/troubleshooting/trace/DURATION_TRACE/", string4, "?utm_source=perf-android-sdk&utm_medium=android-ide");
    }

    public static String generateDashboardUrl(String string2, String string3) {
        return Ft2.a(ConsoleUrlGenerator.getRootUrl(string2, string3), "/trends?utm_source=perf-android-sdk&utm_medium=android-ide");
    }

    public static String generateScreenTraceUrl(String string2, String string3, String string4) {
        return y02.a(ConsoleUrlGenerator.getRootUrl(string2, string3), "/troubleshooting/trace/SCREEN_TRACE/", string4, "?utm_source=perf-android-sdk&utm_medium=android-ide");
    }

    private static String getRootUrl(String string2, String string3) {
        return UX.c("https://console.firebase.google.com/project/", string2, "/performance/app/android:", string3);
    }
}

