/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.a;
import com.bumptech.glide.load.engine.a$a;
import java.lang.ref.ReferenceQueue;

class ActiveResources$2
implements Runnable {
    public final /* synthetic */ a a;

    public ActiveResources$2(a a2) {
        this.a = a2;
    }

    public final void run() {
        a a2 = this.a;
        a2.getClass();
        while (true) {
            a$a a$a;
            try {
                a$a = a2.c;
            }
            catch (InterruptedException interruptedException) {
                a$a = Thread.currentThread();
                ((Thread)((Object)a$a)).interrupt();
                continue;
            }
            a$a = ((ReferenceQueue)((Object)a$a)).remove();
            a$a = a$a;
            a2.b(a$a);
            continue;
            break;
        }
    }
}

