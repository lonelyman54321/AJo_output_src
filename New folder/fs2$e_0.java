/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from FS2$e
 */
public final class fs2$e_0
extends Lambda
implements Function2 {
    public static final fs2$e_0 c;

    static {
        fs2$e_0 fs2$e_0;
        c = fs2$e_0 = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        boolean bl2;
        object = (ES2)object;
        object2 = (Sl$b)object2;
        Object object3 = ((Sl$b)object2).a;
        int n3 = object3 instanceof ym2_0;
        object3 = n3 != 0 ? Vl.Paragraph : ((n3 = object3 instanceof S93) != 0 ? Vl.Span : ((n3 = object3 instanceof fb3_1) != 0 ? Vl.VerbatimTts : ((n3 = object3 instanceof hx3) != 0 ? Vl.Url : ((n3 = object3 instanceof Gu1$b) != 0 ? Vl.Link : ((bl2 = object3 instanceof Gu1$a) ? Vl.Clickable : Vl.String)))));
        Object object4 = FS2$e$a.$EnumSwitchMapping$0;
        int n4 = ((Enum)object3).ordinal();
        n3 = object4[n4];
        Object object5 = ((Sl$b)object2).a;
        switch (n3) {
            default: {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            case 7: {
                object = FS2.a;
                break;
            }
            case 6: {
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                object5 = (Gu1$a)object5;
                object4 = FS2.g;
                object5 = FS2.a(object5, (BS2)object4, (ES2)object);
                break;
            }
            case 5: {
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                object5 = (Gu1$b)object5;
                object4 = FS2.f;
                object5 = FS2.a(object5, (BS2)object4, (ES2)object);
                break;
            }
            case 4: {
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                object5 = (hx3)object5;
                object4 = FS2.e;
                object5 = FS2.a(object5, (BS2)object4, (ES2)object);
                break;
            }
            case 3: {
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                object5 = (fb3_1)object5;
                object4 = FS2.d;
                object5 = FS2.a(object5, (BS2)object4, (ES2)object);
                break;
            }
            case 2: {
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                object5 = (S93)object5;
                object4 = FS2.i;
                object5 = FS2.a(object5, (BS2)object4, (ES2)object);
                break;
            }
            case 1: {
                Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                object5 = (ym2_0)object5;
                object4 = FS2.h;
                object5 = FS2.a(object5, (BS2)object4, (ES2)object);
            }
        }
        object = ((Sl$b)object2).b;
        object4 = ((Sl$b)object2).c;
        object2 = ((Sl$b)object2).d;
        Object[] objectArray = new Object[]{object3, object5, object, object4, object2};
        return xx_2.d(objectArray);
    }
}

