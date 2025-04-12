/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.videomodule;

import android.content.Context;
import com.jio.jioads.instreamads.vastparser.model.m;
import com.jio.jioads.videomodule.q_0;
import com.jio.jioads.videomodule.s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from com.jio.jioads.videomodule.S
 */
public final class s_0
extends Lambda
implements Function0 {
    public final /* synthetic */ s c;

    public s_0(s s7) {
        this.c = s7;
        super(0);
    }

    public final Object invoke() {
        s s7 = this.c;
        Object object = s7.g;
        if (object != null) {
            int n3;
            Intrinsics.checkNotNull(object);
            ArrayList arrayList = s7.z;
            if (arrayList != null) {
                n3 = arrayList.getBitRate();
            } else {
                n3 = 0;
                arrayList = null;
            }
            q_0 q_02 = new q_0(s7);
            m m2 = s7.b;
            object = m2.e((Context)object, n3, q_02);
            if (object != null) {
                s7.O = arrayList = new ArrayList(object);
            }
        }
        return Unit.a;
    }
}

