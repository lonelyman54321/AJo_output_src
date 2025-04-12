/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines;

import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.JobSupport$b;

public final class JobSupport$a
extends cl1_2 {
    public final JobSupport e;
    public final JobSupport$b f;
    public final ku_2 g;
    public final Object h;

    public JobSupport$a(JobSupport jobSupport, JobSupport$b jobSupport$b, ku_2 ku_22, Object object) {
        this.e = jobSupport;
        this.f = jobSupport$b;
        this.g = ku_22;
        this.h = object;
    }

    public final boolean i() {
        return false;
    }

    public final void j(Throwable object) {
        boolean bl2;
        object = JobSupport.a;
        object = this.e;
        object.getClass();
        Object object2 = this.g;
        yw1_2 yw1_22 = JobSupport.o0((yw1_2)object2);
        JobSupport$b jobSupport$b = this.f;
        Object object3 = this.h;
        if (yw1_22 == null || !(bl2 = ((JobSupport)object).A0(jobSupport$b, (ku_2)yw1_22, object3))) {
            boolean bl3;
            yw1_22 = jobSupport$b.a;
            yw1_22.getClass();
            int n3 = 2;
            yu1_2 yu1_22 = new yu1_2(n3);
            yw1_22.c(yu1_22, n3);
            object2 = JobSupport.o0((yw1_2)object2);
            if (object2 == null || !(bl3 = ((JobSupport)object).A0(jobSupport$b, (ku_2)object2, object3))) {
                object2 = ((JobSupport)object).Y(jobSupport$b, object3);
                ((JobSupport)object).s(object2);
            }
        }
    }
}

