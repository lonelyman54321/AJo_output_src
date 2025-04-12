/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.DateFormatTextWatcher;

public final class b
implements Runnable {
    public final /* synthetic */ DateFormatTextWatcher a;
    public final /* synthetic */ long b;

    public /* synthetic */ b(DateFormatTextWatcher dateFormatTextWatcher, long l2) {
        this.a = dateFormatTextWatcher;
        this.b = l2;
    }

    public final void run() {
        DateFormatTextWatcher dateFormatTextWatcher = this.a;
        long l2 = this.b;
        DateFormatTextWatcher.a(dateFormatTextWatcher, l2);
    }
}

