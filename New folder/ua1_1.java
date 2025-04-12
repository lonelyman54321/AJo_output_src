/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from Ua1
 */
public final class ua1_1
implements Function1 {
    public final Object invoke(Object object) {
        Object object2;
        Object object3;
        Object object4;
        int n3;
        Object object5;
        Object object6;
        Object object7;
        object = (mv_2)object;
        Intrinsics.checkNotNullParameter(object, "$this$createClientPlugin");
        Object object8 = ((ta1_0)((mv_2)object).b).b;
        Iterator iterator = "<this>";
        Intrinsics.checkNotNullParameter(object8, (String)((Object)iterator));
        int n4 = object8.size();
        if (n4 == 0) {
            object8 = mz0_2.a;
        } else {
            iterator = ((LinkedHashMap)object8).entrySet().iterator();
            boolean bl2 = iterator.hasNext();
            if (!bl2) {
                object8 = mz0_2.a;
            } else {
                object7 = (Map.Entry)iterator.next();
                boolean bl3 = iterator.hasNext();
                if (!bl3) {
                    iterator = object7.getKey();
                    object7 = object7.getValue();
                    object8 = new Pair(iterator, object7);
                    object8 = a.b(object8);
                } else {
                    int n7 = object8.size();
                    object6 = new ArrayList(n7);
                    object5 = object7.getKey();
                    object7 = object7.getValue();
                    object8 = new Pair(object5, object7);
                    ((ArrayList)object6).add(object8);
                    do {
                        object8 = (Map.Entry)iterator.next();
                        object5 = object8.getKey();
                        object8 = object8.getValue();
                        object7 = new Pair(object5, object8);
                        ((ArrayList)object6).add(object7);
                    } while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0);
                    object8 = object6;
                }
            }
        }
        object8 = (Iterable)object8;
        iterator = new Object();
        object8 = CollectionsKt.e0((Iterable)object8, (Comparator)((Object)iterator));
        iterator = (ta1_0)((mv_2)object).b;
        object7 = ((ta1_0)((Object)iterator)).c;
        object6 = ((ta1_0)((Object)iterator)).a;
        object5 = new ArrayList();
        object6 = object6.iterator();
        while ((n3 = object6.hasNext()) != 0) {
            object4 = object6.next();
            object3 = object4;
            object2 = ((ta1_0)((Object)iterator)).b;
            object3 = (Charset)object4;
            boolean bl4 = object2.containsKey(object3) ^ true;
            if (!bl4) continue;
            ((ArrayList)object5).add(object4);
        }
        iterator = new Object();
        iterator = CollectionsKt.e0(object5, (Comparator)((Object)iterator));
        object6 = new StringBuilder();
        object5 = iterator;
        object5 = ((Iterable)((Object)iterator)).iterator();
        while (true) {
            n3 = object5.hasNext();
            object3 = ",";
            if (n3 == 0) break;
            object4 = (Charset)object5.next();
            int n8 = ((StringBuilder)object6).length();
            if (n8 > 0) {
                ((StringBuilder)object6).append((String)object3);
            }
            object4 = os_2.b(object4);
            ((StringBuilder)object6).append((String)object4);
        }
        object5 = object8;
        object5 = ((Iterable)object8).iterator();
        while ((n3 = object5.hasNext()) != 0) {
            double d2;
            double d5;
            double d7;
            double d9;
            double d12;
            object4 = (Pair)object5.next();
            object2 = (Charset)((Pair)object4).a;
            object4 = (Number)((Pair)object4).b;
            float f5 = ((Number)object4).floatValue();
            int n10 = ((StringBuilder)object6).length();
            if (n10 > 0) {
                ((StringBuilder)object6).append((String)object3);
            }
            if ((d12 = (d9 = (d7 = 0.0) - (d5 = (double)f5)) == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1)) <= 0 && (d12 = (d2 = d5 - (d7 = 1.0)) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1)) <= 0) {
                n10 = 100;
                float f6 = (float)n10 * f5;
                n3 = ok1_1.b(f6);
                d5 = n3;
                d7 = 100.0;
                d5 /= d7;
                object4 = new StringBuilder();
                object2 = os_2.b((Charset)object2);
                ((StringBuilder)object4).append((String)object2);
                object2 = ";q=";
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(d5);
                object4 = ((StringBuilder)object4).toString();
                ((StringBuilder)object6).append((String)object4);
                continue;
            }
            object = new IllegalStateException("Check failed.");
            throw object;
        }
        int n14 = ((StringBuilder)object6).length();
        if (n14 == 0) {
            object5 = os_2.b((Charset)object7);
            ((StringBuilder)object6).append((String)object5);
        }
        object6 = ((StringBuilder)object6).toString();
        iterator = (Charset)CollectionsKt.firstOrNull((List)((Object)iterator));
        n14 = 0;
        object5 = null;
        if (iterator == null) {
            if ((object8 = (Pair)CollectionsKt.firstOrNull((List)object8)) != null) {
                iterator = object8 = (Charset)((Pair)object8).a;
            } else {
                n4 = 0;
                iterator = null;
            }
            if (iterator == null) {
                iterator = Charsets.UTF_8;
            }
        }
        object8 = y00_0.a;
        object4 = new Va1$b((String)object6, (Charset)((Object)iterator), null);
        ((mv_2)object).a((lv_2)object8, (qg3_2)object4);
        object8 = new Va1$c((Charset)object7, null);
        Intrinsics.checkNotNullParameter(object8, "block");
        iterator = vq3_0.a;
        ((mv_2)object).a((lv_2)((Object)iterator), (qg3_2)object8);
        return Unit.a;
    }
}

