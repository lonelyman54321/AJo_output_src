/*
 * Decompiled with CFR 0.152.
 */
public final class JG1$b
implements uO1 {
    public uO1[] a;

    public final boolean isSupported(Class clazz) {
        for (uO1 uO12 : this.a) {
            boolean bl2 = uO12.isSupported(clazz);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final tO1 messageInfoFor(Class object) {
        for (uO1 uO12 : this.a) {
            boolean bl2 = uO12.isSupported((Class)object);
            if (!bl2) continue;
            return uO12.messageInfoFor((Class)object);
        }
        object = ((Class)object).getName();
        object = "No factory is available for message type: ".concat((String)object);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException((String)object);
        throw unsupportedOperationException;
    }
}

