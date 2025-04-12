/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ComparisonChain;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class vn0
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (List)object;
        object2 = (List)object2;
        ComparisonChain comparisonChain = ComparisonChain.start();
        Object object3 = new Object();
        object3 = (zn0$i)Collections.max(object, object3);
        Object object4 = new Object();
        object4 = (zn0$i)Collections.max(object2, object4);
        In0 in0 = new Object();
        comparisonChain = comparisonChain.compare(object3, object4, in0);
        int n3 = object.size();
        int n4 = object2.size();
        comparisonChain = comparisonChain.compare(n3, n4);
        object3 = new Object();
        object = (zn0$i)Collections.max(object, object3);
        object3 = new Object();
        object2 = (zn0$i)Collections.max(object2, object3);
        object3 = new Object();
        return comparisonChain.compare(object, object2, (Comparator)object3).result();
    }
}

