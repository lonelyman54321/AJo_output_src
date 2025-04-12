/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.transition.b;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class CW0 {
    public static final EW0 a;
    public static final GW0 b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object = new GW0();
        a = object;
        object = null;
        Object object2 = b.class;
        String string2 = "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>";
        try {
            Intrinsics.checkNotNull(object2, string2);
            object2 = ((Class)object2).getDeclaredConstructor(null);
            object2 = ((Constructor)object2).newInstance(null);
            object = object2 = (GW0)object2;
        }
        catch (Exception exception) {}
        b = object;
    }

    public static final void a(Fragment object, Fragment object2, boolean bl2, Jp jp) {
        Intrinsics.checkNotNullParameter(object, "inFragment");
        Intrinsics.checkNotNullParameter(object2, "outFragment");
        String string2 = "sharedElements";
        Intrinsics.checkNotNullParameter(jp, string2);
        object = bl2 ? ((Fragment)object2).getEnterTransitionCallback() : ((Fragment)object).getEnterTransitionCallback();
        if (object != null) {
            Object object3;
            int n3 = jp.c;
            object = new Object(n3);
            object2 = ((Jp$a)jp.entrySet()).iterator();
            while (bl2 = object2.hasNext()) {
                object3 = (View)((Map.Entry)object2.next()).getValue();
                ((ArrayList)object).add(object3);
            }
            n3 = jp.c;
            object = new Object(n3);
            object2 = ((Jp$a)jp.entrySet()).iterator();
            while (bl2 = object2.hasNext()) {
                object3 = (String)((Map.Entry)object2.next()).getKey();
                ((ArrayList)object).add(object3);
            }
        }
    }

    public static final String b(Jp arrayList, String object) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(object, "value");
        Object object2 = new LinkedHashMap();
        arrayList = ((Jp$a)((Jp)((Object)arrayList)).entrySet()).iterator();
        while (bl3 = arrayList.hasNext()) {
            Map.Entry entry = (Map.Entry)arrayList.next();
            Object object3 = entry.getValue();
            boolean bl4 = Intrinsics.areEqual(object3, object);
            if (!bl4) continue;
            object3 = entry.getKey();
            entry = entry.getValue();
            object2.put(object3, entry);
        }
        int n3 = object2.size();
        arrayList = new ArrayList<Object>(n3);
        object = ((LinkedHashMap)object2).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)((Map.Entry)object.next()).getKey();
            arrayList.add(object2);
        }
        return (String)CollectionsKt.firstOrNull(arrayList);
    }

    public static final void c(int n3, List object) {
        boolean bl2;
        String string2 = "views";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            string2 = (View)object.next();
            string2.setVisibility(n3);
        }
    }
}

