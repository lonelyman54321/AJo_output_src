/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

/*
 * Renamed from n42
 */
public final class n42_0
implements pr3_0 {
    public final Nr3 a;
    public final se1_0 b;

    public n42_0(Nr3 nr3, se1_0 se1_02) {
        this.a = nr3;
        this.b = se1_02;
    }

    public final void a() {
        Object object;
        block4: {
            block3: {
                Nr3 nr3;
                boolean bl2;
                block2: {
                    object = this.b;
                    bl2 = object instanceof cg3_2;
                    nr3 = this.a;
                    if (!bl2) break block2;
                    object = ((cg3_2)object).a;
                    nr3.getClass();
                    break block3;
                }
                bl2 = object instanceof hb0_0;
                if (!bl2) break block4;
                object = ((hb0_0)object).a;
                nr3.getClass();
            }
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

