/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class r50 {
    public static final /* synthetic */ gn1_2[] k;
    public final Object a;
    public final tg_1 b;
    public final t50 c;
    public final w50_0 d;
    public final x50_0 e;
    public final w50_0 f;
    public final x50_0 g;
    public final r50$a h;
    public final r50$a i;
    public final r50$b j;

    static {
        Object object = r50.class;
        en1_2 en1_22 = OY2.a(object, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        en1_2 en1_23 = OY2.a(object, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0);
        en1_2 en1_24 = OY2.a(object, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0);
        en1_2 en1_25 = OY2.a(object, "scaleX", "getScaleX()F", 0);
        en1_2 en1_26 = OY2.a(object, "scaleY", "getScaleY()F", 0);
        en1_2 en1_27 = OY2.a(object, "rotationX", "getRotationX()F", 0);
        en1_2 en1_28 = OY2.a(object, "rotationY", "getRotationY()F", 0);
        en1_2 en1_29 = OY2.a(object, "rotationZ", "getRotationZ()F", 0);
        en1_2 en1_210 = OY2.a(object, "translationX", "getTranslationX-D9Ej5fM()F", 0);
        en1_2 en1_211 = OY2.a(object, "translationY", "getTranslationY-D9Ej5fM()F", 0);
        en1_2 en1_212 = OY2.a(object, "translationZ", "getTranslationZ-D9Ej5fM()F", 0);
        en1_2 en1_213 = OY2.a(object, "pivotX", "getPivotX()F", 0);
        en1_2 en1_214 = OY2.a(object, "pivotY", "getPivotY()F", 0);
        en1_2 en1_215 = OY2.a(object, "horizontalChainWeight", "getHorizontalChainWeight()F", 0);
        object = OY2.a(object, "verticalChainWeight", "getVerticalChainWeight()F", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{en1_22, en1_23, en1_24, en1_25, en1_26, en1_27, en1_28, en1_29, en1_210, en1_211, en1_212, en1_213, en1_214, en1_215, object};
        k = gn1_2Array;
    }

    public r50(Object object, tg_1 object2) {
        this.a = object;
        this.b = object2;
        this.c = object = new t50("parent");
        this.d = object = new mw_0((tg_1)object2, -2);
        this.e = object = new hw_0((tg_1)object2, 0);
        this.f = object = new mw_0((tg_1)object2, -1);
        this.g = object = new hw_0((tg_1)object2, 1);
        String string2 = "wrap";
        object2 = new zq0_0(string2);
        this.h = object = new r50$a(this, (zq0_0)object2);
        object2 = new zq0_0(string2);
        this.i = object = new r50$a(this, (zq0_0)object2);
        this.j = object = new r50$b(this);
    }

    public static void a(r50 object, y50$b_0 object2, y50$b_0 y50$b_0, float f5, float f6, int n3) {
        int n4 = n3 & 4;
        if (n4 != 0) {
            f5 = 0.0f;
        }
        if ((n3 &= 8) != 0) {
            f6 = 0.0f;
        }
        float f7 = 0.0f;
        float f8 = 0.0f;
        ((r50)object).d.a((y50$b_0)object2, f5, f7);
        ((r50)object).f.a(y50$b_0, f6, f8);
        object = ((r50)object).b;
        object.getClass();
        object2 = new sg_1(0.5f);
        ((pg_0)object).z("hRtlBias", (QG)object2);
    }

    public final void b(zq0_0 zq0_02) {
        gn1_2 gn1_22 = k[0];
        r50$a r50$a = this.h;
        r50$a.getClass();
        String string2 = "property";
        Intrinsics.checkNotNullParameter(gn1_22, string2);
        Object object = r50$a.b;
        Intrinsics.checkNotNullParameter(gn1_22, string2);
        r50$a.b = zq0_02;
        r50$a.c(gn1_22, object, zq0_02);
    }
}

