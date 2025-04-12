/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

public final class wB0
implements Comparator {
    public final /* synthetic */ Comparator a;
    public final /* synthetic */ Function1 b;

    public wB0(vB0 vB02, Function1 function1) {
        this.a = vB02;
        this.b = function1;
    }

    public final int compare(Object object, Object object2) {
        Object object3 = this.a;
        int n3 = object3.compare(object, object2);
        if (n3 == 0) {
            object = (JSONObject)object;
            object3 = this.b;
            object = (Comparable)object3.invoke(object);
            object2 = (JSONObject)object2;
            object2 = (Comparable)object3.invoke(object2);
            n3 = q00_0.a((Comparable)object, (Comparable)object2);
        }
        return n3;
    }
}

