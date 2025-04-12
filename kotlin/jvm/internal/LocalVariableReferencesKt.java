/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class LocalVariableReferencesKt {
    public static final /* synthetic */ Void access$notSupportedError() {
        return LocalVariableReferencesKt.notSupportedError();
    }

    private static final Void notSupportedError() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Not supported for local property reference.");
        throw unsupportedOperationException;
    }
}

