/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.EngineJob$b;
import com.bumptech.glide.load.engine.EngineJob$c;
import com.bumptech.glide.load.engine.GlideException;

class EngineJob$CallLoadFailed
implements Runnable {
    public final zk2_0 a;
    public final /* synthetic */ EngineJob b;

    public EngineJob$CallLoadFailed(EngineJob engineJob, zk2_0 zk2_02) {
        this.b = engineJob;
        this.a = zk2_02;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = (j63)this.a;
        Object object2 = ((j63)object).a;
        ((Tb3$a)object2).a();
        object = ((j63)object).b;
        synchronized (object) {
            Throwable throwable2;
            block12: {
                object2 = this.b;
                synchronized (object2) {
                }
                {
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    {
                        Object object3;
                        block10: {
                            object3 = this.b;
                            object3 = ((EngineJob)object3).a;
                            Object object4 = this.a;
                            object3.getClass();
                            iE0$b iE0$b = iE0.b;
                            EngineJob$b engineJob$b = new EngineJob$b((zk2_0)object4, iE0$b);
                            object3 = ((EngineJob$c)object3).a;
                            boolean bl2 = object3.contains(engineJob$b);
                            if (!bl2) break block10;
                            object3 = this.b;
                            object4 = this.a;
                            object3.getClass();
                            {
                                Throwable throwable32;
                                block11: {
                                    catch (Throwable throwable32) {
                                        break block11;
                                    }
                                    try {
                                        object3 = ((EngineJob)object3).t;
                                        object4 = (j63)object4;
                                        int n3 = 5;
                                        ((j63)object4).i((GlideException)object3, n3);
                                    }
                                    catch (Throwable throwable4) {}
                                    object4 = new YJ(throwable4);
                                    throw object4;
                                }
                                throw throwable32;
                            }
                        }
                        object3 = this.b;
                        ((EngineJob)object3).d();
                        return;
                    }
                }
            }
            throw throwable2;
        }
    }
}

