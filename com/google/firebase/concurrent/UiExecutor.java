/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class UiExecutor
extends Enum
implements Executor {
    private static final /* synthetic */ UiExecutor[] $VALUES;
    private static final Handler HANDLER;
    public static final /* enum */ UiExecutor INSTANCE;

    private static /* synthetic */ UiExecutor[] $values() {
        UiExecutor uiExecutor = INSTANCE;
        UiExecutor[] uiExecutorArray = new UiExecutor[]{uiExecutor};
        return uiExecutorArray;
    }

    static {
        UiExecutor uiExecutor;
        INSTANCE = uiExecutor = new UiExecutor("INSTANCE", 0);
        $VALUES = UiExecutor.$values();
        Looper looper = Looper.getMainLooper();
        uiExecutor = new Handler(looper);
        HANDLER = uiExecutor;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private UiExecutor() {
        void var2_-1;
        void var1_-1;
    }

    public static UiExecutor valueOf(String string2) {
        return Enum.valueOf(UiExecutor.class, string2);
    }

    public static UiExecutor[] values() {
        return (UiExecutor[])$VALUES.clone();
    }

    public void execute(Runnable runnable2) {
        HANDLER.post(runnable2);
    }
}

