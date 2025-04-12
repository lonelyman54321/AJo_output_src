/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class jA3$a {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static wj3_0 a(vj3_2 object, uj3_1 object2) {
        void var0_2;
        void var3_50;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "templateType");
        Intrinsics.checkNotNullParameter(object3, "templateRenderer");
        Object object4 = new HashMap();
        Object object5 = object3.c;
        qe3_1 qe3_12 = new qe3_1((String)object5, "Title is missing or empty");
        ((HashMap)object4).put("PT_TITLE", qe3_12);
        object5 = object3.d;
        qe3_1 qe3_13 = new qe3_1((String)object5, "Message is missing or empty");
        ((HashMap)object4).put("PT_MSG", qe3_13);
        object5 = object3.r;
        qe3_1 qe3_14 = new qe3_1((String)object5, "Background colour is missing or empty");
        ((HashMap)object4).put("PT_BG", qe3_14);
        object5 = object3.l;
        gv1_1 gv1_12 = new gv1_1(1, "Deeplink is missing or empty", (ArrayList)object5);
        ((HashMap)object4).put("PT_DEEPLINK_LIST", gv1_12);
        object5 = object3.k;
        int n3 = 3;
        Object object6 = "Three required images not present";
        gv1_1 gv1_13 = new gv1_1(n3, (String)object6, (ArrayList)object5);
        ((HashMap)object4).put("PT_IMAGE_LIST", gv1_13);
        object5 = object3.s;
        qe3_1 qe3_15 = new qe3_1((String)object5, "Default deeplink is missing or empty");
        ((HashMap)object4).put("PT_RATING_DEFAULT_DL", qe3_15);
        object5 = object3.l;
        String string2 = "Three required deeplinks not present";
        gv1_1 gv1_14 = new gv1_1(n3, string2, (ArrayList)object5);
        ((HashMap)object4).put("PT_FIVE_DEEPLINK_LIST", gv1_14);
        object5 = object3.k;
        gv1_1 gv1_15 = new gv1_1(n3, (String)object6, (ArrayList)object5);
        ((HashMap)object4).put("PT_FIVE_IMAGE_LIST", gv1_15);
        object5 = object3.k;
        av1_1 av1_12 = new av1_1((ArrayList)object5, "Only three images are required");
        ((HashMap)object4).put("PT_PRODUCT_THREE_IMAGE_LIST", av1_12);
        object5 = object3.l;
        av1_1 av1_13 = new av1_1((ArrayList)object5, string2);
        ((HashMap)object4).put("PT_THREE_DEEPLINK_LIST", av1_13);
        object5 = object3.m;
        av1_1 av1_14 = new av1_1((ArrayList)object5, "Three required product titles not present");
        ((HashMap)object4).put("PT_BIG_TEXT_LIST", av1_14);
        object5 = object3.n;
        av1_1 av1_15 = new av1_1((ArrayList)object5, "Three required product descriptions not present");
        ((HashMap)object4).put("PT_SMALL_TEXT_LIST", av1_15);
        object5 = object3.p;
        qe3_1 qe3_16 = new qe3_1((String)object5, "Button label is missing or empty");
        ((HashMap)object4).put("PT_PRODUCT_DISPLAY_ACTION", qe3_16);
        object5 = object3.q;
        qe3_1 qe3_17 = new qe3_1((String)object5, "Button colour is missing or empty");
        ((HashMap)object4).put("PT_PRODUCT_DISPLAY_ACTION_CLR", qe3_17);
        object5 = object3.g;
        qe3_1 qe3_18 = new qe3_1((String)object5, "Display Image is missing or empty");
        ((HashMap)object4).put("PT_BIG_IMG", qe3_18);
        int n4 = object3.v;
        cj1 cj12 = new cj1(n4, "Timer threshold not defined");
        ((HashMap)object4).put("PT_TIMER_THRESHOLD", cj12);
        n4 = object3.A;
        cj1 cj13 = new cj1(n4, "Not rendering notification Timer End value lesser than threshold (10 seconds) from current time");
        ((HashMap)object4).put("PT_TIMER_END", cj13);
        object5 = object3.x;
        Object object7 = "Feedback Text or Actions is missing or empty";
        qe3_1 qe3_19 = new qe3_1((String)object5, (String)object7);
        object5 = "PT_INPUT_FEEDBACK";
        ((HashMap)object4).put(object5, qe3_19);
        object3 = object3.L;
        ol1_1 ol1_12 = new ol1_1((JSONArray)object3);
        ((HashMap)object4).put("PT_ACTIONS", ol1_12);
        ja3_0.a = object4;
        object3 = jA3$a$a.$EnumSwitchMapping$0;
        int n7 = ((Enum)object).ordinal();
        JSONArray jSONArray = object3[n7];
        object3 = "keys";
        object4 = "validator";
        Object var3_31 = null;
        switch (jSONArray) {
            default: {
                return var3_50;
            }
            case 9: {
                void var3_33;
                object7 = ja3_0.a;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object8 = object7;
                }
                object5 = new p70_0((Map)var3_33);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                Intrinsics.checkNotNullParameter(var3_33, (String)object3);
                Hh1 hh1 = new iA3((Map)var3_33);
                hh1.b = object5;
                break;
            }
            case 8: {
                void var3_37;
                object6 = ja3_0.a;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object9 = object6;
                }
                object7 = new p70_0((Map)var3_37);
                object5 = new bx_0((p70_0)object7);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object3 = ((iA3)object5).a;
                kn3_0 kn3_02 = new wj3_0((Map)object3);
                kn3_02.b = object5;
                break;
            }
            case 7: {
                void var3_39;
                object7 = ja3_0.a;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object10 = object7;
                }
                object5 = new p70_0((Map)var3_39);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                Intrinsics.checkNotNullParameter(var3_39, (String)object3);
                cj3_1 cj3_12 = new iA3((Map)var3_39);
                cj3_12.b = object5;
                break;
            }
            case 6: {
                void var3_41;
                object6 = ja3_0.a;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object11 = object6;
                }
                object7 = new p70_0((Map)var3_41);
                object5 = new bx_0((p70_0)object7);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object3 = ((iA3)object5).a;
                kA2 kA22 = new wj3_0((Map)object3);
                kA22.b = object5;
                break;
            }
            case 5: {
                void var3_43;
                object7 = ja3_0.a;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object12 = object7;
                }
                Intrinsics.checkNotNullParameter(var3_43, (String)object3);
                object5 = new iA3((Map)var3_43);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                Intrinsics.checkNotNullParameter(var3_43, (String)object3);
                no0_0 no0_02 = new iA3((Map)var3_43);
                no0_02.b = object5;
                break;
            }
            case 4: {
                void var3_45;
                object6 = ja3_0.a;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object13 = object6;
                }
                object7 = new p70_0((Map)var3_45);
                object5 = new bx_0((p70_0)object7);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object3 = ((iA3)object5).a;
                qd2_0 qd2_02 = new wj3_0((Map)object3);
                qd2_02.b = object5;
                break;
            }
            case 2: 
            case 3: {
                void var3_47;
                object6 = ja3_0.a;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object14 = object6;
                }
                object7 = new p70_0((Map)var3_47);
                object5 = new bx_0((p70_0)object7);
                Intrinsics.checkNotNullParameter(object5, (String)object4);
                object3 = ((iA3)object5).a;
                tl_2 tl_22 = new wj3_0((Map)object3);
                tl_22.b = object5;
                break;
            }
            case 1: {
                void var3_49;
                object5 = ja3_0.a;
                if (object5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    Object object15 = object5;
                }
                object4 = new p70_0((Map)var3_49);
                bx_0 bx_02 = new bx_0((p70_0)object4);
            }
        }
        void var3_35 = var0_2;
        return var3_50;
    }
}

