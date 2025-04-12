/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.reflect.Types$JavaVersion;
import java.lang.reflect.Type;

public final class b
implements Function {
    public final /* synthetic */ Types$JavaVersion a;

    public /* synthetic */ b(Types$JavaVersion types$JavaVersion) {
        this.a = types$JavaVersion;
    }

    public final Object apply(Object object) {
        Types$JavaVersion types$JavaVersion = this.a;
        object = (Type)object;
        return types$JavaVersion.typeName((Type)object);
    }
}

