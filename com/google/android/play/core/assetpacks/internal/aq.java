/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.play.core.assetpacks.internal.as;

public final class aq
implements as {
    private static final Object a;
    private volatile as b;
    private volatile Object c;

    static {
        Object object;
        a = object = new Object();
    }

    private aq(as as2) {
        Object object;
        this.c = object = a;
        this.b = as2;
    }

    public static as b(as as2) {
        boolean bl2 = as2 instanceof aq;
        if (bl2) {
            return as2;
        }
        aq aq2 = new aq(as2);
        return aq2;
    }

    public static aq c(as as2) {
        aq aq2 = new aq(as2);
        return aq2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object d() {
        String string2 = "Scoped provider was invoked recursively returning different results: ";
        synchronized (this) {
            Throwable throwable2;
            block8: {
                Object object;
                block6: {
                    block7: {
                        Object object2;
                        Object object3;
                        try {
                            object = this.c;
                            object3 = a;
                            if (object != object3) break block6;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        {
                            object = this.b;
                            object = object.a();
                            object2 = this.c;
                            if (object2 == object3 || object2 == object) break block7;
                        }
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        stringBuilder.append(object2);
                        string2 = " & ";
                        stringBuilder.append(string2);
                        stringBuilder.append(object);
                        string2 = ". This is likely due to a circular dependency.";
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        object3 = new IllegalStateException(string2);
                        throw object3;
                    }
                    this.c = object;
                    string2 = null;
                    this.b = null;
                    return object;
                }
                return object;
            }
            throw throwable2;
        }
    }

    public final Object a() {
        Object object = this.c;
        Object object2 = a;
        if (object == object2) {
            object = this.d();
        }
        return object;
    }
}

