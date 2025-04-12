/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashSet;

/*
 * Renamed from ut1
 */
public final class ut1_1
implements Cr0 {
    public final /* synthetic */ rt1_0 a;
    public final /* synthetic */ Object b;

    public ut1_1(rt1_0 rt1_02, Object object) {
        this.a = rt1_02;
        this.b = object;
    }

    public final void dispose() {
        LinkedHashSet linkedHashSet = this.a.c;
        Object object = this.b;
        linkedHashSet.add(object);
    }
}

