/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.util;

import android.content.Context;
import com.jio.jioads.util.i;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class g
extends Lambda
implements Function0 {
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ Ref$ObjectRef f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Context h;

    public g(Context context, Boolean bl2, Boolean bl3, String string2, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        this.c = bl2;
        this.d = bl3;
        this.e = ref$ObjectRef;
        this.f = ref$ObjectRef2;
        this.g = string2;
        this.h = context;
        super(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke() {
        int n3;
        Boolean bl2;
        int n4;
        Serializable serializable = Boolean.FALSE;
        Serializable serializable2 = this.c;
        int n7 = Intrinsics.areEqual(serializable2, serializable);
        Context context = this.h;
        String string2 = this.g;
        if (n7 == 0 || (n4 = Intrinsics.areEqual(bl2 = this.d, serializable)) == 0) {
            serializable = (Integer)this.e.element;
            n7 = 0;
            bl2 = null;
            if (serializable != null) {
                n4 = (Integer)serializable;
            } else {
                n4 = 0;
                serializable = null;
            }
            if (n4 <= 0) {
                serializable = (Integer)this.f.element;
                if (serializable != null) {
                    n7 = (Integer)serializable;
                }
                if (n7 <= 0 && (n4 = i.i) <= 0) {
                    serializable = Boolean.TRUE;
                    boolean bl3 = Intrinsics.areEqual(serializable2, serializable);
                    if (!bl3) return Unit.a;
                    serializable2 = i.b;
                    ((HashMap)serializable2).put(string2, serializable);
                    i.h(context, string2);
                    return Unit.a;
                }
            }
        }
        serializable = i.b;
        serializable2 = Boolean.TRUE;
        ((HashMap)serializable).put(string2, serializable2);
        n4 = i.g;
        if (n4 == 0 && (n4 = i.h) == 0) {
            i.h(context, string2);
            return Unit.a;
        }
        n4 = i.g;
        if (n4 != (n3 = ++i.h)) return Unit.a;
        i.h(context, string2);
        return Unit.a;
    }
}

