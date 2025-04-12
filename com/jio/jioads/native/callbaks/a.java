/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.view.ViewGroup
 */
package com.jio.jioads.native.callbaks;

import android.os.CountDownTimer;
import android.view.ViewGroup;
import com.jio.jioads.adinterfaces.JioAdError$JioAdErrorType;
import com.jio.jioads.adinterfaces.JioAdView$AdState;

public interface a {
    public CountDownTimer a();

    public void a(String var1);

    public void a(boolean var1);

    public void b();

    public void b(String var1);

    public void b(String var1, String var2);

    public void c();

    public void c(com.jio.jioads.native.parser.a var1);

    public void d();

    public void d(ViewGroup var1);

    public void e(boolean var1);

    public boolean e();

    public void f();

    public void f(JioAdError$JioAdErrorType var1, String var2);

    public boolean g();

    public void h(long var1);

    public void i(boolean var1);

    public boolean i();

    public void j(JioAdView$AdState var1);

    public String n();
}

