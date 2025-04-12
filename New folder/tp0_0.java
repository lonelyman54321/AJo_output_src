/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.util.HashMap;

/*
 * Renamed from tp0
 */
public final class tp0_0 {
    static {
        Object object = new HashMap();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Integer n3 = 4;
        Object object2 = Pair.create((Object)n3, (Object)n3);
        String string2 = "layout_constraintBottom_toBottomOf";
        ((HashMap)object).put(object2, string2);
        object2 = 3;
        Object object3 = Pair.create((Object)n3, (Object)object2);
        String string3 = "layout_constraintBottom_toTopOf";
        ((HashMap)object).put(object3, string3);
        n3 = Pair.create((Object)object2, (Object)n3);
        object3 = "layout_constraintTop_toBottomOf";
        ((HashMap)object).put(n3, object3);
        n3 = Pair.create((Object)object2, (Object)object2);
        object2 = "layout_constraintTop_toTopOf";
        ((HashMap)object).put(n3, object2);
        n3 = 6;
        Object object4 = Pair.create((Object)n3, (Object)n3);
        String string4 = "layout_constraintStart_toStartOf";
        ((HashMap)object).put(object4, string4);
        object4 = 7;
        Object object5 = Pair.create((Object)n3, (Object)object4);
        String string5 = "layout_constraintStart_toEndOf";
        ((HashMap)object).put(object5, string5);
        n3 = Pair.create((Object)object4, (Object)n3);
        object5 = "layout_constraintEnd_toStartOf";
        ((HashMap)object).put(n3, object5);
        n3 = Pair.create((Object)object4, (Object)object4);
        object4 = "layout_constraintEnd_toEndOf";
        ((HashMap)object).put(n3, object4);
        n3 = 1;
        Object object6 = Pair.create((Object)n3, (Object)n3);
        String string6 = "layout_constraintLeft_toLeftOf";
        ((HashMap)object).put(object6, string6);
        object6 = 2;
        Pair pair = Pair.create((Object)n3, (Object)object6);
        String string7 = "layout_constraintLeft_toRightOf";
        ((HashMap)object).put(pair, string7);
        pair = Pair.create((Object)object6, (Object)object6);
        String string8 = "layout_constraintRight_toRightOf";
        ((HashMap)object).put(pair, string8);
        n3 = Pair.create((Object)object6, (Object)n3);
        object6 = "layout_constraintRight_toLeftOf";
        ((HashMap)object).put(n3, object6);
        n3 = 5;
        n3 = Pair.create((Object)n3, (Object)n3);
        ((HashMap)object).put(n3, "layout_constraintBaseline_toBaselineOf");
        object = "layout_marginBottom";
        hashMap.put(string2, object);
        hashMap.put(string3, object);
        object = "layout_marginTop";
        hashMap.put((String)object3, object);
        hashMap.put((String)object2, object);
        object = "layout_marginStart";
        hashMap.put(string4, object);
        hashMap.put(string5, object);
        object = "layout_marginEnd";
        hashMap.put((String)object5, object);
        hashMap.put((String)object4, object);
        object = "layout_marginLeft";
        hashMap.put(string6, object);
        hashMap.put(string7, object);
        object = "layout_marginRight";
        hashMap.put(string8, object);
        hashMap.put((String)object6, object);
    }
}

