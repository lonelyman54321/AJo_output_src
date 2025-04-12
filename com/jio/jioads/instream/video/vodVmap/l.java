/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instream.video.vodVmap;

import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.instreamads.vastparser.model.j;
import com.jio.jioads.instreamads.wrapper.a;
import com.jio.jioads.instreamads.wrapper.b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements a {
    public final /* synthetic */ m a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;
    public final /* synthetic */ com.jio.jioads.instreamads.vastparser.model.m e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public l(int n3, int n4, m m2, com.jio.jioads.instreamads.vastparser.model.m m3, String string2, String string3, List list) {
        this.a = m2;
        this.b = n3;
        this.c = n4;
        this.d = list;
        this.e = m3;
        this.f = string2;
        this.g = string3;
    }

    public final void a(com.jio.jioads.instreamads.vastparser.model.m object) {
        Intrinsics.checkNotNullParameter(object, "wrapperVastModel");
        m m2 = this.a;
        Object object2 = m2.p;
        if (object2 != null && (object2 = ((com.jio.jioads.instreamads.vastparser.model.m)object2).c) != null) {
            object = ((com.jio.jioads.instreamads.vastparser.model.m)object).c;
            object2.addAll(object);
        }
        m2.h();
        int n3 = this.c + 1;
        String string2 = this.f;
        String string3 = this.g;
        m2 = this.a;
        List list = this.d;
        int n4 = this.b;
        com.jio.jioads.instreamads.vastparser.model.m m3 = this.e;
        m2.d(n3, list, n4, m3, string2, string3);
    }

    public final void b(com.jio.jioads.instreamads.vastparser.model.m object, j object2, b object3) {
        object = "error";
        Intrinsics.checkNotNullParameter(object3, (String)object);
        int n3 = this.c;
        int n4 = n3 + 1;
        object3 = this.e.c;
        int n7 = object3.size();
        if (n4 < n7) {
            int n8 = n3 + 1;
            String string2 = this.f;
            String string3 = this.g;
            m m2 = this.a;
            List list = this.d;
            int n10 = this.b;
            com.jio.jioads.instreamads.vastparser.model.m m3 = this.e;
            m2.d(n8, list, n10, m3, string2, string3);
        } else {
            n3 = this.b;
            object2 = this.g;
            object3 = this.a;
            List list = this.d;
            ((m)object3).g((String)object2, n3, list);
        }
    }
}

