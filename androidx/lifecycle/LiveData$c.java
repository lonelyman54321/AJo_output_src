/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.LiveData;

public abstract class LiveData$c {
    public final F62 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ LiveData d;

    public LiveData$c(LiveData liveData, F62 f62) {
        this.d = liveData;
        this.a = f62;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean n3) {
        Throwable throwable2;
        block9: {
            int n4 = this.b;
            if (n3 == n4) {
                return;
            }
            this.b = n3;
            n4 = 1;
            n3 = n3 != 0 ? 1 : -1;
            LiveData liveData = this.d;
            int n7 = liveData.c;
            liveData.c = n3 += n7;
            n3 = liveData.d;
            if (n3 == 0) {
                liveData.d = n4;
                while (true) {
                    int n8;
                    block8: {
                        block7: {
                            n3 = 0;
                            try {
                                n8 = liveData.c;
                                if (n7 == n8) break;
                                boolean bl2 = n7 == 0 && n8 > 0;
                                n7 = n7 > 0 && n8 == 0 ? 1 : 0;
                                if (!bl2) break block7;
                                liveData.g();
                                break block8;
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        if (n7 != 0) {
                            liveData.h();
                        }
                    }
                    n7 = n8;
                }
                liveData.d = false;
            }
            n3 = this.b;
            if (n3 != 0) {
                liveData.c(this);
            }
            return;
        }
        liveData.d = false;
        throw throwable2;
    }

    public void c() {
    }

    public boolean d(mu1_1 mu1_12) {
        return false;
    }

    public abstract boolean e();
}

