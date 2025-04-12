/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionReference;

public class FunctionReferenceImpl
extends FunctionReference {
    public FunctionReferenceImpl(int n3, an1_2 an1_22, String string2, String string3) {
        Object object = CallableReference.NO_RECEIVER;
        Class clazz = ((ClassBasedDeclarationContainer)an1_22).getJClass();
        int n4 = an1_22 instanceof yn1_2 ^ 1;
        super(n3, object, clazz, string2, string3, n4);
    }

    public FunctionReferenceImpl(int n3, Class clazz, String string2, String string3, int n4) {
        Object object = CallableReference.NO_RECEIVER;
        super(n3, object, clazz, string2, string3, n4);
    }

    public FunctionReferenceImpl(int n3, Object object, Class clazz, String string2, String string3, int n4) {
        super(n3, object, clazz, string2, string3, n4);
    }
}

