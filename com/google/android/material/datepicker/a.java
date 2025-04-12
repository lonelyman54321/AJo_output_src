/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import com.google.android.material.datepicker.DateFormatTextWatcher;

public final class a
implements Runnable {
    public final /* synthetic */ DateFormatTextWatcher a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(DateFormatTextWatcher dateFormatTextWatcher, String string2) {
        this.a = dateFormatTextWatcher;
        this.b = string2;
    }

    public final void run() {
        DateFormatTextWatcher dateFormatTextWatcher = this.a;
        String string2 = this.b;
        DateFormatTextWatcher.b(dateFormatTextWatcher, string2);
    }
}

