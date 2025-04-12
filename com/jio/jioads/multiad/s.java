/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad;

import com.jio.jioads.multiad.b_0;
import com.jio.jioads.multiad.model.f;
import com.jio.jioads.multiad.z;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class s
implements b_0 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ z b;
    public final /* synthetic */ HashMap c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;

    public s(Ref$ObjectRef ref$ObjectRef, z z5, HashMap hashMap, ArrayList arrayList, ArrayList arrayList2) {
        this.a = ref$ObjectRef;
        this.b = z5;
        this.c = hashMap;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final void a(f f5) {
        Ref$ObjectRef ref$ObjectRef = this.a;
        String string2 = "prm";
        ref$ObjectRef.element = string2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.e;
        z z5 = this.b;
        HashMap hashMap = this.c;
        z5.i(f5, string2, arrayList, arrayList2, hashMap);
    }
}

