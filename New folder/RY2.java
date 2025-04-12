/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class RY2 {
    public static final /* synthetic */ gn1_2[] a;

    static {
        Object object = RY2.class;
        int n3 = 1;
        en1_2 en1_22 = OY2.a(object, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", n3);
        en1_2 en1_23 = OY2.a(object, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", n3);
        en1_2 en1_24 = OY2.a(object, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", n3);
        en1_2 en1_25 = OY2.a(object, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", n3);
        en1_2 en1_26 = OY2.a(object, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", n3);
        en1_2 en1_27 = OY2.a(object, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", n3);
        en1_2 en1_28 = OY2.a(object, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", n3);
        en1_2 en1_29 = OY2.a(object, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", n3);
        en1_2 en1_210 = OY2.a(object, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", n3);
        en1_2 en1_211 = OY2.a(object, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", n3);
        en1_2 en1_212 = OY2.a(object, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", n3);
        en1_2 en1_213 = OY2.a(object, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", n3);
        en1_2 en1_214 = OY2.a(object, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", n3);
        en1_2 en1_215 = OY2.a(object, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", n3);
        en1_2 en1_216 = OY2.a(object, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", n3);
        en1_2 en1_217 = OY2.a(object, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", n3);
        en1_2 en1_218 = OY2.a(object, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", n3);
        en1_2 en1_219 = OY2.a(object, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", n3);
        en1_2 en1_220 = OY2.a(object, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", n3);
        en1_2 en1_221 = OY2.a(object, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", n3);
        en1_2 en1_222 = OY2.a(object, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", n3);
        en1_2 en1_223 = OY2.a(object, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", n3);
        en1_2 en1_224 = OY2.a(object, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", n3);
        en1_2 en1_225 = OY2.a(object, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", n3);
        en1_2 en1_226 = OY2.a(object, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", n3);
        object = OY2.a(object, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", n3);
        gn1_2[] gn1_2Array = new gn1_2[26];
        gn1_2Array[0] = en1_22;
        gn1_2Array[n3] = en1_23;
        gn1_2Array[2] = en1_24;
        gn1_2Array[3] = en1_25;
        gn1_2Array[4] = en1_26;
        gn1_2Array[5] = en1_27;
        gn1_2Array[6] = en1_28;
        gn1_2Array[7] = en1_29;
        gn1_2Array[8] = en1_210;
        gn1_2Array[9] = en1_211;
        gn1_2Array[10] = en1_212;
        gn1_2Array[11] = en1_213;
        gn1_2Array[12] = en1_214;
        gn1_2Array[13] = en1_215;
        gn1_2Array[14] = en1_216;
        gn1_2Array[15] = en1_217;
        gn1_2Array[16] = en1_218;
        gn1_2Array[17] = en1_219;
        gn1_2Array[18] = en1_220;
        gn1_2Array[19] = en1_221;
        gn1_2Array[20] = en1_222;
        gn1_2Array[21] = en1_223;
        gn1_2Array[22] = en1_224;
        gn1_2Array[23] = en1_225;
        gn1_2Array[24] = en1_226;
        gn1_2Array[25] = object;
        a = gn1_2Array;
        object = MY2.a;
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object.getClass();
        object = yY2.a;
    }

    public static final TY2 a(String string2) {
        TY2 tY2 = new TY2(string2);
        tY2.c = true;
        return tY2;
    }

    public static final TY2 b(String string2, Function2 function2) {
        TY2 tY2 = new TY2(string2, true, function2);
        return tY2;
    }

    public static void c(UY2 uY2, Function1 fx0_22) {
        TY2 tY2 = yY2.a;
        fx0_22 = fx0_22;
        H1 h1 = new H1(null, fx0_22);
        uY2.a(tY2, h1);
    }

    public static final void d(UY2 uY2) {
        Object object = MY2.a;
        object = MY2.n;
        Unit unit = Unit.a;
        uY2.a((TY2)object, unit);
    }

    public static final void e(UY2 uY2, String object) {
        Object object2 = MY2.a;
        object2 = MY2.b;
        object = kotlin.collections.a.b(object);
        uY2.a((TY2)object2, object);
    }

    public static final void f(UY2 uY2, int n3) {
        TY2 tY2 = MY2.t;
        Object object = a[12];
        object = new CP2(n3);
        tY2.getClass();
        uY2.a(tY2, object);
    }
}

