/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.instream.video.vodVmap;

import android.content.Context;
import com.jio.jioads.instream.video.vodVmap.f;
import com.jio.jioads.instream.video.vodVmap.m;
import com.jio.jioads.network.c;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g
extends Lambda
implements Function0 {
    public final /* synthetic */ c c;
    public final /* synthetic */ String d;
    public final /* synthetic */ m e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Context g;
    public final /* synthetic */ HashMap h;
    public final /* synthetic */ List i;
    public final /* synthetic */ int j;
    public final /* synthetic */ String k;

    public g(c c2, String string2, m m2, String string3, Context context, HashMap hashMap, List list, int n3, String string4) {
        this.c = c2;
        this.d = string2;
        this.e = m2;
        this.f = string3;
        this.g = context;
        this.h = hashMap;
        this.i = list;
        this.j = n3;
        this.k = string4;
        super(0);
    }

    public final Object invoke() {
        f f5;
        HashMap hashMap = this.h;
        List list = this.i;
        m m2 = this.e;
        String string2 = this.f;
        String string3 = this.d;
        Context context = this.g;
        int n3 = this.j;
        String string4 = this.k;
        Object object = f5;
        f5 = new f(m2, string2, string3, context, hashMap, list, n3, string4);
        object = m2.c.a.a();
        this.c.c(f5, string3, (Boolean)object);
        return Unit.a;
    }
}

