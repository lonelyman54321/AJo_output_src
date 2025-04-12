/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cg3
 */
public final class cg3_2
extends se1_0 {
    public final Drawable a;
    public final pe1_0 b;
    public final ri0 c;
    public final MemoryCache$Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public cg3_2(Drawable drawable2, pe1_0 pe1_02, ri0 ri02, MemoryCache$Key memoryCache$Key, String string2, boolean bl2, boolean bl3) {
        this.a = drawable2;
        this.b = pe1_02;
        this.c = ri02;
        this.d = memoryCache$Key;
        this.e = string2;
        this.f = bl2;
        this.g = bl3;
    }

    public final Drawable a() {
        return this.a;
    }

    public final pe1_0 b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                boolean bl4;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl5 = object instanceof cg3_2;
                if (!bl5) break block4;
                object = (cg3_2)object;
                Object object2 = this.a;
                Object object3 = ((cg3_2)object).a;
                bl5 = Intrinsics.areEqual(object2, object3);
                if (bl5 && (bl5 = Intrinsics.areEqual(object2 = this.b, object3 = ((cg3_2)object).b)) && (object3 = this.c) == (object2 = ((cg3_2)object).c) && (bl5 = Intrinsics.areEqual(object3 = this.d, object2 = ((cg3_2)object).d)) && (bl5 = Intrinsics.areEqual(object3 = this.e, object2 = ((cg3_2)object).e)) && (bl5 = this.f) == (bl4 = ((cg3_2)object).f) && (bl5 = this.g) == (bl3 = ((cg3_2)object).g)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a.hashCode() * 31;
        int n7 = (this.b.hashCode() + n4) * 31;
        ri0 ri02 = this.c;
        n4 = (((Object)((Object)ri02)).hashCode() + n7) * 31;
        n7 = 0;
        Object object = this.d;
        if (object != null) {
            n3 = ((MemoryCache$Key)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object != null) {
            n7 = object.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = 1237;
        n3 = 1231;
        int n8 = this.f;
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = (int)(this.g ? 1 : 0);
        if (n8 != 0) {
            n7 = 1231;
        }
        return n4 + n7;
    }
}

