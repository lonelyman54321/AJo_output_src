/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c$a;
import com.google.android.play.core.assetpacks.cx;
import com.google.android.play.core.assetpacks.d;

public final class ExtractionWorker
extends Worker {
    cx a;

    public ExtractionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        d.a(context).d(this);
    }

    public final c$a doWork() {
        cx cx2 = this.a;
        b b2 = this.getInputData();
        return cx2.b(b2);
    }

    public final AV0 getForegroundInfo() {
        cx cx2 = this.a;
        b b2 = this.getInputData();
        return cx2.a(b2);
    }
}

