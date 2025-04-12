/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/*
 * Renamed from hF3
 */
public final class hf3_0 {
    public final WR1 a;
    public final ReferenceQueue b;

    public hf3_0() {
        Object[] objectArray = new Reference[16];
        ReferenceQueue referenceQueue = new ReferenceQueue(objectArray);
        this.a = referenceQueue;
        this.b = referenceQueue = new ReferenceQueue();
    }
}

