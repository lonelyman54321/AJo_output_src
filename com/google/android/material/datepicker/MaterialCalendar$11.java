/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

class MaterialCalendar$11
implements Runnable {
    final /* synthetic */ MaterialCalendar this$0;
    final /* synthetic */ int val$position;

    public MaterialCalendar$11(MaterialCalendar materialCalendar, int n3) {
        this.this$0 = materialCalendar;
        this.val$position = n3;
    }

    public void run() {
        RecyclerView recyclerView = MaterialCalendar.access$000(this.this$0);
        int n3 = this.val$position;
        recyclerView.smoothScrollToPosition(n3);
    }
}

