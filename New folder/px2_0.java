/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Px2
 */
public final class px2_0
extends W72 {
    public i90_0 a;
    public Function2 b;
    public V72 c;
    public boolean d;

    public px2_0() {
        throw null;
    }

    public final void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        V72 v72 = this.c;
        if (v72 != null) {
            v72.a();
        }
        if ((v72 = this.c) != null) {
            v72.a = false;
        }
        this.d = false;
    }

    public final void handleOnBackPressed() {
        boolean bl2;
        Object object = this.c;
        if (object != null && !(bl2 = ((V72)object).a)) {
            ((V72)object).a();
            this.c = null;
        }
        object = this.c;
        bl2 = false;
        if (object == null) {
            i90_0 i90_02 = this.a;
            Function2 function2 = this.b;
            i90_02 = (c80)i90_02;
            this.c = object = new V72((c80)i90_02, false, function2, this);
        }
        if ((object = this.c) != null) {
            object = ((V72)object).b;
            ((le_2)object).q(null);
        }
        if ((object = this.c) != null) {
            ((V72)object).a = false;
        }
        this.d = false;
    }

    public final void handleOnBackProgressed(uu_0 uu_02) {
        super.handleOnBackProgressed(uu_02);
        Object object = this.c;
        if (object != null) {
            object = ((V72)object).b;
            object.j(uu_02);
        }
    }

    public final void handleOnBackStarted(uu_0 object) {
        super.handleOnBackStarted((uu_0)object);
        object = this.c;
        if (object != null) {
            ((V72)object).a();
        }
        boolean bl2 = this.isEnabled();
        boolean bl3 = true;
        if (bl2) {
            i90_0 i90_02 = this.a;
            Function2 function2 = this.b;
            i90_02 = (c80)i90_02;
            this.c = object = new V72((c80)i90_02, bl3, function2, this);
        }
        this.d = bl3;
    }
}

