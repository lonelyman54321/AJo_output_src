/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk;

import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.a$a;

public final class b
implements yc1_2 {
    public b(int n3) {
    }

    public static void c() {
        a$a.INFO.intValue();
    }

    public static void d() {
        a$a.INFO.intValue();
    }

    public static void e() {
        a$a.INFO.intValue();
    }

    public static void f(String string2) {
        int n3 = a.c;
        a$a a$a = a$a.INFO;
        int n4 = a$a.intValue();
        if (n3 > n4 && (n3 = string2.length()) > (n4 = 4000)) {
            n3 = 0;
            string2.substring(0, n4);
            string2 = string2.substring(n4);
            b.f(string2);
        }
    }

    public static void g() {
        a$a.INFO.intValue();
    }

    public static void h() {
        a$a.INFO.intValue();
    }

    public static void i() {
        a$a.INFO.intValue();
    }

    public static void j() {
        a$a.DEBUG.intValue();
    }

    public static void k() {
        a$a.DEBUG.intValue();
    }

    public static void l() {
        a$a.DEBUG.intValue();
    }

    public static void m() {
        a$a.DEBUG.intValue();
    }

    public static void n() {
        a$a.DEBUG.intValue();
    }

    public final void a() {
        a$a.DEBUG.intValue();
    }

    public final void b(String string2, String string3) {
        int n3 = a.c;
        a$a a$a = a$a.DEBUG;
        int n4 = a$a.intValue();
        if (n3 > n4 && (n3 = string3.length()) > (n4 = 4000)) {
            n3 = 0;
            string3.substring(0, n4);
            string3 = string3.substring(n4);
            this.b(string2, string3);
        }
    }
}

