/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class yA0 {
    public static final zA0 a;

    static {
        zA0 zA02;
        vr3 vr32 = new vr3(null, null, null, null, false, null, 63);
        a = zA02 = new zA0(vr32);
    }

    public abstract vr3 a();

    public final zA0 b(yA0 object) {
        vr3 vr32;
        Object object2 = ((yA0)object).a().a;
        if (object2 == null) {
            object2 = this.a().a;
        }
        OI0 oI0 = object2;
        object2 = ((yA0)object).a().b;
        if (object2 == null) {
            object2 = this.a().b;
        }
        Object object3 = object2;
        object2 = ((yA0)object).a().c;
        if (object2 == null) {
            object2 = this.a().c;
        }
        Object object4 = object2;
        ((yA0)object).a().getClass();
        this.a().getClass();
        object2 = this.a().e;
        object = ((yA0)object).a().e;
        LinkedHashMap linkedHashMap = fh1_2.k((Map)object2, (Map)object);
        object2 = vr32;
        vr32 = new vr3(oI0, (d73_0)object3, (BR)object4, null, false, linkedHashMap, 16);
        zA0 zA02 = new zA0(vr32);
        return zA02;
    }

    public final boolean equals(Object object) {
        vr3 vr32;
        boolean bl2;
        boolean bl3 = object instanceof yA0;
        if (bl3 && (bl2 = Intrinsics.areEqual(object = ((yA0)object).a(), vr32 = this.a()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a().hashCode();
    }

    public final String toString() {
        Object object = a;
        boolean bl2 = Intrinsics.areEqual(this, object);
        if (bl2) {
            object = "EnterTransition.None";
        } else {
            object = this.a();
            StringBuilder stringBuilder = new StringBuilder("EnterTransition: \nFade - ");
            Object object2 = ((vr3)object).a;
            object2 = object2 != null ? ((OI0)object2).toString() : null;
            stringBuilder.append((String)object2);
            stringBuilder.append(",\nSlide - ");
            object2 = ((vr3)object).b;
            object2 = object2 != null ? ((d73_0)object2).toString() : null;
            stringBuilder.append((String)object2);
            stringBuilder.append(",\nShrink - ");
            object2 = ((vr3)object).c;
            object2 = object2 != null ? ((BR)object2).toString() : null;
            stringBuilder.append((String)object2);
            object2 = ",\nScale - ";
            stringBuilder.append((String)object2);
            object.getClass();
            stringBuilder.append((String)null);
            object = stringBuilder.toString();
        }
        return object;
    }
}

