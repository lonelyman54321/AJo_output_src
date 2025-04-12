/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.EngineJob$b;
import com.bumptech.glide.load.engine.EngineJob$c;
import com.bumptech.glide.load.engine.g;
import java.util.concurrent.Executor;

class EngineJob$CallResourceReady
implements Runnable {
    public final zk2_0 a;
    public final /* synthetic */ EngineJob b;

    public EngineJob$CallResourceReady(EngineJob engineJob, zk2_0 zk2_02) {
        this.b = engineJob;
        this.a = zk2_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void run() {
        Throwable throwable2;
        block11: {
            Object object;
            block10: {
                boolean bl2;
                Object object2;
                Object object3;
                Object object4;
                Object object5 = (j63)this.a;
                Object object6 = ((j63)object5).a;
                ((Tb3$a)object6).a();
                object5 = ((j63)object5).b;
                // MONITORENTER : object5
                object6 = this.b;
                // MONITORENTER : object6
                try {
                    object = this.b;
                    object = ((EngineJob)object).a;
                    object4 = this.a;
                    object.getClass();
                    object3 = iE0.b;
                    object2 = new EngineJob$b((zk2_0)object4, (Executor)object3);
                    object = ((EngineJob$c)object).a;
                    bl2 = object.contains(object2);
                    if (!bl2) break block10;
                    object = this.b;
                    object = ((EngineJob)object).v;
                    ((g)object).b();
                    object = this.b;
                    object4 = this.a;
                    object.getClass();
                }
                catch (Throwable throwable2) {}
                try {
                    object2 = ((EngineJob)object).v;
                    object3 = ((EngineJob)object).r;
                    bl2 = ((EngineJob)object).y;
                    object4 = (j63)object4;
                    ((j63)object4).k((wk2_0)object2, (pi0_0)((Object)object3), bl2);
                }
                catch (Throwable throwable3) {
                    object4 = new YJ(throwable3);
                    throw object4;
                }
                object = this.b;
                object4 = this.a;
                ((EngineJob)object).j((zk2_0)object4);
                break block10;
                break block11;
            }
            object = this.b;
            ((EngineJob)object).d();
            // MONITOREXIT : object6
            // MONITOREXIT : object5
            return;
        }
        // MONITOREXIT : object6
        throw throwable2;
    }
}

