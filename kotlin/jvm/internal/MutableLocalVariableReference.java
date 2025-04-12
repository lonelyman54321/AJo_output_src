/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.LocalVariableReferencesKt;
import kotlin.jvm.internal.MutablePropertyReference0;

public class MutableLocalVariableReference
extends MutablePropertyReference0 {
    public Object get() {
        LocalVariableReferencesKt.access$notSupportedError();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public an1_2 getOwner() {
        LocalVariableReferencesKt.access$notSupportedError();
        KotlinNothingValueException kotlinNothingValueException = new KotlinNothingValueException();
        throw kotlinNothingValueException;
    }

    public void set(Object object) {
        LocalVariableReferencesKt.access$notSupportedError();
        object = new KotlinNothingValueException();
        throw object;
    }
}

