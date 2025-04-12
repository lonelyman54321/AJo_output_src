/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/*
 * Renamed from M00
 */
public class m00_0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    static {
        b = AtomicIntegerFieldUpdater.newUpdater(m00_0.class, "_handled$volatile");
    }

    public m00_0(Throwable throwable, boolean bl2) {
        this.a = throwable;
        this._handled$volatile = (int)(bl2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = this.getClass().getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append('[');
        object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

