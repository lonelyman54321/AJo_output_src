/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Dm2
 */
public final class dm2_2
extends fm2_2 {
    public final /* synthetic */ fm2_2 a;

    public dm2_2(fm2_2 fm2_22) {
        this.a = fm2_22;
    }

    public final void a(sj2_1 sj2_12, Object iterator) {
        if ((iterator = (Iterable)((Object)iterator)) != null) {
            boolean bl2;
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                Object t3 = iterator.next();
                fm2_2 fm2_22 = this.a;
                fm2_22.a(sj2_12, t3);
            }
        }
    }
}

