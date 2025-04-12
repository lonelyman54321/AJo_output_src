/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class r50$a
extends y62_0 {
    public final /* synthetic */ r50 c;

    public r50$a(r50 r502, zq0_0 zq0_02) {
        this.c = r502;
        super(zq0_02);
    }

    public final void c(gn1_2 object, Object object2, Object object3) {
        boolean bl2;
        object2 = (xq0_0)object2;
        object3 = (xq0_0)object3;
        object2 = this.c.b;
        object = object.getName();
        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        object3 = (zq0_0)object3;
        Object object4 = ((zq0_0)object3).b;
        Object object5 = ((Aq0)object4).a;
        Object object6 = null;
        if (object5 == null && (object5 = ((Aq0)object4).b) == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object5 = null;
        }
        Aq0 aq0 = ((zq0_0)object3).a;
        object3 = ((zq0_0)object3).c;
        if (bl2 && (object5 = ((Aq0)object3).a) == null && (object5 = ((Aq0)object3).b) == null) {
            object3 = aq0.a();
        } else {
            object6 = new char[]{};
            object5 = new pg_0((char[])object6);
            object6 = ((Aq0)object4).a;
            if (object6 != null || (object6 = (Object)((Aq0)object4).b) != null) {
                object4 = ((Aq0)object4).a();
                object6 = "min";
                ((pg_0)object5).z((String)object6, (QG)object4);
            }
            object4 = ((Aq0)object3).a;
            if (object4 != null || (object4 = ((Aq0)object3).b) != null) {
                object3 = ((Aq0)object3).a();
                object4 = "max";
                ((pg_0)object5).z((String)object4, (QG)object3);
            }
            object3 = aq0.a();
            object4 = "value";
            ((pg_0)object5).z((String)object4, (QG)object3);
            object3 = object5;
        }
        ((pg_0)object2).z((String)object, (QG)object3);
    }
}

