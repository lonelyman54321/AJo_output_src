/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

public final class vB0
implements Comparator {
    public final /* synthetic */ Function1 a;

    public vB0(Function1 function1) {
        this.a = function1;
    }

    public final int compare(Object object, Object object2) {
        object2 = (JSONObject)object2;
        Function1 function1 = this.a;
        object2 = (Comparable)function1.invoke(object2);
        object = (JSONObject)object;
        object = (Comparable)function1.invoke(object);
        return q00_0.a((Comparable)object2, (Comparable)object);
    }
}

